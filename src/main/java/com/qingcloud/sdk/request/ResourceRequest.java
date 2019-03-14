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

import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.model.RequestInputModel;

import java.util.Map;

/** Created by karooli on 16/9/23. */
public interface ResourceRequest {

    /**
     * @param context EnvContext
     * @param paramBean request input
     * @param callback response calls back
     * @throws QCException IOException or network error
     */
    void sendApiRequestAsync(Map context, RequestInputModel paramBean, ResponseCallBack callback) throws QCException;

    /**
     * @param context EnvContext
     * @param paramBean request input
     * @param outputClass class for output model with the response written in
     * @return output model
     * @throws QCException IOException or network error
     */
    OutputModel sendApiRequest(Map context, RequestInputModel paramBean, Class<? extends OutputModel> outputClass) throws QCException;
}
