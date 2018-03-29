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

public class VxNetService {

    private EnvContext envContext;

    private String zone;

    public VxNetService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public VxNetService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/create_vxnets.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateVxNetsOutput createVxNets(CreateVxNetsInput input) throws QCException {
        if (input == null) {
            input = new CreateVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVxnets");
        context.put("APIName", "CreateVxnets");
        context.put("ServiceName", "CreateVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/CreateVxnets");

        input.setAction("CreateVxnets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateVxNetsOutput.class);
        if(backModel != null){
            return (CreateVxNetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/create_vxnets.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createVxNets(CreateVxNetsInput input, ResponseCallBack<CreateVxNetsOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVxNets");
        context.put("APIName", "CreateVxNets");
        context.put("ServiceName", "CreateVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/CreateVxnets");

        input.setAction("CreateVxNets");
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

    public static class CreateVxNetsInput extends IaasParamBody {
        private Integer count;

        @ParamAnnotation(paramType = "query", paramName = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @ParamAnnotation(paramType = "query", paramName = "count")
        public Integer getCount() {
            return this.count;
        }

        private String vxNetName;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        // Required
        private Integer vxNetType;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }

        public String validateParam() throws QCException {
            if (this.getVxNetType() < 0 ) {
                throw new QCException("VxNetType is required");
            }
            String[]vxNetTypeValidValues = {"0", "1"};
            boolean vxNetTypeIsValid = false;
            for (String v : vxNetTypeValidValues) {
                if (v.equals(this.getVxNetType()+"")) {
                    vxNetTypeIsValid = true;
                }
                Boolean vxNetTypeIsRequired = Boolean.TRUE;
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

    public static class CreateVxNetsOutput extends OutputModel {
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

        private List<String> vxNets;

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public void setVxNets(List<String> vxNets) {
            this.vxNets = vxNets;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public List<String> getVxNets() {
            return this.vxNets;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/delete_vxnets.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteVxNetsOutput deleteVxNets(DeleteVxNetsInput input) throws QCException {
        if (input == null) {
            input = new DeleteVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteVxnets");
        context.put("APIName", "DeleteVxnets");
        context.put("ServiceName", "DeleteVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DeleteVxnets");

        input.setAction("DeleteVxnets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteVxNetsOutput.class);
        if(backModel != null){
            return (DeleteVxNetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/delete_vxnets.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteVxNets(DeleteVxNetsInput input, ResponseCallBack<DeleteVxNetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteVxNets");
        context.put("APIName", "DeleteVxNets");
        context.put("ServiceName", "DeleteVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DeleteVxnets");

        input.setAction("DeleteVxNets");
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

    public static class DeleteVxNetsInput extends IaasParamBody {
        // Required
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
            return null;
        }
    }

    public static class DeleteVxNetsOutput extends OutputModel {
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

        private List<String> vxNets;

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public void setVxNets(List<String> vxNets) {
            this.vxNets = vxNets;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public List<String> getVxNets() {
            return this.vxNets;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/describe_vxnet_instances.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeVxNetInstancesOutput describeVxNetInstances(DescribeVxNetInstancesInput input) throws QCException {
        if (input == null) {
            input = new DescribeVxNetInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVxnetInstances");
        context.put("APIName", "DescribeVxnetInstances");
        context.put("ServiceName", "DescribeVxnetInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeVxnetInstances");

        input.setAction("DescribeVxnetInstances");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeVxNetInstancesOutput.class);
        if(backModel != null){
            return (DescribeVxNetInstancesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/describe_vxnet_instances.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeVxNetInstances(DescribeVxNetInstancesInput input, ResponseCallBack<DescribeVxNetInstancesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeVxNetInstancesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVxNetInstances");
        context.put("APIName", "DescribeVxNetInstances");
        context.put("ServiceName", "DescribeVxnetInstances");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeVxnetInstances");

        input.setAction("DescribeVxNetInstances");
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

    public static class DescribeVxNetInstancesInput extends IaasParamBody {
        private String image;

        @ParamAnnotation(paramType = "query", paramName = "image")
        public void setImage(String image) {
            this.image = image;
        }

        @ParamAnnotation(paramType = "query", paramName = "image")
        public String getImage() {
            return this.image;
        }

        private String instanceType;

        @ParamAnnotation(paramType = "query", paramName = "instance_type")
        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_type")
        public String getInstanceType() {
            return this.instanceType;
        }

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

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
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

    public static class DescribeVxNetInstancesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<InstanceModel> instanceSet;

        @ParamAnnotation(paramType = "query", paramName = "instance_set")
        public void setInstanceSet(List<InstanceModel> instanceSet) {
            this.instanceSet = instanceSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_set")
        public List<InstanceModel> getInstanceSet() {
            return this.instanceSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/describe_vxnets.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeVxNetsOutput describeVxNets(DescribeVxNetsInput input) throws QCException {
        if (input == null) {
            input = new DescribeVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVxnets");
        context.put("APIName", "DescribeVxnets");
        context.put("ServiceName", "DescribeVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeVxnets");

        input.setAction("DescribeVxnets");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeVxNetsOutput.class);
        if(backModel != null){
            return (DescribeVxNetsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/describe_vxnets.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeVxNets(DescribeVxNetsInput input, ResponseCallBack<DescribeVxNetsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeVxNetsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVxNets");
        context.put("APIName", "DescribeVxNets");
        context.put("ServiceName", "DescribeVxnets");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeVxnets");

        input.setAction("DescribeVxNets");
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

    public static class DescribeVxNetsInput extends IaasParamBody {
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

        private List<String> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<String> getTags() {
            return this.tags;
        }

    	// Verbose's available values: 0, 1
        private Integer verbose;

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @ParamAnnotation(paramType = "query", paramName = "verbose")
        public Integer getVerbose() {
            return this.verbose;
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

    public static class DescribeVxNetsOutput extends OutputModel {
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

        private Integer totalCount;

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

        private List<VxNetModel> vxNetSet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_set")
        public void setVxNetSet(List<VxNetModel> vxNetSet) {
            this.vxNetSet = vxNetSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_set")
        public List<VxNetModel> getVxNetSet() {
            return this.vxNetSet;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/join_vxnet.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public JoinVxNetOutput joinVxNet(JoinVxNetInput input) throws QCException {
        if (input == null) {
            input = new JoinVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "JoinVxnet");
        context.put("APIName", "JoinVxnet");
        context.put("ServiceName", "JoinVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/JoinVxnet");

        input.setAction("JoinVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,JoinVxNetOutput.class);
        if(backModel != null){
            return (JoinVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/join_vxnet.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void joinVxNet(JoinVxNetInput input, ResponseCallBack<JoinVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new JoinVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "JoinVxNet");
        context.put("APIName", "JoinVxNet");
        context.put("ServiceName", "JoinVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/JoinVxnet");

        input.setAction("JoinVxNet");
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

    public static class JoinVxNetInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<String> getInstances() {
            return this.instances;
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

    public static class JoinVxNetOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/leave_vxnet.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public LeaveVxNetOutput leaveVxNet(LeaveVxNetInput input) throws QCException {
        if (input == null) {
            input = new LeaveVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "LeaveVxnet");
        context.put("APIName", "LeaveVxnet");
        context.put("ServiceName", "LeaveVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/LeaveVxnet");

        input.setAction("LeaveVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,LeaveVxNetOutput.class);
        if(backModel != null){
            return (LeaveVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/leave_vxnet.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void leaveVxNet(LeaveVxNetInput input, ResponseCallBack<LeaveVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new LeaveVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "LeaveVxNet");
        context.put("APIName", "LeaveVxNet");
        context.put("ServiceName", "LeaveVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/LeaveVxnet");

        input.setAction("LeaveVxNet");
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

    public static class LeaveVxNetInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<String> getInstances() {
            return this.instances;
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

    public static class LeaveVxNetOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/vxnet/modify_vxnet_attributes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyVxNetAttributesOutput modifyVxNetAttributes(ModifyVxNetAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyVxNetAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyVxnetAttributes");
        context.put("APIName", "ModifyVxnetAttributes");
        context.put("ServiceName", "ModifyVxnetAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/ModifyVxnetAttributes");

        input.setAction("ModifyVxnetAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyVxNetAttributesOutput.class);
        if(backModel != null){
            return (ModifyVxNetAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/vxnet/modify_vxnet_attributes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyVxNetAttributes(ModifyVxNetAttributesInput input, ResponseCallBack<ModifyVxNetAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyVxNetAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyVxNetAttributes");
        context.put("APIName", "ModifyVxNetAttributes");
        context.put("ServiceName", "ModifyVxnetAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/ModifyVxnetAttributes");

        input.setAction("ModifyVxNetAttributes");
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

    public static class ModifyVxNetAttributesInput extends IaasParamBody {
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
        private String vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(String vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public String getVxNet() {
            return this.vxNet;
        }

        private String vxNetName;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    public static class ModifyVxNetAttributesOutput extends OutputModel {
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



















