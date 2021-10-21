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

public class RDBService {

    private EnvContext envContext;

    private String zone;

    public RDBService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public RDBService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return ApplyRDBParameterGroupOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/apply_rdb_parameter_group.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ApplyRDBParameterGroupOutput applyRDBParameterGroup(ApplyRDBParameterGroupInput input) throws QCException {
        if (input == null) {
            input = new ApplyRDBParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyRDBParameterGroup");
        context.put("APIName", "ApplyRDBParameterGroup");
        context.put("ServiceName", "ApplyRDBParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyRDBParameterGroup");

        input.setAction("ApplyRDBParameterGroup");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ApplyRDBParameterGroupOutput.class);
        if(backModel != null){
            return (ApplyRDBParameterGroupOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/apply_rdb_parameter_group.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void applyRDBParameterGroup(ApplyRDBParameterGroupInput input, ResponseCallBack<ApplyRDBParameterGroupOutput> callback) throws QCException {
        if (input == null) {
            input = new ApplyRDBParameterGroupInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ApplyRDBParameterGroup");
        context.put("APIName", "ApplyRDBParameterGroup");
        context.put("ServiceName", "ApplyRDBParameterGroup");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ApplyRDBParameterGroup");

        input.setAction("ApplyRDBParameterGroup");
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

    public static class ApplyRDBParameterGroupInput extends IaasParamBody {
        // Required
        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRDB())) {
                throw new QCException("RDB is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApplyRDBParameterGroupOutput extends OutputModel {
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

        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
      * @return CeaseRDBInstanceOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/cease_rdb_instance.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CeaseRDBInstanceOutput ceaseRDBInstance(CeaseRDBInstanceInput input) throws QCException {
        if (input == null) {
            input = new CeaseRDBInstanceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseRDBInstance");
        context.put("APIName", "CeaseRDBInstance");
        context.put("ServiceName", "CeaseRDBInstance");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseRDBInstance");

        input.setAction("CeaseRDBInstance");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CeaseRDBInstanceOutput.class);
        if(backModel != null){
            return (CeaseRDBInstanceOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/cease_rdb_instance.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void ceaseRDBInstance(CeaseRDBInstanceInput input, ResponseCallBack<CeaseRDBInstanceOutput> callback) throws QCException {
        if (input == null) {
            input = new CeaseRDBInstanceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseRDBInstance");
        context.put("APIName", "CeaseRDBInstance");
        context.put("ServiceName", "CeaseRDBInstance");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseRDBInstance");

        input.setAction("CeaseRDBInstance");
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

    public static class CeaseRDBInstanceInput extends IaasParamBody {
        // Required
        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
        }

        // Required
        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRDB())) {
                throw new QCException("RDB is required");
            }
            if (QCStringUtil.isEmpty(this.getRDBInstance())) {
                throw new QCException("RDBInstance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CeaseRDBInstanceOutput extends OutputModel {
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
      * @return CopyRDBInstanceFilesToFTPOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/copy_rdb_instance_files_to_ftp.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CopyRDBInstanceFilesToFTPOutput copyRDBInstanceFilesToFTP(CopyRDBInstanceFilesToFTPInput input) throws QCException {
        if (input == null) {
            input = new CopyRDBInstanceFilesToFTPInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CopyRDBInstanceFilesToFTP");
        context.put("APIName", "CopyRDBInstanceFilesToFTP");
        context.put("ServiceName", "CopyRDBInstanceFilesToFTP");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CopyRDBInstanceFilesToFTP");

        input.setAction("CopyRDBInstanceFilesToFTP");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CopyRDBInstanceFilesToFTPOutput.class);
        if(backModel != null){
            return (CopyRDBInstanceFilesToFTPOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/copy_rdb_instance_files_to_ftp.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void copyRDBInstanceFilesToFTP(CopyRDBInstanceFilesToFTPInput input, ResponseCallBack<CopyRDBInstanceFilesToFTPOutput> callback) throws QCException {
        if (input == null) {
            input = new CopyRDBInstanceFilesToFTPInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CopyRDBInstanceFilesToFTP");
        context.put("APIName", "CopyRDBInstanceFilesToFTP");
        context.put("ServiceName", "CopyRDBInstanceFilesToFTP");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CopyRDBInstanceFilesToFTP");

        input.setAction("CopyRDBInstanceFilesToFTP");
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

    public static class CopyRDBInstanceFilesToFTPInput extends IaasParamBody {
        // Required
        private List<String> files;

        @JsonProperty(value = "files")
        public void setFiles(List<String> files) {
            this.files = files;
        }

        @JsonProperty(value = "files")
        public List<String> getFiles() {
            return this.files;
        }

        // Required
        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRDBInstance())) {
                throw new QCException("RDBInstance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CopyRDBInstanceFilesToFTPOutput extends OutputModel {
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

        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
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
      * @return CreateRDBOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/create_rdb.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateRDBOutput createRDB(CreateRDBInput input) throws QCException {
        if (input == null) {
            input = new CreateRDBInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRDB");
        context.put("APIName", "CreateRDB");
        context.put("ServiceName", "CreateRDB");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRDB");

        input.setAction("CreateRDB");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateRDBOutput.class);
        if(backModel != null){
            return (CreateRDBOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/create_rdb.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createRDB(CreateRDBInput input, ResponseCallBack<CreateRDBOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateRDBInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRDB");
        context.put("APIName", "CreateRDB");
        context.put("ServiceName", "CreateRDB");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRDB");

        input.setAction("CreateRDB");
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

    public static class CreateRDBInput extends IaasParamBody {
        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
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

    	// EngineVersion's available values: mysql,5.5, mysql,5.6, mysql,5.7, psql,9.3, psql,9.4
        private String engineVersion;

        @JsonProperty(value = "engine_version")
        public void setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
        }

        @JsonProperty(value = "engine_version")
        public String getEngineVersion() {
            return this.engineVersion;
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

        private List<RDBPrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<RDBPrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<RDBPrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        private Integer proxyCount;

        @JsonProperty(value = "proxy_count")
        public void setProxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
        }

        @JsonProperty(value = "proxy_count")
        public Integer getProxyCount() {
            return this.proxyCount;
        }

        private Integer rDBClass;

        @JsonProperty(value = "rdb_class")
        public void setRDBClass(Integer rDBClass) {
            this.rDBClass = rDBClass;
        }

        @JsonProperty(value = "rdb_class")
        public Integer getRDBClass() {
            return this.rDBClass;
        }

    	// RDBEngine's available values: mysql, psql
        private String rDBEngine;

        @JsonProperty(value = "rdb_engine")
        public void setRDBEngine(String rDBEngine) {
            this.rDBEngine = rDBEngine;
        }

        @JsonProperty(value = "rdb_engine")
        public String getRDBEngine() {
            return this.rDBEngine;
        }

        private String rDBName;

        @JsonProperty(value = "rdb_name")
        public void setRDBName(String rDBName) {
            this.rDBName = rDBName;
        }

        @JsonProperty(value = "rdb_name")
        public String getRDBName() {
            return this.rDBName;
        }

        // Required
        private String rDBPassword;

        @JsonProperty(value = "rdb_password")
        public void setRDBPassword(String rDBPassword) {
            this.rDBPassword = rDBPassword;
        }

        @JsonProperty(value = "rdb_password")
        public String getRDBPassword() {
            return this.rDBPassword;
        }

    	// RDBType's available values: 1, 2, 4, 8, 16, 32
        // Required
        private Integer rDBType;

        @JsonProperty(value = "rdb_type")
        public void setRDBType(Integer rDBType) {
            this.rDBType = rDBType;
        }

        @JsonProperty(value = "rdb_type")
        public Integer getRDBType() {
            return this.rDBType;
        }

        // Required
        private String rDBUsername;

        @JsonProperty(value = "rdb_username")
        public void setRDBUsername(String rDBUsername) {
            this.rDBUsername = rDBUsername;
        }

        @JsonProperty(value = "rdb_username")
        public String getRDBUsername() {
            return this.rDBUsername;
        }

        // Required
        private Integer storageSize;

        @JsonProperty(value = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @JsonProperty(value = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
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
            String[] engineVersionValidValues = {
                "mysql,5.5", "mysql,5.6", "mysql,5.7", "psql,9.3", "psql,9.4"
            };

            boolean engineVersionIsValid = false;
            for (String v : engineVersionValidValues) {
                if (v.equals(this.getEngineVersion())) {
                    engineVersionIsValid = true;
                }
                Boolean engineVersionIsRequired = Boolean.FALSE;
                if (engineVersionIsRequired.equals(Boolean.FALSE) && this.getEngineVersion() == null) {
                    engineVersionIsValid = true;
                }
            }

            if (!engineVersionIsValid) {
                throw new QCException("EngineVersion value " + this.getEngineVersion() + "is invalid");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] rDBEngineValidValues = {
                "mysql", "psql"
            };

            boolean rDBEngineIsValid = false;
            for (String v : rDBEngineValidValues) {
                if (v.equals(this.getRDBEngine())) {
                    rDBEngineIsValid = true;
                }
                Boolean rDBEngineIsRequired = Boolean.FALSE;
                if (rDBEngineIsRequired.equals(Boolean.FALSE) && this.getRDBEngine() == null) {
                    rDBEngineIsValid = true;
                }
            }

            if (!rDBEngineIsValid) {
                throw new QCException("RDBEngine value " + this.getRDBEngine() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getRDBPassword())) {
                throw new QCException("RDBPassword is required");
            }
            if (this.getRDBType() < 0 ) {
                throw new QCException("RDBType is required");
            }
            String[]rDBTypeValidValues = {"1", "2", "4", "8", "16", "32"};
            boolean rDBTypeIsValid = false;
            for (String v : rDBTypeValidValues) {
                if (v.equals(this.getRDBType()+"")) {
                    rDBTypeIsValid = true;
                }
                Boolean rDBTypeIsRequired = Boolean.TRUE;
                if (rDBTypeIsRequired.equals(Boolean.FALSE) && this.getRDBType()==null) {
                    rDBTypeIsValid = true;
                }
            }

            if (!rDBTypeIsValid) {
                throw new QCException("RDBType value " + this.getRDBType() + "is invalid");
            }
            if (QCStringUtil.isEmpty(this.getRDBUsername())) {
                throw new QCException("RDBUsername is required");
            }
            if (this.getStorageSize() < 0 ) {
                throw new QCException("StorageSize is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateRDBOutput extends OutputModel {
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

        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
      * @return CreateRDBFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/create_rdb_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateRDBFromSnapshotOutput createRDBFromSnapshot(CreateRDBFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateRDBFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRDBFromSnapshot");
        context.put("APIName", "CreateRDBFromSnapshot");
        context.put("ServiceName", "CreateRDBFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRDBFromSnapshot");

        input.setAction("CreateRDBFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateRDBFromSnapshotOutput.class);
        if(backModel != null){
            return (CreateRDBFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/create_rdb_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createRDBFromSnapshot(CreateRDBFromSnapshotInput input, ResponseCallBack<CreateRDBFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateRDBFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateRDBFromSnapshot");
        context.put("APIName", "CreateRDBFromSnapshot");
        context.put("ServiceName", "CreateRDBFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateRDBFromSnapshot");

        input.setAction("CreateRDBFromSnapshot");
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

    public static class CreateRDBFromSnapshotInput extends IaasParamBody {
        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
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

    	// EngineVersion's available values: mysql,5.5, mysql,5.6, mysql,5.7, psql,9.3, psql,9.4
        private String engineVersion;

        @JsonProperty(value = "engine_version")
        public void setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
        }

        @JsonProperty(value = "engine_version")
        public String getEngineVersion() {
            return this.engineVersion;
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

        private List<RDBPrivateIPModel> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<RDBPrivateIPModel> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<RDBPrivateIPModel> getPrivateIPs() {
            return this.privateIPs;
        }

        private Integer proxyCount;

        @JsonProperty(value = "proxy_count")
        public void setProxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
        }

        @JsonProperty(value = "proxy_count")
        public Integer getProxyCount() {
            return this.proxyCount;
        }

    	// RDBEngine's available values: mysql, psql
        private String rDBEngine;

        @JsonProperty(value = "rdb_engine")
        public void setRDBEngine(String rDBEngine) {
            this.rDBEngine = rDBEngine;
        }

        @JsonProperty(value = "rdb_engine")
        public String getRDBEngine() {
            return this.rDBEngine;
        }

        private String rDBName;

        @JsonProperty(value = "rdb_name")
        public void setRDBName(String rDBName) {
            this.rDBName = rDBName;
        }

        @JsonProperty(value = "rdb_name")
        public String getRDBName() {
            return this.rDBName;
        }

    	// RDBType's available values: 1, 2, 4, 8, 16, 32
        // Required
        private Integer rDBType;

        @JsonProperty(value = "rdb_type")
        public void setRDBType(Integer rDBType) {
            this.rDBType = rDBType;
        }

        @JsonProperty(value = "rdb_type")
        public Integer getRDBType() {
            return this.rDBType;
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

        private Integer storageSize;

        @JsonProperty(value = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @JsonProperty(value = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
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
            String[] engineVersionValidValues = {
                "mysql,5.5", "mysql,5.6", "mysql,5.7", "psql,9.3", "psql,9.4"
            };

            boolean engineVersionIsValid = false;
            for (String v : engineVersionValidValues) {
                if (v.equals(this.getEngineVersion())) {
                    engineVersionIsValid = true;
                }
                Boolean engineVersionIsRequired = Boolean.FALSE;
                if (engineVersionIsRequired.equals(Boolean.FALSE) && this.getEngineVersion() == null) {
                    engineVersionIsValid = true;
                }
            }

            if (!engineVersionIsValid) {
                throw new QCException("EngineVersion value " + this.getEngineVersion() + "is invalid");
            }
            if (this.getPrivateIPs() != null && this.getPrivateIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getPrivateIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] rDBEngineValidValues = {
                "mysql", "psql"
            };

            boolean rDBEngineIsValid = false;
            for (String v : rDBEngineValidValues) {
                if (v.equals(this.getRDBEngine())) {
                    rDBEngineIsValid = true;
                }
                Boolean rDBEngineIsRequired = Boolean.FALSE;
                if (rDBEngineIsRequired.equals(Boolean.FALSE) && this.getRDBEngine() == null) {
                    rDBEngineIsValid = true;
                }
            }

            if (!rDBEngineIsValid) {
                throw new QCException("RDBEngine value " + this.getRDBEngine() + "is invalid");
            }
            if (this.getRDBType() < 0 ) {
                throw new QCException("RDBType is required");
            }
            String[]rDBTypeValidValues = {"1", "2", "4", "8", "16", "32"};
            boolean rDBTypeIsValid = false;
            for (String v : rDBTypeValidValues) {
                if (v.equals(this.getRDBType()+"")) {
                    rDBTypeIsValid = true;
                }
                Boolean rDBTypeIsRequired = Boolean.TRUE;
                if (rDBTypeIsRequired.equals(Boolean.FALSE) && this.getRDBType()==null) {
                    rDBTypeIsValid = true;
                }
            }

            if (!rDBTypeIsValid) {
                throw new QCException("RDBType value " + this.getRDBType() + "is invalid");
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
    public static class CreateRDBFromSnapshotOutput extends OutputModel {
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

        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
      * @return CreateTempRDBInstanceFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/create_temp_rdb_instance_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateTempRDBInstanceFromSnapshotOutput createTempRDBInstanceFromSnapshot(CreateTempRDBInstanceFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateTempRDBInstanceFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateTempRDBInstanceFromSnapshot");
        context.put("APIName", "CreateTempRDBInstanceFromSnapshot");
        context.put("ServiceName", "CreateTempRDBInstanceFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateTempRDBInstanceFromSnapshot");

        input.setAction("CreateTempRDBInstanceFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateTempRDBInstanceFromSnapshotOutput.class);
        if(backModel != null){
            return (CreateTempRDBInstanceFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/create_temp_rdb_instance_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createTempRDBInstanceFromSnapshot(CreateTempRDBInstanceFromSnapshotInput input, ResponseCallBack<CreateTempRDBInstanceFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateTempRDBInstanceFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateTempRDBInstanceFromSnapshot");
        context.put("APIName", "CreateTempRDBInstanceFromSnapshot");
        context.put("ServiceName", "CreateTempRDBInstanceFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateTempRDBInstanceFromSnapshot");

        input.setAction("CreateTempRDBInstanceFromSnapshot");
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

    public static class CreateTempRDBInstanceFromSnapshotInput extends IaasParamBody {
        // Required
        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
            if (QCStringUtil.isEmpty(this.getRDB())) {
                throw new QCException("RDB is required");
            }
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateTempRDBInstanceFromSnapshotOutput extends OutputModel {
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

        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
      * @return DeleteRDBsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/delete_rdbs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteRDBsOutput deleteRDBs(DeleteRDBsInput input) throws QCException {
        if (input == null) {
            input = new DeleteRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRDBs");
        context.put("APIName", "DeleteRDBs");
        context.put("ServiceName", "DeleteRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRDBs");

        input.setAction("DeleteRDBs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteRDBsOutput.class);
        if(backModel != null){
            return (DeleteRDBsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/delete_rdbs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteRDBs(DeleteRDBsInput input, ResponseCallBack<DeleteRDBsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteRDBs");
        context.put("APIName", "DeleteRDBs");
        context.put("ServiceName", "DeleteRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteRDBs");

        input.setAction("DeleteRDBs");
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

    public static class DeleteRDBsInput extends IaasParamBody {
        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteRDBsOutput extends OutputModel {
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

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
      * @return DescribeRDBParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/describe_rdb_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRDBParametersOutput describeRDBParameters(DescribeRDBParametersInput input) throws QCException {
        if (input == null) {
            input = new DescribeRDBParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRDBParameters");
        context.put("APIName", "DescribeRDBParameters");
        context.put("ServiceName", "DescribeRDBParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRDBParameters");

        input.setAction("DescribeRDBParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRDBParametersOutput.class);
        if(backModel != null){
            return (DescribeRDBParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/describe_rdb_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRDBParameters(DescribeRDBParametersInput input, ResponseCallBack<DescribeRDBParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRDBParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRDBParameters");
        context.put("APIName", "DescribeRDBParameters");
        context.put("ServiceName", "DescribeRDBParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRDBParameters");

        input.setAction("DescribeRDBParameters");
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

    public static class DescribeRDBParametersInput extends IaasParamBody {
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

        private String parameterGroup;

        @JsonProperty(value = "parameter_group")
        public void setParameterGroup(String parameterGroup) {
            this.parameterGroup = parameterGroup;
        }

        @JsonProperty(value = "parameter_group")
        public String getParameterGroup() {
            return this.parameterGroup;
        }

        // Required
        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRDB())) {
                throw new QCException("RDB is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeRDBParametersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<RDBParameterModel> parameterSet;

        @JsonProperty(value = "parameter_set")
        public void setParameterSet(List<RDBParameterModel> parameterSet) {
            this.parameterSet = parameterSet;
        }

        @JsonProperty(value = "parameter_set")
        public List<RDBParameterModel> getParameterSet() {
            return this.parameterSet;
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
      * @return DescribeRDBsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/describe_rdbs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeRDBsOutput describeRDBs(DescribeRDBsInput input) throws QCException {
        if (input == null) {
            input = new DescribeRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRDBs");
        context.put("APIName", "DescribeRDBs");
        context.put("ServiceName", "DescribeRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRDBs");

        input.setAction("DescribeRDBs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeRDBsOutput.class);
        if(backModel != null){
            return (DescribeRDBsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/describe_rdbs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeRDBs(DescribeRDBsInput input, ResponseCallBack<DescribeRDBsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeRDBs");
        context.put("APIName", "DescribeRDBs");
        context.put("ServiceName", "DescribeRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeRDBs");

        input.setAction("DescribeRDBs");
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

    public static class DescribeRDBsInput extends IaasParamBody {
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

        private String rDBEngine;

        @JsonProperty(value = "rdb_engine")
        public void setRDBEngine(String rDBEngine) {
            this.rDBEngine = rDBEngine;
        }

        @JsonProperty(value = "rdb_engine")
        public String getRDBEngine() {
            return this.rDBEngine;
        }

        private String rDBName;

        @JsonProperty(value = "rdb_name")
        public void setRDBName(String rDBName) {
            this.rDBName = rDBName;
        }

        @JsonProperty(value = "rdb_name")
        public String getRDBName() {
            return this.rDBName;
        }

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
    public static class DescribeRDBsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<RDBModel> rDBSet;

        @JsonProperty(value = "rdb_set")
        public void setRDBSet(List<RDBModel> rDBSet) {
            this.rDBSet = rDBSet;
        }

        @JsonProperty(value = "rdb_set")
        public List<RDBModel> getRDBSet() {
            return this.rDBSet;
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
      * @return GetRDBInstanceFilesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/get_rdb_instance_files.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetRDBInstanceFilesOutput getRDBInstanceFiles(GetRDBInstanceFilesInput input) throws QCException {
        if (input == null) {
            input = new GetRDBInstanceFilesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRDBInstanceFiles");
        context.put("APIName", "GetRDBInstanceFiles");
        context.put("ServiceName", "GetRDBInstanceFiles");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRDBInstanceFiles");

        input.setAction("GetRDBInstanceFiles");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetRDBInstanceFilesOutput.class);
        if(backModel != null){
            return (GetRDBInstanceFilesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/get_rdb_instance_files.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getRDBInstanceFiles(GetRDBInstanceFilesInput input, ResponseCallBack<GetRDBInstanceFilesOutput> callback) throws QCException {
        if (input == null) {
            input = new GetRDBInstanceFilesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRDBInstanceFiles");
        context.put("APIName", "GetRDBInstanceFiles");
        context.put("ServiceName", "GetRDBInstanceFiles");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRDBInstanceFiles");

        input.setAction("GetRDBInstanceFiles");
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

    public static class GetRDBInstanceFilesInput extends IaasParamBody {
        // Required
        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getRDBInstance())) {
                throw new QCException("RDBInstance is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetRDBInstanceFilesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private RDBFileModel files;

        @JsonProperty(value = "files")
        public void setFiles(RDBFileModel files) {
            this.files = files;
        }

        @JsonProperty(value = "files")
        public RDBFileModel getFiles() {
            return this.files;
        }

        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
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
      * @return GetRDBMonitorOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/monitor/get_rdb_monitor.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetRDBMonitorOutput getRDBMonitor(GetRDBMonitorInput input) throws QCException {
        if (input == null) {
            input = new GetRDBMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRDBMonitor");
        context.put("APIName", "GetRDBMonitor");
        context.put("ServiceName", "GetRDBMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRDBMonitor");

        input.setAction("GetRDBMonitor");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetRDBMonitorOutput.class);
        if(backModel != null){
            return (GetRDBMonitorOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/monitor/get_rdb_monitor.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getRDBMonitor(GetRDBMonitorInput input, ResponseCallBack<GetRDBMonitorOutput> callback) throws QCException {
        if (input == null) {
            input = new GetRDBMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetRDBMonitor");
        context.put("APIName", "GetRDBMonitor");
        context.put("ServiceName", "GetRDBMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetRDBMonitor");

        input.setAction("GetRDBMonitor");
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

    public static class GetRDBMonitorInput extends IaasParamBody {
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
        private String rDBEngine;

        @JsonProperty(value = "rdb_engine")
        public void setRDBEngine(String rDBEngine) {
            this.rDBEngine = rDBEngine;
        }

        @JsonProperty(value = "rdb_engine")
        public String getRDBEngine() {
            return this.rDBEngine;
        }

        private String rDBInstance;

        @JsonProperty(value = "rdb_instance")
        public void setRDBInstance(String rDBInstance) {
            this.rDBInstance = rDBInstance;
        }

        @JsonProperty(value = "rdb_instance")
        public String getRDBInstance() {
            return this.rDBInstance;
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
        private String role;

        @JsonProperty(value = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public String getRole() {
            return this.role;
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
            if (QCStringUtil.isEmpty(this.getRDBEngine())) {
                throw new QCException("RDBEngine is required");
            }
            if (QCStringUtil.isEmpty(this.getResource())) {
                throw new QCException("Resource is required");
            }
            if (QCStringUtil.isEmpty(this.getRole())) {
                throw new QCException("Role is required");
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
    public static class GetRDBMonitorOutput extends OutputModel {
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
      * @return ModifyRDBParametersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/modify_rdb_parameters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyRDBParametersOutput modifyRDBParameters(ModifyRDBParametersInput input) throws QCException {
        if (input == null) {
            input = new ModifyRDBParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRDBParameters");
        context.put("APIName", "ModifyRDBParameters");
        context.put("ServiceName", "ModifyRDBParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRDBParameters");

        input.setAction("ModifyRDBParameters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyRDBParametersOutput.class);
        if(backModel != null){
            return (ModifyRDBParametersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/modify_rdb_parameters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyRDBParameters(ModifyRDBParametersInput input, ResponseCallBack<ModifyRDBParametersOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyRDBParametersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyRDBParameters");
        context.put("APIName", "ModifyRDBParameters");
        context.put("ServiceName", "ModifyRDBParameters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyRDBParameters");

        input.setAction("ModifyRDBParameters");
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

    public static class ModifyRDBParametersInput extends IaasParamBody {
        private List<RDBParametersModel> parameters;

        @JsonProperty(value = "parameters")
        public void setParameters(List<RDBParametersModel> parameters) {
            this.parameters = parameters;
        }

        @JsonProperty(value = "parameters")
        public List<RDBParametersModel> getParameters() {
            return this.parameters;
        }

        // Required
        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
        }

        public String validateParam() throws QCException {
            if (this.getParameters() != null && this.getParameters().size() > 0 ) {
                for (int i = 0 ; i < this.getParameters().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getRDB())) {
                throw new QCException("RDB is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyRDBParametersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String rDB;

        @JsonProperty(value = "rdb")
        public void setRDB(String rDB) {
            this.rDB = rDB;
        }

        @JsonProperty(value = "rdb")
        public String getRDB() {
            return this.rDB;
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
      * @return RDBsJoinVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/rdbs_join_vxnet.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RDBsJoinVxNetOutput rDBsJoinVxNet(RDBsJoinVxNetInput input) throws QCException {
        if (input == null) {
            input = new RDBsJoinVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RDBsJoinVxnet");
        context.put("APIName", "RDBsJoinVxnet");
        context.put("ServiceName", "RDBsJoinVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RDBsJoinVxnet");

        input.setAction("RDBsJoinVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RDBsJoinVxNetOutput.class);
        if(backModel != null){
            return (RDBsJoinVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/rdbs_join_vxnet.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void rDBsJoinVxNet(RDBsJoinVxNetInput input, ResponseCallBack<RDBsJoinVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new RDBsJoinVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RDBsJoinVxNet");
        context.put("APIName", "RDBsJoinVxNet");
        context.put("ServiceName", "RDBsJoinVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RDBsJoinVxnet");

        input.setAction("RDBsJoinVxNet");
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

    public static class RDBsJoinVxNetInput extends IaasParamBody {
        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
    public static class RDBsJoinVxNetOutput extends OutputModel {
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

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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

        private String vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(String vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
        public String getVxNet() {
            return this.vxNet;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return RDBsLeaveVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/rdbs_leave_vxnet.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RDBsLeaveVxNetOutput rDBsLeaveVxNet(RDBsLeaveVxNetInput input) throws QCException {
        if (input == null) {
            input = new RDBsLeaveVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RDBsLeaveVxnet");
        context.put("APIName", "RDBsLeaveVxnet");
        context.put("ServiceName", "RDBsLeaveVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RDBsLeaveVxnet");

        input.setAction("RDBsLeaveVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RDBsLeaveVxNetOutput.class);
        if(backModel != null){
            return (RDBsLeaveVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/rdbs_leave_vxnet.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void rDBsLeaveVxNet(RDBsLeaveVxNetInput input, ResponseCallBack<RDBsLeaveVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new RDBsLeaveVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RDBsLeaveVxNet");
        context.put("APIName", "RDBsLeaveVxNet");
        context.put("ServiceName", "RDBsLeaveVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RDBsLeaveVxnet");

        input.setAction("RDBsLeaveVxNet");
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

    public static class RDBsLeaveVxNetInput extends IaasParamBody {
        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
    public static class RDBsLeaveVxNetOutput extends OutputModel {
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
      * @return ResizeRDBsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/resize_rdbs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeRDBsOutput resizeRDBs(ResizeRDBsInput input) throws QCException {
        if (input == null) {
            input = new ResizeRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeRDBs");
        context.put("APIName", "ResizeRDBs");
        context.put("ServiceName", "ResizeRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeRDBs");

        input.setAction("ResizeRDBs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeRDBsOutput.class);
        if(backModel != null){
            return (ResizeRDBsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/resize_rdbs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeRDBs(ResizeRDBsInput input, ResponseCallBack<ResizeRDBsOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeRDBs");
        context.put("APIName", "ResizeRDBs");
        context.put("ServiceName", "ResizeRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeRDBs");

        input.setAction("ResizeRDBs");
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

    public static class ResizeRDBsInput extends IaasParamBody {
    	// RDBType's available values: 1, 2, 4, 8, 16, 32
        private Integer rDBType;

        @JsonProperty(value = "rdb_type")
        public void setRDBType(Integer rDBType) {
            this.rDBType = rDBType;
        }

        @JsonProperty(value = "rdb_type")
        public Integer getRDBType() {
            return this.rDBType;
        }

        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
        }

        private Integer storageSize;

        @JsonProperty(value = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @JsonProperty(value = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public String validateParam() throws QCException {
            String[]rDBTypeValidValues = {"1", "2", "4", "8", "16", "32"};
            boolean rDBTypeIsValid = false;
            for (String v : rDBTypeValidValues) {
                if (v.equals(this.getRDBType()+"")) {
                    rDBTypeIsValid = true;
                }
                Boolean rDBTypeIsRequired = Boolean.FALSE;
                if (rDBTypeIsRequired.equals(Boolean.FALSE) && this.getRDBType()==null) {
                    rDBTypeIsValid = true;
                }
            }

            if (!rDBTypeIsValid) {
                throw new QCException("RDBType value " + this.getRDBType() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeRDBsOutput extends OutputModel {
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

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
      * @return StartRDBsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/start_rdbs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StartRDBsOutput startRDBs(StartRDBsInput input) throws QCException {
        if (input == null) {
            input = new StartRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartRDBs");
        context.put("APIName", "StartRDBs");
        context.put("ServiceName", "StartRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartRDBs");

        input.setAction("StartRDBs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StartRDBsOutput.class);
        if(backModel != null){
            return (StartRDBsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/start_rdbs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void startRDBs(StartRDBsInput input, ResponseCallBack<StartRDBsOutput> callback) throws QCException {
        if (input == null) {
            input = new StartRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartRDBs");
        context.put("APIName", "StartRDBs");
        context.put("ServiceName", "StartRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartRDBs");

        input.setAction("StartRDBs");
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

    public static class StartRDBsInput extends IaasParamBody {
        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StartRDBsOutput extends OutputModel {
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

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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
      * @return StopRDBsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/rdb/stop_rdbs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StopRDBsOutput stopRDBs(StopRDBsInput input) throws QCException {
        if (input == null) {
            input = new StopRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopRDBs");
        context.put("APIName", "StopRDBs");
        context.put("ServiceName", "StopRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopRDBs");

        input.setAction("StopRDBs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StopRDBsOutput.class);
        if(backModel != null){
            return (StopRDBsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/rdb/stop_rdbs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void stopRDBs(StopRDBsInput input, ResponseCallBack<StopRDBsOutput> callback) throws QCException {
        if (input == null) {
            input = new StopRDBsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopRDBs");
        context.put("APIName", "StopRDBs");
        context.put("ServiceName", "StopRDBs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopRDBs");

        input.setAction("StopRDBs");
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

    public static class StopRDBsInput extends IaasParamBody {
        // Required
        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StopRDBsOutput extends OutputModel {
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

        private List<String> rDBs;

        @JsonProperty(value = "rdbs")
        public void setRDBs(List<String> rDBs) {
            this.rDBs = rDBs;
        }

        @JsonProperty(value = "rdbs")
        public List<String> getRDBs() {
            return this.rDBs;
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



















