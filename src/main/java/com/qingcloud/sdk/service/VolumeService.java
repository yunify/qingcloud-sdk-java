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

public class VolumeService {

    private EnvContext envContext;

    private String zone;

    public VolumeService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public VolumeService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/volume/attach_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AttachVolumesOutput attachVolumes(AttachVolumesInput input) throws QCException {
        if (input == null) {
            input = new AttachVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachVolumes");
        context.put("APIName", "AttachVolumes");
        context.put("ServiceName", "AttachVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachVolumes");

        input.setAction("AttachVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AttachVolumesOutput.class);
        if(backModel != null){
            return (AttachVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/attach_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void attachVolumes(AttachVolumesInput input, ResponseCallBack<AttachVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new AttachVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachVolumes");
        context.put("APIName", "AttachVolumes");
        context.put("ServiceName", "AttachVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachVolumes");

        input.setAction("AttachVolumes");
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

    public static class AttachVolumesInput extends IaasParamBody {
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
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AttachVolumesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/volume/create_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateVolumesOutput createVolumes(CreateVolumesInput input) throws QCException {
        if (input == null) {
            input = new CreateVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVolumes");
        context.put("APIName", "CreateVolumes");
        context.put("ServiceName", "CreateVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateVolumes");

        input.setAction("CreateVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateVolumesOutput.class);
        if(backModel != null){
            return (CreateVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/create_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createVolumes(CreateVolumesInput input, ResponseCallBack<CreateVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVolumes");
        context.put("APIName", "CreateVolumes");
        context.put("ServiceName", "CreateVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateVolumes");

        input.setAction("CreateVolumes");
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

    public static class CreateVolumesInput extends IaasParamBody {
        private Integer count;

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String repl;

        @JsonProperty(value = "repl")
        public void setRepl(String repl) {
            this.repl = repl;
        }

        @JsonProperty(value = "repl")
        public String getRepl() {
            return this.repl;
        }

        // Required
        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
        }

        private String volumeName;

        @JsonProperty(value = "volume_name")
        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        @JsonProperty(value = "volume_name")
        public String getVolumeName() {
            return this.volumeName;
        }

    	// VolumeType's available values: 0, 1, 2, 3, 4, 5, 10, 100, 200
        private Integer volumeType;

        @JsonProperty(value = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @JsonProperty(value = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
        }

        public String validateParam() throws QCException {
            if (this.getSize() < 0 ) {
                throw new QCException("Size is required");
            }
            String[]volumeTypeValidValues = {"0", "1", "2", "3", "4", "5", "10", "100", "200"};
            boolean volumeTypeIsValid = false;
            for (String v : volumeTypeValidValues) {
                if (v.equals(this.getVolumeType()+"")) {
                    volumeTypeIsValid = true;
                }
                Boolean volumeTypeIsRequired = Boolean.FALSE;
                if (volumeTypeIsRequired.equals(Boolean.FALSE) && this.getVolumeType()==null) {
                    volumeTypeIsValid = true;
                }
            }

            if (!volumeTypeIsValid) {
                throw new QCException("VolumeType value " + this.getVolumeType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateVolumesOutput extends OutputModel {
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

        private List<String> volumes;

        @JsonProperty(value = "volumes")
        public void setVolumes(List<String> volumes) {
            this.volumes = volumes;
        }

        @JsonProperty(value = "volumes")
        public List<String> getVolumes() {
            return this.volumes;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/volume/delete_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteVolumesOutput deleteVolumes(DeleteVolumesInput input) throws QCException {
        if (input == null) {
            input = new DeleteVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteVolumes");
        context.put("APIName", "DeleteVolumes");
        context.put("ServiceName", "DeleteVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteVolumes");

        input.setAction("DeleteVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteVolumesOutput.class);
        if(backModel != null){
            return (DeleteVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/delete_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteVolumes(DeleteVolumesInput input, ResponseCallBack<DeleteVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteVolumes");
        context.put("APIName", "DeleteVolumes");
        context.put("ServiceName", "DeleteVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteVolumes");

        input.setAction("DeleteVolumes");
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

    public static class DeleteVolumesInput extends IaasParamBody {
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
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteVolumesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/volume/describe_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeVolumesOutput describeVolumes(DescribeVolumesInput input) throws QCException {
        if (input == null) {
            input = new DescribeVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVolumes");
        context.put("APIName", "DescribeVolumes");
        context.put("ServiceName", "DescribeVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeVolumes");

        input.setAction("DescribeVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeVolumesOutput.class);
        if(backModel != null){
            return (DescribeVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/describe_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeVolumes(DescribeVolumesInput input, ResponseCallBack<DescribeVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeVolumes");
        context.put("APIName", "DescribeVolumes");
        context.put("ServiceName", "DescribeVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeVolumes");

        input.setAction("DescribeVolumes");
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

    public static class DescribeVolumesInput extends IaasParamBody {
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

    	// VolumeType's available values: 0, 1, 2, 3, 4, 5, 10, 100, 200
        private Integer volumeType;

        @JsonProperty(value = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @JsonProperty(value = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
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
            String[]volumeTypeValidValues = {"0", "1", "2", "3", "4", "5", "10", "100", "200"};
            boolean volumeTypeIsValid = false;
            for (String v : volumeTypeValidValues) {
                if (v.equals(this.getVolumeType()+"")) {
                    volumeTypeIsValid = true;
                }
                Boolean volumeTypeIsRequired = Boolean.FALSE;
                if (volumeTypeIsRequired.equals(Boolean.FALSE) && this.getVolumeType()==null) {
                    volumeTypeIsValid = true;
                }
            }

            if (!volumeTypeIsValid) {
                throw new QCException("VolumeType value " + this.getVolumeType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeVolumesOutput extends OutputModel {
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

        private List<VolumeModel> volumeSet;

        @JsonProperty(value = "volume_set")
        public void setVolumeSet(List<VolumeModel> volumeSet) {
            this.volumeSet = volumeSet;
        }

        @JsonProperty(value = "volume_set")
        public List<VolumeModel> getVolumeSet() {
            return this.volumeSet;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/volume/detach_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DetachVolumesOutput detachVolumes(DetachVolumesInput input) throws QCException {
        if (input == null) {
            input = new DetachVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachVolumes");
        context.put("APIName", "DetachVolumes");
        context.put("ServiceName", "DetachVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachVolumes");

        input.setAction("DetachVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DetachVolumesOutput.class);
        if(backModel != null){
            return (DetachVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/detach_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void detachVolumes(DetachVolumesInput input, ResponseCallBack<DetachVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new DetachVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachVolumes");
        context.put("APIName", "DetachVolumes");
        context.put("ServiceName", "DetachVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachVolumes");

        input.setAction("DetachVolumes");
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

    public static class DetachVolumesInput extends IaasParamBody {
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
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DetachVolumesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/volume/modify_volume_attributes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyVolumeAttributesOutput modifyVolumeAttributes(ModifyVolumeAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyVolumeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyVolumeAttributes");
        context.put("APIName", "ModifyVolumeAttributes");
        context.put("ServiceName", "ModifyVolumeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyVolumeAttributes");

        input.setAction("ModifyVolumeAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyVolumeAttributesOutput.class);
        if(backModel != null){
            return (ModifyVolumeAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/modify_volume_attributes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyVolumeAttributes(ModifyVolumeAttributesInput input, ResponseCallBack<ModifyVolumeAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyVolumeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyVolumeAttributes");
        context.put("APIName", "ModifyVolumeAttributes");
        context.put("ServiceName", "ModifyVolumeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyVolumeAttributes");

        input.setAction("ModifyVolumeAttributes");
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

    public static class ModifyVolumeAttributesInput extends IaasParamBody {
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
        private String volume;

        @JsonProperty(value = "volume")
        public void setVolume(String volume) {
            this.volume = volume;
        }

        @JsonProperty(value = "volume")
        public String getVolume() {
            return this.volume;
        }

        private String volumeName;

        @JsonProperty(value = "volume_name")
        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        @JsonProperty(value = "volume_name")
        public String getVolumeName() {
            return this.volumeName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getVolume())) {
                throw new QCException("Volume is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyVolumeAttributesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/volume/resize_volumes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeVolumesOutput resizeVolumes(ResizeVolumesInput input) throws QCException {
        if (input == null) {
            input = new ResizeVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeVolumes");
        context.put("APIName", "ResizeVolumes");
        context.put("ServiceName", "ResizeVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeVolumes");

        input.setAction("ResizeVolumes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeVolumesOutput.class);
        if(backModel != null){
            return (ResizeVolumesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/volume/resize_volumes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeVolumes(ResizeVolumesInput input, ResponseCallBack<ResizeVolumesOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeVolumesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeVolumes");
        context.put("APIName", "ResizeVolumes");
        context.put("ServiceName", "ResizeVolumes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeVolumes");

        input.setAction("ResizeVolumes");
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

    public static class ResizeVolumesInput extends IaasParamBody {
        // Required
        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
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
            if (this.getSize() < 0 ) {
                throw new QCException("Size is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeVolumesOutput extends OutputModel {
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



















