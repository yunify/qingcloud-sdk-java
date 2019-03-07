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

public class InstanceService {

    private EnvContext envContext;

    private String zone;

    public InstanceService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public InstanceService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/cease_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CeaseInstancesOutput ceaseInstances(CeaseInstancesInput input) throws QCException {
        if (input == null) {
            input = new CeaseInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseInstances");
        context.put("APIName", "CeaseInstances");
        context.put("ServiceName", "CeaseInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseInstances");

        input.setAction("CeaseInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CeaseInstancesOutput.class);
        if(backModel != null){
            return (CeaseInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/cease_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void ceaseInstances(CeaseInstancesInput input, ResponseCallBack<CeaseInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new CeaseInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseInstances");
        context.put("APIName", "CeaseInstances");
        context.put("ServiceName", "CeaseInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseInstances");

        input.setAction("CeaseInstances");
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

    public static class CeaseInstancesInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CeaseInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/describe_instance_types.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeInstanceTypesOutput describeInstanceTypes(DescribeInstanceTypesInput input) throws QCException {
        if (input == null) {
            input = new DescribeInstanceTypesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeInstanceTypes");
        context.put("APIName", "DescribeInstanceTypes");
        context.put("ServiceName", "DescribeInstanceTypes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeInstanceTypes");

        input.setAction("DescribeInstanceTypes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeInstanceTypesOutput.class);
        if(backModel != null){
            return (DescribeInstanceTypesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/describe_instance_types.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeInstanceTypes(DescribeInstanceTypesInput input, ResponseCallBack<DescribeInstanceTypesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeInstanceTypesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeInstanceTypes");
        context.put("APIName", "DescribeInstanceTypes");
        context.put("ServiceName", "DescribeInstanceTypes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeInstanceTypes");

        input.setAction("DescribeInstanceTypes");
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

    public static class DescribeInstanceTypesInput extends IaasParamBody {
        private List<String> instanceTypes;

        @JsonProperty(value = "instance_types")
        public void setInstanceTypes(List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
        }

        @JsonProperty(value = "instance_types")
        public List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeInstanceTypesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<InstanceTypeModel> instanceTypeSet;

        @JsonProperty(value = "instance_type_set")
        public void setInstanceTypeSet(List<InstanceTypeModel> instanceTypeSet) {
            this.instanceTypeSet = instanceTypeSet;
        }

        @JsonProperty(value = "instance_type_set")
        public List<InstanceTypeModel> getInstanceTypeSet() {
            return this.instanceTypeSet;
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/describe_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeInstancesOutput describeInstances(DescribeInstancesInput input) throws QCException {
        if (input == null) {
            input = new DescribeInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeInstances");
        context.put("APIName", "DescribeInstances");
        context.put("ServiceName", "DescribeInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeInstances");

        input.setAction("DescribeInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeInstancesOutput.class);
        if(backModel != null){
            return (DescribeInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/describe_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeInstances(DescribeInstancesInput input, ResponseCallBack<DescribeInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeInstances");
        context.put("APIName", "DescribeInstances");
        context.put("ServiceName", "DescribeInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeInstances");

        input.setAction("DescribeInstances");
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

    public static class DescribeInstancesInput extends IaasParamBody {
        private List<String> imageID;

        @JsonProperty(value = "image_id")
        public void setImageID(List<String> imageID) {
            this.imageID = imageID;
        }

        @JsonProperty(value = "image_id")
        public List<String> getImageID() {
            return this.imageID;
        }

    	// InstanceClass's available values: 0, 1
        private Integer instanceClass;

        @JsonProperty(value = "instance_class")
        public void setInstanceClass(Integer instanceClass) {
            this.instanceClass = instanceClass;
        }

        @JsonProperty(value = "instance_class")
        public Integer getInstanceClass() {
            return this.instanceClass;
        }

        private List<String> instanceType;

        @JsonProperty(value = "instance_type")
        public void setInstanceType(List<String> instanceType) {
            this.instanceType = instanceType;
        }

        @JsonProperty(value = "instance_type")
        public List<String> getInstanceType() {
            return this.instanceType;
        }

        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        private Integer isClusterNode;

        @JsonProperty(value = "is_cluster_node")
        public void setIsClusterNode(Integer isClusterNode) {
            this.isClusterNode = isClusterNode;
        }

        @JsonProperty(value = "is_cluster_node")
        public Integer getIsClusterNode() {
            return this.isClusterNode;
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

        private List<String> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<String> getTags() {
            return this.tags;
        }

    	// Verbose's available values: 0, 1
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
            String[]instanceClassValidValues = {"0", "1"};
            boolean instanceClassIsValid = false;
            for (String v : instanceClassValidValues) {
                if (v.equals(this.getInstanceClass()+"")) {
                    instanceClassIsValid = true;
                }
                Boolean instanceClassIsRequired = Boolean.FALSE;
                if (instanceClassIsRequired.equals(Boolean.FALSE) && this.getInstanceClass()==null) {
                    instanceClassIsValid = true;
                }
            }

            if (!instanceClassIsValid) {
                throw new QCException("InstanceClass value " + this.getInstanceClass() + "is invalid");
            }
            String[]verboseValidValues = {"0", "1"};
            boolean verboseIsValid = false;
            for (String v : verboseValidValues) {
                if (v.equals(this.getVerbose()+"")) {
                    verboseIsValid = true;
                }
                Boolean verboseIsRequired = Boolean.FALSE;
                if (verboseIsRequired.equals(Boolean.FALSE) && this.getVerbose()==null) {
                    verboseIsValid = true;
                }
            }

            if (!verboseIsValid) {
                throw new QCException("Verbose value " + this.getVerbose() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeInstancesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<InstanceModel> instanceSet;

        @JsonProperty(value = "instance_set")
        public void setInstanceSet(List<InstanceModel> instanceSet) {
            this.instanceSet = instanceSet;
        }

        @JsonProperty(value = "instance_set")
        public List<InstanceModel> getInstanceSet() {
            return this.instanceSet;
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/modify_instance_attributes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyInstanceAttributesOutput modifyInstanceAttributes(ModifyInstanceAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyInstanceAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyInstanceAttributes");
        context.put("APIName", "ModifyInstanceAttributes");
        context.put("ServiceName", "ModifyInstanceAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyInstanceAttributes");

        input.setAction("ModifyInstanceAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyInstanceAttributesOutput.class);
        if(backModel != null){
            return (ModifyInstanceAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/modify_instance_attributes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyInstanceAttributes(ModifyInstanceAttributesInput input, ResponseCallBack<ModifyInstanceAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyInstanceAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyInstanceAttributes");
        context.put("APIName", "ModifyInstanceAttributes");
        context.put("ServiceName", "ModifyInstanceAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyInstanceAttributes");

        input.setAction("ModifyInstanceAttributes");
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

    public static class ModifyInstanceAttributesInput extends IaasParamBody {
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
        private String instance;

        @JsonProperty(value = "instance")
        public void setInstance(String instance) {
            this.instance = instance;
        }

        @JsonProperty(value = "instance")
        public String getInstance() {
            return this.instance;
        }

        private String instanceName;

        @JsonProperty(value = "instance_name")
        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        @JsonProperty(value = "instance_name")
        public String getInstanceName() {
            return this.instanceName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyInstanceAttributesOutput extends OutputModel {
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

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/reset_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResetInstancesOutput resetInstances(ResetInstancesInput input) throws QCException {
        if (input == null) {
            input = new ResetInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResetInstances");
        context.put("APIName", "ResetInstances");
        context.put("ServiceName", "ResetInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResetInstances");

        input.setAction("ResetInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResetInstancesOutput.class);
        if(backModel != null){
            return (ResetInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/reset_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resetInstances(ResetInstancesInput input, ResponseCallBack<ResetInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new ResetInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResetInstances");
        context.put("APIName", "ResetInstances");
        context.put("ServiceName", "ResetInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResetInstances");

        input.setAction("ResetInstances");
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

    public static class ResetInstancesInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        private String loginKeyPair;

        @JsonProperty(value = "login_keypair")
        public void setLoginKeyPair(String loginKeyPair) {
            this.loginKeyPair = loginKeyPair;
        }

        @JsonProperty(value = "login_keypair")
        public String getLoginKeyPair() {
            return this.loginKeyPair;
        }

    	// LoginMode's available values: keypair, passwd
        // Required
        private String loginMode;

        @JsonProperty(value = "login_mode")
        public void setLoginMode(String loginMode) {
            this.loginMode = loginMode;
        }

        @JsonProperty(value = "login_mode")
        public String getLoginMode() {
            return this.loginMode;
        }

        private String loginPasswd;

        @JsonProperty(value = "login_passwd")
        public void setLoginPasswd(String loginPasswd) {
            this.loginPasswd = loginPasswd;
        }

        @JsonProperty(value = "login_passwd")
        public String getLoginPasswd() {
            return this.loginPasswd;
        }

    	// NeedNewSID's available values: 0, 1
        private Integer needNewSID;

        @JsonProperty(value = "need_newsid")
        public void setNeedNewSID(Integer needNewSID) {
            this.needNewSID = needNewSID;
        }

        @JsonProperty(value = "need_newsid")
        public Integer getNeedNewSID() {
            return this.needNewSID;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoginMode())) {
                throw new QCException("LoginMode is required");
            }
            String[] loginModeValidValues = {
                "keypair", "passwd"
            };

            boolean loginModeIsValid = false;
            for (String v : loginModeValidValues) {
                if (v.equals(this.getLoginMode())) {
                    loginModeIsValid = true;
                }
                Boolean loginModeIsRequired = Boolean.TRUE;
                if (loginModeIsRequired.equals(Boolean.FALSE) && this.getLoginMode() == null) {
                    loginModeIsValid = true;
                }
            }

            if (!loginModeIsValid) {
                throw new QCException("LoginMode value " + this.getLoginMode() + "is invalid");
            }
            String[]needNewSIDValidValues = {"0", "1"};
            boolean needNewSIDIsValid = false;
            for (String v : needNewSIDValidValues) {
                if (v.equals(this.getNeedNewSID()+"")) {
                    needNewSIDIsValid = true;
                }
                Boolean needNewSIDIsRequired = Boolean.FALSE;
                if (needNewSIDIsRequired.equals(Boolean.FALSE) && this.getNeedNewSID()==null) {
                    needNewSIDIsValid = true;
                }
            }

            if (!needNewSIDIsValid) {
                throw new QCException("NeedNewSID value " + this.getNeedNewSID() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResetInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/resize_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeInstancesOutput resizeInstances(ResizeInstancesInput input) throws QCException {
        if (input == null) {
            input = new ResizeInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeInstances");
        context.put("APIName", "ResizeInstances");
        context.put("ServiceName", "ResizeInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeInstances");

        input.setAction("ResizeInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeInstancesOutput.class);
        if(backModel != null){
            return (ResizeInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/resize_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeInstances(ResizeInstancesInput input, ResponseCallBack<ResizeInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeInstances");
        context.put("APIName", "ResizeInstances");
        context.put("ServiceName", "ResizeInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeInstances");

        input.setAction("ResizeInstances");
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

    public static class ResizeInstancesInput extends IaasParamBody {
    	// CPU's available values: 1, 2, 4, 8, 16
        private Integer cPU;

        @JsonProperty(value = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @JsonProperty(value = "cpu")
        public Integer getCPU() {
            return this.cPU;
        }

        private String cPUModel;

        @JsonProperty(value = "cpu_model")
        public void setCPUModel(String cPUModel) {
            this.cPUModel = cPUModel;
        }

        @JsonProperty(value = "cpu_model")
        public String getCPUModel() {
            return this.cPUModel;
        }

        private Integer gpu;

        @JsonProperty(value = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @JsonProperty(value = "gpu")
        public Integer getGpu() {
            return this.gpu;
        }

        private String instanceType;

        @JsonProperty(value = "instance_type")
        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        @JsonProperty(value = "instance_type")
        public String getInstanceType() {
            return this.instanceType;
        }

        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

    	// Memory's available values: 1024, 2048, 4096, 6144, 8192, 12288, 16384, 24576, 32768
        private Integer memory;

        @JsonProperty(value = "memory")
        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        @JsonProperty(value = "memory")
        public Integer getMemory() {
            return this.memory;
        }

        private Integer oSDiskSize;

        @JsonProperty(value = "os_disk_size")
        public void setOSDiskSize(Integer oSDiskSize) {
            this.oSDiskSize = oSDiskSize;
        }

        @JsonProperty(value = "os_disk_size")
        public Integer getOSDiskSize() {
            return this.oSDiskSize;
        }

        public String validateParam() throws QCException {
            String[]cPUValidValues = {"1", "2", "4", "8", "16"};
            boolean cPUIsValid = false;
            for (String v : cPUValidValues) {
                if (v.equals(this.getCPU()+"")) {
                    cPUIsValid = true;
                }
                Boolean cPUIsRequired = Boolean.FALSE;
                if (cPUIsRequired.equals(Boolean.FALSE) && this.getCPU()==null) {
                    cPUIsValid = true;
                }
            }

            if (!cPUIsValid) {
                throw new QCException("CPU value " + this.getCPU() + "is invalid");
            }
            String[]memoryValidValues = {"1024", "2048", "4096", "6144", "8192", "12288", "16384", "24576", "32768"};
            boolean memoryIsValid = false;
            for (String v : memoryValidValues) {
                if (v.equals(this.getMemory()+"")) {
                    memoryIsValid = true;
                }
                Boolean memoryIsRequired = Boolean.FALSE;
                if (memoryIsRequired.equals(Boolean.FALSE) && this.getMemory()==null) {
                    memoryIsValid = true;
                }
            }

            if (!memoryIsValid) {
                throw new QCException("Memory value " + this.getMemory() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/restart_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RestartInstancesOutput restartInstances(RestartInstancesInput input) throws QCException {
        if (input == null) {
            input = new RestartInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartInstances");
        context.put("APIName", "RestartInstances");
        context.put("ServiceName", "RestartInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartInstances");

        input.setAction("RestartInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RestartInstancesOutput.class);
        if(backModel != null){
            return (RestartInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/restart_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void restartInstances(RestartInstancesInput input, ResponseCallBack<RestartInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new RestartInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartInstances");
        context.put("APIName", "RestartInstances");
        context.put("ServiceName", "RestartInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartInstances");

        input.setAction("RestartInstances");
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

    public static class RestartInstancesInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestartInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/run_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RunInstancesOutput runInstances(RunInstancesInput input) throws QCException {
        if (input == null) {
            input = new RunInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RunInstances");
        context.put("APIName", "RunInstances");
        context.put("ServiceName", "RunInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RunInstances");

        input.setAction("RunInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RunInstancesOutput.class);
        if(backModel != null){
            return (RunInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/run_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void runInstances(RunInstancesInput input, ResponseCallBack<RunInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new RunInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RunInstances");
        context.put("APIName", "RunInstances");
        context.put("ServiceName", "RunInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RunInstances");

        input.setAction("RunInstances");
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

    public static class RunInstancesInput extends IaasParamBody {
        private String billingID;

        @JsonProperty(value = "billing_id")
        public void setBillingID(String billingID) {
            this.billingID = billingID;
        }

        @JsonProperty(value = "billing_id")
        public String getBillingID() {
            return this.billingID;
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

    	// CPU's available values: 1, 2, 4, 8, 16
        private Integer cPU;

        @JsonProperty(value = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @JsonProperty(value = "cpu")
        public Integer getCPU() {
            return this.cPU;
        }

    	// CPUMax's available values: 1, 2, 4, 8, 16
        private Integer cPUMax;

        @JsonProperty(value = "cpu_max")
        public void setCPUMax(Integer cPUMax) {
            this.cPUMax = cPUMax;
        }

        @JsonProperty(value = "cpu_max")
        public Integer getCPUMax() {
            return this.cPUMax;
        }

    	// CPUModel's available values: Westmere, SandyBridge, IvyBridge, Haswell, Broadwell
        private String cPUModel;

        @JsonProperty(value = "cpu_model")
        public void setCPUModel(String cPUModel) {
            this.cPUModel = cPUModel;
        }

        @JsonProperty(value = "cpu_model")
        public String getCPUModel() {
            return this.cPUModel;
        }

        private Integer gpu;

        @JsonProperty(value = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @JsonProperty(value = "gpu")
        public Integer getGpu() {
            return this.gpu;
        }

        private String hostname;

        @JsonProperty(value = "hostname")
        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        @JsonProperty(value = "hostname")
        public String getHostname() {
            return this.hostname;
        }

        // Required
        private String imageID;

        @JsonProperty(value = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @JsonProperty(value = "image_id")
        public String getImageID() {
            return this.imageID;
        }

    	// InstanceClass's available values: 0, 1, 2, 3, 4, 5, 6, 100, 101, 200, 201, 300, 301
        private Integer instanceClass;

        @JsonProperty(value = "instance_class")
        public void setInstanceClass(Integer instanceClass) {
            this.instanceClass = instanceClass;
        }

        @JsonProperty(value = "instance_class")
        public Integer getInstanceClass() {
            return this.instanceClass;
        }

        private String instanceName;

        @JsonProperty(value = "instance_name")
        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        @JsonProperty(value = "instance_name")
        public String getInstanceName() {
            return this.instanceName;
        }

        private String instanceType;

        @JsonProperty(value = "instance_type")
        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        @JsonProperty(value = "instance_type")
        public String getInstanceType() {
            return this.instanceType;
        }

        private String loginKeyPair;

        @JsonProperty(value = "login_keypair")
        public void setLoginKeyPair(String loginKeyPair) {
            this.loginKeyPair = loginKeyPair;
        }

        @JsonProperty(value = "login_keypair")
        public String getLoginKeyPair() {
            return this.loginKeyPair;
        }

    	// LoginMode's available values: keypair, passwd
        // Required
        private String loginMode;

        @JsonProperty(value = "login_mode")
        public void setLoginMode(String loginMode) {
            this.loginMode = loginMode;
        }

        @JsonProperty(value = "login_mode")
        public String getLoginMode() {
            return this.loginMode;
        }

        private String loginPasswd;

        @JsonProperty(value = "login_passwd")
        public void setLoginPasswd(String loginPasswd) {
            this.loginPasswd = loginPasswd;
        }

        @JsonProperty(value = "login_passwd")
        public String getLoginPasswd() {
            return this.loginPasswd;
        }

    	// MemMax's available values: 1024, 2048, 4096, 6144, 8192, 12288, 16384, 24576, 32768
        private Integer memMax;

        @JsonProperty(value = "mem_max")
        public void setMemMax(Integer memMax) {
            this.memMax = memMax;
        }

        @JsonProperty(value = "mem_max")
        public Integer getMemMax() {
            return this.memMax;
        }

    	// Memory's available values: 1024, 2048, 4096, 6144, 8192, 12288, 16384, 24576, 32768
        private Integer memory;

        @JsonProperty(value = "memory")
        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        @JsonProperty(value = "memory")
        public Integer getMemory() {
            return this.memory;
        }

    	// NeedNewSID's available values: 0, 1
        private Integer needNewSID;

        @JsonProperty(value = "need_newsid")
        public void setNeedNewSID(Integer needNewSID) {
            this.needNewSID = needNewSID;
        }

        @JsonProperty(value = "need_newsid")
        public Integer getNeedNewSID() {
            return this.needNewSID;
        }

    	// NeedUserdata's available values: 0, 1
        private Integer needUserdata;

        @JsonProperty(value = "need_userdata")
        public void setNeedUserdata(Integer needUserdata) {
            this.needUserdata = needUserdata;
        }

        @JsonProperty(value = "need_userdata")
        public Integer getNeedUserdata() {
            return this.needUserdata;
        }

        private Integer oSDiskSize;

        @JsonProperty(value = "os_disk_size")
        public void setOSDiskSize(Integer oSDiskSize) {
            this.oSDiskSize = oSDiskSize;
        }

        @JsonProperty(value = "os_disk_size")
        public Integer getOSDiskSize() {
            return this.oSDiskSize;
        }

        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private String uIType;

        @JsonProperty(value = "ui_type")
        public void setUIType(String uIType) {
            this.uIType = uIType;
        }

        @JsonProperty(value = "ui_type")
        public String getUIType() {
            return this.uIType;
        }

        private String userdataFile;

        @JsonProperty(value = "userdata_file")
        public void setUserdataFile(String userdataFile) {
            this.userdataFile = userdataFile;
        }

        @JsonProperty(value = "userdata_file")
        public String getUserdataFile() {
            return this.userdataFile;
        }

        private String userdataPath;

        @JsonProperty(value = "userdata_path")
        public void setUserdataPath(String userdataPath) {
            this.userdataPath = userdataPath;
        }

        @JsonProperty(value = "userdata_path")
        public String getUserdataPath() {
            return this.userdataPath;
        }

    	// UserdataType's available values: plain, exec, tar
        private String userdataType;

        @JsonProperty(value = "userdata_type")
        public void setUserdataType(String userdataType) {
            this.userdataType = userdataType;
        }

        @JsonProperty(value = "userdata_type")
        public String getUserdataType() {
            return this.userdataType;
        }

        private String userdataValue;

        @JsonProperty(value = "userdata_value")
        public void setUserdataValue(String userdataValue) {
            this.userdataValue = userdataValue;
        }

        @JsonProperty(value = "userdata_value")
        public String getUserdataValue() {
            return this.userdataValue;
        }

        private List<String> volumes;

        @JsonProperty(value = "volumes")
        public void setVolumes(List<String> volumes) {
            this.volumes = volumes;
        }

        @JsonProperty(value = "volumes")
        public List<String> getVolumes() {
            return this.volumes;
        }

        private List<String> vxNets;

        @JsonProperty(value = "vxnets")
        public void setVxNets(List<String> vxNets) {
            this.vxNets = vxNets;
        }

        @JsonProperty(value = "vxnets")
        public List<String> getVxNets() {
            return this.vxNets;
        }

        public String validateParam() throws QCException {
            String[]cPUValidValues = {"1", "2", "4", "8", "16"};
            boolean cPUIsValid = false;
            for (String v : cPUValidValues) {
                if (v.equals(this.getCPU()+"")) {
                    cPUIsValid = true;
                }
                Boolean cPUIsRequired = Boolean.FALSE;
                if (cPUIsRequired.equals(Boolean.FALSE) && this.getCPU()==null) {
                    cPUIsValid = true;
                }
            }

            if (!cPUIsValid) {
                throw new QCException("CPU value " + this.getCPU() + "is invalid");
            }
            String[]cPUMaxValidValues = {"1", "2", "4", "8", "16"};
            boolean cPUMaxIsValid = false;
            for (String v : cPUMaxValidValues) {
                if (v.equals(this.getCPUMax()+"")) {
                    cPUMaxIsValid = true;
                }
                Boolean cPUMaxIsRequired = Boolean.FALSE;
                if (cPUMaxIsRequired.equals(Boolean.FALSE) && this.getCPUMax()==null) {
                    cPUMaxIsValid = true;
                }
            }

            if (!cPUMaxIsValid) {
                throw new QCException("CPUMax value " + this.getCPUMax() + "is invalid");
            }
            String[] cPUModelValidValues = {
                "Westmere", "SandyBridge", "IvyBridge", "Haswell", "Broadwell"
            };

            boolean cPUModelIsValid = false;
            for (String v : cPUModelValidValues) {
                if (v.equals(this.getCPUModel())) {
                    cPUModelIsValid = true;
                }
                Boolean cPUModelIsRequired = Boolean.FALSE;
                if (cPUModelIsRequired.equals(Boolean.FALSE) && this.getCPUModel() == null) {
                    cPUModelIsValid = true;
                }
            }

            if (!cPUModelIsValid) {
                throw new QCException("CPUModel value " + this.getCPUModel() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getImageID())) {
                throw new QCException("ImageID is required");
            }
            String[]instanceClassValidValues = {"0", "1", "2", "3", "4", "5", "6", "100", "101", "200", "201", "300", "301"};
            boolean instanceClassIsValid = false;
            for (String v : instanceClassValidValues) {
                if (v.equals(this.getInstanceClass()+"")) {
                    instanceClassIsValid = true;
                }
                Boolean instanceClassIsRequired = Boolean.FALSE;
                if (instanceClassIsRequired.equals(Boolean.FALSE) && this.getInstanceClass()==null) {
                    instanceClassIsValid = true;
                }
            }

            if (!instanceClassIsValid) {
                throw new QCException("InstanceClass value " + this.getInstanceClass() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getLoginMode())) {
                throw new QCException("LoginMode is required");
            }
            String[] loginModeValidValues = {
                "keypair", "passwd"
            };

            boolean loginModeIsValid = false;
            for (String v : loginModeValidValues) {
                if (v.equals(this.getLoginMode())) {
                    loginModeIsValid = true;
                }
                Boolean loginModeIsRequired = Boolean.TRUE;
                if (loginModeIsRequired.equals(Boolean.FALSE) && this.getLoginMode() == null) {
                    loginModeIsValid = true;
                }
            }

            if (!loginModeIsValid) {
                throw new QCException("LoginMode value " + this.getLoginMode() + "is invalid");
            }
            String[]memMaxValidValues = {"1024", "2048", "4096", "6144", "8192", "12288", "16384", "24576", "32768"};
            boolean memMaxIsValid = false;
            for (String v : memMaxValidValues) {
                if (v.equals(this.getMemMax()+"")) {
                    memMaxIsValid = true;
                }
                Boolean memMaxIsRequired = Boolean.FALSE;
                if (memMaxIsRequired.equals(Boolean.FALSE) && this.getMemMax()==null) {
                    memMaxIsValid = true;
                }
            }

            if (!memMaxIsValid) {
                throw new QCException("MemMax value " + this.getMemMax() + "is invalid");
            }
            String[]memoryValidValues = {"1024", "2048", "4096", "6144", "8192", "12288", "16384", "24576", "32768"};
            boolean memoryIsValid = false;
            for (String v : memoryValidValues) {
                if (v.equals(this.getMemory()+"")) {
                    memoryIsValid = true;
                }
                Boolean memoryIsRequired = Boolean.FALSE;
                if (memoryIsRequired.equals(Boolean.FALSE) && this.getMemory()==null) {
                    memoryIsValid = true;
                }
            }

            if (!memoryIsValid) {
                throw new QCException("Memory value " + this.getMemory() + "is invalid");
            }
            String[]needNewSIDValidValues = {"0", "1"};
            boolean needNewSIDIsValid = false;
            for (String v : needNewSIDValidValues) {
                if (v.equals(this.getNeedNewSID()+"")) {
                    needNewSIDIsValid = true;
                }
                Boolean needNewSIDIsRequired = Boolean.FALSE;
                if (needNewSIDIsRequired.equals(Boolean.FALSE) && this.getNeedNewSID()==null) {
                    needNewSIDIsValid = true;
                }
            }

            if (!needNewSIDIsValid) {
                throw new QCException("NeedNewSID value " + this.getNeedNewSID() + "is invalid");
            }
            String[]needUserdataValidValues = {"0", "1"};
            boolean needUserdataIsValid = false;
            for (String v : needUserdataValidValues) {
                if (v.equals(this.getNeedUserdata()+"")) {
                    needUserdataIsValid = true;
                }
                Boolean needUserdataIsRequired = Boolean.FALSE;
                if (needUserdataIsRequired.equals(Boolean.FALSE) && this.getNeedUserdata()==null) {
                    needUserdataIsValid = true;
                }
            }

            if (!needUserdataIsValid) {
                throw new QCException("NeedUserdata value " + this.getNeedUserdata() + "is invalid");
            }
            String[] userdataTypeValidValues = {
                "plain", "exec", "tar"
            };

            boolean userdataTypeIsValid = false;
            for (String v : userdataTypeValidValues) {
                if (v.equals(this.getUserdataType())) {
                    userdataTypeIsValid = true;
                }
                Boolean userdataTypeIsRequired = Boolean.FALSE;
                if (userdataTypeIsRequired.equals(Boolean.FALSE) && this.getUserdataType() == null) {
                    userdataTypeIsValid = true;
                }
            }

            if (!userdataTypeIsValid) {
                throw new QCException("UserdataType value " + this.getUserdataType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RunInstancesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/start_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StartInstancesOutput startInstances(StartInstancesInput input) throws QCException {
        if (input == null) {
            input = new StartInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartInstances");
        context.put("APIName", "StartInstances");
        context.put("ServiceName", "StartInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartInstances");

        input.setAction("StartInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StartInstancesOutput.class);
        if(backModel != null){
            return (StartInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/start_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void startInstances(StartInstancesInput input, ResponseCallBack<StartInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new StartInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartInstances");
        context.put("APIName", "StartInstances");
        context.put("ServiceName", "StartInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartInstances");

        input.setAction("StartInstances");
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

    public static class StartInstancesInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StartInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/stop_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StopInstancesOutput stopInstances(StopInstancesInput input) throws QCException {
        if (input == null) {
            input = new StopInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopInstances");
        context.put("APIName", "StopInstances");
        context.put("ServiceName", "StopInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopInstances");

        input.setAction("StopInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StopInstancesOutput.class);
        if(backModel != null){
            return (StopInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/stop_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void stopInstances(StopInstancesInput input, ResponseCallBack<StopInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new StopInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopInstances");
        context.put("APIName", "StopInstances");
        context.put("ServiceName", "StopInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopInstances");

        input.setAction("StopInstances");
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

    public static class StopInstancesInput extends IaasParamBody {
    	// Force's available values: 0, 1
        private Integer force;

        @JsonProperty(value = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @JsonProperty(value = "force")
        public Integer getForce() {
            return this.force;
        }

        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        public String validateParam() throws QCException {
            String[]forceValidValues = {"0", "1"};
            boolean forceIsValid = false;
            for (String v : forceValidValues) {
                if (v.equals(this.getForce()+"")) {
                    forceIsValid = true;
                }
                Boolean forceIsRequired = Boolean.FALSE;
                if (forceIsRequired.equals(Boolean.FALSE) && this.getForce()==null) {
                    forceIsValid = true;
                }
            }

            if (!forceIsValid) {
                throw new QCException("Force value " + this.getForce() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StopInstancesOutput extends OutputModel {
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/instance/terminate_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public TerminateInstancesOutput terminateInstances(TerminateInstancesInput input) throws QCException {
        if (input == null) {
            input = new TerminateInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "TerminateInstances");
        context.put("APIName", "TerminateInstances");
        context.put("ServiceName", "TerminateInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/TerminateInstances");

        input.setAction("TerminateInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,TerminateInstancesOutput.class);
        if(backModel != null){
            return (TerminateInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/instance/terminate_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void terminateInstances(TerminateInstancesInput input, ResponseCallBack<TerminateInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new TerminateInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "TerminateInstances");
        context.put("APIName", "TerminateInstances");
        context.put("ServiceName", "TerminateInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/TerminateInstances");

        input.setAction("TerminateInstances");
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

    public static class TerminateInstancesInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TerminateInstancesOutput extends OutputModel {
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



















