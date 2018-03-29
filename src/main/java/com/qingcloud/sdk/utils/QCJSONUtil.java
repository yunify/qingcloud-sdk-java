// +-------------------------------------------------------------------------
// | Copyright (C) 2016 Yunify, Inc.
// +-------------------------------------------------------------------------
// | Licensed under the Apache License, Version 2.0 (the "License");
// | you may not use this work except in compliance with the License.
// | You may obtain a copy of the License in the LICENSE file, or at:
// |
// | http://www.apache.org/licenses/LICENSE-2.0
// |
// | Unless required by applicable law or agreed to in writing, software
// | distributed under the License is distributed on an "AS IS" BASIS,
// | WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// | See the License for the specific language governing permissions and
// | limitations under the License.
// +-------------------------------------------------------------------------

package com.qingcloud.sdk.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qingcloud.sdk.annotation.ParamAnnotation;
import com.qingcloud.sdk.service.Types;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.*;

import static com.qingcloud.sdk.constants.QCConstant.INVALID_MONITOR_DATA;

public class QCJSONUtil {

    private static final List<Class> PRIMITIVE_TYPES = new ArrayList<>(Arrays.asList(String.class, Integer.class, Double.class, Long.class, Float.class, null, BigDecimal.class));

    public static Map<String, String> getRequestParams(Object model, String paramType) {
        return getRequestParamsRecursive(model, paramType, null);
    }

