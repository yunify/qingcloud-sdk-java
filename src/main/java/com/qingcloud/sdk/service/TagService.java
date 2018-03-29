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

public class TagService {

    private EnvContext envContext;

    private String zone;

    public TagService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public TagService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/tag/attach_tags.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AttachTagsOutput attachTags(AttachTagsInput input) throws QCException {
        if (input == null) {
            input = new AttachTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachTags");
        context.put("APIName", "AttachTags");
        context.put("ServiceName", "AttachTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/AttachTags");

        input.setAction("AttachTags");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AttachTagsOutput.class);
        if(backModel != null){
            return (AttachTagsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/attach_tags.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void attachTags(AttachTagsInput input, ResponseCallBack<AttachTagsOutput> callback) throws QCException {
        if (input == null) {
            input = new AttachTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachTags");
        context.put("APIName", "AttachTags");
        context.put("ServiceName", "AttachTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/AttachTags");

        input.setAction("AttachTags");
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

    public static class AttachTagsInput extends IaasParamBody {
        // Required
        private List<ResourceTagPairModel> resourceTagPairs;

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public void setResourceTagPairs(List<ResourceTagPairModel> resourceTagPairs) {
            this.resourceTagPairs = resourceTagPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public List<ResourceTagPairModel> getResourceTagPairs() {
            return this.resourceTagPairs;
        }

        public String validateParam() throws QCException {
            if (this.getResourceTagPairs() != null && this.getResourceTagPairs().size() > 0 ) {
                for (int i = 0 ; i < this.getResourceTagPairs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class AttachTagsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/tag/create_tag.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateTagOutput createTag(CreateTagInput input) throws QCException {
        if (input == null) {
            input = new CreateTagInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateTag");
        context.put("APIName", "CreateTag");
        context.put("ServiceName", "CreateTag");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/CreateTag");

        input.setAction("CreateTag");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateTagOutput.class);
        if(backModel != null){
            return (CreateTagOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/create_tag.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createTag(CreateTagInput input, ResponseCallBack<CreateTagOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateTagInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateTag");
        context.put("APIName", "CreateTag");
        context.put("ServiceName", "CreateTag");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/CreateTag");

        input.setAction("CreateTag");
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

    public static class CreateTagInput extends IaasParamBody {
        private String color;

        @ParamAnnotation(paramType = "query", paramName = "color")
        public void setColor(String color) {
            this.color = color;
        }

        @ParamAnnotation(paramType = "query", paramName = "color")
        public String getColor() {
            return this.color;
        }

        private String tagName;

        @ParamAnnotation(paramType = "query", paramName = "tag_name")
        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag_name")
        public String getTagName() {
            return this.tagName;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class CreateTagOutput extends OutputModel {
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

        private String tagID;

        @ParamAnnotation(paramType = "query", paramName = "tag_id")
        public void setTagID(String tagID) {
            this.tagID = tagID;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag_id")
        public String getTagID() {
            return this.tagID;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/tag/delete_tags.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteTagsOutput deleteTags(DeleteTagsInput input) throws QCException {
        if (input == null) {
            input = new DeleteTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteTags");
        context.put("APIName", "DeleteTags");
        context.put("ServiceName", "DeleteTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DeleteTags");

        input.setAction("DeleteTags");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteTagsOutput.class);
        if(backModel != null){
            return (DeleteTagsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/delete_tags.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteTags(DeleteTagsInput input, ResponseCallBack<DeleteTagsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteTags");
        context.put("APIName", "DeleteTags");
        context.put("ServiceName", "DeleteTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DeleteTags");

        input.setAction("DeleteTags");
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

    public static class DeleteTagsInput extends IaasParamBody {
        // Required
        private List<String> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<String> getTags() {
            return this.tags;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteTagsOutput extends OutputModel {
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

        private List<String> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<String> getTags() {
            return this.tags;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/tag/describe_tags.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeTagsOutput describeTags(DescribeTagsInput input) throws QCException {
        if (input == null) {
            input = new DescribeTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeTags");
        context.put("APIName", "DescribeTags");
        context.put("ServiceName", "DescribeTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeTags");

        input.setAction("DescribeTags");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeTagsOutput.class);
        if(backModel != null){
            return (DescribeTagsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/describe_tags.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeTags(DescribeTagsInput input, ResponseCallBack<DescribeTagsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeTags");
        context.put("APIName", "DescribeTags");
        context.put("ServiceName", "DescribeTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DescribeTags");

        input.setAction("DescribeTags");
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

    public static class DescribeTagsInput extends IaasParamBody {
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

    public static class DescribeTagsOutput extends OutputModel {
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

        private List<TagModel> tagSet;

        @ParamAnnotation(paramType = "query", paramName = "tag_set")
        public void setTagSet(List<TagModel> tagSet) {
            this.tagSet = tagSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag_set")
        public List<TagModel> getTagSet() {
            return this.tagSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/tag/detach_tags.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DetachTagsOutput detachTags(DetachTagsInput input) throws QCException {
        if (input == null) {
            input = new DetachTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachTags");
        context.put("APIName", "DetachTags");
        context.put("ServiceName", "DetachTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DetachTags");

        input.setAction("DetachTags");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DetachTagsOutput.class);
        if(backModel != null){
            return (DetachTagsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/detach_tags.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void detachTags(DetachTagsInput input, ResponseCallBack<DetachTagsOutput> callback) throws QCException {
        if (input == null) {
            input = new DetachTagsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachTags");
        context.put("APIName", "DetachTags");
        context.put("ServiceName", "DetachTags");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/DetachTags");

        input.setAction("DetachTags");
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

    public static class DetachTagsInput extends IaasParamBody {
        // Required
        private List<ResourceTagPairModel> resourceTagPairs;

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public void setResourceTagPairs(List<ResourceTagPairModel> resourceTagPairs) {
            this.resourceTagPairs = resourceTagPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public List<ResourceTagPairModel> getResourceTagPairs() {
            return this.resourceTagPairs;
        }

        public String validateParam() throws QCException {
            if (this.getResourceTagPairs() != null && this.getResourceTagPairs().size() > 0 ) {
                for (int i = 0 ; i < this.getResourceTagPairs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class DetachTagsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/tag/modify_tag_attributes.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyTagAttributesOutput modifyTagAttributes(ModifyTagAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyTagAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyTagAttributes");
        context.put("APIName", "ModifyTagAttributes");
        context.put("ServiceName", "ModifyTagAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/ModifyTagAttributes");

        input.setAction("ModifyTagAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyTagAttributesOutput.class);
        if(backModel != null){
            return (ModifyTagAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/tag/modify_tag_attributes.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyTagAttributes(ModifyTagAttributesInput input, ResponseCallBack<ModifyTagAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyTagAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyTagAttributes");
        context.put("APIName", "ModifyTagAttributes");
        context.put("ServiceName", "ModifyTagAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/ModifyTagAttributes");

        input.setAction("ModifyTagAttributes");
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

    public static class ModifyTagAttributesInput extends IaasParamBody {
        private String color;

        @ParamAnnotation(paramType = "query", paramName = "color")
        public void setColor(String color) {
            this.color = color;
        }

        @ParamAnnotation(paramType = "query", paramName = "color")
        public String getColor() {
            return this.color;
        }

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
        private String tag;

        @ParamAnnotation(paramType = "query", paramName = "tag")
        public void setTag(String tag) {
            this.tag = tag;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag")
        public String getTag() {
            return this.tag;
        }

        private String tagName;

        @ParamAnnotation(paramType = "query", paramName = "tag_name")
        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag_name")
        public String getTagName() {
            return this.tagName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getTag())) {
                throw new QCException("Tag is required");
            }
            return null;
        }
    }

    public static class ModifyTagAttributesOutput extends OutputModel {
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



















