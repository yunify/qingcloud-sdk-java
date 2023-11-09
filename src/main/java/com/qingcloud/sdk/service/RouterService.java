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

public class RouterService {

    private EnvContext envContext;

    private String zone;

    public RouterService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public RouterService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddRouterStaticEntriesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/add_router_static_entries.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddRouterStaticEntriesOutput addRouterStaticEntries(AddRouterStaticEntriesInput input) throws QCException {
        if (input == null) {
            input = new AddRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddRouterStaticEntries");
        context.put("APIName", "AddRouterStaticEntries");
        context.put("ServiceName", "AddRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddRouterStaticEntries");

        input.setAction("AddRouterStaticEntries");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddRouterStaticEntriesOutput.class);
        if(backModel != null){
            return (AddRouterStaticEntriesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/add_router_static_entries.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addRouterStaticEntries(AddRouterStaticEntriesInput input, ResponseCallBack<AddRouterStaticEntriesOutput> callback) throws QCException {
        if (input == null) {
            input = new AddRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddRouterStaticEntries");
        context.put("APIName", "AddRouterStaticEntries");
        context.put("ServiceName", "AddRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddRouterStaticEntries");

        input.setAction("AddRouterStaticEntries");
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

    public static class AddRouterStaticEntriesInput extends IaasParamBody {
        private List<RouterStaticEntryModel> entries;

        @JsonProperty(value = "entries")
        public void setEntries(List<RouterStaticEntryModel> entries) {
            this.entries = entries;
        }

        @JsonProperty(value = "entries")
        public List<RouterStaticEntryModel> getEntries() {
            return this.entries;
        }

        // Required
        private String routerStatic;

        @JsonProperty(value = "router_static")
        public void setRouterStatic(String routerStatic) {
            this.routerStatic = routerStatic;
        }

        @JsonProperty(value = "router_static")
        public String getRouterStatic() {
            return this.routerStatic;
        }

        public String validateParam() throws QCException {
            if (this.getEntries() != null && this.getEntries().size() > 0 ) {
                for (int i = 0 ; i < this.getEntries().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getRouterStatic())) {
                throw new QCException("RouterStatic is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddRouterStaticEntriesOutput extends OutputModel {
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

        private List<String> routerStaticEntries;

        @JsonProperty(value = "router_static_entries")
        public void setRouterStaticEntries(List<String> routerStaticEntries) {
            this.routerStaticEntries = routerStaticEntries;
        }

        @JsonProperty(value = "router_static_entries")
        public List<String> getRouterStaticEntries() {
            return this.routerStaticEntries;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddRouterStaticsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/add_router_statics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddRouterStaticsOutput addRouterStatics(AddRouterStaticsInput input) throws QCException {
        if (input == null) {
            input = new AddRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddRouterStatics");
        context.put("APIName", "AddRouterStatics");
        context.put("ServiceName", "AddRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddRouterStatics");

        input.setAction("AddRouterStatics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddRouterStaticsOutput.class);
        if(backModel != null){
            return (AddRouterStaticsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/add_router_statics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addRouterStatics(AddRouterStaticsInput input, ResponseCallBack<AddRouterStaticsOutput> callback) throws QCException {
        if (input == null) {
            input = new AddRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddRouterStatics");
        context.put("APIName", "AddRouterStatics");
        context.put("ServiceName", "AddRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddRouterStatics");

        input.setAction("AddRouterStatics");
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

    public static class AddRouterStaticsInput extends IaasParamBody {
        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        // Required
        private List<RouterStaticModel> statics;

        @JsonProperty(value = "statics")
        public void setStatics(List<RouterStaticModel> statics) {
            this.statics = statics;
        }

        @JsonProperty(value = "statics")
        public List<RouterStaticModel> getStatics() {
            return this.statics;
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
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            if (this.getStatics() != null && this.getStatics().size() > 0 ) {
                for (int i = 0 ; i < this.getStatics().size(); i++ ) {
                    
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
    public static class AddRouterStaticsOutput extends OutputModel {
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

        private List<String> routerStatics;

        @JsonProperty(value = "router_statics")
        public void setRouterStatics(List<String> routerStatics) {
            this.routerStatics = routerStatics;
        }

        @JsonProperty(value = "router_statics")
        public List<String> getRouterStatics() {
            return this.routerStatics;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CreateRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/create_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateRoutersOutput createRouters(CreateRoutersInput input) throws QCException {
        if (input == null) {
            input = new CreateRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRouters");
        context.put("APIName", "CreateRouters");
        context.put("ServiceName", "CreateRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRouters");

        input.setAction("CreateRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateRoutersOutput.class);
        if(backModel != null){
            return (CreateRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/create_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createRouters(CreateRoutersInput input, ResponseCallBack<CreateRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRouters");
        context.put("APIName", "CreateRouters");
        context.put("ServiceName", "CreateRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRouters");

        input.setAction("CreateRouters");
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

    public static class CreateRoutersInput extends IaasParamBody {
        private Integer count;

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String routerName;

        @JsonProperty(value = "router_name")
        public void setRouterName(String routerName) {
            this.routerName = routerName;
        }

        @JsonProperty(value = "router_name")
        public String getRouterName() {
            return this.routerName;
        }

    	// RouterType's available values: 0, 1, 2, 3
        private Integer routerType;

        @JsonProperty(value = "router_type")
        public void setRouterType(Integer routerType) {
            this.routerType = routerType;
        }

        @JsonProperty(value = "router_type")
        public Integer getRouterType() {
            return this.routerType;
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

        private String vpcNetwork;

        @JsonProperty(value = "vpc_network")
        public void setVpcNetwork(String vpcNetwork) {
            this.vpcNetwork = vpcNetwork;
        }

        @JsonProperty(value = "vpc_network")
        public String getVpcNetwork() {
            return this.vpcNetwork;
        }

        public String validateParam() throws QCException {
            String[]routerTypeValidValues = {"0", "1", "2", "3"};
            boolean routerTypeIsValid = false;
            for (String v : routerTypeValidValues) {
                if (v.equals(this.getRouterType()+"")) {
                    routerTypeIsValid = true;
                }
                Boolean routerTypeIsRequired = Boolean.FALSE;
                if (routerTypeIsRequired.equals(Boolean.FALSE) && this.getRouterType()==null) {
                    routerTypeIsValid = true;
                }
            }

            if (!routerTypeIsValid) {
                throw new QCException("RouterType value " + this.getRouterType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateRoutersOutput extends OutputModel {
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

        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteRouterStaticEntriesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/delete_router_static_entries.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteRouterStaticEntriesOutput deleteRouterStaticEntries(DeleteRouterStaticEntriesInput input) throws QCException {
        if (input == null) {
            input = new DeleteRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouterStaticEntries");
        context.put("APIName", "DeleteRouterStaticEntries");
        context.put("ServiceName", "DeleteRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouterStaticEntries");

        input.setAction("DeleteRouterStaticEntries");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteRouterStaticEntriesOutput.class);
        if(backModel != null){
            return (DeleteRouterStaticEntriesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/delete_router_static_entries.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteRouterStaticEntries(DeleteRouterStaticEntriesInput input, ResponseCallBack<DeleteRouterStaticEntriesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouterStaticEntries");
        context.put("APIName", "DeleteRouterStaticEntries");
        context.put("ServiceName", "DeleteRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouterStaticEntries");

        input.setAction("DeleteRouterStaticEntries");
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

    public static class DeleteRouterStaticEntriesInput extends IaasParamBody {
        // Required
        private List<String> routerStaticEntries;

        @JsonProperty(value = "router_static_entries")
        public void setRouterStaticEntries(List<String> routerStaticEntries) {
            this.routerStaticEntries = routerStaticEntries;
        }

        @JsonProperty(value = "router_static_entries")
        public List<String> getRouterStaticEntries() {
            return this.routerStaticEntries;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteRouterStaticEntriesOutput extends OutputModel {
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

        private List<String> routerStaticEntries;

        @JsonProperty(value = "router_static_entries")
        public void setRouterStaticEntries(List<String> routerStaticEntries) {
            this.routerStaticEntries = routerStaticEntries;
        }

        @JsonProperty(value = "router_static_entries")
        public List<String> getRouterStaticEntries() {
            return this.routerStaticEntries;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteRouterStaticsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/delete_router_statics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteRouterStaticsOutput deleteRouterStatics(DeleteRouterStaticsInput input) throws QCException {
        if (input == null) {
            input = new DeleteRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouterStatics");
        context.put("APIName", "DeleteRouterStatics");
        context.put("ServiceName", "DeleteRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouterStatics");

        input.setAction("DeleteRouterStatics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteRouterStaticsOutput.class);
        if(backModel != null){
            return (DeleteRouterStaticsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/delete_router_statics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteRouterStatics(DeleteRouterStaticsInput input, ResponseCallBack<DeleteRouterStaticsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouterStatics");
        context.put("APIName", "DeleteRouterStatics");
        context.put("ServiceName", "DeleteRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouterStatics");

        input.setAction("DeleteRouterStatics");
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

    public static class DeleteRouterStaticsInput extends IaasParamBody {
        // Required
        private List<String> routerStatics;

        @JsonProperty(value = "router_statics")
        public void setRouterStatics(List<String> routerStatics) {
            this.routerStatics = routerStatics;
        }

        @JsonProperty(value = "router_statics")
        public List<String> getRouterStatics() {
            return this.routerStatics;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteRouterStaticsOutput extends OutputModel {
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

        private List<String> routerStatics;

        @JsonProperty(value = "router_statics")
        public void setRouterStatics(List<String> routerStatics) {
            this.routerStatics = routerStatics;
        }

        @JsonProperty(value = "router_statics")
        public List<String> getRouterStatics() {
            return this.routerStatics;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/delete_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteRoutersOutput deleteRouters(DeleteRoutersInput input) throws QCException {
        if (input == null) {
            input = new DeleteRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouters");
        context.put("APIName", "DeleteRouters");
        context.put("ServiceName", "DeleteRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouters");

        input.setAction("DeleteRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteRoutersOutput.class);
        if(backModel != null){
            return (DeleteRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/delete_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteRouters(DeleteRoutersInput input, ResponseCallBack<DeleteRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRouters");
        context.put("APIName", "DeleteRouters");
        context.put("ServiceName", "DeleteRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRouters");

        input.setAction("DeleteRouters");
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

    public static class DeleteRoutersInput extends IaasParamBody {
        // Required
        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteRoutersOutput extends OutputModel {
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

        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeRouterStaticEntriesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/describe_router_static_entries.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRouterStaticEntriesOutput describeRouterStaticEntries(DescribeRouterStaticEntriesInput input) throws QCException {
        if (input == null) {
            input = new DescribeRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterStaticEntries");
        context.put("APIName", "DescribeRouterStaticEntries");
        context.put("ServiceName", "DescribeRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterStaticEntries");

        input.setAction("DescribeRouterStaticEntries");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRouterStaticEntriesOutput.class);
        if(backModel != null){
            return (DescribeRouterStaticEntriesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/describe_router_static_entries.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRouterStaticEntries(DescribeRouterStaticEntriesInput input, ResponseCallBack<DescribeRouterStaticEntriesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRouterStaticEntriesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterStaticEntries");
        context.put("APIName", "DescribeRouterStaticEntries");
        context.put("ServiceName", "DescribeRouterStaticEntries");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterStaticEntries");

        input.setAction("DescribeRouterStaticEntries");
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

    public static class DescribeRouterStaticEntriesInput extends IaasParamBody {
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

        private String routerStatic;

        @JsonProperty(value = "router_static")
        public void setRouterStatic(String routerStatic) {
            this.routerStatic = routerStatic;
        }

        @JsonProperty(value = "router_static")
        public String getRouterStatic() {
            return this.routerStatic;
        }

        private String routerStaticEntries;

        @JsonProperty(value = "router_static_entries")
        public void setRouterStaticEntries(String routerStaticEntries) {
            this.routerStaticEntries = routerStaticEntries;
        }

        @JsonProperty(value = "router_static_entries")
        public String getRouterStaticEntries() {
            return this.routerStaticEntries;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeRouterStaticEntriesOutput extends OutputModel {
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

        private List<RouterStaticEntryModel> routerStaticEntrySet;

        @JsonProperty(value = "router_static_entry_set")
        public void setRouterStaticEntrySet(List<RouterStaticEntryModel> routerStaticEntrySet) {
            this.routerStaticEntrySet = routerStaticEntrySet;
        }

        @JsonProperty(value = "router_static_entry_set")
        public List<RouterStaticEntryModel> getRouterStaticEntrySet() {
            return this.routerStaticEntrySet;
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
      * @return DescribeRouterStaticsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/describe_router_statics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRouterStaticsOutput describeRouterStatics(DescribeRouterStaticsInput input) throws QCException {
        if (input == null) {
            input = new DescribeRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterStatics");
        context.put("APIName", "DescribeRouterStatics");
        context.put("ServiceName", "DescribeRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterStatics");

        input.setAction("DescribeRouterStatics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRouterStaticsOutput.class);
        if(backModel != null){
            return (DescribeRouterStaticsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/describe_router_statics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRouterStatics(DescribeRouterStaticsInput input, ResponseCallBack<DescribeRouterStaticsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRouterStaticsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterStatics");
        context.put("APIName", "DescribeRouterStatics");
        context.put("ServiceName", "DescribeRouterStatics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterStatics");

        input.setAction("DescribeRouterStatics");
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

    public static class DescribeRouterStaticsInput extends IaasParamBody {
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

        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        private List<String> routerStatics;

        @JsonProperty(value = "router_statics")
        public void setRouterStatics(List<String> routerStatics) {
            this.routerStatics = routerStatics;
        }

        @JsonProperty(value = "router_statics")
        public List<String> getRouterStatics() {
            return this.routerStatics;
        }

    	// StaticType's available values: 1, 2, 3, 4, 5, 6, 7, 8
        private Integer staticType;

        @JsonProperty(value = "static_type")
        public void setStaticType(Integer staticType) {
            this.staticType = staticType;
        }

        @JsonProperty(value = "static_type")
        public Integer getStaticType() {
            return this.staticType;
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
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            String[]staticTypeValidValues = {"1", "2", "3", "4", "5", "6", "7", "8"};
            boolean staticTypeIsValid = false;
            for (String v : staticTypeValidValues) {
                if (v.equals(this.getStaticType()+"")) {
                    staticTypeIsValid = true;
                }
                Boolean staticTypeIsRequired = Boolean.FALSE;
                if (staticTypeIsRequired.equals(Boolean.FALSE) && this.getStaticType()==null) {
                    staticTypeIsValid = true;
                }
            }

            if (!staticTypeIsValid) {
                throw new QCException("StaticType value " + this.getStaticType() + "is invalid");
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
    public static class DescribeRouterStaticsOutput extends OutputModel {
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

        private List<RouterStaticModel> routerStaticSet;

        @JsonProperty(value = "router_static_set")
        public void setRouterStaticSet(List<RouterStaticModel> routerStaticSet) {
            this.routerStaticSet = routerStaticSet;
        }

        @JsonProperty(value = "router_static_set")
        public List<RouterStaticModel> getRouterStaticSet() {
            return this.routerStaticSet;
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
      * @return DescribeRouterVxNetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/describe_router_vxnets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRouterVxNetsOutput describeRouterVxNets(DescribeRouterVxNetsInput input) throws QCException {
        if (input == null) {
            input = new DescribeRouterVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterVxnets");
        context.put("APIName", "DescribeRouterVxnets");
        context.put("ServiceName", "DescribeRouterVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterVxnets");

        input.setAction("DescribeRouterVxnets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRouterVxNetsOutput.class);
        if(backModel != null){
            return (DescribeRouterVxNetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/describe_router_vxnets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRouterVxNets(DescribeRouterVxNetsInput input, ResponseCallBack<DescribeRouterVxNetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRouterVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouterVxNets");
        context.put("APIName", "DescribeRouterVxNets");
        context.put("ServiceName", "DescribeRouterVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouterVxnets");

        input.setAction("DescribeRouterVxNets");
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

    public static class DescribeRouterVxNetsInput extends IaasParamBody {
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

        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
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
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
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
    public static class DescribeRouterVxNetsOutput extends OutputModel {
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

        private List<RouterVxNetModel> routerVxNetSet;

        @JsonProperty(value = "router_vxnet_set")
        public void setRouterVxNetSet(List<RouterVxNetModel> routerVxNetSet) {
            this.routerVxNetSet = routerVxNetSet;
        }

        @JsonProperty(value = "router_vxnet_set")
        public List<RouterVxNetModel> getRouterVxNetSet() {
            return this.routerVxNetSet;
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
      * @return DescribeRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/describe_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRoutersOutput describeRouters(DescribeRoutersInput input) throws QCException {
        if (input == null) {
            input = new DescribeRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouters");
        context.put("APIName", "DescribeRouters");
        context.put("ServiceName", "DescribeRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouters");

        input.setAction("DescribeRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRoutersOutput.class);
        if(backModel != null){
            return (DescribeRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/describe_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRouters(DescribeRoutersInput input, ResponseCallBack<DescribeRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRouters");
        context.put("APIName", "DescribeRouters");
        context.put("ServiceName", "DescribeRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRouters");

        input.setAction("DescribeRouters");
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

    public static class DescribeRoutersInput extends IaasParamBody {
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

        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
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
    public static class DescribeRoutersOutput extends OutputModel {
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

        private List<RouterModel> routerSet;

        @JsonProperty(value = "router_set")
        public void setRouterSet(List<RouterModel> routerSet) {
            this.routerSet = routerSet;
        }

        @JsonProperty(value = "router_set")
        public List<RouterModel> getRouterSet() {
            return this.routerSet;
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
      * @return GetRouterMonitorOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/monitor/get_monitor.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetRouterMonitorOutput getRouterMonitor(GetRouterMonitorInput input) throws QCException {
        if (input == null) {
            input = new GetRouterMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRouterMonitor");
        context.put("APIName", "GetRouterMonitor");
        context.put("ServiceName", "GetMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRouterMonitor");

        input.setAction("GetRouterMonitor");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetRouterMonitorOutput.class);
        if(backModel != null){
            return (GetRouterMonitorOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/monitor/get_monitor.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getRouterMonitor(GetRouterMonitorInput input, ResponseCallBack<GetRouterMonitorOutput> callback) throws QCException {
        if (input == null) {
            input = new GetRouterMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRouterMonitor");
        context.put("APIName", "GetRouterMonitor");
        context.put("ServiceName", "GetMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRouterMonitor");

        input.setAction("GetRouterMonitor");
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

    public static class GetRouterMonitorInput extends IaasParamBody {
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
    public static class GetRouterMonitorOutput extends OutputModel {
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
      * @return GetVPNCertsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/get_vpn_certs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetVPNCertsOutput getVPNCerts(GetVPNCertsInput input) throws QCException {
        if (input == null) {
            input = new GetVPNCertsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetVPNCerts");
        context.put("APIName", "GetVPNCerts");
        context.put("ServiceName", "GetVPNCerts");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetVPNCerts");

        input.setAction("GetVPNCerts");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetVPNCertsOutput.class);
        if(backModel != null){
            return (GetVPNCertsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/get_vpn_certs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getVPNCerts(GetVPNCertsInput input, ResponseCallBack<GetVPNCertsOutput> callback) throws QCException {
        if (input == null) {
            input = new GetVPNCertsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetVPNCerts");
        context.put("APIName", "GetVPNCerts");
        context.put("ServiceName", "GetVPNCerts");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetVPNCerts");

        input.setAction("GetVPNCerts");
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

    public static class GetVPNCertsInput extends IaasParamBody {
    	// Platform's available values: windows, linux, mac
        private String platform;

        @JsonProperty(value = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @JsonProperty(value = "platform")
        public String getPlatform() {
            return this.platform;
        }

        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        public String validateParam() throws QCException {
            String[] platformValidValues = {
                "windows", "linux", "mac"
            };

            boolean platformIsValid = false;
            for (String v : platformValidValues) {
                if (v.equals(this.getPlatform())) {
                    platformIsValid = true;
                }
                Boolean platformIsRequired = Boolean.FALSE;
                if (platformIsRequired.equals(Boolean.FALSE) && this.getPlatform() == null) {
                    platformIsValid = true;
                }
            }

            if (!platformIsValid) {
                throw new QCException("Platform value " + this.getPlatform() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetVPNCertsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String caCert;

        @JsonProperty(value = "ca_cert")
        public void setCaCert(String caCert) {
            this.caCert = caCert;
        }

        @JsonProperty(value = "ca_cert")
        public String getCaCert() {
            return this.caCert;
        }

        private String clientCrt;

        @JsonProperty(value = "client_crt")
        public void setClientCrt(String clientCrt) {
            this.clientCrt = clientCrt;
        }

        @JsonProperty(value = "client_crt")
        public String getClientCrt() {
            return this.clientCrt;
        }

        private String clientKey;

        @JsonProperty(value = "client_key")
        public void setClientKey(String clientKey) {
            this.clientKey = clientKey;
        }

        @JsonProperty(value = "client_key")
        public String getClientKey() {
            return this.clientKey;
        }

        private String linuxConfSample;

        @JsonProperty(value = "linux_conf_sample")
        public void setLinuxConfSample(String linuxConfSample) {
            this.linuxConfSample = linuxConfSample;
        }

        @JsonProperty(value = "linux_conf_sample")
        public String getLinuxConfSample() {
            return this.linuxConfSample;
        }

        private String macConfSample;

        @JsonProperty(value = "mac_conf_sample")
        public void setMacConfSample(String macConfSample) {
            this.macConfSample = macConfSample;
        }

        @JsonProperty(value = "mac_conf_sample")
        public String getMacConfSample() {
            return this.macConfSample;
        }

    	// Platform's available values: linux, windows, mac
        private String platform;

        @JsonProperty(value = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @JsonProperty(value = "platform")
        public String getPlatform() {
            return this.platform;
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

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String staticKey;

        @JsonProperty(value = "static_key")
        public void setStaticKey(String staticKey) {
            this.staticKey = staticKey;
        }

        @JsonProperty(value = "static_key")
        public String getStaticKey() {
            return this.staticKey;
        }

        private String windowsConfSample;

        @JsonProperty(value = "windows_conf_sample")
        public void setWindowsConfSample(String windowsConfSample) {
            this.windowsConfSample = windowsConfSample;
        }

        @JsonProperty(value = "windows_conf_sample")
        public String getWindowsConfSample() {
            return this.windowsConfSample;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return JoinRouterOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/join_router.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public JoinRouterOutput joinRouter(JoinRouterInput input) throws QCException {
        if (input == null) {
            input = new JoinRouterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "JoinRouter");
        context.put("APIName", "JoinRouter");
        context.put("ServiceName", "JoinRouter");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/JoinRouter");

        input.setAction("JoinRouter");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,JoinRouterOutput.class);
        if(backModel != null){
            return (JoinRouterOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/join_router.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void joinRouter(JoinRouterInput input, ResponseCallBack<JoinRouterOutput> callback) throws QCException {
        if (input == null) {
            input = new JoinRouterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "JoinRouter");
        context.put("APIName", "JoinRouter");
        context.put("ServiceName", "JoinRouter");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/JoinRouter");

        input.setAction("JoinRouter");
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

    public static class JoinRouterInput extends IaasParamBody {
        private String dYNIPEnd;

        @JsonProperty(value = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @JsonProperty(value = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @JsonProperty(value = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @JsonProperty(value = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

    	// Features's available values: 1
        private Integer features;

        @JsonProperty(value = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @JsonProperty(value = "features")
        public Integer getFeatures() {
            return this.features;
        }

        // Required
        private String iPNetwork;

        @JsonProperty(value = "ip_network")
        public void setIPNetwork(String iPNetwork) {
            this.iPNetwork = iPNetwork;
        }

        @JsonProperty(value = "ip_network")
        public String getIPNetwork() {
            return this.iPNetwork;
        }

        private String managerIP;

        @JsonProperty(value = "manager_ip")
        public void setManagerIP(String managerIP) {
            this.managerIP = managerIP;
        }

        @JsonProperty(value = "manager_ip")
        public String getManagerIP() {
            return this.managerIP;
        }

        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        // Required
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
            String[]featuresValidValues = {"1"};
            boolean featuresIsValid = false;
            for (String v : featuresValidValues) {
                if (v.equals(this.getFeatures()+"")) {
                    featuresIsValid = true;
                }
                Boolean featuresIsRequired = Boolean.FALSE;
                if (featuresIsRequired.equals(Boolean.FALSE) && this.getFeatures()==null) {
                    featuresIsValid = true;
                }
            }

            if (!featuresIsValid) {
                throw new QCException("Features value " + this.getFeatures() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getIPNetwork())) {
                throw new QCException("IPNetwork is required");
            }
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class JoinRouterOutput extends OutputModel {
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

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String vxNetID;

        @JsonProperty(value = "vxnet_id")
        public void setVxNetID(String vxNetID) {
            this.vxNetID = vxNetID;
        }

        @JsonProperty(value = "vxnet_id")
        public String getVxNetID() {
            return this.vxNetID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return LeaveRouterOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/leave_router.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public LeaveRouterOutput leaveRouter(LeaveRouterInput input) throws QCException {
        if (input == null) {
            input = new LeaveRouterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "LeaveRouter");
        context.put("APIName", "LeaveRouter");
        context.put("ServiceName", "LeaveRouter");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/LeaveRouter");

        input.setAction("LeaveRouter");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,LeaveRouterOutput.class);
        if(backModel != null){
            return (LeaveRouterOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/leave_router.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void leaveRouter(LeaveRouterInput input, ResponseCallBack<LeaveRouterOutput> callback) throws QCException {
        if (input == null) {
            input = new LeaveRouterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "LeaveRouter");
        context.put("APIName", "LeaveRouter");
        context.put("ServiceName", "LeaveRouter");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/LeaveRouter");

        input.setAction("LeaveRouter");
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

    public static class LeaveRouterInput extends IaasParamBody {
        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        // Required
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
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LeaveRouterOutput extends OutputModel {
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

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
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

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ModifyRouterAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/modify_router_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyRouterAttributesOutput modifyRouterAttributes(ModifyRouterAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyRouterAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterAttributes");
        context.put("APIName", "ModifyRouterAttributes");
        context.put("ServiceName", "ModifyRouterAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterAttributes");

        input.setAction("ModifyRouterAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyRouterAttributesOutput.class);
        if(backModel != null){
            return (ModifyRouterAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/modify_router_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyRouterAttributes(ModifyRouterAttributesInput input, ResponseCallBack<ModifyRouterAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyRouterAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterAttributes");
        context.put("APIName", "ModifyRouterAttributes");
        context.put("ServiceName", "ModifyRouterAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterAttributes");

        input.setAction("ModifyRouterAttributes");
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

    public static class ModifyRouterAttributesInput extends IaasParamBody {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        private String dYNIPEnd;

        @JsonProperty(value = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @JsonProperty(value = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @JsonProperty(value = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @JsonProperty(value = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

        private String eIP;

        @JsonProperty(value = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public String getEIP() {
            return this.eIP;
        }

    	// Features's available values: 1, 2
        private Integer features;

        @JsonProperty(value = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @JsonProperty(value = "features")
        public Integer getFeatures() {
            return this.features;
        }

        // Required
        private String router;

        @JsonProperty(value = "router")
        public void setRouter(String router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public String getRouter() {
            return this.router;
        }

        private String routerName;

        @JsonProperty(value = "router_name")
        public void setRouterName(String routerName) {
            this.routerName = routerName;
        }

        @JsonProperty(value = "router_name")
        public String getRouterName() {
            return this.routerName;
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
            String[]featuresValidValues = {"1", "2"};
            boolean featuresIsValid = false;
            for (String v : featuresValidValues) {
                if (v.equals(this.getFeatures()+"")) {
                    featuresIsValid = true;
                }
                Boolean featuresIsRequired = Boolean.FALSE;
                if (featuresIsRequired.equals(Boolean.FALSE) && this.getFeatures()==null) {
                    featuresIsValid = true;
                }
            }

            if (!featuresIsValid) {
                throw new QCException("Features value " + this.getFeatures() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getRouter())) {
                throw new QCException("Router is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyRouterAttributesOutput extends OutputModel {
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
      * @return ModifyRouterStaticAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/modify_router_static_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyRouterStaticAttributesOutput modifyRouterStaticAttributes(ModifyRouterStaticAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyRouterStaticAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterStaticAttributes");
        context.put("APIName", "ModifyRouterStaticAttributes");
        context.put("ServiceName", "ModifyRouterStaticAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterStaticAttributes");

        input.setAction("ModifyRouterStaticAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyRouterStaticAttributesOutput.class);
        if(backModel != null){
            return (ModifyRouterStaticAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/modify_router_static_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyRouterStaticAttributes(ModifyRouterStaticAttributesInput input, ResponseCallBack<ModifyRouterStaticAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyRouterStaticAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterStaticAttributes");
        context.put("APIName", "ModifyRouterStaticAttributes");
        context.put("ServiceName", "ModifyRouterStaticAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterStaticAttributes");

        input.setAction("ModifyRouterStaticAttributes");
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

    public static class ModifyRouterStaticAttributesInput extends IaasParamBody {
        // Required
        private String routerStatic;

        @JsonProperty(value = "router_static")
        public void setRouterStatic(String routerStatic) {
            this.routerStatic = routerStatic;
        }

        @JsonProperty(value = "router_static")
        public String getRouterStatic() {
            return this.routerStatic;
        }

        private String routerStaticName;

        @JsonProperty(value = "router_static_name")
        public void setRouterStaticName(String routerStaticName) {
            this.routerStaticName = routerStaticName;
        }

        @JsonProperty(value = "router_static_name")
        public String getRouterStaticName() {
            return this.routerStaticName;
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

        private String val4;

        @JsonProperty(value = "val4")
        public void setVal4(String val4) {
            this.val4 = val4;
        }

        @JsonProperty(value = "val4")
        public String getVal4() {
            return this.val4;
        }

        private String val5;

        @JsonProperty(value = "val5")
        public void setVal5(String val5) {
            this.val5 = val5;
        }

        @JsonProperty(value = "val5")
        public String getVal5() {
            return this.val5;
        }

        private String val6;

        @JsonProperty(value = "val6")
        public void setVal6(String val6) {
            this.val6 = val6;
        }

        @JsonProperty(value = "val6")
        public String getVal6() {
            return this.val6;
        }

        private String val7;

        @JsonProperty(value = "val7")
        public void setVal7(String val7) {
            this.val7 = val7;
        }

        @JsonProperty(value = "val7")
        public String getVal7() {
            return this.val7;
        }

        private String val8;

        @JsonProperty(value = "val8")
        public void setVal8(String val8) {
            this.val8 = val8;
        }

        @JsonProperty(value = "val8")
        public String getVal8() {
            return this.val8;
        }

        private String val9;

        @JsonProperty(value = "val9")
        public void setVal9(String val9) {
            this.val9 = val9;
        }

        @JsonProperty(value = "val9")
        public String getVal9() {
            return this.val9;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRouterStatic())) {
                throw new QCException("RouterStatic is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyRouterStaticAttributesOutput extends OutputModel {
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

        private String routerStaticID;

        @JsonProperty(value = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @JsonProperty(value = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ModifyRouterStaticEntryAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/modify_router_static_entry_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyRouterStaticEntryAttributesOutput modifyRouterStaticEntryAttributes(ModifyRouterStaticEntryAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyRouterStaticEntryAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterStaticEntryAttributes");
        context.put("APIName", "ModifyRouterStaticEntryAttributes");
        context.put("ServiceName", "ModifyRouterStaticEntryAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterStaticEntryAttributes");

        input.setAction("ModifyRouterStaticEntryAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyRouterStaticEntryAttributesOutput.class);
        if(backModel != null){
            return (ModifyRouterStaticEntryAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/modify_router_static_entry_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyRouterStaticEntryAttributes(ModifyRouterStaticEntryAttributesInput input, ResponseCallBack<ModifyRouterStaticEntryAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyRouterStaticEntryAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRouterStaticEntryAttributes");
        context.put("APIName", "ModifyRouterStaticEntryAttributes");
        context.put("ServiceName", "ModifyRouterStaticEntryAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRouterStaticEntryAttributes");

        input.setAction("ModifyRouterStaticEntryAttributes");
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

    public static class ModifyRouterStaticEntryAttributesInput extends IaasParamBody {
        // Required
        private String routerStaticEntry;

        @JsonProperty(value = "router_static_entry")
        public void setRouterStaticEntry(String routerStaticEntry) {
            this.routerStaticEntry = routerStaticEntry;
        }

        @JsonProperty(value = "router_static_entry")
        public String getRouterStaticEntry() {
            return this.routerStaticEntry;
        }

        private String routerStaticEntryName;

        @JsonProperty(value = "router_static_entry_name")
        public void setRouterStaticEntryName(String routerStaticEntryName) {
            this.routerStaticEntryName = routerStaticEntryName;
        }

        @JsonProperty(value = "router_static_entry_name")
        public String getRouterStaticEntryName() {
            return this.routerStaticEntryName;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRouterStaticEntry())) {
                throw new QCException("RouterStaticEntry is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyRouterStaticEntryAttributesOutput extends OutputModel {
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

        private String routerStaticEntry;

        @JsonProperty(value = "router_static_entry")
        public void setRouterStaticEntry(String routerStaticEntry) {
            this.routerStaticEntry = routerStaticEntry;
        }

        @JsonProperty(value = "router_static_entry")
        public String getRouterStaticEntry() {
            return this.routerStaticEntry;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return PowerOffRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/poweroff_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public PowerOffRoutersOutput powerOffRouters(PowerOffRoutersInput input) throws QCException {
        if (input == null) {
            input = new PowerOffRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOffRouters");
        context.put("APIName", "PowerOffRouters");
        context.put("ServiceName", "PowerOffRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOffRouters");

        input.setAction("PowerOffRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,PowerOffRoutersOutput.class);
        if(backModel != null){
            return (PowerOffRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/poweroff_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void powerOffRouters(PowerOffRoutersInput input, ResponseCallBack<PowerOffRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new PowerOffRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOffRouters");
        context.put("APIName", "PowerOffRouters");
        context.put("ServiceName", "PowerOffRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOffRouters");

        input.setAction("PowerOffRouters");
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

    public static class PowerOffRoutersInput extends IaasParamBody {
        // Required
        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PowerOffRoutersOutput extends OutputModel {
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
      * @return PowerOnRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/poweron_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public PowerOnRoutersOutput powerOnRouters(PowerOnRoutersInput input) throws QCException {
        if (input == null) {
            input = new PowerOnRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOnRouters");
        context.put("APIName", "PowerOnRouters");
        context.put("ServiceName", "PowerOnRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOnRouters");

        input.setAction("PowerOnRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,PowerOnRoutersOutput.class);
        if(backModel != null){
            return (PowerOnRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/poweron_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void powerOnRouters(PowerOnRoutersInput input, ResponseCallBack<PowerOnRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new PowerOnRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOnRouters");
        context.put("APIName", "PowerOnRouters");
        context.put("ServiceName", "PowerOnRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOnRouters");

        input.setAction("PowerOnRouters");
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

    public static class PowerOnRoutersInput extends IaasParamBody {
        // Required
        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PowerOnRoutersOutput extends OutputModel {
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
      * @return UpdateRoutersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/router/update_routers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateRoutersOutput updateRouters(UpdateRoutersInput input) throws QCException {
        if (input == null) {
            input = new UpdateRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateRouters");
        context.put("APIName", "UpdateRouters");
        context.put("ServiceName", "UpdateRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateRouters");

        input.setAction("UpdateRouters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateRoutersOutput.class);
        if(backModel != null){
            return (UpdateRoutersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/router/update_routers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateRouters(UpdateRoutersInput input, ResponseCallBack<UpdateRoutersOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateRoutersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateRouters");
        context.put("APIName", "UpdateRouters");
        context.put("ServiceName", "UpdateRouters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateRouters");

        input.setAction("UpdateRouters");
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

    public static class UpdateRoutersInput extends IaasParamBody {
        // Required
        private List<String> routers;

        @JsonProperty(value = "routers")
        public void setRouters(List<String> routers) {
            this.routers = routers;
        }

        @JsonProperty(value = "routers")
        public List<String> getRouters() {
            return this.routers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateRoutersOutput extends OutputModel {
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



















