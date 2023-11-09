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

public class MiscService {

    private EnvContext envContext;

    private String zone;

    public MiscService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public MiscService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return GetQuotaLeftOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/product/api/action/misc/get_quota_left.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetQuotaLeftOutput getQuotaLeft(GetQuotaLeftInput input) throws QCException {
        if (input == null) {
            input = new GetQuotaLeftInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetQuotaLeft");
        context.put("APIName", "GetQuotaLeft");
        context.put("ServiceName", "GetQuotaLeft");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetQuotaLeft");

        input.setAction("GetQuotaLeft");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetQuotaLeftOutput.class);
        if(backModel != null){
            return (GetQuotaLeftOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/product/api/action/misc/get_quota_left.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getQuotaLeft(GetQuotaLeftInput input, ResponseCallBack<GetQuotaLeftOutput> callback) throws QCException {
        if (input == null) {
            input = new GetQuotaLeftInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetQuotaLeft");
        context.put("APIName", "GetQuotaLeft");
        context.put("ServiceName", "GetQuotaLeft");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetQuotaLeft");

        input.setAction("GetQuotaLeft");
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

    public static class GetQuotaLeftInput extends IaasParamBody {
        private List<String> resourceTypes;

        @JsonProperty(value = "resource_types")
        public void setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
        }

        @JsonProperty(value = "resource_types")
        public List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        // Required
        private String zone;

        @JsonProperty(value = "zone")
        public void setZone(String zone) {
            this.zone = zone;
        }

        @JsonProperty(value = "zone")
        public String getZone() {
            return this.zone;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getZone())) {
                throw new QCException("Zone is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetQuotaLeftOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<QuotaLeftModel> quotaLeftSet;

        @JsonProperty(value = "quota_left_set")
        public void setQuotaLeftSet(List<QuotaLeftModel> quotaLeftSet) {
            this.quotaLeftSet = quotaLeftSet;
        }

        @JsonProperty(value = "quota_left_set")
        public List<QuotaLeftModel> getQuotaLeftSet() {
            return this.quotaLeftSet;
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
      * @return GetResourceLimitOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/product/api/action/misc>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetResourceLimitOutput getResourceLimit(GetResourceLimitInput input) throws QCException {
        if (input == null) {
            input = new GetResourceLimitInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetResourceLimit");
        context.put("APIName", "GetResourceLimit");
        context.put("ServiceName", "GetResourceLimit");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetResourceLimit");

        input.setAction("GetResourceLimit");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetResourceLimitOutput.class);
        if(backModel != null){
            return (GetResourceLimitOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/product/api/action/misc>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getResourceLimit(GetResourceLimitInput input, ResponseCallBack<GetResourceLimitOutput> callback) throws QCException {
        if (input == null) {
            input = new GetResourceLimitInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetResourceLimit");
        context.put("APIName", "GetResourceLimit");
        context.put("ServiceName", "GetResourceLimit");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetResourceLimit");

        input.setAction("GetResourceLimit");
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

    public static class GetResourceLimitInput extends IaasParamBody {
        private Integer volumeType;

        @JsonProperty(value = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @JsonProperty(value = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
        }

        // Required
        private String zone;

        @JsonProperty(value = "zone")
        public void setZone(String zone) {
            this.zone = zone;
        }

        @JsonProperty(value = "zone")
        public String getZone() {
            return this.zone;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getZone())) {
                throw new QCException("Zone is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetResourceLimitOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Integer maxSize;

        @JsonProperty(value = "max-size")
        public void setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
        }

        @JsonProperty(value = "max-size")
        public Integer getMaxSize() {
            return this.maxSize;
        }

        private Integer minSize;

        @JsonProperty(value = "min-size")
        public void setMinSize(Integer minSize) {
            this.minSize = minSize;
        }

        @JsonProperty(value = "min-size")
        public Integer getMinSize() {
            return this.minSize;
        }

        private ResourceLimitsModel resourceLimits;

        @JsonProperty(value = "resource_limits")
        public void setResourceLimits(ResourceLimitsModel resourceLimits) {
            this.resourceLimits = resourceLimits;
        }

        @JsonProperty(value = "resource_limits")
        public ResourceLimitsModel getResourceLimits() {
            return this.resourceLimits;
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

        private Integer step;

        @JsonProperty(value = "step")
        public void setStep(Integer step) {
            this.step = step;
        }

        @JsonProperty(value = "step")
        public Integer getStep() {
            return this.step;
        }

        private List<String> vxNetSubnets;

        @JsonProperty(value = "vxnet_subnets")
        public void setVxNetSubnets(List<String> vxNetSubnets) {
            this.vxNetSubnets = vxNetSubnets;
        }

        @JsonProperty(value = "vxnet_subnets")
        public List<String> getVxNetSubnets() {
            return this.vxNetSubnets;
        }

        private Integer vxNetVersion;

        @JsonProperty(value = "vxnet_version")
        public void setVxNetVersion(Integer vxNetVersion) {
            this.vxNetVersion = vxNetVersion;
        }

        @JsonProperty(value = "vxnet_version")
        public Integer getVxNetVersion() {
            return this.vxNetVersion;
        }

    }}



