    private static Map<String, String> getRequestParamsRecursive(Object model, String paramType, String prefix) {
        if (model == null) {
            return null;
        }

        Map<String, String> params = new HashMap<>();
        Class cls = model.getClass();
        while (cls != Object.class) {
            Field[] fields = cls.getDeclaredFields();
            Map<String, Field> fieldMap = new HashMap<>();
            for (Field field : fields) {
                if (field.getType() == boolean.class) {
                    fieldMap.put(String.format("is%s", capitalize(field.getName())), field);
                } else {
                    fieldMap.put(String.format("get%s", capitalize(field.getName())), field);
                }
            }

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {
                ParamAnnotation annotation = method.getAnnotation(ParamAnnotation.class);
                Field field = fieldMap.get(method.getName());
                if (annotation == null || !annotation.paramType().equals(paramType) || method.getReturnType() == void.class) {
                    continue;
                }

                String paramName = annotation.paramName();
                if (QCStringUtil.isEmpty(paramName)) {
                    paramName = field.getName();
                }

                Object paramValue = null;
                try {
                    paramValue = method.invoke(model);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                if (paramValue == null) {
                    continue;
                }

                if (PRIMITIVE_TYPES.contains(paramValue.getClass())) {
                    putPrimitiveParams(params, paramName, paramValue, prefix);
                } else if (paramValue instanceof List) {
                    int seq = 0;

                    for (Object paramItem : (List) paramValue) {
                        seq += 1;
                        if (!PRIMITIVE_TYPES.contains(paramItem.getClass())) {
                            ParameterizedType listType = (ParameterizedType) field.getGenericType();
                            Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];
                            if (listClass != Object.class) {
                                Map<String, String> nestedParams = getRequestParamsRecursive(paramItem, paramType, String.format("%s.%d", paramName, seq));
                                params.putAll(nestedParams);
                                continue;
                            }
                        }
                        putPrimitiveParams(params, String.format("%s.%d", paramName, seq), paramItem, prefix);
                    }
                } else if (paramValue instanceof Map) {
                    for (Object key : ((Map) paramValue).keySet()) {
                        Object val = ((Map) paramValue).get(key);
                        if (PRIMITIVE_TYPES.contains(val.getClass())) {
                            putPrimitiveParams(params, String.valueOf(key), val, prefix);
                        } else {
                            Map<String, String> nestedParams = getRequestParamsRecursive(val, paramType, String.format("%s.%s", paramName, key));
                            params.putAll(nestedParams);
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }

        return params;
    }

    public static void parseResponse(Map response, Object model) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        if (model == null || response == null) {
            return;
        }

        Class cls = model.getClass();
        while (cls != Object.class) {
            Method[] methods = cls.getDeclaredMethods();
            Field[] fields = cls.getDeclaredFields();
            Map<String, Field> fieldMap = new HashMap<>();
            for (Field field : fields) {
                fieldMap.put(String.format("set%s", capitalize(field.getName())), field);
            }
            for (Method method : methods) {
                ParamAnnotation annotation = method.getAnnotation(ParamAnnotation.class);
                if (annotation == null || method.getReturnType() != void.class) {
                    continue;
                }
                String jsonKey = annotation.paramName();
                Field field = fieldMap.get(method.getName());

                if (response.keySet().contains(jsonKey)) {
                    Object jsonValue = response.get(jsonKey);
                    if (jsonValue == null) {
                        continue;
                    }
                    if (PRIMITIVE_TYPES.contains(jsonValue.getClass())) {
                        jsonValue = isNull(jsonValue, model) ? null : jsonValue;
                        if (jsonValue == null || jsonValue.getClass() == field.getType()) {
                            method.invoke(model, jsonValue);
                        } else if (field.getType() == String.class) {
                            method.invoke(model, String.valueOf(jsonValue));
                        }
                    } else if (jsonValue instanceof JSONArray) {
                        List list = new ArrayList();
                        for (Object jsonItem : (JSONArray) jsonValue) {
                            if (PRIMITIVE_TYPES.contains(jsonItem.getClass())) {
                                jsonItem = isNull(jsonItem, model) ? null : jsonItem;
                                list.add(jsonItem);
                            } else {
                                ParameterizedType listType = (ParameterizedType) field.getGenericType();
                                Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];
                                if (listClass != Object.class) {
                                    Object nestedModel = listClass.getConstructor().newInstance();
                                    parseResponse((Map) jsonItem, nestedModel);
                                    list.add(nestedModel);
                                } else {
                                    if (jsonItem instanceof JSONArray) {
                                        // monitor data parse
                                        // refer to (monitor-compress)[https://docs.qingcloud.com/product/api/action/monitor/compress.html#monitor-compress]
                                        List nestedModel = new ArrayList();
                                        for (Object deepItem : (JSONArray) jsonItem)  {
                                            if (deepItem instanceof JSONArray) {
                                                List deepNested = new ArrayList();
                                                for (Object deeper : (JSONArray) deepItem) {
                                                    deeper = isNull(deeper, model) ? null : deeper;
                                                    deepNested.add(deeper);
                                                }
                                                nestedModel.add(deepNested);
                                            } else {
                                                deepItem = isNull(deepItem, model) ? null : deepItem;
                                                nestedModel.add(deepItem);
                                            }
                                        }
                                        list.add(nestedModel);
                                    } else {
                                        list.add(jsonItem);
                                    }
                                }
                            }
                        }
                        method.invoke(model, list);
                    } else if (jsonValue instanceof JSONObject) {
                        Class<?> fieldCls = field.getType();
                        if (fieldCls == Map.class) {
                            method.invoke(model, jsonValue);
                            continue;
                        }
                        Object nestedModel = fieldCls.getConstructor().newInstance();
                        parseResponse((Map) jsonValue, nestedModel);
                        method.invoke(model, nestedModel);
                    }
                }
            }

            cls = cls.getSuperclass();
        }
    }

    private static void putPrimitiveParams(Map<String, String> params, String key, Object val, String prefix) {
        if (!QCStringUtil.isEmpty(prefix)) {
            key = String.format("%s.%s", prefix, key);
        }

        params.put(key, String.valueOf(val));
    }

    private static boolean isNull(Object jsonValue, Object model) {
        if (jsonValue instanceof String) {
            if (QCStringUtil.isEmpty((String) jsonValue)) {
                return true;
            }
            if (model instanceof Types.MeterModel && INVALID_MONITOR_DATA.equals(jsonValue)) {
                return true;
            }
        }
        return false;
    }

    private static String capitalize(String word) {
        return String.format("%s%s", word.substring(0, 1).toUpperCase(), word.substring(1));
    }
}
