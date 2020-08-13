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

package com.qingcloud.sdk.config;

import com.qingcloud.sdk.constants.QCConstant;
import com.qingcloud.sdk.request.ParamValidate;
import com.qingcloud.sdk.service.TokenService;
import com.qingcloud.sdk.utils.QCStringUtil;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/** Created by karooli on 16/10/28. */
public class EnvContext implements ParamValidate {


    private String accessKey;

    private String accessSecret;

    private String host;

    private String port;

    private String protocol;

    private String uri;

    private String apiLang;

    private String zone;

    private String token;

    private String tokenExpiration;

    private String credentialProxyHost;

    private String credentialProxyProtocol;

    private String credentialProxyPort;

    private String credentialProxyUri;

    private boolean safeOkHttp = true;

    public String getCredentialProxyProtocol() {
        return credentialProxyProtocol;
    }

    public void setCredentialProxyProtocol(String credentialProxyProtocol) {
        this.credentialProxyProtocol = credentialProxyProtocol;
    }

    public String getCredentialProxyPort() {
        return credentialProxyPort;
    }

    public void setCredentialProxyPort(String credentialProxyPort) {
        this.credentialProxyPort = credentialProxyPort;
    }

    public String getCredentialProxyUri() {
        return credentialProxyUri;
    }

    public void setCredentialProxyUri(String credentialProxyUri) {
        this.credentialProxyUri = credentialProxyUri;
    }

    public String getCredentialProxyHost() {
        return credentialProxyHost;
    }

    public void setCredentialProxyHost(String credentialProxyHost) {
        this.credentialProxyHost = credentialProxyHost;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenExpiration() {
        return tokenExpiration;
    }

    public void setTokenExpiration(String tokenExpiration) {
        this.tokenExpiration = tokenExpiration;
    }

    public boolean isSafeOkHttp() {
        return safeOkHttp;
    }

    public void setSafeOkHttp(boolean safeOkHttp) {
        this.safeOkHttp = safeOkHttp;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public String getHost() {
        return host;
    }

    /** @param host example: api.qingcloud.com */
    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    /** @param port example: 8080 */
    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    /** @param protocol example: https or http */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUri() {
        return uri;
    }

    public String getRequestUrl() {
        String url = String.format("%s://%s", this.getProtocol(), this.getHost());
        if (!QCStringUtil.isEmpty(this.getPort())) {
            url = String.format("%s:%s", url, this.getPort());
        }
        if (!QCStringUtil.isEmpty(this.getUri())) {
            url = String.format("%s/%s/", url, this.getUri());
        }

        return url;
    }

    /** @param uri example : iaas */
    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getApiLang() {
        return apiLang;
    }

    public void setApiLang(String apiLang) {
        this.apiLang = apiLang;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    private EnvContext() {}

    public EnvContext(String accessKey, String accessSecret) {
        this.setAccessKey(accessKey);
        this.setAccessSecret(accessSecret);
        this.setHost(QCConstant.DEFAULT_HOST);
        this.setUri(QCConstant.DEFAULT_URI);
        this.setProtocol(QCConstant.DEFAULT_PROTOCOL);
        this.setPort(QCConstant.DEFAUL_PORT);
        this.setZone(QCConstant.DEFAULT_ZONE);
        this.setApiLang(QCConstant.DEFAULT_API_LANG);
    }

    public EnvContext(String accessKey, String accessSecret, String apiLang) {
        this(accessKey, accessSecret);
        this.setApiLang(apiLang);
    }

    /**
     *
     * @param protocol: "https"
     * @param host: "api.qingcloud.com"
     * @param port: "443"
     * @param accessKey: "QYACCESSKEYIDEXAMPLE"
     * @param accessSecret: "SECRETACCESSKEY"
     * @param apiLang: "zh-cn"
     */
    public EnvContext(String protocol, String host, String port, String accessKey, String accessSecret, String apiLang) {
        this.setAccessKey(accessKey);
        this.setAccessSecret(accessSecret);
        this.setProtocol(protocol);
        this.setHost(host);
        this.setPort(port);
        this.setApiLang(apiLang);
        this.setUri(QCConstant.DEFAULT_URI);
    }

    public static EnvContext loadFromFile(String filePathName) {
        EnvContext env = new EnvContext();
        File f = new File(filePathName);
        if (f.exists()) {
            BufferedReader br = null;
            Map<String, String> confParams = new HashMap<>();
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String strConf;

                while ((strConf = br.readLine()) != null) {
                    String[] str = strConf.split(":");
                    if (str.length > 1) {
                        confParams.put(str[0].trim(), str[1].trim());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            env.setAccessKey(confParams.get("access_key"));
            env.setAccessSecret(confParams.get("access_secret"));
            env.setProtocol(confParams.get("protocol"));
            env.setHost(confParams.get("host"));
            env.setUri(confParams.get("uri"));
            env.setPort(confParams.get("port"));
            env.setZone(confParams.get("zone"));
            env.setCredentialProxyHost(confParams.get("credential_proxy_host"));
            env.setCredentialProxyPort(confParams.get("credential_proxy_port"));
            env.setCredentialProxyProtocol(confParams.get("credential_proxy_protocol"));
            env.setCredentialProxyUri(confParams.get("credential_proxy_uri"));
        }
        return env;
    }

    public String validateParam() {
        if (QCStringUtil.isEmpty(getAccessKey()) && QCStringUtil.isEmpty(getAccessSecret())
                || this.uri.equals("iam") && isTokenExpired()) {
            TokenService service = new TokenService(this);
            TokenService.GetTokenOutput output = service.getToken();
            if (output != null) {
                this.accessKey = output.getAccessKey();
                this.accessSecret = output.getAccessSecret();
                this.token = output.getToken();
                this.tokenExpiration = output.getExpiration();
                this.uri = "iam";
            }
        }

        if (QCStringUtil.isEmpty(getAccessKey())) {
            return QCStringUtil.getParameterRequired("AccessKey", "EnvContext");
        }
        if (QCStringUtil.isEmpty(getAccessSecret())) {
            return QCStringUtil.getParameterRequired("AccessSecret", "EnvContext");
        }
        if (QCStringUtil.isEmpty(getRequestUrl())) {
            return QCStringUtil.getParameterRequired("host", "EnvContext");
        }
        return null;
    }

    private boolean isTokenExpired() {
        if (this.token == null || this.token.isEmpty()) {
            return true;
        }

        long expiration = Long.parseLong(this.tokenExpiration) * 1000;
        long now = System.currentTimeMillis();

        return now >= expiration;
    }
}
