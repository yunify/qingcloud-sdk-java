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

public class AppService {

    private EnvContext envContext;

    private String zone;

    public AppService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public AppService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/bot/DeployAppVersion.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeployAppVersionOutput deployAppVersion(DeployAppVersionInput input) throws QCException {
        if (input == null) {
            input = new DeployAppVersionInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeployAppVersion");
        context.put("APIName", "DeployAppVersion");
        context.put("ServiceName", "DeployAppVersion");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeployAppVersion");

        input.setAction("DeployAppVersion");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeployAppVersionOutput.class);
        if(backModel != null){
            return (DeployAppVersionOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/bot/DeployAppVersion.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deployAppVersion(DeployAppVersionInput input, ResponseCallBack<DeployAppVersionOutput> callback) throws QCException {
        if (input == null) {
            input = new DeployAppVersionInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeployAppVersion");
        context.put("APIName", "DeployAppVersion");
        context.put("ServiceName", "DeployAppVersion");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeployAppVersion");

        input.setAction("DeployAppVersion");
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

    public static class DeployAppVersionInput extends IaasParamBody {
        private String appID;

        @JsonProperty(value = "app_id")
        public void setAppID(String appID) {
            this.appID = appID;
        }

        @JsonProperty(value = "app_id")
        public String getAppID() {
            return this.appID;
        }

        private String appType;

        @JsonProperty(value = "app_type")
        public void setAppType(String appType) {
            this.appType = appType;
        }

        @JsonProperty(value = "app_type")
        public String getAppType() {
            return this.appType;
        }

        private String chargeMode;

        @JsonProperty(value = "charge_mode")
        public void setChargeMode(String chargeMode) {
            this.chargeMode = chargeMode;
        }

        @JsonProperty(value = "charge_mode")
        public String getChargeMode() {
            return this.chargeMode;
        }

        private String conf;

        @JsonProperty(value = "conf")
        public void setConf(String conf) {
            this.conf = conf;
        }

        @JsonProperty(value = "conf")
        public String getConf() {
            return this.conf;
        }

        private Integer debug;

        @JsonProperty(value = "debug")
        public void setDebug(Integer debug) {
            this.debug = debug;
        }

        @JsonProperty(value = "debug")
        public Integer getDebug() {
            return this.debug;
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

        private String versionID;

        @JsonProperty(value = "version_id")
        public void setVersionID(String versionID) {
            this.versionID = versionID;
        }

        @JsonProperty(value = "version_id")
        public String getVersionID() {
            return this.versionID;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeployAppVersionOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String appID;

        @JsonProperty(value = "app_id")
        public void setAppID(String appID) {
            this.appID = appID;
        }

        @JsonProperty(value = "app_id")
        public String getAppID() {
            return this.appID;
        }

        private String appVersion;

        @JsonProperty(value = "app_version")
        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        @JsonProperty(value = "app_version")
        public String getAppVersion() {
            return this.appVersion;
        }

        private String clusterID;

        @JsonProperty(value = "cluster_id")
        public void setClusterID(String clusterID) {
            this.clusterID = clusterID;
        }

        @JsonProperty(value = "cluster_id")
        public String getClusterID() {
            return this.clusterID;
        }

        private String clusterName;

        @JsonProperty(value = "cluster_name")
        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
        }

        @JsonProperty(value = "cluster_name")
        public String getClusterName() {
            return this.clusterName;
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

        private Integer nodeCount;

        @JsonProperty(value = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @JsonProperty(value = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<String> nodeIDs;

        @JsonProperty(value = "node_ids")
        public void setNodeIDs(List<String> nodeIDs) {
            this.nodeIDs = nodeIDs;
        }

        @JsonProperty(value = "node_ids")
        public List<String> getNodeIDs() {
            return this.nodeIDs;
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

        private String vxNetID;

        @JsonProperty(value = "vxnet_id")
        public void setVxNetID(String vxNetID) {
            this.vxNetID = vxNetID;
        }

        @JsonProperty(value = "vxnet_id")
        public String getVxNetID() {
            return this.vxNetID;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_version_attachments.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeAppVersionAttachmentsOutput describeAppVersionAttachments(DescribeAppVersionAttachmentsInput input) throws QCException {
        if (input == null) {
            input = new DescribeAppVersionAttachmentsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAppVersionAttachments");
        context.put("APIName", "DescribeAppVersionAttachments");
        context.put("ServiceName", "DescribeAppVersionAttachments");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAppVersionAttachments");

        input.setAction("DescribeAppVersionAttachments");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeAppVersionAttachmentsOutput.class);
        if(backModel != null){
            return (DescribeAppVersionAttachmentsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_version_attachments.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeAppVersionAttachments(DescribeAppVersionAttachmentsInput input, ResponseCallBack<DescribeAppVersionAttachmentsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeAppVersionAttachmentsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAppVersionAttachments");
        context.put("APIName", "DescribeAppVersionAttachments");
        context.put("ServiceName", "DescribeAppVersionAttachments");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAppVersionAttachments");

        input.setAction("DescribeAppVersionAttachments");
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

    public static class DescribeAppVersionAttachmentsInput extends IaasParamBody {
        private List<String> attachmentIDs;

        @JsonProperty(value = "attachment_ids")
        public void setAttachmentIDs(List<String> attachmentIDs) {
            this.attachmentIDs = attachmentIDs;
        }

        @JsonProperty(value = "attachment_ids")
        public List<String> getAttachmentIDs() {
            return this.attachmentIDs;
        }

    	// ContentKeys's available values: config.json, locale/zh-cn.json, locale/en.json, cluster.json.mustache
        private List<String> contentKeys;

        @JsonProperty(value = "content_keys")
        public void setContentKeys(List<String> contentKeys) {
            this.contentKeys = contentKeys;
        }

        @JsonProperty(value = "content_keys")
        public List<String> getContentKeys() {
            return this.contentKeys;
        }

        private String versionID;

        @JsonProperty(value = "version_id")
        public void setVersionID(String versionID) {
            this.versionID = versionID;
        }

        @JsonProperty(value = "version_id")
        public String getVersionID() {
            return this.versionID;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeAppVersionAttachmentsOutput extends OutputModel {
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

        private List<AppVersionAttachmentModel> versionSet;

        @JsonProperty(value = "version_set")
        public void setVersionSet(List<AppVersionAttachmentModel> versionSet) {
            this.versionSet = versionSet;
        }

        @JsonProperty(value = "version_set")
        public List<AppVersionAttachmentModel> getVersionSet() {
            return this.versionSet;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_versions.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeAppVersionsOutput describeAppVersions(DescribeAppVersionsInput input) throws QCException {
        if (input == null) {
            input = new DescribeAppVersionsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAppVersions");
        context.put("APIName", "DescribeAppVersions");
        context.put("ServiceName", "DescribeAppVersions");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAppVersions");

        input.setAction("DescribeAppVersions");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeAppVersionsOutput.class);
        if(backModel != null){
            return (DescribeAppVersionsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_versions.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeAppVersions(DescribeAppVersionsInput input, ResponseCallBack<DescribeAppVersionsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeAppVersionsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeAppVersions");
        context.put("APIName", "DescribeAppVersions");
        context.put("ServiceName", "DescribeAppVersions");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeAppVersions");

        input.setAction("DescribeAppVersions");
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

    public static class DescribeAppVersionsInput extends IaasParamBody {
        private List<String> appIDs;

        @JsonProperty(value = "app_ids")
        public void setAppIDs(List<String> appIDs) {
            this.appIDs = appIDs;
        }

        @JsonProperty(value = "app_ids")
        public List<String> getAppIDs() {
            return this.appIDs;
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

        private String name;

        @JsonProperty(value = "name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value = "name")
        public String getName() {
            return this.name;
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

        private String reverse;

        @JsonProperty(value = "reverse")
        public void setReverse(String reverse) {
            this.reverse = reverse;
        }

        @JsonProperty(value = "reverse")
        public String getReverse() {
            return this.reverse;
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

        private List<String> status;

        @JsonProperty(value = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public List<String> getStatus() {
            return this.status;
        }

    	// Verbose's available values: 1, 0
        private Integer verbose;

        @JsonProperty(value = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @JsonProperty(value = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        private List<String> versionIDs;

        @JsonProperty(value = "version_ids")
        public void setVersionIDs(List<String> versionIDs) {
            this.versionIDs = versionIDs;
        }

        @JsonProperty(value = "version_ids")
        public List<String> getVersionIDs() {
            return this.versionIDs;
        }

        public String validateParam() throws QCException {
            String[]verboseValidValues = {"1", "0"};
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
    public static class DescribeAppVersionsOutput extends OutputModel {
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

        private List<AppVersionModel> versionSet;

        @JsonProperty(value = "version_set")
        public void setVersionSet(List<AppVersionModel> versionSet) {
            this.versionSet = versionSet;
        }

        @JsonProperty(value = "version_set")
        public List<AppVersionModel> getVersionSet() {
            return this.versionSet;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/bot/describe_apps.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeAppsOutput describeApps(DescribeAppsInput input) throws QCException {
        if (input == null) {
            input = new DescribeAppsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeApps");
        context.put("APIName", "DescribeApps");
        context.put("ServiceName", "DescribeApps");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeApps");

        input.setAction("DescribeApps");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeAppsOutput.class);
        if(backModel != null){
            return (DescribeAppsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/bot/describe_apps.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeApps(DescribeAppsInput input, ResponseCallBack<DescribeAppsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeAppsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeApps");
        context.put("APIName", "DescribeApps");
        context.put("ServiceName", "DescribeApps");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeApps");

        input.setAction("DescribeApps");
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

    public static class DescribeAppsInput extends IaasParamBody {
        private String app;

        @JsonProperty(value = "app")
        public void setApp(String app) {
            this.app = app;
        }

        @JsonProperty(value = "app")
        public String getApp() {
            return this.app;
        }

        private String appName;

        @JsonProperty(value = "app_name")
        public void setAppName(String appName) {
            this.appName = appName;
        }

        @JsonProperty(value = "app_name")
        public String getAppName() {
            return this.appName;
        }

        private List<String> appType;

        @JsonProperty(value = "app_type")
        public void setAppType(List<String> appType) {
            this.appType = appType;
        }

        @JsonProperty(value = "app_type")
        public List<String> getAppType() {
            return this.appType;
        }

        private String category;

        @JsonProperty(value = "category")
        public void setCategory(String category) {
            this.category = category;
        }

        @JsonProperty(value = "category")
        public String getCategory() {
            return this.category;
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

    	// Verbose's available values: 1, 0
        private Integer verbose;

        @JsonProperty(value = "verbose")
        public void setVerbose(Integer verbose) {
            this.verbose = verbose;
        }

        @JsonProperty(value = "verbose")
        public Integer getVerbose() {
            return this.verbose;
        }

        private List<String> zones;

        @JsonProperty(value = "zones")
        public void setZones(List<String> zones) {
            this.zones = zones;
        }

        @JsonProperty(value = "zones")
        public List<String> getZones() {
            return this.zones;
        }

        public String validateParam() throws QCException {
            String[]verboseValidValues = {"1", "0"};
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
    public static class DescribeAppsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<AppModel> appSet;

        @JsonProperty(value = "app_set")
        public void setAppSet(List<AppModel> appSet) {
            this.appSet = appSet;
        }

        @JsonProperty(value = "app_set")
        public List<AppModel> getAppSet() {
            return this.appSet;
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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_version_attachments.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetGlobalUniqueIdOutput getGlobalUniqueId(GetGlobalUniqueIdInput input) throws QCException {
        if (input == null) {
            input = new GetGlobalUniqueIdInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetGlobalUniqueId");
        context.put("APIName", "GetGlobalUniqueId");
        context.put("ServiceName", "GetGlobalUniqueId");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetGlobalUniqueId");

        input.setAction("GetGlobalUniqueId");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetGlobalUniqueIdOutput.class);
        if(backModel != null){
            return (GetGlobalUniqueIdOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/bot/describe_app_version_attachments.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getGlobalUniqueId(GetGlobalUniqueIdInput input, ResponseCallBack<GetGlobalUniqueIdOutput> callback) throws QCException {
        if (input == null) {
            input = new GetGlobalUniqueIdInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetGlobalUniqueId");
        context.put("APIName", "GetGlobalUniqueId");
        context.put("ServiceName", "GetGlobalUniqueId");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetGlobalUniqueId");

        input.setAction("GetGlobalUniqueId");
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

    public static class GetGlobalUniqueIdInput extends IaasParamBody {
        private String userID;

        @JsonProperty(value = "user_id")
        public void setUserID(String userID) {
            this.userID = userID;
        }

        @JsonProperty(value = "user_id")
        public String getUserID() {
            return this.userID;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetGlobalUniqueIdOutput extends OutputModel {
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

        private String uUID;

        @JsonProperty(value = "uuid")
        public void setUUID(String uUID) {
            this.uUID = uUID;
        }

        @JsonProperty(value = "uuid")
        public String getUUID() {
            return this.uUID;
        }

    }}



















