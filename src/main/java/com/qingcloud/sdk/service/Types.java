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

import com.qingcloud.sdk.exception.QCException;
import com.qingcloud.sdk.annotation.ParamAnnotation;
import com.qingcloud.sdk.utils.QCStringUtil;
import com.qingcloud.sdk.request.ParamValidate;

import java.util.List;
import java.util.Map;

public class Types {

    public class Model {}


    public static class CacheModel implements ParamValidate {
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

        private String cacheID;

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_id")
        public String getCacheID() {
            return this.cacheID;
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

        private String cacheParameterGroupID;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
        }

        private Integer cachePort;

        @ParamAnnotation(paramType = "query", paramName = "cache_port")
        public void setCachePort(Integer cachePort) {
            this.cachePort = cachePort;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_port")
        public Integer getCachePort() {
            return this.cachePort;
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

    	// CacheType's available values: Redis2.8.17, Memcached1.4.13
        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private String cacheVersion;

        @ParamAnnotation(paramType = "query", paramName = "cache_version")
        public void setCacheVersion(String cacheVersion) {
            this.cacheVersion = cacheVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_version")
        public String getCacheVersion() {
            return this.cacheVersion;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
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

        private Integer maxMemory;

        @ParamAnnotation(paramType = "query", paramName = "max_memory")
        public void setMaxMemory(Integer maxMemory) {
            this.maxMemory = maxMemory;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_memory")
        public Integer getMaxMemory() {
            return this.maxMemory;
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

        private List<CacheNodeModel> nodes;

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public void setNodes(List<CacheNodeModel> nodes) {
            this.nodes = nodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public List<CacheNodeModel> getNodes() {
            return this.nodes;
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

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, stopped, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public VxNetModel getVxNet() {
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
            String[] cacheTypeValidValues = {
                "Redis2.8.17", "Memcached1.4.13"
            };

            boolean cacheTypeIsValid = false;
            for (String v : cacheTypeValidValues) {
                if (v.equals(this.getCacheType())) {
                    cacheTypeIsValid = true;
                }
                Boolean cacheTypeIsRequired = Boolean.FALSE;
                if (cacheTypeIsRequired.equals(Boolean.FALSE) && this.getCacheType() == null) {
                    cacheTypeIsValid = true;
                }
            }

            if (!cacheTypeIsValid) {
                throw new QCException("CacheType value " + this.getCacheType() + "is invalid");
            }
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            if (this.getNodes() != null && this.getNodes().size() > 0 ) {
                for (int i = 0 ; i < this.getNodes().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] statusValidValues = {
                "pending", "active", "stopped", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "starting", "stopping", "updating", "suspending", "resuming", "deleting"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class CacheNodeModel implements ParamValidate {
        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
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

        private String cacheNodeID;

        @ParamAnnotation(paramType = "query", paramName = "cache_node_id")
        public void setCacheNodeID(String cacheNodeID) {
            this.cacheNodeID = cacheNodeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_node_id")
        public String getCacheNodeID() {
            return this.cacheNodeID;
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

    	// CacheRole's available values: master, slave
        private String cacheRole;

        @ParamAnnotation(paramType = "query", paramName = "cache_role")
        public void setCacheRole(String cacheRole) {
            this.cacheRole = cacheRole;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_role")
        public String getCacheRole() {
            return this.cacheRole;
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

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String slaveof;

        @ParamAnnotation(paramType = "query", paramName = "slaveof")
        public void setSlaveof(String slaveof) {
            this.slaveof = slaveof;
        }

        @ParamAnnotation(paramType = "query", paramName = "slaveof")
        public String getSlaveof() {
            return this.slaveof;
        }

    	// Status's available values: pending, active, down, suspended
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }


        public String validateParam() throws QCException {
            String[] cacheRoleValidValues = {
                "master", "slave"
            };

            boolean cacheRoleIsValid = false;
            for (String v : cacheRoleValidValues) {
                if (v.equals(this.getCacheRole())) {
                    cacheRoleIsValid = true;
                }
                Boolean cacheRoleIsRequired = Boolean.FALSE;
                if (cacheRoleIsRequired.equals(Boolean.FALSE) && this.getCacheRole() == null) {
                    cacheRoleIsValid = true;
                }
            }

            if (!cacheRoleIsValid) {
                throw new QCException("CacheRole value " + this.getCacheRole() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "down", "suspended"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            String[] transitionStatusValidValues = {
                "creating", "starting", "stopping", "updating", "suspending", "resuming", "deleting"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class CacheParameterModel implements ParamValidate {
        // Required
        private String cacheParameterName;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_name")
        public void setCacheParameterName(String cacheParameterName) {
            this.cacheParameterName = cacheParameterName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_name")
        public String getCacheParameterName() {
            return this.cacheParameterName;
        }

        private String cacheParameterType;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_type")
        public void setCacheParameterType(String cacheParameterType) {
            this.cacheParameterType = cacheParameterType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_type")
        public String getCacheParameterType() {
            return this.cacheParameterType;
        }

        // Required
        private String cacheParameterValue;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_value")
        public void setCacheParameterValue(String cacheParameterValue) {
            this.cacheParameterValue = cacheParameterValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_value")
        public String getCacheParameterValue() {
            return this.cacheParameterValue;
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

    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

        private Integer isStatic;

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private String oPTName;

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String parameterType;

        @ParamAnnotation(paramType = "query", paramName = "parameter_type")
        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameter_type")
        public String getParameterType() {
            return this.parameterType;
        }

        private String resourceVersion;

        @ParamAnnotation(paramType = "query", paramName = "resource_version")
        public void setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_version")
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        private String valueRange;

        @ParamAnnotation(paramType = "query", paramName = "value_range")
        public void setValueRange(String valueRange) {
            this.valueRange = valueRange;
        }

        @ParamAnnotation(paramType = "query", paramName = "value_range")
        public String getValueRange() {
            return this.valueRange;
        }


        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCacheParameterName())) {
                throw new QCException("CacheParameterName is required");
            }
            if (QCStringUtil.isEmpty(this.getCacheParameterValue())) {
                throw new QCException("CacheParameterValue is required");
            }
            String[]isReadonlyValidValues = {"0", "1"};
            boolean isReadonlyIsValid = false;
            for (String v : isReadonlyValidValues) {
                if (v.equals(this.getIsReadonly()+"")) {
                    isReadonlyIsValid = true;
                }
                Boolean isReadonlyIsRequired = Boolean.FALSE;
                if (isReadonlyIsRequired.equals(Boolean.FALSE) && this.getIsReadonly()==null) {
                    isReadonlyIsValid = true;
                }
            }

            if (!isReadonlyIsValid) {
                throw new QCException("IsReadonly value " + this.getIsReadonly() + "is invalid");
            }
            return null;
        }
    }

    public static class CacheParameterGroupModel implements ParamValidate {
        private String cacheParameterGroupID;

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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

        private String cacheType;

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private Integer isDefault;

        @ParamAnnotation(paramType = "query", paramName = "is_default")
        public void setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_default")
        public Integer getIsDefault() {
            return this.isDefault;
        }

        private List<ResourceModel> resources;

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public void setResources(List<ResourceModel> resources) {
            this.resources = resources;
        }

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public List<ResourceModel> getResources() {
            return this.resources;
        }


        public String validateParam() throws QCException {
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            if (this.getResources() != null && this.getResources().size() > 0 ) {
                for (int i = 0 ; i < this.getResources().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class CachePrivateIPModel implements ParamValidate {
        private String cacheNodeID;

        @ParamAnnotation(paramType = "query", paramName = "cache_node_id")
        public void setCacheNodeID(String cacheNodeID) {
            this.cacheNodeID = cacheNodeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_node_id")
        public String getCacheNodeID() {
            return this.cacheNodeID;
        }

    	// CacheRole's available values: master, slave
        private String cacheRole;

        @ParamAnnotation(paramType = "query", paramName = "cache_role")
        public void setCacheRole(String cacheRole) {
            this.cacheRole = cacheRole;
        }

        @ParamAnnotation(paramType = "query", paramName = "cache_role")
        public String getCacheRole() {
            return this.cacheRole;
        }

        private String privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(String privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public String getPrivateIPs() {
            return this.privateIPs;
        }


        public String validateParam() throws QCException {
            String[] cacheRoleValidValues = {
                "master", "slave"
            };

            boolean cacheRoleIsValid = false;
            for (String v : cacheRoleValidValues) {
                if (v.equals(this.getCacheRole())) {
                    cacheRoleIsValid = true;
                }
                Boolean cacheRoleIsRequired = Boolean.FALSE;
                if (cacheRoleIsRequired.equals(Boolean.FALSE) && this.getCacheRole() == null) {
                    cacheRoleIsValid = true;
                }
            }

            if (!cacheRoleIsValid) {
                throw new QCException("CacheRole value " + this.getCacheRole() + "is invalid");
            }
            return null;
        }
    }

    public static class ClusterModel implements ParamValidate {
        private Map advancedActions;

        @ParamAnnotation(paramType = "query", paramName = "advanced_actions")
        public void setAdvancedActions(Map advancedActions) {
            this.advancedActions = advancedActions;
        }

        @ParamAnnotation(paramType = "query", paramName = "advanced_actions")
        public Map getAdvancedActions() {
            return this.advancedActions;
        }

        private String appID;

        @ParamAnnotation(paramType = "query", paramName = "app_id")
        public void setAppID(String appID) {
            this.appID = appID;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_id")
        public String getAppID() {
            return this.appID;
        }

        private Model appInfo;

        @ParamAnnotation(paramType = "query", paramName = "app_info")
        public void setAppInfo(Model appInfo) {
            this.appInfo = appInfo;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_info")
        public Model getAppInfo() {
            return this.appInfo;
        }

        private String appVersion;

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public String getAppVersion() {
            return this.appVersion;
        }

        private Model appVersionInfo;

        @ParamAnnotation(paramType = "query", paramName = "app_version_info")
        public void setAppVersionInfo(Model appVersionInfo) {
            this.appVersionInfo = appVersionInfo;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_version_info")
        public Model getAppVersionInfo() {
            return this.appVersionInfo;
        }

        private Integer autoBackupTime;

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Map backup;

        @ParamAnnotation(paramType = "query", paramName = "backup")
        public void setBackup(Map backup) {
            this.backup = backup;
        }

        @ParamAnnotation(paramType = "query", paramName = "backup")
        public Map getBackup() {
            return this.backup;
        }

        private String backupPolicy;

        @ParamAnnotation(paramType = "query", paramName = "backup_policy")
        public void setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "backup_policy")
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        private Model backupService;

        @ParamAnnotation(paramType = "query", paramName = "backup_service")
        public void setBackupService(Model backupService) {
            this.backupService = backupService;
        }

        @ParamAnnotation(paramType = "query", paramName = "backup_service")
        public Model getBackupService() {
            return this.backupService;
        }

        private String cfgmgmtID;

        @ParamAnnotation(paramType = "query", paramName = "cfgmgmt_id")
        public void setCfgmgmtID(String cfgmgmtID) {
            this.cfgmgmtID = cfgmgmtID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cfgmgmt_id")
        public String getCfgmgmtID() {
            return this.cfgmgmtID;
        }

        private String clusterID;

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public void setClusterID(String clusterID) {
            this.clusterID = clusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public String getClusterID() {
            return this.clusterID;
        }

        private Integer clusterType;

        @ParamAnnotation(paramType = "query", paramName = "cluster_type")
        public void setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_type")
        public Integer getClusterType() {
            return this.clusterType;
        }

        private String consoleID;

        @ParamAnnotation(paramType = "query", paramName = "console_id")
        public void setConsoleID(String consoleID) {
            this.consoleID = consoleID;
        }

        @ParamAnnotation(paramType = "query", paramName = "console_id")
        public String getConsoleID() {
            return this.consoleID;
        }

        private String controller;

        @ParamAnnotation(paramType = "query", paramName = "controller")
        public void setController(String controller) {
            this.controller = controller;
        }

        @ParamAnnotation(paramType = "query", paramName = "controller")
        public String getController() {
            return this.controller;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Model customService;

        @ParamAnnotation(paramType = "query", paramName = "custom_service")
        public void setCustomService(Model customService) {
            this.customService = customService;
        }

        @ParamAnnotation(paramType = "query", paramName = "custom_service")
        public Model getCustomService() {
            return this.customService;
        }

        private Boolean debug;

        @ParamAnnotation(paramType = "query", paramName = "debug")
        public void setDebug(Boolean debug) {
            this.debug = debug;
        }

        @ParamAnnotation(paramType = "query", paramName = "debug")
        public Boolean getDebug() {
            return this.debug;
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

        private Model displayTabs;

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public void setDisplayTabs(Model displayTabs) {
            this.displayTabs = displayTabs;
        }

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public Model getDisplayTabs() {
            return this.displayTabs;
        }

        private Model endpoints;

        @ParamAnnotation(paramType = "query", paramName = "endpoints")
        public void setEndpoints(Model endpoints) {
            this.endpoints = endpoints;
        }

        @ParamAnnotation(paramType = "query", paramName = "endpoints")
        public Model getEndpoints() {
            return this.endpoints;
        }

        private String globalUuid;

        @ParamAnnotation(paramType = "query", paramName = "global_uuid")
        public void setGlobalUuid(String globalUuid) {
            this.globalUuid = globalUuid;
        }

        @ParamAnnotation(paramType = "query", paramName = "global_uuid")
        public String getGlobalUuid() {
            return this.globalUuid;
        }

        private Map healthCheckEnablement;

        @ParamAnnotation(paramType = "query", paramName = "health_check_enablement")
        public void setHealthCheckEnablement(Map healthCheckEnablement) {
            this.healthCheckEnablement = healthCheckEnablement;
        }

        @ParamAnnotation(paramType = "query", paramName = "health_check_enablement")
        public Map getHealthCheckEnablement() {
            return this.healthCheckEnablement;
        }

        private Boolean incrementalBackupSupported;

        @ParamAnnotation(paramType = "query", paramName = "incremental_backup_supported")
        public void setIncrementalBackupSupported(Boolean incrementalBackupSupported) {
            this.incrementalBackupSupported = incrementalBackupSupported;
        }

        @ParamAnnotation(paramType = "query", paramName = "incremental_backup_supported")
        public Boolean getIncrementalBackupSupported() {
            return this.incrementalBackupSupported;
        }

        private String latestSnapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private Map links;

        @ParamAnnotation(paramType = "query", paramName = "links")
        public void setLinks(Map links) {
            this.links = links;
        }

        @ParamAnnotation(paramType = "query", paramName = "links")
        public Map getLinks() {
            return this.links;
        }

        private Integer metadataRootAccess;

        @ParamAnnotation(paramType = "query", paramName = "metadata_root_access")
        public void setMetadataRootAccess(Integer metadataRootAccess) {
            this.metadataRootAccess = metadataRootAccess;
        }

        @ParamAnnotation(paramType = "query", paramName = "metadata_root_access")
        public Integer getMetadataRootAccess() {
            return this.metadataRootAccess;
        }

        private String name;

        @ParamAnnotation(paramType = "query", paramName = "name")
        public void setName(String name) {
            this.name = name;
        }

        @ParamAnnotation(paramType = "query", paramName = "name")
        public String getName() {
            return this.name;
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

        private List<ClusterNodeModel> nodes;

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public void setNodes(List<ClusterNodeModel> nodes) {
            this.nodes = nodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public List<ClusterNodeModel> getNodes() {
            return this.nodes;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private Boolean partnerAccess;

        @ParamAnnotation(paramType = "query", paramName = "partner_access")
        public void setPartnerAccess(Boolean partnerAccess) {
            this.partnerAccess = partnerAccess;
        }

        @ParamAnnotation(paramType = "query", paramName = "partner_access")
        public Boolean getPartnerAccess() {
            return this.partnerAccess;
        }

        private Model restoreService;

        @ParamAnnotation(paramType = "query", paramName = "restore_service")
        public void setRestoreService(Model restoreService) {
            this.restoreService = restoreService;
        }

        @ParamAnnotation(paramType = "query", paramName = "restore_service")
        public Model getRestoreService() {
            return this.restoreService;
        }

        private Integer reuseHyper;

        @ParamAnnotation(paramType = "query", paramName = "reuse_hyper")
        public void setReuseHyper(Integer reuseHyper) {
            this.reuseHyper = reuseHyper;
        }

        @ParamAnnotation(paramType = "query", paramName = "reuse_hyper")
        public Integer getReuseHyper() {
            return this.reuseHyper;
        }

        private Map roleCount;

        @ParamAnnotation(paramType = "query", paramName = "role_count")
        public void setRoleCount(Map roleCount) {
            this.roleCount = roleCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "role_count")
        public Map getRoleCount() {
            return this.roleCount;
        }

        private List<String> roles;

        @ParamAnnotation(paramType = "query", paramName = "roles")
        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @ParamAnnotation(paramType = "query", paramName = "roles")
        public List<String> getRoles() {
            return this.roles;
        }

        private String rootUserID;

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private List<String> upgradePolicy;

        @ParamAnnotation(paramType = "query", paramName = "upgrade_policy")
        public void setUpgradePolicy(List<String> upgradePolicy) {
            this.upgradePolicy = upgradePolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "upgrade_policy")
        public List<String> getUpgradePolicy() {
            return this.upgradePolicy;
        }

        private String upgradeStatus;

        @ParamAnnotation(paramType = "query", paramName = "upgrade_status")
        public void setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "upgrade_status")
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        private String upgradeTime;

        @ParamAnnotation(paramType = "query", paramName = "upgrade_time")
        public void setUpgradeTime(String upgradeTime) {
            this.upgradeTime = upgradeTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "upgrade_time")
        public String getUpgradeTime() {
            return this.upgradeTime;
        }

        private VxNetModel vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public VxNetModel getVxNet() {
            return this.vxNet;
        }


        public String validateParam() throws QCException {
            if (this.getNodes() != null && this.getNodes().size() > 0 ) {
                for (int i = 0 ; i < this.getNodes().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class ClusterNodeModel implements ParamValidate {
        private String advancedActions;

        @ParamAnnotation(paramType = "query", paramName = "advanced_actions")
        public void setAdvancedActions(String advancedActions) {
            this.advancedActions = advancedActions;
        }

        @ParamAnnotation(paramType = "query", paramName = "advanced_actions")
        public String getAdvancedActions() {
            return this.advancedActions;
        }

        private Boolean agentInstalled;

        @ParamAnnotation(paramType = "query", paramName = "agent_installed")
        public void setAgentInstalled(Boolean agentInstalled) {
            this.agentInstalled = agentInstalled;
        }

        @ParamAnnotation(paramType = "query", paramName = "agent_installed")
        public Boolean getAgentInstalled() {
            return this.agentInstalled;
        }

        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private String appID;

        @ParamAnnotation(paramType = "query", paramName = "app_id")
        public void setAppID(String appID) {
            this.appID = appID;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_id")
        public String getAppID() {
            return this.appID;
        }

        private String appVersion;

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public String getAppVersion() {
            return this.appVersion;
        }

        private Integer autoBackup;

        @ParamAnnotation(paramType = "query", paramName = "auto_backup")
        public void setAutoBackup(Integer autoBackup) {
            this.autoBackup = autoBackup;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup")
        public Integer getAutoBackup() {
            return this.autoBackup;
        }

        private String backupPolicy;

        @ParamAnnotation(paramType = "query", paramName = "backup_policy")
        public void setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "backup_policy")
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        private Model backupService;

        @ParamAnnotation(paramType = "query", paramName = "backup_service")
        public void setBackupService(Model backupService) {
            this.backupService = backupService;
        }

        @ParamAnnotation(paramType = "query", paramName = "backup_service")
        public Model getBackupService() {
            return this.backupService;
        }

        private String clusterID;

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public void setClusterID(String clusterID) {
            this.clusterID = clusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public String getClusterID() {
            return this.clusterID;
        }

        private String consoleID;

        @ParamAnnotation(paramType = "query", paramName = "console_id")
        public void setConsoleID(String consoleID) {
            this.consoleID = consoleID;
        }

        @ParamAnnotation(paramType = "query", paramName = "console_id")
        public String getConsoleID() {
            return this.consoleID;
        }

        private String controller;

        @ParamAnnotation(paramType = "query", paramName = "controller")
        public void setController(String controller) {
            this.controller = controller;
        }

        @ParamAnnotation(paramType = "query", paramName = "controller")
        public String getController() {
            return this.controller;
        }

        private Integer cPU;

        @ParamAnnotation(paramType = "query", paramName = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @ParamAnnotation(paramType = "query", paramName = "cpu")
        public Integer getCPU() {
            return this.cPU;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Model customMetadataScript;

        @ParamAnnotation(paramType = "query", paramName = "custom_metadata_script")
        public void setCustomMetadataScript(Model customMetadataScript) {
            this.customMetadataScript = customMetadataScript;
        }

        @ParamAnnotation(paramType = "query", paramName = "custom_metadata_script")
        public Model getCustomMetadataScript() {
            return this.customMetadataScript;
        }

        private Model customService;

        @ParamAnnotation(paramType = "query", paramName = "custom_service")
        public void setCustomService(Model customService) {
            this.customService = customService;
        }

        @ParamAnnotation(paramType = "query", paramName = "custom_service")
        public Model getCustomService() {
            return this.customService;
        }

        private Boolean debug;

        @ParamAnnotation(paramType = "query", paramName = "debug")
        public void setDebug(Boolean debug) {
            this.debug = debug;
        }

        @ParamAnnotation(paramType = "query", paramName = "debug")
        public Boolean getDebug() {
            return this.debug;
        }

        private Model destroyService;

        @ParamAnnotation(paramType = "query", paramName = "destroy_service")
        public void setDestroyService(Model destroyService) {
            this.destroyService = destroyService;
        }

        @ParamAnnotation(paramType = "query", paramName = "destroy_service")
        public Model getDestroyService() {
            return this.destroyService;
        }

        private Model displayTabs;

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public void setDisplayTabs(Model displayTabs) {
            this.displayTabs = displayTabs;
        }

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public Model getDisplayTabs() {
            return this.displayTabs;
        }

        private String eIP;

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public String getEIP() {
            return this.eIP;
        }

        private String env;

        @ParamAnnotation(paramType = "query", paramName = "env")
        public void setEnv(String env) {
            this.env = env;
        }

        @ParamAnnotation(paramType = "query", paramName = "env")
        public String getEnv() {
            return this.env;
        }

        private Integer globalServerID;

        @ParamAnnotation(paramType = "query", paramName = "global_server_id")
        public void setGlobalServerID(Integer globalServerID) {
            this.globalServerID = globalServerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "global_server_id")
        public Integer getGlobalServerID() {
            return this.globalServerID;
        }

        private Integer gpu;

        @ParamAnnotation(paramType = "query", paramName = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @ParamAnnotation(paramType = "query", paramName = "gpu")
        public Integer getGpu() {
            return this.gpu;
        }

        private Integer gpuClass;

        @ParamAnnotation(paramType = "query", paramName = "gpu_class")
        public void setGpuClass(Integer gpuClass) {
            this.gpuClass = gpuClass;
        }

        @ParamAnnotation(paramType = "query", paramName = "gpu_class")
        public Integer getGpuClass() {
            return this.gpuClass;
        }

        private Integer groupID;

        @ParamAnnotation(paramType = "query", paramName = "group_id")
        public void setGroupID(Integer groupID) {
            this.groupID = groupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "group_id")
        public Integer getGroupID() {
            return this.groupID;
        }

        private Model healthCheck;

        @ParamAnnotation(paramType = "query", paramName = "health_check")
        public void setHealthCheck(Model healthCheck) {
            this.healthCheck = healthCheck;
        }

        @ParamAnnotation(paramType = "query", paramName = "health_check")
        public Model getHealthCheck() {
            return this.healthCheck;
        }

        private String healthStatus;

        @ParamAnnotation(paramType = "query", paramName = "health_status")
        public void setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "health_status")
        public String getHealthStatus() {
            return this.healthStatus;
        }

        private String hypervisor;

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
        }

        private String imageID;

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public String getImageID() {
            return this.imageID;
        }

        private Boolean incrementalBackupSupported;

        @ParamAnnotation(paramType = "query", paramName = "incremental_backup_supported")
        public void setIncrementalBackupSupported(Boolean incrementalBackupSupported) {
            this.incrementalBackupSupported = incrementalBackupSupported;
        }

        @ParamAnnotation(paramType = "query", paramName = "incremental_backup_supported")
        public Boolean getIncrementalBackupSupported() {
            return this.incrementalBackupSupported;
        }

        private Model initService;

        @ParamAnnotation(paramType = "query", paramName = "init_service")
        public void setInitService(Model initService) {
            this.initService = initService;
        }

        @ParamAnnotation(paramType = "query", paramName = "init_service")
        public Model getInitService() {
            return this.initService;
        }

        private String instanceID;

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private Integer isBackup;

        @ParamAnnotation(paramType = "query", paramName = "is_backup")
        public void setIsBackup(Integer isBackup) {
            this.isBackup = isBackup;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_backup")
        public Integer getIsBackup() {
            return this.isBackup;
        }

        private Integer memory;

        @ParamAnnotation(paramType = "query", paramName = "memory")
        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        @ParamAnnotation(paramType = "query", paramName = "memory")
        public Integer getMemory() {
            return this.memory;
        }

        private Model monitor;

        @ParamAnnotation(paramType = "query", paramName = "monitor")
        public void setMonitor(Model monitor) {
            this.monitor = monitor;
        }

        @ParamAnnotation(paramType = "query", paramName = "monitor")
        public Model getMonitor() {
            return this.monitor;
        }

        private String name;

        @ParamAnnotation(paramType = "query", paramName = "name")
        public void setName(String name) {
            this.name = name;
        }

        @ParamAnnotation(paramType = "query", paramName = "name")
        public String getName() {
            return this.name;
        }

        private String nodeID;

        @ParamAnnotation(paramType = "query", paramName = "node_id")
        public void setNodeID(String nodeID) {
            this.nodeID = nodeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_id")
        public String getNodeID() {
            return this.nodeID;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String passphraseless;

        @ParamAnnotation(paramType = "query", paramName = "passphraseless")
        public void setPassphraseless(String passphraseless) {
            this.passphraseless = passphraseless;
        }

        @ParamAnnotation(paramType = "query", paramName = "passphraseless")
        public String getPassphraseless() {
            return this.passphraseless;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String repl;

        @ParamAnnotation(paramType = "query", paramName = "repl")
        public void setRepl(String repl) {
            this.repl = repl;
        }

        @ParamAnnotation(paramType = "query", paramName = "repl")
        public String getRepl() {
            return this.repl;
        }

        private Integer resourceClass;

        @ParamAnnotation(paramType = "query", paramName = "resource_class")
        public void setResourceClass(Integer resourceClass) {
            this.resourceClass = resourceClass;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_class")
        public Integer getResourceClass() {
            return this.resourceClass;
        }

        private Model restartService;

        @ParamAnnotation(paramType = "query", paramName = "restart_service")
        public void setRestartService(Model restartService) {
            this.restartService = restartService;
        }

        @ParamAnnotation(paramType = "query", paramName = "restart_service")
        public Model getRestartService() {
            return this.restartService;
        }

        private Model restoreService;

        @ParamAnnotation(paramType = "query", paramName = "restore_service")
        public void setRestoreService(Model restoreService) {
            this.restoreService = restoreService;
        }

        @ParamAnnotation(paramType = "query", paramName = "restore_service")
        public Model getRestoreService() {
            return this.restoreService;
        }

        private String role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public String getRole() {
            return this.role;
        }

        private String rootUserID;

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private Model scaleInService;

        @ParamAnnotation(paramType = "query", paramName = "scale_in_service")
        public void setScaleInService(Model scaleInService) {
            this.scaleInService = scaleInService;
        }

        @ParamAnnotation(paramType = "query", paramName = "scale_in_service")
        public Model getScaleInService() {
            return this.scaleInService;
        }

        private Model scaleOutService;

        @ParamAnnotation(paramType = "query", paramName = "scale_out_service")
        public void setScaleOutService(Model scaleOutService) {
            this.scaleOutService = scaleOutService;
        }

        @ParamAnnotation(paramType = "query", paramName = "scale_out_service")
        public Model getScaleOutService() {
            return this.scaleOutService;
        }

        private String securityGroup;

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private Integer serverID;

        @ParamAnnotation(paramType = "query", paramName = "server_id")
        public void setServerID(Integer serverID) {
            this.serverID = serverID;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_id")
        public Integer getServerID() {
            return this.serverID;
        }

        private Integer serverIDUpperBound;

        @ParamAnnotation(paramType = "query", paramName = "server_id_upper_bound")
        public void setServerIDUpperBound(Integer serverIDUpperBound) {
            this.serverIDUpperBound = serverIDUpperBound;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_id_upper_bound")
        public Integer getServerIDUpperBound() {
            return this.serverIDUpperBound;
        }

        private String singleNodeRepl;

        @ParamAnnotation(paramType = "query", paramName = "single_node_repl")
        public void setSingleNodeRepl(String singleNodeRepl) {
            this.singleNodeRepl = singleNodeRepl;
        }

        @ParamAnnotation(paramType = "query", paramName = "single_node_repl")
        public String getSingleNodeRepl() {
            return this.singleNodeRepl;
        }

        private Model startService;

        @ParamAnnotation(paramType = "query", paramName = "start_service")
        public void setStartService(Model startService) {
            this.startService = startService;
        }

        @ParamAnnotation(paramType = "query", paramName = "start_service")
        public Model getStartService() {
            return this.startService;
        }

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Model stopService;

        @ParamAnnotation(paramType = "query", paramName = "stop_service")
        public void setStopService(Model stopService) {
            this.stopService = stopService;
        }

        @ParamAnnotation(paramType = "query", paramName = "stop_service")
        public Model getStopService() {
            return this.stopService;
        }

        private Integer storageSize;

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer userAccess;

        @ParamAnnotation(paramType = "query", paramName = "user_access")
        public void setUserAccess(Integer userAccess) {
            this.userAccess = userAccess;
        }

        @ParamAnnotation(paramType = "query", paramName = "user_access")
        public Integer getUserAccess() {
            return this.userAccess;
        }

        private String verticalScalingPolicy;

        @ParamAnnotation(paramType = "query", paramName = "vertical_scaling_policy")
        public void setVerticalScalingPolicy(String verticalScalingPolicy) {
            this.verticalScalingPolicy = verticalScalingPolicy;
        }

        @ParamAnnotation(paramType = "query", paramName = "vertical_scaling_policy")
        public String getVerticalScalingPolicy() {
            return this.verticalScalingPolicy;
        }

        private String volumeIDs;

        @ParamAnnotation(paramType = "query", paramName = "volume_ids")
        public void setVolumeIDs(String volumeIDs) {
            this.volumeIDs = volumeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_ids")
        public String getVolumeIDs() {
            return this.volumeIDs;
        }

        private Integer volumeType;

        @ParamAnnotation(paramType = "query", paramName = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DataModel implements ParamValidate {
        private String data;

        @ParamAnnotation(paramType = "query", paramName = "data")
        public void setData(String data) {
            this.data = data;
        }

        @ParamAnnotation(paramType = "query", paramName = "data")
        public String getData() {
            return this.data;
        }

        private String eIPID;

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DHCPOptionModel implements ParamValidate {
        private String routerStaticID;

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String val2;

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DNSAliasModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String dNSAliasID;

        @ParamAnnotation(paramType = "query", paramName = "dns_alias_id")
        public void setDNSAliasID(String dNSAliasID) {
            this.dNSAliasID = dNSAliasID;
        }

        @ParamAnnotation(paramType = "query", paramName = "dns_alias_id")
        public String getDNSAliasID() {
            return this.dNSAliasID;
        }

        private String dNSAliasName;

        @ParamAnnotation(paramType = "query", paramName = "dns_alias_name")
        public void setDNSAliasName(String dNSAliasName) {
            this.dNSAliasName = dNSAliasName;
        }

        @ParamAnnotation(paramType = "query", paramName = "dns_alias_name")
        public String getDNSAliasName() {
            return this.dNSAliasName;
        }

        private String domainName;

        @ParamAnnotation(paramType = "query", paramName = "domain_name")
        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        @ParamAnnotation(paramType = "query", paramName = "domain_name")
        public String getDomainName() {
            return this.domainName;
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

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class EIPModel implements ParamValidate {
        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer associateMode;

        @ParamAnnotation(paramType = "query", paramName = "associate_mode")
        public void setAssociateMode(Integer associateMode) {
            this.associateMode = associateMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "associate_mode")
        public Integer getAssociateMode() {
            return this.associateMode;
        }

        private Integer bandwidth;

        @ParamAnnotation(paramType = "query", paramName = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @ParamAnnotation(paramType = "query", paramName = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

    	// BillingMode's available values: bandwidth, traffic
        private String billingMode;

        @ParamAnnotation(paramType = "query", paramName = "billing_mode")
        public void setBillingMode(String billingMode) {
            this.billingMode = billingMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "billing_mode")
        public String getBillingMode() {
            return this.billingMode;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String eIPAddr;

        @ParamAnnotation(paramType = "query", paramName = "eip_addr")
        public void setEIPAddr(String eIPAddr) {
            this.eIPAddr = eIPAddr;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_addr")
        public String getEIPAddr() {
            return this.eIPAddr;
        }

        private EIPGroupModel eIPGroup;

        @ParamAnnotation(paramType = "query", paramName = "eip_group")
        public void setEIPGroup(EIPGroupModel eIPGroup) {
            this.eIPGroup = eIPGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_group")
        public EIPGroupModel getEIPGroup() {
            return this.eIPGroup;
        }

        private String eIPID;

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }

        private String eIPName;

        @ParamAnnotation(paramType = "query", paramName = "eip_name")
        public void setEIPName(String eIPName) {
            this.eIPName = eIPName;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_name")
        public String getEIPName() {
            return this.eIPName;
        }

        private String iCPCodes;

        @ParamAnnotation(paramType = "query", paramName = "icp_codes")
        public void setICPCodes(String iCPCodes) {
            this.iCPCodes = iCPCodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "icp_codes")
        public String getICPCodes() {
            return this.iCPCodes;
        }

        private Integer needICP;

        @ParamAnnotation(paramType = "query", paramName = "need_icp")
        public void setNeedICP(Integer needICP) {
            this.needICP = needICP;
        }

        @ParamAnnotation(paramType = "query", paramName = "need_icp")
        public Integer getNeedICP() {
            return this.needICP;
        }

        private EIPResourceModel resource;

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public void setResource(EIPResourceModel resource) {
            this.resource = resource;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public EIPResourceModel getResource() {
            return this.resource;
        }

    	// Status's available values: pending, available, associated, suspended, released, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: associating, dissociating, suspending, resuming, releasing
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }


        public String validateParam() throws QCException {
            String[] billingModeValidValues = {
                "bandwidth", "traffic"
            };

            boolean billingModeIsValid = false;
            for (String v : billingModeValidValues) {
                if (v.equals(this.getBillingMode())) {
                    billingModeIsValid = true;
                }
                Boolean billingModeIsRequired = Boolean.FALSE;
                if (billingModeIsRequired.equals(Boolean.FALSE) && this.getBillingMode() == null) {
                    billingModeIsValid = true;
                }
            }

            if (!billingModeIsValid) {
                throw new QCException("BillingMode value " + this.getBillingMode() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "available", "associated", "suspended", "released", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "associating", "dissociating", "suspending", "resuming", "releasing"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class EIPGroupModel implements ParamValidate {
        private String eIPGroupID;

        @ParamAnnotation(paramType = "query", paramName = "eip_group_id")
        public void setEIPGroupID(String eIPGroupID) {
            this.eIPGroupID = eIPGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_group_id")
        public String getEIPGroupID() {
            return this.eIPGroupID;
        }

        private String eIPGroupName;

        @ParamAnnotation(paramType = "query", paramName = "eip_group_name")
        public void setEIPGroupName(String eIPGroupName) {
            this.eIPGroupName = eIPGroupName;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_group_name")
        public String getEIPGroupName() {
            return this.eIPGroupName;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class EIPResourceModel implements ParamValidate {
        private String resourceID;

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceName;

        @ParamAnnotation(paramType = "query", paramName = "resource_name")
        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_name")
        public String getResourceName() {
            return this.resourceName;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class ExtraModel implements ParamValidate {
        private String blockBus;

        @ParamAnnotation(paramType = "query", paramName = "block_bus")
        public void setBlockBus(String blockBus) {
            this.blockBus = blockBus;
        }

        @ParamAnnotation(paramType = "query", paramName = "block_bus")
        public String getBlockBus() {
            return this.blockBus;
        }

        private String bootDev;

        @ParamAnnotation(paramType = "query", paramName = "boot_dev")
        public void setBootDev(String bootDev) {
            this.bootDev = bootDev;
        }

        @ParamAnnotation(paramType = "query", paramName = "boot_dev")
        public String getBootDev() {
            return this.bootDev;
        }

        private Integer cPUMax;

        @ParamAnnotation(paramType = "query", paramName = "cpu_max")
        public void setCPUMax(Integer cPUMax) {
            this.cPUMax = cPUMax;
        }

        @ParamAnnotation(paramType = "query", paramName = "cpu_max")
        public Integer getCPUMax() {
            return this.cPUMax;
        }

        private String cPUModel;

        @ParamAnnotation(paramType = "query", paramName = "cpu_model")
        public void setCPUModel(String cPUModel) {
            this.cPUModel = cPUModel;
        }

        @ParamAnnotation(paramType = "query", paramName = "cpu_model")
        public String getCPUModel() {
            return this.cPUModel;
        }

        private Integer features;

        @ParamAnnotation(paramType = "query", paramName = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @ParamAnnotation(paramType = "query", paramName = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String hypervisor;

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
        }

        private Integer memMax;

        @ParamAnnotation(paramType = "query", paramName = "mem_max")
        public void setMemMax(Integer memMax) {
            this.memMax = memMax;
        }

        @ParamAnnotation(paramType = "query", paramName = "mem_max")
        public Integer getMemMax() {
            return this.memMax;
        }

        private Integer nICMqueue;

        @ParamAnnotation(paramType = "query", paramName = "nic_mqueue")
        public void setNICMqueue(Integer nICMqueue) {
            this.nICMqueue = nICMqueue;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_mqueue")
        public Integer getNICMqueue() {
            return this.nICMqueue;
        }

        private Integer noLimit;

        @ParamAnnotation(paramType = "query", paramName = "no_limit")
        public void setNoLimit(Integer noLimit) {
            this.noLimit = noLimit;
        }

        @ParamAnnotation(paramType = "query", paramName = "no_limit")
        public Integer getNoLimit() {
            return this.noLimit;
        }

        private Integer noRestrict;

        @ParamAnnotation(paramType = "query", paramName = "no_restrict")
        public void setNoRestrict(Integer noRestrict) {
            this.noRestrict = noRestrict;
        }

        @ParamAnnotation(paramType = "query", paramName = "no_restrict")
        public Integer getNoRestrict() {
            return this.noRestrict;
        }

        private Integer oSDiskSize;

        @ParamAnnotation(paramType = "query", paramName = "os_disk_size")
        public void setOSDiskSize(Integer oSDiskSize) {
            this.oSDiskSize = oSDiskSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "os_disk_size")
        public Integer getOSDiskSize() {
            return this.oSDiskSize;
        }

        private Integer uSB;

        @ParamAnnotation(paramType = "query", paramName = "usb")
        public void setUSB(Integer uSB) {
            this.uSB = uSB;
        }

        @ParamAnnotation(paramType = "query", paramName = "usb")
        public Integer getUSB() {
            return this.uSB;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class FileModel implements ParamValidate {
        private String file;

        @ParamAnnotation(paramType = "query", paramName = "file")
        public void setFile(String file) {
            this.file = file;
        }

        @ParamAnnotation(paramType = "query", paramName = "file")
        public String getFile() {
            return this.file;
        }

        private String lastModify;

        @ParamAnnotation(paramType = "query", paramName = "last_modify")
        public void setLastModify(String lastModify) {
            this.lastModify = lastModify;
        }

        @ParamAnnotation(paramType = "query", paramName = "last_modify")
        public String getLastModify() {
            return this.lastModify;
        }

        private Integer size;

        @ParamAnnotation(paramType = "query", paramName = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @ParamAnnotation(paramType = "query", paramName = "size")
        public Integer getSize() {
            return this.size;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class ImageModel implements ParamValidate {
        private String appBillingID;

        @ParamAnnotation(paramType = "query", paramName = "app_billing_id")
        public void setAppBillingID(String appBillingID) {
            this.appBillingID = appBillingID;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_billing_id")
        public String getAppBillingID() {
            return this.appBillingID;
        }

        private String architecture;

        @ParamAnnotation(paramType = "query", paramName = "architecture")
        public void setArchitecture(String architecture) {
            this.architecture = architecture;
        }

        @ParamAnnotation(paramType = "query", paramName = "architecture")
        public String getArchitecture() {
            return this.architecture;
        }

        private String billingID;

        @ParamAnnotation(paramType = "query", paramName = "billing_id")
        public void setBillingID(String billingID) {
            this.billingID = billingID;
        }

        @ParamAnnotation(paramType = "query", paramName = "billing_id")
        public String getBillingID() {
            return this.billingID;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String defaultPasswd;

        @ParamAnnotation(paramType = "query", paramName = "default_passwd")
        public void setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
        }

        @ParamAnnotation(paramType = "query", paramName = "default_passwd")
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        private String defaultUser;

        @ParamAnnotation(paramType = "query", paramName = "default_user")
        public void setDefaultUser(String defaultUser) {
            this.defaultUser = defaultUser;
        }

        @ParamAnnotation(paramType = "query", paramName = "default_user")
        public String getDefaultUser() {
            return this.defaultUser;
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

        private Integer fResetpwd;

        @ParamAnnotation(paramType = "query", paramName = "f_resetpwd")
        public void setFResetpwd(Integer fResetpwd) {
            this.fResetpwd = fResetpwd;
        }

        @ParamAnnotation(paramType = "query", paramName = "f_resetpwd")
        public Integer getFResetpwd() {
            return this.fResetpwd;
        }

        private Integer feature;

        @ParamAnnotation(paramType = "query", paramName = "feature")
        public void setFeature(Integer feature) {
            this.feature = feature;
        }

        @ParamAnnotation(paramType = "query", paramName = "feature")
        public Integer getFeature() {
            return this.feature;
        }

        private Integer features;

        @ParamAnnotation(paramType = "query", paramName = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @ParamAnnotation(paramType = "query", paramName = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String hypervisor;

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @ParamAnnotation(paramType = "query", paramName = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
        }

        private String imageID;

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public String getImageID() {
            return this.imageID;
        }

        private String imageName;

        @ParamAnnotation(paramType = "query", paramName = "image_name")
        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        @ParamAnnotation(paramType = "query", paramName = "image_name")
        public String getImageName() {
            return this.imageName;
        }

        private List<String> instanceIDs;

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
        }

        private String oSFamily;

        @ParamAnnotation(paramType = "query", paramName = "os_family")
        public void setOSFamily(String oSFamily) {
            this.oSFamily = oSFamily;
        }

        @ParamAnnotation(paramType = "query", paramName = "os_family")
        public String getOSFamily() {
            return this.oSFamily;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

    	// Platform's available values: linux, windows
        private String platform;

        @ParamAnnotation(paramType = "query", paramName = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @ParamAnnotation(paramType = "query", paramName = "platform")
        public String getPlatform() {
            return this.platform;
        }

    	// ProcessorType's available values: 64bit, 32bit
        private String processorType;

        @ParamAnnotation(paramType = "query", paramName = "processor_type")
        public void setProcessorType(String processorType) {
            this.processorType = processorType;
        }

        @ParamAnnotation(paramType = "query", paramName = "processor_type")
        public String getProcessorType() {
            return this.processorType;
        }

    	// Provider's available values: system, self
        private String provider;

        @ParamAnnotation(paramType = "query", paramName = "provider")
        public void setProvider(String provider) {
            this.provider = provider;
        }

        @ParamAnnotation(paramType = "query", paramName = "provider")
        public String getProvider() {
            return this.provider;
        }

        private String recommendedType;

        @ParamAnnotation(paramType = "query", paramName = "recommended_type")
        public void setRecommendedType(String recommendedType) {
            this.recommendedType = recommendedType;
        }

        @ParamAnnotation(paramType = "query", paramName = "recommended_type")
        public String getRecommendedType() {
            return this.recommendedType;
        }

        private String rootID;

        @ParamAnnotation(paramType = "query", paramName = "root_id")
        public void setRootID(String rootID) {
            this.rootID = rootID;
        }

        @ParamAnnotation(paramType = "query", paramName = "root_id")
        public String getRootID() {
            return this.rootID;
        }

        private Integer size;

        @ParamAnnotation(paramType = "query", paramName = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @ParamAnnotation(paramType = "query", paramName = "size")
        public Integer getSize() {
            return this.size;
        }

    	// Status's available values: pending, available, deprecated, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

    	// TransitionStatus's available values: creating, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private String uIType;

        @ParamAnnotation(paramType = "query", paramName = "ui_type")
        public void setUIType(String uIType) {
            this.uIType = uIType;
        }

        @ParamAnnotation(paramType = "query", paramName = "ui_type")
        public String getUIType() {
            return this.uIType;
        }

    	// Visibility's available values: public, private
        private String visibility;

        @ParamAnnotation(paramType = "query", paramName = "visibility")
        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        @ParamAnnotation(paramType = "query", paramName = "visibility")
        public String getVisibility() {
            return this.visibility;
        }


        public String validateParam() throws QCException {
            String[] platformValidValues = {
                "linux", "windows"
            };

            boolean platformIsValid = false;
            for (String v : platformValidValues) {
                if (v.equals(this.getPlatform())) {
                    platformIsValid = true;
                }
                Boolean platformIsRequired = Boolean.FALSE;
                if (platformIsRequired.equals(Boolean.FALSE) && this.getPlatform() == null) {
                    platformIsValid = true;
                }
            }

            if (!platformIsValid) {
                throw new QCException("Platform value " + this.getPlatform() + "is invalid");
            }
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
            String[] statusValidValues = {
                "pending", "available", "deprecated", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            String[] transitionStatusValidValues = {
                "creating", "suspending", "resuming", "deleting", "recovering"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
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

    public static class ImageUserModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String imageID;

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public void setImageID(String imageID) {
            this.imageID = imageID;
        }

        @ParamAnnotation(paramType = "query", paramName = "image_id")
        public String getImageID() {
            return this.imageID;
        }

        private UserModel user;

        @ParamAnnotation(paramType = "query", paramName = "user")
        public void setUser(UserModel user) {
            this.user = user;
        }

        @ParamAnnotation(paramType = "query", paramName = "user")
        public UserModel getUser() {
            return this.user;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class InstanceModel implements ParamValidate {
        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private String cPUTopology;

        @ParamAnnotation(paramType = "query", paramName = "cpu_topology")
        public void setCPUTopology(String cPUTopology) {
            this.cPUTopology = cPUTopology;
        }

        @ParamAnnotation(paramType = "query", paramName = "cpu_topology")
        public String getCPUTopology() {
            return this.cPUTopology;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String device;

        @ParamAnnotation(paramType = "query", paramName = "device")
        public void setDevice(String device) {
            this.device = device;
        }

        @ParamAnnotation(paramType = "query", paramName = "device")
        public String getDevice() {
            return this.device;
        }

        private List<DNSAliasModel> dNSAliases;

        @ParamAnnotation(paramType = "query", paramName = "dns_aliases")
        public void setDNSAliases(List<DNSAliasModel> dNSAliases) {
            this.dNSAliases = dNSAliases;
        }

        @ParamAnnotation(paramType = "query", paramName = "dns_aliases")
        public List<DNSAliasModel> getDNSAliases() {
            return this.dNSAliases;
        }

        private EIPModel eIP;

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public void setEIP(EIPModel eIP) {
            this.eIP = eIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public EIPModel getEIP() {
            return this.eIP;
        }

        private ExtraModel extra;

        @ParamAnnotation(paramType = "query", paramName = "extra")
        public void setExtra(ExtraModel extra) {
            this.extra = extra;
        }

        @ParamAnnotation(paramType = "query", paramName = "extra")
        public ExtraModel getExtra() {
            return this.extra;
        }

        private String graphicsPasswd;

        @ParamAnnotation(paramType = "query", paramName = "graphics_passwd")
        public void setGraphicsPasswd(String graphicsPasswd) {
            this.graphicsPasswd = graphicsPasswd;
        }

        @ParamAnnotation(paramType = "query", paramName = "graphics_passwd")
        public String getGraphicsPasswd() {
            return this.graphicsPasswd;
        }

        private String graphicsProtocol;

        @ParamAnnotation(paramType = "query", paramName = "graphics_protocol")
        public void setGraphicsProtocol(String graphicsProtocol) {
            this.graphicsProtocol = graphicsProtocol;
        }

        @ParamAnnotation(paramType = "query", paramName = "graphics_protocol")
        public String getGraphicsProtocol() {
            return this.graphicsProtocol;
        }

        private ImageModel image;

        @ParamAnnotation(paramType = "query", paramName = "image")
        public void setImage(ImageModel image) {
            this.image = image;
        }

        @ParamAnnotation(paramType = "query", paramName = "image")
        public ImageModel getImage() {
            return this.image;
        }

        private Integer instanceClass;

        @ParamAnnotation(paramType = "query", paramName = "instance_class")
        public void setInstanceClass(Integer instanceClass) {
            this.instanceClass = instanceClass;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_class")
        public Integer getInstanceClass() {
            return this.instanceClass;
        }

        private String instanceID;

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private String instanceName;

        @ParamAnnotation(paramType = "query", paramName = "instance_name")
        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_name")
        public String getInstanceName() {
            return this.instanceName;
        }

        private String instanceType;

        @ParamAnnotation(paramType = "query", paramName = "instance_type")
        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_type")
        public String getInstanceType() {
            return this.instanceType;
        }

        private List<String> keyPairIDs;

        @ParamAnnotation(paramType = "query", paramName = "keypair_ids")
        public void setKeyPairIDs(List<String> keyPairIDs) {
            this.keyPairIDs = keyPairIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypair_ids")
        public List<String> getKeyPairIDs() {
            return this.keyPairIDs;
        }

        private Integer memoryCurrent;

        @ParamAnnotation(paramType = "query", paramName = "memory_current")
        public void setMemoryCurrent(Integer memoryCurrent) {
            this.memoryCurrent = memoryCurrent;
        }

        @ParamAnnotation(paramType = "query", paramName = "memory_current")
        public Integer getMemoryCurrent() {
            return this.memoryCurrent;
        }

        private SecurityGroupModel securityGroup;

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public void setSecurityGroup(SecurityGroupModel securityGroup) {
            this.securityGroup = securityGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public SecurityGroupModel getSecurityGroup() {
            return this.securityGroup;
        }

    	// Status's available values: pending, running, stopped, suspended, terminated, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, restarting, suspending, resuming, terminating, recovering, resetting
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer vCPUsCurrent;

        @ParamAnnotation(paramType = "query", paramName = "vcpus_current")
        public void setVCPUsCurrent(Integer vCPUsCurrent) {
            this.vCPUsCurrent = vCPUsCurrent;
        }

        @ParamAnnotation(paramType = "query", paramName = "vcpus_current")
        public Integer getVCPUsCurrent() {
            return this.vCPUsCurrent;
        }

        private List<String> volumeIDs;

        @ParamAnnotation(paramType = "query", paramName = "volume_ids")
        public void setVolumeIDs(List<String> volumeIDs) {
            this.volumeIDs = volumeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_ids")
        public List<String> getVolumeIDs() {
            return this.volumeIDs;
        }

        private List<VolumeModel> volumes;

        @ParamAnnotation(paramType = "query", paramName = "volumes")
        public void setVolumes(List<VolumeModel> volumes) {
            this.volumes = volumes;
        }

        @ParamAnnotation(paramType = "query", paramName = "volumes")
        public List<VolumeModel> getVolumes() {
            return this.volumes;
        }

        private List<NICVxNetModel> vxNets;

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public void setVxNets(List<NICVxNetModel> vxNets) {
            this.vxNets = vxNets;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public List<NICVxNetModel> getVxNets() {
            return this.vxNets;
        }


        public String validateParam() throws QCException {
            if (this.getDNSAliases() != null && this.getDNSAliases().size() > 0 ) {
                for (int i = 0 ; i < this.getDNSAliases().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] statusValidValues = {
                "pending", "running", "stopped", "suspended", "terminated", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "starting", "stopping", "restarting", "suspending", "resuming", "terminating", "recovering", "resetting"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            if (this.getVolumes() != null && this.getVolumes().size() > 0 ) {
                for (int i = 0 ; i < this.getVolumes().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getVxNets() != null && this.getVxNets().size() > 0 ) {
                for (int i = 0 ; i < this.getVxNets().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class InstanceTypeModel implements ParamValidate {
        private String description;

        @ParamAnnotation(paramType = "query", paramName = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @ParamAnnotation(paramType = "query", paramName = "description")
        public String getDescription() {
            return this.description;
        }

        private String instanceTypeID;

        @ParamAnnotation(paramType = "query", paramName = "instance_type_id")
        public void setInstanceTypeID(String instanceTypeID) {
            this.instanceTypeID = instanceTypeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_type_id")
        public String getInstanceTypeID() {
            return this.instanceTypeID;
        }

        private String instanceTypeName;

        @ParamAnnotation(paramType = "query", paramName = "instance_type_name")
        public void setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_type_name")
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        private Integer memoryCurrent;

        @ParamAnnotation(paramType = "query", paramName = "memory_current")
        public void setMemoryCurrent(Integer memoryCurrent) {
            this.memoryCurrent = memoryCurrent;
        }

        @ParamAnnotation(paramType = "query", paramName = "memory_current")
        public Integer getMemoryCurrent() {
            return this.memoryCurrent;
        }

    	// Status's available values: available, deprecated
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private Integer vCPUsCurrent;

        @ParamAnnotation(paramType = "query", paramName = "vcpus_current")
        public void setVCPUsCurrent(Integer vCPUsCurrent) {
            this.vCPUsCurrent = vCPUsCurrent;
        }

        @ParamAnnotation(paramType = "query", paramName = "vcpus_current")
        public Integer getVCPUsCurrent() {
            return this.vCPUsCurrent;
        }

        private String zoneID;

        @ParamAnnotation(paramType = "query", paramName = "zone_id")
        public void setZoneID(String zoneID) {
            this.zoneID = zoneID;
        }

        @ParamAnnotation(paramType = "query", paramName = "zone_id")
        public String getZoneID() {
            return this.zoneID;
        }


        public String validateParam() throws QCException {
            String[] statusValidValues = {
                "available", "deprecated"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class InstanceVxNetModel implements ParamValidate {
        private String nICID;

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public Integer getRole() {
            return this.role;
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

        private String vxNetName;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        private Integer vxNetType;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }


        public String validateParam() throws QCException {
            String[]vxNetTypeValidValues = {"0", "1"};
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

    public static class JobModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String jobAction;

        @ParamAnnotation(paramType = "query", paramName = "job_action")
        public void setJobAction(String jobAction) {
            this.jobAction = jobAction;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_action")
        public String getJobAction() {
            return this.jobAction;
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

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String resourceIDs;

        @ParamAnnotation(paramType = "query", paramName = "resource_ids")
        public void setResourceIDs(String resourceIDs) {
            this.resourceIDs = resourceIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_ids")
        public String getResourceIDs() {
            return this.resourceIDs;
        }

    	// Status's available values: pending, working, failed, successful, done with failure
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }


        public String validateParam() throws QCException {
            String[] statusValidValues = {
                "pending", "working", "failed", "successful", "done with failure"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class KeyPairModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// EncryptMethod's available values: ssh-rsa, ssh-dss
        private String encryptMethod;

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public void setEncryptMethod(String encryptMethod) {
            this.encryptMethod = encryptMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public String getEncryptMethod() {
            return this.encryptMethod;
        }

        private List<String> instanceIDs;

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
        }

        private String keyPairID;

        @ParamAnnotation(paramType = "query", paramName = "keypair_id")
        public void setKeyPairID(String keyPairID) {
            this.keyPairID = keyPairID;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypair_id")
        public String getKeyPairID() {
            return this.keyPairID;
        }

        private String keyPairName;

        @ParamAnnotation(paramType = "query", paramName = "keypair_name")
        public void setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypair_name")
        public String getKeyPairName() {
            return this.keyPairName;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String privKey;

        @ParamAnnotation(paramType = "query", paramName = "priv_key")
        public void setPrivKey(String privKey) {
            this.privKey = privKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "priv_key")
        public String getPrivKey() {
            return this.privKey;
        }

        private String pubKey;

        @ParamAnnotation(paramType = "query", paramName = "pub_key")
        public void setPubKey(String pubKey) {
            this.pubKey = pubKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "pub_key")
        public String getPubKey() {
            return this.pubKey;
        }

        private String resourceIDs;

        @ParamAnnotation(paramType = "query", paramName = "resource_ids")
        public void setResourceIDs(String resourceIDs) {
            this.resourceIDs = resourceIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_ids")
        public String getResourceIDs() {
            return this.resourceIDs;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }


        public String validateParam() throws QCException {
            String[] encryptMethodValidValues = {
                "ssh-rsa", "ssh-dss"
            };

            boolean encryptMethodIsValid = false;
            for (String v : encryptMethodValidValues) {
                if (v.equals(this.getEncryptMethod())) {
                    encryptMethodIsValid = true;
                }
                Boolean encryptMethodIsRequired = Boolean.FALSE;
                if (encryptMethodIsRequired.equals(Boolean.FALSE) && this.getEncryptMethod() == null) {
                    encryptMethodIsValid = true;
                }
            }

            if (!encryptMethodIsValid) {
                throw new QCException("EncryptMethod value " + this.getEncryptMethod() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class LoadBalancerModel implements ParamValidate {
        private List<EIPModel> cluster;

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(List<EIPModel> cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public List<EIPModel> getCluster() {
            return this.cluster;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private List<EIPModel> eIPs;

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public void setEIPs(List<EIPModel> eIPs) {
            this.eIPs = eIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public List<EIPModel> getEIPs() {
            return this.eIPs;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private List<LoadBalancerListenerModel> listeners;

        @ParamAnnotation(paramType = "query", paramName = "listeners")
        public void setListeners(List<LoadBalancerListenerModel> listeners) {
            this.listeners = listeners;
        }

        @ParamAnnotation(paramType = "query", paramName = "listeners")
        public List<LoadBalancerListenerModel> getListeners() {
            return this.listeners;
        }

        private String loadBalancerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

    	// LoadBalancerType's available values: 0, 1, 2, 3, 4, 5
        private Integer loadBalancerType;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
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

        private List<String> privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(List<String> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public List<String> getPrivateIPs() {
            return this.privateIPs;
        }

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, stopped, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
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


        public String validateParam() throws QCException {
            if (this.getCluster() != null && this.getCluster().size() > 0 ) {
                for (int i = 0 ; i < this.getCluster().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getEIPs() != null && this.getEIPs().size() > 0 ) {
                for (int i = 0 ; i < this.getEIPs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            if (this.getListeners() != null && this.getListeners().size() > 0 ) {
                for (int i = 0 ; i < this.getListeners().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[]loadBalancerTypeValidValues = {"0", "1", "2", "3", "4", "5"};
            boolean loadBalancerTypeIsValid = false;
            for (String v : loadBalancerTypeValidValues) {
                if (v.equals(this.getLoadBalancerType()+"")) {
                    loadBalancerTypeIsValid = true;
                }
                Boolean loadBalancerTypeIsRequired = Boolean.FALSE;
                if (loadBalancerTypeIsRequired.equals(Boolean.FALSE) && this.getLoadBalancerType()==null) {
                    loadBalancerTypeIsValid = true;
                }
            }

            if (!loadBalancerTypeIsValid) {
                throw new QCException("LoadBalancerType value " + this.getLoadBalancerType() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "stopped", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "starting", "stopping", "updating", "suspending", "resuming", "deleting"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class LoadBalancerBackendModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String loadBalancerBackendID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_id")
        public void setLoadBalancerBackendID(String loadBalancerBackendID) {
            this.loadBalancerBackendID = loadBalancerBackendID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_id")
        public String getLoadBalancerBackendID() {
            return this.loadBalancerBackendID;
        }

        private String loadBalancerBackendName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_name")
        public void setLoadBalancerBackendName(String loadBalancerBackendName) {
            this.loadBalancerBackendName = loadBalancerBackendName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_backend_name")
        public String getLoadBalancerBackendName() {
            return this.loadBalancerBackendName;
        }

        private String loadBalancerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerListenerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_id")
        public void setLoadBalancerListenerID(String loadBalancerListenerID) {
            this.loadBalancerListenerID = loadBalancerListenerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_id")
        public String getLoadBalancerListenerID() {
            return this.loadBalancerListenerID;
        }

        private String loadBalancerPolicyID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer port;

        @ParamAnnotation(paramType = "query", paramName = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @ParamAnnotation(paramType = "query", paramName = "port")
        public Integer getPort() {
            return this.port;
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

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private Integer weight;

        @ParamAnnotation(paramType = "query", paramName = "weight")
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @ParamAnnotation(paramType = "query", paramName = "weight")
        public Integer getWeight() {
            return this.weight;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class LoadBalancerListenerModel implements ParamValidate {
        private String backendProtocol;

        @ParamAnnotation(paramType = "query", paramName = "backend_protocol")
        public void setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
        }

        @ParamAnnotation(paramType = "query", paramName = "backend_protocol")
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        private List<LoadBalancerBackendModel> backends;

        @ParamAnnotation(paramType = "query", paramName = "backends")
        public void setBackends(List<LoadBalancerBackendModel> backends) {
            this.backends = backends;
        }

        @ParamAnnotation(paramType = "query", paramName = "backends")
        public List<LoadBalancerBackendModel> getBackends() {
            return this.backends;
        }

    	// BalanceMode's available values: roundrobin, leastconn, source
        private String balanceMode;

        @ParamAnnotation(paramType = "query", paramName = "balance_mode")
        public void setBalanceMode(String balanceMode) {
            this.balanceMode = balanceMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "balance_mode")
        public String getBalanceMode() {
            return this.balanceMode;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Integer forwardfor;

        @ParamAnnotation(paramType = "query", paramName = "forwardfor")
        public void setForwardfor(Integer forwardfor) {
            this.forwardfor = forwardfor;
        }

        @ParamAnnotation(paramType = "query", paramName = "forwardfor")
        public Integer getForwardfor() {
            return this.forwardfor;
        }

        private String healthyCheckMethod;

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_method")
        public void setHealthyCheckMethod(String healthyCheckMethod) {
            this.healthyCheckMethod = healthyCheckMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_method")
        public String getHealthyCheckMethod() {
            return this.healthyCheckMethod;
        }

        private String healthyCheckOption;

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_option")
        public void setHealthyCheckOption(String healthyCheckOption) {
            this.healthyCheckOption = healthyCheckOption;
        }

        @ParamAnnotation(paramType = "query", paramName = "healthy_check_option")
        public String getHealthyCheckOption() {
            return this.healthyCheckOption;
        }

        private Integer listenerOption;

        @ParamAnnotation(paramType = "query", paramName = "listener_option")
        public void setListenerOption(Integer listenerOption) {
            this.listenerOption = listenerOption;
        }

        @ParamAnnotation(paramType = "query", paramName = "listener_option")
        public Integer getListenerOption() {
            return this.listenerOption;
        }

        private Integer listenerPort;

        @ParamAnnotation(paramType = "query", paramName = "listener_port")
        public void setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
        }

        @ParamAnnotation(paramType = "query", paramName = "listener_port")
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        private String listenerProtocol;

        @ParamAnnotation(paramType = "query", paramName = "listener_protocol")
        public void setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
        }

        @ParamAnnotation(paramType = "query", paramName = "listener_protocol")
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        private String loadBalancerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerListenerID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_id")
        public void setLoadBalancerListenerID(String loadBalancerListenerID) {
            this.loadBalancerListenerID = loadBalancerListenerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_id")
        public String getLoadBalancerListenerID() {
            return this.loadBalancerListenerID;
        }

        private String loadBalancerListenerName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_name")
        public void setLoadBalancerListenerName(String loadBalancerListenerName) {
            this.loadBalancerListenerName = loadBalancerListenerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_listener_name")
        public String getLoadBalancerListenerName() {
            return this.loadBalancerListenerName;
        }

        private String serverCertificateID;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String sessionSticky;

        @ParamAnnotation(paramType = "query", paramName = "session_sticky")
        public void setSessionSticky(String sessionSticky) {
            this.sessionSticky = sessionSticky;
        }

        @ParamAnnotation(paramType = "query", paramName = "session_sticky")
        public String getSessionSticky() {
            return this.sessionSticky;
        }

        private Integer timeout;

        @ParamAnnotation(paramType = "query", paramName = "timeout")
        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        @ParamAnnotation(paramType = "query", paramName = "timeout")
        public Integer getTimeout() {
            return this.timeout;
        }


        public String validateParam() throws QCException {
            if (this.getBackends() != null && this.getBackends().size() > 0 ) {
                for (int i = 0 ; i < this.getBackends().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] balanceModeValidValues = {
                "roundrobin", "leastconn", "source"
            };

            boolean balanceModeIsValid = false;
            for (String v : balanceModeValidValues) {
                if (v.equals(this.getBalanceMode())) {
                    balanceModeIsValid = true;
                }
                Boolean balanceModeIsRequired = Boolean.FALSE;
                if (balanceModeIsRequired.equals(Boolean.FALSE) && this.getBalanceMode() == null) {
                    balanceModeIsValid = true;
                }
            }

            if (!balanceModeIsValid) {
                throw new QCException("BalanceMode value " + this.getBalanceMode() + "is invalid");
            }
            return null;
        }
    }

    public static class LoadBalancerPolicyModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private List<String> loadBalancerIDs;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_ids")
        public void setLoadBalancerIDs(List<String> loadBalancerIDs) {
            this.loadBalancerIDs = loadBalancerIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_ids")
        public List<String> getLoadBalancerIDs() {
            return this.loadBalancerIDs;
        }

        private String loadBalancerPolicyID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private String loadBalancerPolicyName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_name")
        public String getLoadBalancerPolicyName() {
            return this.loadBalancerPolicyName;
        }


        public String validateParam() throws QCException {
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            return null;
        }
    }

    public static class LoadBalancerPolicyRuleModel implements ParamValidate {
        private String loadBalancerPolicyRuleID;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_id")
        public void setLoadBalancerPolicyRuleID(String loadBalancerPolicyRuleID) {
            this.loadBalancerPolicyRuleID = loadBalancerPolicyRuleID;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_id")
        public String getLoadBalancerPolicyRuleID() {
            return this.loadBalancerPolicyRuleID;
        }

        private String loadBalancerPolicyRuleName;

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_name")
        public void setLoadBalancerPolicyRuleName(String loadBalancerPolicyRuleName) {
            this.loadBalancerPolicyRuleName = loadBalancerPolicyRuleName;
        }

        @ParamAnnotation(paramType = "query", paramName = "loadbalancer_policy_rule_name")
        public String getLoadBalancerPolicyRuleName() {
            return this.loadBalancerPolicyRuleName;
        }

        private String ruleType;

        @ParamAnnotation(paramType = "query", paramName = "rule_type")
        public void setRuleType(String ruleType) {
            this.ruleType = ruleType;
        }

        @ParamAnnotation(paramType = "query", paramName = "rule_type")
        public String getRuleType() {
            return this.ruleType;
        }

        private String val;

        @ParamAnnotation(paramType = "query", paramName = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @ParamAnnotation(paramType = "query", paramName = "val")
        public String getVal() {
            return this.val;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class MeterModel implements ParamValidate {
        private List<Object> data;

        @ParamAnnotation(paramType = "query", paramName = "data")
        public void setData(List<Object> data) {
            this.data = data;
        }

        @ParamAnnotation(paramType = "query", paramName = "data")
        public List<Object> getData() {
            return this.data;
        }

        private String meterID;

        @ParamAnnotation(paramType = "query", paramName = "meter_id")
        public void setMeterID(String meterID) {
            this.meterID = meterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "meter_id")
        public String getMeterID() {
            return this.meterID;
        }

        private Integer sequence;

        @ParamAnnotation(paramType = "query", paramName = "sequence")
        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }

        @ParamAnnotation(paramType = "query", paramName = "sequence")
        public Integer getSequence() {
            return this.sequence;
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


        public String validateParam() throws QCException {
            if (this.getData() != null && this.getData().size() > 0 ) {
                for (int i = 0 ; i < this.getData().size(); i++ ) {
                    
                    String vValidate = (String)this.getData().get(i);
                    

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class MongoModel implements ParamValidate {
    	// AlarmStatus's available values: ok, alarm, insufficient
        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer autoBackupTime;

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Integer autoMinorVerUpgrade;

        @ParamAnnotation(paramType = "query", paramName = "auto_minor_ver_upgrade")
        public void setAutoMinorVerUpgrade(Integer autoMinorVerUpgrade) {
            this.autoMinorVerUpgrade = autoMinorVerUpgrade;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_minor_ver_upgrade")
        public Integer getAutoMinorVerUpgrade() {
            return this.autoMinorVerUpgrade;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String latestSnapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String mongoID;

        @ParamAnnotation(paramType = "query", paramName = "mongo_id")
        public void setMongoID(String mongoID) {
            this.mongoID = mongoID;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_id")
        public String getMongoID() {
            return this.mongoID;
        }

        private String mongoName;

        @ParamAnnotation(paramType = "query", paramName = "mongo_name")
        public void setMongoName(String mongoName) {
            this.mongoName = mongoName;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_name")
        public String getMongoName() {
            return this.mongoName;
        }

        private Integer mongoType;

        @ParamAnnotation(paramType = "query", paramName = "mongo_type")
        public void setMongoType(Integer mongoType) {
            this.mongoType = mongoType;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_type")
        public Integer getMongoType() {
            return this.mongoType;
        }

        private String mongoVersion;

        @ParamAnnotation(paramType = "query", paramName = "mongo_version")
        public void setMongoVersion(String mongoVersion) {
            this.mongoVersion = mongoVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_version")
        public String getMongoVersion() {
            return this.mongoVersion;
        }

    	// Status's available values: pending, active, stopped, deleted, suspended, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer storageSize;

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, stopping, starting, deleting, resizing, suspending, vxnet-changing, snapshot-creating, instances-adding, instances-removing, pg-applying
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public VxNetModel getVxNet() {
            return this.vxNet;
        }


        public String validateParam() throws QCException {
            String[] alarmStatusValidValues = {
                "ok", "alarm", "insufficient"
            };

            boolean alarmStatusIsValid = false;
            for (String v : alarmStatusValidValues) {
                if (v.equals(this.getAlarmStatus())) {
                    alarmStatusIsValid = true;
                }
                Boolean alarmStatusIsRequired = Boolean.FALSE;
                if (alarmStatusIsRequired.equals(Boolean.FALSE) && this.getAlarmStatus() == null) {
                    alarmStatusIsValid = true;
                }
            }

            if (!alarmStatusIsValid) {
                throw new QCException("AlarmStatus value " + this.getAlarmStatus() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "stopped", "deleted", "suspended", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "stopping", "starting", "deleting", "resizing", "suspending", "vxnet-changing", "snapshot-creating", "instances-adding", "instances-removing", "pg-applying"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class MongoNodeModel implements ParamValidate {
        private String iP;

        @ParamAnnotation(paramType = "query", paramName = "ip")
        public void setIP(String iP) {
            this.iP = iP;
        }

        @ParamAnnotation(paramType = "query", paramName = "ip")
        public String getIP() {
            return this.iP;
        }

        private String mongoID;

        @ParamAnnotation(paramType = "query", paramName = "mongo_id")
        public void setMongoID(String mongoID) {
            this.mongoID = mongoID;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_id")
        public String getMongoID() {
            return this.mongoID;
        }

        private String mongoNodeID;

        @ParamAnnotation(paramType = "query", paramName = "mongo_node_id")
        public void setMongoNodeID(String mongoNodeID) {
            this.mongoNodeID = mongoNodeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "mongo_node_id")
        public String getMongoNodeID() {
            return this.mongoNodeID;
        }

        private Integer primary;

        @ParamAnnotation(paramType = "query", paramName = "primary")
        public void setPrimary(Integer primary) {
            this.primary = primary;
        }

        @ParamAnnotation(paramType = "query", paramName = "primary")
        public Integer getPrimary() {
            return this.primary;
        }

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class MongoParameterModel implements ParamValidate {
    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

    	// IsStatic's available values: 0, 1
        private Integer isStatic;

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private String oPTName;

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String parameterName;

        @ParamAnnotation(paramType = "query", paramName = "parameter_name")
        public void setParameterName(String parameterName) {
            this.parameterName = parameterName;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameter_name")
        public String getParameterName() {
            return this.parameterName;
        }

    	// ParameterType's available values: string, int, bool
        private String parameterType;

        @ParamAnnotation(paramType = "query", paramName = "parameter_type")
        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameter_type")
        public String getParameterType() {
            return this.parameterType;
        }

        private String parameterValue;

        @ParamAnnotation(paramType = "query", paramName = "parameter_value")
        public void setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "parameter_value")
        public String getParameterValue() {
            return this.parameterValue;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            String[]isReadonlyValidValues = {"0", "1"};
            boolean isReadonlyIsValid = false;
            for (String v : isReadonlyValidValues) {
                if (v.equals(this.getIsReadonly()+"")) {
                    isReadonlyIsValid = true;
                }
                Boolean isReadonlyIsRequired = Boolean.FALSE;
                if (isReadonlyIsRequired.equals(Boolean.FALSE) && this.getIsReadonly()==null) {
                    isReadonlyIsValid = true;
                }
            }

            if (!isReadonlyIsValid) {
                throw new QCException("IsReadonly value " + this.getIsReadonly() + "is invalid");
            }
            String[]isStaticValidValues = {"0", "1"};
            boolean isStaticIsValid = false;
            for (String v : isStaticValidValues) {
                if (v.equals(this.getIsStatic()+"")) {
                    isStaticIsValid = true;
                }
                Boolean isStaticIsRequired = Boolean.FALSE;
                if (isStaticIsRequired.equals(Boolean.FALSE) && this.getIsStatic()==null) {
                    isStaticIsValid = true;
                }
            }

            if (!isStaticIsValid) {
                throw new QCException("IsStatic value " + this.getIsStatic() + "is invalid");
            }
            String[] parameterTypeValidValues = {
                "string", "int", "bool"
            };

            boolean parameterTypeIsValid = false;
            for (String v : parameterTypeValidValues) {
                if (v.equals(this.getParameterType())) {
                    parameterTypeIsValid = true;
                }
                Boolean parameterTypeIsRequired = Boolean.FALSE;
                if (parameterTypeIsRequired.equals(Boolean.FALSE) && this.getParameterType() == null) {
                    parameterTypeIsValid = true;
                }
            }

            if (!parameterTypeIsValid) {
                throw new QCException("ParameterType value " + this.getParameterType() + "is invalid");
            }
            return null;
        }
    }

    public static class MongoPrivateIPModel implements ParamValidate {
        private String priority0;

        @ParamAnnotation(paramType = "query", paramName = "priority0")
        public void setPriority0(String priority0) {
            this.priority0 = priority0;
        }

        @ParamAnnotation(paramType = "query", paramName = "priority0")
        public String getPriority0() {
            return this.priority0;
        }

        private String replica;

        @ParamAnnotation(paramType = "query", paramName = "replica")
        public void setReplica(String replica) {
            this.replica = replica;
        }

        @ParamAnnotation(paramType = "query", paramName = "replica")
        public String getReplica() {
            return this.replica;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class NICModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private NICEIPModel eIP;

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public void setEIP(NICEIPModel eIP) {
            this.eIP = eIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public NICEIPModel getEIP() {
            return this.eIP;
        }

        private String instanceID;

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private String nICID;

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String nICName;

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_name")
        public String getNICName() {
            return this.nICName;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public Integer getRole() {
            return this.role;
        }

        private String rootUserID;

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @ParamAnnotation(paramType = "query", paramName = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private String securityGroup;

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private Integer sequence;

        @ParamAnnotation(paramType = "query", paramName = "sequence")
        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }

        @ParamAnnotation(paramType = "query", paramName = "sequence")
        public Integer getSequence() {
            return this.sequence;
        }

    	// Status's available values: available, in-use
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
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


        public String validateParam() throws QCException {
            String[] statusValidValues = {
                "available", "in-use"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class NICEIPModel implements ParamValidate {
        private Integer bandwidth;

        @ParamAnnotation(paramType = "query", paramName = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @ParamAnnotation(paramType = "query", paramName = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        private String eIPAddr;

        @ParamAnnotation(paramType = "query", paramName = "eip_addr")
        public void setEIPAddr(String eIPAddr) {
            this.eIPAddr = eIPAddr;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_addr")
        public String getEIPAddr() {
            return this.eIPAddr;
        }

        private String eIPID;

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class NICIPModel implements ParamValidate {
        private String nICID;

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class NICVxNetModel implements ParamValidate {
        private String nICID;

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public Integer getRole() {
            return this.role;
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

        private String vxNetName;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

        private Integer vxNetType;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RDBModel implements ParamValidate {
    	// AlarmStatus's available values: ok, alarm, insufficient
        private String alarmStatus;

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer autoBackupTime;

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Integer autoMinorVerUpgrade;

        @ParamAnnotation(paramType = "query", paramName = "auto_minor_ver_upgrade")
        public void setAutoMinorVerUpgrade(Integer autoMinorVerUpgrade) {
            this.autoMinorVerUpgrade = autoMinorVerUpgrade;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_minor_ver_upgrade")
        public Integer getAutoMinorVerUpgrade() {
            return this.autoMinorVerUpgrade;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String engineVersion;

        @ParamAnnotation(paramType = "query", paramName = "engine_version")
        public void setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "engine_version")
        public String getEngineVersion() {
            return this.engineVersion;
        }

        private String latestSnapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String masterIP;

        @ParamAnnotation(paramType = "query", paramName = "master_ip")
        public void setMasterIP(String masterIP) {
            this.masterIP = masterIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "master_ip")
        public String getMasterIP() {
            return this.masterIP;
        }

        private String rDBEngine;

        @ParamAnnotation(paramType = "query", paramName = "rdb_engine")
        public void setRDBEngine(String rDBEngine) {
            this.rDBEngine = rDBEngine;
        }

        @ParamAnnotation(paramType = "query", paramName = "rdb_engine")
        public String getRDBEngine() {
            return this.rDBEngine;
        }

        private String rDBID;

        @ParamAnnotation(paramType = "query", paramName = "rdb_id")
        public void setRDBID(String rDBID) {
            this.rDBID = rDBID;
        }

        @ParamAnnotation(paramType = "query", paramName = "rdb_id")
        public String getRDBID() {
            return this.rDBID;
        }

        private String rDBName;

        @ParamAnnotation(paramType = "query", paramName = "rdb_name")
        public void setRDBName(String rDBName) {
            this.rDBName = rDBName;
        }

        @ParamAnnotation(paramType = "query", paramName = "rdb_name")
        public String getRDBName() {
            return this.rDBName;
        }

        private Integer rDBType;

        @ParamAnnotation(paramType = "query", paramName = "rdb_type")
        public void setRDBType(Integer rDBType) {
            this.rDBType = rDBType;
        }

        @ParamAnnotation(paramType = "query", paramName = "rdb_type")
        public Integer getRDBType() {
            return this.rDBType;
        }

    	// Status's available values: pending, active, stopped, deleted, suspended, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer storageSize;

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, stopping, starting, deleting, backup-creating, temp-creating, configuring, switching, invalid-tackling, resizing, suspending, ceasing, instance-ceasing, vxnet-leaving, vxnet-joining
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public VxNetModel getVxNet() {
            return this.vxNet;
        }


        public String validateParam() throws QCException {
            String[] alarmStatusValidValues = {
                "ok", "alarm", "insufficient"
            };

            boolean alarmStatusIsValid = false;
            for (String v : alarmStatusValidValues) {
                if (v.equals(this.getAlarmStatus())) {
                    alarmStatusIsValid = true;
                }
                Boolean alarmStatusIsRequired = Boolean.FALSE;
                if (alarmStatusIsRequired.equals(Boolean.FALSE) && this.getAlarmStatus() == null) {
                    alarmStatusIsValid = true;
                }
            }

            if (!alarmStatusIsValid) {
                throw new QCException("AlarmStatus value " + this.getAlarmStatus() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "stopped", "deleted", "suspended", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "stopping", "starting", "deleting", "backup-creating", "temp-creating", "configuring", "switching", "invalid-tackling", "resizing", "suspending", "ceasing", "instance-ceasing", "vxnet-leaving", "vxnet-joining"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class RDBFileModel implements ParamValidate {
        private List<FileModel> binaryLog;

        @ParamAnnotation(paramType = "query", paramName = "binary_log")
        public void setBinaryLog(List<FileModel> binaryLog) {
            this.binaryLog = binaryLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "binary_log")
        public List<FileModel> getBinaryLog() {
            return this.binaryLog;
        }

        private List<FileModel> errorLog;

        @ParamAnnotation(paramType = "query", paramName = "error_log")
        public void setErrorLog(List<FileModel> errorLog) {
            this.errorLog = errorLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "error_log")
        public List<FileModel> getErrorLog() {
            return this.errorLog;
        }

        private List<FileModel> slowLog;

        @ParamAnnotation(paramType = "query", paramName = "slow_log")
        public void setSlowLog(List<FileModel> slowLog) {
            this.slowLog = slowLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "slow_log")
        public List<FileModel> getSlowLog() {
            return this.slowLog;
        }


        public String validateParam() throws QCException {
            if (this.getBinaryLog() != null && this.getBinaryLog().size() > 0 ) {
                for (int i = 0 ; i < this.getBinaryLog().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getErrorLog() != null && this.getErrorLog().size() > 0 ) {
                for (int i = 0 ; i < this.getErrorLog().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getSlowLog() != null && this.getSlowLog().size() > 0 ) {
                for (int i = 0 ; i < this.getSlowLog().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class RDBParameterModel implements ParamValidate {
        private String family;

        @ParamAnnotation(paramType = "query", paramName = "family")
        public void setFamily(String family) {
            this.family = family;
        }

        @ParamAnnotation(paramType = "query", paramName = "family")
        public String getFamily() {
            return this.family;
        }

    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

    	// IsStatic's available values: 0, 1
        private Integer isStatic;

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private Integer maxValue;

        @ParamAnnotation(paramType = "query", paramName = "max_value")
        public void setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_value")
        public Integer getMaxValue() {
            return this.maxValue;
        }

        private Integer minValue;

        @ParamAnnotation(paramType = "query", paramName = "min_value")
        public void setMinValue(Integer minValue) {
            this.minValue = minValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "min_value")
        public Integer getMinValue() {
            return this.minValue;
        }

        private String oPTName;

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @ParamAnnotation(paramType = "query", paramName = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String sectionName;

        @ParamAnnotation(paramType = "query", paramName = "section_name")
        public void setSectionName(String sectionName) {
            this.sectionName = sectionName;
        }

        @ParamAnnotation(paramType = "query", paramName = "section_name")
        public String getSectionName() {
            return this.sectionName;
        }

        private String varName;

        @ParamAnnotation(paramType = "query", paramName = "var_name")
        public void setVarName(String varName) {
            this.varName = varName;
        }

        @ParamAnnotation(paramType = "query", paramName = "var_name")
        public String getVarName() {
            return this.varName;
        }

        private String varType;

        @ParamAnnotation(paramType = "query", paramName = "var_type")
        public void setVarType(String varType) {
            this.varType = varType;
        }

        @ParamAnnotation(paramType = "query", paramName = "var_type")
        public String getVarType() {
            return this.varType;
        }

        private String varValue;

        @ParamAnnotation(paramType = "query", paramName = "var_value")
        public void setVarValue(String varValue) {
            this.varValue = varValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "var_value")
        public String getVarValue() {
            return this.varValue;
        }


        public String validateParam() throws QCException {
            String[]isReadonlyValidValues = {"0", "1"};
            boolean isReadonlyIsValid = false;
            for (String v : isReadonlyValidValues) {
                if (v.equals(this.getIsReadonly()+"")) {
                    isReadonlyIsValid = true;
                }
                Boolean isReadonlyIsRequired = Boolean.FALSE;
                if (isReadonlyIsRequired.equals(Boolean.FALSE) && this.getIsReadonly()==null) {
                    isReadonlyIsValid = true;
                }
            }

            if (!isReadonlyIsValid) {
                throw new QCException("IsReadonly value " + this.getIsReadonly() + "is invalid");
            }
            String[]isStaticValidValues = {"0", "1"};
            boolean isStaticIsValid = false;
            for (String v : isStaticValidValues) {
                if (v.equals(this.getIsStatic()+"")) {
                    isStaticIsValid = true;
                }
                Boolean isStaticIsRequired = Boolean.FALSE;
                if (isStaticIsRequired.equals(Boolean.FALSE) && this.getIsStatic()==null) {
                    isStaticIsValid = true;
                }
            }

            if (!isStaticIsValid) {
                throw new QCException("IsStatic value " + this.getIsStatic() + "is invalid");
            }
            return null;
        }
    }

    public static class RDBParametersModel implements ParamValidate {
        private String bindAddress;

        @ParamAnnotation(paramType = "query", paramName = "bind_address")
        public void setBindAddress(String bindAddress) {
            this.bindAddress = bindAddress;
        }

        @ParamAnnotation(paramType = "query", paramName = "bind_address")
        public String getBindAddress() {
            return this.bindAddress;
        }

        private String binlogFormat;

        @ParamAnnotation(paramType = "query", paramName = "binlog_format")
        public void setBinlogFormat(String binlogFormat) {
            this.binlogFormat = binlogFormat;
        }

        @ParamAnnotation(paramType = "query", paramName = "binlog_format")
        public String getBinlogFormat() {
            return this.binlogFormat;
        }

        private String characterSetServer;

        @ParamAnnotation(paramType = "query", paramName = "character_set_server")
        public void setCharacterSetServer(String characterSetServer) {
            this.characterSetServer = characterSetServer;
        }

        @ParamAnnotation(paramType = "query", paramName = "character_set_server")
        public String getCharacterSetServer() {
            return this.characterSetServer;
        }

        private String dataDir;

        @ParamAnnotation(paramType = "query", paramName = "datadir")
        public void setDataDir(String dataDir) {
            this.dataDir = dataDir;
        }

        @ParamAnnotation(paramType = "query", paramName = "datadir")
        public String getDataDir() {
            return this.dataDir;
        }

        private String defaultStorageEngine;

        @ParamAnnotation(paramType = "query", paramName = "default_storage_engine")
        public void setDefaultStorageEngine(String defaultStorageEngine) {
            this.defaultStorageEngine = defaultStorageEngine;
        }

        @ParamAnnotation(paramType = "query", paramName = "default_storage_engine")
        public String getDefaultStorageEngine() {
            return this.defaultStorageEngine;
        }

        private Integer expireLogsDays;

        @ParamAnnotation(paramType = "query", paramName = "expire_logs_days")
        public void setExpireLogsDays(Integer expireLogsDays) {
            this.expireLogsDays = expireLogsDays;
        }

        @ParamAnnotation(paramType = "query", paramName = "expire_logs_days")
        public Integer getExpireLogsDays() {
            return this.expireLogsDays;
        }

        private String innoDB;

        @ParamAnnotation(paramType = "query", paramName = "innodb")
        public void setInnoDB(String innoDB) {
            this.innoDB = innoDB;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb")
        public String getInnoDB() {
            return this.innoDB;
        }

        private Integer innoDBBufferPoolInstances;

        @ParamAnnotation(paramType = "query", paramName = "innodb_buffer_pool_instances")
        public void setInnoDBBufferPoolInstances(Integer innoDBBufferPoolInstances) {
            this.innoDBBufferPoolInstances = innoDBBufferPoolInstances;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_buffer_pool_instances")
        public Integer getInnoDBBufferPoolInstances() {
            return this.innoDBBufferPoolInstances;
        }

        private String innoDBBufferPoolSize;

        @ParamAnnotation(paramType = "query", paramName = "innodb_buffer_pool_size")
        public void setInnoDBBufferPoolSize(String innoDBBufferPoolSize) {
            this.innoDBBufferPoolSize = innoDBBufferPoolSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_buffer_pool_size")
        public String getInnoDBBufferPoolSize() {
            return this.innoDBBufferPoolSize;
        }

        private Integer innoDBFilePerTable;

        @ParamAnnotation(paramType = "query", paramName = "innodb_file_per_table")
        public void setInnoDBFilePerTable(Integer innoDBFilePerTable) {
            this.innoDBFilePerTable = innoDBFilePerTable;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_file_per_table")
        public Integer getInnoDBFilePerTable() {
            return this.innoDBFilePerTable;
        }

        private Integer innoDBFlushLogAtTRXCommit;

        @ParamAnnotation(paramType = "query", paramName = "innodb_flush_log_at_trx_commit")
        public void setInnoDBFlushLogAtTRXCommit(Integer innoDBFlushLogAtTRXCommit) {
            this.innoDBFlushLogAtTRXCommit = innoDBFlushLogAtTRXCommit;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_flush_log_at_trx_commit")
        public Integer getInnoDBFlushLogAtTRXCommit() {
            return this.innoDBFlushLogAtTRXCommit;
        }

        private String innoDBFlushMethod;

        @ParamAnnotation(paramType = "query", paramName = "innodb_flush_method")
        public void setInnoDBFlushMethod(String innoDBFlushMethod) {
            this.innoDBFlushMethod = innoDBFlushMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_flush_method")
        public String getInnoDBFlushMethod() {
            return this.innoDBFlushMethod;
        }

        private Integer innoDBIOCapacity;

        @ParamAnnotation(paramType = "query", paramName = "innodb_io_capacity")
        public void setInnoDBIOCapacity(Integer innoDBIOCapacity) {
            this.innoDBIOCapacity = innoDBIOCapacity;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_io_capacity")
        public Integer getInnoDBIOCapacity() {
            return this.innoDBIOCapacity;
        }

        private String innoDBLogBufferSize;

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_buffer_size")
        public void setInnoDBLogBufferSize(String innoDBLogBufferSize) {
            this.innoDBLogBufferSize = innoDBLogBufferSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_buffer_size")
        public String getInnoDBLogBufferSize() {
            return this.innoDBLogBufferSize;
        }

        private String innoDBLogFileSize;

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_file_size")
        public void setInnoDBLogFileSize(String innoDBLogFileSize) {
            this.innoDBLogFileSize = innoDBLogFileSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_file_size")
        public String getInnoDBLogFileSize() {
            return this.innoDBLogFileSize;
        }

        private Integer innoDBLogFilesInGroup;

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_files_in_group")
        public void setInnoDBLogFilesInGroup(Integer innoDBLogFilesInGroup) {
            this.innoDBLogFilesInGroup = innoDBLogFilesInGroup;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_log_files_in_group")
        public Integer getInnoDBLogFilesInGroup() {
            return this.innoDBLogFilesInGroup;
        }

        private Integer innoDBMaxDirtyPagesPct;

        @ParamAnnotation(paramType = "query", paramName = "innodb_max_dirty_pages_pct")
        public void setInnoDBMaxDirtyPagesPct(Integer innoDBMaxDirtyPagesPct) {
            this.innoDBMaxDirtyPagesPct = innoDBMaxDirtyPagesPct;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_max_dirty_pages_pct")
        public Integer getInnoDBMaxDirtyPagesPct() {
            return this.innoDBMaxDirtyPagesPct;
        }

        private Integer innoDBReadIOThreads;

        @ParamAnnotation(paramType = "query", paramName = "innodb_read_io_threads")
        public void setInnoDBReadIOThreads(Integer innoDBReadIOThreads) {
            this.innoDBReadIOThreads = innoDBReadIOThreads;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_read_io_threads")
        public Integer getInnoDBReadIOThreads() {
            return this.innoDBReadIOThreads;
        }

        private Integer innoDBWriteIOThreads;

        @ParamAnnotation(paramType = "query", paramName = "innodb_write_io_threads")
        public void setInnoDBWriteIOThreads(Integer innoDBWriteIOThreads) {
            this.innoDBWriteIOThreads = innoDBWriteIOThreads;
        }

        @ParamAnnotation(paramType = "query", paramName = "innodb_write_io_threads")
        public Integer getInnoDBWriteIOThreads() {
            return this.innoDBWriteIOThreads;
        }

        private Integer interactiveTimeout;

        @ParamAnnotation(paramType = "query", paramName = "interactive_timeout")
        public void setInteractiveTimeout(Integer interactiveTimeout) {
            this.interactiveTimeout = interactiveTimeout;
        }

        @ParamAnnotation(paramType = "query", paramName = "interactive_timeout")
        public Integer getInteractiveTimeout() {
            return this.interactiveTimeout;
        }

        private String keyBufferSize;

        @ParamAnnotation(paramType = "query", paramName = "key_buffer_size")
        public void setKeyBufferSize(String keyBufferSize) {
            this.keyBufferSize = keyBufferSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "key_buffer_size")
        public String getKeyBufferSize() {
            return this.keyBufferSize;
        }

        private String logBinIndex;

        @ParamAnnotation(paramType = "query", paramName = "log-bin-index")
        public void setLogBinIndex(String logBinIndex) {
            this.logBinIndex = logBinIndex;
        }

        @ParamAnnotation(paramType = "query", paramName = "log-bin-index")
        public String getLogBinIndex() {
            return this.logBinIndex;
        }

        private String logBin;

        @ParamAnnotation(paramType = "query", paramName = "log_bin")
        public void setLogBin(String logBin) {
            this.logBin = logBin;
        }

        @ParamAnnotation(paramType = "query", paramName = "log_bin")
        public String getLogBin() {
            return this.logBin;
        }

        private String logError;

        @ParamAnnotation(paramType = "query", paramName = "log_error")
        public void setLogError(String logError) {
            this.logError = logError;
        }

        @ParamAnnotation(paramType = "query", paramName = "log_error")
        public String getLogError() {
            return this.logError;
        }

        private String logQueriesNotUsingIndexes;

        @ParamAnnotation(paramType = "query", paramName = "log_queries_not_using_indexes")
        public void setLogQueriesNotUsingIndexes(String logQueriesNotUsingIndexes) {
            this.logQueriesNotUsingIndexes = logQueriesNotUsingIndexes;
        }

        @ParamAnnotation(paramType = "query", paramName = "log_queries_not_using_indexes")
        public String getLogQueriesNotUsingIndexes() {
            return this.logQueriesNotUsingIndexes;
        }

        private Integer logSlaveUpdates;

        @ParamAnnotation(paramType = "query", paramName = "log_slave_updates")
        public void setLogSlaveUpdates(Integer logSlaveUpdates) {
            this.logSlaveUpdates = logSlaveUpdates;
        }

        @ParamAnnotation(paramType = "query", paramName = "log_slave_updates")
        public Integer getLogSlaveUpdates() {
            return this.logSlaveUpdates;
        }

        private Integer longQueryTime;

        @ParamAnnotation(paramType = "query", paramName = "long_query_time")
        public void setLongQueryTime(Integer longQueryTime) {
            this.longQueryTime = longQueryTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "long_query_time")
        public Integer getLongQueryTime() {
            return this.longQueryTime;
        }

        private Integer lowerCaseTableNames;

        @ParamAnnotation(paramType = "query", paramName = "lower_case_table_names")
        public void setLowerCaseTableNames(Integer lowerCaseTableNames) {
            this.lowerCaseTableNames = lowerCaseTableNames;
        }

        @ParamAnnotation(paramType = "query", paramName = "lower_case_table_names")
        public Integer getLowerCaseTableNames() {
            return this.lowerCaseTableNames;
        }

        private String maxAllowedPacket;

        @ParamAnnotation(paramType = "query", paramName = "max_allowed_packet")
        public void setMaxAllowedPacket(String maxAllowedPacket) {
            this.maxAllowedPacket = maxAllowedPacket;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_allowed_packet")
        public String getMaxAllowedPacket() {
            return this.maxAllowedPacket;
        }

        private Integer maxConnectErrors;

        @ParamAnnotation(paramType = "query", paramName = "max_connect_errors")
        public void setMaxConnectErrors(Integer maxConnectErrors) {
            this.maxConnectErrors = maxConnectErrors;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_connect_errors")
        public Integer getMaxConnectErrors() {
            return this.maxConnectErrors;
        }

        private Integer maxConnections;

        @ParamAnnotation(paramType = "query", paramName = "max_connections")
        public void setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_connections")
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        private String maxHeapTableSize;

        @ParamAnnotation(paramType = "query", paramName = "max_heap_table_size")
        public void setMaxHeapTableSize(String maxHeapTableSize) {
            this.maxHeapTableSize = maxHeapTableSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "max_heap_table_size")
        public String getMaxHeapTableSize() {
            return this.maxHeapTableSize;
        }

        private Integer openFilesLimit;

        @ParamAnnotation(paramType = "query", paramName = "open_files_limit")
        public void setOpenFilesLimit(Integer openFilesLimit) {
            this.openFilesLimit = openFilesLimit;
        }

        @ParamAnnotation(paramType = "query", paramName = "open_files_limit")
        public Integer getOpenFilesLimit() {
            return this.openFilesLimit;
        }

        private Integer port;

        @ParamAnnotation(paramType = "query", paramName = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @ParamAnnotation(paramType = "query", paramName = "port")
        public Integer getPort() {
            return this.port;
        }

        private Integer queryCacheSize;

        @ParamAnnotation(paramType = "query", paramName = "query_cache_size")
        public void setQueryCacheSize(Integer queryCacheSize) {
            this.queryCacheSize = queryCacheSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "query_cache_size")
        public Integer getQueryCacheSize() {
            return this.queryCacheSize;
        }

        private Integer queryCacheType;

        @ParamAnnotation(paramType = "query", paramName = "query_cache_type")
        public void setQueryCacheType(Integer queryCacheType) {
            this.queryCacheType = queryCacheType;
        }

        @ParamAnnotation(paramType = "query", paramName = "query_cache_type")
        public Integer getQueryCacheType() {
            return this.queryCacheType;
        }

        private String relayLog;

        @ParamAnnotation(paramType = "query", paramName = "relay_log")
        public void setRelayLog(String relayLog) {
            this.relayLog = relayLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "relay_log")
        public String getRelayLog() {
            return this.relayLog;
        }

        private String relayLogIndex;

        @ParamAnnotation(paramType = "query", paramName = "relay_log_index")
        public void setRelayLogIndex(String relayLogIndex) {
            this.relayLogIndex = relayLogIndex;
        }

        @ParamAnnotation(paramType = "query", paramName = "relay_log_index")
        public String getRelayLogIndex() {
            return this.relayLogIndex;
        }

        private Integer skipSlaveStart;

        @ParamAnnotation(paramType = "query", paramName = "skip-slave-start")
        public void setSkipSlaveStart(Integer skipSlaveStart) {
            this.skipSlaveStart = skipSlaveStart;
        }

        @ParamAnnotation(paramType = "query", paramName = "skip-slave-start")
        public Integer getSkipSlaveStart() {
            return this.skipSlaveStart;
        }

        private Integer skipNameResolve;

        @ParamAnnotation(paramType = "query", paramName = "skip_name_resolve")
        public void setSkipNameResolve(Integer skipNameResolve) {
            this.skipNameResolve = skipNameResolve;
        }

        @ParamAnnotation(paramType = "query", paramName = "skip_name_resolve")
        public Integer getSkipNameResolve() {
            return this.skipNameResolve;
        }

        private String slaveExecMode;

        @ParamAnnotation(paramType = "query", paramName = "slave_exec_mode")
        public void setSlaveExecMode(String slaveExecMode) {
            this.slaveExecMode = slaveExecMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "slave_exec_mode")
        public String getSlaveExecMode() {
            return this.slaveExecMode;
        }

        private Integer slaveNetTimeout;

        @ParamAnnotation(paramType = "query", paramName = "slave_net_timeout")
        public void setSlaveNetTimeout(Integer slaveNetTimeout) {
            this.slaveNetTimeout = slaveNetTimeout;
        }

        @ParamAnnotation(paramType = "query", paramName = "slave_net_timeout")
        public Integer getSlaveNetTimeout() {
            return this.slaveNetTimeout;
        }

        private Integer slowQueryLog;

        @ParamAnnotation(paramType = "query", paramName = "slow_query_log")
        public void setSlowQueryLog(Integer slowQueryLog) {
            this.slowQueryLog = slowQueryLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "slow_query_log")
        public Integer getSlowQueryLog() {
            return this.slowQueryLog;
        }

        private String slowQueryLogFile;

        @ParamAnnotation(paramType = "query", paramName = "slow_query_log_file")
        public void setSlowQueryLogFile(String slowQueryLogFile) {
            this.slowQueryLogFile = slowQueryLogFile;
        }

        @ParamAnnotation(paramType = "query", paramName = "slow_query_log_file")
        public String getSlowQueryLogFile() {
            return this.slowQueryLogFile;
        }

        private String sQLMode;

        @ParamAnnotation(paramType = "query", paramName = "sql_mode")
        public void setSQLMode(String sQLMode) {
            this.sQLMode = sQLMode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sql_mode")
        public String getSQLMode() {
            return this.sQLMode;
        }

        private Integer syncBinlog;

        @ParamAnnotation(paramType = "query", paramName = "sync_binlog")
        public void setSyncBinlog(Integer syncBinlog) {
            this.syncBinlog = syncBinlog;
        }

        @ParamAnnotation(paramType = "query", paramName = "sync_binlog")
        public Integer getSyncBinlog() {
            return this.syncBinlog;
        }

        private Integer syncMasterInfo;

        @ParamAnnotation(paramType = "query", paramName = "sync_master_info")
        public void setSyncMasterInfo(Integer syncMasterInfo) {
            this.syncMasterInfo = syncMasterInfo;
        }

        @ParamAnnotation(paramType = "query", paramName = "sync_master_info")
        public Integer getSyncMasterInfo() {
            return this.syncMasterInfo;
        }

        private Integer syncRelayLog;

        @ParamAnnotation(paramType = "query", paramName = "sync_relay_log")
        public void setSyncRelayLog(Integer syncRelayLog) {
            this.syncRelayLog = syncRelayLog;
        }

        @ParamAnnotation(paramType = "query", paramName = "sync_relay_log")
        public Integer getSyncRelayLog() {
            return this.syncRelayLog;
        }

        private Integer syncRelayLogInfo;

        @ParamAnnotation(paramType = "query", paramName = "sync_relay_log_info")
        public void setSyncRelayLogInfo(Integer syncRelayLogInfo) {
            this.syncRelayLogInfo = syncRelayLogInfo;
        }

        @ParamAnnotation(paramType = "query", paramName = "sync_relay_log_info")
        public Integer getSyncRelayLogInfo() {
            return this.syncRelayLogInfo;
        }

        private Integer tableOpenCache;

        @ParamAnnotation(paramType = "query", paramName = "table_open_cache")
        public void setTableOpenCache(Integer tableOpenCache) {
            this.tableOpenCache = tableOpenCache;
        }

        @ParamAnnotation(paramType = "query", paramName = "table_open_cache")
        public Integer getTableOpenCache() {
            return this.tableOpenCache;
        }

        private Integer threadCacheSize;

        @ParamAnnotation(paramType = "query", paramName = "thread_cache_size")
        public void setThreadCacheSize(Integer threadCacheSize) {
            this.threadCacheSize = threadCacheSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "thread_cache_size")
        public Integer getThreadCacheSize() {
            return this.threadCacheSize;
        }

        private String tMPTableSize;

        @ParamAnnotation(paramType = "query", paramName = "tmp_table_size")
        public void setTMPTableSize(String tMPTableSize) {
            this.tMPTableSize = tMPTableSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "tmp_table_size")
        public String getTMPTableSize() {
            return this.tMPTableSize;
        }

        private String tMPDir;

        @ParamAnnotation(paramType = "query", paramName = "tmpdir")
        public void setTMPDir(String tMPDir) {
            this.tMPDir = tMPDir;
        }

        @ParamAnnotation(paramType = "query", paramName = "tmpdir")
        public String getTMPDir() {
            return this.tMPDir;
        }

        private String user;

        @ParamAnnotation(paramType = "query", paramName = "user")
        public void setUser(String user) {
            this.user = user;
        }

        @ParamAnnotation(paramType = "query", paramName = "user")
        public String getUser() {
            return this.user;
        }

        private Integer waitTimeout;

        @ParamAnnotation(paramType = "query", paramName = "wait_timeout")
        public void setWaitTimeout(Integer waitTimeout) {
            this.waitTimeout = waitTimeout;
        }

        @ParamAnnotation(paramType = "query", paramName = "wait_timeout")
        public Integer getWaitTimeout() {
            return this.waitTimeout;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RDBPrivateIPModel implements ParamValidate {
        private String master;

        @ParamAnnotation(paramType = "query", paramName = "master")
        public void setMaster(String master) {
            this.master = master;
        }

        @ParamAnnotation(paramType = "query", paramName = "master")
        public String getMaster() {
            return this.master;
        }

        private String topSlave;

        @ParamAnnotation(paramType = "query", paramName = "topslave")
        public void setTopSlave(String topSlave) {
            this.topSlave = topSlave;
        }

        @ParamAnnotation(paramType = "query", paramName = "topslave")
        public String getTopSlave() {
            return this.topSlave;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class ResourceModel implements ParamValidate {
        private String resourceID;

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceName;

        @ParamAnnotation(paramType = "query", paramName = "resource_name")
        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_name")
        public String getResourceName() {
            return this.resourceName;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class ResourceTagPairModel implements ParamValidate {
        private String resourceID;

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }

        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class ResourceTypeCountModel implements ParamValidate {
        private Integer count;

        @ParamAnnotation(paramType = "query", paramName = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @ParamAnnotation(paramType = "query", paramName = "count")
        public Integer getCount() {
            return this.count;
        }

        private String resourceType;

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RouterModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String dYNIPEnd;

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

        private EIPModel eIP;

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public void setEIP(EIPModel eIP) {
            this.eIP = eIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public EIPModel getEIP() {
            return this.eIP;
        }

        private String iPNetwork;

        @ParamAnnotation(paramType = "query", paramName = "ip_network")
        public void setIPNetwork(String iPNetwork) {
            this.iPNetwork = iPNetwork;
        }

        @ParamAnnotation(paramType = "query", paramName = "ip_network")
        public String getIPNetwork() {
            return this.iPNetwork;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private String managerIP;

        @ParamAnnotation(paramType = "query", paramName = "manager_ip")
        public void setManagerIP(String managerIP) {
            this.managerIP = managerIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "manager_ip")
        public String getManagerIP() {
            return this.managerIP;
        }

        private Integer mode;

        @ParamAnnotation(paramType = "query", paramName = "mode")
        public void setMode(Integer mode) {
            this.mode = mode;
        }

        @ParamAnnotation(paramType = "query", paramName = "mode")
        public Integer getMode() {
            return this.mode;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String routerID;

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerName;

        @ParamAnnotation(paramType = "query", paramName = "router_name")
        public void setRouterName(String routerName) {
            this.routerName = routerName;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_name")
        public String getRouterName() {
            return this.routerName;
        }

    	// RouterType's available values: 1
        private Integer routerType;

        @ParamAnnotation(paramType = "query", paramName = "router_type")
        public void setRouterType(Integer routerType) {
            this.routerType = routerType;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_type")
        public Integer getRouterType() {
            return this.routerType;
        }

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, poweroffed, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, updating, suspending, resuming, poweroffing, poweroning, deleting
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private String vpcNetwork;

        @ParamAnnotation(paramType = "query", paramName = "vpc_network")
        public void setVpcNetwork(String vpcNetwork) {
            this.vpcNetwork = vpcNetwork;
        }

        @ParamAnnotation(paramType = "query", paramName = "vpc_network")
        public String getVpcNetwork() {
            return this.vpcNetwork;
        }

        private List<VxNetModel> vxNets;

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public void setVxNets(List<VxNetModel> vxNets) {
            this.vxNets = vxNets;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnets")
        public List<VxNetModel> getVxNets() {
            return this.vxNets;
        }


        public String validateParam() throws QCException {
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            String[]routerTypeValidValues = {"1"};
            boolean routerTypeIsValid = false;
            for (String v : routerTypeValidValues) {
                if (v.equals(this.getRouterType()+"")) {
                    routerTypeIsValid = true;
                }
                Boolean routerTypeIsRequired = Boolean.FALSE;
                if (routerTypeIsRequired.equals(Boolean.FALSE) && this.getRouterType()==null) {
                    routerTypeIsValid = true;
                }
            }

            if (!routerTypeIsValid) {
                throw new QCException("RouterType value " + this.getRouterType() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "poweroffed", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "updating", "suspending", "resuming", "poweroffing", "poweroning", "deleting"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            if (this.getVxNets() != null && this.getVxNets().size() > 0 ) {
                for (int i = 0 ; i < this.getVxNets().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class RouterStaticModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private List<RouterStaticEntrySimpleModel> entrySet;

        @ParamAnnotation(paramType = "query", paramName = "entry_set")
        public void setEntrySet(List<RouterStaticEntrySimpleModel> entrySet) {
            this.entrySet = entrySet;
        }

        @ParamAnnotation(paramType = "query", paramName = "entry_set")
        public List<RouterStaticEntrySimpleModel> getEntrySet() {
            return this.entrySet;
        }

        private String routerID;

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerStaticID;

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String routerStaticName;

        @ParamAnnotation(paramType = "query", paramName = "router_static_name")
        public void setRouterStaticName(String routerStaticName) {
            this.routerStaticName = routerStaticName;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_name")
        public String getRouterStaticName() {
            return this.routerStaticName;
        }

    	// StaticType's available values: 1, 2, 3, 4, 5, 6, 7, 8
        private Integer staticType;

        @ParamAnnotation(paramType = "query", paramName = "static_type")
        public void setStaticType(Integer staticType) {
            this.staticType = staticType;
        }

        @ParamAnnotation(paramType = "query", paramName = "static_type")
        public Integer getStaticType() {
            return this.staticType;
        }

        private String val1;

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public String getVal2() {
            return this.val2;
        }

        private String val3;

        @ParamAnnotation(paramType = "query", paramName = "val3")
        public void setVal3(String val3) {
            this.val3 = val3;
        }

        @ParamAnnotation(paramType = "query", paramName = "val3")
        public String getVal3() {
            return this.val3;
        }

        private String val4;

        @ParamAnnotation(paramType = "query", paramName = "val4")
        public void setVal4(String val4) {
            this.val4 = val4;
        }

        @ParamAnnotation(paramType = "query", paramName = "val4")
        public String getVal4() {
            return this.val4;
        }

        private String val5;

        @ParamAnnotation(paramType = "query", paramName = "val5")
        public void setVal5(String val5) {
            this.val5 = val5;
        }

        @ParamAnnotation(paramType = "query", paramName = "val5")
        public String getVal5() {
            return this.val5;
        }

        private String val6;

        @ParamAnnotation(paramType = "query", paramName = "val6")
        public void setVal6(String val6) {
            this.val6 = val6;
        }

        @ParamAnnotation(paramType = "query", paramName = "val6")
        public String getVal6() {
            return this.val6;
        }

        private String val7;

        @ParamAnnotation(paramType = "query", paramName = "val7")
        public void setVal7(String val7) {
            this.val7 = val7;
        }

        @ParamAnnotation(paramType = "query", paramName = "val7")
        public String getVal7() {
            return this.val7;
        }

        private String val8;

        @ParamAnnotation(paramType = "query", paramName = "val8")
        public void setVal8(String val8) {
            this.val8 = val8;
        }

        @ParamAnnotation(paramType = "query", paramName = "val8")
        public String getVal8() {
            return this.val8;
        }

        private String val9;

        @ParamAnnotation(paramType = "query", paramName = "val9")
        public void setVal9(String val9) {
            this.val9 = val9;
        }

        @ParamAnnotation(paramType = "query", paramName = "val9")
        public String getVal9() {
            return this.val9;
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


        public String validateParam() throws QCException {
            if (this.getEntrySet() != null && this.getEntrySet().size() > 0 ) {
                for (int i = 0 ; i < this.getEntrySet().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[]staticTypeValidValues = {"1", "2", "3", "4", "5", "6", "7", "8"};
            boolean staticTypeIsValid = false;
            for (String v : staticTypeValidValues) {
                if (v.equals(this.getStaticType()+"")) {
                    staticTypeIsValid = true;
                }
                Boolean staticTypeIsRequired = Boolean.FALSE;
                if (staticTypeIsRequired.equals(Boolean.FALSE) && this.getStaticType()==null) {
                    staticTypeIsValid = true;
                }
            }

            if (!staticTypeIsValid) {
                throw new QCException("StaticType value " + this.getStaticType() + "is invalid");
            }
            return null;
        }
    }

    public static class RouterStaticEntryModel implements ParamValidate {
        private String routerID;

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerStaticEntryID;

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_id")
        public void setRouterStaticEntryID(String routerStaticEntryID) {
            this.routerStaticEntryID = routerStaticEntryID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_id")
        public String getRouterStaticEntryID() {
            return this.routerStaticEntryID;
        }

        private String routerStaticEntryName;

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_name")
        public void setRouterStaticEntryName(String routerStaticEntryName) {
            this.routerStaticEntryName = routerStaticEntryName;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_name")
        public String getRouterStaticEntryName() {
            return this.routerStaticEntryName;
        }

        private String routerStaticID;

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String val1;

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RouterStaticEntrySimpleModel implements ParamValidate {
        private String routerStaticEntryID;

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_id")
        public void setRouterStaticEntryID(String routerStaticEntryID) {
            this.routerStaticEntryID = routerStaticEntryID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_static_entry_id")
        public String getRouterStaticEntryID() {
            return this.routerStaticEntryID;
        }

        private String val1;

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RouterVxNetModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String dYNIPEnd;

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @ParamAnnotation(paramType = "query", paramName = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

        private Integer features;

        @ParamAnnotation(paramType = "query", paramName = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @ParamAnnotation(paramType = "query", paramName = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String iPNetwork;

        @ParamAnnotation(paramType = "query", paramName = "ip_network")
        public void setIPNetwork(String iPNetwork) {
            this.iPNetwork = iPNetwork;
        }

        @ParamAnnotation(paramType = "query", paramName = "ip_network")
        public String getIPNetwork() {
            return this.iPNetwork;
        }

        private String managerIP;

        @ParamAnnotation(paramType = "query", paramName = "manager_ip")
        public void setManagerIP(String managerIP) {
            this.managerIP = managerIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "manager_ip")
        public String getManagerIP() {
            return this.managerIP;
        }

        private String routerID;

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "router_id")
        public String getRouterID() {
            return this.routerID;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class S2DefaultParametersModel implements ParamValidate {
        private String defaultValue;

        @ParamAnnotation(paramType = "query", paramName = "default_value")
        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        @ParamAnnotation(paramType = "query", paramName = "default_value")
        public String getDefaultValue() {
            return this.defaultValue;
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

        private String paramName;

        @ParamAnnotation(paramType = "query", paramName = "param_name")
        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        @ParamAnnotation(paramType = "query", paramName = "param_name")
        public String getParamName() {
            return this.paramName;
        }

        private String serviceType;

        @ParamAnnotation(paramType = "query", paramName = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_type")
        public String getServiceType() {
            return this.serviceType;
        }

        private String targetType;

        @ParamAnnotation(paramType = "query", paramName = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "target_type")
        public String getTargetType() {
            return this.targetType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class S2ServerModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private String name;

        @ParamAnnotation(paramType = "query", paramName = "name")
        public void setName(String name) {
            this.name = name;
        }

        @ParamAnnotation(paramType = "query", paramName = "name")
        public String getName() {
            return this.name;
        }

        private String privateIP;

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String s2ServerID;

        @ParamAnnotation(paramType = "query", paramName = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
        }

    	// S2ServerType's available values: 0, 1, 2, 3
        private Integer s2ServerType;

        @ParamAnnotation(paramType = "query", paramName = "s2_server_type")
        public void setS2ServerType(Integer s2ServerType) {
            this.s2ServerType = s2ServerType;
        }

        @ParamAnnotation(paramType = "query", paramName = "s2_server_type")
        public Integer getS2ServerType() {
            return this.s2ServerType;
        }

    	// ServiceType's available values: vsan
        private String serviceType;

        @ParamAnnotation(paramType = "query", paramName = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_type")
        public String getServiceType() {
            return this.serviceType;
        }

    	// Status's available values: pending, active, poweroffed, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, updating, suspending, resuming, poweroffing
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet")
        public VxNetModel getVxNet() {
            return this.vxNet;
        }


        public String validateParam() throws QCException {
            String[]isAppliedValidValues = {"0", "1"};
            boolean isAppliedIsValid = false;
            for (String v : isAppliedValidValues) {
                if (v.equals(this.getIsApplied()+"")) {
                    isAppliedIsValid = true;
                }
                Boolean isAppliedIsRequired = Boolean.FALSE;
                if (isAppliedIsRequired.equals(Boolean.FALSE) && this.getIsApplied()==null) {
                    isAppliedIsValid = true;
                }
            }

            if (!isAppliedIsValid) {
                throw new QCException("IsApplied value " + this.getIsApplied() + "is invalid");
            }
            String[]s2ServerTypeValidValues = {"0", "1", "2", "3"};
            boolean s2ServerTypeIsValid = false;
            for (String v : s2ServerTypeValidValues) {
                if (v.equals(this.getS2ServerType()+"")) {
                    s2ServerTypeIsValid = true;
                }
                Boolean s2ServerTypeIsRequired = Boolean.FALSE;
                if (s2ServerTypeIsRequired.equals(Boolean.FALSE) && this.getS2ServerType()==null) {
                    s2ServerTypeIsValid = true;
                }
            }

            if (!s2ServerTypeIsValid) {
                throw new QCException("S2ServerType value " + this.getS2ServerType() + "is invalid");
            }
            String[] serviceTypeValidValues = {
                "vsan"
            };

            boolean serviceTypeIsValid = false;
            for (String v : serviceTypeValidValues) {
                if (v.equals(this.getServiceType())) {
                    serviceTypeIsValid = true;
                }
                Boolean serviceTypeIsRequired = Boolean.FALSE;
                if (serviceTypeIsRequired.equals(Boolean.FALSE) && this.getServiceType() == null) {
                    serviceTypeIsValid = true;
                }
            }

            if (!serviceTypeIsValid) {
                throw new QCException("ServiceType value " + this.getServiceType() + "is invalid");
            }
            String[] statusValidValues = {
                "pending", "active", "poweroffed", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "updating", "suspending", "resuming", "poweroffing"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class S2SharedTargetModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String exportName;

        @ParamAnnotation(paramType = "query", paramName = "export_name")
        public void setExportName(String exportName) {
            this.exportName = exportName;
        }

        @ParamAnnotation(paramType = "query", paramName = "export_name")
        public String getExportName() {
            return this.exportName;
        }

        private String s2ServerID;

        @ParamAnnotation(paramType = "query", paramName = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @ParamAnnotation(paramType = "query", paramName = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
        }

        private String s2SharedTargetID;

        @ParamAnnotation(paramType = "query", paramName = "s2_shared_target_id")
        public void setS2SharedTargetID(String s2SharedTargetID) {
            this.s2SharedTargetID = s2SharedTargetID;
        }

        @ParamAnnotation(paramType = "query", paramName = "s2_shared_target_id")
        public String getS2SharedTargetID() {
            return this.s2SharedTargetID;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

    	// TargetType's available values: ISCSI, NFS
        private String targetType;

        @ParamAnnotation(paramType = "query", paramName = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "target_type")
        public String getTargetType() {
            return this.targetType;
        }


        public String validateParam() throws QCException {
            String[] targetTypeValidValues = {
                "ISCSI", "NFS"
            };

            boolean targetTypeIsValid = false;
            for (String v : targetTypeValidValues) {
                if (v.equals(this.getTargetType())) {
                    targetTypeIsValid = true;
                }
                Boolean targetTypeIsRequired = Boolean.FALSE;
                if (targetTypeIsRequired.equals(Boolean.FALSE) && this.getTargetType() == null) {
                    targetTypeIsValid = true;
                }
            }

            if (!targetTypeIsValid) {
                throw new QCException("TargetType value " + this.getTargetType() + "is invalid");
            }
            return null;
        }
    }

    public static class SecurityGroupModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private Integer isApplied;

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private Integer isDefault;

        @ParamAnnotation(paramType = "query", paramName = "is_default")
        public void setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_default")
        public Integer getIsDefault() {
            return this.isDefault;
        }

        private List<ResourceModel> resources;

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public void setResources(List<ResourceModel> resources) {
            this.resources = resources;
        }

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public List<ResourceModel> getResources() {
            return this.resources;
        }

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupName;

        @ParamAnnotation(paramType = "query", paramName = "security_group_name")
        public void setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_name")
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }


        public String validateParam() throws QCException {
            if (this.getResources() != null && this.getResources().size() > 0 ) {
                for (int i = 0 ; i < this.getResources().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class SecurityGroupIPSetModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IPSetType's available values: 0, 1
        private Integer iPSetType;

        @ParamAnnotation(paramType = "query", paramName = "ipset_type")
        public void setIPSetType(Integer iPSetType) {
            this.iPSetType = iPSetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "ipset_type")
        public Integer getIPSetType() {
            return this.iPSetType;
        }

        private String securityGroupIPSetID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_ipset_id")
        public void setSecurityGroupIPSetID(String securityGroupIPSetID) {
            this.securityGroupIPSetID = securityGroupIPSetID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_ipset_id")
        public String getSecurityGroupIPSetID() {
            return this.securityGroupIPSetID;
        }

        private String securityGroupIPSetName;

        @ParamAnnotation(paramType = "query", paramName = "security_group_ipset_name")
        public void setSecurityGroupIPSetName(String securityGroupIPSetName) {
            this.securityGroupIPSetName = securityGroupIPSetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_ipset_name")
        public String getSecurityGroupIPSetName() {
            return this.securityGroupIPSetName;
        }

        private String val;

        @ParamAnnotation(paramType = "query", paramName = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @ParamAnnotation(paramType = "query", paramName = "val")
        public String getVal() {
            return this.val;
        }


        public String validateParam() throws QCException {
            String[]iPSetTypeValidValues = {"0", "1"};
            boolean iPSetTypeIsValid = false;
            for (String v : iPSetTypeValidValues) {
                if (v.equals(this.getIPSetType()+"")) {
                    iPSetTypeIsValid = true;
                }
                Boolean iPSetTypeIsRequired = Boolean.FALSE;
                if (iPSetTypeIsRequired.equals(Boolean.FALSE) && this.getIPSetType()==null) {
                    iPSetTypeIsValid = true;
                }
            }

            if (!iPSetTypeIsValid) {
                throw new QCException("IPSetType value " + this.getIPSetType() + "is invalid");
            }
            return null;
        }
    }

    public static class SecurityGroupRuleModel implements ParamValidate {
    	// Action's available values: accept, drop
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

    	// Direction's available values: 0, 1
        private Integer direction;

        @ParamAnnotation(paramType = "query", paramName = "direction")
        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        @ParamAnnotation(paramType = "query", paramName = "direction")
        public Integer getDirection() {
            return this.direction;
        }

        private Integer priority;

        @ParamAnnotation(paramType = "query", paramName = "priority")
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        @ParamAnnotation(paramType = "query", paramName = "priority")
        public Integer getPriority() {
            return this.priority;
        }

        private String protocol;

        @ParamAnnotation(paramType = "query", paramName = "protocol")
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        @ParamAnnotation(paramType = "query", paramName = "protocol")
        public String getProtocol() {
            return this.protocol;
        }

        private String securityGroupID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupRuleID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_rule_id")
        public void setSecurityGroupRuleID(String securityGroupRuleID) {
            this.securityGroupRuleID = securityGroupRuleID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_rule_id")
        public String getSecurityGroupRuleID() {
            return this.securityGroupRuleID;
        }

        private String securityGroupRuleName;

        @ParamAnnotation(paramType = "query", paramName = "security_group_rule_name")
        public void setSecurityGroupRuleName(String securityGroupRuleName) {
            this.securityGroupRuleName = securityGroupRuleName;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_rule_name")
        public String getSecurityGroupRuleName() {
            return this.securityGroupRuleName;
        }

        private String val1;

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @ParamAnnotation(paramType = "query", paramName = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @ParamAnnotation(paramType = "query", paramName = "val2")
        public String getVal2() {
            return this.val2;
        }

        private String val3;

        @ParamAnnotation(paramType = "query", paramName = "val3")
        public void setVal3(String val3) {
            this.val3 = val3;
        }

        @ParamAnnotation(paramType = "query", paramName = "val3")
        public String getVal3() {
            return this.val3;
        }


        public String validateParam() throws QCException {
            String[] actionValidValues = {
                "accept", "drop"
            };

            boolean actionIsValid = false;
            for (String v : actionValidValues) {
                if (v.equals(this.getAction())) {
                    actionIsValid = true;
                }
                Boolean actionIsRequired = Boolean.FALSE;
                if (actionIsRequired.equals(Boolean.FALSE) && this.getAction() == null) {
                    actionIsValid = true;
                }
            }

            if (!actionIsValid) {
                throw new QCException("Action value " + this.getAction() + "is invalid");
            }
            String[]directionValidValues = {"0", "1"};
            boolean directionIsValid = false;
            for (String v : directionValidValues) {
                if (v.equals(this.getDirection()+"")) {
                    directionIsValid = true;
                }
                Boolean directionIsRequired = Boolean.FALSE;
                if (directionIsRequired.equals(Boolean.FALSE) && this.getDirection()==null) {
                    directionIsValid = true;
                }
            }

            if (!directionIsValid) {
                throw new QCException("Direction value " + this.getDirection() + "is invalid");
            }
            return null;
        }
    }

    public static class SecurityGroupSnapshotModel implements ParamValidate {
        private String groupID;

        @ParamAnnotation(paramType = "query", paramName = "group_id")
        public void setGroupID(String groupID) {
            this.groupID = groupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "group_id")
        public String getGroupID() {
            return this.groupID;
        }

        private List<SecurityGroupRuleModel> rules;

        @ParamAnnotation(paramType = "query", paramName = "rules")
        public void setRules(List<SecurityGroupRuleModel> rules) {
            this.rules = rules;
        }

        @ParamAnnotation(paramType = "query", paramName = "rules")
        public List<SecurityGroupRuleModel> getRules() {
            return this.rules;
        }

        private String securityGroupSnapshotID;

        @ParamAnnotation(paramType = "query", paramName = "security_group_snapshot_id")
        public void setSecurityGroupSnapshotID(String securityGroupSnapshotID) {
            this.securityGroupSnapshotID = securityGroupSnapshotID;
        }

        @ParamAnnotation(paramType = "query", paramName = "security_group_snapshot_id")
        public String getSecurityGroupSnapshotID() {
            return this.securityGroupSnapshotID;
        }


        public String validateParam() throws QCException {
            if (this.getRules() != null && this.getRules().size() > 0 ) {
                for (int i = 0 ; i < this.getRules().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class ServerCertificateModel implements ParamValidate {
        private String certificateContent;

        @ParamAnnotation(paramType = "query", paramName = "certificate_content")
        public void setCertificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
        }

        @ParamAnnotation(paramType = "query", paramName = "certificate_content")
        public String getCertificateContent() {
            return this.certificateContent;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String privateKey;

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
        }

        private String serverCertificateID;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String serverCertificateName;

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @ParamAnnotation(paramType = "query", paramName = "server_certificate_name")
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class SnapshotModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private Integer headChain;

        @ParamAnnotation(paramType = "query", paramName = "head_chain")
        public void setHeadChain(Integer headChain) {
            this.headChain = headChain;
        }

        @ParamAnnotation(paramType = "query", paramName = "head_chain")
        public Integer getHeadChain() {
            return this.headChain;
        }

    	// IsHead's available values: 0, 1
        private Integer isHead;

        @ParamAnnotation(paramType = "query", paramName = "is_head")
        public void setIsHead(Integer isHead) {
            this.isHead = isHead;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_head")
        public Integer getIsHead() {
            return this.isHead;
        }

    	// IsTaken's available values: 0, 1
        private Integer isTaken;

        @ParamAnnotation(paramType = "query", paramName = "is_taken")
        public void setIsTaken(Integer isTaken) {
            this.isTaken = isTaken;
        }

        @ParamAnnotation(paramType = "query", paramName = "is_taken")
        public Integer getIsTaken() {
            return this.isTaken;
        }

        private String latestSnapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String parentID;

        @ParamAnnotation(paramType = "query", paramName = "parent_id")
        public void setParentID(String parentID) {
            this.parentID = parentID;
        }

        @ParamAnnotation(paramType = "query", paramName = "parent_id")
        public String getParentID() {
            return this.parentID;
        }

        private String provider;

        @ParamAnnotation(paramType = "query", paramName = "provider")
        public void setProvider(String provider) {
            this.provider = provider;
        }

        @ParamAnnotation(paramType = "query", paramName = "provider")
        public String getProvider() {
            return this.provider;
        }

        private ResourceModel resource;

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public void setResource(ResourceModel resource) {
            this.resource = resource;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public ResourceModel getResource() {
            return this.resource;
        }

        private String rootID;

        @ParamAnnotation(paramType = "query", paramName = "root_id")
        public void setRootID(String rootID) {
            this.rootID = rootID;
        }

        @ParamAnnotation(paramType = "query", paramName = "root_id")
        public String getRootID() {
            return this.rootID;
        }

        private Integer size;

        @ParamAnnotation(paramType = "query", paramName = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @ParamAnnotation(paramType = "query", paramName = "size")
        public Integer getSize() {
            return this.size;
        }

        private String snapshotID;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_id")
        public void setSnapshotID(String snapshotID) {
            this.snapshotID = snapshotID;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_id")
        public String getSnapshotID() {
            return this.snapshotID;
        }

        private String snapshotName;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_name")
        public void setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_name")
        public String getSnapshotName() {
            return this.snapshotName;
        }

        private SnapshotResourceModel snapshotResource;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_resource")
        public void setSnapshotResource(SnapshotResourceModel snapshotResource) {
            this.snapshotResource = snapshotResource;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_resource")
        public SnapshotResourceModel getSnapshotResource() {
            return this.snapshotResource;
        }

        private String snapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_time")
        public void setSnapshotTime(String snapshotTime) {
            this.snapshotTime = snapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_time")
        public String getSnapshotTime() {
            return this.snapshotTime;
        }

    	// SnapshotType's available values: 0, 1
        private Integer snapshotType;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_type")
        public void setSnapshotType(Integer snapshotType) {
            this.snapshotType = snapshotType;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_type")
        public Integer getSnapshotType() {
            return this.snapshotType;
        }

    	// Status's available values: pending, available, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
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

        private Integer totalSize;

        @ParamAnnotation(paramType = "query", paramName = "total_size")
        public void setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "total_size")
        public Integer getTotalSize() {
            return this.totalSize;
        }

    	// TransitionStatus's available values: creating, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer virtualSize;

        @ParamAnnotation(paramType = "query", paramName = "virtual_size")
        public void setVirtualSize(Integer virtualSize) {
            this.virtualSize = virtualSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "virtual_size")
        public Integer getVirtualSize() {
            return this.virtualSize;
        }

        private String visibility;

        @ParamAnnotation(paramType = "query", paramName = "visibility")
        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        @ParamAnnotation(paramType = "query", paramName = "visibility")
        public String getVisibility() {
            return this.visibility;
        }


        public String validateParam() throws QCException {
            String[]isHeadValidValues = {"0", "1"};
            boolean isHeadIsValid = false;
            for (String v : isHeadValidValues) {
                if (v.equals(this.getIsHead()+"")) {
                    isHeadIsValid = true;
                }
                Boolean isHeadIsRequired = Boolean.FALSE;
                if (isHeadIsRequired.equals(Boolean.FALSE) && this.getIsHead()==null) {
                    isHeadIsValid = true;
                }
            }

            if (!isHeadIsValid) {
                throw new QCException("IsHead value " + this.getIsHead() + "is invalid");
            }
            String[]isTakenValidValues = {"0", "1"};
            boolean isTakenIsValid = false;
            for (String v : isTakenValidValues) {
                if (v.equals(this.getIsTaken()+"")) {
                    isTakenIsValid = true;
                }
                Boolean isTakenIsRequired = Boolean.FALSE;
                if (isTakenIsRequired.equals(Boolean.FALSE) && this.getIsTaken()==null) {
                    isTakenIsValid = true;
                }
            }

            if (!isTakenIsValid) {
                throw new QCException("IsTaken value " + this.getIsTaken() + "is invalid");
            }
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
            String[] statusValidValues = {
                "pending", "available", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "suspending", "resuming", "deleting", "recovering"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            return null;
        }
    }

    public static class SnapshotResourceModel implements ParamValidate {
        private String oSFamily;

        @ParamAnnotation(paramType = "query", paramName = "os_family")
        public void setOSFamily(String oSFamily) {
            this.oSFamily = oSFamily;
        }

        @ParamAnnotation(paramType = "query", paramName = "os_family")
        public String getOSFamily() {
            return this.oSFamily;
        }

        private String platform;

        @ParamAnnotation(paramType = "query", paramName = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @ParamAnnotation(paramType = "query", paramName = "platform")
        public String getPlatform() {
            return this.platform;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class TagModel implements ParamValidate {
        private String color;

        @ParamAnnotation(paramType = "query", paramName = "color")
        public void setColor(String color) {
            this.color = color;
        }

        @ParamAnnotation(paramType = "query", paramName = "color")
        public String getColor() {
            return this.color;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private Integer resourceCount;

        @ParamAnnotation(paramType = "query", paramName = "resource_count")
        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_count")
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        private List<ResourceTagPairModel> resourceTagPairs;

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public void setResourceTagPairs(List<ResourceTagPairModel> resourceTagPairs) {
            this.resourceTagPairs = resourceTagPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_tag_pairs")
        public List<ResourceTagPairModel> getResourceTagPairs() {
            return this.resourceTagPairs;
        }

        private List<ResourceTypeCountModel> resourceTypeCount;

        @ParamAnnotation(paramType = "query", paramName = "resource_type_count")
        public void setResourceTypeCount(List<ResourceTypeCountModel> resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_type_count")
        public List<ResourceTypeCountModel> getResourceTypeCount() {
            return this.resourceTypeCount;
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

        private String tagKey;

        @ParamAnnotation(paramType = "query", paramName = "tag_key")
        public void setTagKey(String tagKey) {
            this.tagKey = tagKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "tag_key")
        public String getTagKey() {
            return this.tagKey;
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
            if (this.getResourceTagPairs() != null && this.getResourceTagPairs().size() > 0 ) {
                for (int i = 0 ; i < this.getResourceTagPairs().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (this.getResourceTypeCount() != null && this.getResourceTypeCount().size() > 0 ) {
                for (int i = 0 ; i < this.getResourceTypeCount().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            return null;
        }
    }

    public static class UserModel implements ParamValidate {
        private String email;

        @ParamAnnotation(paramType = "query", paramName = "email")
        public void setEmail(String email) {
            this.email = email;
        }

        @ParamAnnotation(paramType = "query", paramName = "email")
        public String getEmail() {
            return this.email;
        }

        private String userID;

        @ParamAnnotation(paramType = "query", paramName = "user_id")
        public void setUserID(String userID) {
            this.userID = userID;
        }

        @ParamAnnotation(paramType = "query", paramName = "user_id")
        public String getUserID() {
            return this.userID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class VolumeModel implements ParamValidate {
        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String device;

        @ParamAnnotation(paramType = "query", paramName = "device")
        public void setDevice(String device) {
            this.device = device;
        }

        @ParamAnnotation(paramType = "query", paramName = "device")
        public String getDevice() {
            return this.device;
        }

        private InstanceModel instance;

        @ParamAnnotation(paramType = "query", paramName = "instance")
        public void setInstance(InstanceModel instance) {
            this.instance = instance;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance")
        public InstanceModel getInstance() {
            return this.instance;
        }

        private List<InstanceModel> instances;

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<InstanceModel> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<InstanceModel> getInstances() {
            return this.instances;
        }

        private String latestSnapshotTime;

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String placeGroupID;

        @ParamAnnotation(paramType = "query", paramName = "place_group_id")
        public void setPlaceGroupID(String placeGroupID) {
            this.placeGroupID = placeGroupID;
        }

        @ParamAnnotation(paramType = "query", paramName = "place_group_id")
        public String getPlaceGroupID() {
            return this.placeGroupID;
        }

        private Integer size;

        @ParamAnnotation(paramType = "query", paramName = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @ParamAnnotation(paramType = "query", paramName = "size")
        public Integer getSize() {
            return this.size;
        }

    	// Status's available values: pending, available, in-use, suspended, deleted, ceased
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, attaching, detaching, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private String volumeID;

        @ParamAnnotation(paramType = "query", paramName = "volume_id")
        public void setVolumeID(String volumeID) {
            this.volumeID = volumeID;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_id")
        public String getVolumeID() {
            return this.volumeID;
        }

        private String volumeName;

        @ParamAnnotation(paramType = "query", paramName = "volume_name")
        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_name")
        public String getVolumeName() {
            return this.volumeName;
        }

    	// VolumeType's available values: 0, 1, 2, 3
        private Integer volumeType;

        @ParamAnnotation(paramType = "query", paramName = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @ParamAnnotation(paramType = "query", paramName = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
        }


        public String validateParam() throws QCException {
            if (this.getInstances() != null && this.getInstances().size() > 0 ) {
                for (int i = 0 ; i < this.getInstances().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] statusValidValues = {
                "pending", "available", "in-use", "suspended", "deleted", "ceased"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[] transitionStatusValidValues = {
                "creating", "attaching", "detaching", "suspending", "resuming", "deleting", "recovering"
            };

            boolean transitionStatusIsValid = false;
            for (String v : transitionStatusValidValues) {
                if (v.equals(this.getTransitionStatus())) {
                    transitionStatusIsValid = true;
                }
                Boolean transitionStatusIsRequired = Boolean.FALSE;
                if (transitionStatusIsRequired.equals(Boolean.FALSE) && this.getTransitionStatus() == null) {
                    transitionStatusIsValid = true;
                }
            }

            if (!transitionStatusIsValid) {
                throw new QCException("TransitionStatus value " + this.getTransitionStatus() + "is invalid");
            }
            String[]volumeTypeValidValues = {"0", "1", "2", "3"};
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

    public static class VxNetModel implements ParamValidate {
        private Integer availableIPCount;

        @ParamAnnotation(paramType = "query", paramName = "available_ip_count")
        public void setAvailableIPCount(Integer availableIPCount) {
            this.availableIPCount = availableIPCount;
        }

        @ParamAnnotation(paramType = "query", paramName = "available_ip_count")
        public Integer getAvailableIPCount() {
            return this.availableIPCount;
        }

        private String createTime;

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private List<String> instanceIDs;

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
        }

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private RouterModel router;

        @ParamAnnotation(paramType = "query", paramName = "router")
        public void setRouter(RouterModel router) {
            this.router = router;
        }

        @ParamAnnotation(paramType = "query", paramName = "router")
        public RouterModel getRouter() {
            return this.router;
        }

        private List<TagModel> tags;

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @ParamAnnotation(paramType = "query", paramName = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

        private String vpcRouterID;

        @ParamAnnotation(paramType = "query", paramName = "vpc_router_id")
        public void setVpcRouterID(String vpcRouterID) {
            this.vpcRouterID = vpcRouterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "vpc_router_id")
        public String getVpcRouterID() {
            return this.vpcRouterID;
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

        private String vxNetName;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        private Integer vxNetType;

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @ParamAnnotation(paramType = "query", paramName = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }


        public String validateParam() throws QCException {
            if (this.getTags() != null && this.getTags().size() > 0 ) {
                for (int i = 0 ; i < this.getTags().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            String[]vxNetTypeValidValues = {"0", "1"};
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

    public static class ZoneModel implements ParamValidate {
    	// Status's available values: active, faulty, defunct
        private String status;

        @ParamAnnotation(paramType = "query", paramName = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @ParamAnnotation(paramType = "query", paramName = "status")
        public String getStatus() {
            return this.status;
        }

        private String zoneID;

        @ParamAnnotation(paramType = "query", paramName = "zone_id")
        public void setZoneID(String zoneID) {
            this.zoneID = zoneID;
        }

        @ParamAnnotation(paramType = "query", paramName = "zone_id")
        public String getZoneID() {
            return this.zoneID;
        }


        public String validateParam() throws QCException {
            String[] statusValidValues = {
                "active", "faulty", "defunct"
            };

            boolean statusIsValid = false;
            for (String v : statusValidValues) {
                if (v.equals(this.getStatus())) {
                    statusIsValid = true;
                }
                Boolean statusIsRequired = Boolean.FALSE;
                if (statusIsRequired.equals(Boolean.FALSE) && this.getStatus() == null) {
                    statusIsValid = true;
                }
            }

            if (!statusIsValid) {
                throw new QCException("Status value " + this.getStatus() + "is invalid");
            }
            return null;
        }
    }

}



















