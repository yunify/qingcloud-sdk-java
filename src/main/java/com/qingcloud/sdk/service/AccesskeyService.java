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

package com.qingcloud.sdk.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qingcloud.sdk.config.EnvContext;
import com.qingcloud.sdk.constants.QCConstant;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.request.ResponseCallBack;
import com.qingcloud.sdk.request.ResourceRequestFactory;
import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.IaasParamBody;
import com.qingcloud.sdk.service.Types.*;
import com.qingcloud.sdk.utils.QCStringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccesskeyService {

    private EnvContext envContext;

    private String zone;

    public AccesskeyService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public AccesskeyService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteAccessKeysOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteAccessKeysOutput deleteAccessKeys(DeleteAccessKeysInput input) throws QCException {
        if (input == null) {
            input = new DeleteAccessKeysInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteAccessKeys");
        context.put("APIName", "DeleteAccessKeys");
        context.put("ServiceName", "DeleteAccessKeys");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteAccessKeys");

        input.setAction("DeleteAccessKeys");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteAccessKeysOutput.class);
        if(backModel != null){
            return (DeleteAccessKeysOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteAccessKeys(DeleteAccessKeysInput input, ResponseCallBack<DeleteAccessKeysOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteAccessKeysInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteAccessKeys");
        context.put("APIName", "DeleteAccessKeys");
        context.put("ServiceName", "DeleteAccessKeys");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteAccessKeys");

        input.setAction("DeleteAccessKeys");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        if(callback == null) {
            throw new QCException("callback can't be null");
        }

        ResourceRequestFactory.getResourceRequest().sendApiRequestAsync(context,input,callback);
    }

    public static class DeleteAccessKeysInput extends IaasParamBody {
        // Required
        private List<String> accessKeys;

        @JsonProperty(value = "access_keys")
        public void setAccessKeys(List<String> accessKeys) {
            this.accessKeys = accessKeys;
        }

        @JsonProperty(value = "access_keys")
        public List<String> getAccessKeys() {
            return this.accessKeys;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteAccessKeysOutput extends OutputModel {
        private List<String> accessKeys;

        @JsonProperty(value = "access_keys")
        public void setAccessKeys(List<String> accessKeys) {
            this.accessKeys = accessKeys;
        }

        @JsonProperty(value = "access_keys")
        public List<String> getAccessKeys() {
            return this.accessKeys;
        }

        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @JsonProperty(value = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @JsonProperty(value = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @JsonProperty(value = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @JsonProperty(value = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeAccessKeysOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeAccessKeysOutput describeAccessKeys(DescribeAccessKeysInput input) throws QCException {
        if (input == null) {
            input = new DescribeAccessKeysInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAccessKeys");
        context.put("APIName", "DescribeAccessKeys");
        context.put("ServiceName", "DescribeAccessKeys");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAccessKeys");

        input.setAction("DescribeAccessKeys");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeAccessKeysOutput.class);
        if(backModel != null){
            return (DescribeAccessKeysOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeAccessKeys(DescribeAccessKeysInput input, ResponseCallBack<DescribeAccessKeysOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeAccessKeysInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAccessKeys");
        context.put("APIName", "DescribeAccessKeys");
        context.put("ServiceName", "DescribeAccessKeys");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAccessKeys");

        input.setAction("DescribeAccessKeys");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        if(callback == null) {
            throw new QCException("callback can't be null");
        }

        ResourceRequestFactory.getResourceRequest().sendApiRequestAsync(context,input,callback);
    }

    public static class DescribeAccessKeysInput extends IaasParamBody {
        private List<String> accessKeys;

        @JsonProperty(value = "access_keys")
        public void setAccessKeys(List<String> accessKeys) {
            this.accessKeys = accessKeys;
        }

        @JsonProperty(value = "access_keys")
        public List<String> getAccessKeys() {
            return this.accessKeys;
        }

        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private Integer offset;

        @JsonProperty(value = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @JsonProperty(value = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private String owner;

        @JsonProperty(value = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @JsonProperty(value = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String searchWord;

        @JsonProperty(value = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @JsonProperty(value = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private List<String> status;

        @JsonProperty(value = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public List<String> getStatus() {
            return this.status;
        }

        private Integer verbose;

        @JsonProperty(value = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @JsonProperty(value = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeAccessKeysOutput extends OutputModel {
        private List<AccessKeyModel> accessKeySet;

        @JsonProperty(value = "access_key_set")
        public void setAccessKeySet(List<AccessKeyModel> accessKeySet) {
            this.accessKeySet = accessKeySet;
        }

        @JsonProperty(value = "access_key_set")
        public List<AccessKeyModel> getAccessKeySet() {
            return this.accessKeySet;
        }

        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @JsonProperty(value = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @JsonProperty(value = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private Integer totalCount;

        @JsonProperty(value = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @JsonProperty(value = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }}



















