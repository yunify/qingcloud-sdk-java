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

import com.qingcloud.sdk.constants.QCConstant;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/** Created by on 11/4/15. */
public class QCStringUtil {

    public static String percentEncode(String value, String encoding) throws UnsupportedEncodingException {
        if (value == null) {
            return null;
        }

        return URLEncoder.encode(value, encoding)
                        .replace("+", "%20")
                        .replace("*", "%2A")
                        .replace("%7E", "~");
    }

    public static boolean isEmpty(String str) {
        return (str == null || "".equals(str.trim()) || "null".equalsIgnoreCase(str));
    }

    public static String getParameterRequired(String paraName, String value) {
        return String.format("%s is required in %s ", paraName, value);
    }

    public static String getUserAgent() {
        String osName = System.getProperty("os.name"); //操作系统名称
        String osVersion = System.getProperty("java.version"); //java.version系统版本

        return String.format("%s-%s(%s-%s)", QCConstant.SDK_NAME, QCConstant.SDK_VERSION, osName, osVersion);
    }
}
