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

public class LoadBalancerService {

    private EnvContext envContext;

    private String zone;

    public LoadBalancerService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public LoadBalancerService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddLoadBalancerBackendsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_backends.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddLoadBalancerBackendsOutput addLoadBalancerBackends(AddLoadBalancerBackendsInput input) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerBackends");
        context.put("APIName", "AddLoadBalancerBackends");
        context.put("ServiceName", "AddLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerBackends");

        input.setAction("AddLoadBalancerBackends");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddLoadBalancerBackendsOutput.class);
        if(backModel != null){
            return (AddLoadBalancerBackendsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_backends.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addLoadBalancerBackends(AddLoadBalancerBackendsInput input, ResponseCallBack<AddLoadBalancerBackendsOutput> callback) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerBackends");
        context.put("APIName", "AddLoadBalancerBackends");
        context.put("ServiceName", "AddLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerBackends");

        input.setAction("AddLoadBalancerBackends");
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

    public static class AddLoadBalancerBackendsInput extends IaasParamBody {
        // Required
        private List<LoadBalancerBackendModel> backends;

        @JsonProperty(value = "backends")
        public void setBackends(List<LoadBalancerBackendModel> backends) {
            this.backends = backends;
        }

        @JsonProperty(value = "backends")
        public List<LoadBalancerBackendModel> getBackends() {
            return this.backends;
        }

        // Required
        private String loadBalancerListener;

        @JsonProperty(value = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @JsonProperty(value = "loadbalancer_listener")
        public String getLoadBalancerListener() {
            return this.loadBalancerListener;
        }

        public String validateParam() throws QCException {
            if (this.getBackends() != null && this.getBackends().size() > 0 ) {
                for (int i = 0 ; i < this.getBackends().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getLoadBalancerListener())) {
                throw new QCException("LoadBalancerListener is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerBackends;

        @JsonProperty(value = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @JsonProperty(value = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
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
      * @return AddLoadBalancerListenersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_listeners.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddLoadBalancerListenersOutput addLoadBalancerListeners(AddLoadBalancerListenersInput input) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerListeners");
        context.put("APIName", "AddLoadBalancerListeners");
        context.put("ServiceName", "AddLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerListeners");

        input.setAction("AddLoadBalancerListeners");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddLoadBalancerListenersOutput.class);
        if(backModel != null){
            return (AddLoadBalancerListenersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_listeners.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addLoadBalancerListeners(AddLoadBalancerListenersInput input, ResponseCallBack<AddLoadBalancerListenersOutput> callback) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerListeners");
        context.put("APIName", "AddLoadBalancerListeners");
        context.put("ServiceName", "AddLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerListeners");

        input.setAction("AddLoadBalancerListeners");
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

    public static class AddLoadBalancerListenersInput extends IaasParamBody {
        private List<LoadBalancerListenerModel> listeners;

        @JsonProperty(value = "listeners")
        public void setListeners(List<LoadBalancerListenerModel> listeners) {
            this.listeners = listeners;
        }

        @JsonProperty(value = "listeners")
        public List<LoadBalancerListenerModel> getListeners() {
            return this.listeners;
        }

        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        public String validateParam() throws QCException {
            if (this.getListeners() != null && this.getListeners().size() > 0 ) {
                for (int i = 0 ; i < this.getListeners().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerListeners;

        @JsonProperty(value = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @JsonProperty(value = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
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
      * @return AddLoadBalancerPolicyRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_policy_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddLoadBalancerPolicyRulesOutput addLoadBalancerPolicyRules(AddLoadBalancerPolicyRulesInput input) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerPolicyRules");
        context.put("APIName", "AddLoadBalancerPolicyRules");
        context.put("ServiceName", "AddLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerPolicyRules");

        input.setAction("AddLoadBalancerPolicyRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddLoadBalancerPolicyRulesOutput.class);
        if(backModel != null){
            return (AddLoadBalancerPolicyRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/add_loadbalancer_policy_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addLoadBalancerPolicyRules(AddLoadBalancerPolicyRulesInput input, ResponseCallBack<AddLoadBalancerPolicyRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new AddLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddLoadBalancerPolicyRules");
        context.put("APIName", "AddLoadBalancerPolicyRules");
        context.put("ServiceName", "AddLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddLoadBalancerPolicyRules");

        input.setAction("AddLoadBalancerPolicyRules");
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

    public static class AddLoadBalancerPolicyRulesInput extends IaasParamBody {
        private String loadBalancerPolicy;

        @JsonProperty(value = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @JsonProperty(value = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private List<LoadBalancerPolicyRuleModel> rules;

        @JsonProperty(value = "rules")
        public void setRules(List<LoadBalancerPolicyRuleModel> rules) {
            this.rules = rules;
        }

        @JsonProperty(value = "rules")
        public List<LoadBalancerPolicyRuleModel> getRules() {
            return this.rules;
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
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicyRules;

        @JsonProperty(value = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @JsonProperty(value = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
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
      * @return ApplyLoadBalancerPolicyOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/apply_loadbalancer_policy.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplyLoadBalancerPolicyOutput applyLoadBalancerPolicy(ApplyLoadBalancerPolicyInput input) throws QCException {
        if (input == null) {
            input = new ApplyLoadBalancerPolicyInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyLoadBalancerPolicy");
        context.put("APIName", "ApplyLoadBalancerPolicy");
        context.put("ServiceName", "ApplyLoadBalancerPolicy");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyLoadBalancerPolicy");

        input.setAction("ApplyLoadBalancerPolicy");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplyLoadBalancerPolicyOutput.class);
        if(backModel != null){
            return (ApplyLoadBalancerPolicyOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/apply_loadbalancer_policy.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applyLoadBalancerPolicy(ApplyLoadBalancerPolicyInput input, ResponseCallBack<ApplyLoadBalancerPolicyOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplyLoadBalancerPolicyInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyLoadBalancerPolicy");
        context.put("APIName", "ApplyLoadBalancerPolicy");
        context.put("ServiceName", "ApplyLoadBalancerPolicy");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyLoadBalancerPolicy");

        input.setAction("ApplyLoadBalancerPolicy");
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

    public static class ApplyLoadBalancerPolicyInput extends IaasParamBody {
        // Required
        private String loadBalancerPolicy;

        @JsonProperty(value = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @JsonProperty(value = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancerPolicy())) {
                throw new QCException("LoadBalancerPolicy is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplyLoadBalancerPolicyOutput extends OutputModel {
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
      * @return AssociateEIPsToLoadBalancerOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/associate_eips_to_loadbalancer.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AssociateEIPsToLoadBalancerOutput associateEIPsToLoadBalancer(AssociateEIPsToLoadBalancerInput input) throws QCException {
        if (input == null) {
            input = new AssociateEIPsToLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEipsToLoadBalancer");
        context.put("APIName", "AssociateEipsToLoadBalancer");
        context.put("ServiceName", "AssociateEipsToLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEipsToLoadBalancer");

        input.setAction("AssociateEipsToLoadBalancer");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AssociateEIPsToLoadBalancerOutput.class);
        if(backModel != null){
            return (AssociateEIPsToLoadBalancerOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/associate_eips_to_loadbalancer.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void associateEIPsToLoadBalancer(AssociateEIPsToLoadBalancerInput input, ResponseCallBack<AssociateEIPsToLoadBalancerOutput> callback) throws QCException {
        if (input == null) {
            input = new AssociateEIPsToLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEIPsToLoadBalancer");
        context.put("APIName", "AssociateEIPsToLoadBalancer");
        context.put("ServiceName", "AssociateEipsToLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEipsToLoadBalancer");

        input.setAction("AssociateEIPsToLoadBalancer");
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

    public static class AssociateEIPsToLoadBalancerInput extends IaasParamBody {
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

        // Required
        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancer())) {
                throw new QCException("LoadBalancer is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssociateEIPsToLoadBalancerOutput extends OutputModel {
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
      * @return CreateLoadBalancerOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/create_loadbalancer.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateLoadBalancerOutput createLoadBalancer(CreateLoadBalancerInput input) throws QCException {
        if (input == null) {
            input = new CreateLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateLoadBalancer");
        context.put("APIName", "CreateLoadBalancer");
        context.put("ServiceName", "CreateLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateLoadBalancer");

        input.setAction("CreateLoadBalancer");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateLoadBalancerOutput.class);
        if(backModel != null){
            return (CreateLoadBalancerOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/create_loadbalancer.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createLoadBalancer(CreateLoadBalancerInput input, ResponseCallBack<CreateLoadBalancerOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateLoadBalancer");
        context.put("APIName", "CreateLoadBalancer");
        context.put("ServiceName", "CreateLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateLoadBalancer");

        input.setAction("CreateLoadBalancer");
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

    public static class CreateLoadBalancerInput extends IaasParamBody {
    	// ClusterMode's available values: 0, 1
        private Integer clusterMode;

        @JsonProperty(value = "cluster_mode")
        public void setClusterMode(Integer clusterMode) {
            this.clusterMode = clusterMode;
        }

        @JsonProperty(value = "cluster_mode")
        public Integer getClusterMode() {
            return this.clusterMode;
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

        private Integer hTTPHeaderSize;

        @JsonProperty(value = "http_header_size")
        public void setHTTPHeaderSize(Integer hTTPHeaderSize) {
            this.hTTPHeaderSize = hTTPHeaderSize;
        }

        @JsonProperty(value = "http_header_size")
        public Integer getHTTPHeaderSize() {
            return this.hTTPHeaderSize;
        }

        private String loadBalancerName;

        @JsonProperty(value = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @JsonProperty(value = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

    	// LoadBalancerType's available values: 0, 1, 2, 3, 4, 5
        private Integer loadBalancerType;

        @JsonProperty(value = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @JsonProperty(value = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
        }

    	// Mode's available values: 0, 1
        private Integer mode;

        @JsonProperty(value = "mode")
        public void setMode(Integer mode) {
            this.mode = mode;
        }

        @JsonProperty(value = "mode")
        public Integer getMode() {
            return this.mode;
        }

        private Integer nodeCount;

        @JsonProperty(value = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @JsonProperty(value = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
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

        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private String vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(String vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
        public String getVxNet() {
            return this.vxNet;
        }

        public String validateParam() throws QCException {
            String[]clusterModeValidValues = {"0", "1"};
            boolean clusterModeIsValid = false;
            for (String v : clusterModeValidValues) {
                if (v.equals(this.getClusterMode()+"")) {
                    clusterModeIsValid = true;
                }
                Boolean clusterModeIsRequired = Boolean.FALSE;
                if (clusterModeIsRequired.equals(Boolean.FALSE) && this.getClusterMode()==null) {
                    clusterModeIsValid = true;
                }
            }

            if (!clusterModeIsValid) {
                throw new QCException("ClusterMode value " + this.getClusterMode() + "is invalid");
            }
            String[]loadBalancerTypeValidValues = {"0", "1", "2", "3", "4", "5"};
            boolean loadBalancerTypeIsValid = false;
            for (String v : loadBalancerTypeValidValues) {
                if (v.equals(this.getLoadBalancerType()+"")) {
                    loadBalancerTypeIsValid = true;
                }
                Boolean loadBalancerTypeIsRequired = Boolean.FALSE;
                if (loadBalancerTypeIsRequired.equals(Boolean.FALSE) && this.getLoadBalancerType()==null) {
                    loadBalancerTypeIsValid = true;
                }
            }

            if (!loadBalancerTypeIsValid) {
                throw new QCException("LoadBalancerType value " + this.getLoadBalancerType() + "is invalid");
            }
            String[]modeValidValues = {"0", "1"};
            boolean modeIsValid = false;
            for (String v : modeValidValues) {
                if (v.equals(this.getMode()+"")) {
                    modeIsValid = true;
                }
                Boolean modeIsRequired = Boolean.FALSE;
                if (modeIsRequired.equals(Boolean.FALSE) && this.getMode()==null) {
                    modeIsValid = true;
                }
            }

            if (!modeIsValid) {
                throw new QCException("Mode value " + this.getMode() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateLoadBalancerOutput extends OutputModel {
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

        private String loadBalancerID;

        @JsonProperty(value = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @JsonProperty(value = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
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
      * @return CreateLoadBalancerPolicyOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/create_loadbalancer_policy.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateLoadBalancerPolicyOutput createLoadBalancerPolicy(CreateLoadBalancerPolicyInput input) throws QCException {
        if (input == null) {
            input = new CreateLoadBalancerPolicyInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateLoadBalancerPolicy");
        context.put("APIName", "CreateLoadBalancerPolicy");
        context.put("ServiceName", "CreateLoadBalancerPolicy");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateLoadBalancerPolicy");

        input.setAction("CreateLoadBalancerPolicy");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateLoadBalancerPolicyOutput.class);
        if(backModel != null){
            return (CreateLoadBalancerPolicyOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/create_loadbalancer_policy.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createLoadBalancerPolicy(CreateLoadBalancerPolicyInput input, ResponseCallBack<CreateLoadBalancerPolicyOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateLoadBalancerPolicyInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateLoadBalancerPolicy");
        context.put("APIName", "CreateLoadBalancerPolicy");
        context.put("ServiceName", "CreateLoadBalancerPolicy");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateLoadBalancerPolicy");

        input.setAction("CreateLoadBalancerPolicy");
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

    public static class CreateLoadBalancerPolicyInput extends IaasParamBody {
        // Required
        private String loadBalancerPolicyName;

        @JsonProperty(value = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @JsonProperty(value = "loadbalancer_policy_name")
        public String getLoadBalancerPolicyName() {
            return this.loadBalancerPolicyName;
        }

    	// Operator's available values: or, and
        private String operator;

        @JsonProperty(value = "operator")
        public void setOperator(String operator) {
            this.operator = operator;
        }

        @JsonProperty(value = "operator")
        public String getOperator() {
            return this.operator;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancerPolicyName())) {
                throw new QCException("LoadBalancerPolicyName is required");
            }
            String[] operatorValidValues = {
                "or", "and"
            };

            boolean operatorIsValid = false;
            for (String v : operatorValidValues) {
                if (v.equals(this.getOperator())) {
                    operatorIsValid = true;
                }
                Boolean operatorIsRequired = Boolean.FALSE;
                if (operatorIsRequired.equals(Boolean.FALSE) && this.getOperator() == null) {
                    operatorIsValid = true;
                }
            }

            if (!operatorIsValid) {
                throw new QCException("Operator value " + this.getOperator() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateLoadBalancerPolicyOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyID;

        @JsonProperty(value = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @JsonProperty(value = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
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
      * @return CreateServerCertificateOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/create_server_certificate.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateServerCertificateOutput createServerCertificate(CreateServerCertificateInput input) throws QCException {
        if (input == null) {
            input = new CreateServerCertificateInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateServerCertificate");
        context.put("APIName", "CreateServerCertificate");
        context.put("ServiceName", "CreateServerCertificate");
        context.put("RequestMethod", "POST");
        context.put("RequestURI", "/iaas/CreateServerCertificate");

        input.setAction("CreateServerCertificate");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateServerCertificateOutput.class);
        if(backModel != null){
            return (CreateServerCertificateOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/create_server_certificate.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createServerCertificate(CreateServerCertificateInput input, ResponseCallBack<CreateServerCertificateOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateServerCertificateInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateServerCertificate");
        context.put("APIName", "CreateServerCertificate");
        context.put("ServiceName", "CreateServerCertificate");
        context.put("RequestMethod", "POST");
        context.put("RequestURI", "/iaas/CreateServerCertificate");

        input.setAction("CreateServerCertificate");
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

    public static class CreateServerCertificateInput extends IaasParamBody {
        // Required
        private String certificateContent;

        @JsonProperty(value = "certificate_content")
        public void setCertificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
        }

        @JsonProperty(value = "certificate_content")
        public String getCertificateContent() {
            return this.certificateContent;
        }

        // Required
        private String privateKey;

        @JsonProperty(value = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @JsonProperty(value = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
        }

        private String serverCertificateName;

        @JsonProperty(value = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @JsonProperty(value = "server_certificate_name")
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCertificateContent())) {
                throw new QCException("CertificateContent is required");
            }
            if (QCStringUtil.isEmpty(this.getPrivateKey())) {
                throw new QCException("PrivateKey is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateServerCertificateOutput extends OutputModel {
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

        private String serverCertificateID;

        @JsonProperty(value = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @JsonProperty(value = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteLoadBalancerBackendsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_backends.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteLoadBalancerBackendsOutput deleteLoadBalancerBackends(DeleteLoadBalancerBackendsInput input) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerBackends");
        context.put("APIName", "DeleteLoadBalancerBackends");
        context.put("ServiceName", "DeleteLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerBackends");

        input.setAction("DeleteLoadBalancerBackends");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteLoadBalancerBackendsOutput.class);
        if(backModel != null){
            return (DeleteLoadBalancerBackendsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_backends.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteLoadBalancerBackends(DeleteLoadBalancerBackendsInput input, ResponseCallBack<DeleteLoadBalancerBackendsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerBackends");
        context.put("APIName", "DeleteLoadBalancerBackends");
        context.put("ServiceName", "DeleteLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerBackends");

        input.setAction("DeleteLoadBalancerBackends");
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

    public static class DeleteLoadBalancerBackendsInput extends IaasParamBody {
        // Required
        private List<String> loadBalancerBackends;

        @JsonProperty(value = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @JsonProperty(value = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerBackends;

        @JsonProperty(value = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @JsonProperty(value = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
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
      * @return DeleteLoadBalancerListenersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_listeners.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteLoadBalancerListenersOutput deleteLoadBalancerListeners(DeleteLoadBalancerListenersInput input) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerListeners");
        context.put("APIName", "DeleteLoadBalancerListeners");
        context.put("ServiceName", "DeleteLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerListeners");

        input.setAction("DeleteLoadBalancerListeners");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteLoadBalancerListenersOutput.class);
        if(backModel != null){
            return (DeleteLoadBalancerListenersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_listeners.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteLoadBalancerListeners(DeleteLoadBalancerListenersInput input, ResponseCallBack<DeleteLoadBalancerListenersOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerListeners");
        context.put("APIName", "DeleteLoadBalancerListeners");
        context.put("ServiceName", "DeleteLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerListeners");

        input.setAction("DeleteLoadBalancerListeners");
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

    public static class DeleteLoadBalancerListenersInput extends IaasParamBody {
        // Required
        private List<String> loadBalancerListeners;

        @JsonProperty(value = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @JsonProperty(value = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerListeners;

        @JsonProperty(value = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @JsonProperty(value = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
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
      * @return DeleteLoadBalancerPoliciesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_policies.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteLoadBalancerPoliciesOutput deleteLoadBalancerPolicies(DeleteLoadBalancerPoliciesInput input) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerPoliciesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerPolicies");
        context.put("APIName", "DeleteLoadBalancerPolicies");
        context.put("ServiceName", "DeleteLoadBalancerPolicies");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerPolicies");

        input.setAction("DeleteLoadBalancerPolicies");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteLoadBalancerPoliciesOutput.class);
        if(backModel != null){
            return (DeleteLoadBalancerPoliciesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_policies.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteLoadBalancerPolicies(DeleteLoadBalancerPoliciesInput input, ResponseCallBack<DeleteLoadBalancerPoliciesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerPoliciesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerPolicies");
        context.put("APIName", "DeleteLoadBalancerPolicies");
        context.put("ServiceName", "DeleteLoadBalancerPolicies");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerPolicies");

        input.setAction("DeleteLoadBalancerPolicies");
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

    public static class DeleteLoadBalancerPoliciesInput extends IaasParamBody {
        // Required
        private List<String> loadBalancerPolicies;

        @JsonProperty(value = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @JsonProperty(value = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteLoadBalancerPoliciesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicies;

        @JsonProperty(value = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @JsonProperty(value = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
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
      * @return DeleteLoadBalancerPolicyRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_policy_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteLoadBalancerPolicyRulesOutput deleteLoadBalancerPolicyRules(DeleteLoadBalancerPolicyRulesInput input) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerPolicyRules");
        context.put("APIName", "DeleteLoadBalancerPolicyRules");
        context.put("ServiceName", "DeleteLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerPolicyRules");

        input.setAction("DeleteLoadBalancerPolicyRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteLoadBalancerPolicyRulesOutput.class);
        if(backModel != null){
            return (DeleteLoadBalancerPolicyRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancer_policy_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteLoadBalancerPolicyRules(DeleteLoadBalancerPolicyRulesInput input, ResponseCallBack<DeleteLoadBalancerPolicyRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancerPolicyRules");
        context.put("APIName", "DeleteLoadBalancerPolicyRules");
        context.put("ServiceName", "DeleteLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancerPolicyRules");

        input.setAction("DeleteLoadBalancerPolicyRules");
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

    public static class DeleteLoadBalancerPolicyRulesInput extends IaasParamBody {
        // Required
        private List<String> loadBalancerPolicyRules;

        @JsonProperty(value = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @JsonProperty(value = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicyRules;

        @JsonProperty(value = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @JsonProperty(value = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
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
      * @return DeleteLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteLoadBalancersOutput deleteLoadBalancers(DeleteLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancers");
        context.put("APIName", "DeleteLoadBalancers");
        context.put("ServiceName", "DeleteLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancers");

        input.setAction("DeleteLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteLoadBalancersOutput.class);
        if(backModel != null){
            return (DeleteLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteLoadBalancers(DeleteLoadBalancersInput input, ResponseCallBack<DeleteLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteLoadBalancers");
        context.put("APIName", "DeleteLoadBalancers");
        context.put("ServiceName", "DeleteLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteLoadBalancers");

        input.setAction("DeleteLoadBalancers");
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

    public static class DeleteLoadBalancersInput extends IaasParamBody {
        // Required
        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteLoadBalancersOutput extends OutputModel {
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

        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
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
      * @return DeleteServerCertificatesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/delete_server_certificates.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteServerCertificatesOutput deleteServerCertificates(DeleteServerCertificatesInput input) throws QCException {
        if (input == null) {
            input = new DeleteServerCertificatesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteServerCertificates");
        context.put("APIName", "DeleteServerCertificates");
        context.put("ServiceName", "DeleteServerCertificates");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteServerCertificates");

        input.setAction("DeleteServerCertificates");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteServerCertificatesOutput.class);
        if(backModel != null){
            return (DeleteServerCertificatesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/delete_server_certificates.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteServerCertificates(DeleteServerCertificatesInput input, ResponseCallBack<DeleteServerCertificatesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteServerCertificatesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteServerCertificates");
        context.put("APIName", "DeleteServerCertificates");
        context.put("ServiceName", "DeleteServerCertificates");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteServerCertificates");

        input.setAction("DeleteServerCertificates");
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

    public static class DeleteServerCertificatesInput extends IaasParamBody {
        // Required
        private List<String> serverCertificates;

        @JsonProperty(value = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @JsonProperty(value = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteServerCertificatesOutput extends OutputModel {
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

        private List<String> serverCertificates;

        @JsonProperty(value = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @JsonProperty(value = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeLoadBalancerBackendsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_backends.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeLoadBalancerBackendsOutput describeLoadBalancerBackends(DescribeLoadBalancerBackendsInput input) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerBackends");
        context.put("APIName", "DescribeLoadBalancerBackends");
        context.put("ServiceName", "DescribeLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerBackends");

        input.setAction("DescribeLoadBalancerBackends");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeLoadBalancerBackendsOutput.class);
        if(backModel != null){
            return (DescribeLoadBalancerBackendsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_backends.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeLoadBalancerBackends(DescribeLoadBalancerBackendsInput input, ResponseCallBack<DescribeLoadBalancerBackendsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerBackendsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerBackends");
        context.put("APIName", "DescribeLoadBalancerBackends");
        context.put("ServiceName", "DescribeLoadBalancerBackends");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerBackends");

        input.setAction("DescribeLoadBalancerBackends");
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

    public static class DescribeLoadBalancerBackendsInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private List<String> loadBalancerBackends;

        @JsonProperty(value = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @JsonProperty(value = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        private String loadBalancerListener;

        @JsonProperty(value = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @JsonProperty(value = "loadbalancer_listener")
        public String getLoadBalancerListener() {
            return this.loadBalancerListener;
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
    public static class DescribeLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerBackendModel> loadBalancerBackendSet;

        @JsonProperty(value = "loadbalancer_backend_set")
        public void setLoadBalancerBackendSet(List<LoadBalancerBackendModel> loadBalancerBackendSet) {
            this.loadBalancerBackendSet = loadBalancerBackendSet;
        }

        @JsonProperty(value = "loadbalancer_backend_set")
        public List<LoadBalancerBackendModel> getLoadBalancerBackendSet() {
            return this.loadBalancerBackendSet;
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
      * @return DescribeLoadBalancerListenersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_listeners.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeLoadBalancerListenersOutput describeLoadBalancerListeners(DescribeLoadBalancerListenersInput input) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerListeners");
        context.put("APIName", "DescribeLoadBalancerListeners");
        context.put("ServiceName", "DescribeLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerListeners");

        input.setAction("DescribeLoadBalancerListeners");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeLoadBalancerListenersOutput.class);
        if(backModel != null){
            return (DescribeLoadBalancerListenersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_listeners.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeLoadBalancerListeners(DescribeLoadBalancerListenersInput input, ResponseCallBack<DescribeLoadBalancerListenersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerListenersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerListeners");
        context.put("APIName", "DescribeLoadBalancerListeners");
        context.put("ServiceName", "DescribeLoadBalancerListeners");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerListeners");

        input.setAction("DescribeLoadBalancerListeners");
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

    public static class DescribeLoadBalancerListenersInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private List<String> loadBalancerListeners;

        @JsonProperty(value = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @JsonProperty(value = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
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
    public static class DescribeLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerListenerModel> loadBalancerListenerSet;

        @JsonProperty(value = "loadbalancer_listener_set")
        public void setLoadBalancerListenerSet(List<LoadBalancerListenerModel> loadBalancerListenerSet) {
            this.loadBalancerListenerSet = loadBalancerListenerSet;
        }

        @JsonProperty(value = "loadbalancer_listener_set")
        public List<LoadBalancerListenerModel> getLoadBalancerListenerSet() {
            return this.loadBalancerListenerSet;
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
      * @return DescribeLoadBalancerPoliciesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_policies.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeLoadBalancerPoliciesOutput describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesInput input) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerPoliciesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerPolicies");
        context.put("APIName", "DescribeLoadBalancerPolicies");
        context.put("ServiceName", "DescribeLoadBalancerPolicies");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerPolicies");

        input.setAction("DescribeLoadBalancerPolicies");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeLoadBalancerPoliciesOutput.class);
        if(backModel != null){
            return (DescribeLoadBalancerPoliciesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_policies.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesInput input, ResponseCallBack<DescribeLoadBalancerPoliciesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerPoliciesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerPolicies");
        context.put("APIName", "DescribeLoadBalancerPolicies");
        context.put("ServiceName", "DescribeLoadBalancerPolicies");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerPolicies");

        input.setAction("DescribeLoadBalancerPolicies");
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

    public static class DescribeLoadBalancerPoliciesInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private List<String> loadBalancerPolicies;

        @JsonProperty(value = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @JsonProperty(value = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
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
    public static class DescribeLoadBalancerPoliciesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerPolicyModel> loadBalancerPolicySet;

        @JsonProperty(value = "loadbalancer_policy_set")
        public void setLoadBalancerPolicySet(List<LoadBalancerPolicyModel> loadBalancerPolicySet) {
            this.loadBalancerPolicySet = loadBalancerPolicySet;
        }

        @JsonProperty(value = "loadbalancer_policy_set")
        public List<LoadBalancerPolicyModel> getLoadBalancerPolicySet() {
            return this.loadBalancerPolicySet;
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
      * @return DescribeLoadBalancerPolicyRulesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_policy_rules.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeLoadBalancerPolicyRulesOutput describeLoadBalancerPolicyRules(DescribeLoadBalancerPolicyRulesInput input) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerPolicyRules");
        context.put("APIName", "DescribeLoadBalancerPolicyRules");
        context.put("ServiceName", "DescribeLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerPolicyRules");

        input.setAction("DescribeLoadBalancerPolicyRules");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeLoadBalancerPolicyRulesOutput.class);
        if(backModel != null){
            return (DescribeLoadBalancerPolicyRulesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancer_policy_rules.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeLoadBalancerPolicyRules(DescribeLoadBalancerPolicyRulesInput input, ResponseCallBack<DescribeLoadBalancerPolicyRulesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancerPolicyRulesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancerPolicyRules");
        context.put("APIName", "DescribeLoadBalancerPolicyRules");
        context.put("ServiceName", "DescribeLoadBalancerPolicyRules");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancerPolicyRules");

        input.setAction("DescribeLoadBalancerPolicyRules");
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

    public static class DescribeLoadBalancerPolicyRulesInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancerPolicy;

        @JsonProperty(value = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @JsonProperty(value = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private List<String> loadBalancerPolicyRules;

        @JsonProperty(value = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @JsonProperty(value = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerPolicyRuleModel> loadBalancerPolicyRuleSet;

        @JsonProperty(value = "loadbalancer_policy_rule_set")
        public void setLoadBalancerPolicyRuleSet(List<LoadBalancerPolicyRuleModel> loadBalancerPolicyRuleSet) {
            this.loadBalancerPolicyRuleSet = loadBalancerPolicyRuleSet;
        }

        @JsonProperty(value = "loadbalancer_policy_rule_set")
        public List<LoadBalancerPolicyRuleModel> getLoadBalancerPolicyRuleSet() {
            return this.loadBalancerPolicyRuleSet;
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
      * @return DescribeLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeLoadBalancersOutput describeLoadBalancers(DescribeLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancers");
        context.put("APIName", "DescribeLoadBalancers");
        context.put("ServiceName", "DescribeLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancers");

        input.setAction("DescribeLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeLoadBalancersOutput.class);
        if(backModel != null){
            return (DescribeLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeLoadBalancers(DescribeLoadBalancersInput input, ResponseCallBack<DescribeLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeLoadBalancers");
        context.put("APIName", "DescribeLoadBalancers");
        context.put("ServiceName", "DescribeLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeLoadBalancers");

        input.setAction("DescribeLoadBalancers");
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

    public static class DescribeLoadBalancersInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
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
    public static class DescribeLoadBalancersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerModel> loadBalancerSet;

        @JsonProperty(value = "loadbalancer_set")
        public void setLoadBalancerSet(List<LoadBalancerModel> loadBalancerSet) {
            this.loadBalancerSet = loadBalancerSet;
        }

        @JsonProperty(value = "loadbalancer_set")
        public List<LoadBalancerModel> getLoadBalancerSet() {
            return this.loadBalancerSet;
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
      * @return DescribeServerCertificatesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/describe_server_certificates.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeServerCertificatesOutput describeServerCertificates(DescribeServerCertificatesInput input) throws QCException {
        if (input == null) {
            input = new DescribeServerCertificatesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeServerCertificates");
        context.put("APIName", "DescribeServerCertificates");
        context.put("ServiceName", "DescribeServerCertificates");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeServerCertificates");

        input.setAction("DescribeServerCertificates");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeServerCertificatesOutput.class);
        if(backModel != null){
            return (DescribeServerCertificatesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/describe_server_certificates.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeServerCertificates(DescribeServerCertificatesInput input, ResponseCallBack<DescribeServerCertificatesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeServerCertificatesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeServerCertificates");
        context.put("APIName", "DescribeServerCertificates");
        context.put("ServiceName", "DescribeServerCertificates");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeServerCertificates");

        input.setAction("DescribeServerCertificates");
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

    public static class DescribeServerCertificatesInput extends IaasParamBody {
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

        private List<String> serverCertificates;

        @JsonProperty(value = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @JsonProperty(value = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
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
    public static class DescribeServerCertificatesOutput extends OutputModel {
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

        private List<ServerCertificateModel> serverCertificateSet;

        @JsonProperty(value = "server_certificate_set")
        public void setServerCertificateSet(List<ServerCertificateModel> serverCertificateSet) {
            this.serverCertificateSet = serverCertificateSet;
        }

        @JsonProperty(value = "server_certificate_set")
        public List<ServerCertificateModel> getServerCertificateSet() {
            return this.serverCertificateSet;
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
      * @return DissociateEIPsFromLoadBalancerOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/dissociate_eips_from_loadbalancer.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DissociateEIPsFromLoadBalancerOutput dissociateEIPsFromLoadBalancer(DissociateEIPsFromLoadBalancerInput input) throws QCException {
        if (input == null) {
            input = new DissociateEIPsFromLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEipsFromLoadBalancer");
        context.put("APIName", "DissociateEipsFromLoadBalancer");
        context.put("ServiceName", "DissociateEipsFromLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEipsFromLoadBalancer");

        input.setAction("DissociateEipsFromLoadBalancer");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DissociateEIPsFromLoadBalancerOutput.class);
        if(backModel != null){
            return (DissociateEIPsFromLoadBalancerOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/dissociate_eips_from_loadbalancer.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void dissociateEIPsFromLoadBalancer(DissociateEIPsFromLoadBalancerInput input, ResponseCallBack<DissociateEIPsFromLoadBalancerOutput> callback) throws QCException {
        if (input == null) {
            input = new DissociateEIPsFromLoadBalancerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEIPsFromLoadBalancer");
        context.put("APIName", "DissociateEIPsFromLoadBalancer");
        context.put("ServiceName", "DissociateEipsFromLoadBalancer");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEipsFromLoadBalancer");

        input.setAction("DissociateEIPsFromLoadBalancer");
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

    public static class DissociateEIPsFromLoadBalancerInput extends IaasParamBody {
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

        // Required
        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancer())) {
                throw new QCException("LoadBalancer is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DissociateEIPsFromLoadBalancerOutput extends OutputModel {
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
      * @return GetLoadBalancerMonitorOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/monitor/get_loadbalancer_monitor.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetLoadBalancerMonitorOutput getLoadBalancerMonitor(GetLoadBalancerMonitorInput input) throws QCException {
        if (input == null) {
            input = new GetLoadBalancerMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetLoadBalancerMonitor");
        context.put("APIName", "GetLoadBalancerMonitor");
        context.put("ServiceName", "GetLoadBalancerMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetLoadBalancerMonitor");

        input.setAction("GetLoadBalancerMonitor");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetLoadBalancerMonitorOutput.class);
        if(backModel != null){
            return (GetLoadBalancerMonitorOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/monitor/get_loadbalancer_monitor.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getLoadBalancerMonitor(GetLoadBalancerMonitorInput input, ResponseCallBack<GetLoadBalancerMonitorOutput> callback) throws QCException {
        if (input == null) {
            input = new GetLoadBalancerMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetLoadBalancerMonitor");
        context.put("APIName", "GetLoadBalancerMonitor");
        context.put("ServiceName", "GetLoadBalancerMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetLoadBalancerMonitor");

        input.setAction("GetLoadBalancerMonitor");
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

    public static class GetLoadBalancerMonitorInput extends IaasParamBody {
        // Required
        private String endTime;

        @JsonProperty(value = "end_time")
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @JsonProperty(value = "end_time")
        public String getEndTime() {
            return this.endTime;
        }

        // Required
        private List<String> meters;

        @JsonProperty(value = "meters")
        public void setMeters(List<String> meters) {
            this.meters = meters;
        }

        @JsonProperty(value = "meters")
        public List<String> getMeters() {
            return this.meters;
        }

        // Required
        private String resource;

        @JsonProperty(value = "resource")
        public void setResource(String resource) {
            this.resource = resource;
        }

        @JsonProperty(value = "resource")
        public String getResource() {
            return this.resource;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }

        // Required
        private String startTime;

        @JsonProperty(value = "start_time")
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @JsonProperty(value = "start_time")
        public String getStartTime() {
            return this.startTime;
        }

    	// Step's available values: 5m, 15m, 2h, 1d
        // Required
        private String step;

        @JsonProperty(value = "step")
        public void setStep(String step) {
            this.step = step;
        }

        @JsonProperty(value = "step")
        public String getStep() {
            return this.step;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getResource())) {
                throw new QCException("Resource is required");
            }
            if (QCStringUtil.isEmpty(this.getStep())) {
                throw new QCException("Step is required");
            }
            String[] stepValidValues = {
                "5m", "15m", "2h", "1d"
            };

            boolean stepIsValid = false;
            for (String v : stepValidValues) {
                if (v.equals(this.getStep())) {
                    stepIsValid = true;
                }
                Boolean stepIsRequired = Boolean.TRUE;
                if (stepIsRequired.equals(Boolean.FALSE) && this.getStep() == null) {
                    stepIsValid = true;
                }
            }

            if (!stepIsValid) {
                throw new QCException("Step value " + this.getStep() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetLoadBalancerMonitorOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<MeterModel> meterSet;

        @JsonProperty(value = "meter_set")
        public void setMeterSet(List<MeterModel> meterSet) {
            this.meterSet = meterSet;
        }

        @JsonProperty(value = "meter_set")
        public List<MeterModel> getMeterSet() {
            return this.meterSet;
        }

        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
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
      * @return ModifyLoadBalancerAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyLoadBalancerAttributesOutput modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerAttributes");
        context.put("APIName", "ModifyLoadBalancerAttributes");
        context.put("ServiceName", "ModifyLoadBalancerAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerAttributes");

        input.setAction("ModifyLoadBalancerAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyLoadBalancerAttributesOutput.class);
        if(backModel != null){
            return (ModifyLoadBalancerAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesInput input, ResponseCallBack<ModifyLoadBalancerAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerAttributes");
        context.put("APIName", "ModifyLoadBalancerAttributes");
        context.put("ServiceName", "ModifyLoadBalancerAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerAttributes");

        input.setAction("ModifyLoadBalancerAttributes");
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

    public static class ModifyLoadBalancerAttributesInput extends IaasParamBody {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        private Integer hTTPHeaderSize;

        @JsonProperty(value = "http_header_size")
        public void setHTTPHeaderSize(Integer hTTPHeaderSize) {
            this.hTTPHeaderSize = hTTPHeaderSize;
        }

        @JsonProperty(value = "http_header_size")
        public Integer getHTTPHeaderSize() {
            return this.hTTPHeaderSize;
        }

        // Required
        private String loadBalancer;

        @JsonProperty(value = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @JsonProperty(value = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private String loadBalancerName;

        @JsonProperty(value = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @JsonProperty(value = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        private Integer nodeCount;

        @JsonProperty(value = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @JsonProperty(value = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancer())) {
                throw new QCException("LoadBalancer is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyLoadBalancerAttributesOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return ModifyLoadBalancerBackendAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_backend_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyLoadBalancerBackendAttributesOutput modifyLoadBalancerBackendAttributes(ModifyLoadBalancerBackendAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerBackendAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerBackendAttributes");
        context.put("APIName", "ModifyLoadBalancerBackendAttributes");
        context.put("ServiceName", "ModifyLoadBalancerBackendAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerBackendAttributes");

        input.setAction("ModifyLoadBalancerBackendAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyLoadBalancerBackendAttributesOutput.class);
        if(backModel != null){
            return (ModifyLoadBalancerBackendAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_backend_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyLoadBalancerBackendAttributes(ModifyLoadBalancerBackendAttributesInput input, ResponseCallBack<ModifyLoadBalancerBackendAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerBackendAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerBackendAttributes");
        context.put("APIName", "ModifyLoadBalancerBackendAttributes");
        context.put("ServiceName", "ModifyLoadBalancerBackendAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerBackendAttributes");

        input.setAction("ModifyLoadBalancerBackendAttributes");
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

    public static class ModifyLoadBalancerBackendAttributesInput extends IaasParamBody {
    	// Disabled's available values: 0, 1
        private Integer disabled;

        @JsonProperty(value = "disabled")
        public void setDisabled(Integer disabled) {
            this.disabled = disabled;
        }

        @JsonProperty(value = "disabled")
        public Integer getDisabled() {
            return this.disabled;
        }

        private String loadBalancerBackend;

        @JsonProperty(value = "loadbalancer_backend")
        public void setLoadBalancerBackend(String loadBalancerBackend) {
            this.loadBalancerBackend = loadBalancerBackend;
        }

        @JsonProperty(value = "loadbalancer_backend")
        public String getLoadBalancerBackend() {
            return this.loadBalancerBackend;
        }

        private String loadBalancerBackendName;

        @JsonProperty(value = "loadbalancer_backend_name")
        public void setLoadBalancerBackendName(String loadBalancerBackendName) {
            this.loadBalancerBackendName = loadBalancerBackendName;
        }

        @JsonProperty(value = "loadbalancer_backend_name")
        public String getLoadBalancerBackendName() {
            return this.loadBalancerBackendName;
        }

        private String loadBalancerPolicyID;

        @JsonProperty(value = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @JsonProperty(value = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer port;

        @JsonProperty(value = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @JsonProperty(value = "port")
        public Integer getPort() {
            return this.port;
        }

        private Integer weight;

        @JsonProperty(value = "weight")
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @JsonProperty(value = "weight")
        public Integer getWeight() {
            return this.weight;
        }

        public String validateParam() throws QCException {
            String[]disabledValidValues = {"0", "1"};
            boolean disabledIsValid = false;
            for (String v : disabledValidValues) {
                if (v.equals(this.getDisabled()+"")) {
                    disabledIsValid = true;
                }
                Boolean disabledIsRequired = Boolean.FALSE;
                if (disabledIsRequired.equals(Boolean.FALSE) && this.getDisabled()==null) {
                    disabledIsValid = true;
                }
            }

            if (!disabledIsValid) {
                throw new QCException("Disabled value " + this.getDisabled() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyLoadBalancerBackendAttributesOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return ModifyLoadBalancerListenerAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_listener_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyLoadBalancerListenerAttributesOutput modifyLoadBalancerListenerAttributes(ModifyLoadBalancerListenerAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerListenerAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerListenerAttributes");
        context.put("APIName", "ModifyLoadBalancerListenerAttributes");
        context.put("ServiceName", "ModifyLoadBalancerListenerAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerListenerAttributes");

        input.setAction("ModifyLoadBalancerListenerAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyLoadBalancerListenerAttributesOutput.class);
        if(backModel != null){
            return (ModifyLoadBalancerListenerAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_listener_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyLoadBalancerListenerAttributes(ModifyLoadBalancerListenerAttributesInput input, ResponseCallBack<ModifyLoadBalancerListenerAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerListenerAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerListenerAttributes");
        context.put("APIName", "ModifyLoadBalancerListenerAttributes");
        context.put("ServiceName", "ModifyLoadBalancerListenerAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerListenerAttributes");

        input.setAction("ModifyLoadBalancerListenerAttributes");
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

    public static class ModifyLoadBalancerListenerAttributesInput extends IaasParamBody {
        private String balanceMode;

        @JsonProperty(value = "balance_mode")
        public void setBalanceMode(String balanceMode) {
            this.balanceMode = balanceMode;
        }

        @JsonProperty(value = "balance_mode")
        public String getBalanceMode() {
            return this.balanceMode;
        }

        private Integer forwardfor;

        @JsonProperty(value = "forwardfor")
        public void setForwardfor(Integer forwardfor) {
            this.forwardfor = forwardfor;
        }

        @JsonProperty(value = "forwardfor")
        public Integer getForwardfor() {
            return this.forwardfor;
        }

        private String healthyCheckMethod;

        @JsonProperty(value = "healthy_check_method")
        public void setHealthyCheckMethod(String healthyCheckMethod) {
            this.healthyCheckMethod = healthyCheckMethod;
        }

        @JsonProperty(value = "healthy_check_method")
        public String getHealthyCheckMethod() {
            return this.healthyCheckMethod;
        }

        private String healthyCheckOption;

        @JsonProperty(value = "healthy_check_option")
        public void setHealthyCheckOption(String healthyCheckOption) {
            this.healthyCheckOption = healthyCheckOption;
        }

        @JsonProperty(value = "healthy_check_option")
        public String getHealthyCheckOption() {
            return this.healthyCheckOption;
        }

        private Integer listenerOption;

        @JsonProperty(value = "listener_option")
        public void setListenerOption(Integer listenerOption) {
            this.listenerOption = listenerOption;
        }

        @JsonProperty(value = "listener_option")
        public Integer getListenerOption() {
            return this.listenerOption;
        }

        // Required
        private String loadBalancerListener;

        @JsonProperty(value = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @JsonProperty(value = "loadbalancer_listener")
        public String getLoadBalancerListener() {
            return this.loadBalancerListener;
        }

        private String loadBalancerListenerName;

        @JsonProperty(value = "loadbalancer_listener_name")
        public void setLoadBalancerListenerName(String loadBalancerListenerName) {
            this.loadBalancerListenerName = loadBalancerListenerName;
        }

        @JsonProperty(value = "loadbalancer_listener_name")
        public String getLoadBalancerListenerName() {
            return this.loadBalancerListenerName;
        }

        private List<String> serverCertificateID;

        @JsonProperty(value = "server_certificate_id")
        public void setServerCertificateID(List<String> serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @JsonProperty(value = "server_certificate_id")
        public List<String> getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String sessionSticky;

        @JsonProperty(value = "session_sticky")
        public void setSessionSticky(String sessionSticky) {
            this.sessionSticky = sessionSticky;
        }

        @JsonProperty(value = "session_sticky")
        public String getSessionSticky() {
            return this.sessionSticky;
        }

        private Integer timeout;

        @JsonProperty(value = "timeout")
        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        @JsonProperty(value = "timeout")
        public Integer getTimeout() {
            return this.timeout;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancerListener())) {
                throw new QCException("LoadBalancerListener is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyLoadBalancerListenerAttributesOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return ModifyLoadBalancerPolicyAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyLoadBalancerPolicyAttributesOutput modifyLoadBalancerPolicyAttributes(ModifyLoadBalancerPolicyAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerPolicyAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerPolicyAttributes");
        context.put("APIName", "ModifyLoadBalancerPolicyAttributes");
        context.put("ServiceName", "ModifyLoadBalancerPolicyAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerPolicyAttributes");

        input.setAction("ModifyLoadBalancerPolicyAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyLoadBalancerPolicyAttributesOutput.class);
        if(backModel != null){
            return (ModifyLoadBalancerPolicyAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyLoadBalancerPolicyAttributes(ModifyLoadBalancerPolicyAttributesInput input, ResponseCallBack<ModifyLoadBalancerPolicyAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerPolicyAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerPolicyAttributes");
        context.put("APIName", "ModifyLoadBalancerPolicyAttributes");
        context.put("ServiceName", "ModifyLoadBalancerPolicyAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerPolicyAttributes");

        input.setAction("ModifyLoadBalancerPolicyAttributes");
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

    public static class ModifyLoadBalancerPolicyAttributesInput extends IaasParamBody {
        // Required
        private String loadBalancerPolicy;

        @JsonProperty(value = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @JsonProperty(value = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private String loadBalancerPolicyName;

        @JsonProperty(value = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @JsonProperty(value = "loadbalancer_policy_name")
        public String getLoadBalancerPolicyName() {
            return this.loadBalancerPolicyName;
        }

        private String operator;

        @JsonProperty(value = "operator")
        public void setOperator(String operator) {
            this.operator = operator;
        }

        @JsonProperty(value = "operator")
        public String getOperator() {
            return this.operator;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getLoadBalancerPolicy())) {
                throw new QCException("LoadBalancerPolicy is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyLoadBalancerPolicyAttributesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyID;

        @JsonProperty(value = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @JsonProperty(value = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
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
      * @return ModifyLoadBalancerPolicyRuleAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_rule_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyLoadBalancerPolicyRuleAttributesOutput modifyLoadBalancerPolicyRuleAttributes(ModifyLoadBalancerPolicyRuleAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerPolicyRuleAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("APIName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("ServiceName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerPolicyRuleAttributes");

        input.setAction("ModifyLoadBalancerPolicyRuleAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyLoadBalancerPolicyRuleAttributesOutput.class);
        if(backModel != null){
            return (ModifyLoadBalancerPolicyRuleAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_rule_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyLoadBalancerPolicyRuleAttributes(ModifyLoadBalancerPolicyRuleAttributesInput input, ResponseCallBack<ModifyLoadBalancerPolicyRuleAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyLoadBalancerPolicyRuleAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("APIName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("ServiceName", "ModifyLoadBalancerPolicyRuleAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyLoadBalancerPolicyRuleAttributes");

        input.setAction("ModifyLoadBalancerPolicyRuleAttributes");
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

    public static class ModifyLoadBalancerPolicyRuleAttributesInput extends IaasParamBody {
        // Required
        private String loadBalancerPolicyRule;

        @JsonProperty(value = "loadbalancer_policy_rule")
        public void setLoadBalancerPolicyRule(String loadBalancerPolicyRule) {
            this.loadBalancerPolicyRule = loadBalancerPolicyRule;
        }

        @JsonProperty(value = "loadbalancer_policy_rule")
        public String getLoadBalancerPolicyRule() {
            return this.loadBalancerPolicyRule;
        }

        private String loadBalancerPolicyRuleName;

        @JsonProperty(value = "loadbalancer_policy_rule_name")
        public void setLoadBalancerPolicyRuleName(String loadBalancerPolicyRuleName) {
            this.loadBalancerPolicyRuleName = loadBalancerPolicyRuleName;
        }

        @JsonProperty(value = "loadbalancer_policy_rule_name")
        public String getLoadBalancerPolicyRuleName() {
            return this.loadBalancerPolicyRuleName;
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
            if (QCStringUtil.isEmpty(this.getLoadBalancerPolicyRule())) {
                throw new QCException("LoadBalancerPolicyRule is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyLoadBalancerPolicyRuleAttributesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyRuleID;

        @JsonProperty(value = "loadbalancer_policy_rule_id")
        public void setLoadBalancerPolicyRuleID(String loadBalancerPolicyRuleID) {
            this.loadBalancerPolicyRuleID = loadBalancerPolicyRuleID;
        }

        @JsonProperty(value = "loadbalancer_policy_rule_id")
        public String getLoadBalancerPolicyRuleID() {
            return this.loadBalancerPolicyRuleID;
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
      * @return ModifyServerCertificateAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/modify_server_certificate_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyServerCertificateAttributesOutput modifyServerCertificateAttributes(ModifyServerCertificateAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyServerCertificateAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyServerCertificateAttributes");
        context.put("APIName", "ModifyServerCertificateAttributes");
        context.put("ServiceName", "ModifyServerCertificateAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyServerCertificateAttributes");

        input.setAction("ModifyServerCertificateAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyServerCertificateAttributesOutput.class);
        if(backModel != null){
            return (ModifyServerCertificateAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/modify_server_certificate_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyServerCertificateAttributes(ModifyServerCertificateAttributesInput input, ResponseCallBack<ModifyServerCertificateAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyServerCertificateAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyServerCertificateAttributes");
        context.put("APIName", "ModifyServerCertificateAttributes");
        context.put("ServiceName", "ModifyServerCertificateAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyServerCertificateAttributes");

        input.setAction("ModifyServerCertificateAttributes");
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

    public static class ModifyServerCertificateAttributesInput extends IaasParamBody {
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
        private String serverCertificate;

        @JsonProperty(value = "server_certificate")
        public void setServerCertificate(String serverCertificate) {
            this.serverCertificate = serverCertificate;
        }

        @JsonProperty(value = "server_certificate")
        public String getServerCertificate() {
            return this.serverCertificate;
        }

        private String serverCertificateName;

        @JsonProperty(value = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @JsonProperty(value = "server_certificate_name")
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getServerCertificate())) {
                throw new QCException("ServerCertificate is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyServerCertificateAttributesOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return ResizeLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/resize_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeLoadBalancersOutput resizeLoadBalancers(ResizeLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new ResizeLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeLoadBalancers");
        context.put("APIName", "ResizeLoadBalancers");
        context.put("ServiceName", "ResizeLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeLoadBalancers");

        input.setAction("ResizeLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeLoadBalancersOutput.class);
        if(backModel != null){
            return (ResizeLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/resize_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeLoadBalancers(ResizeLoadBalancersInput input, ResponseCallBack<ResizeLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeLoadBalancers");
        context.put("APIName", "ResizeLoadBalancers");
        context.put("ServiceName", "ResizeLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeLoadBalancers");

        input.setAction("ResizeLoadBalancers");
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

    public static class ResizeLoadBalancersInput extends IaasParamBody {
    	// LoadBalancerType's available values: 0, 1, 2, 3, 4, 5
        private Integer loadBalancerType;

        @JsonProperty(value = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @JsonProperty(value = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
        }

        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            String[]loadBalancerTypeValidValues = {"0", "1", "2", "3", "4", "5"};
            boolean loadBalancerTypeIsValid = false;
            for (String v : loadBalancerTypeValidValues) {
                if (v.equals(this.getLoadBalancerType()+"")) {
                    loadBalancerTypeIsValid = true;
                }
                Boolean loadBalancerTypeIsRequired = Boolean.FALSE;
                if (loadBalancerTypeIsRequired.equals(Boolean.FALSE) && this.getLoadBalancerType()==null) {
                    loadBalancerTypeIsValid = true;
                }
            }

            if (!loadBalancerTypeIsValid) {
                throw new QCException("LoadBalancerType value " + this.getLoadBalancerType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeLoadBalancersOutput extends OutputModel {
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
      * @return StartLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/start_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StartLoadBalancersOutput startLoadBalancers(StartLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new StartLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartLoadBalancers");
        context.put("APIName", "StartLoadBalancers");
        context.put("ServiceName", "StartLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartLoadBalancers");

        input.setAction("StartLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StartLoadBalancersOutput.class);
        if(backModel != null){
            return (StartLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/start_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void startLoadBalancers(StartLoadBalancersInput input, ResponseCallBack<StartLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new StartLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartLoadBalancers");
        context.put("APIName", "StartLoadBalancers");
        context.put("ServiceName", "StartLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartLoadBalancers");

        input.setAction("StartLoadBalancers");
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

    public static class StartLoadBalancersInput extends IaasParamBody {
        // Required
        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StartLoadBalancersOutput extends OutputModel {
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
      * @return StopLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/stop_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StopLoadBalancersOutput stopLoadBalancers(StopLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new StopLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopLoadBalancers");
        context.put("APIName", "StopLoadBalancers");
        context.put("ServiceName", "StopLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopLoadBalancers");

        input.setAction("StopLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StopLoadBalancersOutput.class);
        if(backModel != null){
            return (StopLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/stop_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void stopLoadBalancers(StopLoadBalancersInput input, ResponseCallBack<StopLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new StopLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopLoadBalancers");
        context.put("APIName", "StopLoadBalancers");
        context.put("ServiceName", "StopLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopLoadBalancers");

        input.setAction("StopLoadBalancers");
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

    public static class StopLoadBalancersInput extends IaasParamBody {
        // Required
        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StopLoadBalancersOutput extends OutputModel {
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
      * @return UpdateLoadBalancersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/lb/update_loadbalancers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateLoadBalancersOutput updateLoadBalancers(UpdateLoadBalancersInput input) throws QCException {
        if (input == null) {
            input = new UpdateLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateLoadBalancers");
        context.put("APIName", "UpdateLoadBalancers");
        context.put("ServiceName", "UpdateLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateLoadBalancers");

        input.setAction("UpdateLoadBalancers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateLoadBalancersOutput.class);
        if(backModel != null){
            return (UpdateLoadBalancersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/lb/update_loadbalancers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateLoadBalancers(UpdateLoadBalancersInput input, ResponseCallBack<UpdateLoadBalancersOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateLoadBalancersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateLoadBalancers");
        context.put("APIName", "UpdateLoadBalancers");
        context.put("ServiceName", "UpdateLoadBalancers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateLoadBalancers");

        input.setAction("UpdateLoadBalancers");
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

    public static class UpdateLoadBalancersInput extends IaasParamBody {
        // Required
        private List<String> loadBalancers;

        @JsonProperty(value = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @JsonProperty(value = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateLoadBalancersOutput extends OutputModel {
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



















