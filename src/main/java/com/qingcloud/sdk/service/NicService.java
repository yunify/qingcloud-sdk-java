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

public class NicService {

    private EnvContext envContext;

    private String zone;

    public NicService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public NicService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AttachNicsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/attach_nics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AttachNicsOutput attachNics(AttachNicsInput input) throws QCException {
        if (input == null) {
            input = new AttachNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachNics");
        context.put("APIName", "AttachNics");
        context.put("ServiceName", "AttachNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachNics");

        input.setAction("AttachNics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AttachNicsOutput.class);
        if(backModel != null){
            return (AttachNicsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/attach_nics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void attachNics(AttachNicsInput input, ResponseCallBack<AttachNicsOutput> callback) throws QCException {
        if (input == null) {
            input = new AttachNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachNics");
        context.put("APIName", "AttachNics");
        context.put("ServiceName", "AttachNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachNics");

        input.setAction("AttachNics");
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

    public static class AttachNicsInput extends IaasParamBody {
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

        // Required
        private List<String> nics;

        @JsonProperty(value = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @JsonProperty(value = "nics")
        public List<String> getNics() {
            return this.nics;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AttachNicsOutput extends OutputModel {
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
      * @return CreateNicsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/create_nics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateNicsOutput createNics(CreateNicsInput input) throws QCException {
        if (input == null) {
            input = new CreateNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateNics");
        context.put("APIName", "CreateNics");
        context.put("ServiceName", "CreateNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateNics");

        input.setAction("CreateNics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateNicsOutput.class);
        if(backModel != null){
            return (CreateNicsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/create_nics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createNics(CreateNicsInput input, ResponseCallBack<CreateNicsOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateNics");
        context.put("APIName", "CreateNics");
        context.put("ServiceName", "CreateNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateNics");

        input.setAction("CreateNics");
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

    public static class CreateNicsInput extends IaasParamBody {
        private Integer count;

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String nICName;

        @JsonProperty(value = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @JsonProperty(value = "nic_name")
        public String getNICName() {
            return this.nICName;
        }

        private List<String> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<String> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<String> getPrivateIPs() {
            return this.privateIPs;
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
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateNicsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<NICIPModel> nics;

        @JsonProperty(value = "nics")
        public void setNics(List<NICIPModel> nics) {
            this.nics = nics;
        }

        @JsonProperty(value = "nics")
        public List<NICIPModel> getNics() {
            return this.nics;
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
      * @return DeleteNicsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/delete_nics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteNicsOutput deleteNics(DeleteNicsInput input) throws QCException {
        if (input == null) {
            input = new DeleteNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteNics");
        context.put("APIName", "DeleteNics");
        context.put("ServiceName", "DeleteNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteNics");

        input.setAction("DeleteNics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteNicsOutput.class);
        if(backModel != null){
            return (DeleteNicsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/delete_nics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteNics(DeleteNicsInput input, ResponseCallBack<DeleteNicsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteNics");
        context.put("APIName", "DeleteNics");
        context.put("ServiceName", "DeleteNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteNics");

        input.setAction("DeleteNics");
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

    public static class DeleteNicsInput extends IaasParamBody {
        // Required
        private List<String> nics;

        @JsonProperty(value = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @JsonProperty(value = "nics")
        public List<String> getNics() {
            return this.nics;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteNicsOutput extends OutputModel {
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
      * @return DescribeNicsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/describe_nics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeNicsOutput describeNics(DescribeNicsInput input) throws QCException {
        if (input == null) {
            input = new DescribeNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeNics");
        context.put("APIName", "DescribeNics");
        context.put("ServiceName", "DescribeNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeNics");

        input.setAction("DescribeNics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeNicsOutput.class);
        if(backModel != null){
            return (DescribeNicsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/describe_nics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeNics(DescribeNicsInput input, ResponseCallBack<DescribeNicsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeNics");
        context.put("APIName", "DescribeNics");
        context.put("ServiceName", "DescribeNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeNics");

        input.setAction("DescribeNics");
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

    public static class DescribeNicsInput extends IaasParamBody {
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
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

        private String nICName;

        @JsonProperty(value = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @JsonProperty(value = "nic_name")
        public String getNICName() {
            return this.nICName;
        }

        private List<String> nics;

        @JsonProperty(value = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @JsonProperty(value = "nics")
        public List<String> getNics() {
            return this.nics;
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

    	// Status's available values: available, in-use
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private List<Integer> vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(List<Integer> vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
        public List<Integer> getVxNetType() {
            return this.vxNetType;
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
            String[] statusValidValues = {
                "available", "in-use"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeNicsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<NICModel> nICSet;

        @JsonProperty(value = "nic_set")
        public void setNICSet(List<NICModel> nICSet) {
            this.nICSet = nICSet;
        }

        @JsonProperty(value = "nic_set")
        public List<NICModel> getNICSet() {
            return this.nICSet;
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
      * @return DetachNicsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/detach_nics.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DetachNicsOutput detachNics(DetachNicsInput input) throws QCException {
        if (input == null) {
            input = new DetachNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachNics");
        context.put("APIName", "DetachNics");
        context.put("ServiceName", "DetachNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachNics");

        input.setAction("DetachNics");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DetachNicsOutput.class);
        if(backModel != null){
            return (DetachNicsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/detach_nics.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void detachNics(DetachNicsInput input, ResponseCallBack<DetachNicsOutput> callback) throws QCException {
        if (input == null) {
            input = new DetachNicsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachNics");
        context.put("APIName", "DetachNics");
        context.put("ServiceName", "DetachNics");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachNics");

        input.setAction("DetachNics");
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

    public static class DetachNicsInput extends IaasParamBody {
        // Required
        private List<String> nics;

        @JsonProperty(value = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @JsonProperty(value = "nics")
        public List<String> getNics() {
            return this.nics;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DetachNicsOutput extends OutputModel {
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
      * @return ModifyNicAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/nic/modify-nic-attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyNicAttributesOutput modifyNicAttributes(ModifyNicAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyNicAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyNicAttributes");
        context.put("APIName", "ModifyNicAttributes");
        context.put("ServiceName", "ModifyNicAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyNicAttributes");

        input.setAction("ModifyNicAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyNicAttributesOutput.class);
        if(backModel != null){
            return (ModifyNicAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/nic/modify-nic-attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyNicAttributes(ModifyNicAttributesInput input, ResponseCallBack<ModifyNicAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyNicAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyNicAttributes");
        context.put("APIName", "ModifyNicAttributes");
        context.put("ServiceName", "ModifyNicAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyNicAttributes");

        input.setAction("ModifyNicAttributes");
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

    public static class ModifyNicAttributesInput extends IaasParamBody {
        // Required
        private String nIC;

        @JsonProperty(value = "nic")
        public void setNIC(String nIC) {
            this.nIC = nIC;
        }

        @JsonProperty(value = "nic")
        public String getNIC() {
            return this.nIC;
        }

        private String nICName;

        @JsonProperty(value = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @JsonProperty(value = "nic_name")
        public String getNICName() {
            return this.nICName;
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
            if (QCStringUtil.isEmpty(this.getNIC())) {
                throw new QCException("NIC is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyNicAttributesOutput extends OutputModel {
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

    }}



















