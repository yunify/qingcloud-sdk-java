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

package com.qingcloud.sdk.model;

import com.qingcloud.sdk.annotation.ParamAnnotation;

/** Created by karooli on 16/9/23. */
public abstract class OutputModel {

    private String message;

    private int statusCode;

    @ParamAnnotation(paramType = "query", paramName = "message")
    public String getMessage() {
        return message;
    }

    @ParamAnnotation(paramType = "query", paramName = "message")
    public void setMessage(String message) {
        this.message = message;
    }

    @ParamAnnotation(paramType = "query", paramName = "ret_code")
    public abstract Integer getRetCode();

    public abstract void setRetCode(Integer retCode);
}
