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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.qingcloud.sdk.constants.QCConstant;
import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.utils.QCJSONUtil;
import com.qingcloud.sdk.utils.QCLoggerUtil;
import com.qingcloud.sdk.utils.QCParamInvokeUtil;
import com.qingcloud.sdk.utils.QCStringUtil;
import okhttp3.*;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Created by karoo . */
public class QCOkHttpRequestClient {

    private static final Logger logger = QCLoggerUtil.setLoggerHandler(QCOkHttpRequestClient.class.getName());

    private OkHttpClient client = null;
    private OkHttpClient unsafeClient = null;

    private static QCOkHttpRequestClient ins;

    protected QCOkHttpRequestClient() {
        intiOkHttpClient();
    }

    public void intiOkHttpClient() {
        client = new OkHttpClient.Builder()
                        .connectTimeout(QCConstant.HTTP_CLIENT_CONNECTION_TIMEOUT, TimeUnit.SECONDS)
                        .readTimeout(QCConstant.HTTP_CLIENT_READ_TIMEOUT, TimeUnit.SECONDS)
                        .writeTimeout(QCConstant.HTTP_CLIENT_WRITE_TIMEOUT, TimeUnit.SECONDS)
                        .build();
        unsafeClient = getUnsafeOkHttpClient();
    }

    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                new X509TrustManager() {
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {}

                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {}

                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[] {};
                    }
                }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                            .connectTimeout(QCConstant.HTTP_CLIENT_CONNECTION_TIMEOUT, TimeUnit.SECONDS)
                            .readTimeout(QCConstant.HTTP_CLIENT_READ_TIMEOUT, TimeUnit.SECONDS)
                            .writeTimeout(QCConstant.HTTP_CLIENT_WRITE_TIMEOUT, TimeUnit.SECONDS);
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier((hostname, session) -> true);

            return builder.build();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static QCOkHttpRequestClient getInstance() {
        if (ins == null) {
            synchronized (QCOkHttpRequestClient.class) {
                if (ins == null) ins = new QCOkHttpRequestClient();
            }
        }
        return ins;
    }

    private Call getRequestCall(boolean bSafe, okhttp3.Request request) {
        if (bSafe) {
            return client.newCall(request);
        } else {
            return this.unsafeClient.newCall(request);
        }
    }

    /**
     * @param requestUrl: protocol://host:port/uri/
     * @param uri: uri behind protocol://host:port/uri/?
     */
    public okhttp3.Request buildGetRequest(String requestUrl, String uri) {
        String url;
        if (requestUrl.indexOf("?") > 0) {
            url = String.format("%s&%s", requestUrl, uri);
        } else {
            url = String.format("%s?%s", requestUrl, uri);
        }
        logger.log(Level.INFO, url);
        System.out.println(String.format("url: %s", url));

        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        builder.addHeader(QCConstant.PARAM_KEY_USER_AGENT, QCStringUtil.getUserAgent());

        return builder.url(url).build();
    }

    /**
     * @param requestUrl: protocol://host:port/uri/
     * @param body: content to put in post body of the same form as uri in buildGetRequest
     */
    public okhttp3.Request buildPostRequest(String requestUrl, String body) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=utf-8"), body);
        logger.log(Level.INFO, body);
        return new okhttp3.Request.Builder().url(requestUrl).post(requestBody).build();
    }

    public OutputModel requestAction(okhttp3.Request request, boolean bSafe, Class outputClass) throws QCException {
        Call okhttpCall = getRequestCall(bSafe, request);
        OutputModel model = (OutputModel) QCParamInvokeUtil.getOutputModel(outputClass);
        try {
            Response response = okhttpCall.execute();
            parseResponseToModel(response, model);
        } catch (SocketTimeoutException exception) {
            model.setRetCode(5101);
            model.setMessage(String.format("[%s] Connection Timeout! Retry later or contact with admin", request.url().toString()));
            exception.printStackTrace();
        } catch (IOException e) {
            model.setRetCode(5000);
            model.setMessage("Fail to execute request");
            e.printStackTrace();
        }
        return model;
    }

    public void requestActionAsync(Request request, boolean bSafe, final ResponseCallBack callBack) {
        Call okhttpCall = getRequestCall(bSafe, request);
        okhttpCall.enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {
                onOkhttpFailure(e.getMessage(), callBack);
            }

            public void onResponse(Call call, okhttp3.Response response) {
                try {
                    if (callBack != null) {
                        OutputModel m = QCParamInvokeUtil.getOutputModel(callBack);
                        parseResponseToModel(response, m);
                        callBack.onAPIResponse(m);
                    }
                } catch (Exception e) {
                    logger.log(Level.SEVERE, e.getMessage());
                    onOkhttpFailure(e.getMessage(), callBack);
                } finally {
                    if (response != null) {
                        okhttp3.internal.Util.closeQuietly(response.body().source());
                    }
                }
            }
        });
    }

    private void onOkhttpFailure(String message, ResponseCallBack callBack) {
        try {
            if (callBack != null) {
                OutputModel m = QCParamInvokeUtil.getOutputModel(callBack);
                fillErrorModel(QCConstant.REQUEST_ERROR_CODE, message, m);
                callBack.onAPIResponse(m);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    private void parseResponseToModel(okhttp3.Response response, OutputModel target) {
        try {
            String responseString = response.body().string();
            Map o = (Map) JSON.parse(responseString);
            QCJSONUtil.parseResponse(o, target);
        } catch (JSONException | IOException | NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
            target.setRetCode(5000);
            target.setMessage("Fail to parse response");
        }
    }

    public static void fillErrorModel(int code, Object content, OutputModel model) {
        Map error = new HashMap<>();
        error.put(QCConstant.QC_CODE_FIELD_NAME, code);
        error.put(QCConstant.QC_MESSAGE_FIELD_NAME, content);
        try {
            QCJSONUtil.parseResponse(error, model);
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
