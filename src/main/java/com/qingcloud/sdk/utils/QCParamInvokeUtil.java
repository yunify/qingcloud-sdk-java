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

import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.request.ResponseCallBack;

import java.lang.reflect.*;

public class QCParamInvokeUtil {

    public static Object getOutputModel(Class cls) throws QCException {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new QCException(e.getMessage());
        }
    }

    public static OutputModel getOutputModel(ResponseCallBack o) throws QCException {
        Type[] typeClass = o.getClass().getGenericInterfaces();

        try {
            if (typeClass[0] instanceof ParameterizedType) {
                Class actualType =
                        (Class) ((ParameterizedType) typeClass[0]).getActualTypeArguments()[0];

                return (OutputModel) actualType.newInstance();
            } else {
                return OutputModel.class.newInstance();
            }
        } catch (InstantiationException e) {
            throw new QCException("InstantiationException", e);
        } catch (IllegalAccessException e) {
            throw new QCException("IllegalAccessException", e);
        }
    }
}
