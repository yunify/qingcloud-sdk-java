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

public class EIPService {

    private EnvContext envContext;

    private String zone;

    public EIPService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public EIPService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AllocateEIPsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/allocate_eips.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AllocateEIPsOutput allocateEIPs(AllocateEIPsInput input) throws QCException {
        if (input == null) {
            input = new AllocateEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AllocateEips");
        context.put("APIName", "AllocateEips");
        context.put("ServiceName", "AllocateEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AllocateEips");

        input.setAction("AllocateEips");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AllocateEIPsOutput.class);
        if(backModel != null){
            return (AllocateEIPsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/allocate_eips.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void allocateEIPs(AllocateEIPsInput input, ResponseCallBack<AllocateEIPsOutput> callback) throws QCException {
        if (input == null) {
            input = new AllocateEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AllocateEIPs");
        context.put("APIName", "AllocateEIPs");
        context.put("ServiceName", "AllocateEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AllocateEips");

        input.setAction("AllocateEIPs");
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

    public static class AllocateEIPsInput extends IaasParamBody {
        // Required
        private Integer bandwidth;

        @JsonProperty(value = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @JsonProperty(value = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

    	// BillingMode's available values: bandwidth, traffic
        private String billingMode;

        @JsonProperty(value = "billing_mode")
        public void setBillingMode(String billingMode) {
            this.billingMode = billingMode;
        }

        @JsonProperty(value = "billing_mode")
        public String getBillingMode() {
            return this.billingMode;
        }

        private Integer count;

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String eIPName;

        @JsonProperty(value = "eip_name")
        public void setEIPName(String eIPName) {
            this.eIPName = eIPName;
        }

        @JsonProperty(value = "eip_name")
        public String getEIPName() {
            return this.eIPName;
        }

    	// NeedICP's available values: 0, 1
        private Integer needICP;

        @JsonProperty(value = "need_icp")
        public void setNeedICP(Integer needICP) {
            this.needICP = needICP;
        }

        @JsonProperty(value = "need_icp")
        public Integer getNeedICP() {
            return this.needICP;
        }

        public String validateParam() throws QCException {
            if (this.getBandwidth() < 0 ) {
                throw new QCException("Bandwidth is required");
            }
            String[] billingModeValidValues = {
                "bandwidth", "traffic"
            };

            boolean billingModeIsValid = false;
            for (String v : billingModeValidValues) {
                if (v.equals(this.getBillingMode())) {
                    billingModeIsValid = true;
                }
                Boolean billingModeIsRequired = Boolean.FALSE;
                if (billingModeIsRequired.equals(Boolean.FALSE) && this.getBillingMode() == null) {
                    billingModeIsValid = true;
                }
            }

            if (!billingModeIsValid) {
                throw new QCException("BillingMode value " + this.getBillingMode() + "is invalid");
            }
            String[]needICPValidValues = {"0", "1"};
            boolean needICPIsValid = false;
            for (String v : needICPValidValues) {
                if (v.equals(this.getNeedICP()+"")) {
                    needICPIsValid = true;
                }
                Boolean needICPIsRequired = Boolean.FALSE;
                if (needICPIsRequired.equals(Boolean.FALSE) && this.getNeedICP()==null) {
                    needICPIsValid = true;
                }
            }

            if (!needICPIsValid) {
                throw new QCException("NeedICP value " + this.getNeedICP() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AllocateEIPsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
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
      * @return AssociateEIPOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/associate_eip.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AssociateEIPOutput associateEIP(AssociateEIPInput input) throws QCException {
        if (input == null) {
            input = new AssociateEIPInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEip");
        context.put("APIName", "AssociateEip");
        context.put("ServiceName", "AssociateEip");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEip");

        input.setAction("AssociateEip");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AssociateEIPOutput.class);
        if(backModel != null){
            return (AssociateEIPOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/associate_eip.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void associateEIP(AssociateEIPInput input, ResponseCallBack<AssociateEIPOutput> callback) throws QCException {
        if (input == null) {
            input = new AssociateEIPInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEIP");
        context.put("APIName", "AssociateEIP");
        context.put("ServiceName", "AssociateEip");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEip");

        input.setAction("AssociateEIP");
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

    public static class AssociateEIPInput extends IaasParamBody {
        // Required
        private String eIP;

        @JsonProperty(value = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public String getEIP() {
            return this.eIP;
        }

        // Required
        private String instance;

        @JsonProperty(value = "instance")
        public void setInstance(String instance) {
            this.instance = instance;
        }

        @JsonProperty(value = "instance")
        public String getInstance() {
            return this.instance;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getEIP())) {
                throw new QCException("EIP is required");
            }
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssociateEIPOutput extends OutputModel {
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
      * @return ChangeEIPsBandwidthOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/dissociate_eips.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ChangeEIPsBandwidthOutput changeEIPsBandwidth(ChangeEIPsBandwidthInput input) throws QCException {
        if (input == null) {
            input = new ChangeEIPsBandwidthInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeEipsBandwidth");
        context.put("APIName", "ChangeEipsBandwidth");
        context.put("ServiceName", "ChangeEipsBandwidth");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeEipsBandwidth");

        input.setAction("ChangeEipsBandwidth");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ChangeEIPsBandwidthOutput.class);
        if(backModel != null){
            return (ChangeEIPsBandwidthOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/dissociate_eips.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void changeEIPsBandwidth(ChangeEIPsBandwidthInput input, ResponseCallBack<ChangeEIPsBandwidthOutput> callback) throws QCException {
        if (input == null) {
            input = new ChangeEIPsBandwidthInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeEIPsBandwidth");
        context.put("APIName", "ChangeEIPsBandwidth");
        context.put("ServiceName", "ChangeEipsBandwidth");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeEipsBandwidth");

        input.setAction("ChangeEIPsBandwidth");
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

    public static class ChangeEIPsBandwidthInput extends IaasParamBody {
        // Required
        private Integer bandwidth;

        @JsonProperty(value = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @JsonProperty(value = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        // Required
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            if (this.getBandwidth() < 0 ) {
                throw new QCException("Bandwidth is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChangeEIPsBandwidthOutput extends OutputModel {
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
      * @return ChangeEIPsBillingModeOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/change_eips_billing_mode.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ChangeEIPsBillingModeOutput changeEIPsBillingMode(ChangeEIPsBillingModeInput input) throws QCException {
        if (input == null) {
            input = new ChangeEIPsBillingModeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeEipsBillingMode");
        context.put("APIName", "ChangeEipsBillingMode");
        context.put("ServiceName", "ChangeEipsBillingMode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeEipsBillingMode");

        input.setAction("ChangeEipsBillingMode");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ChangeEIPsBillingModeOutput.class);
        if(backModel != null){
            return (ChangeEIPsBillingModeOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/change_eips_billing_mode.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void changeEIPsBillingMode(ChangeEIPsBillingModeInput input, ResponseCallBack<ChangeEIPsBillingModeOutput> callback) throws QCException {
        if (input == null) {
            input = new ChangeEIPsBillingModeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeEIPsBillingMode");
        context.put("APIName", "ChangeEIPsBillingMode");
        context.put("ServiceName", "ChangeEipsBillingMode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeEipsBillingMode");

        input.setAction("ChangeEIPsBillingMode");
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

    public static class ChangeEIPsBillingModeInput extends IaasParamBody {
    	// BillingMode's available values: bandwidth, traffic
        // Required
        private String billingMode;

        @JsonProperty(value = "billing_mode")
        public void setBillingMode(String billingMode) {
            this.billingMode = billingMode;
        }

        @JsonProperty(value = "billing_mode")
        public String getBillingMode() {
            return this.billingMode;
        }

        private String eIPGroup;

        @JsonProperty(value = "eip_group")
        public void setEIPGroup(String eIPGroup) {
            this.eIPGroup = eIPGroup;
        }

        @JsonProperty(value = "eip_group")
        public String getEIPGroup() {
            return this.eIPGroup;
        }

        // Required
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getBillingMode())) {
                throw new QCException("BillingMode is required");
            }
            String[] billingModeValidValues = {
                "bandwidth", "traffic"
            };

            boolean billingModeIsValid = false;
            for (String v : billingModeValidValues) {
                if (v.equals(this.getBillingMode())) {
                    billingModeIsValid = true;
                }
                Boolean billingModeIsRequired = Boolean.TRUE;
                if (billingModeIsRequired.equals(Boolean.FALSE) && this.getBillingMode() == null) {
                    billingModeIsValid = true;
                }
            }

            if (!billingModeIsValid) {
                throw new QCException("BillingMode value " + this.getBillingMode() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChangeEIPsBillingModeOutput extends OutputModel {
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
      * @return DescribeEIPsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/describe_eips.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeEIPsOutput describeEIPs(DescribeEIPsInput input) throws QCException {
        if (input == null) {
            input = new DescribeEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeEips");
        context.put("APIName", "DescribeEips");
        context.put("ServiceName", "DescribeEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeEips");

        input.setAction("DescribeEips");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeEIPsOutput.class);
        if(backModel != null){
            return (DescribeEIPsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/describe_eips.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeEIPs(DescribeEIPsInput input, ResponseCallBack<DescribeEIPsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeEIPs");
        context.put("APIName", "DescribeEIPs");
        context.put("ServiceName", "DescribeEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeEips");

        input.setAction("DescribeEIPs");
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

    public static class DescribeEIPsInput extends IaasParamBody {
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        private String instanceID;

        @JsonProperty(value = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @JsonProperty(value = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
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

        private String projectID;

        @JsonProperty(value = "project_id")
        public void setProjectID(String projectID) {
            this.projectID = projectID;
        }

        @JsonProperty(value = "project_id")
        public String getProjectID() {
            return this.projectID;
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

        private List<String> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<String> getTags() {
            return this.tags;
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
    public static class DescribeEIPsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<EIPModel> eIPSet;

        @JsonProperty(value = "eip_set")
        public void setEIPSet(List<EIPModel> eIPSet) {
            this.eIPSet = eIPSet;
        }

        @JsonProperty(value = "eip_set")
        public List<EIPModel> getEIPSet() {
            return this.eIPSet;
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

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DissociateEIPsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/dissociate_eips.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DissociateEIPsOutput dissociateEIPs(DissociateEIPsInput input) throws QCException {
        if (input == null) {
            input = new DissociateEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEips");
        context.put("APIName", "DissociateEips");
        context.put("ServiceName", "DissociateEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEips");

        input.setAction("DissociateEips");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DissociateEIPsOutput.class);
        if(backModel != null){
            return (DissociateEIPsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/dissociate_eips.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void dissociateEIPs(DissociateEIPsInput input, ResponseCallBack<DissociateEIPsOutput> callback) throws QCException {
        if (input == null) {
            input = new DissociateEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEIPs");
        context.put("APIName", "DissociateEIPs");
        context.put("ServiceName", "DissociateEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEips");

        input.setAction("DissociateEIPs");
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

    public static class DissociateEIPsInput extends IaasParamBody {
        // Required
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DissociateEIPsOutput extends OutputModel {
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
      * @return ModifyEIPAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/modify_eip_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyEIPAttributesOutput modifyEIPAttributes(ModifyEIPAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyEIPAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyEipAttributes");
        context.put("APIName", "ModifyEipAttributes");
        context.put("ServiceName", "ModifyEipAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyEipAttributes");

        input.setAction("ModifyEipAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyEIPAttributesOutput.class);
        if(backModel != null){
            return (ModifyEIPAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/modify_eip_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyEIPAttributes(ModifyEIPAttributesInput input, ResponseCallBack<ModifyEIPAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyEIPAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyEIPAttributes");
        context.put("APIName", "ModifyEIPAttributes");
        context.put("ServiceName", "ModifyEipAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyEipAttributes");

        input.setAction("ModifyEIPAttributes");
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

    public static class ModifyEIPAttributesInput extends IaasParamBody {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        // Required
        private String eIP;

        @JsonProperty(value = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public String getEIP() {
            return this.eIP;
        }

        private String eIPName;

        @JsonProperty(value = "eip_name")
        public void setEIPName(String eIPName) {
            this.eIPName = eIPName;
        }

        @JsonProperty(value = "eip_name")
        public String getEIPName() {
            return this.eIPName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getEIP())) {
                throw new QCException("EIP is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyEIPAttributesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String eIPID;

        @JsonProperty(value = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @JsonProperty(value = "eip_id")
        public String getEIPID() {
            return this.eIPID;
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
      * @return ReleaseEIPsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/eip/release_eips.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ReleaseEIPsOutput releaseEIPs(ReleaseEIPsInput input) throws QCException {
        if (input == null) {
            input = new ReleaseEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ReleaseEips");
        context.put("APIName", "ReleaseEips");
        context.put("ServiceName", "ReleaseEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ReleaseEips");

        input.setAction("ReleaseEips");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ReleaseEIPsOutput.class);
        if(backModel != null){
            return (ReleaseEIPsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/eip/release_eips.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void releaseEIPs(ReleaseEIPsInput input, ResponseCallBack<ReleaseEIPsOutput> callback) throws QCException {
        if (input == null) {
            input = new ReleaseEIPsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ReleaseEIPs");
        context.put("APIName", "ReleaseEIPs");
        context.put("ServiceName", "ReleaseEips");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ReleaseEips");

        input.setAction("ReleaseEIPs");
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

    public static class ReleaseEIPsInput extends IaasParamBody {
        // Required
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ReleaseEIPsOutput extends OutputModel {
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

    }}



















