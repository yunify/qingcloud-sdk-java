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

public class SnapshotService {

    private EnvContext envContext;

    private String zone;

    public SnapshotService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public SnapshotService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ApplySnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/apply_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplySnapshotsOutput applySnapshots(ApplySnapshotsInput input) throws QCException {
        if (input == null) {
            input = new ApplySnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySnapshots");
        context.put("APIName", "ApplySnapshots");
        context.put("ServiceName", "ApplySnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySnapshots");

        input.setAction("ApplySnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplySnapshotsOutput.class);
        if(backModel != null){
            return (ApplySnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/apply_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applySnapshots(ApplySnapshotsInput input, ResponseCallBack<ApplySnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplySnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplySnapshots");
        context.put("APIName", "ApplySnapshots");
        context.put("ServiceName", "ApplySnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplySnapshots");

        input.setAction("ApplySnapshots");
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

    public static class ApplySnapshotsInput extends IaasParamBody {
        // Required
        private List<String> snapshots;

        @JsonProperty(value = "snapshots")
        public void setSnapshots(List<String> snapshots) {
            this.snapshots = snapshots;
        }

        @JsonProperty(value = "snapshots")
        public List<String> getSnapshots() {
            return this.snapshots;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplySnapshotsOutput extends OutputModel {
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
      * @return CaptureInstanceFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/capture_instance_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CaptureInstanceFromSnapshotOutput captureInstanceFromSnapshot(CaptureInstanceFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CaptureInstanceFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CaptureInstanceFromSnapshot");
        context.put("APIName", "CaptureInstanceFromSnapshot");
        context.put("ServiceName", "CaptureInstanceFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CaptureInstanceFromSnapshot");

        input.setAction("CaptureInstanceFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CaptureInstanceFromSnapshotOutput.class);
        if(backModel != null){
            return (CaptureInstanceFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/capture_instance_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void captureInstanceFromSnapshot(CaptureInstanceFromSnapshotInput input, ResponseCallBack<CaptureInstanceFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CaptureInstanceFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CaptureInstanceFromSnapshot");
        context.put("APIName", "CaptureInstanceFromSnapshot");
        context.put("ServiceName", "CaptureInstanceFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CaptureInstanceFromSnapshot");

        input.setAction("CaptureInstanceFromSnapshot");
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

    public static class CaptureInstanceFromSnapshotInput extends IaasParamBody {
        private String imageName;

        @JsonProperty(value = "image_name")
        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        @JsonProperty(value = "image_name")
        public String getImageName() {
            return this.imageName;
        }

        // Required
        private String snapshot;

        @JsonProperty(value = "snapshot")
        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        @JsonProperty(value = "snapshot")
        public String getSnapshot() {
            return this.snapshot;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CaptureInstanceFromSnapshotOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String imageID;

        @JsonProperty(value = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @JsonProperty(value = "image_id")
        public String getImageID() {
            return this.imageID;
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
      * @return CreateSnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/create_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateSnapshotsOutput createSnapshots(CreateSnapshotsInput input) throws QCException {
        if (input == null) {
            input = new CreateSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSnapshots");
        context.put("APIName", "CreateSnapshots");
        context.put("ServiceName", "CreateSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSnapshots");

        input.setAction("CreateSnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateSnapshotsOutput.class);
        if(backModel != null){
            return (CreateSnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/create_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createSnapshots(CreateSnapshotsInput input, ResponseCallBack<CreateSnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateSnapshots");
        context.put("APIName", "CreateSnapshots");
        context.put("ServiceName", "CreateSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateSnapshots");

        input.setAction("CreateSnapshots");
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

    public static class CreateSnapshotsInput extends IaasParamBody {
    	// IsFull's available values: 0, 1
        private Integer isFull;

        @JsonProperty(value = "is_full")
        public void setIsFull(Integer isFull) {
            this.isFull = isFull;
        }

        @JsonProperty(value = "is_full")
        public Integer getIsFull() {
            return this.isFull;
        }

        // Required
        private List<String> resources;

        @JsonProperty(value = "resources")
        public void setResources(List<String> resources) {
            this.resources = resources;
        }

        @JsonProperty(value = "resources")
        public List<String> getResources() {
            return this.resources;
        }

        private String serviceParams;

        @JsonProperty(value = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @JsonProperty(value = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
        }

        private String snapshotName;

        @JsonProperty(value = "snapshot_name")
        public void setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
        }

        @JsonProperty(value = "snapshot_name")
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public String validateParam() throws QCException {
            String[]isFullValidValues = {"0", "1"};
            boolean isFullIsValid = false;
            for (String v : isFullValidValues) {
                if (v.equals(this.getIsFull()+"")) {
                    isFullIsValid = true;
                }
                Boolean isFullIsRequired = Boolean.FALSE;
                if (isFullIsRequired.equals(Boolean.FALSE) && this.getIsFull()==null) {
                    isFullIsValid = true;
                }
            }

            if (!isFullIsValid) {
                throw new QCException("IsFull value " + this.getIsFull() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateSnapshotsOutput extends OutputModel {
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

        private List<String> snapshots;

        @JsonProperty(value = "snapshots")
        public void setSnapshots(List<String> snapshots) {
            this.snapshots = snapshots;
        }

        @JsonProperty(value = "snapshots")
        public List<String> getSnapshots() {
            return this.snapshots;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CreateVolumeFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/create_volume_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateVolumeFromSnapshotOutput createVolumeFromSnapshot(CreateVolumeFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateVolumeFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVolumeFromSnapshot");
        context.put("APIName", "CreateVolumeFromSnapshot");
        context.put("ServiceName", "CreateVolumeFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateVolumeFromSnapshot");

        input.setAction("CreateVolumeFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateVolumeFromSnapshotOutput.class);
        if(backModel != null){
            return (CreateVolumeFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/create_volume_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createVolumeFromSnapshot(CreateVolumeFromSnapshotInput input, ResponseCallBack<CreateVolumeFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateVolumeFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateVolumeFromSnapshot");
        context.put("APIName", "CreateVolumeFromSnapshot");
        context.put("ServiceName", "CreateVolumeFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateVolumeFromSnapshot");

        input.setAction("CreateVolumeFromSnapshot");
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

    public static class CreateVolumeFromSnapshotInput extends IaasParamBody {
        // Required
        private String snapshot;

        @JsonProperty(value = "snapshot")
        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        @JsonProperty(value = "snapshot")
        public String getSnapshot() {
            return this.snapshot;
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
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateVolumeFromSnapshotOutput extends OutputModel {
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

        private String volumeID;

        @JsonProperty(value = "volume_id")
        public void setVolumeID(String volumeID) {
            this.volumeID = volumeID;
        }

        @JsonProperty(value = "volume_id")
        public String getVolumeID() {
            return this.volumeID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteSnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/delete_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteSnapshotsOutput deleteSnapshots(DeleteSnapshotsInput input) throws QCException {
        if (input == null) {
            input = new DeleteSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSnapshots");
        context.put("APIName", "DeleteSnapshots");
        context.put("ServiceName", "DeleteSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSnapshots");

        input.setAction("DeleteSnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteSnapshotsOutput.class);
        if(backModel != null){
            return (DeleteSnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/delete_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteSnapshots(DeleteSnapshotsInput input, ResponseCallBack<DeleteSnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteSnapshots");
        context.put("APIName", "DeleteSnapshots");
        context.put("ServiceName", "DeleteSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteSnapshots");

        input.setAction("DeleteSnapshots");
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

    public static class DeleteSnapshotsInput extends IaasParamBody {
        // Required
        private List<String> snapshots;

        @JsonProperty(value = "snapshots")
        public void setSnapshots(List<String> snapshots) {
            this.snapshots = snapshots;
        }

        @JsonProperty(value = "snapshots")
        public List<String> getSnapshots() {
            return this.snapshots;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteSnapshotsOutput extends OutputModel {
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
      * @return DescribeSnapshotsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/describe_snapshots.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeSnapshotsOutput describeSnapshots(DescribeSnapshotsInput input) throws QCException {
        if (input == null) {
            input = new DescribeSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSnapshots");
        context.put("APIName", "DescribeSnapshots");
        context.put("ServiceName", "DescribeSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSnapshots");

        input.setAction("DescribeSnapshots");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeSnapshotsOutput.class);
        if(backModel != null){
            return (DescribeSnapshotsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/describe_snapshots.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeSnapshots(DescribeSnapshotsInput input, ResponseCallBack<DescribeSnapshotsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeSnapshotsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeSnapshots");
        context.put("APIName", "DescribeSnapshots");
        context.put("ServiceName", "DescribeSnapshots");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeSnapshots");

        input.setAction("DescribeSnapshots");
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

    public static class DescribeSnapshotsInput extends IaasParamBody {
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

        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
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

        private String snapshotTime;

        @JsonProperty(value = "snapshot_time")
        public void setSnapshotTime(String snapshotTime) {
            this.snapshotTime = snapshotTime;
        }

        @JsonProperty(value = "snapshot_time")
        public String getSnapshotTime() {
            return this.snapshotTime;
        }

    	// SnapshotType's available values: 0, 1
        private Integer snapshotType;

        @JsonProperty(value = "snapshot_type")
        public void setSnapshotType(Integer snapshotType) {
            this.snapshotType = snapshotType;
        }

        @JsonProperty(value = "snapshot_type")
        public Integer getSnapshotType() {
            return this.snapshotType;
        }

        private List<String> snapshots;

        @JsonProperty(value = "snapshots")
        public void setSnapshots(List<String> snapshots) {
            this.snapshots = snapshots;
        }

        @JsonProperty(value = "snapshots")
        public List<String> getSnapshots() {
            return this.snapshots;
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

        public String validateParam() throws QCException {
            String[]snapshotTypeValidValues = {"0", "1"};
            boolean snapshotTypeIsValid = false;
            for (String v : snapshotTypeValidValues) {
                if (v.equals(this.getSnapshotType()+"")) {
                    snapshotTypeIsValid = true;
                }
                Boolean snapshotTypeIsRequired = Boolean.FALSE;
                if (snapshotTypeIsRequired.equals(Boolean.FALSE) && this.getSnapshotType()==null) {
                    snapshotTypeIsValid = true;
                }
            }

            if (!snapshotTypeIsValid) {
                throw new QCException("SnapshotType value " + this.getSnapshotType() + "is invalid");
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
    public static class DescribeSnapshotsOutput extends OutputModel {
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

        private List<SnapshotModel> snapshotSet;

        @JsonProperty(value = "snapshot_set")
        public void setSnapshotSet(List<SnapshotModel> snapshotSet) {
            this.snapshotSet = snapshotSet;
        }

        @JsonProperty(value = "snapshot_set")
        public List<SnapshotModel> getSnapshotSet() {
            return this.snapshotSet;
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
      * @return ModifySnapshotAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/snapshot/modify_snapshot_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifySnapshotAttributesOutput modifySnapshotAttributes(ModifySnapshotAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifySnapshotAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySnapshotAttributes");
        context.put("APIName", "ModifySnapshotAttributes");
        context.put("ServiceName", "ModifySnapshotAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySnapshotAttributes");

        input.setAction("ModifySnapshotAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifySnapshotAttributesOutput.class);
        if(backModel != null){
            return (ModifySnapshotAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/snapshot/modify_snapshot_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifySnapshotAttributes(ModifySnapshotAttributesInput input, ResponseCallBack<ModifySnapshotAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifySnapshotAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifySnapshotAttributes");
        context.put("APIName", "ModifySnapshotAttributes");
        context.put("ServiceName", "ModifySnapshotAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifySnapshotAttributes");

        input.setAction("ModifySnapshotAttributes");
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

    public static class ModifySnapshotAttributesInput extends IaasParamBody {
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
        private String snapshot;

        @JsonProperty(value = "snapshot")
        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        @JsonProperty(value = "snapshot")
        public String getSnapshot() {
            return this.snapshot;
        }

        private String snapshotName;

        @JsonProperty(value = "snapshot_name")
        public void setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
        }

        @JsonProperty(value = "snapshot_name")
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifySnapshotAttributesOutput extends OutputModel {
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



















