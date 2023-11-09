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

public class ImageService {

    private EnvContext envContext;

    private String zone;

    public ImageService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public ImageService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return CaptureInstanceOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/capture_instance.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CaptureInstanceOutput captureInstance(CaptureInstanceInput input) throws QCException {
        if (input == null) {
            input = new CaptureInstanceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CaptureInstance");
        context.put("APIName", "CaptureInstance");
        context.put("ServiceName", "CaptureInstance");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CaptureInstance");

        input.setAction("CaptureInstance");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CaptureInstanceOutput.class);
        if(backModel != null){
            return (CaptureInstanceOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/capture_instance.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void captureInstance(CaptureInstanceInput input, ResponseCallBack<CaptureInstanceOutput> callback) throws QCException {
        if (input == null) {
            input = new CaptureInstanceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CaptureInstance");
        context.put("APIName", "CaptureInstance");
        context.put("ServiceName", "CaptureInstance");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CaptureInstance");

        input.setAction("CaptureInstance");
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

    public static class CaptureInstanceInput extends IaasParamBody {
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
        private String instance;

        @JsonProperty(value = "instance")
        public void setInstance(String instance) {
            this.instance = instance;
        }

        @JsonProperty(value = "instance")
        public String getInstance() {
            return this.instance;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getInstance())) {
                throw new QCException("Instance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CaptureInstanceOutput extends OutputModel {
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
      * @return DeleteImagesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/delete_images.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteImagesOutput deleteImages(DeleteImagesInput input) throws QCException {
        if (input == null) {
            input = new DeleteImagesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteImages");
        context.put("APIName", "DeleteImages");
        context.put("ServiceName", "DeleteImages");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteImages");

        input.setAction("DeleteImages");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteImagesOutput.class);
        if(backModel != null){
            return (DeleteImagesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/delete_images.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteImages(DeleteImagesInput input, ResponseCallBack<DeleteImagesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteImagesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteImages");
        context.put("APIName", "DeleteImages");
        context.put("ServiceName", "DeleteImages");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteImages");

        input.setAction("DeleteImages");
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

    public static class DeleteImagesInput extends IaasParamBody {
        // Required
        private List<String> images;

        @JsonProperty(value = "images")
        public void setImages(List<String> images) {
            this.images = images;
        }

        @JsonProperty(value = "images")
        public List<String> getImages() {
            return this.images;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteImagesOutput extends OutputModel {
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
      * @return DescribeImageUsersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/describe-image-users.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeImageUsersOutput describeImageUsers(DescribeImageUsersInput input) throws QCException {
        if (input == null) {
            input = new DescribeImageUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeImageUsers");
        context.put("APIName", "DescribeImageUsers");
        context.put("ServiceName", "DescribeImageUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeImageUsers");

        input.setAction("DescribeImageUsers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeImageUsersOutput.class);
        if(backModel != null){
            return (DescribeImageUsersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/describe-image-users.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeImageUsers(DescribeImageUsersInput input, ResponseCallBack<DescribeImageUsersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeImageUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeImageUsers");
        context.put("APIName", "DescribeImageUsers");
        context.put("ServiceName", "DescribeImageUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeImageUsers");

        input.setAction("DescribeImageUsers");
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

    public static class DescribeImageUsersInput extends IaasParamBody {
        // Required
        private String imageID;

        @JsonProperty(value = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @JsonProperty(value = "image_id")
        public String getImageID() {
            return this.imageID;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getImageID())) {
                throw new QCException("ImageID is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeImageUsersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ImageUserModel> imageUserSet;

        @JsonProperty(value = "image_user_set")
        public void setImageUserSet(List<ImageUserModel> imageUserSet) {
            this.imageUserSet = imageUserSet;
        }

        @JsonProperty(value = "image_user_set")
        public List<ImageUserModel> getImageUserSet() {
            return this.imageUserSet;
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
      * @return DescribeImagesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/describe_images.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeImagesOutput describeImages(DescribeImagesInput input) throws QCException {
        if (input == null) {
            input = new DescribeImagesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeImages");
        context.put("APIName", "DescribeImages");
        context.put("ServiceName", "DescribeImages");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeImages");

        input.setAction("DescribeImages");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeImagesOutput.class);
        if(backModel != null){
            return (DescribeImagesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/describe_images.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeImages(DescribeImagesInput input, ResponseCallBack<DescribeImagesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeImagesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeImages");
        context.put("APIName", "DescribeImages");
        context.put("ServiceName", "DescribeImages");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeImages");

        input.setAction("DescribeImages");
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

    public static class DescribeImagesInput extends IaasParamBody {
        private List<String> images;

        @JsonProperty(value = "images")
        public void setImages(List<String> images) {
            this.images = images;
        }

        @JsonProperty(value = "images")
        public List<String> getImages() {
            return this.images;
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

        private String oSFamily;

        @JsonProperty(value = "os_family")
        public void setOSFamily(String oSFamily) {
            this.oSFamily = oSFamily;
        }

        @JsonProperty(value = "os_family")
        public String getOSFamily() {
            return this.oSFamily;
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

    	// ProcessorType's available values: 64bit, 32bit
        private String processorType;

        @JsonProperty(value = "processor_type")
        public void setProcessorType(String processorType) {
            this.processorType = processorType;
        }

        @JsonProperty(value = "processor_type")
        public String getProcessorType() {
            return this.processorType;
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

    	// Provider's available values: system, self
        private String provider;

        @JsonProperty(value = "provider")
        public void setProvider(String provider) {
            this.provider = provider;
        }

        @JsonProperty(value = "provider")
        public String getProvider() {
            return this.provider;
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

    	// Verbose's available values: 0
        private Integer verbose;

        @JsonProperty(value = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @JsonProperty(value = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

    	// Visibility's available values: public, private
        private String visibility;

        @JsonProperty(value = "visibility")
        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        @JsonProperty(value = "visibility")
        public String getVisibility() {
            return this.visibility;
        }

        public String validateParam() throws QCException {
            String[] processorTypeValidValues = {
                "64bit", "32bit"
            };

            boolean processorTypeIsValid = false;
            for (String v : processorTypeValidValues) {
                if (v.equals(this.getProcessorType())) {
                    processorTypeIsValid = true;
                }
                Boolean processorTypeIsRequired = Boolean.FALSE;
                if (processorTypeIsRequired.equals(Boolean.FALSE) && this.getProcessorType() == null) {
                    processorTypeIsValid = true;
                }
            }

            if (!processorTypeIsValid) {
                throw new QCException("ProcessorType value " + this.getProcessorType() + "is invalid");
            }
            String[] providerValidValues = {
                "system", "self"
            };

            boolean providerIsValid = false;
            for (String v : providerValidValues) {
                if (v.equals(this.getProvider())) {
                    providerIsValid = true;
                }
                Boolean providerIsRequired = Boolean.FALSE;
                if (providerIsRequired.equals(Boolean.FALSE) && this.getProvider() == null) {
                    providerIsValid = true;
                }
            }

            if (!providerIsValid) {
                throw new QCException("Provider value " + this.getProvider() + "is invalid");
            }
            String[]verboseValidValues = {"0"};
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
            String[] visibilityValidValues = {
                "public", "private"
            };

            boolean visibilityIsValid = false;
            for (String v : visibilityValidValues) {
                if (v.equals(this.getVisibility())) {
                    visibilityIsValid = true;
                }
                Boolean visibilityIsRequired = Boolean.FALSE;
                if (visibilityIsRequired.equals(Boolean.FALSE) && this.getVisibility() == null) {
                    visibilityIsValid = true;
                }
            }

            if (!visibilityIsValid) {
                throw new QCException("Visibility value " + this.getVisibility() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeImagesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ImageModel> imageSet;

        @JsonProperty(value = "image_set")
        public void setImageSet(List<ImageModel> imageSet) {
            this.imageSet = imageSet;
        }

        @JsonProperty(value = "image_set")
        public List<ImageModel> getImageSet() {
            return this.imageSet;
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
      * @return GrantImageToUsersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/grant-image-to-users.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GrantImageToUsersOutput grantImageToUsers(GrantImageToUsersInput input) throws QCException {
        if (input == null) {
            input = new GrantImageToUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GrantImageToUsers");
        context.put("APIName", "GrantImageToUsers");
        context.put("ServiceName", "GrantImageToUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GrantImageToUsers");

        input.setAction("GrantImageToUsers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GrantImageToUsersOutput.class);
        if(backModel != null){
            return (GrantImageToUsersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/grant-image-to-users.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void grantImageToUsers(GrantImageToUsersInput input, ResponseCallBack<GrantImageToUsersOutput> callback) throws QCException {
        if (input == null) {
            input = new GrantImageToUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GrantImageToUsers");
        context.put("APIName", "GrantImageToUsers");
        context.put("ServiceName", "GrantImageToUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GrantImageToUsers");

        input.setAction("GrantImageToUsers");
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

    public static class GrantImageToUsersInput extends IaasParamBody {
        // Required
        private String image;

        @JsonProperty(value = "image")
        public void setImage(String image) {
            this.image = image;
        }

        @JsonProperty(value = "image")
        public String getImage() {
            return this.image;
        }

        // Required
        private List<String> users;

        @JsonProperty(value = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @JsonProperty(value = "users")
        public List<String> getUsers() {
            return this.users;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getImage())) {
                throw new QCException("Image is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GrantImageToUsersOutput extends OutputModel {
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
      * @return ModifyImageAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/modify_image_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyImageAttributesOutput modifyImageAttributes(ModifyImageAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyImageAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyImageAttributes");
        context.put("APIName", "ModifyImageAttributes");
        context.put("ServiceName", "ModifyImageAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyImageAttributes");

        input.setAction("ModifyImageAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyImageAttributesOutput.class);
        if(backModel != null){
            return (ModifyImageAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/modify_image_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyImageAttributes(ModifyImageAttributesInput input, ResponseCallBack<ModifyImageAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyImageAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyImageAttributes");
        context.put("APIName", "ModifyImageAttributes");
        context.put("ServiceName", "ModifyImageAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyImageAttributes");

        input.setAction("ModifyImageAttributes");
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

    public static class ModifyImageAttributesInput extends IaasParamBody {
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
        private String image;

        @JsonProperty(value = "image")
        public void setImage(String image) {
            this.image = image;
        }

        @JsonProperty(value = "image")
        public String getImage() {
            return this.image;
        }

        private String imageName;

        @JsonProperty(value = "image_name")
        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        @JsonProperty(value = "image_name")
        public String getImageName() {
            return this.imageName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getImage())) {
                throw new QCException("Image is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyImageAttributesOutput extends OutputModel {
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
      * @return RevokeImageFromUsersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/image/revoke-image-from-users.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RevokeImageFromUsersOutput revokeImageFromUsers(RevokeImageFromUsersInput input) throws QCException {
        if (input == null) {
            input = new RevokeImageFromUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RevokeImageFromUsers");
        context.put("APIName", "RevokeImageFromUsers");
        context.put("ServiceName", "RevokeImageFromUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RevokeImageFromUsers");

        input.setAction("RevokeImageFromUsers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RevokeImageFromUsersOutput.class);
        if(backModel != null){
            return (RevokeImageFromUsersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/image/revoke-image-from-users.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void revokeImageFromUsers(RevokeImageFromUsersInput input, ResponseCallBack<RevokeImageFromUsersOutput> callback) throws QCException {
        if (input == null) {
            input = new RevokeImageFromUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RevokeImageFromUsers");
        context.put("APIName", "RevokeImageFromUsers");
        context.put("ServiceName", "RevokeImageFromUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RevokeImageFromUsers");

        input.setAction("RevokeImageFromUsers");
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

    public static class RevokeImageFromUsersInput extends IaasParamBody {
        // Required
        private String image;

        @JsonProperty(value = "image")
        public void setImage(String image) {
            this.image = image;
        }

        @JsonProperty(value = "image")
        public String getImage() {
            return this.image;
        }

        // Required
        private List<String> users;

        @JsonProperty(value = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @JsonProperty(value = "users")
        public List<String> getUsers() {
            return this.users;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getImage())) {
                throw new QCException("Image is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RevokeImageFromUsersOutput extends OutputModel {
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



















