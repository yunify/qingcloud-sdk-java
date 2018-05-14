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

package com.qingcloud.sdk.request;

import com.qingcloud.sdk.config.EnvContext;
import com.qingcloud.sdk.constants.QCConstant;
import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.model.RequestInputModel;
import com.qingcloud.sdk.utils.QCJSONUtil;
import com.qingcloud.sdk.utils.QCParamInvokeUtil;
import com.qingcloud.sdk.utils.QCStringUtil;
import okhttp3.Request;

import java.util.Map;

/** Created by karooli on 16/9/23. */
public class QCRequest implements ResourceRequest {

    private Request buildRequest(Map context, RequestInputModel inputModel) throws QCException {
        String method = (String) context.get(QCConstant.PARAM_KEY_REQUEST_METHOD);
        EnvContext envContext = (EnvContext) context.get(QCConstant.ENV_CONTEXT_KEY);
        String requestUrl = envContext.getRequestUrl();

        String uri = QCJSONUtil.parseRequestParams(inputModel, envContext, method);

        if (QCConstant.REQUEST_METHOD_POST.equalsIgnoreCase(method)) {
            return QCOkHttpRequestClient.getInstance().buildPostRequest(requestUrl, uri);
        } else {
            return QCOkHttpRequestClient.getInstance().buildGetRequest(requestUrl, uri);
        }
    }

    public void sendApiRequestAsync(Map context, RequestInputModel inputModel, ResponseCallBack callback) throws QCException {
        String validate = inputModel.validateParam();
        EnvContext envContext = (EnvContext) context.get(QCConstant.ENV_CONTEXT_KEY);
        String evnValidate = envContext.validateParam();
        if (!QCStringUtil.isEmpty(validate) || !QCStringUtil.isEmpty(evnValidate)) {
            if (QCStringUtil.isEmpty(validate)) {
                validate = evnValidate;
            }
            OutputModel out = QCParamInvokeUtil.getOutputModel(callback);
            QCOkHttpRequestClient.fillErrorModel(QCConstant.REQUEST_ERROR_CODE, validate, out);
            callback.onAPIResponse(out);
        } else {
            Request request = buildRequest(context, inputModel);
            QCOkHttpRequestClient.getInstance().requestActionAsync(request, envContext.isSafeOkHttp(), callback);
        }
    }

    public OutputModel sendApiRequest(Map context, RequestInputModel inputModel, Class<? extends OutputModel> outputClass) throws QCException {
        String validate = inputModel.validateParam();
        EnvContext envContext = (EnvContext) context.get(QCConstant.ENV_CONTEXT_KEY);
        String envValidate = envContext.validateParam();
        if (QCStringUtil.isEmpty(validate) && QCStringUtil.isEmpty(envValidate)) {
            Request request = buildRequest(context, inputModel);
            return QCOkHttpRequestClient.getInstance().requestAction(request, envContext.isSafeOkHttp(), outputClass);
        } else {
            return invalidParam(validate, envValidate, outputClass);
        }
    }

    private OutputModel invalidParam(String validate, String envValidate, Class outputClass) {
        if (QCStringUtil.isEmpty(validate)) {
            validate = envValidate;
        }

        OutputModel model = null;
        try {
            model = (OutputModel) outputClass.newInstance();
            QCOkHttpRequestClient.fillErrorModel(QCConstant.REQUEST_ERROR_CODE, validate, model);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }
}
