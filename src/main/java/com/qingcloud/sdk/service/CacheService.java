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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cache/add_cache_nodes.html
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
        context.put("RequestURI", "/AddCacheNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/add_cache_nodes.html
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
        context.put("RequestURI", "/AddCacheNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private Integer nodeCount;

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<CachePrivateIPModel> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
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

    public static class AddCacheNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/apply_cache_parameter_group.html
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
        context.put("RequestURI", "/ApplyCacheParameterGroup");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/apply_cache_parameter_group.html
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
        context.put("RequestURI", "/ApplyCacheParameterGroup");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private List<String> caches;

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
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

    public static class ApplyCacheParameterGroupOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/change_cache_vxnet.html
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
        context.put("RequestURI", "/ChangeCacheVxnet");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/change_cache_vxnet.html
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
        context.put("RequestURI", "/ChangeCacheVxnet");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<CachePrivateIPModel> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
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

    public static class ChangeCacheVxNetOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public String getCacheID() {
            return this.cacheID;
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

        private String vxNetID;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_id")
        public void setVxNetID(String vxNetID) {
            this.vxNetID = vxNetID;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_id")
        public String getVxNetID() {
            return this.vxNetID;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache.html
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
        context.put("RequestURI", "/CreateCache");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache.html
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
        context.put("RequestURI", "/CreateCache");

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

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

    	// CacheClass's available values: 0, 1
        private Integer cacheClass;

        @ParamAnnotation(paramType = "query", paramName = "cache_class")
        public void setCacheClass(Integer cacheClass) {
            this.cacheClass = cacheClass;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_class")
        public Integer getCacheClass() {
            return this.cacheClass;
        }

        private String cacheName;

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public String getCacheName() {
            return this.cacheName;
        }

        private String cacheParameterGroup;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        // Required
        private Integer cacheSize;

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        // Required
        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private Integer masterCount;

        @ParamAnnotation(paramType = "query", paramName = "master_count")
        public void setMasterCount(Integer masterCount) {
            this.masterCount = masterCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "master_count")
        public Integer getMasterCount() {
            return this.masterCount;
        }

        private Integer networkType;

        @ParamAnnotation(paramType = "query", paramName = "network_type")
        public void setNetworkType(Integer networkType) {
            this.networkType = networkType;
        }

        @ParamAnnotation(paramType = "query", paramName = "network_type")
        public Integer getNetworkType() {
            return this.networkType;
        }

        private Integer nodeCount;

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<CachePrivateIPModel> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        private Integer replicateCount;

        @ParamAnnotation(paramType = "query", paramName = "replicate_count")
        public void setReplicateCount(Integer replicateCount) {
            this.replicateCount = replicateCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "replicate_count")
        public Integer getReplicateCount() {
            return this.replicateCount;
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

    public static class CreateCacheOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public String getCacheID() {
            return this.cacheID;
        }

        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache_from_snapshot.html
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
        context.put("RequestURI", "/CreateCacheFromSnapshot");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache_from_snapshot.html
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
        context.put("RequestURI", "/CreateCacheFromSnapshot");

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

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

    	// CacheClass's available values: 0, 1
        private Integer cacheClass;

        @ParamAnnotation(paramType = "query", paramName = "cache_class")
        public void setCacheClass(Integer cacheClass) {
            this.cacheClass = cacheClass;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_class")
        public Integer getCacheClass() {
            return this.cacheClass;
        }

        private String cacheName;

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public String getCacheName() {
            return this.cacheName;
        }

        private String cacheParameterGroup;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private Integer cacheSize;

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private Integer networkType;

        @ParamAnnotation(paramType = "query", paramName = "network_type")
        public void setNetworkType(Integer networkType) {
            this.networkType = networkType;
        }

        @ParamAnnotation(paramType = "query", paramName = "network_type")
        public Integer getNetworkType() {
            return this.networkType;
        }

        private Integer nodeCount;

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<CachePrivateIPModel> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public List<CachePrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        // Required
        private String snapshot;

        @ParamAnnotation(paramType = "query", paramName = "snapshot")
        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot")
        public String getSnapshot() {
            return this.snapshot;
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

    public static class CreateCacheFromSnapshotOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheID;

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public String getCacheID() {
            return this.cacheID;
        }

        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache_parameter_group.html
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
        context.put("RequestURI", "/CreateCacheParameterGroup");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/create_cache_parameter_group.html
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
        context.put("RequestURI", "/CreateCacheParameterGroup");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_name")
        public void setCacheParameterGroupName(String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_name")
        public String getCacheParameterGroupName() {
            return this.cacheParameterGroupName;
        }

    	// CacheType's available values: redis2.8.17, memcached1.4.13
        // Required
        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
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

    public static class CreateCacheParameterGroupOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheParameterGroupID;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/delete_cache_nodes.html
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
        context.put("RequestURI", "/DeleteCacheNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/delete_cache_nodes.html
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
        context.put("RequestURI", "/DeleteCacheNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
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

    public static class DeleteCacheNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/delete_cache_parameter_groups.html
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
        context.put("RequestURI", "/DeleteCacheParameterGroups");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/delete_cache_parameter_groups.html
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
        context.put("RequestURI", "/DeleteCacheParameterGroups");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_groups")
        public void setCacheParameterGroups(List<String> cacheParameterGroups) {
            this.cacheParameterGroups = cacheParameterGroups;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_groups")
        public List<String> getCacheParameterGroups() {
            return this.cacheParameterGroups;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteCacheParameterGroupsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> parameterGroups;

        @ParamAnnotation(paramType = "query", paramName = "parameter_groups")
        public void setParameterGroups(List<String> parameterGroups) {
            this.parameterGroups = parameterGroups;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameter_groups")
        public List<String> getParameterGroups() {
            return this.parameterGroups;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/delete_caches.html
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
        context.put("RequestURI", "/DeleteCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/delete_caches.html
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
        context.put("RequestURI", "/DeleteCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteCachesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_nodes.html
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
        context.put("RequestURI", "/DescribeCacheNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_nodes.html
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
        context.put("RequestURI", "/DescribeCacheNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public List<String> getCacheNodes() {
            return this.cacheNodes;
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

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private List<String> status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public List<String> getStatus() {
            return this.status;
        }

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
            return null;
        }
    }

    public static class DescribeCacheNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheNodeModel> cacheNodeSet;

        @ParamAnnotation(paramType = "query", paramName = "cache_node_set")
        public void setCacheNodeSet(List<CacheNodeModel> cacheNodeSet) {
            this.cacheNodeSet = cacheNodeSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_node_set")
        public List<CacheNodeModel> getCacheNodeSet() {
            return this.cacheNodeSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_parameter_groups.html
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
        context.put("RequestURI", "/DescribeCacheParameterGroups");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_parameter_groups.html
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
        context.put("RequestURI", "/DescribeCacheParameterGroups");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_groups")
        public void setCacheParameterGroups(List<String> cacheParameterGroups) {
            this.cacheParameterGroups = cacheParameterGroups;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_groups")
        public List<String> getCacheParameterGroups() {
            return this.cacheParameterGroups;
        }

        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public String getCacheType() {
            return this.cacheType;
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

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

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
            return null;
        }
    }

    public static class DescribeCacheParameterGroupsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheParameterGroupModel> cacheParameterGroupSet;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_set")
        public void setCacheParameterGroupSet(List<CacheParameterGroupModel> cacheParameterGroupSet) {
            this.cacheParameterGroupSet = cacheParameterGroupSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_set")
        public List<CacheParameterGroupModel> getCacheParameterGroupSet() {
            return this.cacheParameterGroupSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_parameters.html
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
        context.put("RequestURI", "/DescribeCacheParameters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/describe_cache_parameters.html
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
        context.put("RequestURI", "/DescribeCacheParameters");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

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
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    public static class DescribeCacheParametersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheParameterModel> cacheParameterSet;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_set")
        public void setCacheParameterSet(List<CacheParameterModel> cacheParameterSet) {
            this.cacheParameterSet = cacheParameterSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_set")
        public List<CacheParameterModel> getCacheParameterSet() {
            return this.cacheParameterSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/describe_caches.html
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
        context.put("RequestURI", "/DescribeCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/describe_caches.html
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
        context.put("RequestURI", "/DescribeCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(List<String> cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public List<String> getCacheType() {
            return this.cacheType;
        }

        private List<String> caches;

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public List<String> getCaches() {
            return this.caches;
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

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private List<String> status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public List<String> getStatus() {
            return this.status;
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
            return null;
        }
    }

    public static class DescribeCachesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<CacheModel> cacheSet;

        @ParamAnnotation(paramType = "query", paramName = "cache_set")
        public void setCacheSet(List<CacheModel> cacheSet) {
            this.cacheSet = cacheSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_set")
        public List<CacheModel> getCacheSet() {
            return this.cacheSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/monitor/get_cache_monitor.html
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
        context.put("RequestURI", "/GetCacheMonitor");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/monitor/get_cache_monitor.html
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
        context.put("RequestURI", "/GetCacheMonitor");

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

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public String getEndTime() {
            return this.endTime;
        }

        // Required
        private List<String> meters;

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public void setMeters(List<String> meters) {
            this.meters = meters;
        }

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public List<String> getMeters() {
            return this.meters;
        }

        // Required
        private String resource;

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public void setResource(String resource) {
            this.resource = resource;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public String getResource() {
            return this.resource;
        }

        // Required
        private String startTime;

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public String getStartTime() {
            return this.startTime;
        }

    	// Step's available values: 5m, 15m, 2h, 1d
        // Required
        private String step;

        @ParamAnnotation(paramType = "query", paramName = "step")
        public void setStep(String step) {
            this.step = step;
        }

        @ParamAnnotation(paramType = "query", paramName = "step")
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

    public static class GetCacheMonitorOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<MeterModel> meterSet;

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public void setMeterSet(List<MeterModel> meterSet) {
            this.meterSet = meterSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public List<MeterModel> getMeterSet() {
            return this.meterSet;
        }

        private String resourceID;

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public String getResourceID() {
            return this.resourceID;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_attributes.html
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
        context.put("RequestURI", "/ModifyCacheAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_attributes.html
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
        context.put("RequestURI", "/ModifyCacheAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        // Required
        private String cache;

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        private String cacheName;

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_name")
        public String getCacheName() {
            return this.cacheName;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCache())) {
                throw new QCException("Cache is required");
            }
            return null;
        }
    }

    public static class ModifyCacheAttributesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_node_attributes.html
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
        context.put("RequestURI", "/ModifyCacheNodeAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_node_attributes.html
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
        context.put("RequestURI", "/ModifyCacheNodeAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_node")
        public void setCacheNode(String cacheNode) {
            this.cacheNode = cacheNode;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_node")
        public String getCacheNode() {
            return this.cacheNode;
        }

        private String cacheNodeName;

        @ParamAnnotation(paramType = "query", paramName = "cache_node_name")
        public void setCacheNodeName(String cacheNodeName) {
            this.cacheNodeName = cacheNodeName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_node_name")
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

    public static class ModifyCacheNodeAttributesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_parameter_group_attributes.html
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
        context.put("RequestURI", "/ModifyCacheParameterGroupAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/modify_cache_parameter_group_attributes.html
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
        context.put("RequestURI", "/ModifyCacheParameterGroupAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private String cacheParameterGroupName;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_name")
        public void setCacheParameterGroupName(String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_name")
        public String getCacheParameterGroupName() {
            return this.cacheParameterGroupName;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterGroup())) {
                throw new QCException("CacheParameterGroup is required");
            }
            return null;
        }
    }

    public static class ModifyCacheParameterGroupAttributesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private String cacheParameterGroupID;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/reset_cache_parameters.html
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
        context.put("RequestURI", "/ResetCacheParameters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/reset_cache_parameters.html
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
        context.put("RequestURI", "/ResetCacheParameters");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        private List<String> cacheParameterNames;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_names")
        public void setCacheParameterNames(List<String> cacheParameterNames) {
            this.cacheParameterNames = cacheParameterNames;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_names")
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

    public static class ResetCacheParametersOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/resize_cache.html
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
        context.put("RequestURI", "/ResizeCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/resize_cache.html
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
        context.put("RequestURI", "/ResizeCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public void setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_size")
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        // Required
        private List<String> caches;

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
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

    public static class ResizeCachesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/restart_cache_nodes.html
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
        context.put("RequestURI", "/RestartCacheNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/restart_cache_nodes.html
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
        context.put("RequestURI", "/RestartCacheNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        // Required
        private List<String> cacheNodes;

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
        public void setCacheNodes(List<String> cacheNodes) {
            this.cacheNodes = cacheNodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_nodes")
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

    public static class RestartCacheNodesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/restart_caches.html
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
        context.put("RequestURI", "/RestartCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/restart_caches.html
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
        context.put("RequestURI", "/RestartCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RestartCachesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/start_caches.html
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
        context.put("RequestURI", "/StartCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/start_caches.html
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
        context.put("RequestURI", "/StartCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StartCachesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/stop_caches.html
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
        context.put("RequestURI", "/StopCaches");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/stop_caches.html
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
        context.put("RequestURI", "/StopCaches");

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

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public void setCaches(List<String> caches) {
            this.caches = caches;
        }

        @ParamAnnotation(paramType = "query", paramName = "caches")
        public List<String> getCaches() {
            return this.caches;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StopCachesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> cacheIDs;

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public void setCacheIDs(List<String> cacheIDs) {
            this.cacheIDs = cacheIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_ids")
        public List<String> getCacheIDs() {
            return this.cacheIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/update_cache.html
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
        context.put("RequestURI", "/UpdateCache");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/update_cache.html
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
        context.put("RequestURI", "/UpdateCache");

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

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public void setCache(String cache) {
            this.cache = cache;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache")
        public String getCache() {
            return this.cache;
        }

        private List<CachePrivateIPModel> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<CachePrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
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

    public static class UpdateCacheOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cache/update_cache_parameters.html
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
        context.put("RequestURI", "/UpdateCacheParameters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cache/update_cache_parameters.html
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
        context.put("RequestURI", "/UpdateCacheParameters");

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

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public void setCacheParameterGroup(String cacheParameterGroup) {
            this.cacheParameterGroup = cacheParameterGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group")
        public String getCacheParameterGroup() {
            return this.cacheParameterGroup;
        }

        // Required
        private CacheParameterModel parameters;

        @ParamAnnotation(paramType = "query", paramName = "parameters")
        public void setParameters(CacheParameterModel parameters) {
            this.parameters = parameters;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameters")
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

    public static class UpdateCacheParametersOutput extends OutputModel {
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



















