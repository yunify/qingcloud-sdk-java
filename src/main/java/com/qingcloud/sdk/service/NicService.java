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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/nic/attach_nics.html
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
        context.put("RequestURI", "/AttachNics");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/attach_nics.html
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
        context.put("RequestURI", "/AttachNics");

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

        @ParamAnnotation(paramType = "query", paramName = "instance")
        public void setInstance(String instance) {
            this.instance = instance;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance")
        public String getInstance() {
            return this.instance;
        }

        // Required
        private List<String> nics;

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @ParamAnnotation(paramType = "query", paramName = "nics")
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

    public static class AttachNicsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/nic/create_nics.html
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
        context.put("RequestURI", "/CreateNics");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/create_nics.html
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
        context.put("RequestURI", "/CreateNics");

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

        @ParamAnnotation(paramType = "query", paramName = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @ParamAnnotation(paramType = "query", paramName = "count")
        public Integer getCount() {
            return this.count;
        }

        private String nICName;

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public String getNICName() {
            return this.nICName;
        }

        private List<String> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<String> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public List<String> getPrivateIPs() {
            return this.privateIPs;
        }

        // Required
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
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    public static class CreateNicsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<NICIPModel> nics;

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public void setNics(List<NICIPModel> nics) {
            this.nics = nics;
        }

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public List<NICIPModel> getNics() {
            return this.nics;
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
      * Documentation URL: https://docs.qingcloud.com/api/nic/delete_nics.html
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
        context.put("RequestURI", "/DeleteNics");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/delete_nics.html
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
        context.put("RequestURI", "/DeleteNics");

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

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public List<String> getNics() {
            return this.nics;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteNicsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/nic/describe_nics.html
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
        context.put("RequestURI", "/DescribeNics");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/describe_nics.html
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
        context.put("RequestURI", "/DescribeNics");

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

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        private Integer limit;

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @ParamAnnotation(paramType = "query", paramName = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        private String nICName;

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public String getNICName() {
            return this.nICName;
        }

        private List<String> nics;

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public List<String> getNics() {
            return this.nics;
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

    	// Status's available values: available, in-use
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

    	// VxNetType's available values: 0, 1
        private Integer vxNetType;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }

        private List<String> vxNets;

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public void setVxNets(List<String> vxNets) {
            this.vxNets = vxNets;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
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
            String[]vxNetTypeValidValues = {"0", "1"};
            boolean vxNetTypeIsValid = false;
            for (String v : vxNetTypeValidValues) {
                if (v.equals(this.getVxNetType()+"")) {
                    vxNetTypeIsValid = true;
                }
                Boolean vxNetTypeIsRequired = Boolean.FALSE;
                if (vxNetTypeIsRequired.equals(Boolean.FALSE) && this.getVxNetType()==null) {
                    vxNetTypeIsValid = true;
                }
            }

            if (!vxNetTypeIsValid) {
                throw new QCException("VxNetType value " + this.getVxNetType() + "is invalid");
            }
            return null;
        }
    }

    public static class DescribeNicsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<NICModel> nICSet;

        @ParamAnnotation(paramType = "query", paramName = "nic_set")
        public void setNICSet(List<NICModel> nICSet) {
            this.nICSet = nICSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_set")
        public List<NICModel> getNICSet() {
            return this.nICSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/nic/detach_nics.html
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
        context.put("RequestURI", "/DetachNics");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/detach_nics.html
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
        context.put("RequestURI", "/DetachNics");

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

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public void setNics(List<String> nics) {
            this.nics = nics;
        }

        @ParamAnnotation(paramType = "query", paramName = "nics")
        public List<String> getNics() {
            return this.nics;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DetachNicsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/nic/modify-nic-attributes.html
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
        context.put("RequestURI", "/ModifyNicAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/nic/modify-nic-attributes.html
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
        context.put("RequestURI", "/ModifyNicAttributes");

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
        private String nICID;

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String nICName;

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public String getNICName() {
            return this.nICName;
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
            if (QCStringUtil.isEmpty(this.getNICID())) {
                throw new QCException("NICID is required");
            }
            return null;
        }
    }

    public static class ModifyNicAttributesOutput extends OutputModel {
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

    }}



















