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

public class ProjectService {

    private EnvContext envContext;

    private String zone;

    public ProjectService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public ProjectService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddProjectResourceItemsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddProjectResourceItemsOutput addProjectResourceItems(AddProjectResourceItemsInput input) throws QCException {
        if (input == null) {
            input = new AddProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddProjectResourceItems");
        context.put("APIName", "AddProjectResourceItems");
        context.put("ServiceName", "AddProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddProjectResourceItems");

        input.setAction("AddProjectResourceItems");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddProjectResourceItemsOutput.class);
        if(backModel != null){
            return (AddProjectResourceItemsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addProjectResourceItems(AddProjectResourceItemsInput input, ResponseCallBack<AddProjectResourceItemsOutput> callback) throws QCException {
        if (input == null) {
            input = new AddProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddProjectResourceItems");
        context.put("APIName", "AddProjectResourceItems");
        context.put("ServiceName", "AddProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddProjectResourceItems");

        input.setAction("AddProjectResourceItems");
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

    public static class AddProjectResourceItemsInput extends IaasParamBody {
        // Required
        private String projectID;

        @JsonProperty(value = "project_id")
        public void setProjectID(String projectID) {
            this.projectID = projectID;
        }

        @JsonProperty(value = "project_id")
        public String getProjectID() {
            return this.projectID;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getProjectID())) {
                throw new QCException("ProjectID is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddProjectResourceItemsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private List<String> resourceIDs;

        @JsonProperty(value = "resource_ids")
        public void setResourceIDs(List<String> resourceIDs) {
            this.resourceIDs = resourceIDs;
        }

        @JsonProperty(value = "resource_ids")
        public List<String> getResourceIDs() {
            return this.resourceIDs;
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

        private String zoneID;

        @JsonProperty(value = "zone_id")
        public void setZoneID(String zoneID) {
            this.zoneID = zoneID;
        }

        @JsonProperty(value = "zone_id")
        public String getZoneID() {
            return this.zoneID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DeleteProjectResourceItemsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteProjectResourceItemsOutput deleteProjectResourceItems(DeleteProjectResourceItemsInput input) throws QCException {
        if (input == null) {
            input = new DeleteProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteProjectResourceItems");
        context.put("APIName", "DeleteProjectResourceItems");
        context.put("ServiceName", "DeleteProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteProjectResourceItems");

        input.setAction("DeleteProjectResourceItems");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteProjectResourceItemsOutput.class);
        if(backModel != null){
            return (DeleteProjectResourceItemsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteProjectResourceItems(DeleteProjectResourceItemsInput input, ResponseCallBack<DeleteProjectResourceItemsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteProjectResourceItems");
        context.put("APIName", "DeleteProjectResourceItems");
        context.put("ServiceName", "DeleteProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteProjectResourceItems");

        input.setAction("DeleteProjectResourceItems");
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

    public static class DeleteProjectResourceItemsInput extends IaasParamBody {
        // Required
        private List<String> projectID;

        @JsonProperty(value = "project_id")
        public void setProjectID(List<String> projectID) {
            this.projectID = projectID;
        }

        @JsonProperty(value = "project_id")
        public List<String> getProjectID() {
            return this.projectID;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteProjectResourceItemsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> projectID;

        @JsonProperty(value = "project_id")
        public void setProjectID(List<String> projectID) {
            this.projectID = projectID;
        }

        @JsonProperty(value = "project_id")
        public List<String> getProjectID() {
            return this.projectID;
        }

        private List<String> resourceIDs;

        @JsonProperty(value = "resource_ids")
        public void setResourceIDs(List<String> resourceIDs) {
            this.resourceIDs = resourceIDs;
        }

        @JsonProperty(value = "resource_ids")
        public List<String> getResourceIDs() {
            return this.resourceIDs;
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

        private String zoneID;

        @JsonProperty(value = "zone_id")
        public void setZoneID(String zoneID) {
            this.zoneID = zoneID;
        }

        @JsonProperty(value = "zone_id")
        public String getZoneID() {
            return this.zoneID;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeProjectResourceItemsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeProjectResourceItemsOutput describeProjectResourceItems(DescribeProjectResourceItemsInput input) throws QCException {
        if (input == null) {
            input = new DescribeProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeProjectResourceItems");
        context.put("APIName", "DescribeProjectResourceItems");
        context.put("ServiceName", "DescribeProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeProjectResourceItems");

        input.setAction("DescribeProjectResourceItems");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeProjectResourceItemsOutput.class);
        if(backModel != null){
            return (DescribeProjectResourceItemsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeProjectResourceItems(DescribeProjectResourceItemsInput input, ResponseCallBack<DescribeProjectResourceItemsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeProjectResourceItemsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeProjectResourceItems");
        context.put("APIName", "DescribeProjectResourceItems");
        context.put("ServiceName", "DescribeProjectResourceItems");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeProjectResourceItems");

        input.setAction("DescribeProjectResourceItems");
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

    public static class DescribeProjectResourceItemsInput extends IaasParamBody {
        private Integer inGlobal;

        @JsonProperty(value = "in_global")
        public void setInGlobal(Integer inGlobal) {
            this.inGlobal = inGlobal;
        }

        @JsonProperty(value = "in_global")
        public Integer getInGlobal() {
            return this.inGlobal;
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

        private String owner;

        @JsonProperty(value = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @JsonProperty(value = "owner")
        public String getOwner() {
            return this.owner;
        }

        private List<String> projectIDs;

        @JsonProperty(value = "project_ids")
        public void setProjectIDs(List<String> projectIDs) {
            this.projectIDs = projectIDs;
        }

        @JsonProperty(value = "project_ids")
        public List<String> getProjectIDs() {
            return this.projectIDs;
        }

        private Integer reserve;

        @JsonProperty(value = "reserve")
        public void setReserve(Integer reserve) {
            this.reserve = reserve;
        }

        @JsonProperty(value = "reserve")
        public Integer getReserve() {
            return this.reserve;
        }

        private List<String> resourceTypes;

        @JsonProperty(value = "resource_types")
        public void setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
        }

        @JsonProperty(value = "resource_types")
        public List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        private List<String> resources;

        @JsonProperty(value = "resources")
        public void setResources(List<String> resources) {
            this.resources = resources;
        }

        @JsonProperty(value = "resources")
        public List<String> getResources() {
            return this.resources;
        }

        private String sortKey;

        @JsonProperty(value = "sort_key")
        public void setSortKey(String sortKey) {
            this.sortKey = sortKey;
        }

        @JsonProperty(value = "sort_key")
        public String getSortKey() {
            return this.sortKey;
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
    public static class DescribeProjectResourceItemsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ProjectResourceItemModel> projectResourceItemSet;

        @JsonProperty(value = "project_resource_item_set")
        public void setProjectResourceItemSet(List<ProjectResourceItemModel> projectResourceItemSet) {
            this.projectResourceItemSet = projectResourceItemSet;
        }

        @JsonProperty(value = "project_resource_item_set")
        public List<ProjectResourceItemModel> getProjectResourceItemSet() {
            return this.projectResourceItemSet;
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
      * @return DescribeProjectsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeProjectsOutput describeProjects(DescribeProjectsInput input) throws QCException {
        if (input == null) {
            input = new DescribeProjectsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeProjects");
        context.put("APIName", "DescribeProjects");
        context.put("ServiceName", "DescribeProjects");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeProjects");

        input.setAction("DescribeProjects");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeProjectsOutput.class);
        if(backModel != null){
            return (DescribeProjectsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeProjects(DescribeProjectsInput input, ResponseCallBack<DescribeProjectsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeProjectsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeProjects");
        context.put("APIName", "DescribeProjects");
        context.put("ServiceName", "DescribeProjects");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeProjects");

        input.setAction("DescribeProjects");
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

    public static class DescribeProjectsInput extends IaasParamBody {
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

        private List<String> projectIDs;

        @JsonProperty(value = "project_ids")
        public void setProjectIDs(List<String> projectIDs) {
            this.projectIDs = projectIDs;
        }

        @JsonProperty(value = "project_ids")
        public List<String> getProjectIDs() {
            return this.projectIDs;
        }

        private String shared;

        @JsonProperty(value = "shared")
        public void setShared(String shared) {
            this.shared = shared;
        }

        @JsonProperty(value = "shared")
        public String getShared() {
            return this.shared;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeProjectsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ProjectModel> projectSet;

        @JsonProperty(value = "project_set")
        public void setProjectSet(List<ProjectModel> projectSet) {
            this.projectSet = projectSet;
        }

        @JsonProperty(value = "project_set")
        public List<ProjectModel> getProjectSet() {
            return this.projectSet;
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

    }}



















