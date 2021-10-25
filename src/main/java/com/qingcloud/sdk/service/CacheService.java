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

public class CacheService {

    private EnvContext envContext;

    private String zone;

    public CacheService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public CacheService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddCacheNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/add_cache_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddCacheNodesOutput addCacheNodes(AddCacheNodesInput input) throws QCException {
        if (input == null) {
            input = new AddCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddCacheNodes");
        context.put("APIName", "AddCacheNodes");
        context.put("ServiceName", "AddCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddCacheNodes");

        input.setAction("AddCacheNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddCacheNodesOutput.class);
        if(backModel != null){
            return (AddCacheNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/add_cache_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addCacheNodes(AddCacheNodesInput input, ResponseCallBack<AddCacheNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new AddCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddCacheNodes");
        context.put("APIName", "AddCacheNodes");
        context.put("ServiceName", "AddCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddCacheNodes");

        input.setAction("AddCacheNodes");
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

    public static class AddCacheNodesInput extends IaasParamBody {
        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private Integer nodeCount;

        @JsonProperty(value = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @JsonProperty(value = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<CachePrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            if (this.getNodeCount() < 0 ) {
                throw new QCException("NodeCount is required");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddCacheNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * @return ApplyCacheParameterGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/apply_cache_parameter_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplyCacheParameterGroupOutput applyCacheParameterGroup(ApplyCacheParameterGroupInput input) throws QCException {
        if (input == null) {
            input = new ApplyCacheParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyCacheParameterGroup");
        context.put("APIName", "ApplyCacheParameterGroup");
        context.put("ServiceName", "ApplyCacheParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyCacheParameterGroup");

        input.setAction("ApplyCacheParameterGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplyCacheParameterGroupOutput.class);
        if(backModel != null){
            return (ApplyCacheParameterGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/apply_cache_parameter_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applyCacheParameterGroup(ApplyCacheParameterGroupInput input, ResponseCallBack<ApplyCacheParameterGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplyCacheParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyCacheParameterGroup");
        context.put("APIName", "ApplyCacheParameterGroup");
        context.put("ServiceName", "ApplyCacheParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyCacheParameterGroup");

        input.setAction("ApplyCacheParameterGroup");
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

    public static class ApplyCacheParameterGroupInput extends IaasParamBody {
        // Required
        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplyCacheParameterGroupOutput extends OutputModel {
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
      * @return ChangeCacheVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/change_cache_vxnet.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ChangeCacheVxNetOutput changeCacheVxNet(ChangeCacheVxNetInput input) throws QCException {
        if (input == null) {
            input = new ChangeCacheVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeCacheVxnet");
        context.put("APIName", "ChangeCacheVxnet");
        context.put("ServiceName", "ChangeCacheVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeCacheVxnet");

        input.setAction("ChangeCacheVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ChangeCacheVxNetOutput.class);
        if(backModel != null){
            return (ChangeCacheVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/change_cache_vxnet.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void changeCacheVxNet(ChangeCacheVxNetInput input, ResponseCallBack<ChangeCacheVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new ChangeCacheVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeCacheVxNet");
        context.put("APIName", "ChangeCacheVxNet");
        context.put("ServiceName", "ChangeCacheVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeCacheVxnet");

        input.setAction("ChangeCacheVxNet");
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

    public static class ChangeCacheVxNetInput extends IaasParamBody {
        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<CachePrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
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
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChangeCacheVxNetOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @JsonProperty(value = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @JsonProperty(value = "cache_id")
        public String getCacheID() {
            return this.cacheID;
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
      * @param input Request parameters and headers in the class
      * @return CreateCacheOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/create_cache.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateCacheOutput createCache(CreateCacheInput input) throws QCException {
        if (input == null) {
            input = new CreateCacheInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCache");
        context.put("APIName", "CreateCache");
        context.put("ServiceName", "CreateCache");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCache");

        input.setAction("CreateCache");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateCacheOutput.class);
        if(backModel != null){
            return (CreateCacheOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/create_cache.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createCache(CreateCacheInput input, ResponseCallBack<CreateCacheOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateCacheInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCache");
        context.put("APIName", "CreateCache");
        context.put("ServiceName", "CreateCache");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCache");

        input.setAction("CreateCache");
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

    public static class CreateCacheInput extends IaasParamBody {
        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

    	// CacheClass's available values: 0, 1
        private Integer cacheClass;

        @JsonProperty(value = "cache_class")
        public void setCacheClass(Integer cacheClass) {
            this.cacheClass = cacheClass;
        }

        @JsonProperty(value = "cache_class")
        public Integer getCacheClass() {
            return this.cacheClass;
        }

        private String cacheName;

        @JsonProperty(value = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @JsonProperty(value = "cache_name")
        public String getCacheName() {
            return this.cacheName;
        }

        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        // Required
        private Integer cacheSize;

        @JsonProperty(value = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @JsonProperty(value = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        // Required
        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private Integer masterCount;

        @JsonProperty(value = "master_count")
        public void setMasterCount(Integer masterCount) {
            this.masterCount = masterCount;
        }

        @JsonProperty(value = "master_count")
        public Integer getMasterCount() {
            return this.masterCount;
        }

        private Integer networkType;

        @JsonProperty(value = "network_type")
        public void setNetworkType(Integer networkType) {
            this.networkType = networkType;
        }

        @JsonProperty(value = "network_type")
        public Integer getNetworkType() {
            return this.networkType;
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

        private List<CachePrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        private Integer replicateCount;

        @JsonProperty(value = "replicate_count")
        public void setReplicateCount(Integer replicateCount) {
            this.replicateCount = replicateCount;
        }

        @JsonProperty(value = "replicate_count")
        public Integer getReplicateCount() {
            return this.replicateCount;
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
            String[]cacheClassValidValues = {"0", "1"};
            boolean cacheClassIsValid = false;
            for (String v : cacheClassValidValues) {
                if (v.equals(this.getCacheClass()+"")) {
                    cacheClassIsValid = true;
                }
                Boolean cacheClassIsRequired = Boolean.FALSE;
                if (cacheClassIsRequired.equals(Boolean.FALSE) && this.getCacheClass()==null) {
                    cacheClassIsValid = true;
                }
            }

            if (!cacheClassIsValid) {
                throw new QCException("CacheClass value " + this.getCacheClass() + "is invalid");
            }
            if (this.getCacheSize() < 0 ) {
                throw new QCException("CacheSize is required");
            }
            if (QCStringUtil.isEmpty(this.getCacheType())) {
                throw new QCException("CacheType is required");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateCacheOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @JsonProperty(value = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @JsonProperty(value = "cache_id")
        public String getCacheID() {
            return this.cacheID;
        }

        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * @return CreateCacheFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/create_cache_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateCacheFromSnapshotOutput createCacheFromSnapshot(CreateCacheFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateCacheFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCacheFromSnapshot");
        context.put("APIName", "CreateCacheFromSnapshot");
        context.put("ServiceName", "CreateCacheFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCacheFromSnapshot");

        input.setAction("CreateCacheFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateCacheFromSnapshotOutput.class);
        if(backModel != null){
            return (CreateCacheFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/create_cache_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createCacheFromSnapshot(CreateCacheFromSnapshotInput input, ResponseCallBack<CreateCacheFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateCacheFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCacheFromSnapshot");
        context.put("APIName", "CreateCacheFromSnapshot");
        context.put("ServiceName", "CreateCacheFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCacheFromSnapshot");

        input.setAction("CreateCacheFromSnapshot");
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

    public static class CreateCacheFromSnapshotInput extends IaasParamBody {
        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

    	// CacheClass's available values: 0, 1
        private Integer cacheClass;

        @JsonProperty(value = "cache_class")
        public void setCacheClass(Integer cacheClass) {
            this.cacheClass = cacheClass;
        }

        @JsonProperty(value = "cache_class")
        public Integer getCacheClass() {
            return this.cacheClass;
        }

        private String cacheName;

        @JsonProperty(value = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @JsonProperty(value = "cache_name")
        public String getCacheName() {
            return this.cacheName;
        }

        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private Integer cacheSize;

        @JsonProperty(value = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @JsonProperty(value = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private Integer networkType;

        @JsonProperty(value = "network_type")
        public void setNetworkType(Integer networkType) {
            this.networkType = networkType;
        }

        @JsonProperty(value = "network_type")
        public Integer getNetworkType() {
            return this.networkType;
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

        private List<CachePrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
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
            String[]cacheClassValidValues = {"0", "1"};
            boolean cacheClassIsValid = false;
            for (String v : cacheClassValidValues) {
                if (v.equals(this.getCacheClass()+"")) {
                    cacheClassIsValid = true;
                }
                Boolean cacheClassIsRequired = Boolean.FALSE;
                if (cacheClassIsRequired.equals(Boolean.FALSE) && this.getCacheClass()==null) {
                    cacheClassIsValid = true;
                }
            }

            if (!cacheClassIsValid) {
                throw new QCException("CacheClass value " + this.getCacheClass() + "is invalid");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateCacheFromSnapshotOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @JsonProperty(value = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @JsonProperty(value = "cache_id")
        public String getCacheID() {
            return this.cacheID;
        }

        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * @return CreateCacheParameterGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/create_cache_parameter_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateCacheParameterGroupOutput createCacheParameterGroup(CreateCacheParameterGroupInput input) throws QCException {
        if (input == null) {
            input = new CreateCacheParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCacheParameterGroup");
        context.put("APIName", "CreateCacheParameterGroup");
        context.put("ServiceName", "CreateCacheParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCacheParameterGroup");

        input.setAction("CreateCacheParameterGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateCacheParameterGroupOutput.class);
        if(backModel != null){
            return (CreateCacheParameterGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/create_cache_parameter_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createCacheParameterGroup(CreateCacheParameterGroupInput input, ResponseCallBack<CreateCacheParameterGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateCacheParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCacheParameterGroup");
        context.put("APIName", "CreateCacheParameterGroup");
        context.put("ServiceName", "CreateCacheParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCacheParameterGroup");

        input.setAction("CreateCacheParameterGroup");
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

    public static class CreateCacheParameterGroupInput extends IaasParamBody {
        private String cacheParameterGroupName;

        @JsonProperty(value = "cache_parameter_group_name")
        public void setCacheParameterGroupName(String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
        }

        @JsonProperty(value = "cache_parameter_group_name")
        public String getCacheParameterGroupName() {
            return this.cacheParameterGroupName;
        }

    	// CacheType's available values: redis2.8.17, memcached1.4.13
        // Required
        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheType())) {
                throw new QCException("CacheType is required");
            }
            String[] cacheTypeValidValues = {
                "redis2.8.17", "memcached1.4.13"
            };

            boolean cacheTypeIsValid = false;
            for (String v : cacheTypeValidValues) {
                if (v.equals(this.getCacheType())) {
                    cacheTypeIsValid = true;
                }
                Boolean cacheTypeIsRequired = Boolean.TRUE;
                if (cacheTypeIsRequired.equals(Boolean.FALSE) && this.getCacheType() == null) {
                    cacheTypeIsValid = true;
                }
            }

            if (!cacheTypeIsValid) {
                throw new QCException("CacheType value " + this.getCacheType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateCacheParameterGroupOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheParameterGroupID;

        @JsonProperty(value = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @JsonProperty(value = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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
      * @return DeleteCacheNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/delete_cache_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteCacheNodesOutput deleteCacheNodes(DeleteCacheNodesInput input) throws QCException {
        if (input == null) {
            input = new DeleteCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCacheNodes");
        context.put("APIName", "DeleteCacheNodes");
        context.put("ServiceName", "DeleteCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCacheNodes");

        input.setAction("DeleteCacheNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteCacheNodesOutput.class);
        if(backModel != null){
            return (DeleteCacheNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/delete_cache_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteCacheNodes(DeleteCacheNodesInput input, ResponseCallBack<DeleteCacheNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCacheNodes");
        context.put("APIName", "DeleteCacheNodes");
        context.put("ServiceName", "DeleteCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCacheNodes");

        input.setAction("DeleteCacheNodes");
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

    public static class DeleteCacheNodesInput extends IaasParamBody {
        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteCacheNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * @return DeleteCacheParameterGroupsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/delete_cache_parameter_groups.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteCacheParameterGroupsOutput deleteCacheParameterGroups(DeleteCacheParameterGroupsInput input) throws QCException {
        if (input == null) {
            input = new DeleteCacheParameterGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCacheParameterGroups");
        context.put("APIName", "DeleteCacheParameterGroups");
        context.put("ServiceName", "DeleteCacheParameterGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCacheParameterGroups");

        input.setAction("DeleteCacheParameterGroups");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteCacheParameterGroupsOutput.class);
        if(backModel != null){
            return (DeleteCacheParameterGroupsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/delete_cache_parameter_groups.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteCacheParameterGroups(DeleteCacheParameterGroupsInput input, ResponseCallBack<DeleteCacheParameterGroupsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteCacheParameterGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCacheParameterGroups");
        context.put("APIName", "DeleteCacheParameterGroups");
        context.put("ServiceName", "DeleteCacheParameterGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCacheParameterGroups");

        input.setAction("DeleteCacheParameterGroups");
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

    public static class DeleteCacheParameterGroupsInput extends IaasParamBody {
        // Required
        private List<String> cacheParameterGroups;

        @JsonProperty(value = "cache_parameter_groups")
        public void setCacheParameterGroups(List<String> cacheParameterGroups) {
            this.cacheParameterGroups = cacheParameterGroups;
        }

        @JsonProperty(value = "cache_parameter_groups")
        public List<String> getCacheParameterGroups() {
            return this.cacheParameterGroups;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteCacheParameterGroupsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> parameterGroups;

        @JsonProperty(value = "parameter_groups")
        public void setParameterGroups(List<String> parameterGroups) {
            this.parameterGroups = parameterGroups;
        }

        @JsonProperty(value = "parameter_groups")
        public List<String> getParameterGroups() {
            return this.parameterGroups;
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
      * @return DeleteCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/delete_caches.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteCachesOutput deleteCaches(DeleteCachesInput input) throws QCException {
        if (input == null) {
            input = new DeleteCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCaches");
        context.put("APIName", "DeleteCaches");
        context.put("ServiceName", "DeleteCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCaches");

        input.setAction("DeleteCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteCachesOutput.class);
        if(backModel != null){
            return (DeleteCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/delete_caches.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteCaches(DeleteCachesInput input, ResponseCallBack<DeleteCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteCaches");
        context.put("APIName", "DeleteCaches");
        context.put("ServiceName", "DeleteCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteCaches");

        input.setAction("DeleteCaches");
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

    public static class DeleteCachesInput extends IaasParamBody {
        // Required
        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteCachesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @JsonProperty(value = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @JsonProperty(value = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * @return DescribeCacheNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/describe_cache_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeCacheNodesOutput describeCacheNodes(DescribeCacheNodesInput input) throws QCException {
        if (input == null) {
            input = new DescribeCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheNodes");
        context.put("APIName", "DescribeCacheNodes");
        context.put("ServiceName", "DescribeCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheNodes");

        input.setAction("DescribeCacheNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeCacheNodesOutput.class);
        if(backModel != null){
            return (DescribeCacheNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/describe_cache_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeCacheNodes(DescribeCacheNodesInput input, ResponseCallBack<DescribeCacheNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheNodes");
        context.put("APIName", "DescribeCacheNodes");
        context.put("ServiceName", "DescribeCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheNodes");

        input.setAction("DescribeCacheNodes");
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

    public static class DescribeCacheNodesInput extends IaasParamBody {
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
    public static class DescribeCacheNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheNodeModel> cacheNodeSet;

        @JsonProperty(value = "cache_node_set")
        public void setCacheNodeSet(List<CacheNodeModel> cacheNodeSet) {
            this.cacheNodeSet = cacheNodeSet;
        }

        @JsonProperty(value = "cache_node_set")
        public List<CacheNodeModel> getCacheNodeSet() {
            return this.cacheNodeSet;
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
      * @return DescribeCacheParameterGroupsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/describe_cache_parameter_groups.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeCacheParameterGroupsOutput describeCacheParameterGroups(DescribeCacheParameterGroupsInput input) throws QCException {
        if (input == null) {
            input = new DescribeCacheParameterGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheParameterGroups");
        context.put("APIName", "DescribeCacheParameterGroups");
        context.put("ServiceName", "DescribeCacheParameterGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheParameterGroups");

        input.setAction("DescribeCacheParameterGroups");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeCacheParameterGroupsOutput.class);
        if(backModel != null){
            return (DescribeCacheParameterGroupsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/describe_cache_parameter_groups.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeCacheParameterGroups(DescribeCacheParameterGroupsInput input, ResponseCallBack<DescribeCacheParameterGroupsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeCacheParameterGroupsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheParameterGroups");
        context.put("APIName", "DescribeCacheParameterGroups");
        context.put("ServiceName", "DescribeCacheParameterGroups");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheParameterGroups");

        input.setAction("DescribeCacheParameterGroups");
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

    public static class DescribeCacheParameterGroupsInput extends IaasParamBody {
        private List<String> cacheParameterGroups;

        @JsonProperty(value = "cache_parameter_groups")
        public void setCacheParameterGroups(List<String> cacheParameterGroups) {
            this.cacheParameterGroups = cacheParameterGroups;
        }

        @JsonProperty(value = "cache_parameter_groups")
        public List<String> getCacheParameterGroups() {
            return this.cacheParameterGroups;
        }

        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
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
    public static class DescribeCacheParameterGroupsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheParameterGroupModel> cacheParameterGroupSet;

        @JsonProperty(value = "cache_parameter_group_set")
        public void setCacheParameterGroupSet(List<CacheParameterGroupModel> cacheParameterGroupSet) {
            this.cacheParameterGroupSet = cacheParameterGroupSet;
        }

        @JsonProperty(value = "cache_parameter_group_set")
        public List<CacheParameterGroupModel> getCacheParameterGroupSet() {
            return this.cacheParameterGroupSet;
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
      * @return DescribeCacheParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/describe_cache_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeCacheParametersOutput describeCacheParameters(DescribeCacheParametersInput input) throws QCException {
        if (input == null) {
            input = new DescribeCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheParameters");
        context.put("APIName", "DescribeCacheParameters");
        context.put("ServiceName", "DescribeCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheParameters");

        input.setAction("DescribeCacheParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeCacheParametersOutput.class);
        if(backModel != null){
            return (DescribeCacheParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/describe_cache_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeCacheParameters(DescribeCacheParametersInput input, ResponseCallBack<DescribeCacheParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCacheParameters");
        context.put("APIName", "DescribeCacheParameters");
        context.put("ServiceName", "DescribeCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCacheParameters");

        input.setAction("DescribeCacheParameters");
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

    public static class DescribeCacheParametersInput extends IaasParamBody {
        // Required
        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
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
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeCacheParametersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheParameterModel> cacheParameterSet;

        @JsonProperty(value = "cache_parameter_set")
        public void setCacheParameterSet(List<CacheParameterModel> cacheParameterSet) {
            this.cacheParameterSet = cacheParameterSet;
        }

        @JsonProperty(value = "cache_parameter_set")
        public List<CacheParameterModel> getCacheParameterSet() {
            return this.cacheParameterSet;
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
      * @return DescribeCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/describe_caches.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeCachesOutput describeCaches(DescribeCachesInput input) throws QCException {
        if (input == null) {
            input = new DescribeCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCaches");
        context.put("APIName", "DescribeCaches");
        context.put("ServiceName", "DescribeCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCaches");

        input.setAction("DescribeCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeCachesOutput.class);
        if(backModel != null){
            return (DescribeCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/describe_caches.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeCaches(DescribeCachesInput input, ResponseCallBack<DescribeCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeCaches");
        context.put("APIName", "DescribeCaches");
        context.put("ServiceName", "DescribeCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeCaches");

        input.setAction("DescribeCaches");
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

    public static class DescribeCachesInput extends IaasParamBody {
        private List<String> cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(List<String> cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public List<String> getCacheType() {
            return this.cacheType;
        }

        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
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
    public static class DescribeCachesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheModel> cacheSet;

        @JsonProperty(value = "cache_set")
        public void setCacheSet(List<CacheModel> cacheSet) {
            this.cacheSet = cacheSet;
        }

        @JsonProperty(value = "cache_set")
        public List<CacheModel> getCacheSet() {
            return this.cacheSet;
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
      * @return GetCacheMonitorOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/monitor/get_cache_monitor.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetCacheMonitorOutput getCacheMonitor(GetCacheMonitorInput input) throws QCException {
        if (input == null) {
            input = new GetCacheMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetCacheMonitor");
        context.put("APIName", "GetCacheMonitor");
        context.put("ServiceName", "GetCacheMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetCacheMonitor");

        input.setAction("GetCacheMonitor");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetCacheMonitorOutput.class);
        if(backModel != null){
            return (GetCacheMonitorOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/monitor/get_cache_monitor.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getCacheMonitor(GetCacheMonitorInput input, ResponseCallBack<GetCacheMonitorOutput> callback) throws QCException {
        if (input == null) {
            input = new GetCacheMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetCacheMonitor");
        context.put("APIName", "GetCacheMonitor");
        context.put("ServiceName", "GetCacheMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetCacheMonitor");

        input.setAction("GetCacheMonitor");
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

    public static class GetCacheMonitorInput extends IaasParamBody {
        // Required
        private String endTime;

        @JsonProperty(value = "end_time")
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @JsonProperty(value = "end_time")
        public String getEndTime() {
            return this.endTime;
        }

        // Required
        private List<String> meters;

        @JsonProperty(value = "meters")
        public void setMeters(List<String> meters) {
            this.meters = meters;
        }

        @JsonProperty(value = "meters")
        public List<String> getMeters() {
            return this.meters;
        }

        // Required
        private String resource;

        @JsonProperty(value = "resource")
        public void setResource(String resource) {
            this.resource = resource;
        }

        @JsonProperty(value = "resource")
        public String getResource() {
            return this.resource;
        }

        // Required
        private String startTime;

        @JsonProperty(value = "start_time")
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @JsonProperty(value = "start_time")
        public String getStartTime() {
            return this.startTime;
        }

    	// Step's available values: 5m, 15m, 2h, 1d
        // Required
        private String step;

        @JsonProperty(value = "step")
        public void setStep(String step) {
            this.step = step;
        }

        @JsonProperty(value = "step")
        public String getStep() {
            return this.step;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getResource())) {
                throw new QCException("Resource is required");
            }
            if (QCStringUtil.isEmpty(this.getStep())) {
                throw new QCException("Step is required");
            }
            String[] stepValidValues = {
                "5m", "15m", "2h", "1d"
            };

            boolean stepIsValid = false;
            for (String v : stepValidValues) {
                if (v.equals(this.getStep())) {
                    stepIsValid = true;
                }
                Boolean stepIsRequired = Boolean.TRUE;
                if (stepIsRequired.equals(Boolean.FALSE) && this.getStep() == null) {
                    stepIsValid = true;
                }
            }

            if (!stepIsValid) {
                throw new QCException("Step value " + this.getStep() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetCacheMonitorOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<MeterModel> meterSet;

        @JsonProperty(value = "meter_set")
        public void setMeterSet(List<MeterModel> meterSet) {
            this.meterSet = meterSet;
        }

        @JsonProperty(value = "meter_set")
        public List<MeterModel> getMeterSet() {
            return this.meterSet;
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
      * @return ModifyCacheAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/modify_cache_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyCacheAttributesOutput modifyCacheAttributes(ModifyCacheAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyCacheAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheAttributes");
        context.put("APIName", "ModifyCacheAttributes");
        context.put("ServiceName", "ModifyCacheAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheAttributes");

        input.setAction("ModifyCacheAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyCacheAttributesOutput.class);
        if(backModel != null){
            return (ModifyCacheAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/modify_cache_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyCacheAttributes(ModifyCacheAttributesInput input, ResponseCallBack<ModifyCacheAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyCacheAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheAttributes");
        context.put("APIName", "ModifyCacheAttributes");
        context.put("ServiceName", "ModifyCacheAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheAttributes");

        input.setAction("ModifyCacheAttributes");
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

    public static class ModifyCacheAttributesInput extends IaasParamBody {
        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        private String cacheName;

        @JsonProperty(value = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @JsonProperty(value = "cache_name")
        public String getCacheName() {
            return this.cacheName;
        }

        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyCacheAttributesOutput extends OutputModel {
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
      * @return ModifyCacheNodeAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/modify_cache_node_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyCacheNodeAttributesOutput modifyCacheNodeAttributes(ModifyCacheNodeAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyCacheNodeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheNodeAttributes");
        context.put("APIName", "ModifyCacheNodeAttributes");
        context.put("ServiceName", "ModifyCacheNodeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheNodeAttributes");

        input.setAction("ModifyCacheNodeAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyCacheNodeAttributesOutput.class);
        if(backModel != null){
            return (ModifyCacheNodeAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/modify_cache_node_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyCacheNodeAttributes(ModifyCacheNodeAttributesInput input, ResponseCallBack<ModifyCacheNodeAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyCacheNodeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheNodeAttributes");
        context.put("APIName", "ModifyCacheNodeAttributes");
        context.put("ServiceName", "ModifyCacheNodeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheNodeAttributes");

        input.setAction("ModifyCacheNodeAttributes");
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

    public static class ModifyCacheNodeAttributesInput extends IaasParamBody {
        // Required
        private String cacheNode;

        @JsonProperty(value = "cache_node")
        public void setCacheNode(String cacheNode) {
            this.cacheNode = cacheNode;
        }

        @JsonProperty(value = "cache_node")
        public String getCacheNode() {
            return this.cacheNode;
        }

        private String cacheNodeName;

        @JsonProperty(value = "cache_node_name")
        public void setCacheNodeName(String cacheNodeName) {
            this.cacheNodeName = cacheNodeName;
        }

        @JsonProperty(value = "cache_node_name")
        public String getCacheNodeName() {
            return this.cacheNodeName;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheNode())) {
                throw new QCException("CacheNode is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyCacheNodeAttributesOutput extends OutputModel {
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
      * @return ModifyCacheParameterGroupAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/modify_cache_parameter_group_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyCacheParameterGroupAttributesOutput modifyCacheParameterGroupAttributes(ModifyCacheParameterGroupAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyCacheParameterGroupAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheParameterGroupAttributes");
        context.put("APIName", "ModifyCacheParameterGroupAttributes");
        context.put("ServiceName", "ModifyCacheParameterGroupAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheParameterGroupAttributes");

        input.setAction("ModifyCacheParameterGroupAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyCacheParameterGroupAttributesOutput.class);
        if(backModel != null){
            return (ModifyCacheParameterGroupAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/modify_cache_parameter_group_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyCacheParameterGroupAttributes(ModifyCacheParameterGroupAttributesInput input, ResponseCallBack<ModifyCacheParameterGroupAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyCacheParameterGroupAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyCacheParameterGroupAttributes");
        context.put("APIName", "ModifyCacheParameterGroupAttributes");
        context.put("ServiceName", "ModifyCacheParameterGroupAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyCacheParameterGroupAttributes");

        input.setAction("ModifyCacheParameterGroupAttributes");
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

    public static class ModifyCacheParameterGroupAttributesInput extends IaasParamBody {
        // Required
        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private String cacheParameterGroupName;

        @JsonProperty(value = "cache_parameter_group_name")
        public void setCacheParameterGroupName(String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
        }

        @JsonProperty(value = "cache_parameter_group_name")
        public String getCacheParameterGroupName() {
            return this.cacheParameterGroupName;
        }

        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyCacheParameterGroupAttributesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheParameterGroupID;

        @JsonProperty(value = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @JsonProperty(value = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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
      * @return ResetCacheParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/reset_cache_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResetCacheParametersOutput resetCacheParameters(ResetCacheParametersInput input) throws QCException {
        if (input == null) {
            input = new ResetCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResetCacheParameters");
        context.put("APIName", "ResetCacheParameters");
        context.put("ServiceName", "ResetCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResetCacheParameters");

        input.setAction("ResetCacheParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResetCacheParametersOutput.class);
        if(backModel != null){
            return (ResetCacheParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/reset_cache_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resetCacheParameters(ResetCacheParametersInput input, ResponseCallBack<ResetCacheParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new ResetCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResetCacheParameters");
        context.put("APIName", "ResetCacheParameters");
        context.put("ServiceName", "ResetCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResetCacheParameters");

        input.setAction("ResetCacheParameters");
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

    public static class ResetCacheParametersInput extends IaasParamBody {
        // Required
        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private List<String> cacheParameterNames;

        @JsonProperty(value = "cache_parameter_names")
        public void setCacheParameterNames(List<String> cacheParameterNames) {
            this.cacheParameterNames = cacheParameterNames;
        }

        @JsonProperty(value = "cache_parameter_names")
        public List<String> getCacheParameterNames() {
            return this.cacheParameterNames;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResetCacheParametersOutput extends OutputModel {
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
      * @return ResizeCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/resize_cache.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeCachesOutput resizeCaches(ResizeCachesInput input) throws QCException {
        if (input == null) {
            input = new ResizeCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeCaches");
        context.put("APIName", "ResizeCaches");
        context.put("ServiceName", "ResizeCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeCaches");

        input.setAction("ResizeCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeCachesOutput.class);
        if(backModel != null){
            return (ResizeCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/resize_cache.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeCaches(ResizeCachesInput input, ResponseCallBack<ResizeCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeCaches");
        context.put("APIName", "ResizeCaches");
        context.put("ServiceName", "ResizeCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeCaches");

        input.setAction("ResizeCaches");
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

    public static class ResizeCachesInput extends IaasParamBody {
        // Required
        private Integer cacheSize;

        @JsonProperty(value = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @JsonProperty(value = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        // Required
        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            if (this.getCacheSize() < 0 ) {
                throw new QCException("CacheSize is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeCachesOutput extends OutputModel {
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
      * @return RestartCacheNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/restart_cache_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RestartCacheNodesOutput restartCacheNodes(RestartCacheNodesInput input) throws QCException {
        if (input == null) {
            input = new RestartCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartCacheNodes");
        context.put("APIName", "RestartCacheNodes");
        context.put("ServiceName", "RestartCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartCacheNodes");

        input.setAction("RestartCacheNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RestartCacheNodesOutput.class);
        if(backModel != null){
            return (RestartCacheNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/restart_cache_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void restartCacheNodes(RestartCacheNodesInput input, ResponseCallBack<RestartCacheNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new RestartCacheNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartCacheNodes");
        context.put("APIName", "RestartCacheNodes");
        context.put("ServiceName", "RestartCacheNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartCacheNodes");

        input.setAction("RestartCacheNodes");
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

    public static class RestartCacheNodesInput extends IaasParamBody {
        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private List<String> cacheNodes;

        @JsonProperty(value = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @JsonProperty(value = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestartCacheNodesOutput extends OutputModel {
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
      * @return RestartCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/restart_caches.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RestartCachesOutput restartCaches(RestartCachesInput input) throws QCException {
        if (input == null) {
            input = new RestartCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartCaches");
        context.put("APIName", "RestartCaches");
        context.put("ServiceName", "RestartCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartCaches");

        input.setAction("RestartCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RestartCachesOutput.class);
        if(backModel != null){
            return (RestartCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/restart_caches.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void restartCaches(RestartCachesInput input, ResponseCallBack<RestartCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new RestartCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartCaches");
        context.put("APIName", "RestartCaches");
        context.put("ServiceName", "RestartCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartCaches");

        input.setAction("RestartCaches");
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

    public static class RestartCachesInput extends IaasParamBody {
        // Required
        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestartCachesOutput extends OutputModel {
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
      * @return StartCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/start_caches.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StartCachesOutput startCaches(StartCachesInput input) throws QCException {
        if (input == null) {
            input = new StartCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartCaches");
        context.put("APIName", "StartCaches");
        context.put("ServiceName", "StartCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartCaches");

        input.setAction("StartCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StartCachesOutput.class);
        if(backModel != null){
            return (StartCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/start_caches.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void startCaches(StartCachesInput input, ResponseCallBack<StartCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new StartCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartCaches");
        context.put("APIName", "StartCaches");
        context.put("ServiceName", "StartCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartCaches");

        input.setAction("StartCaches");
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

    public static class StartCachesInput extends IaasParamBody {
        // Required
        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StartCachesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @JsonProperty(value = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @JsonProperty(value = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * @return StopCachesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/stop_caches.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StopCachesOutput stopCaches(StopCachesInput input) throws QCException {
        if (input == null) {
            input = new StopCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopCaches");
        context.put("APIName", "StopCaches");
        context.put("ServiceName", "StopCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopCaches");

        input.setAction("StopCaches");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StopCachesOutput.class);
        if(backModel != null){
            return (StopCachesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/stop_caches.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void stopCaches(StopCachesInput input, ResponseCallBack<StopCachesOutput> callback) throws QCException {
        if (input == null) {
            input = new StopCachesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopCaches");
        context.put("APIName", "StopCaches");
        context.put("ServiceName", "StopCaches");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopCaches");

        input.setAction("StopCaches");
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

    public static class StopCachesInput extends IaasParamBody {
        // Required
        private List<String> caches;

        @JsonProperty(value = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @JsonProperty(value = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StopCachesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @JsonProperty(value = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @JsonProperty(value = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * @return UpdateCacheOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/update_cache.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateCacheOutput updateCache(UpdateCacheInput input) throws QCException {
        if (input == null) {
            input = new UpdateCacheInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateCache");
        context.put("APIName", "UpdateCache");
        context.put("ServiceName", "UpdateCache");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateCache");

        input.setAction("UpdateCache");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateCacheOutput.class);
        if(backModel != null){
            return (UpdateCacheOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/update_cache.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateCache(UpdateCacheInput input, ResponseCallBack<UpdateCacheOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateCacheInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateCache");
        context.put("APIName", "UpdateCache");
        context.put("ServiceName", "UpdateCache");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateCache");

        input.setAction("UpdateCache");
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

    public static class UpdateCacheInput extends IaasParamBody {
        // Required
        private String cache;

        @JsonProperty(value = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @JsonProperty(value = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<CachePrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateCacheOutput extends OutputModel {
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
      * @return UpdateCacheParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cache/update_cache_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateCacheParametersOutput updateCacheParameters(UpdateCacheParametersInput input) throws QCException {
        if (input == null) {
            input = new UpdateCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateCacheParameters");
        context.put("APIName", "UpdateCacheParameters");
        context.put("ServiceName", "UpdateCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateCacheParameters");

        input.setAction("UpdateCacheParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateCacheParametersOutput.class);
        if(backModel != null){
            return (UpdateCacheParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cache/update_cache_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateCacheParameters(UpdateCacheParametersInput input, ResponseCallBack<UpdateCacheParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateCacheParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateCacheParameters");
        context.put("APIName", "UpdateCacheParameters");
        context.put("ServiceName", "UpdateCacheParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateCacheParameters");

        input.setAction("UpdateCacheParameters");
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

    public static class UpdateCacheParametersInput extends IaasParamBody {
        // Required
        private String cacheParameterGroup;

        @JsonProperty(value = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @JsonProperty(value = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        // Required
        private CacheParameterModel parameters;

        @JsonProperty(value = "parameters")
        public void setParameters(CacheParameterModel parameters) {
            this.parameters = parameters;
        }

        @JsonProperty(value = "parameters")
        public CacheParameterModel getParameters() {
            return this.parameters;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateCacheParametersOutput extends OutputModel {
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



















