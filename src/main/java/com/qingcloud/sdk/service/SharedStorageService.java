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

public class SharedStorageService {

    private EnvContext envContext;

    private String zone;

    public SharedStorageService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public SharedStorageService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AttachToS2SharedTargetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/attach_to_s2_shared_target.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AttachToS2SharedTargetOutput attachToS2SharedTarget(AttachToS2SharedTargetInput input) throws QCException {
        if (input == null) {
            input = new AttachToS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachToS2SharedTarget");
        context.put("APIName", "AttachToS2SharedTarget");
        context.put("ServiceName", "AttachToS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachToS2SharedTarget");

        input.setAction("AttachToS2SharedTarget");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AttachToS2SharedTargetOutput.class);
        if(backModel != null){
            return (AttachToS2SharedTargetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/attach_to_s2_shared_target.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void attachToS2SharedTarget(AttachToS2SharedTargetInput input, ResponseCallBack<AttachToS2SharedTargetOutput> callback) throws QCException {
        if (input == null) {
            input = new AttachToS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachToS2SharedTarget");
        context.put("APIName", "AttachToS2SharedTarget");
        context.put("ServiceName", "AttachToS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachToS2SharedTarget");

        input.setAction("AttachToS2SharedTarget");
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

    public static class AttachToS2SharedTargetInput extends IaasParamBody {
        // Required
        private String sharedTarget;

        @JsonProperty(value = "shared_target")
        public void setSharedTarget(String sharedTarget) {
            this.sharedTarget = sharedTarget;
        }

        @JsonProperty(value = "shared_target")
        public String getSharedTarget() {
            return this.sharedTarget;
        }

        // Required
        private List<String> volumes;

        @JsonProperty(value = "volumes")
        public void setVolumes(List<String> volumes) {
            this.volumes = volumes;
        }

        @JsonProperty(value = "volumes")
        public List<String> getVolumes() {
            return this.volumes;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSharedTarget())) {
                throw new QCException("SharedTarget is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AttachToS2SharedTargetOutput extends OutputModel {
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

        private S2SharedTargetModel sharedTarget;

        @JsonProperty(value = "shared_target")
        public void setSharedTarget(S2SharedTargetModel sharedTarget) {
            this.sharedTarget = sharedTarget;
        }

        @JsonProperty(value = "shared_target")
        public S2SharedTargetModel getSharedTarget() {
            return this.sharedTarget;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ChangeS2ServerVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/change_s2_server_vxnet.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ChangeS2ServerVxNetOutput changeS2ServerVxNet(ChangeS2ServerVxNetInput input) throws QCException {
        if (input == null) {
            input = new ChangeS2ServerVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeS2ServerVxnet");
        context.put("APIName", "ChangeS2ServerVxnet");
        context.put("ServiceName", "ChangeS2ServerVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeS2ServerVxnet");

        input.setAction("ChangeS2ServerVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ChangeS2ServerVxNetOutput.class);
        if(backModel != null){
            return (ChangeS2ServerVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/change_s2_server_vxnet.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void changeS2ServerVxNet(ChangeS2ServerVxNetInput input, ResponseCallBack<ChangeS2ServerVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new ChangeS2ServerVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeS2ServerVxNet");
        context.put("APIName", "ChangeS2ServerVxNet");
        context.put("ServiceName", "ChangeS2ServerVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeS2ServerVxnet");

        input.setAction("ChangeS2ServerVxNet");
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

    public static class ChangeS2ServerVxNetInput extends IaasParamBody {
        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        // Required
        private String s2Server;

        @JsonProperty(value = "s2_server")
        public void setS2Server(String s2Server) {
            this.s2Server = s2Server;
        }

        @JsonProperty(value = "s2_server")
        public String getS2Server() {
            return this.s2Server;
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
            if (QCStringUtil.isEmpty(this.getS2Server())) {
                throw new QCException("S2Server is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChangeS2ServerVxNetOutput extends OutputModel {
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
      * @return CreateS2ServerOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/create_s2_server.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateS2ServerOutput createS2Server(CreateS2ServerInput input) throws QCException {
        if (input == null) {
            input = new CreateS2ServerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateS2Server");
        context.put("APIName", "CreateS2Server");
        context.put("ServiceName", "CreateS2Server");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateS2Server");

        input.setAction("CreateS2Server");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateS2ServerOutput.class);
        if(backModel != null){
            return (CreateS2ServerOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/create_s2_server.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createS2Server(CreateS2ServerInput input, ResponseCallBack<CreateS2ServerOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateS2ServerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateS2Server");
        context.put("APIName", "CreateS2Server");
        context.put("ServiceName", "CreateS2Server");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateS2Server");

        input.setAction("CreateS2Server");
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

    public static class CreateS2ServerInput extends IaasParamBody {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
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

    	// S2Class's available values: 0, 1
        private Integer s2Class;

        @JsonProperty(value = "s2_class")
        public void setS2Class(Integer s2Class) {
            this.s2Class = s2Class;
        }

        @JsonProperty(value = "s2_class")
        public Integer getS2Class() {
            return this.s2Class;
        }

        private String s2ServerName;

        @JsonProperty(value = "s2_server_name")
        public void setS2ServerName(String s2ServerName) {
            this.s2ServerName = s2ServerName;
        }

        @JsonProperty(value = "s2_server_name")
        public String getS2ServerName() {
            return this.s2ServerName;
        }

        private String serviceType;

        @JsonProperty(value = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @JsonProperty(value = "service_type")
        public String getServiceType() {
            return this.serviceType;
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
            String[]s2ClassValidValues = {"0", "1"};
            boolean s2ClassIsValid = false;
            for (String v : s2ClassValidValues) {
                if (v.equals(this.getS2Class()+"")) {
                    s2ClassIsValid = true;
                }
                Boolean s2ClassIsRequired = Boolean.FALSE;
                if (s2ClassIsRequired.equals(Boolean.FALSE) && this.getS2Class()==null) {
                    s2ClassIsValid = true;
                }
            }

            if (!s2ClassIsValid) {
                throw new QCException("S2Class value " + this.getS2Class() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateS2ServerOutput extends OutputModel {
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

        private String s2Server;

        @JsonProperty(value = "s2_server")
        public void setS2Server(String s2Server) {
            this.s2Server = s2Server;
        }

        @JsonProperty(value = "s2_server")
        public String getS2Server() {
            return this.s2Server;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CreateS2SharedTargetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/create_s2_shared_target.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateS2SharedTargetOutput createS2SharedTarget(CreateS2SharedTargetInput input) throws QCException {
        if (input == null) {
            input = new CreateS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateS2SharedTarget");
        context.put("APIName", "CreateS2SharedTarget");
        context.put("ServiceName", "CreateS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateS2SharedTarget");

        input.setAction("CreateS2SharedTarget");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateS2SharedTargetOutput.class);
        if(backModel != null){
            return (CreateS2SharedTargetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/create_s2_shared_target.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createS2SharedTarget(CreateS2SharedTargetInput input, ResponseCallBack<CreateS2SharedTargetOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateS2SharedTarget");
        context.put("APIName", "CreateS2SharedTarget");
        context.put("ServiceName", "CreateS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateS2SharedTarget");

        input.setAction("CreateS2SharedTarget");
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

    public static class CreateS2SharedTargetInput extends IaasParamBody {
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
        private String exportName;

        @JsonProperty(value = "export_name")
        public void setExportName(String exportName) {
            this.exportName = exportName;
        }

        @JsonProperty(value = "export_name")
        public String getExportName() {
            return this.exportName;
        }

        private String exportNameNfs;

        @JsonProperty(value = "export_name_nfs")
        public void setExportNameNfs(String exportNameNfs) {
            this.exportNameNfs = exportNameNfs;
        }

        @JsonProperty(value = "export_name_nfs")
        public String getExportNameNfs() {
            return this.exportNameNfs;
        }

        private List<String> initiatorNames;

        @JsonProperty(value = "initiator_names")
        public void setInitiatorNames(List<String> initiatorNames) {
            this.initiatorNames = initiatorNames;
        }

        @JsonProperty(value = "initiator_names")
        public List<String> getInitiatorNames() {
            return this.initiatorNames;
        }

        private String s2Group;

        @JsonProperty(value = "s2_group")
        public void setS2Group(String s2Group) {
            this.s2Group = s2Group;
        }

        @JsonProperty(value = "s2_group")
        public String getS2Group() {
            return this.s2Group;
        }

        // Required
        private String s2ServerID;

        @JsonProperty(value = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @JsonProperty(value = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
        }

    	// TargetType's available values: ISCSI, NFS
        // Required
        private String targetType;

        @JsonProperty(value = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @JsonProperty(value = "target_type")
        public String getTargetType() {
            return this.targetType;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getExportName())) {
                throw new QCException("ExportName is required");
            }
            if (QCStringUtil.isEmpty(this.getS2ServerID())) {
                throw new QCException("S2ServerID is required");
            }
            if (QCStringUtil.isEmpty(this.getTargetType())) {
                throw new QCException("TargetType is required");
            }
            String[] targetTypeValidValues = {
                "ISCSI", "NFS"
            };

            boolean targetTypeIsValid = false;
            for (String v : targetTypeValidValues) {
                if (v.equals(this.getTargetType())) {
                    targetTypeIsValid = true;
                }
                Boolean targetTypeIsRequired = Boolean.TRUE;
                if (targetTypeIsRequired.equals(Boolean.FALSE) && this.getTargetType() == null) {
                    targetTypeIsValid = true;
                }
            }

            if (!targetTypeIsValid) {
                throw new QCException("TargetType value " + this.getTargetType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateS2SharedTargetOutput extends OutputModel {
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

        private String s2SharedTarget;

        @JsonProperty(value = "s2_shared_target")
        public void setS2SharedTarget(String s2SharedTarget) {
            this.s2SharedTarget = s2SharedTarget;
        }

        @JsonProperty(value = "s2_shared_target")
        public String getS2SharedTarget() {
            return this.s2SharedTarget;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/delete_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteS2ServersOutput deleteS2Servers(DeleteS2ServersInput input) throws QCException {
        if (input == null) {
            input = new DeleteS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteS2Servers");
        context.put("APIName", "DeleteS2Servers");
        context.put("ServiceName", "DeleteS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteS2Servers");

        input.setAction("DeleteS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteS2ServersOutput.class);
        if(backModel != null){
            return (DeleteS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/delete_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteS2Servers(DeleteS2ServersInput input, ResponseCallBack<DeleteS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteS2Servers");
        context.put("APIName", "DeleteS2Servers");
        context.put("ServiceName", "DeleteS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteS2Servers");

        input.setAction("DeleteS2Servers");
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

    public static class DeleteS2ServersInput extends IaasParamBody {
        // Required
        private List<String> s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(List<String> s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public List<String> getS2Servers() {
            return this.s2Servers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteS2ServersOutput extends OutputModel {
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

        private List<String> s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(List<String> s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public List<String> getS2Servers() {
            return this.s2Servers;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteS2SharedTargetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/delete_s2_shared_targets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteS2SharedTargetsOutput deleteS2SharedTargets(DeleteS2SharedTargetsInput input) throws QCException {
        if (input == null) {
            input = new DeleteS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteS2SharedTargets");
        context.put("APIName", "DeleteS2SharedTargets");
        context.put("ServiceName", "DeleteS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteS2SharedTargets");

        input.setAction("DeleteS2SharedTargets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteS2SharedTargetsOutput.class);
        if(backModel != null){
            return (DeleteS2SharedTargetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/delete_s2_shared_targets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteS2SharedTargets(DeleteS2SharedTargetsInput input, ResponseCallBack<DeleteS2SharedTargetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteS2SharedTargets");
        context.put("APIName", "DeleteS2SharedTargets");
        context.put("ServiceName", "DeleteS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteS2SharedTargets");

        input.setAction("DeleteS2SharedTargets");
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

    public static class DeleteS2SharedTargetsInput extends IaasParamBody {
        // Required
        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteS2SharedTargetsOutput extends OutputModel {
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

        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeS2DefaultParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/describle_s2_default_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeS2DefaultParametersOutput describeS2DefaultParameters(DescribeS2DefaultParametersInput input) throws QCException {
        if (input == null) {
            input = new DescribeS2DefaultParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2DefaultParameters");
        context.put("APIName", "DescribeS2DefaultParameters");
        context.put("ServiceName", "DescribeS2DefaultParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2DefaultParameters");

        input.setAction("DescribeS2DefaultParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeS2DefaultParametersOutput.class);
        if(backModel != null){
            return (DescribeS2DefaultParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/describle_s2_default_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeS2DefaultParameters(DescribeS2DefaultParametersInput input, ResponseCallBack<DescribeS2DefaultParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeS2DefaultParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2DefaultParameters");
        context.put("APIName", "DescribeS2DefaultParameters");
        context.put("ServiceName", "DescribeS2DefaultParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2DefaultParameters");

        input.setAction("DescribeS2DefaultParameters");
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

    public static class DescribeS2DefaultParametersInput extends IaasParamBody {
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

    	// ServiceType's available values: vsan
        private String serviceType;

        @JsonProperty(value = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @JsonProperty(value = "service_type")
        public String getServiceType() {
            return this.serviceType;
        }

    	// TargetType's available values: ISCSI
        private String targetType;

        @JsonProperty(value = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @JsonProperty(value = "target_type")
        public String getTargetType() {
            return this.targetType;
        }

        public String validateParam() throws QCException {
            String[] serviceTypeValidValues = {
                "vsan"
            };

            boolean serviceTypeIsValid = false;
            for (String v : serviceTypeValidValues) {
                if (v.equals(this.getServiceType())) {
                    serviceTypeIsValid = true;
                }
                Boolean serviceTypeIsRequired = Boolean.FALSE;
                if (serviceTypeIsRequired.equals(Boolean.FALSE) && this.getServiceType() == null) {
                    serviceTypeIsValid = true;
                }
            }

            if (!serviceTypeIsValid) {
                throw new QCException("ServiceType value " + this.getServiceType() + "is invalid");
            }
            String[] targetTypeValidValues = {
                "ISCSI"
            };

            boolean targetTypeIsValid = false;
            for (String v : targetTypeValidValues) {
                if (v.equals(this.getTargetType())) {
                    targetTypeIsValid = true;
                }
                Boolean targetTypeIsRequired = Boolean.FALSE;
                if (targetTypeIsRequired.equals(Boolean.FALSE) && this.getTargetType() == null) {
                    targetTypeIsValid = true;
                }
            }

            if (!targetTypeIsValid) {
                throw new QCException("TargetType value " + this.getTargetType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeS2DefaultParametersOutput extends OutputModel {
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

        private List<S2DefaultParametersModel> s2DefaultParametersSet;

        @JsonProperty(value = "s2_default_parameters_set")
        public void setS2DefaultParametersSet(List<S2DefaultParametersModel> s2DefaultParametersSet) {
            this.s2DefaultParametersSet = s2DefaultParametersSet;
        }

        @JsonProperty(value = "s2_default_parameters_set")
        public List<S2DefaultParametersModel> getS2DefaultParametersSet() {
            return this.s2DefaultParametersSet;
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
      * @return DescribeS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/describe_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeS2ServersOutput describeS2Servers(DescribeS2ServersInput input) throws QCException {
        if (input == null) {
            input = new DescribeS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2Servers");
        context.put("APIName", "DescribeS2Servers");
        context.put("ServiceName", "DescribeS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2Servers");

        input.setAction("DescribeS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeS2ServersOutput.class);
        if(backModel != null){
            return (DescribeS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/describe_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeS2Servers(DescribeS2ServersInput input, ResponseCallBack<DescribeS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2Servers");
        context.put("APIName", "DescribeS2Servers");
        context.put("ServiceName", "DescribeS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2Servers");

        input.setAction("DescribeS2Servers");
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

    public static class DescribeS2ServersInput extends IaasParamBody {
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

        private List<String> s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(List<String> s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public List<String> getS2Servers() {
            return this.s2Servers;
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
    public static class DescribeS2ServersOutput extends OutputModel {
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

        private List<S2ServerModel> s2ServerSet;

        @JsonProperty(value = "s2_server_set")
        public void setS2ServerSet(List<S2ServerModel> s2ServerSet) {
            this.s2ServerSet = s2ServerSet;
        }

        @JsonProperty(value = "s2_server_set")
        public List<S2ServerModel> getS2ServerSet() {
            return this.s2ServerSet;
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
      * @return DescribeS2SharedTargetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/describe_s2_shared_targets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeS2SharedTargetsOutput describeS2SharedTargets(DescribeS2SharedTargetsInput input) throws QCException {
        if (input == null) {
            input = new DescribeS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2SharedTargets");
        context.put("APIName", "DescribeS2SharedTargets");
        context.put("ServiceName", "DescribeS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2SharedTargets");

        input.setAction("DescribeS2SharedTargets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeS2SharedTargetsOutput.class);
        if(backModel != null){
            return (DescribeS2SharedTargetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/describe_s2_shared_targets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeS2SharedTargets(DescribeS2SharedTargetsInput input, ResponseCallBack<DescribeS2SharedTargetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeS2SharedTargets");
        context.put("APIName", "DescribeS2SharedTargets");
        context.put("ServiceName", "DescribeS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeS2SharedTargets");

        input.setAction("DescribeS2SharedTargets");
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

    public static class DescribeS2SharedTargetsInput extends IaasParamBody {
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

        private String s2ServerID;

        @JsonProperty(value = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @JsonProperty(value = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
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

        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
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
    public static class DescribeS2SharedTargetsOutput extends OutputModel {
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

        private List<S2SharedTargetModel> sharedTargetSet;

        @JsonProperty(value = "shared_target_set")
        public void setSharedTargetSet(List<S2SharedTargetModel> sharedTargetSet) {
            this.sharedTargetSet = sharedTargetSet;
        }

        @JsonProperty(value = "shared_target_set")
        public List<S2SharedTargetModel> getSharedTargetSet() {
            return this.sharedTargetSet;
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
      * @return DetachFromS2SharedTargetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/detach_from_s2_shared_target.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DetachFromS2SharedTargetOutput detachFromS2SharedTarget(DetachFromS2SharedTargetInput input) throws QCException {
        if (input == null) {
            input = new DetachFromS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachFromS2SharedTarget");
        context.put("APIName", "DetachFromS2SharedTarget");
        context.put("ServiceName", "DetachFromS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachFromS2SharedTarget");

        input.setAction("DetachFromS2SharedTarget");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DetachFromS2SharedTargetOutput.class);
        if(backModel != null){
            return (DetachFromS2SharedTargetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/detach_from_s2_shared_target.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void detachFromS2SharedTarget(DetachFromS2SharedTargetInput input, ResponseCallBack<DetachFromS2SharedTargetOutput> callback) throws QCException {
        if (input == null) {
            input = new DetachFromS2SharedTargetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachFromS2SharedTarget");
        context.put("APIName", "DetachFromS2SharedTarget");
        context.put("ServiceName", "DetachFromS2SharedTarget");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachFromS2SharedTarget");

        input.setAction("DetachFromS2SharedTarget");
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

    public static class DetachFromS2SharedTargetInput extends IaasParamBody {
        // Required
        private String sharedTarget;

        @JsonProperty(value = "shared_target")
        public void setSharedTarget(String sharedTarget) {
            this.sharedTarget = sharedTarget;
        }

        @JsonProperty(value = "shared_target")
        public String getSharedTarget() {
            return this.sharedTarget;
        }

        // Required
        private List<String> volumes;

        @JsonProperty(value = "volumes")
        public void setVolumes(List<String> volumes) {
            this.volumes = volumes;
        }

        @JsonProperty(value = "volumes")
        public List<String> getVolumes() {
            return this.volumes;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSharedTarget())) {
                throw new QCException("SharedTarget is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DetachFromS2SharedTargetOutput extends OutputModel {
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

        private S2SharedTargetModel sharedTarget;

        @JsonProperty(value = "shared_target")
        public void setSharedTarget(S2SharedTargetModel sharedTarget) {
            this.sharedTarget = sharedTarget;
        }

        @JsonProperty(value = "shared_target")
        public S2SharedTargetModel getSharedTarget() {
            return this.sharedTarget;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DisableS2SharedTargetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/disable_s2_shared_targets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DisableS2SharedTargetsOutput disableS2SharedTargets(DisableS2SharedTargetsInput input) throws QCException {
        if (input == null) {
            input = new DisableS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DisableS2SharedTargets");
        context.put("APIName", "DisableS2SharedTargets");
        context.put("ServiceName", "DisableS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DisableS2SharedTargets");

        input.setAction("DisableS2SharedTargets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DisableS2SharedTargetsOutput.class);
        if(backModel != null){
            return (DisableS2SharedTargetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/disable_s2_shared_targets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void disableS2SharedTargets(DisableS2SharedTargetsInput input, ResponseCallBack<DisableS2SharedTargetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DisableS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DisableS2SharedTargets");
        context.put("APIName", "DisableS2SharedTargets");
        context.put("ServiceName", "DisableS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DisableS2SharedTargets");

        input.setAction("DisableS2SharedTargets");
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

    public static class DisableS2SharedTargetsInput extends IaasParamBody {
        // Required
        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DisableS2SharedTargetsOutput extends OutputModel {
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

        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return EnableS2SharedTargetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/enable_s2_shared_targets.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public EnableS2SharedTargetsOutput enableS2SharedTargets(EnableS2SharedTargetsInput input) throws QCException {
        if (input == null) {
            input = new EnableS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "EnableS2SharedTargets");
        context.put("APIName", "EnableS2SharedTargets");
        context.put("ServiceName", "EnableS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/EnableS2SharedTargets");

        input.setAction("EnableS2SharedTargets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,EnableS2SharedTargetsOutput.class);
        if(backModel != null){
            return (EnableS2SharedTargetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/enable_s2_shared_targets.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void enableS2SharedTargets(EnableS2SharedTargetsInput input, ResponseCallBack<EnableS2SharedTargetsOutput> callback) throws QCException {
        if (input == null) {
            input = new EnableS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "EnableS2SharedTargets");
        context.put("APIName", "EnableS2SharedTargets");
        context.put("ServiceName", "EnableS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/EnableS2SharedTargets");

        input.setAction("EnableS2SharedTargets");
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

    public static class EnableS2SharedTargetsInput extends IaasParamBody {
        // Required
        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EnableS2SharedTargetsOutput extends OutputModel {
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

        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ModifyS2ServerOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/modify_s2_server.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyS2ServerOutput modifyS2Server(ModifyS2ServerInput input) throws QCException {
        if (input == null) {
            input = new ModifyS2ServerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyS2Server");
        context.put("APIName", "ModifyS2Server");
        context.put("ServiceName", "ModifyS2Server");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyS2Server");

        input.setAction("ModifyS2Server");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyS2ServerOutput.class);
        if(backModel != null){
            return (ModifyS2ServerOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/modify_s2_server.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyS2Server(ModifyS2ServerInput input, ResponseCallBack<ModifyS2ServerOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyS2ServerInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyS2Server");
        context.put("APIName", "ModifyS2Server");
        context.put("ServiceName", "ModifyS2Server");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyS2Server");

        input.setAction("ModifyS2Server");
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

    public static class ModifyS2ServerInput extends IaasParamBody {
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
        private String s2Server;

        @JsonProperty(value = "s2_server")
        public void setS2Server(String s2Server) {
            this.s2Server = s2Server;
        }

        @JsonProperty(value = "s2_server")
        public String getS2Server() {
            return this.s2Server;
        }

        private String s2ServerName;

        @JsonProperty(value = "s2_server_name")
        public void setS2ServerName(String s2ServerName) {
            this.s2ServerName = s2ServerName;
        }

        @JsonProperty(value = "s2_server_name")
        public String getS2ServerName() {
            return this.s2ServerName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getS2Server())) {
                throw new QCException("S2Server is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyS2ServerOutput extends OutputModel {
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
      * @return ModifyS2SharedTargetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/modify_s2_shared_target.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyS2SharedTargetsOutput modifyS2SharedTargets(ModifyS2SharedTargetsInput input) throws QCException {
        if (input == null) {
            input = new ModifyS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyS2SharedTargets");
        context.put("APIName", "ModifyS2SharedTargets");
        context.put("ServiceName", "ModifyS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyS2SharedTargets");

        input.setAction("ModifyS2SharedTargets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyS2SharedTargetsOutput.class);
        if(backModel != null){
            return (ModifyS2SharedTargetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/modify_s2_shared_target.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyS2SharedTargets(ModifyS2SharedTargetsInput input, ResponseCallBack<ModifyS2SharedTargetsOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyS2SharedTargetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyS2SharedTargets");
        context.put("APIName", "ModifyS2SharedTargets");
        context.put("ServiceName", "ModifyS2SharedTargets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyS2SharedTargets");

        input.setAction("ModifyS2SharedTargets");
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

    public static class ModifyS2SharedTargetsInput extends IaasParamBody {
        private List<String> initiatorNames;

        @JsonProperty(value = "initiator_names")
        public void setInitiatorNames(List<String> initiatorNames) {
            this.initiatorNames = initiatorNames;
        }

        @JsonProperty(value = "initiator_names")
        public List<String> getInitiatorNames() {
            return this.initiatorNames;
        }

        // Required
        private String operation;

        @JsonProperty(value = "operation")
        public void setOperation(String operation) {
            this.operation = operation;
        }

        @JsonProperty(value = "operation")
        public String getOperation() {
            return this.operation;
        }

        // Required
        private List<String> parameters;

        @JsonProperty(value = "parameters")
        public void setParameters(List<String> parameters) {
            this.parameters = parameters;
        }

        @JsonProperty(value = "parameters")
        public List<String> getParameters() {
            return this.parameters;
        }

        // Required
        private List<String> sharedTargets;

        @JsonProperty(value = "shared_targets")
        public void setSharedTargets(List<String> sharedTargets) {
            this.sharedTargets = sharedTargets;
        }

        @JsonProperty(value = "shared_targets")
        public List<String> getSharedTargets() {
            return this.sharedTargets;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getOperation())) {
                throw new QCException("Operation is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyS2SharedTargetsOutput extends OutputModel {
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
      * @return PowerOffS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/poweroff_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public PowerOffS2ServersOutput powerOffS2Servers(PowerOffS2ServersInput input) throws QCException {
        if (input == null) {
            input = new PowerOffS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOffS2Servers");
        context.put("APIName", "PowerOffS2Servers");
        context.put("ServiceName", "PowerOffS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOffS2Servers");

        input.setAction("PowerOffS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,PowerOffS2ServersOutput.class);
        if(backModel != null){
            return (PowerOffS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/poweroff_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void powerOffS2Servers(PowerOffS2ServersInput input, ResponseCallBack<PowerOffS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new PowerOffS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOffS2Servers");
        context.put("APIName", "PowerOffS2Servers");
        context.put("ServiceName", "PowerOffS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOffS2Servers");

        input.setAction("PowerOffS2Servers");
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

    public static class PowerOffS2ServersInput extends IaasParamBody {
        // Required
        private String s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(String s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public String getS2Servers() {
            return this.s2Servers;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getS2Servers())) {
                throw new QCException("S2Servers is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PowerOffS2ServersOutput extends OutputModel {
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
      * @return PowerOnS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/poweron_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public PowerOnS2ServersOutput powerOnS2Servers(PowerOnS2ServersInput input) throws QCException {
        if (input == null) {
            input = new PowerOnS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOnS2Servers");
        context.put("APIName", "PowerOnS2Servers");
        context.put("ServiceName", "PowerOnS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOnS2Servers");

        input.setAction("PowerOnS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,PowerOnS2ServersOutput.class);
        if(backModel != null){
            return (PowerOnS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/poweron_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void powerOnS2Servers(PowerOnS2ServersInput input, ResponseCallBack<PowerOnS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new PowerOnS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "PowerOnS2Servers");
        context.put("APIName", "PowerOnS2Servers");
        context.put("ServiceName", "PowerOnS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/PowerOnS2Servers");

        input.setAction("PowerOnS2Servers");
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

    public static class PowerOnS2ServersInput extends IaasParamBody {
        // Required
        private List<String> s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(List<String> s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public List<String> getS2Servers() {
            return this.s2Servers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PowerOnS2ServersOutput extends OutputModel {
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
      * @return ResizeS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/resize_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeS2ServersOutput resizeS2Servers(ResizeS2ServersInput input) throws QCException {
        if (input == null) {
            input = new ResizeS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeS2Servers");
        context.put("APIName", "ResizeS2Servers");
        context.put("ServiceName", "ResizeS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeS2Servers");

        input.setAction("ResizeS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeS2ServersOutput.class);
        if(backModel != null){
            return (ResizeS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/resize_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeS2Servers(ResizeS2ServersInput input, ResponseCallBack<ResizeS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeS2Servers");
        context.put("APIName", "ResizeS2Servers");
        context.put("ServiceName", "ResizeS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeS2Servers");

        input.setAction("ResizeS2Servers");
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

    public static class ResizeS2ServersInput extends IaasParamBody {
        // Required
        private String s2Server;

        @JsonProperty(value = "s2_server")
        public void setS2Server(String s2Server) {
            this.s2Server = s2Server;
        }

        @JsonProperty(value = "s2_server")
        public String getS2Server() {
            return this.s2Server;
        }

        // Required
        private Integer s2ServerType;

        @JsonProperty(value = "s2_server_type")
        public void setS2ServerType(Integer s2ServerType) {
            this.s2ServerType = s2ServerType;
        }

        @JsonProperty(value = "s2_server_type")
        public Integer getS2ServerType() {
            return this.s2ServerType;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getS2Server())) {
                throw new QCException("S2Server is required");
            }
            if (this.getS2ServerType() < 0 ) {
                throw new QCException("S2ServerType is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeS2ServersOutput extends OutputModel {
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
      * @return UpdateS2ServersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vsan/update_s2_servers.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateS2ServersOutput updateS2Servers(UpdateS2ServersInput input) throws QCException {
        if (input == null) {
            input = new UpdateS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateS2Servers");
        context.put("APIName", "UpdateS2Servers");
        context.put("ServiceName", "UpdateS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateS2Servers");

        input.setAction("UpdateS2Servers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateS2ServersOutput.class);
        if(backModel != null){
            return (UpdateS2ServersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vsan/update_s2_servers.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateS2Servers(UpdateS2ServersInput input, ResponseCallBack<UpdateS2ServersOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateS2ServersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateS2Servers");
        context.put("APIName", "UpdateS2Servers");
        context.put("ServiceName", "UpdateS2Servers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateS2Servers");

        input.setAction("UpdateS2Servers");
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

    public static class UpdateS2ServersInput extends IaasParamBody {
        // Required
        private List<String> s2Servers;

        @JsonProperty(value = "s2_servers")
        public void setS2Servers(List<String> s2Servers) {
            this.s2Servers = s2Servers;
        }

        @JsonProperty(value = "s2_servers")
        public List<String> getS2Servers() {
            return this.s2Servers;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateS2ServersOutput extends OutputModel {
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



















