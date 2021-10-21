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

public class SecurityGroupService {

    private EnvContext envContext;

    private String zone;

    public SecurityGroupService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public SecurityGroupService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddSecurityGroupRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/add_security_group_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddSecurityGroupRulesOutput addSecurityGroupRules(AddSecurityGroupRulesInput input) throws QCException {
        if (input == null) {
            input = new AddSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddSecurityGroupRules");
        context.put("APIName", "AddSecurityGroupRules");
        context.put("ServiceName", "AddSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddSecurityGroupRules");

        input.setAction("AddSecurityGroupRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddSecurityGroupRulesOutput.class);
        if(backModel != null){
            return (AddSecurityGroupRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/add_security_group_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addSecurityGroupRules(AddSecurityGroupRulesInput input, ResponseCallBack<AddSecurityGroupRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new AddSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddSecurityGroupRules");
        context.put("APIName", "AddSecurityGroupRules");
        context.put("ServiceName", "AddSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddSecurityGroupRules");

        input.setAction("AddSecurityGroupRules");
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

    public static class AddSecurityGroupRulesInput extends IaasParamBody {
        // Required
        private List<SecurityGroupRuleModel> rules;

        @JsonProperty(value = "rules")
        public void setRules(List<SecurityGroupRuleModel> rules) {
            this.rules = rules;
        }

        @JsonProperty(value = "rules")
        public List<SecurityGroupRuleModel> getRules() {
            return this.rules;
        }

        // Required
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public String validateParam() throws QCException {
            if (this.getRules() != null && this.getRules().size() > 0 ) {
                for (int i = 0 ; i < this.getRules().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddSecurityGroupRulesOutput extends OutputModel {
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

        private List<String> securityGroupRules;

        @JsonProperty(value = "security_group_rules")
        public void setSecurityGroupRules(List<String> securityGroupRules) {
            this.securityGroupRules = securityGroupRules;
        }

        @JsonProperty(value = "security_group_rules")
        public List<String> getSecurityGroupRules() {
            return this.securityGroupRules;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ApplySecurityGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/apply_security_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplySecurityGroupOutput applySecurityGroup(ApplySecurityGroupInput input) throws QCException {
        if (input == null) {
            input = new ApplySecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySecurityGroup");
        context.put("APIName", "ApplySecurityGroup");
        context.put("ServiceName", "ApplySecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySecurityGroup");

        input.setAction("ApplySecurityGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplySecurityGroupOutput.class);
        if(backModel != null){
            return (ApplySecurityGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/apply_security_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applySecurityGroup(ApplySecurityGroupInput input, ResponseCallBack<ApplySecurityGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplySecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySecurityGroup");
        context.put("APIName", "ApplySecurityGroup");
        context.put("ServiceName", "ApplySecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySecurityGroup");

        input.setAction("ApplySecurityGroup");
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

    public static class ApplySecurityGroupInput extends IaasParamBody {
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        // Required
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplySecurityGroupOutput extends OutputModel {
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
      * @return ApplySecurityGroupIPSetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/apply_security_group_ipsets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplySecurityGroupIPSetsOutput applySecurityGroupIPSets(ApplySecurityGroupIPSetsInput input) throws QCException {
        if (input == null) {
            input = new ApplySecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySecurityGroupIPSets");
        context.put("APIName", "ApplySecurityGroupIPSets");
        context.put("ServiceName", "ApplySecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySecurityGroupIPSets");

        input.setAction("ApplySecurityGroupIPSets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplySecurityGroupIPSetsOutput.class);
        if(backModel != null){
            return (ApplySecurityGroupIPSetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/apply_security_group_ipsets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applySecurityGroupIPSets(ApplySecurityGroupIPSetsInput input, ResponseCallBack<ApplySecurityGroupIPSetsOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplySecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySecurityGroupIPSets");
        context.put("APIName", "ApplySecurityGroupIPSets");
        context.put("ServiceName", "ApplySecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySecurityGroupIPSets");

        input.setAction("ApplySecurityGroupIPSets");
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

    public static class ApplySecurityGroupIPSetsInput extends IaasParamBody {
        // Required
        private List<String> securityGroupIPSets;

        @JsonProperty(value = "security_group_ipsets")
        public void setSecurityGroupIPSets(List<String> securityGroupIPSets) {
            this.securityGroupIPSets = securityGroupIPSets;
        }

        @JsonProperty(value = "security_group_ipsets")
        public List<String> getSecurityGroupIPSets() {
            return this.securityGroupIPSets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplySecurityGroupIPSetsOutput extends OutputModel {
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
      * @return CreateSecurityGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/create_security_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateSecurityGroupOutput createSecurityGroup(CreateSecurityGroupInput input) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroup");
        context.put("APIName", "CreateSecurityGroup");
        context.put("ServiceName", "CreateSecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroup");

        input.setAction("CreateSecurityGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateSecurityGroupOutput.class);
        if(backModel != null){
            return (CreateSecurityGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/create_security_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createSecurityGroup(CreateSecurityGroupInput input, ResponseCallBack<CreateSecurityGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroup");
        context.put("APIName", "CreateSecurityGroup");
        context.put("ServiceName", "CreateSecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroup");

        input.setAction("CreateSecurityGroup");
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

    public static class CreateSecurityGroupInput extends IaasParamBody {
        private String securityGroupName;

        @JsonProperty(value = "security_group_name")
        public void setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
        }

        @JsonProperty(value = "security_group_name")
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateSecurityGroupOutput extends OutputModel {
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

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CreateSecurityGroupIPSetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/create_security_group_ipset.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateSecurityGroupIPSetOutput createSecurityGroupIPSet(CreateSecurityGroupIPSetInput input) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupIPSetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroupIPSet");
        context.put("APIName", "CreateSecurityGroupIPSet");
        context.put("ServiceName", "CreateSecurityGroupIPSet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroupIPSet");

        input.setAction("CreateSecurityGroupIPSet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateSecurityGroupIPSetOutput.class);
        if(backModel != null){
            return (CreateSecurityGroupIPSetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/create_security_group_ipset.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createSecurityGroupIPSet(CreateSecurityGroupIPSetInput input, ResponseCallBack<CreateSecurityGroupIPSetOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupIPSetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroupIPSet");
        context.put("APIName", "CreateSecurityGroupIPSet");
        context.put("ServiceName", "CreateSecurityGroupIPSet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroupIPSet");

        input.setAction("CreateSecurityGroupIPSet");
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

    public static class CreateSecurityGroupIPSetInput extends IaasParamBody {
    	// IPSetType's available values: 0, 1
        // Required
        private Integer iPSetType;

        @JsonProperty(value = "ipset_type")
        public void setIPSetType(Integer iPSetType) {
            this.iPSetType = iPSetType;
        }

        @JsonProperty(value = "ipset_type")
        public Integer getIPSetType() {
            return this.iPSetType;
        }

        private String securityGroupIPSetName;

        @JsonProperty(value = "security_group_ipset_name")
        public void setSecurityGroupIPSetName(String securityGroupIPSetName) {
            this.securityGroupIPSetName = securityGroupIPSetName;
        }

        @JsonProperty(value = "security_group_ipset_name")
        public String getSecurityGroupIPSetName() {
            return this.securityGroupIPSetName;
        }

        // Required
        private String val;

        @JsonProperty(value = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @JsonProperty(value = "val")
        public String getVal() {
            return this.val;
        }

        public String validateParam() throws QCException {
            if (this.getIPSetType() < 0 ) {
                throw new QCException("IPSetType is required");
            }
            String[]iPSetTypeValidValues = {"0", "1"};
            boolean iPSetTypeIsValid = false;
            for (String v : iPSetTypeValidValues) {
                if (v.equals(this.getIPSetType()+"")) {
                    iPSetTypeIsValid = true;
                }
                Boolean iPSetTypeIsRequired = Boolean.TRUE;
                if (iPSetTypeIsRequired.equals(Boolean.FALSE) && this.getIPSetType()==null) {
                    iPSetTypeIsValid = true;
                }
            }

            if (!iPSetTypeIsValid) {
                throw new QCException("IPSetType value " + this.getIPSetType() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getVal())) {
                throw new QCException("Val is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateSecurityGroupIPSetOutput extends OutputModel {
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

        private String securityGroupIPSetID;

        @JsonProperty(value = "security_group_ipset_id")
        public void setSecurityGroupIPSetID(String securityGroupIPSetID) {
            this.securityGroupIPSetID = securityGroupIPSetID;
        }

        @JsonProperty(value = "security_group_ipset_id")
        public String getSecurityGroupIPSetID() {
            return this.securityGroupIPSetID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CreateSecurityGroupSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/create_security_group_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateSecurityGroupSnapshotOutput createSecurityGroupSnapshot(CreateSecurityGroupSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroupSnapshot");
        context.put("APIName", "CreateSecurityGroupSnapshot");
        context.put("ServiceName", "CreateSecurityGroupSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroupSnapshot");

        input.setAction("CreateSecurityGroupSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateSecurityGroupSnapshotOutput.class);
        if(backModel != null){
            return (CreateSecurityGroupSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/create_security_group_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createSecurityGroupSnapshot(CreateSecurityGroupSnapshotInput input, ResponseCallBack<CreateSecurityGroupSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateSecurityGroupSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSecurityGroupSnapshot");
        context.put("APIName", "CreateSecurityGroupSnapshot");
        context.put("ServiceName", "CreateSecurityGroupSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSecurityGroupSnapshot");

        input.setAction("CreateSecurityGroupSnapshot");
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

    public static class CreateSecurityGroupSnapshotInput extends IaasParamBody {
        private String name;

        @JsonProperty(value = "name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value = "name")
        public String getName() {
            return this.name;
        }

        // Required
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateSecurityGroupSnapshotOutput extends OutputModel {
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

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupSnapshotID;

        @JsonProperty(value = "security_group_snapshot_id")
        public void setSecurityGroupSnapshotID(String securityGroupSnapshotID) {
            this.securityGroupSnapshotID = securityGroupSnapshotID;
        }

        @JsonProperty(value = "security_group_snapshot_id")
        public String getSecurityGroupSnapshotID() {
            return this.securityGroupSnapshotID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteSecurityGroupIPSetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_ipsets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteSecurityGroupIPSetsOutput deleteSecurityGroupIPSets(DeleteSecurityGroupIPSetsInput input) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupIPSets");
        context.put("APIName", "DeleteSecurityGroupIPSets");
        context.put("ServiceName", "DeleteSecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupIPSets");

        input.setAction("DeleteSecurityGroupIPSets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteSecurityGroupIPSetsOutput.class);
        if(backModel != null){
            return (DeleteSecurityGroupIPSetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_ipsets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteSecurityGroupIPSets(DeleteSecurityGroupIPSetsInput input, ResponseCallBack<DeleteSecurityGroupIPSetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupIPSets");
        context.put("APIName", "DeleteSecurityGroupIPSets");
        context.put("ServiceName", "DeleteSecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupIPSets");

        input.setAction("DeleteSecurityGroupIPSets");
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

    public static class DeleteSecurityGroupIPSetsInput extends IaasParamBody {
        // Required
        private List<String> securityGroupIPSets;

        @JsonProperty(value = "security_group_ipsets")
        public void setSecurityGroupIPSets(List<String> securityGroupIPSets) {
            this.securityGroupIPSets = securityGroupIPSets;
        }

        @JsonProperty(value = "security_group_ipsets")
        public List<String> getSecurityGroupIPSets() {
            return this.securityGroupIPSets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteSecurityGroupIPSetsOutput extends OutputModel {
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

        private List<String> securityGroupIPSets;

        @JsonProperty(value = "security_group_ipsets")
        public void setSecurityGroupIPSets(List<String> securityGroupIPSets) {
            this.securityGroupIPSets = securityGroupIPSets;
        }

        @JsonProperty(value = "security_group_ipsets")
        public List<String> getSecurityGroupIPSets() {
            return this.securityGroupIPSets;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteSecurityGroupRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteSecurityGroupRulesOutput deleteSecurityGroupRules(DeleteSecurityGroupRulesInput input) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupRules");
        context.put("APIName", "DeleteSecurityGroupRules");
        context.put("ServiceName", "DeleteSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupRules");

        input.setAction("DeleteSecurityGroupRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteSecurityGroupRulesOutput.class);
        if(backModel != null){
            return (DeleteSecurityGroupRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteSecurityGroupRules(DeleteSecurityGroupRulesInput input, ResponseCallBack<DeleteSecurityGroupRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupRules");
        context.put("APIName", "DeleteSecurityGroupRules");
        context.put("ServiceName", "DeleteSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupRules");

        input.setAction("DeleteSecurityGroupRules");
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

    public static class DeleteSecurityGroupRulesInput extends IaasParamBody {
        // Required
        private List<String> securityGroupRules;

        @JsonProperty(value = "security_group_rules")
        public void setSecurityGroupRules(List<String> securityGroupRules) {
            this.securityGroupRules = securityGroupRules;
        }

        @JsonProperty(value = "security_group_rules")
        public List<String> getSecurityGroupRules() {
            return this.securityGroupRules;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteSecurityGroupRulesOutput extends OutputModel {
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

        private List<String> securityGroupRules;

        @JsonProperty(value = "security_group_rules")
        public void setSecurityGroupRules(List<String> securityGroupRules) {
            this.securityGroupRules = securityGroupRules;
        }

        @JsonProperty(value = "security_group_rules")
        public List<String> getSecurityGroupRules() {
            return this.securityGroupRules;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteSecurityGroupSnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteSecurityGroupSnapshotsOutput deleteSecurityGroupSnapshots(DeleteSecurityGroupSnapshotsInput input) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupSnapshots");
        context.put("APIName", "DeleteSecurityGroupSnapshots");
        context.put("ServiceName", "DeleteSecurityGroupSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupSnapshots");

        input.setAction("DeleteSecurityGroupSnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteSecurityGroupSnapshotsOutput.class);
        if(backModel != null){
            return (DeleteSecurityGroupSnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/delete_security_group_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteSecurityGroupSnapshots(DeleteSecurityGroupSnapshotsInput input, ResponseCallBack<DeleteSecurityGroupSnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroupSnapshots");
        context.put("APIName", "DeleteSecurityGroupSnapshots");
        context.put("ServiceName", "DeleteSecurityGroupSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroupSnapshots");

        input.setAction("DeleteSecurityGroupSnapshots");
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

    public static class DeleteSecurityGroupSnapshotsInput extends IaasParamBody {
        // Required
        private List<String> securityGroupSnapshots;

        @JsonProperty(value = "security_group_snapshots")
        public void setSecurityGroupSnapshots(List<String> securityGroupSnapshots) {
            this.securityGroupSnapshots = securityGroupSnapshots;
        }

        @JsonProperty(value = "security_group_snapshots")
        public List<String> getSecurityGroupSnapshots() {
            return this.securityGroupSnapshots;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteSecurityGroupSnapshotsOutput extends OutputModel {
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

        private List<String> securityGroupSnapshots;

        @JsonProperty(value = "security_group_snapshots")
        public void setSecurityGroupSnapshots(List<String> securityGroupSnapshots) {
            this.securityGroupSnapshots = securityGroupSnapshots;
        }

        @JsonProperty(value = "security_group_snapshots")
        public List<String> getSecurityGroupSnapshots() {
            return this.securityGroupSnapshots;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteSecurityGroupsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/delete_security_groups.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteSecurityGroupsOutput deleteSecurityGroups(DeleteSecurityGroupsInput input) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroups");
        context.put("APIName", "DeleteSecurityGroups");
        context.put("ServiceName", "DeleteSecurityGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroups");

        input.setAction("DeleteSecurityGroups");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteSecurityGroupsOutput.class);
        if(backModel != null){
            return (DeleteSecurityGroupsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/delete_security_groups.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteSecurityGroups(DeleteSecurityGroupsInput input, ResponseCallBack<DeleteSecurityGroupsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteSecurityGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSecurityGroups");
        context.put("APIName", "DeleteSecurityGroups");
        context.put("ServiceName", "DeleteSecurityGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSecurityGroups");

        input.setAction("DeleteSecurityGroups");
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

    public static class DeleteSecurityGroupsInput extends IaasParamBody {
        // Required
        private List<String> securityGroups;

        @JsonProperty(value = "security_groups")
        public void setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = securityGroups;
        }

        @JsonProperty(value = "security_groups")
        public List<String> getSecurityGroups() {
            return this.securityGroups;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteSecurityGroupsOutput extends OutputModel {
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

        private List<String> securityGroups;

        @JsonProperty(value = "security_groups")
        public void setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = securityGroups;
        }

        @JsonProperty(value = "security_groups")
        public List<String> getSecurityGroups() {
            return this.securityGroups;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeSecurityGroupIPSetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_ipsets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeSecurityGroupIPSetsOutput describeSecurityGroupIPSets(DescribeSecurityGroupIPSetsInput input) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupIPSets");
        context.put("APIName", "DescribeSecurityGroupIPSets");
        context.put("ServiceName", "DescribeSecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupIPSets");

        input.setAction("DescribeSecurityGroupIPSets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeSecurityGroupIPSetsOutput.class);
        if(backModel != null){
            return (DescribeSecurityGroupIPSetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_ipsets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeSecurityGroupIPSets(DescribeSecurityGroupIPSetsInput input, ResponseCallBack<DescribeSecurityGroupIPSetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupIPSetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupIPSets");
        context.put("APIName", "DescribeSecurityGroupIPSets");
        context.put("ServiceName", "DescribeSecurityGroupIPSets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupIPSets");

        input.setAction("DescribeSecurityGroupIPSets");
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

    public static class DescribeSecurityGroupIPSetsInput extends IaasParamBody {
    	// IPSetType's available values: 0, 1
        private Integer iPSetType;

        @JsonProperty(value = "ipset_type")
        public void setIPSetType(Integer iPSetType) {
            this.iPSetType = iPSetType;
        }

        @JsonProperty(value = "ipset_type")
        public Integer getIPSetType() {
            return this.iPSetType;
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

        private String securityGroupIPSetName;

        @JsonProperty(value = "security_group_ipset_name")
        public void setSecurityGroupIPSetName(String securityGroupIPSetName) {
            this.securityGroupIPSetName = securityGroupIPSetName;
        }

        @JsonProperty(value = "security_group_ipset_name")
        public String getSecurityGroupIPSetName() {
            return this.securityGroupIPSetName;
        }

        private List<String> securityGroupIPSets;

        @JsonProperty(value = "security_group_ipsets")
        public void setSecurityGroupIPSets(List<String> securityGroupIPSets) {
            this.securityGroupIPSets = securityGroupIPSets;
        }

        @JsonProperty(value = "security_group_ipsets")
        public List<String> getSecurityGroupIPSets() {
            return this.securityGroupIPSets;
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
            String[]iPSetTypeValidValues = {"0", "1"};
            boolean iPSetTypeIsValid = false;
            for (String v : iPSetTypeValidValues) {
                if (v.equals(this.getIPSetType()+"")) {
                    iPSetTypeIsValid = true;
                }
                Boolean iPSetTypeIsRequired = Boolean.FALSE;
                if (iPSetTypeIsRequired.equals(Boolean.FALSE) && this.getIPSetType()==null) {
                    iPSetTypeIsValid = true;
                }
            }

            if (!iPSetTypeIsValid) {
                throw new QCException("IPSetType value " + this.getIPSetType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeSecurityGroupIPSetsOutput extends OutputModel {
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

        private List<SecurityGroupIPSetModel> securityGroupIPSetSet;

        @JsonProperty(value = "security_group_ipset_set")
        public void setSecurityGroupIPSetSet(List<SecurityGroupIPSetModel> securityGroupIPSetSet) {
            this.securityGroupIPSetSet = securityGroupIPSetSet;
        }

        @JsonProperty(value = "security_group_ipset_set")
        public List<SecurityGroupIPSetModel> getSecurityGroupIPSetSet() {
            return this.securityGroupIPSetSet;
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
      * @return DescribeSecurityGroupRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeSecurityGroupRulesOutput describeSecurityGroupRules(DescribeSecurityGroupRulesInput input) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupRules");
        context.put("APIName", "DescribeSecurityGroupRules");
        context.put("ServiceName", "DescribeSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupRules");

        input.setAction("DescribeSecurityGroupRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeSecurityGroupRulesOutput.class);
        if(backModel != null){
            return (DescribeSecurityGroupRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeSecurityGroupRules(DescribeSecurityGroupRulesInput input, ResponseCallBack<DescribeSecurityGroupRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupRules");
        context.put("APIName", "DescribeSecurityGroupRules");
        context.put("ServiceName", "DescribeSecurityGroupRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupRules");

        input.setAction("DescribeSecurityGroupRules");
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

    public static class DescribeSecurityGroupRulesInput extends IaasParamBody {
    	// Direction's available values: 0, 1
        private Integer direction;

        @JsonProperty(value = "direction")
        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        @JsonProperty(value = "direction")
        public Integer getDirection() {
            return this.direction;
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

        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private List<String> securityGroupRules;

        @JsonProperty(value = "security_group_rules")
        public void setSecurityGroupRules(List<String> securityGroupRules) {
            this.securityGroupRules = securityGroupRules;
        }

        @JsonProperty(value = "security_group_rules")
        public List<String> getSecurityGroupRules() {
            return this.securityGroupRules;
        }

        public String validateParam() throws QCException {
            String[]directionValidValues = {"0", "1"};
            boolean directionIsValid = false;
            for (String v : directionValidValues) {
                if (v.equals(this.getDirection()+"")) {
                    directionIsValid = true;
                }
                Boolean directionIsRequired = Boolean.FALSE;
                if (directionIsRequired.equals(Boolean.FALSE) && this.getDirection()==null) {
                    directionIsValid = true;
                }
            }

            if (!directionIsValid) {
                throw new QCException("Direction value " + this.getDirection() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeSecurityGroupRulesOutput extends OutputModel {
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

        private List<SecurityGroupRuleModel> securityGroupRuleSet;

        @JsonProperty(value = "security_group_rule_set")
        public void setSecurityGroupRuleSet(List<SecurityGroupRuleModel> securityGroupRuleSet) {
            this.securityGroupRuleSet = securityGroupRuleSet;
        }

        @JsonProperty(value = "security_group_rule_set")
        public List<SecurityGroupRuleModel> getSecurityGroupRuleSet() {
            return this.securityGroupRuleSet;
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
      * @return DescribeSecurityGroupSnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeSecurityGroupSnapshotsOutput describeSecurityGroupSnapshots(DescribeSecurityGroupSnapshotsInput input) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupSnapshots");
        context.put("APIName", "DescribeSecurityGroupSnapshots");
        context.put("ServiceName", "DescribeSecurityGroupSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupSnapshots");

        input.setAction("DescribeSecurityGroupSnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeSecurityGroupSnapshotsOutput.class);
        if(backModel != null){
            return (DescribeSecurityGroupSnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/describe_security_group_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeSecurityGroupSnapshots(DescribeSecurityGroupSnapshotsInput input, ResponseCallBack<DescribeSecurityGroupSnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroupSnapshots");
        context.put("APIName", "DescribeSecurityGroupSnapshots");
        context.put("ServiceName", "DescribeSecurityGroupSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroupSnapshots");

        input.setAction("DescribeSecurityGroupSnapshots");
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

    public static class DescribeSecurityGroupSnapshotsInput extends IaasParamBody {
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

        private String projectID;

        @JsonProperty(value = "project_id")
        public void setProjectID(String projectID) {
            this.projectID = projectID;
        }

        @JsonProperty(value = "project_id")
        public String getProjectID() {
            return this.projectID;
        }

        private Integer reverse;

        @JsonProperty(value = "reverse")
        public void setReverse(Integer reverse) {
            this.reverse = reverse;
        }

        @JsonProperty(value = "reverse")
        public Integer getReverse() {
            return this.reverse;
        }

        // Required
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private List<String> securityGroupSnapshots;

        @JsonProperty(value = "security_group_snapshots")
        public void setSecurityGroupSnapshots(List<String> securityGroupSnapshots) {
            this.securityGroupSnapshots = securityGroupSnapshots;
        }

        @JsonProperty(value = "security_group_snapshots")
        public List<String> getSecurityGroupSnapshots() {
            return this.securityGroupSnapshots;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeSecurityGroupSnapshotsOutput extends OutputModel {
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

        private List<SecurityGroupSnapshotModel> securityGroupSnapshotSet;

        @JsonProperty(value = "security_group_snapshot_set")
        public void setSecurityGroupSnapshotSet(List<SecurityGroupSnapshotModel> securityGroupSnapshotSet) {
            this.securityGroupSnapshotSet = securityGroupSnapshotSet;
        }

        @JsonProperty(value = "security_group_snapshot_set")
        public List<SecurityGroupSnapshotModel> getSecurityGroupSnapshotSet() {
            return this.securityGroupSnapshotSet;
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
      * @return DescribeSecurityGroupsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/describe_security_groups.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeSecurityGroupsOutput describeSecurityGroups(DescribeSecurityGroupsInput input) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroups");
        context.put("APIName", "DescribeSecurityGroups");
        context.put("ServiceName", "DescribeSecurityGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroups");

        input.setAction("DescribeSecurityGroups");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeSecurityGroupsOutput.class);
        if(backModel != null){
            return (DescribeSecurityGroupsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/describe_security_groups.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeSecurityGroups(DescribeSecurityGroupsInput input, ResponseCallBack<DescribeSecurityGroupsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeSecurityGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSecurityGroups");
        context.put("APIName", "DescribeSecurityGroups");
        context.put("ServiceName", "DescribeSecurityGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSecurityGroups");

        input.setAction("DescribeSecurityGroups");
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

    public static class DescribeSecurityGroupsInput extends IaasParamBody {
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

        private List<String> securityGroups;

        @JsonProperty(value = "security_groups")
        public void setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = securityGroups;
        }

        @JsonProperty(value = "security_groups")
        public List<String> getSecurityGroups() {
            return this.securityGroups;
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
    public static class DescribeSecurityGroupsOutput extends OutputModel {
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

        private List<SecurityGroupModel> securityGroupSet;

        @JsonProperty(value = "security_group_set")
        public void setSecurityGroupSet(List<SecurityGroupModel> securityGroupSet) {
            this.securityGroupSet = securityGroupSet;
        }

        @JsonProperty(value = "security_group_set")
        public List<SecurityGroupModel> getSecurityGroupSet() {
            return this.securityGroupSet;
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
      * @return ModifySecurityGroupAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifySecurityGroupAttributesOutput modifySecurityGroupAttributes(ModifySecurityGroupAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupAttributes");
        context.put("APIName", "ModifySecurityGroupAttributes");
        context.put("ServiceName", "ModifySecurityGroupAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupAttributes");

        input.setAction("ModifySecurityGroupAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifySecurityGroupAttributesOutput.class);
        if(backModel != null){
            return (ModifySecurityGroupAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifySecurityGroupAttributes(ModifySecurityGroupAttributesInput input, ResponseCallBack<ModifySecurityGroupAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupAttributes");
        context.put("APIName", "ModifySecurityGroupAttributes");
        context.put("ServiceName", "ModifySecurityGroupAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupAttributes");

        input.setAction("ModifySecurityGroupAttributes");
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

    public static class ModifySecurityGroupAttributesInput extends IaasParamBody {
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
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private String securityGroupName;

        @JsonProperty(value = "security_group_name")
        public void setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
        }

        @JsonProperty(value = "security_group_name")
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifySecurityGroupAttributesOutput extends OutputModel {
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

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ModifySecurityGroupIPSetAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_ipset_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifySecurityGroupIPSetAttributesOutput modifySecurityGroupIPSetAttributes(ModifySecurityGroupIPSetAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupIPSetAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupIPSetAttributes");
        context.put("APIName", "ModifySecurityGroupIPSetAttributes");
        context.put("ServiceName", "ModifySecurityGroupIPSetAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupIPSetAttributes");

        input.setAction("ModifySecurityGroupIPSetAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifySecurityGroupIPSetAttributesOutput.class);
        if(backModel != null){
            return (ModifySecurityGroupIPSetAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_ipset_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifySecurityGroupIPSetAttributes(ModifySecurityGroupIPSetAttributesInput input, ResponseCallBack<ModifySecurityGroupIPSetAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupIPSetAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupIPSetAttributes");
        context.put("APIName", "ModifySecurityGroupIPSetAttributes");
        context.put("ServiceName", "ModifySecurityGroupIPSetAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupIPSetAttributes");

        input.setAction("ModifySecurityGroupIPSetAttributes");
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

    public static class ModifySecurityGroupIPSetAttributesInput extends IaasParamBody {
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
        private String securityGroupIPSet;

        @JsonProperty(value = "security_group_ipset")
        public void setSecurityGroupIPSet(String securityGroupIPSet) {
            this.securityGroupIPSet = securityGroupIPSet;
        }

        @JsonProperty(value = "security_group_ipset")
        public String getSecurityGroupIPSet() {
            return this.securityGroupIPSet;
        }

        private String securityGroupIPSetName;

        @JsonProperty(value = "security_group_ipset_name")
        public void setSecurityGroupIPSetName(String securityGroupIPSetName) {
            this.securityGroupIPSetName = securityGroupIPSetName;
        }

        @JsonProperty(value = "security_group_ipset_name")
        public String getSecurityGroupIPSetName() {
            return this.securityGroupIPSetName;
        }

        private String val;

        @JsonProperty(value = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @JsonProperty(value = "val")
        public String getVal() {
            return this.val;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroupIPSet())) {
                throw new QCException("SecurityGroupIPSet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifySecurityGroupIPSetAttributesOutput extends OutputModel {
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

        private String securityGroupIPSetID;

        @JsonProperty(value = "security_group_ipset_id")
        public void setSecurityGroupIPSetID(String securityGroupIPSetID) {
            this.securityGroupIPSetID = securityGroupIPSetID;
        }

        @JsonProperty(value = "security_group_ipset_id")
        public String getSecurityGroupIPSetID() {
            return this.securityGroupIPSetID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ModifySecurityGroupRuleAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_rule_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifySecurityGroupRuleAttributesOutput modifySecurityGroupRuleAttributes(ModifySecurityGroupRuleAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupRuleAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupRuleAttributes");
        context.put("APIName", "ModifySecurityGroupRuleAttributes");
        context.put("ServiceName", "ModifySecurityGroupRuleAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupRuleAttributes");

        input.setAction("ModifySecurityGroupRuleAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifySecurityGroupRuleAttributesOutput.class);
        if(backModel != null){
            return (ModifySecurityGroupRuleAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/modify_security_group_rule_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifySecurityGroupRuleAttributes(ModifySecurityGroupRuleAttributesInput input, ResponseCallBack<ModifySecurityGroupRuleAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifySecurityGroupRuleAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySecurityGroupRuleAttributes");
        context.put("APIName", "ModifySecurityGroupRuleAttributes");
        context.put("ServiceName", "ModifySecurityGroupRuleAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySecurityGroupRuleAttributes");

        input.setAction("ModifySecurityGroupRuleAttributes");
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

    public static class ModifySecurityGroupRuleAttributesInput extends IaasParamBody {
    	// Direction's available values: 0, 1
        private Integer direction;

        @JsonProperty(value = "direction")
        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        @JsonProperty(value = "direction")
        public Integer getDirection() {
            return this.direction;
        }

        private Integer priority;

        @JsonProperty(value = "priority")
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        @JsonProperty(value = "priority")
        public Integer getPriority() {
            return this.priority;
        }

        private String protocol;

        @JsonProperty(value = "protocol")
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        @JsonProperty(value = "protocol")
        public String getProtocol() {
            return this.protocol;
        }

    	// RuleAction's available values: accept, drop
        private String ruleAction;

        @JsonProperty(value = "rule_action")
        public void setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
        }

        @JsonProperty(value = "rule_action")
        public String getRuleAction() {
            return this.ruleAction;
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

        // Required
        private String securityGroupRule;

        @JsonProperty(value = "security_group_rule")
        public void setSecurityGroupRule(String securityGroupRule) {
            this.securityGroupRule = securityGroupRule;
        }

        @JsonProperty(value = "security_group_rule")
        public String getSecurityGroupRule() {
            return this.securityGroupRule;
        }

        private String securityGroupRuleName;

        @JsonProperty(value = "security_group_rule_name")
        public void setSecurityGroupRuleName(String securityGroupRuleName) {
            this.securityGroupRuleName = securityGroupRuleName;
        }

        @JsonProperty(value = "security_group_rule_name")
        public String getSecurityGroupRuleName() {
            return this.securityGroupRuleName;
        }

        private String val1;

        @JsonProperty(value = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @JsonProperty(value = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }

        private String val3;

        @JsonProperty(value = "val3")
        public void setVal3(String val3) {
            this.val3 = val3;
        }

        @JsonProperty(value = "val3")
        public String getVal3() {
            return this.val3;
        }

        public String validateParam() throws QCException {
            String[]directionValidValues = {"0", "1"};
            boolean directionIsValid = false;
            for (String v : directionValidValues) {
                if (v.equals(this.getDirection()+"")) {
                    directionIsValid = true;
                }
                Boolean directionIsRequired = Boolean.FALSE;
                if (directionIsRequired.equals(Boolean.FALSE) && this.getDirection()==null) {
                    directionIsValid = true;
                }
            }

            if (!directionIsValid) {
                throw new QCException("Direction value " + this.getDirection() + "is invalid");
            }
            String[] ruleActionValidValues = {
                "accept", "drop"
            };

            boolean ruleActionIsValid = false;
            for (String v : ruleActionValidValues) {
                if (v.equals(this.getRuleAction())) {
                    ruleActionIsValid = true;
                }
                Boolean ruleActionIsRequired = Boolean.FALSE;
                if (ruleActionIsRequired.equals(Boolean.FALSE) && this.getRuleAction() == null) {
                    ruleActionIsValid = true;
                }
            }

            if (!ruleActionIsValid) {
                throw new QCException("RuleAction value " + this.getRuleAction() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getSecurityGroupRule())) {
                throw new QCException("SecurityGroupRule is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifySecurityGroupRuleAttributesOutput extends OutputModel {
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

        private String securityGroupRuleID;

        @JsonProperty(value = "security_group_rule_id")
        public void setSecurityGroupRuleID(String securityGroupRuleID) {
            this.securityGroupRuleID = securityGroupRuleID;
        }

        @JsonProperty(value = "security_group_rule_id")
        public String getSecurityGroupRuleID() {
            return this.securityGroupRuleID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return RollbackSecurityGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/sg/rollback_security_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RollbackSecurityGroupOutput rollbackSecurityGroup(RollbackSecurityGroupInput input) throws QCException {
        if (input == null) {
            input = new RollbackSecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RollbackSecurityGroup");
        context.put("APIName", "RollbackSecurityGroup");
        context.put("ServiceName", "RollbackSecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RollbackSecurityGroup");

        input.setAction("RollbackSecurityGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RollbackSecurityGroupOutput.class);
        if(backModel != null){
            return (RollbackSecurityGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/sg/rollback_security_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void rollbackSecurityGroup(RollbackSecurityGroupInput input, ResponseCallBack<RollbackSecurityGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new RollbackSecurityGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RollbackSecurityGroup");
        context.put("APIName", "RollbackSecurityGroup");
        context.put("ServiceName", "RollbackSecurityGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RollbackSecurityGroup");

        input.setAction("RollbackSecurityGroup");
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

    public static class RollbackSecurityGroupInput extends IaasParamBody {
        // Required
        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        // Required
        private String securityGroupSnapshot;

        @JsonProperty(value = "security_group_snapshot")
        public void setSecurityGroupSnapshot(String securityGroupSnapshot) {
            this.securityGroupSnapshot = securityGroupSnapshot;
        }

        @JsonProperty(value = "security_group_snapshot")
        public String getSecurityGroupSnapshot() {
            return this.securityGroupSnapshot;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSecurityGroup())) {
                throw new QCException("SecurityGroup is required");
            }
            if (QCStringUtil.isEmpty(this.getSecurityGroupSnapshot())) {
                throw new QCException("SecurityGroupSnapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RollbackSecurityGroupOutput extends OutputModel {
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

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupSnapshotID;

        @JsonProperty(value = "security_group_snapshot_id")
        public void setSecurityGroupSnapshotID(String securityGroupSnapshotID) {
            this.securityGroupSnapshotID = securityGroupSnapshotID;
        }

        @JsonProperty(value = "security_group_snapshot_id")
        public String getSecurityGroupSnapshotID() {
            return this.securityGroupSnapshotID;
        }

    }}



















