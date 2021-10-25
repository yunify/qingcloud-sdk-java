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
      * @param input Request parameters and headers in the class
      * @return CreateVxNetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/create_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/CreateVxnets");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/create_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/CreateVxnets");

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

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String vxNetName;

        @JsonProperty(value = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @JsonProperty(value = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        // Required
        private Integer vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateVxNetsOutput extends OutputModel {
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
      * @return DeleteVxNetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/delete_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DeleteVxnets");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/delete_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DeleteVxnets");

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

        @JsonProperty(value = "vxnets")
        public void setVxNets(List<String> vxNets) {
            this.vxNets = vxNets;
        }

        @JsonProperty(value = "vxnets")
        public List<String> getVxNets() {
            return this.vxNets;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteVxNetsOutput extends OutputModel {
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
      * @return DescribeVxNetInstancesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/describe_vxnet_instances.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DescribeVxnetInstances");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/describe_vxnet_instances.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DescribeVxnetInstances");

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

        @JsonProperty(value = "image")
        public void setImage(String image) {
            this.image = image;
        }

        @JsonProperty(value = "image")
        public String getImage() {
            return this.image;
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

        private Integer offset;

        @JsonProperty(value = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @JsonProperty(value = "offset")
        public Integer getOffset() {
            return this.offset;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
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
    public static class DescribeVxNetInstancesOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return DescribeVxNetsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/describe_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DescribeVxnets");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/describe_vxnets.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/DescribeVxnets");

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

    	// VxNetType's available values: 0, 1, 2
        private Integer vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
        public Integer getVxNetType() {
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

        private String zone;

        @JsonProperty(value = "zone")
        public void setZone(String zone) {
            this.zone = zone;
        }

        @JsonProperty(value = "zone")
        public String getZone() {
            return this.zone;
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
            String[]vxNetTypeValidValues = {"0", "1", "2"};
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeVxNetsOutput extends OutputModel {
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

        private Integer totalCount;

        @JsonProperty(value = "total_count")
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        @JsonProperty(value = "total_count")
        public Integer getTotalCount() {
            return this.totalCount;
        }

        private List<VxNetModel> vxNetSet;

        @JsonProperty(value = "vxnet_set")
        public void setVxNetSet(List<VxNetModel> vxNetSet) {
            this.vxNetSet = vxNetSet;
        }

        @JsonProperty(value = "vxnet_set")
        public List<VxNetModel> getVxNetSet() {
            return this.vxNetSet;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return JoinVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/join_vxnet.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/JoinVxnet");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/join_vxnet.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/JoinVxnet");

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

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
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
    public static class JoinVxNetOutput extends OutputModel {
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
      * @return LeaveVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/leave_vxnet.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/LeaveVxnet");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/leave_vxnet.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/LeaveVxnet");

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

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
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
    public static class LeaveVxNetOutput extends OutputModel {
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
      * @return ModifyVxNetAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/vxnet/modify_vxnet_attributes.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/ModifyVxnetAttributes");

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
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/vxnet/modify_vxnet_attributes.html>Documentation URL</a>
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
        context.put("RequestURI", "/iaas/ModifyVxnetAttributes");

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

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
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

        private String vxNetName;

        @JsonProperty(value = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @JsonProperty(value = "vxnet_name")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyVxNetAttributesOutput extends OutputModel {
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



















