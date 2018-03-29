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

import com.qingcloud.sdk.config.EnvContext;
import com.qingcloud.sdk.constants.QCConstant;
import com.qingcloud.sdk.model.OutputModel;
import com.qingcloud.sdk.request.ResponseCallBack;
import com.qingcloud.sdk.request.ResourceRequestFactory;
import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.model.IaasParamBody;
import com.qingcloud.sdk.service.Types.*;
import com.qingcloud.sdk.annotation.ParamAnnotation;
import com.qingcloud.sdk.utils.QCStringUtil;

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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_backends.html
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
        context.put("RequestURI", "/AddLoadBalancerBackends");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_backends.html
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
        context.put("RequestURI", "/AddLoadBalancerBackends");

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

        @ParamAnnotation(paramType = "query", paramName = "backends")
        public void setBackends(List<LoadBalancerBackendModel> backends) {
            this.backends = backends;
        }

        @ParamAnnotation(paramType = "query", paramName = "backends")
        public List<LoadBalancerBackendModel> getBackends() {
            return this.backends;
        }

        // Required
        private String loadBalancerListener;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
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

    public static class AddLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerBackends;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_listeners.html
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
        context.put("RequestURI", "/AddLoadBalancerListeners");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_listeners.html
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
        context.put("RequestURI", "/AddLoadBalancerListeners");

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

        @ParamAnnotation(paramType = "query", paramName = "listeners")
        public void setListeners(List<LoadBalancerListenerModel> listeners) {
            this.listeners = listeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "listeners")
        public List<LoadBalancerListenerModel> getListeners() {
            return this.listeners;
        }

        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
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

    public static class AddLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerListeners;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/AddLoadBalancerPolicyRules");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/add_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/AddLoadBalancerPolicyRules");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private List<LoadBalancerPolicyRuleModel> rules;

        @ParamAnnotation(paramType = "query", paramName = "rules")
        public void setRules(List<LoadBalancerPolicyRuleModel> rules) {
            this.rules = rules;
        }

        @ParamAnnotation(paramType = "query", paramName = "rules")
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

    public static class AddLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicyRules;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/apply_loadbalancer_policy.html
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
        context.put("RequestURI", "/ApplyLoadBalancerPolicy");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/apply_loadbalancer_policy.html
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
        context.put("RequestURI", "/ApplyLoadBalancerPolicy");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
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

    public static class ApplyLoadBalancerPolicyOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/associate_eips_to_loadbalancer.html
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
        context.put("RequestURI", "/AssociateEipsToLoadBalancer");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/associate_eips_to_loadbalancer.html
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
        context.put("RequestURI", "/AssociateEipsToLoadBalancer");

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

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        // Required
        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
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

    public static class AssociateEIPsToLoadBalancerOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/create_loadbalancer.html
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
        context.put("RequestURI", "/CreateLoadBalancer");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/create_loadbalancer.html
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
        context.put("RequestURI", "/CreateLoadBalancer");

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
        private List<String> eIPs;

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        private Integer httpHeaderSize;

        @ParamAnnotation(paramType = "query", paramName = "http_header_size")
        public void setHttpHeaderSize(Integer httpHeaderSize) {
            this.httpHeaderSize = httpHeaderSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "http_header_size")
        public Integer getHttpHeaderSize() {
            return this.httpHeaderSize;
        }

        private String loadBalancerName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

    	// LoadBalancerType's available values: 0, 1, 2, 3, 4, 5
        private Integer loadBalancerType;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
        }

        private Integer nodeCount;

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String securityGroup;

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private String vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(String vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public String getVxNet() {
            return this.vxNet;
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

    public static class CreateLoadBalancerOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private String loadBalancerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/create_loadbalancer_policy.html
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
        context.put("RequestURI", "/CreateLoadBalancerPolicy");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/create_loadbalancer_policy.html
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
        context.put("RequestURI", "/CreateLoadBalancerPolicy");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public String getLoadBalancerPolicyName() {
            return this.loadBalancerPolicyName;
        }

    	// Operator's available values: or, and
        private String operator;

        @ParamAnnotation(paramType = "query", paramName = "operator")
        public void setOperator(String operator) {
            this.operator = operator;
        }

        @ParamAnnotation(paramType = "query", paramName = "operator")
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

    public static class CreateLoadBalancerPolicyOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/create_server_certificate.html
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
        context.put("RequestURI", "/CreateServerCertificate");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/create_server_certificate.html
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
        context.put("RequestURI", "/CreateServerCertificate");

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

        @ParamAnnotation(paramType = "query", paramName = "certificate_content")
        public void setCertificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
        }

        @ParamAnnotation(paramType = "query", paramName = "certificate_content")
        public String getCertificateContent() {
            return this.certificateContent;
        }

        // Required
        private String privateKey;

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
        }

        private String serverCertificateName;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
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

    public static class CreateServerCertificateOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private String serverCertificateID;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_backends.html
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
        context.put("RequestURI", "/DeleteLoadBalancerBackends");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_backends.html
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
        context.put("RequestURI", "/DeleteLoadBalancerBackends");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerBackends;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_listeners.html
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
        context.put("RequestURI", "/DeleteLoadBalancerListeners");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_listeners.html
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
        context.put("RequestURI", "/DeleteLoadBalancerListeners");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerListeners;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_policies.html
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
        context.put("RequestURI", "/DeleteLoadBalancerPolicies");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_policies.html
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
        context.put("RequestURI", "/DeleteLoadBalancerPolicies");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteLoadBalancerPoliciesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicies;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/DeleteLoadBalancerPolicyRules");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/DeleteLoadBalancerPolicyRules");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> loadBalancerPolicyRules;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancers.html
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
        context.put("RequestURI", "/DeleteLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_loadbalancers.html
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
        context.put("RequestURI", "/DeleteLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private List<String> loadBalancers;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/delete_server_certificates.html
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
        context.put("RequestURI", "/DeleteServerCertificates");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/delete_server_certificates.html
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
        context.put("RequestURI", "/DeleteServerCertificates");

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

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteServerCertificatesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private List<String> serverCertificates;

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_backends.html
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
        context.put("RequestURI", "/DescribeLoadBalancerBackends");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_backends.html
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
        context.put("RequestURI", "/DescribeLoadBalancerBackends");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private List<String> loadBalancerBackends;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public void setLoadBalancerBackends(List<String> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backends")
        public List<String> getLoadBalancerBackends() {
            return this.loadBalancerBackends;
        }

        private String loadBalancerListener;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
        public String getLoadBalancerListener() {
            return this.loadBalancerListener;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeLoadBalancerBackendsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerBackendModel> loadBalancerBackendSet;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_set")
        public void setLoadBalancerBackendSet(List<LoadBalancerBackendModel> loadBalancerBackendSet) {
            this.loadBalancerBackendSet = loadBalancerBackendSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_set")
        public List<LoadBalancerBackendModel> getLoadBalancerBackendSet() {
            return this.loadBalancerBackendSet;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_listeners.html
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
        context.put("RequestURI", "/DescribeLoadBalancerListeners");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_listeners.html
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
        context.put("RequestURI", "/DescribeLoadBalancerListeners");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private List<String> loadBalancerListeners;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public void setLoadBalancerListeners(List<String> loadBalancerListeners) {
            this.loadBalancerListeners = loadBalancerListeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listeners")
        public List<String> getLoadBalancerListeners() {
            return this.loadBalancerListeners;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeLoadBalancerListenersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerListenerModel> loadBalancerListenerSet;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_set")
        public void setLoadBalancerListenerSet(List<LoadBalancerListenerModel> loadBalancerListenerSet) {
            this.loadBalancerListenerSet = loadBalancerListenerSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_set")
        public List<LoadBalancerListenerModel> getLoadBalancerListenerSet() {
            return this.loadBalancerListenerSet;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private Integer totalCount;

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_policies.html
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
        context.put("RequestURI", "/DescribeLoadBalancerPolicies");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_policies.html
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
        context.put("RequestURI", "/DescribeLoadBalancerPolicies");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private List<String> loadBalancerPolicies;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public void setLoadBalancerPolicies(List<String> loadBalancerPolicies) {
            this.loadBalancerPolicies = loadBalancerPolicies;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policies")
        public List<String> getLoadBalancerPolicies() {
            return this.loadBalancerPolicies;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeLoadBalancerPoliciesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerPolicyModel> loadBalancerPolicySet;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_set")
        public void setLoadBalancerPolicySet(List<LoadBalancerPolicyModel> loadBalancerPolicySet) {
            this.loadBalancerPolicySet = loadBalancerPolicySet;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_set")
        public List<LoadBalancerPolicyModel> getLoadBalancerPolicySet() {
            return this.loadBalancerPolicySet;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private Integer totalCount;

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/DescribeLoadBalancerPolicyRules");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancer_policy_rules.html
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
        context.put("RequestURI", "/DescribeLoadBalancerPolicyRules");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String loadBalancerPolicy;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private List<String> loadBalancerPolicyRules;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public void setLoadBalancerPolicyRules(List<String> loadBalancerPolicyRules) {
            this.loadBalancerPolicyRules = loadBalancerPolicyRules;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rules")
        public List<String> getLoadBalancerPolicyRules() {
            return this.loadBalancerPolicyRules;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeLoadBalancerPolicyRulesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerPolicyRuleModel> loadBalancerPolicyRuleSet;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_set")
        public void setLoadBalancerPolicyRuleSet(List<LoadBalancerPolicyRuleModel> loadBalancerPolicyRuleSet) {
            this.loadBalancerPolicyRuleSet = loadBalancerPolicyRuleSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_set")
        public List<LoadBalancerPolicyRuleModel> getLoadBalancerPolicyRuleSet() {
            return this.loadBalancerPolicyRuleSet;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private Integer totalCount;

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancers.html
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
        context.put("RequestURI", "/DescribeLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_loadbalancers.html
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
        context.put("RequestURI", "/DescribeLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private List<String> loadBalancers;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private List<String> status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public List<String> getStatus() {
            return this.status;
        }

        private List<String> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<String> getTags() {
            return this.tags;
        }

        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<LoadBalancerModel> loadBalancerSet;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_set")
        public void setLoadBalancerSet(List<LoadBalancerModel> loadBalancerSet) {
            this.loadBalancerSet = loadBalancerSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_set")
        public List<LoadBalancerModel> getLoadBalancerSet() {
            return this.loadBalancerSet;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/describe_server_certificates.html
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
        context.put("RequestURI", "/DescribeServerCertificates");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/describe_server_certificates.html
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
        context.put("RequestURI", "/DescribeServerCertificates");

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

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private List<String> serverCertificates;

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public void setServerCertificates(List<String> serverCertificates) {
            this.serverCertificates = serverCertificates;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificates")
        public List<String> getServerCertificates() {
            return this.serverCertificates;
        }

        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeServerCertificatesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

        private List<ServerCertificateModel> serverCertificateSet;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_set")
        public void setServerCertificateSet(List<ServerCertificateModel> serverCertificateSet) {
            this.serverCertificateSet = serverCertificateSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_set")
        public List<ServerCertificateModel> getServerCertificateSet() {
            return this.serverCertificateSet;
        }

        private Integer totalCount;

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/dissociate_eips_from_loadbalancer.html
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
        context.put("RequestURI", "/DissociateEipsFromLoadBalancer");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/dissociate_eips_from_loadbalancer.html
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
        context.put("RequestURI", "/DissociateEipsFromLoadBalancer");

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

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        // Required
        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
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

    public static class DissociateEIPsFromLoadBalancerOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/monitor/get_loadbalancer_monitor.html
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
        context.put("RequestURI", "/GetLoadBalancerMonitor");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/monitor/get_loadbalancer_monitor.html
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
        context.put("RequestURI", "/GetLoadBalancerMonitor");

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

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public String getEndTime() {
            return this.endTime;
        }

        // Required
        private List<String> meters;

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public void setMeters(List<String> meters) {
            this.meters = meters;
        }

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public List<String> getMeters() {
            return this.meters;
        }

        // Required
        private String resource;

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public void setResource(String resource) {
            this.resource = resource;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public String getResource() {
            return this.resource;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }

        // Required
        private String startTime;

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public String getStartTime() {
            return this.startTime;
        }

    	// Step's available values: 5m, 15m, 2h, 1d
        // Required
        private String step;

        @ParamAnnotation(paramType = "query", paramName = "step")
        public void setStep(String step) {
            this.step = step;
        }

        @ParamAnnotation(paramType = "query", paramName = "step")
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

    public static class GetLoadBalancerMonitorOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<MeterModel> meterSet;

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public void setMeterSet(List<MeterModel> meterSet) {
            this.meterSet = meterSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public List<MeterModel> getMeterSet() {
            return this.meterSet;
        }

        private String resourceID;

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @ParamAnnotation(paramType = "query", paramName = "description")
        public String getDescription() {
            return this.description;
        }

        private Integer httpHeaderSize;

        @ParamAnnotation(paramType = "query", paramName = "http_header_size")
        public void setHttpHeaderSize(Integer httpHeaderSize) {
            this.httpHeaderSize = httpHeaderSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "http_header_size")
        public Integer getHttpHeaderSize() {
            return this.httpHeaderSize;
        }

        // Required
        private String loadBalancer;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public void setLoadBalancer(String loadBalancer) {
            this.loadBalancer = loadBalancer;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer")
        public String getLoadBalancer() {
            return this.loadBalancer;
        }

        private String loadBalancerName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        private Integer nodeCount;

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String securityGroup;

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group")
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

    public static class ModifyLoadBalancerAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_backend_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerBackendAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_backend_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerBackendAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "disabled")
        public void setDisabled(Integer disabled) {
            this.disabled = disabled;
        }

        @ParamAnnotation(paramType = "query", paramName = "disabled")
        public Integer getDisabled() {
            return this.disabled;
        }

        private String loadBalancerBackend;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend")
        public void setLoadBalancerBackend(String loadBalancerBackend) {
            this.loadBalancerBackend = loadBalancerBackend;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend")
        public String getLoadBalancerBackend() {
            return this.loadBalancerBackend;
        }

        private String loadBalancerBackendName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_name")
        public void setLoadBalancerBackendName(String loadBalancerBackendName) {
            this.loadBalancerBackendName = loadBalancerBackendName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_name")
        public String getLoadBalancerBackendName() {
            return this.loadBalancerBackendName;
        }

        private String loadBalancerPolicyID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer port;

        @ParamAnnotation(paramType = "query", paramName = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @ParamAnnotation(paramType = "query", paramName = "port")
        public Integer getPort() {
            return this.port;
        }

        private Integer weight;

        @ParamAnnotation(paramType = "query", paramName = "weight")
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @ParamAnnotation(paramType = "query", paramName = "weight")
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

    public static class ModifyLoadBalancerBackendAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_listener_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerListenerAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_listener_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerListenerAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "balance_mode")
        public void setBalanceMode(String balanceMode) {
            this.balanceMode = balanceMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "balance_mode")
        public String getBalanceMode() {
            return this.balanceMode;
        }

        private Integer forwardfor;

        @ParamAnnotation(paramType = "query", paramName = "forwardfor")
        public void setForwardfor(Integer forwardfor) {
            this.forwardfor = forwardfor;
        }

        @ParamAnnotation(paramType = "query", paramName = "forwardfor")
        public Integer getForwardfor() {
            return this.forwardfor;
        }

        private String healthyCheckMethod;

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_method")
        public void setHealthyCheckMethod(String healthyCheckMethod) {
            this.healthyCheckMethod = healthyCheckMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_method")
        public String getHealthyCheckMethod() {
            return this.healthyCheckMethod;
        }

        private String healthyCheckOption;

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_option")
        public void setHealthyCheckOption(String healthyCheckOption) {
            this.healthyCheckOption = healthyCheckOption;
        }

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_option")
        public String getHealthyCheckOption() {
            return this.healthyCheckOption;
        }

        private Integer listenerOption;

        @ParamAnnotation(paramType = "query", paramName = "listener_option")
        public void setListenerOption(Integer listenerOption) {
            this.listenerOption = listenerOption;
        }

        @ParamAnnotation(paramType = "query", paramName = "listener_option")
        public Integer getListenerOption() {
            return this.listenerOption;
        }

        // Required
        private String loadBalancerListener;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
        public void setLoadBalancerListener(String loadBalancerListener) {
            this.loadBalancerListener = loadBalancerListener;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener")
        public String getLoadBalancerListener() {
            return this.loadBalancerListener;
        }

        private String loadBalancerListenerName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_name")
        public void setLoadBalancerListenerName(String loadBalancerListenerName) {
            this.loadBalancerListenerName = loadBalancerListenerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_name")
        public String getLoadBalancerListenerName() {
            return this.loadBalancerListenerName;
        }

        private String serverCertificateID;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String sessionSticky;

        @ParamAnnotation(paramType = "query", paramName = "session_sticky")
        public void setSessionSticky(String sessionSticky) {
            this.sessionSticky = sessionSticky;
        }

        @ParamAnnotation(paramType = "query", paramName = "session_sticky")
        public String getSessionSticky() {
            return this.sessionSticky;
        }

        private Integer timeout;

        @ParamAnnotation(paramType = "query", paramName = "timeout")
        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        @ParamAnnotation(paramType = "query", paramName = "timeout")
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

    public static class ModifyLoadBalancerListenerAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerPolicyAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerPolicyAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public void setLoadBalancerPolicy(String loadBalancerPolicy) {
            this.loadBalancerPolicy = loadBalancerPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy")
        public String getLoadBalancerPolicy() {
            return this.loadBalancerPolicy;
        }

        private String loadBalancerPolicyName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public String getLoadBalancerPolicyName() {
            return this.loadBalancerPolicyName;
        }

        private String operator;

        @ParamAnnotation(paramType = "query", paramName = "operator")
        public void setOperator(String operator) {
            this.operator = operator;
        }

        @ParamAnnotation(paramType = "query", paramName = "operator")
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

    public static class ModifyLoadBalancerPolicyAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_rule_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerPolicyRuleAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_loadbalancer_policy_rule_attributes.html
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
        context.put("RequestURI", "/ModifyLoadBalancerPolicyRuleAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule")
        public void setLoadBalancerPolicyRule(String loadBalancerPolicyRule) {
            this.loadBalancerPolicyRule = loadBalancerPolicyRule;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule")
        public String getLoadBalancerPolicyRule() {
            return this.loadBalancerPolicyRule;
        }

        private String loadBalancerPolicyRuleName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_name")
        public void setLoadBalancerPolicyRuleName(String loadBalancerPolicyRuleName) {
            this.loadBalancerPolicyRuleName = loadBalancerPolicyRuleName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_name")
        public String getLoadBalancerPolicyRuleName() {
            return this.loadBalancerPolicyRuleName;
        }

        private String val;

        @ParamAnnotation(paramType = "query", paramName = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @ParamAnnotation(paramType = "query", paramName = "val")
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

    public static class ModifyLoadBalancerPolicyRuleAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String loadBalancerPolicyRuleID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_id")
        public void setLoadBalancerPolicyRuleID(String loadBalancerPolicyRuleID) {
            this.loadBalancerPolicyRuleID = loadBalancerPolicyRuleID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_id")
        public String getLoadBalancerPolicyRuleID() {
            return this.loadBalancerPolicyRuleID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/modify_server_certificate_attributes.html
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
        context.put("RequestURI", "/ModifyServerCertificateAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/modify_server_certificate_attributes.html
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
        context.put("RequestURI", "/ModifyServerCertificateAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @ParamAnnotation(paramType = "query", paramName = "description")
        public String getDescription() {
            return this.description;
        }

        // Required
        private String serverCertificate;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate")
        public void setServerCertificate(String serverCertificate) {
            this.serverCertificate = serverCertificate;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate")
        public String getServerCertificate() {
            return this.serverCertificate;
        }

        private String serverCertificateName;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
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

    public static class ModifyServerCertificateAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/resize_loadbalancers.html
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
        context.put("RequestURI", "/ResizeLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/resize_loadbalancers.html
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
        context.put("RequestURI", "/ResizeLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
        }

        private List<String> loadBalancers;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
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

    public static class ResizeLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/start_loadbalancers.html
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
        context.put("RequestURI", "/StartLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/start_loadbalancers.html
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
        context.put("RequestURI", "/StartLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StartLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/stop_loadbalancers.html
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
        context.put("RequestURI", "/StopLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/stop_loadbalancers.html
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
        context.put("RequestURI", "/StopLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StopLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/lb/update_loadbalancers.html
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
        context.put("RequestURI", "/UpdateLoadBalancers");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/lb/update_loadbalancers.html
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
        context.put("RequestURI", "/UpdateLoadBalancers");

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

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public void setLoadBalancers(List<String> loadBalancers) {
            this.loadBalancers = loadBalancers;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancers")
        public List<String> getLoadBalancers() {
            return this.loadBalancers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class UpdateLoadBalancersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
        }

    }}



















