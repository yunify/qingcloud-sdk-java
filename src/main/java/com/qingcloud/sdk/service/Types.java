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
import com.qingcloud.sdk.utils.QCStringUtil;
import com.qingcloud.sdk.request.ParamValidate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

public class Types {

    public class Model {}


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AppModel implements ParamValidate {
        private String abstraction;

        @JsonProperty(value = "abstraction")
        public void setAbstraction(String abstraction) {
            this.abstraction = abstraction;
        }

        @JsonProperty(value = "abstraction")
        public String getAbstraction() {
            return this.abstraction;
        }

        private String appContractStatus;

        @JsonProperty(value = "app_contract_status")
        public void setAppContractStatus(String appContractStatus) {
            this.appContractStatus = appContractStatus;
        }

        @JsonProperty(value = "app_contract_status")
        public String getAppContractStatus() {
            return this.appContractStatus;
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

        private String appInstanceID;

        @JsonProperty(value = "app_instance_id")
        public void setAppInstanceID(String appInstanceID) {
            this.appInstanceID = appInstanceID;
        }

        @JsonProperty(value = "app_instance_id")
        public String getAppInstanceID() {
            return this.appInstanceID;
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

        private String appType;

        @JsonProperty(value = "app_type")
        public void setAppType(String appType) {
            this.appType = appType;
        }

        @JsonProperty(value = "app_type")
        public String getAppType() {
            return this.appType;
        }

        private Integer authLevel;

        @JsonProperty(value = "auth_level")
        public void setAuthLevel(Integer authLevel) {
            this.authLevel = authLevel;
        }

        @JsonProperty(value = "auth_level")
        public Integer getAuthLevel() {
            return this.authLevel;
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

        private String companyURL;

        @JsonProperty(value = "company_url")
        public void setCompanyURL(String companyURL) {
            this.companyURL = companyURL;
        }

        @JsonProperty(value = "company_url")
        public String getCompanyURL() {
            return this.companyURL;
        }

        private String contact;

        @JsonProperty(value = "contact")
        public void setContact(String contact) {
            this.contact = contact;
        }

        @JsonProperty(value = "contact")
        public String getContact() {
            return this.contact;
        }

        private String coverImg;

        @JsonProperty(value = "cover_img")
        public void setCoverImg(String coverImg) {
            this.coverImg = coverImg;
        }

        @JsonProperty(value = "cover_img")
        public String getCoverImg() {
            return this.coverImg;
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

        private String icon;

        @JsonProperty(value = "icon")
        public void setIcon(String icon) {
            this.icon = icon;
        }

        @JsonProperty(value = "icon")
        public String getIcon() {
            return this.icon;
        }

        private List<String> screenshots;

        @JsonProperty(value = "screenshots")
        public void setScreenshots(List<String> screenshots) {
            this.screenshots = screenshots;
        }

        @JsonProperty(value = "screenshots")
        public List<String> getScreenshots() {
            return this.screenshots;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
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

        private String termsOfService;

        @JsonProperty(value = "terms_of_service")
        public void setTermsOfService(String termsOfService) {
            this.termsOfService = termsOfService;
        }

        @JsonProperty(value = "terms_of_service")
        public String getTermsOfService() {
            return this.termsOfService;
        }

        private String termsOfServiceLink;

        @JsonProperty(value = "terms_of_service_link")
        public void setTermsOfServiceLink(String termsOfServiceLink) {
            this.termsOfServiceLink = termsOfServiceLink;
        }

        @JsonProperty(value = "terms_of_service_link")
        public String getTermsOfServiceLink() {
            return this.termsOfServiceLink;
        }

        private String uRL;

        @JsonProperty(value = "url")
        public void setURL(String uRL) {
            this.uRL = uRL;
        }

        @JsonProperty(value = "url")
        public String getURL() {
            return this.uRL;
        }

        private String usageInstructions;

        @JsonProperty(value = "usage_instructions")
        public void setUsageInstructions(String usageInstructions) {
            this.usageInstructions = usageInstructions;
        }

        @JsonProperty(value = "usage_instructions")
        public String getUsageInstructions() {
            return this.usageInstructions;
        }

        private String usageInstructionsLink;

        @JsonProperty(value = "usage_instructions_link")
        public void setUsageInstructionsLink(String usageInstructionsLink) {
            this.usageInstructionsLink = usageInstructionsLink;
        }

        @JsonProperty(value = "usage_instructions_link")
        public String getUsageInstructionsLink() {
            return this.usageInstructionsLink;
        }

        private String visibility;

        @JsonProperty(value = "visibility")
        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        @JsonProperty(value = "visibility")
        public String getVisibility() {
            return this.visibility;
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
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AppVersionModel implements ParamValidate {
        private String appID;

        @JsonProperty(value = "app_id")
        public void setAppID(String appID) {
            this.appID = appID;
        }

        @JsonProperty(value = "app_id")
        public String getAppID() {
            return this.appID;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String name;

        @JsonProperty(value = "name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value = "name")
        public String getName() {
            return this.name;
        }

        private String resourceKit;

        @JsonProperty(value = "resource_kit")
        public void setResourceKit(String resourceKit) {
            this.resourceKit = resourceKit;
        }

        @JsonProperty(value = "resource_kit")
        public String getResourceKit() {
            return this.resourceKit;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
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
    public static class AppVersionAttachmentModel implements ParamValidate {
        private String attachmentID;

        @JsonProperty(value = "attachment_id")
        public void setAttachmentID(String attachmentID) {
            this.attachmentID = attachmentID;
        }

        @JsonProperty(value = "attachment_id")
        public String getAttachmentID() {
            return this.attachmentID;
        }

        private String attachmentType;

        @JsonProperty(value = "attachment_type")
        public void setAttachmentType(String attachmentType) {
            this.attachmentType = attachmentType;
        }

        @JsonProperty(value = "attachment_type")
        public String getAttachmentType() {
            return this.attachmentType;
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

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String filename;

        @JsonProperty(value = "filename")
        public void setFilename(String filename) {
            this.filename = filename;
        }

        @JsonProperty(value = "filename")
        public String getFilename() {
            return this.filename;
        }

        private Integer filesize;

        @JsonProperty(value = "filesize")
        public void setFilesize(Integer filesize) {
            this.filesize = filesize;
        }

        @JsonProperty(value = "filesize")
        public Integer getFilesize() {
            return this.filesize;
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

        private String owner;

        @JsonProperty(value = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @JsonProperty(value = "owner")
        public String getOwner() {
            return this.owner;
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

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private String subCategory;

        @JsonProperty(value = "sub_category")
        public void setSubCategory(String subCategory) {
            this.subCategory = subCategory;
        }

        @JsonProperty(value = "sub_category")
        public String getSubCategory() {
            return this.subCategory;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CacheModel implements ParamValidate {
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

        private String cacheID;

        @JsonProperty(value = "cache_id")
        public void setCacheID(String cacheID) {
            this.cacheID = cacheID;
        }

        @JsonProperty(value = "cache_id")
        public String getCacheID() {
            return this.cacheID;
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

        private String cacheParameterGroupID;

        @JsonProperty(value = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @JsonProperty(value = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
        }

        private Integer cachePort;

        @JsonProperty(value = "cache_port")
        public void setCachePort(Integer cachePort) {
            this.cachePort = cachePort;
        }

        @JsonProperty(value = "cache_port")
        public Integer getCachePort() {
            return this.cachePort;
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

    	// CacheType's available values: Redis2.8.17, Memcached1.4.13
        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private String cacheVersion;

        @JsonProperty(value = "cache_version")
        public void setCacheVersion(String cacheVersion) {
            this.cacheVersion = cacheVersion;
        }

        @JsonProperty(value = "cache_version")
        public String getCacheVersion() {
            return this.cacheVersion;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
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

        private Integer maxMemory;

        @JsonProperty(value = "max_memory")
        public void setMaxMemory(Integer maxMemory) {
            this.maxMemory = maxMemory;
        }

        @JsonProperty(value = "max_memory")
        public Integer getMaxMemory() {
            return this.maxMemory;
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

        private List<CacheNodeModel> nodes;

        @JsonProperty(value = "nodes")
        public void setNodes(List<CacheNodeModel> nodes) {
            this.nodes = nodes;
        }

        @JsonProperty(value = "nodes")
        public List<CacheNodeModel> getNodes() {
            return this.nodes;
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

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, stopped, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CacheNodeModel implements ParamValidate {
        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
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

        private String cacheNodeID;

        @JsonProperty(value = "cache_node_id")
        public void setCacheNodeID(String cacheNodeID) {
            this.cacheNodeID = cacheNodeID;
        }

        @JsonProperty(value = "cache_node_id")
        public String getCacheNodeID() {
            return this.cacheNodeID;
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

    	// CacheRole's available values: master, slave
        private String cacheRole;

        @JsonProperty(value = "cache_role")
        public void setCacheRole(String cacheRole) {
            this.cacheRole = cacheRole;
        }

        @JsonProperty(value = "cache_role")
        public String getCacheRole() {
            return this.cacheRole;
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

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String slaveof;

        @JsonProperty(value = "slaveof")
        public void setSlaveof(String slaveof) {
            this.slaveof = slaveof;
        }

        @JsonProperty(value = "slaveof")
        public String getSlaveof() {
            return this.slaveof;
        }

    	// Status's available values: pending, active, down, suspended
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CacheParameterModel implements ParamValidate {
        // Required
        private String cacheParameterName;

        @JsonProperty(value = "cache_parameter_name")
        public void setCacheParameterName(String cacheParameterName) {
            this.cacheParameterName = cacheParameterName;
        }

        @JsonProperty(value = "cache_parameter_name")
        public String getCacheParameterName() {
            return this.cacheParameterName;
        }

        private String cacheParameterType;

        @JsonProperty(value = "cache_parameter_type")
        public void setCacheParameterType(String cacheParameterType) {
            this.cacheParameterType = cacheParameterType;
        }

        @JsonProperty(value = "cache_parameter_type")
        public String getCacheParameterType() {
            return this.cacheParameterType;
        }

        // Required
        private String cacheParameterValue;

        @JsonProperty(value = "cache_parameter_value")
        public void setCacheParameterValue(String cacheParameterValue) {
            this.cacheParameterValue = cacheParameterValue;
        }

        @JsonProperty(value = "cache_parameter_value")
        public String getCacheParameterValue() {
            return this.cacheParameterValue;
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

    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @JsonProperty(value = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @JsonProperty(value = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

        private Integer isStatic;

        @JsonProperty(value = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @JsonProperty(value = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private String oPTName;

        @JsonProperty(value = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @JsonProperty(value = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String parameterType;

        @JsonProperty(value = "parameter_type")
        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }

        @JsonProperty(value = "parameter_type")
        public String getParameterType() {
            return this.parameterType;
        }

        private String resourceVersion;

        @JsonProperty(value = "resource_version")
        public void setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
        }

        @JsonProperty(value = "resource_version")
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        private String valueRange;

        @JsonProperty(value = "value_range")
        public void setValueRange(String valueRange) {
            this.valueRange = valueRange;
        }

        @JsonProperty(value = "value_range")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CacheParameterGroupModel implements ParamValidate {
        private String cacheParameterGroupID;

        @JsonProperty(value = "cache_parameter_group_id")
        public void setCacheParameterGroupID(String cacheParameterGroupID) {
            this.cacheParameterGroupID = cacheParameterGroupID;
        }

        @JsonProperty(value = "cache_parameter_group_id")
        public String getCacheParameterGroupID() {
            return this.cacheParameterGroupID;
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

        private String cacheType;

        @JsonProperty(value = "cache_type")
        public void setCacheType(String cacheType) {
            this.cacheType = cacheType;
        }

        @JsonProperty(value = "cache_type")
        public String getCacheType() {
            return this.cacheType;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private Integer isDefault;

        @JsonProperty(value = "is_default")
        public void setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
        }

        @JsonProperty(value = "is_default")
        public Integer getIsDefault() {
            return this.isDefault;
        }

        private List<ResourceModel> resources;

        @JsonProperty(value = "resources")
        public void setResources(List<ResourceModel> resources) {
            this.resources = resources;
        }

        @JsonProperty(value = "resources")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CachePrivateIPModel implements ParamValidate {
        private String cacheNodeID;

        @JsonProperty(value = "cache_node_id")
        public void setCacheNodeID(String cacheNodeID) {
            this.cacheNodeID = cacheNodeID;
        }

        @JsonProperty(value = "cache_node_id")
        public String getCacheNodeID() {
            return this.cacheNodeID;
        }

    	// CacheRole's available values: master, slave
        private String cacheRole;

        @JsonProperty(value = "cache_role")
        public void setCacheRole(String cacheRole) {
            this.cacheRole = cacheRole;
        }

        @JsonProperty(value = "cache_role")
        public String getCacheRole() {
            return this.cacheRole;
        }

        private String privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(String privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClusterModel implements ParamValidate {
        private Map advancedActions;

        @JsonProperty(value = "advanced_actions")
        public void setAdvancedActions(Map advancedActions) {
            this.advancedActions = advancedActions;
        }

        @JsonProperty(value = "advanced_actions")
        public Map getAdvancedActions() {
            return this.advancedActions;
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

        private Model appInfo;

        @JsonProperty(value = "app_info")
        public void setAppInfo(Model appInfo) {
            this.appInfo = appInfo;
        }

        @JsonProperty(value = "app_info")
        public Model getAppInfo() {
            return this.appInfo;
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

        private Model appVersionInfo;

        @JsonProperty(value = "app_version_info")
        public void setAppVersionInfo(Model appVersionInfo) {
            this.appVersionInfo = appVersionInfo;
        }

        @JsonProperty(value = "app_version_info")
        public Model getAppVersionInfo() {
            return this.appVersionInfo;
        }

        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Map backup;

        @JsonProperty(value = "backup")
        public void setBackup(Map backup) {
            this.backup = backup;
        }

        @JsonProperty(value = "backup")
        public Map getBackup() {
            return this.backup;
        }

        private String backupPolicy;

        @JsonProperty(value = "backup_policy")
        public void setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
        }

        @JsonProperty(value = "backup_policy")
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        private Model backupService;

        @JsonProperty(value = "backup_service")
        public void setBackupService(Model backupService) {
            this.backupService = backupService;
        }

        @JsonProperty(value = "backup_service")
        public Model getBackupService() {
            return this.backupService;
        }

        private String cfgmgmtID;

        @JsonProperty(value = "cfgmgmt_id")
        public void setCfgmgmtID(String cfgmgmtID) {
            this.cfgmgmtID = cfgmgmtID;
        }

        @JsonProperty(value = "cfgmgmt_id")
        public String getCfgmgmtID() {
            return this.cfgmgmtID;
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

        private Integer clusterType;

        @JsonProperty(value = "cluster_type")
        public void setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
        }

        @JsonProperty(value = "cluster_type")
        public Integer getClusterType() {
            return this.clusterType;
        }

        private String consoleID;

        @JsonProperty(value = "console_id")
        public void setConsoleID(String consoleID) {
            this.consoleID = consoleID;
        }

        @JsonProperty(value = "console_id")
        public String getConsoleID() {
            return this.consoleID;
        }

        private String controller;

        @JsonProperty(value = "controller")
        public void setController(String controller) {
            this.controller = controller;
        }

        @JsonProperty(value = "controller")
        public String getController() {
            return this.controller;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Model customService;

        @JsonProperty(value = "custom_service")
        public void setCustomService(Model customService) {
            this.customService = customService;
        }

        @JsonProperty(value = "custom_service")
        public Model getCustomService() {
            return this.customService;
        }

        private Boolean debug;

        @JsonProperty(value = "debug")
        public void setDebug(Boolean debug) {
            this.debug = debug;
        }

        @JsonProperty(value = "debug")
        public Boolean getDebug() {
            return this.debug;
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

        private Model displayTabs;

        @JsonProperty(value = "display_tabs")
        public void setDisplayTabs(Model displayTabs) {
            this.displayTabs = displayTabs;
        }

        @JsonProperty(value = "display_tabs")
        public Model getDisplayTabs() {
            return this.displayTabs;
        }

        private Model endpoints;

        @JsonProperty(value = "endpoints")
        public void setEndpoints(Model endpoints) {
            this.endpoints = endpoints;
        }

        @JsonProperty(value = "endpoints")
        public Model getEndpoints() {
            return this.endpoints;
        }

        private String globalUUID;

        @JsonProperty(value = "global_uuid")
        public void setGlobalUUID(String globalUUID) {
            this.globalUUID = globalUUID;
        }

        @JsonProperty(value = "global_uuid")
        public String getGlobalUUID() {
            return this.globalUUID;
        }

        private Map healthCheckEnablement;

        @JsonProperty(value = "health_check_enablement")
        public void setHealthCheckEnablement(Map healthCheckEnablement) {
            this.healthCheckEnablement = healthCheckEnablement;
        }

        @JsonProperty(value = "health_check_enablement")
        public Map getHealthCheckEnablement() {
            return this.healthCheckEnablement;
        }

        private Boolean incrementalBackupSupported;

        @JsonProperty(value = "incremental_backup_supported")
        public void setIncrementalBackupSupported(Boolean incrementalBackupSupported) {
            this.incrementalBackupSupported = incrementalBackupSupported;
        }

        @JsonProperty(value = "incremental_backup_supported")
        public Boolean getIncrementalBackupSupported() {
            return this.incrementalBackupSupported;
        }

        private String latestSnapshotTime;

        @JsonProperty(value = "lastest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @JsonProperty(value = "lastest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private Map links;

        @JsonProperty(value = "links")
        public void setLinks(Map links) {
            this.links = links;
        }

        @JsonProperty(value = "links")
        public Map getLinks() {
            return this.links;
        }

        private Integer metadataRootAccess;

        @JsonProperty(value = "metadata_root_access")
        public void setMetadataRootAccess(Integer metadataRootAccess) {
            this.metadataRootAccess = metadataRootAccess;
        }

        @JsonProperty(value = "metadata_root_access")
        public Integer getMetadataRootAccess() {
            return this.metadataRootAccess;
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

        private Integer nodeCount;

        @JsonProperty(value = "node_count")
        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        @JsonProperty(value = "node_count")
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        private List<ClusterNodeModel> nodes;

        @JsonProperty(value = "nodes")
        public void setNodes(List<ClusterNodeModel> nodes) {
            this.nodes = nodes;
        }

        @JsonProperty(value = "nodes")
        public List<ClusterNodeModel> getNodes() {
            return this.nodes;
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

        private Boolean partnerAccess;

        @JsonProperty(value = "partner_access")
        public void setPartnerAccess(Boolean partnerAccess) {
            this.partnerAccess = partnerAccess;
        }

        @JsonProperty(value = "partner_access")
        public Boolean getPartnerAccess() {
            return this.partnerAccess;
        }

        private Model restoreService;

        @JsonProperty(value = "restore_service")
        public void setRestoreService(Model restoreService) {
            this.restoreService = restoreService;
        }

        @JsonProperty(value = "restore_service")
        public Model getRestoreService() {
            return this.restoreService;
        }

        private Integer reuseHyper;

        @JsonProperty(value = "reuse_hyper")
        public void setReuseHyper(Integer reuseHyper) {
            this.reuseHyper = reuseHyper;
        }

        @JsonProperty(value = "reuse_hyper")
        public Integer getReuseHyper() {
            return this.reuseHyper;
        }

        private Map roleCount;

        @JsonProperty(value = "role_count")
        public void setRoleCount(Map roleCount) {
            this.roleCount = roleCount;
        }

        @JsonProperty(value = "role_count")
        public Map getRoleCount() {
            return this.roleCount;
        }

        private List<String> roles;

        @JsonProperty(value = "roles")
        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @JsonProperty(value = "roles")
        public List<String> getRoles() {
            return this.roles;
        }

        private String rootUserID;

        @JsonProperty(value = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @JsonProperty(value = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private List<String> upgradePolicy;

        @JsonProperty(value = "upgrade_policy")
        public void setUpgradePolicy(List<String> upgradePolicy) {
            this.upgradePolicy = upgradePolicy;
        }

        @JsonProperty(value = "upgrade_policy")
        public List<String> getUpgradePolicy() {
            return this.upgradePolicy;
        }

        private String upgradeStatus;

        @JsonProperty(value = "upgrade_status")
        public void setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
        }

        @JsonProperty(value = "upgrade_status")
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        private String upgradeTime;

        @JsonProperty(value = "upgrade_time")
        public void setUpgradeTime(String upgradeTime) {
            this.upgradeTime = upgradeTime;
        }

        @JsonProperty(value = "upgrade_time")
        public String getUpgradeTime() {
            return this.upgradeTime;
        }

        private VxNetModel vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClusterNodeModel implements ParamValidate {
        private String advancedActions;

        @JsonProperty(value = "advanced_actions")
        public void setAdvancedActions(String advancedActions) {
            this.advancedActions = advancedActions;
        }

        @JsonProperty(value = "advanced_actions")
        public String getAdvancedActions() {
            return this.advancedActions;
        }

        private Boolean agentInstalled;

        @JsonProperty(value = "agent_installed")
        public void setAgentInstalled(Boolean agentInstalled) {
            this.agentInstalled = agentInstalled;
        }

        @JsonProperty(value = "agent_installed")
        public Boolean getAgentInstalled() {
            return this.agentInstalled;
        }

        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
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

        private Integer autoBackup;

        @JsonProperty(value = "auto_backup")
        public void setAutoBackup(Integer autoBackup) {
            this.autoBackup = autoBackup;
        }

        @JsonProperty(value = "auto_backup")
        public Integer getAutoBackup() {
            return this.autoBackup;
        }

        private String backupPolicy;

        @JsonProperty(value = "backup_policy")
        public void setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
        }

        @JsonProperty(value = "backup_policy")
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        private Model backupService;

        @JsonProperty(value = "backup_service")
        public void setBackupService(Model backupService) {
            this.backupService = backupService;
        }

        @JsonProperty(value = "backup_service")
        public Model getBackupService() {
            return this.backupService;
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

        private String consoleID;

        @JsonProperty(value = "console_id")
        public void setConsoleID(String consoleID) {
            this.consoleID = consoleID;
        }

        @JsonProperty(value = "console_id")
        public String getConsoleID() {
            return this.consoleID;
        }

        private String controller;

        @JsonProperty(value = "controller")
        public void setController(String controller) {
            this.controller = controller;
        }

        @JsonProperty(value = "controller")
        public String getController() {
            return this.controller;
        }

        private Integer cPU;

        @JsonProperty(value = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @JsonProperty(value = "cpu")
        public Integer getCPU() {
            return this.cPU;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Model customMetadataScript;

        @JsonProperty(value = "custom_metadata_script")
        public void setCustomMetadataScript(Model customMetadataScript) {
            this.customMetadataScript = customMetadataScript;
        }

        @JsonProperty(value = "custom_metadata_script")
        public Model getCustomMetadataScript() {
            return this.customMetadataScript;
        }

        private Model customService;

        @JsonProperty(value = "custom_service")
        public void setCustomService(Model customService) {
            this.customService = customService;
        }

        @JsonProperty(value = "custom_service")
        public Model getCustomService() {
            return this.customService;
        }

        private Boolean debug;

        @JsonProperty(value = "debug")
        public void setDebug(Boolean debug) {
            this.debug = debug;
        }

        @JsonProperty(value = "debug")
        public Boolean getDebug() {
            return this.debug;
        }

        private Model destroyService;

        @JsonProperty(value = "destroy_service")
        public void setDestroyService(Model destroyService) {
            this.destroyService = destroyService;
        }

        @JsonProperty(value = "destroy_service")
        public Model getDestroyService() {
            return this.destroyService;
        }

        private Model displayTabs;

        @JsonProperty(value = "display_tabs")
        public void setDisplayTabs(Model displayTabs) {
            this.displayTabs = displayTabs;
        }

        @JsonProperty(value = "display_tabs")
        public Model getDisplayTabs() {
            return this.displayTabs;
        }

        private String eIP;

        @JsonProperty(value = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public String getEIP() {
            return this.eIP;
        }

        private String env;

        @JsonProperty(value = "env")
        public void setEnv(String env) {
            this.env = env;
        }

        @JsonProperty(value = "env")
        public String getEnv() {
            return this.env;
        }

        private Integer globalServerID;

        @JsonProperty(value = "global_server_id")
        public void setGlobalServerID(Integer globalServerID) {
            this.globalServerID = globalServerID;
        }

        @JsonProperty(value = "global_server_id")
        public Integer getGlobalServerID() {
            return this.globalServerID;
        }

        private Integer gpu;

        @JsonProperty(value = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @JsonProperty(value = "gpu")
        public Integer getGpu() {
            return this.gpu;
        }

        private Integer gpuClass;

        @JsonProperty(value = "gpu_class")
        public void setGpuClass(Integer gpuClass) {
            this.gpuClass = gpuClass;
        }

        @JsonProperty(value = "gpu_class")
        public Integer getGpuClass() {
            return this.gpuClass;
        }

        private Integer groupID;

        @JsonProperty(value = "group_id")
        public void setGroupID(Integer groupID) {
            this.groupID = groupID;
        }

        @JsonProperty(value = "group_id")
        public Integer getGroupID() {
            return this.groupID;
        }

        private Model healthCheck;

        @JsonProperty(value = "health_check")
        public void setHealthCheck(Model healthCheck) {
            this.healthCheck = healthCheck;
        }

        @JsonProperty(value = "health_check")
        public Model getHealthCheck() {
            return this.healthCheck;
        }

        private String healthStatus;

        @JsonProperty(value = "health_status")
        public void setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
        }

        @JsonProperty(value = "health_status")
        public String getHealthStatus() {
            return this.healthStatus;
        }

        private String hypervisor;

        @JsonProperty(value = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @JsonProperty(value = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
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

        private Boolean incrementalBackupSupported;

        @JsonProperty(value = "incremental_backup_supported")
        public void setIncrementalBackupSupported(Boolean incrementalBackupSupported) {
            this.incrementalBackupSupported = incrementalBackupSupported;
        }

        @JsonProperty(value = "incremental_backup_supported")
        public Boolean getIncrementalBackupSupported() {
            return this.incrementalBackupSupported;
        }

        private Model initService;

        @JsonProperty(value = "init_service")
        public void setInitService(Model initService) {
            this.initService = initService;
        }

        @JsonProperty(value = "init_service")
        public Model getInitService() {
            return this.initService;
        }

        private String instanceID;

        @JsonProperty(value = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @JsonProperty(value = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private Integer isBackup;

        @JsonProperty(value = "is_backup")
        public void setIsBackup(Integer isBackup) {
            this.isBackup = isBackup;
        }

        @JsonProperty(value = "is_backup")
        public Integer getIsBackup() {
            return this.isBackup;
        }

        private Integer memory;

        @JsonProperty(value = "memory")
        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        @JsonProperty(value = "memory")
        public Integer getMemory() {
            return this.memory;
        }

        private Model monitor;

        @JsonProperty(value = "monitor")
        public void setMonitor(Model monitor) {
            this.monitor = monitor;
        }

        @JsonProperty(value = "monitor")
        public Model getMonitor() {
            return this.monitor;
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

        private String nodeID;

        @JsonProperty(value = "node_id")
        public void setNodeID(String nodeID) {
            this.nodeID = nodeID;
        }

        @JsonProperty(value = "node_id")
        public String getNodeID() {
            return this.nodeID;
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

        private String passphraseless;

        @JsonProperty(value = "passphraseless")
        public void setPassphraseless(String passphraseless) {
            this.passphraseless = passphraseless;
        }

        @JsonProperty(value = "passphraseless")
        public String getPassphraseless() {
            return this.passphraseless;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
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

        private Integer resourceClass;

        @JsonProperty(value = "resource_class")
        public void setResourceClass(Integer resourceClass) {
            this.resourceClass = resourceClass;
        }

        @JsonProperty(value = "resource_class")
        public Integer getResourceClass() {
            return this.resourceClass;
        }

        private Model restartService;

        @JsonProperty(value = "restart_service")
        public void setRestartService(Model restartService) {
            this.restartService = restartService;
        }

        @JsonProperty(value = "restart_service")
        public Model getRestartService() {
            return this.restartService;
        }

        private Model restoreService;

        @JsonProperty(value = "restore_service")
        public void setRestoreService(Model restoreService) {
            this.restoreService = restoreService;
        }

        @JsonProperty(value = "restore_service")
        public Model getRestoreService() {
            return this.restoreService;
        }

        private String role;

        @JsonProperty(value = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public String getRole() {
            return this.role;
        }

        private String rootUserID;

        @JsonProperty(value = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @JsonProperty(value = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private Model scaleInService;

        @JsonProperty(value = "scale_in_service")
        public void setScaleInService(Model scaleInService) {
            this.scaleInService = scaleInService;
        }

        @JsonProperty(value = "scale_in_service")
        public Model getScaleInService() {
            return this.scaleInService;
        }

        private Model scaleOutService;

        @JsonProperty(value = "scale_out_service")
        public void setScaleOutService(Model scaleOutService) {
            this.scaleOutService = scaleOutService;
        }

        @JsonProperty(value = "scale_out_service")
        public Model getScaleOutService() {
            return this.scaleOutService;
        }

        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private Integer serverID;

        @JsonProperty(value = "server_id")
        public void setServerID(Integer serverID) {
            this.serverID = serverID;
        }

        @JsonProperty(value = "server_id")
        public Integer getServerID() {
            return this.serverID;
        }

        private Integer serverIDUpperBound;

        @JsonProperty(value = "server_id_upper_bound")
        public void setServerIDUpperBound(Integer serverIDUpperBound) {
            this.serverIDUpperBound = serverIDUpperBound;
        }

        @JsonProperty(value = "server_id_upper_bound")
        public Integer getServerIDUpperBound() {
            return this.serverIDUpperBound;
        }

        private String singleNodeRepl;

        @JsonProperty(value = "single_node_repl")
        public void setSingleNodeRepl(String singleNodeRepl) {
            this.singleNodeRepl = singleNodeRepl;
        }

        @JsonProperty(value = "single_node_repl")
        public String getSingleNodeRepl() {
            return this.singleNodeRepl;
        }

        private Model startService;

        @JsonProperty(value = "start_service")
        public void setStartService(Model startService) {
            this.startService = startService;
        }

        @JsonProperty(value = "start_service")
        public Model getStartService() {
            return this.startService;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Model stopService;

        @JsonProperty(value = "stop_service")
        public void setStopService(Model stopService) {
            this.stopService = stopService;
        }

        @JsonProperty(value = "stop_service")
        public Model getStopService() {
            return this.stopService;
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

        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer userAccess;

        @JsonProperty(value = "user_access")
        public void setUserAccess(Integer userAccess) {
            this.userAccess = userAccess;
        }

        @JsonProperty(value = "user_access")
        public Integer getUserAccess() {
            return this.userAccess;
        }

        private String verticalScalingPolicy;

        @JsonProperty(value = "vertical_scaling_policy")
        public void setVerticalScalingPolicy(String verticalScalingPolicy) {
            this.verticalScalingPolicy = verticalScalingPolicy;
        }

        @JsonProperty(value = "vertical_scaling_policy")
        public String getVerticalScalingPolicy() {
            return this.verticalScalingPolicy;
        }

        private String volumeIDs;

        @JsonProperty(value = "volume_ids")
        public void setVolumeIDs(String volumeIDs) {
            this.volumeIDs = volumeIDs;
        }

        @JsonProperty(value = "volume_ids")
        public String getVolumeIDs() {
            return this.volumeIDs;
        }

        private Integer volumeType;

        @JsonProperty(value = "volume_type")
        public void setVolumeType(Integer volumeType) {
            this.volumeType = volumeType;
        }

        @JsonProperty(value = "volume_type")
        public Integer getVolumeType() {
            return this.volumeType;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DataModel implements ParamValidate {
        private String data;

        @JsonProperty(value = "data")
        public void setData(String data) {
            this.data = data;
        }

        @JsonProperty(value = "data")
        public String getData() {
            return this.data;
        }

        private String eIPID;

        @JsonProperty(value = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @JsonProperty(value = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DHCPOptionModel implements ParamValidate {
        private String routerStaticID;

        @JsonProperty(value = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @JsonProperty(value = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DNSAliasModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String dNSAliasID;

        @JsonProperty(value = "dns_alias_id")
        public void setDNSAliasID(String dNSAliasID) {
            this.dNSAliasID = dNSAliasID;
        }

        @JsonProperty(value = "dns_alias_id")
        public String getDNSAliasID() {
            return this.dNSAliasID;
        }

        private String dNSAliasName;

        @JsonProperty(value = "dns_alias_name")
        public void setDNSAliasName(String dNSAliasName) {
            this.dNSAliasName = dNSAliasName;
        }

        @JsonProperty(value = "dns_alias_name")
        public String getDNSAliasName() {
            return this.dNSAliasName;
        }

        private String domainName;

        @JsonProperty(value = "domain_name")
        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        @JsonProperty(value = "domain_name")
        public String getDomainName() {
            return this.domainName;
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

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EIPModel implements ParamValidate {
        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer associateMode;

        @JsonProperty(value = "associate_mode")
        public void setAssociateMode(Integer associateMode) {
            this.associateMode = associateMode;
        }

        @JsonProperty(value = "associate_mode")
        public Integer getAssociateMode() {
            return this.associateMode;
        }

        private Integer bandwidth;

        @JsonProperty(value = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @JsonProperty(value = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

    	// BillingMode's available values: bandwidth, traffic
        private String billingMode;

        @JsonProperty(value = "billing_mode")
        public void setBillingMode(String billingMode) {
            this.billingMode = billingMode;
        }

        @JsonProperty(value = "billing_mode")
        public String getBillingMode() {
            return this.billingMode;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String eIPAddr;

        @JsonProperty(value = "eip_addr")
        public void setEIPAddr(String eIPAddr) {
            this.eIPAddr = eIPAddr;
        }

        @JsonProperty(value = "eip_addr")
        public String getEIPAddr() {
            return this.eIPAddr;
        }

        private EIPGroupModel eIPGroup;

        @JsonProperty(value = "eip_group")
        public void setEIPGroup(EIPGroupModel eIPGroup) {
            this.eIPGroup = eIPGroup;
        }

        @JsonProperty(value = "eip_group")
        public EIPGroupModel getEIPGroup() {
            return this.eIPGroup;
        }

        private String eIPID;

        @JsonProperty(value = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @JsonProperty(value = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }

        private String eIPName;

        @JsonProperty(value = "eip_name")
        public void setEIPName(String eIPName) {
            this.eIPName = eIPName;
        }

        @JsonProperty(value = "eip_name")
        public String getEIPName() {
            return this.eIPName;
        }

        private String iCPCodes;

        @JsonProperty(value = "icp_codes")
        public void setICPCodes(String iCPCodes) {
            this.iCPCodes = iCPCodes;
        }

        @JsonProperty(value = "icp_codes")
        public String getICPCodes() {
            return this.iCPCodes;
        }

        private Integer needICP;

        @JsonProperty(value = "need_icp")
        public void setNeedICP(Integer needICP) {
            this.needICP = needICP;
        }

        @JsonProperty(value = "need_icp")
        public Integer getNeedICP() {
            return this.needICP;
        }

        private EIPResourceModel resource;

        @JsonProperty(value = "resource")
        public void setResource(EIPResourceModel resource) {
            this.resource = resource;
        }

        @JsonProperty(value = "resource")
        public EIPResourceModel getResource() {
            return this.resource;
        }

    	// Status's available values: pending, available, associated, suspended, released, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: associating, dissociating, suspending, resuming, releasing
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EIPGroupModel implements ParamValidate {
        private String eIPGroupID;

        @JsonProperty(value = "eip_group_id")
        public void setEIPGroupID(String eIPGroupID) {
            this.eIPGroupID = eIPGroupID;
        }

        @JsonProperty(value = "eip_group_id")
        public String getEIPGroupID() {
            return this.eIPGroupID;
        }

        private String eIPGroupName;

        @JsonProperty(value = "eip_group_name")
        public void setEIPGroupName(String eIPGroupName) {
            this.eIPGroupName = eIPGroupName;
        }

        @JsonProperty(value = "eip_group_name")
        public String getEIPGroupName() {
            return this.eIPGroupName;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EIPResourceModel implements ParamValidate {
        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceName;

        @JsonProperty(value = "resource_name")
        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        @JsonProperty(value = "resource_name")
        public String getResourceName() {
            return this.resourceName;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ExtraModel implements ParamValidate {
        private String blockBus;

        @JsonProperty(value = "block_bus")
        public void setBlockBus(String blockBus) {
            this.blockBus = blockBus;
        }

        @JsonProperty(value = "block_bus")
        public String getBlockBus() {
            return this.blockBus;
        }

        private String bootDev;

        @JsonProperty(value = "boot_dev")
        public void setBootDev(String bootDev) {
            this.bootDev = bootDev;
        }

        @JsonProperty(value = "boot_dev")
        public String getBootDev() {
            return this.bootDev;
        }

        private Integer cPUMax;

        @JsonProperty(value = "cpu_max")
        public void setCPUMax(Integer cPUMax) {
            this.cPUMax = cPUMax;
        }

        @JsonProperty(value = "cpu_max")
        public Integer getCPUMax() {
            return this.cPUMax;
        }

        private String cPUModel;

        @JsonProperty(value = "cpu_model")
        public void setCPUModel(String cPUModel) {
            this.cPUModel = cPUModel;
        }

        @JsonProperty(value = "cpu_model")
        public String getCPUModel() {
            return this.cPUModel;
        }

        private Integer features;

        @JsonProperty(value = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @JsonProperty(value = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String hypervisor;

        @JsonProperty(value = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @JsonProperty(value = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
        }

        private Integer memMax;

        @JsonProperty(value = "mem_max")
        public void setMemMax(Integer memMax) {
            this.memMax = memMax;
        }

        @JsonProperty(value = "mem_max")
        public Integer getMemMax() {
            return this.memMax;
        }

        private Integer nICMqueue;

        @JsonProperty(value = "nic_mqueue")
        public void setNICMqueue(Integer nICMqueue) {
            this.nICMqueue = nICMqueue;
        }

        @JsonProperty(value = "nic_mqueue")
        public Integer getNICMqueue() {
            return this.nICMqueue;
        }

        private Integer noLimit;

        @JsonProperty(value = "no_limit")
        public void setNoLimit(Integer noLimit) {
            this.noLimit = noLimit;
        }

        @JsonProperty(value = "no_limit")
        public Integer getNoLimit() {
            return this.noLimit;
        }

        private Integer noRestrict;

        @JsonProperty(value = "no_restrict")
        public void setNoRestrict(Integer noRestrict) {
            this.noRestrict = noRestrict;
        }

        @JsonProperty(value = "no_restrict")
        public Integer getNoRestrict() {
            return this.noRestrict;
        }

        private Integer oSDiskSize;

        @JsonProperty(value = "os_disk_size")
        public void setOSDiskSize(Integer oSDiskSize) {
            this.oSDiskSize = oSDiskSize;
        }

        @JsonProperty(value = "os_disk_size")
        public Integer getOSDiskSize() {
            return this.oSDiskSize;
        }

        private Integer uSB;

        @JsonProperty(value = "usb")
        public void setUSB(Integer uSB) {
            this.uSB = uSB;
        }

        @JsonProperty(value = "usb")
        public Integer getUSB() {
            return this.uSB;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FileModel implements ParamValidate {
        private String file;

        @JsonProperty(value = "file")
        public void setFile(String file) {
            this.file = file;
        }

        @JsonProperty(value = "file")
        public String getFile() {
            return this.file;
        }

        private String lastModify;

        @JsonProperty(value = "last_modify")
        public void setLastModify(String lastModify) {
            this.lastModify = lastModify;
        }

        @JsonProperty(value = "last_modify")
        public String getLastModify() {
            return this.lastModify;
        }

        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageModel implements ParamValidate {
        private String appBillingID;

        @JsonProperty(value = "app_billing_id")
        public void setAppBillingID(String appBillingID) {
            this.appBillingID = appBillingID;
        }

        @JsonProperty(value = "app_billing_id")
        public String getAppBillingID() {
            return this.appBillingID;
        }

        private String architecture;

        @JsonProperty(value = "architecture")
        public void setArchitecture(String architecture) {
            this.architecture = architecture;
        }

        @JsonProperty(value = "architecture")
        public String getArchitecture() {
            return this.architecture;
        }

        private String billingID;

        @JsonProperty(value = "billing_id")
        public void setBillingID(String billingID) {
            this.billingID = billingID;
        }

        @JsonProperty(value = "billing_id")
        public String getBillingID() {
            return this.billingID;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String defaultPasswd;

        @JsonProperty(value = "default_passwd")
        public void setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
        }

        @JsonProperty(value = "default_passwd")
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        private String defaultUser;

        @JsonProperty(value = "default_user")
        public void setDefaultUser(String defaultUser) {
            this.defaultUser = defaultUser;
        }

        @JsonProperty(value = "default_user")
        public String getDefaultUser() {
            return this.defaultUser;
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

        private Integer fResetpwd;

        @JsonProperty(value = "f_resetpwd")
        public void setFResetpwd(Integer fResetpwd) {
            this.fResetpwd = fResetpwd;
        }

        @JsonProperty(value = "f_resetpwd")
        public Integer getFResetpwd() {
            return this.fResetpwd;
        }

        private Integer feature;

        @JsonProperty(value = "feature")
        public void setFeature(Integer feature) {
            this.feature = feature;
        }

        @JsonProperty(value = "feature")
        public Integer getFeature() {
            return this.feature;
        }

        private Integer features;

        @JsonProperty(value = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @JsonProperty(value = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String hypervisor;

        @JsonProperty(value = "hypervisor")
        public void setHypervisor(String hypervisor) {
            this.hypervisor = hypervisor;
        }

        @JsonProperty(value = "hypervisor")
        public String getHypervisor() {
            return this.hypervisor;
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

        private String imageName;

        @JsonProperty(value = "image_name")
        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        @JsonProperty(value = "image_name")
        public String getImageName() {
            return this.imageName;
        }

        private List<String> instanceIDs;

        @JsonProperty(value = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @JsonProperty(value = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
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

    	// Platform's available values: linux, windows
        private String platform;

        @JsonProperty(value = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @JsonProperty(value = "platform")
        public String getPlatform() {
            return this.platform;
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

        private String recommendedType;

        @JsonProperty(value = "recommended_type")
        public void setRecommendedType(String recommendedType) {
            this.recommendedType = recommendedType;
        }

        @JsonProperty(value = "recommended_type")
        public String getRecommendedType() {
            return this.recommendedType;
        }

        private String rootID;

        @JsonProperty(value = "root_id")
        public void setRootID(String rootID) {
            this.rootID = rootID;
        }

        @JsonProperty(value = "root_id")
        public String getRootID() {
            return this.rootID;
        }

        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
        }

    	// Status's available values: pending, available, deprecated, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

    	// TransitionStatus's available values: creating, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private String uIType;

        @JsonProperty(value = "ui_type")
        public void setUIType(String uIType) {
            this.uIType = uIType;
        }

        @JsonProperty(value = "ui_type")
        public String getUIType() {
            return this.uIType;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageUserModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private UserModel user;

        @JsonProperty(value = "user")
        public void setUser(UserModel user) {
            this.user = user;
        }

        @JsonProperty(value = "user")
        public UserModel getUser() {
            return this.user;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class InstanceModel implements ParamValidate {
        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private String cPUTopology;

        @JsonProperty(value = "cpu_topology")
        public void setCPUTopology(String cPUTopology) {
            this.cPUTopology = cPUTopology;
        }

        @JsonProperty(value = "cpu_topology")
        public String getCPUTopology() {
            return this.cPUTopology;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String device;

        @JsonProperty(value = "device")
        public void setDevice(String device) {
            this.device = device;
        }

        @JsonProperty(value = "device")
        public String getDevice() {
            return this.device;
        }

        private List<DNSAliasModel> dNSAliases;

        @JsonProperty(value = "dns_aliases")
        public void setDNSAliases(List<DNSAliasModel> dNSAliases) {
            this.dNSAliases = dNSAliases;
        }

        @JsonProperty(value = "dns_aliases")
        public List<DNSAliasModel> getDNSAliases() {
            return this.dNSAliases;
        }

        private EIPModel eIP;

        @JsonProperty(value = "eip")
        public void setEIP(EIPModel eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public EIPModel getEIP() {
            return this.eIP;
        }

        private ExtraModel extra;

        @JsonProperty(value = "extra")
        public void setExtra(ExtraModel extra) {
            this.extra = extra;
        }

        @JsonProperty(value = "extra")
        public ExtraModel getExtra() {
            return this.extra;
        }

        private String graphicsPasswd;

        @JsonProperty(value = "graphics_passwd")
        public void setGraphicsPasswd(String graphicsPasswd) {
            this.graphicsPasswd = graphicsPasswd;
        }

        @JsonProperty(value = "graphics_passwd")
        public String getGraphicsPasswd() {
            return this.graphicsPasswd;
        }

        private String graphicsProtocol;

        @JsonProperty(value = "graphics_protocol")
        public void setGraphicsProtocol(String graphicsProtocol) {
            this.graphicsProtocol = graphicsProtocol;
        }

        @JsonProperty(value = "graphics_protocol")
        public String getGraphicsProtocol() {
            return this.graphicsProtocol;
        }

        private ImageModel image;

        @JsonProperty(value = "image")
        public void setImage(ImageModel image) {
            this.image = image;
        }

        @JsonProperty(value = "image")
        public ImageModel getImage() {
            return this.image;
        }

        private Integer instanceClass;

        @JsonProperty(value = "instance_class")
        public void setInstanceClass(Integer instanceClass) {
            this.instanceClass = instanceClass;
        }

        @JsonProperty(value = "instance_class")
        public Integer getInstanceClass() {
            return this.instanceClass;
        }

        private String instanceID;

        @JsonProperty(value = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @JsonProperty(value = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private String instanceName;

        @JsonProperty(value = "instance_name")
        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        @JsonProperty(value = "instance_name")
        public String getInstanceName() {
            return this.instanceName;
        }

        private String instanceType;

        @JsonProperty(value = "instance_type")
        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        @JsonProperty(value = "instance_type")
        public String getInstanceType() {
            return this.instanceType;
        }

        private List<String> keyPairIDs;

        @JsonProperty(value = "keypair_ids")
        public void setKeyPairIDs(List<String> keyPairIDs) {
            this.keyPairIDs = keyPairIDs;
        }

        @JsonProperty(value = "keypair_ids")
        public List<String> getKeyPairIDs() {
            return this.keyPairIDs;
        }

        private Integer memoryCurrent;

        @JsonProperty(value = "memory_current")
        public void setMemoryCurrent(Integer memoryCurrent) {
            this.memoryCurrent = memoryCurrent;
        }

        @JsonProperty(value = "memory_current")
        public Integer getMemoryCurrent() {
            return this.memoryCurrent;
        }

        private SecurityGroupModel securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(SecurityGroupModel securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public SecurityGroupModel getSecurityGroup() {
            return this.securityGroup;
        }

    	// Status's available values: pending, running, stopped, suspended, terminated, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, restarting, suspending, resuming, terminating, recovering, resetting
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer vCPUsCurrent;

        @JsonProperty(value = "vcpus_current")
        public void setVCPUsCurrent(Integer vCPUsCurrent) {
            this.vCPUsCurrent = vCPUsCurrent;
        }

        @JsonProperty(value = "vcpus_current")
        public Integer getVCPUsCurrent() {
            return this.vCPUsCurrent;
        }

        private List<String> volumeIDs;

        @JsonProperty(value = "volume_ids")
        public void setVolumeIDs(List<String> volumeIDs) {
            this.volumeIDs = volumeIDs;
        }

        @JsonProperty(value = "volume_ids")
        public List<String> getVolumeIDs() {
            return this.volumeIDs;
        }

        private List<VolumeModel> volumes;

        @JsonProperty(value = "volumes")
        public void setVolumes(List<VolumeModel> volumes) {
            this.volumes = volumes;
        }

        @JsonProperty(value = "volumes")
        public List<VolumeModel> getVolumes() {
            return this.volumes;
        }

        private List<NICVxNetModel> vxNets;

        @JsonProperty(value = "vxnets")
        public void setVxNets(List<NICVxNetModel> vxNets) {
            this.vxNets = vxNets;
        }

        @JsonProperty(value = "vxnets")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class InstanceTypeModel implements ParamValidate {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        private String instanceTypeID;

        @JsonProperty(value = "instance_type_id")
        public void setInstanceTypeID(String instanceTypeID) {
            this.instanceTypeID = instanceTypeID;
        }

        @JsonProperty(value = "instance_type_id")
        public String getInstanceTypeID() {
            return this.instanceTypeID;
        }

        private String instanceTypeName;

        @JsonProperty(value = "instance_type_name")
        public void setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
        }

        @JsonProperty(value = "instance_type_name")
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        private Integer memoryCurrent;

        @JsonProperty(value = "memory_current")
        public void setMemoryCurrent(Integer memoryCurrent) {
            this.memoryCurrent = memoryCurrent;
        }

        @JsonProperty(value = "memory_current")
        public Integer getMemoryCurrent() {
            return this.memoryCurrent;
        }

    	// Status's available values: available, deprecated
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private Integer vCPUsCurrent;

        @JsonProperty(value = "vcpus_current")
        public void setVCPUsCurrent(Integer vCPUsCurrent) {
            this.vCPUsCurrent = vCPUsCurrent;
        }

        @JsonProperty(value = "vcpus_current")
        public Integer getVCPUsCurrent() {
            return this.vCPUsCurrent;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class InstanceVxNetModel implements ParamValidate {
        private String nICID;

        @JsonProperty(value = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @JsonProperty(value = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @JsonProperty(value = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public Integer getRole() {
            return this.role;
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

        private String vxNetName;

        @JsonProperty(value = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @JsonProperty(value = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        private Integer vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class JobModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String jobAction;

        @JsonProperty(value = "job_action")
        public void setJobAction(String jobAction) {
            this.jobAction = jobAction;
        }

        @JsonProperty(value = "job_action")
        public String getJobAction() {
            return this.jobAction;
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

        private String owner;

        @JsonProperty(value = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @JsonProperty(value = "owner")
        public String getOwner() {
            return this.owner;
        }

        private String resourceIDs;

        @JsonProperty(value = "resource_ids")
        public void setResourceIDs(String resourceIDs) {
            this.resourceIDs = resourceIDs;
        }

        @JsonProperty(value = "resource_ids")
        public String getResourceIDs() {
            return this.resourceIDs;
        }

    	// Status's available values: pending, working, failed, successful, done with failure
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class KeyPairModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// EncryptMethod's available values: ssh-rsa, ssh-dss
        private String encryptMethod;

        @JsonProperty(value = "encrypt_method")
        public void setEncryptMethod(String encryptMethod) {
            this.encryptMethod = encryptMethod;
        }

        @JsonProperty(value = "encrypt_method")
        public String getEncryptMethod() {
            return this.encryptMethod;
        }

        private List<String> instanceIDs;

        @JsonProperty(value = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @JsonProperty(value = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
        }

        private String keyPairID;

        @JsonProperty(value = "keypair_id")
        public void setKeyPairID(String keyPairID) {
            this.keyPairID = keyPairID;
        }

        @JsonProperty(value = "keypair_id")
        public String getKeyPairID() {
            return this.keyPairID;
        }

        private String keyPairName;

        @JsonProperty(value = "keypair_name")
        public void setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
        }

        @JsonProperty(value = "keypair_name")
        public String getKeyPairName() {
            return this.keyPairName;
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

        private String privKey;

        @JsonProperty(value = "priv_key")
        public void setPrivKey(String privKey) {
            this.privKey = privKey;
        }

        @JsonProperty(value = "priv_key")
        public String getPrivKey() {
            return this.privKey;
        }

        private String pubKey;

        @JsonProperty(value = "pub_key")
        public void setPubKey(String pubKey) {
            this.pubKey = pubKey;
        }

        @JsonProperty(value = "pub_key")
        public String getPubKey() {
            return this.pubKey;
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

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoadBalancerModel implements ParamValidate {
        private List<EIPModel> cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(List<EIPModel> cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public List<EIPModel> getCluster() {
            return this.cluster;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private List<EIPModel> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<EIPModel> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<EIPModel> getEIPs() {
            return this.eIPs;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private List<LoadBalancerListenerModel> listeners;

        @JsonProperty(value = "listeners")
        public void setListeners(List<LoadBalancerListenerModel> listeners) {
            this.listeners = listeners;
        }

        @JsonProperty(value = "listeners")
        public List<LoadBalancerListenerModel> getListeners() {
            return this.listeners;
        }

        private String loadBalancerID;

        @JsonProperty(value = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @JsonProperty(value = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerName;

        @JsonProperty(value = "loadbalancer_name")
        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
        }

        @JsonProperty(value = "loadbalancer_name")
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

    	// LoadBalancerType's available values: 0, 1, 2, 3, 4, 5
        private Integer loadBalancerType;

        @JsonProperty(value = "loadbalancer_type")
        public void setLoadBalancerType(Integer loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
        }

        @JsonProperty(value = "loadbalancer_type")
        public Integer getLoadBalancerType() {
            return this.loadBalancerType;
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

        private List<String> privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(List<String> privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public List<String> getPrivateIPs() {
            return this.privateIPs;
        }

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, stopped, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, starting, stopping, updating, suspending, resuming, deleting
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoadBalancerBackendModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String loadBalancerBackendID;

        @JsonProperty(value = "loadbalancer_backend_id")
        public void setLoadBalancerBackendID(String loadBalancerBackendID) {
            this.loadBalancerBackendID = loadBalancerBackendID;
        }

        @JsonProperty(value = "loadbalancer_backend_id")
        public String getLoadBalancerBackendID() {
            return this.loadBalancerBackendID;
        }

        private String loadBalancerBackendName;

        @JsonProperty(value = "loadbalancer_backend_name")
        public void setLoadBalancerBackendName(String loadBalancerBackendName) {
            this.loadBalancerBackendName = loadBalancerBackendName;
        }

        @JsonProperty(value = "loadbalancer_backend_name")
        public String getLoadBalancerBackendName() {
            return this.loadBalancerBackendName;
        }

        private String loadBalancerID;

        @JsonProperty(value = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @JsonProperty(value = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerListenerID;

        @JsonProperty(value = "loadbalancer_listener_id")
        public void setLoadBalancerListenerID(String loadBalancerListenerID) {
            this.loadBalancerListenerID = loadBalancerListenerID;
        }

        @JsonProperty(value = "loadbalancer_listener_id")
        public String getLoadBalancerListenerID() {
            return this.loadBalancerListenerID;
        }

        private String loadBalancerPolicyID;

        @JsonProperty(value = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @JsonProperty(value = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private Integer port;

        @JsonProperty(value = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @JsonProperty(value = "port")
        public Integer getPort() {
            return this.port;
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

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private Integer weight;

        @JsonProperty(value = "weight")
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @JsonProperty(value = "weight")
        public Integer getWeight() {
            return this.weight;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoadBalancerListenerModel implements ParamValidate {
        private String backendProtocol;

        @JsonProperty(value = "backend_protocol")
        public void setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
        }

        @JsonProperty(value = "backend_protocol")
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        private List<LoadBalancerBackendModel> backends;

        @JsonProperty(value = "backends")
        public void setBackends(List<LoadBalancerBackendModel> backends) {
            this.backends = backends;
        }

        @JsonProperty(value = "backends")
        public List<LoadBalancerBackendModel> getBackends() {
            return this.backends;
        }

    	// BalanceMode's available values: roundrobin, leastconn, source
        private String balanceMode;

        @JsonProperty(value = "balance_mode")
        public void setBalanceMode(String balanceMode) {
            this.balanceMode = balanceMode;
        }

        @JsonProperty(value = "balance_mode")
        public String getBalanceMode() {
            return this.balanceMode;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private Integer forwardfor;

        @JsonProperty(value = "forwardfor")
        public void setForwardfor(Integer forwardfor) {
            this.forwardfor = forwardfor;
        }

        @JsonProperty(value = "forwardfor")
        public Integer getForwardfor() {
            return this.forwardfor;
        }

        private String healthyCheckMethod;

        @JsonProperty(value = "healthy_check_method")
        public void setHealthyCheckMethod(String healthyCheckMethod) {
            this.healthyCheckMethod = healthyCheckMethod;
        }

        @JsonProperty(value = "healthy_check_method")
        public String getHealthyCheckMethod() {
            return this.healthyCheckMethod;
        }

        private String healthyCheckOption;

        @JsonProperty(value = "healthy_check_option")
        public void setHealthyCheckOption(String healthyCheckOption) {
            this.healthyCheckOption = healthyCheckOption;
        }

        @JsonProperty(value = "healthy_check_option")
        public String getHealthyCheckOption() {
            return this.healthyCheckOption;
        }

        private Integer listenerOption;

        @JsonProperty(value = "listener_option")
        public void setListenerOption(Integer listenerOption) {
            this.listenerOption = listenerOption;
        }

        @JsonProperty(value = "listener_option")
        public Integer getListenerOption() {
            return this.listenerOption;
        }

        private Integer listenerPort;

        @JsonProperty(value = "listener_port")
        public void setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
        }

        @JsonProperty(value = "listener_port")
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        private String listenerProtocol;

        @JsonProperty(value = "listener_protocol")
        public void setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
        }

        @JsonProperty(value = "listener_protocol")
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        private String loadBalancerID;

        @JsonProperty(value = "loadbalancer_id")
        public void setLoadBalancerID(String loadBalancerID) {
            this.loadBalancerID = loadBalancerID;
        }

        @JsonProperty(value = "loadbalancer_id")
        public String getLoadBalancerID() {
            return this.loadBalancerID;
        }

        private String loadBalancerListenerID;

        @JsonProperty(value = "loadbalancer_listener_id")
        public void setLoadBalancerListenerID(String loadBalancerListenerID) {
            this.loadBalancerListenerID = loadBalancerListenerID;
        }

        @JsonProperty(value = "loadbalancer_listener_id")
        public String getLoadBalancerListenerID() {
            return this.loadBalancerListenerID;
        }

        private String loadBalancerListenerName;

        @JsonProperty(value = "loadbalancer_listener_name")
        public void setLoadBalancerListenerName(String loadBalancerListenerName) {
            this.loadBalancerListenerName = loadBalancerListenerName;
        }

        @JsonProperty(value = "loadbalancer_listener_name")
        public String getLoadBalancerListenerName() {
            return this.loadBalancerListenerName;
        }

        private List<String> serverCertificateID;

        @JsonProperty(value = "server_certificate_id")
        public void setServerCertificateID(List<String> serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @JsonProperty(value = "server_certificate_id")
        public List<String> getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String sessionSticky;

        @JsonProperty(value = "session_sticky")
        public void setSessionSticky(String sessionSticky) {
            this.sessionSticky = sessionSticky;
        }

        @JsonProperty(value = "session_sticky")
        public String getSessionSticky() {
            return this.sessionSticky;
        }

        private Integer timeout;

        @JsonProperty(value = "timeout")
        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        @JsonProperty(value = "timeout")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoadBalancerPolicyModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private List<String> loadBalancerIDs;

        @JsonProperty(value = "loadbalancer_ids")
        public void setLoadBalancerIDs(List<String> loadBalancerIDs) {
            this.loadBalancerIDs = loadBalancerIDs;
        }

        @JsonProperty(value = "loadbalancer_ids")
        public List<String> getLoadBalancerIDs() {
            return this.loadBalancerIDs;
        }

        private String loadBalancerPolicyID;

        @JsonProperty(value = "loadbalancer_policy_id")
        public void setLoadBalancerPolicyID(String loadBalancerPolicyID) {
            this.loadBalancerPolicyID = loadBalancerPolicyID;
        }

        @JsonProperty(value = "loadbalancer_policy_id")
        public String getLoadBalancerPolicyID() {
            return this.loadBalancerPolicyID;
        }

        private String loadBalancerPolicyName;

        @JsonProperty(value = "loadbalancer_policy_name")
        public void setLoadBalancerPolicyName(String loadBalancerPolicyName) {
            this.loadBalancerPolicyName = loadBalancerPolicyName;
        }

        @JsonProperty(value = "loadbalancer_policy_name")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoadBalancerPolicyRuleModel implements ParamValidate {
        private String loadBalancerPolicyRuleID;

        @JsonProperty(value = "loadbalancer_policy_rule_id")
        public void setLoadBalancerPolicyRuleID(String loadBalancerPolicyRuleID) {
            this.loadBalancerPolicyRuleID = loadBalancerPolicyRuleID;
        }

        @JsonProperty(value = "loadbalancer_policy_rule_id")
        public String getLoadBalancerPolicyRuleID() {
            return this.loadBalancerPolicyRuleID;
        }

        private String loadBalancerPolicyRuleName;

        @JsonProperty(value = "loadbalancer_policy_rule_name")
        public void setLoadBalancerPolicyRuleName(String loadBalancerPolicyRuleName) {
            this.loadBalancerPolicyRuleName = loadBalancerPolicyRuleName;
        }

        @JsonProperty(value = "loadbalancer_policy_rule_name")
        public String getLoadBalancerPolicyRuleName() {
            return this.loadBalancerPolicyRuleName;
        }

        private String ruleType;

        @JsonProperty(value = "rule_type")
        public void setRuleType(String ruleType) {
            this.ruleType = ruleType;
        }

        @JsonProperty(value = "rule_type")
        public String getRuleType() {
            return this.ruleType;
        }

        private String val;

        @JsonProperty(value = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @JsonProperty(value = "val")
        public String getVal() {
            return this.val;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MeterModel implements ParamValidate {
        private List<Object> data;

        @JsonProperty(value = "data")
        public void setData(List<Object> data) {
            this.data = data;
        }

        @JsonProperty(value = "data")
        public List<Object> getData() {
            return this.data;
        }

        private String meterID;

        @JsonProperty(value = "meter_id")
        public void setMeterID(String meterID) {
            this.meterID = meterID;
        }

        @JsonProperty(value = "meter_id")
        public String getMeterID() {
            return this.meterID;
        }

        private Integer sequence;

        @JsonProperty(value = "sequence")
        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }

        @JsonProperty(value = "sequence")
        public Integer getSequence() {
            return this.sequence;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MongoModel implements ParamValidate {
    	// AlarmStatus's available values: ok, alarm, insufficient
        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Integer autoMinorVerUpgrade;

        @JsonProperty(value = "auto_minor_ver_upgrade")
        public void setAutoMinorVerUpgrade(Integer autoMinorVerUpgrade) {
            this.autoMinorVerUpgrade = autoMinorVerUpgrade;
        }

        @JsonProperty(value = "auto_minor_ver_upgrade")
        public Integer getAutoMinorVerUpgrade() {
            return this.autoMinorVerUpgrade;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String latestSnapshotTime;

        @JsonProperty(value = "lastest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @JsonProperty(value = "lastest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String mongoID;

        @JsonProperty(value = "mongo_id")
        public void setMongoID(String mongoID) {
            this.mongoID = mongoID;
        }

        @JsonProperty(value = "mongo_id")
        public String getMongoID() {
            return this.mongoID;
        }

        private String mongoName;

        @JsonProperty(value = "mongo_name")
        public void setMongoName(String mongoName) {
            this.mongoName = mongoName;
        }

        @JsonProperty(value = "mongo_name")
        public String getMongoName() {
            return this.mongoName;
        }

        private Integer mongoType;

        @JsonProperty(value = "mongo_type")
        public void setMongoType(Integer mongoType) {
            this.mongoType = mongoType;
        }

        @JsonProperty(value = "mongo_type")
        public Integer getMongoType() {
            return this.mongoType;
        }

        private String mongoVersion;

        @JsonProperty(value = "mongo_version")
        public void setMongoVersion(String mongoVersion) {
            this.mongoVersion = mongoVersion;
        }

        @JsonProperty(value = "mongo_version")
        public String getMongoVersion() {
            return this.mongoVersion;
        }

    	// Status's available values: pending, active, stopped, deleted, suspended, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
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

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, stopping, starting, deleting, resizing, suspending, vxnet-changing, snapshot-creating, instances-adding, instances-removing, pg-applying
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MongoNodeModel implements ParamValidate {
        private String iP;

        @JsonProperty(value = "ip")
        public void setIP(String iP) {
            this.iP = iP;
        }

        @JsonProperty(value = "ip")
        public String getIP() {
            return this.iP;
        }

        private String mongoID;

        @JsonProperty(value = "mongo_id")
        public void setMongoID(String mongoID) {
            this.mongoID = mongoID;
        }

        @JsonProperty(value = "mongo_id")
        public String getMongoID() {
            return this.mongoID;
        }

        private String mongoNodeID;

        @JsonProperty(value = "mongo_node_id")
        public void setMongoNodeID(String mongoNodeID) {
            this.mongoNodeID = mongoNodeID;
        }

        @JsonProperty(value = "mongo_node_id")
        public String getMongoNodeID() {
            return this.mongoNodeID;
        }

        private Integer primary;

        @JsonProperty(value = "primary")
        public void setPrimary(Integer primary) {
            this.primary = primary;
        }

        @JsonProperty(value = "primary")
        public Integer getPrimary() {
            return this.primary;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MongoParameterModel implements ParamValidate {
    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @JsonProperty(value = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @JsonProperty(value = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

    	// IsStatic's available values: 0, 1
        private Integer isStatic;

        @JsonProperty(value = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @JsonProperty(value = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private String oPTName;

        @JsonProperty(value = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @JsonProperty(value = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String parameterName;

        @JsonProperty(value = "parameter_name")
        public void setParameterName(String parameterName) {
            this.parameterName = parameterName;
        }

        @JsonProperty(value = "parameter_name")
        public String getParameterName() {
            return this.parameterName;
        }

    	// ParameterType's available values: string, int, bool
        private String parameterType;

        @JsonProperty(value = "parameter_type")
        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }

        @JsonProperty(value = "parameter_type")
        public String getParameterType() {
            return this.parameterType;
        }

        private String parameterValue;

        @JsonProperty(value = "parameter_value")
        public void setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
        }

        @JsonProperty(value = "parameter_value")
        public String getParameterValue() {
            return this.parameterValue;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MongoPrivateIPModel implements ParamValidate {
        private String priority0;

        @JsonProperty(value = "priority0")
        public void setPriority0(String priority0) {
            this.priority0 = priority0;
        }

        @JsonProperty(value = "priority0")
        public String getPriority0() {
            return this.priority0;
        }

        private String replica;

        @JsonProperty(value = "replica")
        public void setReplica(String replica) {
            this.replica = replica;
        }

        @JsonProperty(value = "replica")
        public String getReplica() {
            return this.replica;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NICModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private NICEIPModel eIP;

        @JsonProperty(value = "eip")
        public void setEIP(NICEIPModel eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public NICEIPModel getEIP() {
            return this.eIP;
        }

        private String instanceID;

        @JsonProperty(value = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @JsonProperty(value = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private String nICID;

        @JsonProperty(value = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @JsonProperty(value = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String nICName;

        @JsonProperty(value = "nic_name")
        public void setNICName(String nICName) {
            this.nICName = nICName;
        }

        @JsonProperty(value = "nic_name")
        public String getNICName() {
            return this.nICName;
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

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @JsonProperty(value = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public Integer getRole() {
            return this.role;
        }

        private String rootUserID;

        @JsonProperty(value = "root_user_id")
        public void setRootUserID(String rootUserID) {
            this.rootUserID = rootUserID;
        }

        @JsonProperty(value = "root_user_id")
        public String getRootUserID() {
            return this.rootUserID;
        }

        private String securityGroup;

        @JsonProperty(value = "security_group")
        public void setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
        }

        @JsonProperty(value = "security_group")
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        private Integer sequence;

        @JsonProperty(value = "sequence")
        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }

        @JsonProperty(value = "sequence")
        public Integer getSequence() {
            return this.sequence;
        }

    	// Status's available values: available, in-use
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NICEIPModel implements ParamValidate {
        private Integer bandwidth;

        @JsonProperty(value = "bandwidth")
        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        @JsonProperty(value = "bandwidth")
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        private String eIPAddr;

        @JsonProperty(value = "eip_addr")
        public void setEIPAddr(String eIPAddr) {
            this.eIPAddr = eIPAddr;
        }

        @JsonProperty(value = "eip_addr")
        public String getEIPAddr() {
            return this.eIPAddr;
        }

        private String eIPID;

        @JsonProperty(value = "eip_id")
        public void setEIPID(String eIPID) {
            this.eIPID = eIPID;
        }

        @JsonProperty(value = "eip_id")
        public String getEIPID() {
            return this.eIPID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NICIPModel implements ParamValidate {
        private String nICID;

        @JsonProperty(value = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @JsonProperty(value = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NICVxNetModel implements ParamValidate {
        private String nICID;

        @JsonProperty(value = "nic_id")
        public void setNICID(String nICID) {
            this.nICID = nICID;
        }

        @JsonProperty(value = "nic_id")
        public String getNICID() {
            return this.nICID;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private Integer role;

        @JsonProperty(value = "role")
        public void setRole(Integer role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public Integer getRole() {
            return this.role;
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

        private String vxNetName;

        @JsonProperty(value = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @JsonProperty(value = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

        private Integer vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
        public Integer getVxNetType() {
            return this.vxNetType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class QuotaLeftModel implements ParamValidate {
        private Integer left;

        @JsonProperty(value = "left")
        public void setLeft(Integer left) {
            this.left = left;
        }

        @JsonProperty(value = "left")
        public Integer getLeft() {
            return this.left;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RDBModel implements ParamValidate {
    	// AlarmStatus's available values: ok, alarm, insufficient
        private String alarmStatus;

        @JsonProperty(value = "alarm_status")
        public void setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
        }

        @JsonProperty(value = "alarm_status")
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        private Integer autoBackupTime;

        @JsonProperty(value = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @JsonProperty(value = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        private Integer autoMinorVerUpgrade;

        @JsonProperty(value = "auto_minor_ver_upgrade")
        public void setAutoMinorVerUpgrade(Integer autoMinorVerUpgrade) {
            this.autoMinorVerUpgrade = autoMinorVerUpgrade;
        }

        @JsonProperty(value = "auto_minor_ver_upgrade")
        public Integer getAutoMinorVerUpgrade() {
            return this.autoMinorVerUpgrade;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String engineVersion;

        @JsonProperty(value = "engine_version")
        public void setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
        }

        @JsonProperty(value = "engine_version")
        public String getEngineVersion() {
            return this.engineVersion;
        }

        private String latestSnapshotTime;

        @JsonProperty(value = "lastest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @JsonProperty(value = "lastest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String masterIP;

        @JsonProperty(value = "master_ip")
        public void setMasterIP(String masterIP) {
            this.masterIP = masterIP;
        }

        @JsonProperty(value = "master_ip")
        public String getMasterIP() {
            return this.masterIP;
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

        private String rDBID;

        @JsonProperty(value = "rdb_id")
        public void setRDBID(String rDBID) {
            this.rDBID = rDBID;
        }

        @JsonProperty(value = "rdb_id")
        public String getRDBID() {
            return this.rDBID;
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

        private Integer rDBType;

        @JsonProperty(value = "rdb_type")
        public void setRDBType(Integer rDBType) {
            this.rDBType = rDBType;
        }

        @JsonProperty(value = "rdb_type")
        public Integer getRDBType() {
            return this.rDBType;
        }

    	// Status's available values: pending, active, stopped, deleted, suspended, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
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

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, stopping, starting, deleting, backup-creating, temp-creating, configuring, switching, invalid-tackling, resizing, suspending, ceasing, instance-ceasing, vxnet-leaving, vxnet-joining
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RDBFileModel implements ParamValidate {
        private List<FileModel> binaryLog;

        @JsonProperty(value = "binary_log")
        public void setBinaryLog(List<FileModel> binaryLog) {
            this.binaryLog = binaryLog;
        }

        @JsonProperty(value = "binary_log")
        public List<FileModel> getBinaryLog() {
            return this.binaryLog;
        }

        private List<FileModel> errorLog;

        @JsonProperty(value = "error_log")
        public void setErrorLog(List<FileModel> errorLog) {
            this.errorLog = errorLog;
        }

        @JsonProperty(value = "error_log")
        public List<FileModel> getErrorLog() {
            return this.errorLog;
        }

        private List<FileModel> slowLog;

        @JsonProperty(value = "slow_log")
        public void setSlowLog(List<FileModel> slowLog) {
            this.slowLog = slowLog;
        }

        @JsonProperty(value = "slow_log")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RDBParameterModel implements ParamValidate {
        private String family;

        @JsonProperty(value = "family")
        public void setFamily(String family) {
            this.family = family;
        }

        @JsonProperty(value = "family")
        public String getFamily() {
            return this.family;
        }

    	// IsReadonly's available values: 0, 1
        private Integer isReadonly;

        @JsonProperty(value = "is_readonly")
        public void setIsReadonly(Integer isReadonly) {
            this.isReadonly = isReadonly;
        }

        @JsonProperty(value = "is_readonly")
        public Integer getIsReadonly() {
            return this.isReadonly;
        }

    	// IsStatic's available values: 0, 1
        private Integer isStatic;

        @JsonProperty(value = "is_static")
        public void setIsStatic(Integer isStatic) {
            this.isStatic = isStatic;
        }

        @JsonProperty(value = "is_static")
        public Integer getIsStatic() {
            return this.isStatic;
        }

        private Integer maxValue;

        @JsonProperty(value = "max_value")
        public void setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
        }

        @JsonProperty(value = "max_value")
        public Integer getMaxValue() {
            return this.maxValue;
        }

        private Integer minValue;

        @JsonProperty(value = "min_value")
        public void setMinValue(Integer minValue) {
            this.minValue = minValue;
        }

        @JsonProperty(value = "min_value")
        public Integer getMinValue() {
            return this.minValue;
        }

        private String oPTName;

        @JsonProperty(value = "opt_name")
        public void setOPTName(String oPTName) {
            this.oPTName = oPTName;
        }

        @JsonProperty(value = "opt_name")
        public String getOPTName() {
            return this.oPTName;
        }

        private String sectionName;

        @JsonProperty(value = "section_name")
        public void setSectionName(String sectionName) {
            this.sectionName = sectionName;
        }

        @JsonProperty(value = "section_name")
        public String getSectionName() {
            return this.sectionName;
        }

        private String varName;

        @JsonProperty(value = "var_name")
        public void setVarName(String varName) {
            this.varName = varName;
        }

        @JsonProperty(value = "var_name")
        public String getVarName() {
            return this.varName;
        }

        private String varType;

        @JsonProperty(value = "var_type")
        public void setVarType(String varType) {
            this.varType = varType;
        }

        @JsonProperty(value = "var_type")
        public String getVarType() {
            return this.varType;
        }

        private String varValue;

        @JsonProperty(value = "var_value")
        public void setVarValue(String varValue) {
            this.varValue = varValue;
        }

        @JsonProperty(value = "var_value")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RDBParametersModel implements ParamValidate {
        private String bindAddress;

        @JsonProperty(value = "bind_address")
        public void setBindAddress(String bindAddress) {
            this.bindAddress = bindAddress;
        }

        @JsonProperty(value = "bind_address")
        public String getBindAddress() {
            return this.bindAddress;
        }

        private String binlogFormat;

        @JsonProperty(value = "binlog_format")
        public void setBinlogFormat(String binlogFormat) {
            this.binlogFormat = binlogFormat;
        }

        @JsonProperty(value = "binlog_format")
        public String getBinlogFormat() {
            return this.binlogFormat;
        }

        private String characterSetServer;

        @JsonProperty(value = "character_set_server")
        public void setCharacterSetServer(String characterSetServer) {
            this.characterSetServer = characterSetServer;
        }

        @JsonProperty(value = "character_set_server")
        public String getCharacterSetServer() {
            return this.characterSetServer;
        }

        private String dataDir;

        @JsonProperty(value = "datadir")
        public void setDataDir(String dataDir) {
            this.dataDir = dataDir;
        }

        @JsonProperty(value = "datadir")
        public String getDataDir() {
            return this.dataDir;
        }

        private String defaultStorageEngine;

        @JsonProperty(value = "default_storage_engine")
        public void setDefaultStorageEngine(String defaultStorageEngine) {
            this.defaultStorageEngine = defaultStorageEngine;
        }

        @JsonProperty(value = "default_storage_engine")
        public String getDefaultStorageEngine() {
            return this.defaultStorageEngine;
        }

        private Integer expireLogsDays;

        @JsonProperty(value = "expire_logs_days")
        public void setExpireLogsDays(Integer expireLogsDays) {
            this.expireLogsDays = expireLogsDays;
        }

        @JsonProperty(value = "expire_logs_days")
        public Integer getExpireLogsDays() {
            return this.expireLogsDays;
        }

        private String innoDB;

        @JsonProperty(value = "innodb")
        public void setInnoDB(String innoDB) {
            this.innoDB = innoDB;
        }

        @JsonProperty(value = "innodb")
        public String getInnoDB() {
            return this.innoDB;
        }

        private Integer innoDBBufferPoolInstances;

        @JsonProperty(value = "innodb_buffer_pool_instances")
        public void setInnoDBBufferPoolInstances(Integer innoDBBufferPoolInstances) {
            this.innoDBBufferPoolInstances = innoDBBufferPoolInstances;
        }

        @JsonProperty(value = "innodb_buffer_pool_instances")
        public Integer getInnoDBBufferPoolInstances() {
            return this.innoDBBufferPoolInstances;
        }

        private String innoDBBufferPoolSize;

        @JsonProperty(value = "innodb_buffer_pool_size")
        public void setInnoDBBufferPoolSize(String innoDBBufferPoolSize) {
            this.innoDBBufferPoolSize = innoDBBufferPoolSize;
        }

        @JsonProperty(value = "innodb_buffer_pool_size")
        public String getInnoDBBufferPoolSize() {
            return this.innoDBBufferPoolSize;
        }

        private Integer innoDBFilePerTable;

        @JsonProperty(value = "innodb_file_per_table")
        public void setInnoDBFilePerTable(Integer innoDBFilePerTable) {
            this.innoDBFilePerTable = innoDBFilePerTable;
        }

        @JsonProperty(value = "innodb_file_per_table")
        public Integer getInnoDBFilePerTable() {
            return this.innoDBFilePerTable;
        }

        private Integer innoDBFlushLogAtTRXCommit;

        @JsonProperty(value = "innodb_flush_log_at_trx_commit")
        public void setInnoDBFlushLogAtTRXCommit(Integer innoDBFlushLogAtTRXCommit) {
            this.innoDBFlushLogAtTRXCommit = innoDBFlushLogAtTRXCommit;
        }

        @JsonProperty(value = "innodb_flush_log_at_trx_commit")
        public Integer getInnoDBFlushLogAtTRXCommit() {
            return this.innoDBFlushLogAtTRXCommit;
        }

        private String innoDBFlushMethod;

        @JsonProperty(value = "innodb_flush_method")
        public void setInnoDBFlushMethod(String innoDBFlushMethod) {
            this.innoDBFlushMethod = innoDBFlushMethod;
        }

        @JsonProperty(value = "innodb_flush_method")
        public String getInnoDBFlushMethod() {
            return this.innoDBFlushMethod;
        }

        private Integer innoDBIOCapacity;

        @JsonProperty(value = "innodb_io_capacity")
        public void setInnoDBIOCapacity(Integer innoDBIOCapacity) {
            this.innoDBIOCapacity = innoDBIOCapacity;
        }

        @JsonProperty(value = "innodb_io_capacity")
        public Integer getInnoDBIOCapacity() {
            return this.innoDBIOCapacity;
        }

        private String innoDBLogBufferSize;

        @JsonProperty(value = "innodb_log_buffer_size")
        public void setInnoDBLogBufferSize(String innoDBLogBufferSize) {
            this.innoDBLogBufferSize = innoDBLogBufferSize;
        }

        @JsonProperty(value = "innodb_log_buffer_size")
        public String getInnoDBLogBufferSize() {
            return this.innoDBLogBufferSize;
        }

        private String innoDBLogFileSize;

        @JsonProperty(value = "innodb_log_file_size")
        public void setInnoDBLogFileSize(String innoDBLogFileSize) {
            this.innoDBLogFileSize = innoDBLogFileSize;
        }

        @JsonProperty(value = "innodb_log_file_size")
        public String getInnoDBLogFileSize() {
            return this.innoDBLogFileSize;
        }

        private Integer innoDBLogFilesInGroup;

        @JsonProperty(value = "innodb_log_files_in_group")
        public void setInnoDBLogFilesInGroup(Integer innoDBLogFilesInGroup) {
            this.innoDBLogFilesInGroup = innoDBLogFilesInGroup;
        }

        @JsonProperty(value = "innodb_log_files_in_group")
        public Integer getInnoDBLogFilesInGroup() {
            return this.innoDBLogFilesInGroup;
        }

        private Integer innoDBMaxDirtyPagesPct;

        @JsonProperty(value = "innodb_max_dirty_pages_pct")
        public void setInnoDBMaxDirtyPagesPct(Integer innoDBMaxDirtyPagesPct) {
            this.innoDBMaxDirtyPagesPct = innoDBMaxDirtyPagesPct;
        }

        @JsonProperty(value = "innodb_max_dirty_pages_pct")
        public Integer getInnoDBMaxDirtyPagesPct() {
            return this.innoDBMaxDirtyPagesPct;
        }

        private Integer innoDBReadIOThreads;

        @JsonProperty(value = "innodb_read_io_threads")
        public void setInnoDBReadIOThreads(Integer innoDBReadIOThreads) {
            this.innoDBReadIOThreads = innoDBReadIOThreads;
        }

        @JsonProperty(value = "innodb_read_io_threads")
        public Integer getInnoDBReadIOThreads() {
            return this.innoDBReadIOThreads;
        }

        private Integer innoDBWriteIOThreads;

        @JsonProperty(value = "innodb_write_io_threads")
        public void setInnoDBWriteIOThreads(Integer innoDBWriteIOThreads) {
            this.innoDBWriteIOThreads = innoDBWriteIOThreads;
        }

        @JsonProperty(value = "innodb_write_io_threads")
        public Integer getInnoDBWriteIOThreads() {
            return this.innoDBWriteIOThreads;
        }

        private Integer interactiveTimeout;

        @JsonProperty(value = "interactive_timeout")
        public void setInteractiveTimeout(Integer interactiveTimeout) {
            this.interactiveTimeout = interactiveTimeout;
        }

        @JsonProperty(value = "interactive_timeout")
        public Integer getInteractiveTimeout() {
            return this.interactiveTimeout;
        }

        private String keyBufferSize;

        @JsonProperty(value = "key_buffer_size")
        public void setKeyBufferSize(String keyBufferSize) {
            this.keyBufferSize = keyBufferSize;
        }

        @JsonProperty(value = "key_buffer_size")
        public String getKeyBufferSize() {
            return this.keyBufferSize;
        }

        private String logBinIndex;

        @JsonProperty(value = "log-bin-index")
        public void setLogBinIndex(String logBinIndex) {
            this.logBinIndex = logBinIndex;
        }

        @JsonProperty(value = "log-bin-index")
        public String getLogBinIndex() {
            return this.logBinIndex;
        }

        private String logBin;

        @JsonProperty(value = "log_bin")
        public void setLogBin(String logBin) {
            this.logBin = logBin;
        }

        @JsonProperty(value = "log_bin")
        public String getLogBin() {
            return this.logBin;
        }

        private String logError;

        @JsonProperty(value = "log_error")
        public void setLogError(String logError) {
            this.logError = logError;
        }

        @JsonProperty(value = "log_error")
        public String getLogError() {
            return this.logError;
        }

        private String logQueriesNotUsingIndexes;

        @JsonProperty(value = "log_queries_not_using_indexes")
        public void setLogQueriesNotUsingIndexes(String logQueriesNotUsingIndexes) {
            this.logQueriesNotUsingIndexes = logQueriesNotUsingIndexes;
        }

        @JsonProperty(value = "log_queries_not_using_indexes")
        public String getLogQueriesNotUsingIndexes() {
            return this.logQueriesNotUsingIndexes;
        }

        private Integer logSlaveUpdates;

        @JsonProperty(value = "log_slave_updates")
        public void setLogSlaveUpdates(Integer logSlaveUpdates) {
            this.logSlaveUpdates = logSlaveUpdates;
        }

        @JsonProperty(value = "log_slave_updates")
        public Integer getLogSlaveUpdates() {
            return this.logSlaveUpdates;
        }

        private Integer longQueryTime;

        @JsonProperty(value = "long_query_time")
        public void setLongQueryTime(Integer longQueryTime) {
            this.longQueryTime = longQueryTime;
        }

        @JsonProperty(value = "long_query_time")
        public Integer getLongQueryTime() {
            return this.longQueryTime;
        }

        private Integer lowerCaseTableNames;

        @JsonProperty(value = "lower_case_table_names")
        public void setLowerCaseTableNames(Integer lowerCaseTableNames) {
            this.lowerCaseTableNames = lowerCaseTableNames;
        }

        @JsonProperty(value = "lower_case_table_names")
        public Integer getLowerCaseTableNames() {
            return this.lowerCaseTableNames;
        }

        private String maxAllowedPacket;

        @JsonProperty(value = "max_allowed_packet")
        public void setMaxAllowedPacket(String maxAllowedPacket) {
            this.maxAllowedPacket = maxAllowedPacket;
        }

        @JsonProperty(value = "max_allowed_packet")
        public String getMaxAllowedPacket() {
            return this.maxAllowedPacket;
        }

        private Integer maxConnectErrors;

        @JsonProperty(value = "max_connect_errors")
        public void setMaxConnectErrors(Integer maxConnectErrors) {
            this.maxConnectErrors = maxConnectErrors;
        }

        @JsonProperty(value = "max_connect_errors")
        public Integer getMaxConnectErrors() {
            return this.maxConnectErrors;
        }

        private Integer maxConnections;

        @JsonProperty(value = "max_connections")
        public void setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
        }

        @JsonProperty(value = "max_connections")
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        private String maxHeapTableSize;

        @JsonProperty(value = "max_heap_table_size")
        public void setMaxHeapTableSize(String maxHeapTableSize) {
            this.maxHeapTableSize = maxHeapTableSize;
        }

        @JsonProperty(value = "max_heap_table_size")
        public String getMaxHeapTableSize() {
            return this.maxHeapTableSize;
        }

        private Integer openFilesLimit;

        @JsonProperty(value = "open_files_limit")
        public void setOpenFilesLimit(Integer openFilesLimit) {
            this.openFilesLimit = openFilesLimit;
        }

        @JsonProperty(value = "open_files_limit")
        public Integer getOpenFilesLimit() {
            return this.openFilesLimit;
        }

        private Integer port;

        @JsonProperty(value = "port")
        public void setPort(Integer port) {
            this.port = port;
        }

        @JsonProperty(value = "port")
        public Integer getPort() {
            return this.port;
        }

        private Integer queryCacheSize;

        @JsonProperty(value = "query_cache_size")
        public void setQueryCacheSize(Integer queryCacheSize) {
            this.queryCacheSize = queryCacheSize;
        }

        @JsonProperty(value = "query_cache_size")
        public Integer getQueryCacheSize() {
            return this.queryCacheSize;
        }

        private Integer queryCacheType;

        @JsonProperty(value = "query_cache_type")
        public void setQueryCacheType(Integer queryCacheType) {
            this.queryCacheType = queryCacheType;
        }

        @JsonProperty(value = "query_cache_type")
        public Integer getQueryCacheType() {
            return this.queryCacheType;
        }

        private String relayLog;

        @JsonProperty(value = "relay_log")
        public void setRelayLog(String relayLog) {
            this.relayLog = relayLog;
        }

        @JsonProperty(value = "relay_log")
        public String getRelayLog() {
            return this.relayLog;
        }

        private String relayLogIndex;

        @JsonProperty(value = "relay_log_index")
        public void setRelayLogIndex(String relayLogIndex) {
            this.relayLogIndex = relayLogIndex;
        }

        @JsonProperty(value = "relay_log_index")
        public String getRelayLogIndex() {
            return this.relayLogIndex;
        }

        private Integer skipSlaveStart;

        @JsonProperty(value = "skip-slave-start")
        public void setSkipSlaveStart(Integer skipSlaveStart) {
            this.skipSlaveStart = skipSlaveStart;
        }

        @JsonProperty(value = "skip-slave-start")
        public Integer getSkipSlaveStart() {
            return this.skipSlaveStart;
        }

        private Integer skipNameResolve;

        @JsonProperty(value = "skip_name_resolve")
        public void setSkipNameResolve(Integer skipNameResolve) {
            this.skipNameResolve = skipNameResolve;
        }

        @JsonProperty(value = "skip_name_resolve")
        public Integer getSkipNameResolve() {
            return this.skipNameResolve;
        }

        private String slaveExecMode;

        @JsonProperty(value = "slave_exec_mode")
        public void setSlaveExecMode(String slaveExecMode) {
            this.slaveExecMode = slaveExecMode;
        }

        @JsonProperty(value = "slave_exec_mode")
        public String getSlaveExecMode() {
            return this.slaveExecMode;
        }

        private Integer slaveNetTimeout;

        @JsonProperty(value = "slave_net_timeout")
        public void setSlaveNetTimeout(Integer slaveNetTimeout) {
            this.slaveNetTimeout = slaveNetTimeout;
        }

        @JsonProperty(value = "slave_net_timeout")
        public Integer getSlaveNetTimeout() {
            return this.slaveNetTimeout;
        }

        private Integer slowQueryLog;

        @JsonProperty(value = "slow_query_log")
        public void setSlowQueryLog(Integer slowQueryLog) {
            this.slowQueryLog = slowQueryLog;
        }

        @JsonProperty(value = "slow_query_log")
        public Integer getSlowQueryLog() {
            return this.slowQueryLog;
        }

        private String slowQueryLogFile;

        @JsonProperty(value = "slow_query_log_file")
        public void setSlowQueryLogFile(String slowQueryLogFile) {
            this.slowQueryLogFile = slowQueryLogFile;
        }

        @JsonProperty(value = "slow_query_log_file")
        public String getSlowQueryLogFile() {
            return this.slowQueryLogFile;
        }

        private String sQLMode;

        @JsonProperty(value = "sql_mode")
        public void setSQLMode(String sQLMode) {
            this.sQLMode = sQLMode;
        }

        @JsonProperty(value = "sql_mode")
        public String getSQLMode() {
            return this.sQLMode;
        }

        private Integer syncBinlog;

        @JsonProperty(value = "sync_binlog")
        public void setSyncBinlog(Integer syncBinlog) {
            this.syncBinlog = syncBinlog;
        }

        @JsonProperty(value = "sync_binlog")
        public Integer getSyncBinlog() {
            return this.syncBinlog;
        }

        private Integer syncMasterInfo;

        @JsonProperty(value = "sync_master_info")
        public void setSyncMasterInfo(Integer syncMasterInfo) {
            this.syncMasterInfo = syncMasterInfo;
        }

        @JsonProperty(value = "sync_master_info")
        public Integer getSyncMasterInfo() {
            return this.syncMasterInfo;
        }

        private Integer syncRelayLog;

        @JsonProperty(value = "sync_relay_log")
        public void setSyncRelayLog(Integer syncRelayLog) {
            this.syncRelayLog = syncRelayLog;
        }

        @JsonProperty(value = "sync_relay_log")
        public Integer getSyncRelayLog() {
            return this.syncRelayLog;
        }

        private Integer syncRelayLogInfo;

        @JsonProperty(value = "sync_relay_log_info")
        public void setSyncRelayLogInfo(Integer syncRelayLogInfo) {
            this.syncRelayLogInfo = syncRelayLogInfo;
        }

        @JsonProperty(value = "sync_relay_log_info")
        public Integer getSyncRelayLogInfo() {
            return this.syncRelayLogInfo;
        }

        private Integer tableOpenCache;

        @JsonProperty(value = "table_open_cache")
        public void setTableOpenCache(Integer tableOpenCache) {
            this.tableOpenCache = tableOpenCache;
        }

        @JsonProperty(value = "table_open_cache")
        public Integer getTableOpenCache() {
            return this.tableOpenCache;
        }

        private Integer threadCacheSize;

        @JsonProperty(value = "thread_cache_size")
        public void setThreadCacheSize(Integer threadCacheSize) {
            this.threadCacheSize = threadCacheSize;
        }

        @JsonProperty(value = "thread_cache_size")
        public Integer getThreadCacheSize() {
            return this.threadCacheSize;
        }

        private String tMPTableSize;

        @JsonProperty(value = "tmp_table_size")
        public void setTMPTableSize(String tMPTableSize) {
            this.tMPTableSize = tMPTableSize;
        }

        @JsonProperty(value = "tmp_table_size")
        public String getTMPTableSize() {
            return this.tMPTableSize;
        }

        private String tMPDir;

        @JsonProperty(value = "tmpdir")
        public void setTMPDir(String tMPDir) {
            this.tMPDir = tMPDir;
        }

        @JsonProperty(value = "tmpdir")
        public String getTMPDir() {
            return this.tMPDir;
        }

        private String user;

        @JsonProperty(value = "user")
        public void setUser(String user) {
            this.user = user;
        }

        @JsonProperty(value = "user")
        public String getUser() {
            return this.user;
        }

        private Integer waitTimeout;

        @JsonProperty(value = "wait_timeout")
        public void setWaitTimeout(Integer waitTimeout) {
            this.waitTimeout = waitTimeout;
        }

        @JsonProperty(value = "wait_timeout")
        public Integer getWaitTimeout() {
            return this.waitTimeout;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RDBPrivateIPModel implements ParamValidate {
        private String master;

        @JsonProperty(value = "master")
        public void setMaster(String master) {
            this.master = master;
        }

        @JsonProperty(value = "master")
        public String getMaster() {
            return this.master;
        }

        private String topSlave;

        @JsonProperty(value = "topslave")
        public void setTopSlave(String topSlave) {
            this.topSlave = topSlave;
        }

        @JsonProperty(value = "topslave")
        public String getTopSlave() {
            return this.topSlave;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResourceModel implements ParamValidate {
        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceName;

        @JsonProperty(value = "resource_name")
        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        @JsonProperty(value = "resource_name")
        public String getResourceName() {
            return this.resourceName;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResourceTagPairModel implements ParamValidate {
        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private String tagID;

        @JsonProperty(value = "tag_id")
        public void setTagID(String tagID) {
            this.tagID = tagID;
        }

        @JsonProperty(value = "tag_id")
        public String getTagID() {
            return this.tagID;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResourceTypeCountModel implements ParamValidate {
        private Integer count;

        @JsonProperty(value = "count")
        public void setCount(Integer count) {
            this.count = count;
        }

        @JsonProperty(value = "count")
        public Integer getCount() {
            return this.count;
        }

        private String resourceType;

        @JsonProperty(value = "resource_type")
        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @JsonProperty(value = "resource_type")
        public String getResourceType() {
            return this.resourceType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RouterModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String dYNIPEnd;

        @JsonProperty(value = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @JsonProperty(value = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @JsonProperty(value = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @JsonProperty(value = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

        private EIPModel eIP;

        @JsonProperty(value = "eip")
        public void setEIP(EIPModel eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public EIPModel getEIP() {
            return this.eIP;
        }

        private String iPNetwork;

        @JsonProperty(value = "ip_network")
        public void setIPNetwork(String iPNetwork) {
            this.iPNetwork = iPNetwork;
        }

        @JsonProperty(value = "ip_network")
        public String getIPNetwork() {
            return this.iPNetwork;
        }

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private String managerIP;

        @JsonProperty(value = "manager_ip")
        public void setManagerIP(String managerIP) {
            this.managerIP = managerIP;
        }

        @JsonProperty(value = "manager_ip")
        public String getManagerIP() {
            return this.managerIP;
        }

        private Integer mode;

        @JsonProperty(value = "mode")
        public void setMode(Integer mode) {
            this.mode = mode;
        }

        @JsonProperty(value = "mode")
        public Integer getMode() {
            return this.mode;
        }

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerName;

        @JsonProperty(value = "router_name")
        public void setRouterName(String routerName) {
            this.routerName = routerName;
        }

        @JsonProperty(value = "router_name")
        public String getRouterName() {
            return this.routerName;
        }

    	// RouterType's available values: 1
        private Integer routerType;

        @JsonProperty(value = "router_type")
        public void setRouterType(Integer routerType) {
            this.routerType = routerType;
        }

        @JsonProperty(value = "router_type")
        public Integer getRouterType() {
            return this.routerType;
        }

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

    	// Status's available values: pending, active, poweroffed, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, updating, suspending, resuming, poweroffing, poweroning, deleting
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private String vpcNetwork;

        @JsonProperty(value = "vpc_network")
        public void setVpcNetwork(String vpcNetwork) {
            this.vpcNetwork = vpcNetwork;
        }

        @JsonProperty(value = "vpc_network")
        public String getVpcNetwork() {
            return this.vpcNetwork;
        }

        private List<VxNetModel> vxNets;

        @JsonProperty(value = "vxnets")
        public void setVxNets(List<VxNetModel> vxNets) {
            this.vxNets = vxNets;
        }

        @JsonProperty(value = "vxnets")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RouterStaticModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private List<RouterStaticEntrySimpleModel> entrySet;

        @JsonProperty(value = "entry_set")
        public void setEntrySet(List<RouterStaticEntrySimpleModel> entrySet) {
            this.entrySet = entrySet;
        }

        @JsonProperty(value = "entry_set")
        public List<RouterStaticEntrySimpleModel> getEntrySet() {
            return this.entrySet;
        }

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerStaticID;

        @JsonProperty(value = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @JsonProperty(value = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String routerStaticName;

        @JsonProperty(value = "router_static_name")
        public void setRouterStaticName(String routerStaticName) {
            this.routerStaticName = routerStaticName;
        }

        @JsonProperty(value = "router_static_name")
        public String getRouterStaticName() {
            return this.routerStaticName;
        }

    	// StaticType's available values: 1, 2, 3, 4, 5, 6, 7, 8
        private Integer staticType;

        @JsonProperty(value = "static_type")
        public void setStaticType(Integer staticType) {
            this.staticType = staticType;
        }

        @JsonProperty(value = "static_type")
        public Integer getStaticType() {
            return this.staticType;
        }

        private String val1;

        @JsonProperty(value = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @JsonProperty(value = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }

        private String val3;

        @JsonProperty(value = "val3")
        public void setVal3(String val3) {
            this.val3 = val3;
        }

        @JsonProperty(value = "val3")
        public String getVal3() {
            return this.val3;
        }

        private String val4;

        @JsonProperty(value = "val4")
        public void setVal4(String val4) {
            this.val4 = val4;
        }

        @JsonProperty(value = "val4")
        public String getVal4() {
            return this.val4;
        }

        private String val5;

        @JsonProperty(value = "val5")
        public void setVal5(String val5) {
            this.val5 = val5;
        }

        @JsonProperty(value = "val5")
        public String getVal5() {
            return this.val5;
        }

        private String val6;

        @JsonProperty(value = "val6")
        public void setVal6(String val6) {
            this.val6 = val6;
        }

        @JsonProperty(value = "val6")
        public String getVal6() {
            return this.val6;
        }

        private String val7;

        @JsonProperty(value = "val7")
        public void setVal7(String val7) {
            this.val7 = val7;
        }

        @JsonProperty(value = "val7")
        public String getVal7() {
            return this.val7;
        }

        private String val8;

        @JsonProperty(value = "val8")
        public void setVal8(String val8) {
            this.val8 = val8;
        }

        @JsonProperty(value = "val8")
        public String getVal8() {
            return this.val8;
        }

        private String val9;

        @JsonProperty(value = "val9")
        public void setVal9(String val9) {
            this.val9 = val9;
        }

        @JsonProperty(value = "val9")
        public String getVal9() {
            return this.val9;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RouterStaticEntryModel implements ParamValidate {
        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
        }

        private String routerStaticEntryID;

        @JsonProperty(value = "router_static_entry_id")
        public void setRouterStaticEntryID(String routerStaticEntryID) {
            this.routerStaticEntryID = routerStaticEntryID;
        }

        @JsonProperty(value = "router_static_entry_id")
        public String getRouterStaticEntryID() {
            return this.routerStaticEntryID;
        }

        private String routerStaticEntryName;

        @JsonProperty(value = "router_static_entry_name")
        public void setRouterStaticEntryName(String routerStaticEntryName) {
            this.routerStaticEntryName = routerStaticEntryName;
        }

        @JsonProperty(value = "router_static_entry_name")
        public String getRouterStaticEntryName() {
            return this.routerStaticEntryName;
        }

        private String routerStaticID;

        @JsonProperty(value = "router_static_id")
        public void setRouterStaticID(String routerStaticID) {
            this.routerStaticID = routerStaticID;
        }

        @JsonProperty(value = "router_static_id")
        public String getRouterStaticID() {
            return this.routerStaticID;
        }

        private String val1;

        @JsonProperty(value = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @JsonProperty(value = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RouterStaticEntrySimpleModel implements ParamValidate {
        private String routerStaticEntryID;

        @JsonProperty(value = "router_static_entry_id")
        public void setRouterStaticEntryID(String routerStaticEntryID) {
            this.routerStaticEntryID = routerStaticEntryID;
        }

        @JsonProperty(value = "router_static_entry_id")
        public String getRouterStaticEntryID() {
            return this.routerStaticEntryID;
        }

        private String val1;

        @JsonProperty(value = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @JsonProperty(value = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RouterVxNetModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
        }

        private String dYNIPEnd;

        @JsonProperty(value = "dyn_ip_end")
        public void setDYNIPEnd(String dYNIPEnd) {
            this.dYNIPEnd = dYNIPEnd;
        }

        @JsonProperty(value = "dyn_ip_end")
        public String getDYNIPEnd() {
            return this.dYNIPEnd;
        }

        private String dYNIPStart;

        @JsonProperty(value = "dyn_ip_start")
        public void setDYNIPStart(String dYNIPStart) {
            this.dYNIPStart = dYNIPStart;
        }

        @JsonProperty(value = "dyn_ip_start")
        public String getDYNIPStart() {
            return this.dYNIPStart;
        }

        private Integer features;

        @JsonProperty(value = "features")
        public void setFeatures(Integer features) {
            this.features = features;
        }

        @JsonProperty(value = "features")
        public Integer getFeatures() {
            return this.features;
        }

        private String iPNetwork;

        @JsonProperty(value = "ip_network")
        public void setIPNetwork(String iPNetwork) {
            this.iPNetwork = iPNetwork;
        }

        @JsonProperty(value = "ip_network")
        public String getIPNetwork() {
            return this.iPNetwork;
        }

        private String managerIP;

        @JsonProperty(value = "manager_ip")
        public void setManagerIP(String managerIP) {
            this.managerIP = managerIP;
        }

        @JsonProperty(value = "manager_ip")
        public String getManagerIP() {
            return this.managerIP;
        }

        private String routerID;

        @JsonProperty(value = "router_id")
        public void setRouterID(String routerID) {
            this.routerID = routerID;
        }

        @JsonProperty(value = "router_id")
        public String getRouterID() {
            return this.routerID;
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


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class S2DefaultParametersModel implements ParamValidate {
        private String defaultValue;

        @JsonProperty(value = "default_value")
        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        @JsonProperty(value = "default_value")
        public String getDefaultValue() {
            return this.defaultValue;
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

        private String paramName;

        @JsonProperty(value = "param_name")
        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        @JsonProperty(value = "param_name")
        public String getParamName() {
            return this.paramName;
        }

        private String serviceType;

        @JsonProperty(value = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @JsonProperty(value = "service_type")
        public String getServiceType() {
            return this.serviceType;
        }

        private String targetType;

        @JsonProperty(value = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @JsonProperty(value = "target_type")
        public String getTargetType() {
            return this.targetType;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class S2ServerModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IsApplied's available values: 0, 1
        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
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

        private String privateIP;

        @JsonProperty(value = "private_ip")
        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        @JsonProperty(value = "private_ip")
        public String getPrivateIP() {
            return this.privateIP;
        }

        private String s2ServerID;

        @JsonProperty(value = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @JsonProperty(value = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
        }

    	// S2ServerType's available values: 0, 1, 2, 3
        private Integer s2ServerType;

        @JsonProperty(value = "s2_server_type")
        public void setS2ServerType(Integer s2ServerType) {
            this.s2ServerType = s2ServerType;
        }

        @JsonProperty(value = "s2_server_type")
        public Integer getS2ServerType() {
            return this.s2ServerType;
        }

    	// ServiceType's available values: vsan
        private String serviceType;

        @JsonProperty(value = "service_type")
        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @JsonProperty(value = "service_type")
        public String getServiceType() {
            return this.serviceType;
        }

    	// Status's available values: pending, active, poweroffed, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, updating, suspending, resuming, poweroffing
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private VxNetModel vxNet;

        @JsonProperty(value = "vxnet")
        public void setVxNet(VxNetModel vxNet) {
            this.vxNet = vxNet;
        }

        @JsonProperty(value = "vxnet")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class S2SharedTargetModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String exportName;

        @JsonProperty(value = "export_name")
        public void setExportName(String exportName) {
            this.exportName = exportName;
        }

        @JsonProperty(value = "export_name")
        public String getExportName() {
            return this.exportName;
        }

        private String s2ServerID;

        @JsonProperty(value = "s2_server_id")
        public void setS2ServerID(String s2ServerID) {
            this.s2ServerID = s2ServerID;
        }

        @JsonProperty(value = "s2_server_id")
        public String getS2ServerID() {
            return this.s2ServerID;
        }

        private String s2SharedTargetID;

        @JsonProperty(value = "s2_shared_target_id")
        public void setS2SharedTargetID(String s2SharedTargetID) {
            this.s2SharedTargetID = s2SharedTargetID;
        }

        @JsonProperty(value = "s2_shared_target_id")
        public String getS2SharedTargetID() {
            return this.s2SharedTargetID;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

    	// TargetType's available values: ISCSI, NFS
        private String targetType;

        @JsonProperty(value = "target_type")
        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        @JsonProperty(value = "target_type")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SecurityGroupModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private Integer isApplied;

        @JsonProperty(value = "is_applied")
        public void setIsApplied(Integer isApplied) {
            this.isApplied = isApplied;
        }

        @JsonProperty(value = "is_applied")
        public Integer getIsApplied() {
            return this.isApplied;
        }

        private Integer isDefault;

        @JsonProperty(value = "is_default")
        public void setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
        }

        @JsonProperty(value = "is_default")
        public Integer getIsDefault() {
            return this.isDefault;
        }

        private List<ResourceModel> resources;

        @JsonProperty(value = "resources")
        public void setResources(List<ResourceModel> resources) {
            this.resources = resources;
        }

        @JsonProperty(value = "resources")
        public List<ResourceModel> getResources() {
            return this.resources;
        }

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupName;

        @JsonProperty(value = "security_group_name")
        public void setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
        }

        @JsonProperty(value = "security_group_name")
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SecurityGroupIPSetModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

    	// IPSetType's available values: 0, 1
        private Integer iPSetType;

        @JsonProperty(value = "ipset_type")
        public void setIPSetType(Integer iPSetType) {
            this.iPSetType = iPSetType;
        }

        @JsonProperty(value = "ipset_type")
        public Integer getIPSetType() {
            return this.iPSetType;
        }

        private String securityGroupIPSetID;

        @JsonProperty(value = "security_group_ipset_id")
        public void setSecurityGroupIPSetID(String securityGroupIPSetID) {
            this.securityGroupIPSetID = securityGroupIPSetID;
        }

        @JsonProperty(value = "security_group_ipset_id")
        public String getSecurityGroupIPSetID() {
            return this.securityGroupIPSetID;
        }

        private String securityGroupIPSetName;

        @JsonProperty(value = "security_group_ipset_name")
        public void setSecurityGroupIPSetName(String securityGroupIPSetName) {
            this.securityGroupIPSetName = securityGroupIPSetName;
        }

        @JsonProperty(value = "security_group_ipset_name")
        public String getSecurityGroupIPSetName() {
            return this.securityGroupIPSetName;
        }

        private String val;

        @JsonProperty(value = "val")
        public void setVal(String val) {
            this.val = val;
        }

        @JsonProperty(value = "val")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SecurityGroupRuleModel implements ParamValidate {
    	// Action's available values: accept, drop
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

    	// Direction's available values: 0, 1
        private Integer direction;

        @JsonProperty(value = "direction")
        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        @JsonProperty(value = "direction")
        public Integer getDirection() {
            return this.direction;
        }

        private Integer priority;

        @JsonProperty(value = "priority")
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        @JsonProperty(value = "priority")
        public Integer getPriority() {
            return this.priority;
        }

        private String protocol;

        @JsonProperty(value = "protocol")
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        @JsonProperty(value = "protocol")
        public String getProtocol() {
            return this.protocol;
        }

        private String securityGroupID;

        @JsonProperty(value = "security_group_id")
        public void setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
        }

        @JsonProperty(value = "security_group_id")
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        private String securityGroupRuleID;

        @JsonProperty(value = "security_group_rule_id")
        public void setSecurityGroupRuleID(String securityGroupRuleID) {
            this.securityGroupRuleID = securityGroupRuleID;
        }

        @JsonProperty(value = "security_group_rule_id")
        public String getSecurityGroupRuleID() {
            return this.securityGroupRuleID;
        }

        private String securityGroupRuleName;

        @JsonProperty(value = "security_group_rule_name")
        public void setSecurityGroupRuleName(String securityGroupRuleName) {
            this.securityGroupRuleName = securityGroupRuleName;
        }

        @JsonProperty(value = "security_group_rule_name")
        public String getSecurityGroupRuleName() {
            return this.securityGroupRuleName;
        }

        private String val1;

        @JsonProperty(value = "val1")
        public void setVal1(String val1) {
            this.val1 = val1;
        }

        @JsonProperty(value = "val1")
        public String getVal1() {
            return this.val1;
        }

        private String val2;

        @JsonProperty(value = "val2")
        public void setVal2(String val2) {
            this.val2 = val2;
        }

        @JsonProperty(value = "val2")
        public String getVal2() {
            return this.val2;
        }

        private String val3;

        @JsonProperty(value = "val3")
        public void setVal3(String val3) {
            this.val3 = val3;
        }

        @JsonProperty(value = "val3")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SecurityGroupSnapshotModel implements ParamValidate {
        private String groupID;

        @JsonProperty(value = "group_id")
        public void setGroupID(String groupID) {
            this.groupID = groupID;
        }

        @JsonProperty(value = "group_id")
        public String getGroupID() {
            return this.groupID;
        }

        private List<SecurityGroupRuleModel> rules;

        @JsonProperty(value = "rules")
        public void setRules(List<SecurityGroupRuleModel> rules) {
            this.rules = rules;
        }

        @JsonProperty(value = "rules")
        public List<SecurityGroupRuleModel> getRules() {
            return this.rules;
        }

        private String securityGroupSnapshotID;

        @JsonProperty(value = "security_group_snapshot_id")
        public void setSecurityGroupSnapshotID(String securityGroupSnapshotID) {
            this.securityGroupSnapshotID = securityGroupSnapshotID;
        }

        @JsonProperty(value = "security_group_snapshot_id")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ServerCertificateModel implements ParamValidate {
        private String certificateContent;

        @JsonProperty(value = "certificate_content")
        public void setCertificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
        }

        @JsonProperty(value = "certificate_content")
        public String getCertificateContent() {
            return this.certificateContent;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String privateKey;

        @JsonProperty(value = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @JsonProperty(value = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
        }

        private String serverCertificateID;

        @JsonProperty(value = "server_certificate_id")
        public void setServerCertificateID(String serverCertificateID) {
            this.serverCertificateID = serverCertificateID;
        }

        @JsonProperty(value = "server_certificate_id")
        public String getServerCertificateID() {
            return this.serverCertificateID;
        }

        private String serverCertificateName;

        @JsonProperty(value = "server_certificate_name")
        public void setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
        }

        @JsonProperty(value = "server_certificate_name")
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SnapshotModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private Integer headChain;

        @JsonProperty(value = "head_chain")
        public void setHeadChain(Integer headChain) {
            this.headChain = headChain;
        }

        @JsonProperty(value = "head_chain")
        public Integer getHeadChain() {
            return this.headChain;
        }

    	// IsHead's available values: 0, 1
        private Integer isHead;

        @JsonProperty(value = "is_head")
        public void setIsHead(Integer isHead) {
            this.isHead = isHead;
        }

        @JsonProperty(value = "is_head")
        public Integer getIsHead() {
            return this.isHead;
        }

    	// IsTaken's available values: 0, 1
        private Integer isTaken;

        @JsonProperty(value = "is_taken")
        public void setIsTaken(Integer isTaken) {
            this.isTaken = isTaken;
        }

        @JsonProperty(value = "is_taken")
        public Integer getIsTaken() {
            return this.isTaken;
        }

        private String latestSnapshotTime;

        @JsonProperty(value = "latest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @JsonProperty(value = "latest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
        }

        private String parentID;

        @JsonProperty(value = "parent_id")
        public void setParentID(String parentID) {
            this.parentID = parentID;
        }

        @JsonProperty(value = "parent_id")
        public String getParentID() {
            return this.parentID;
        }

        private String provider;

        @JsonProperty(value = "provider")
        public void setProvider(String provider) {
            this.provider = provider;
        }

        @JsonProperty(value = "provider")
        public String getProvider() {
            return this.provider;
        }

        private ResourceModel resource;

        @JsonProperty(value = "resource")
        public void setResource(ResourceModel resource) {
            this.resource = resource;
        }

        @JsonProperty(value = "resource")
        public ResourceModel getResource() {
            return this.resource;
        }

        private String rootID;

        @JsonProperty(value = "root_id")
        public void setRootID(String rootID) {
            this.rootID = rootID;
        }

        @JsonProperty(value = "root_id")
        public String getRootID() {
            return this.rootID;
        }

        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
        }

        private String snapshotID;

        @JsonProperty(value = "snapshot_id")
        public void setSnapshotID(String snapshotID) {
            this.snapshotID = snapshotID;
        }

        @JsonProperty(value = "snapshot_id")
        public String getSnapshotID() {
            return this.snapshotID;
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

        private SnapshotResourceModel snapshotResource;

        @JsonProperty(value = "snapshot_resource")
        public void setSnapshotResource(SnapshotResourceModel snapshotResource) {
            this.snapshotResource = snapshotResource;
        }

        @JsonProperty(value = "snapshot_resource")
        public SnapshotResourceModel getSnapshotResource() {
            return this.snapshotResource;
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

    	// Status's available values: pending, available, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
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

        private Integer totalSize;

        @JsonProperty(value = "total_size")
        public void setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
        }

        @JsonProperty(value = "total_size")
        public Integer getTotalSize() {
            return this.totalSize;
        }

    	// TransitionStatus's available values: creating, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private Integer virtualSize;

        @JsonProperty(value = "virtual_size")
        public void setVirtualSize(Integer virtualSize) {
            this.virtualSize = virtualSize;
        }

        @JsonProperty(value = "virtual_size")
        public Integer getVirtualSize() {
            return this.virtualSize;
        }

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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SnapshotResourceModel implements ParamValidate {
        private String oSFamily;

        @JsonProperty(value = "os_family")
        public void setOSFamily(String oSFamily) {
            this.oSFamily = oSFamily;
        }

        @JsonProperty(value = "os_family")
        public String getOSFamily() {
            return this.oSFamily;
        }

        private String platform;

        @JsonProperty(value = "platform")
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @JsonProperty(value = "platform")
        public String getPlatform() {
            return this.platform;
        }


        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TagModel implements ParamValidate {
        private String color;

        @JsonProperty(value = "color")
        public void setColor(String color) {
            this.color = color;
        }

        @JsonProperty(value = "color")
        public String getColor() {
            return this.color;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String owner;

        @JsonProperty(value = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @JsonProperty(value = "owner")
        public String getOwner() {
            return this.owner;
        }

        private Integer resourceCount;

        @JsonProperty(value = "resource_count")
        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        @JsonProperty(value = "resource_count")
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        private List<ResourceTagPairModel> resourceTagPairs;

        @JsonProperty(value = "resource_tag_pairs")
        public void setResourceTagPairs(List<ResourceTagPairModel> resourceTagPairs) {
            this.resourceTagPairs = resourceTagPairs;
        }

        @JsonProperty(value = "resource_tag_pairs")
        public List<ResourceTagPairModel> getResourceTagPairs() {
            return this.resourceTagPairs;
        }

        private List<ResourceTypeCountModel> resourceTypeCount;

        @JsonProperty(value = "resource_type_count")
        public void setResourceTypeCount(List<ResourceTypeCountModel> resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
        }

        @JsonProperty(value = "resource_type_count")
        public List<ResourceTypeCountModel> getResourceTypeCount() {
            return this.resourceTypeCount;
        }

        private String tagID;

        @JsonProperty(value = "tag_id")
        public void setTagID(String tagID) {
            this.tagID = tagID;
        }

        @JsonProperty(value = "tag_id")
        public String getTagID() {
            return this.tagID;
        }

        private String tagKey;

        @JsonProperty(value = "tag_key")
        public void setTagKey(String tagKey) {
            this.tagKey = tagKey;
        }

        @JsonProperty(value = "tag_key")
        public String getTagKey() {
            return this.tagKey;
        }

        private String tagName;

        @JsonProperty(value = "tag_name")
        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        @JsonProperty(value = "tag_name")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UserModel implements ParamValidate {
        private String email;

        @JsonProperty(value = "email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty(value = "email")
        public String getEmail() {
            return this.email;
        }

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
    public static class VolumeModel implements ParamValidate {
        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private String device;

        @JsonProperty(value = "device")
        public void setDevice(String device) {
            this.device = device;
        }

        @JsonProperty(value = "device")
        public String getDevice() {
            return this.device;
        }

        private InstanceModel instance;

        @JsonProperty(value = "instance")
        public void setInstance(InstanceModel instance) {
            this.instance = instance;
        }

        @JsonProperty(value = "instance")
        public InstanceModel getInstance() {
            return this.instance;
        }

        private List<InstanceModel> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<InstanceModel> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<InstanceModel> getInstances() {
            return this.instances;
        }

        private String latestSnapshotTime;

        @JsonProperty(value = "lastest_snapshot_time")
        public void setLatestSnapshotTime(String latestSnapshotTime) {
            this.latestSnapshotTime = latestSnapshotTime;
        }

        @JsonProperty(value = "lastest_snapshot_time")
        public String getLatestSnapshotTime() {
            return this.latestSnapshotTime;
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

        private String placeGroupID;

        @JsonProperty(value = "place_group_id")
        public void setPlaceGroupID(String placeGroupID) {
            this.placeGroupID = placeGroupID;
        }

        @JsonProperty(value = "place_group_id")
        public String getPlaceGroupID() {
            return this.placeGroupID;
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

        private Integer size;

        @JsonProperty(value = "size")
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value = "size")
        public Integer getSize() {
            return this.size;
        }

    	// Status's available values: pending, available, in-use, suspended, deleted, ceased
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
        }

        private String statusTime;

        @JsonProperty(value = "status_time")
        public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        @JsonProperty(value = "status_time")
        public String getStatusTime() {
            return this.statusTime;
        }

        private Integer subCode;

        @JsonProperty(value = "sub_code")
        public void setSubCode(Integer subCode) {
            this.subCode = subCode;
        }

        @JsonProperty(value = "sub_code")
        public Integer getSubCode() {
            return this.subCode;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

    	// TransitionStatus's available values: creating, attaching, detaching, suspending, resuming, deleting, recovering
        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
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

        private String volumeName;

        @JsonProperty(value = "volume_name")
        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        @JsonProperty(value = "volume_name")
        public String getVolumeName() {
            return this.volumeName;
        }

    	// VolumeType's available values: 0, 1, 2, 3
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class VxNetModel implements ParamValidate {
        private Integer availableIPCount;

        @JsonProperty(value = "available_ip_count")
        public void setAvailableIPCount(Integer availableIPCount) {
            this.availableIPCount = availableIPCount;
        }

        @JsonProperty(value = "available_ip_count")
        public Integer getAvailableIPCount() {
            return this.availableIPCount;
        }

        private String createTime;

        @JsonProperty(value = "create_time")
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @JsonProperty(value = "create_time")
        public String getCreateTime() {
            return this.createTime;
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

        private List<String> instanceIDs;

        @JsonProperty(value = "instance_ids")
        public void setInstanceIDs(List<String> instanceIDs) {
            this.instanceIDs = instanceIDs;
        }

        @JsonProperty(value = "instance_ids")
        public List<String> getInstanceIDs() {
            return this.instanceIDs;
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

        private RouterModel router;

        @JsonProperty(value = "router")
        public void setRouter(RouterModel router) {
            this.router = router;
        }

        @JsonProperty(value = "router")
        public RouterModel getRouter() {
            return this.router;
        }

        private List<TagModel> tags;

        @JsonProperty(value = "tags")
        public void setTags(List<TagModel> tags) {
            this.tags = tags;
        }

        @JsonProperty(value = "tags")
        public List<TagModel> getTags() {
            return this.tags;
        }

        private String vpcRouterID;

        @JsonProperty(value = "vpc_router_id")
        public void setVpcRouterID(String vpcRouterID) {
            this.vpcRouterID = vpcRouterID;
        }

        @JsonProperty(value = "vpc_router_id")
        public String getVpcRouterID() {
            return this.vpcRouterID;
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

        private String vxNetName;

        @JsonProperty(value = "vxnet_name")
        public void setVxNetName(String vxNetName) {
            this.vxNetName = vxNetName;
        }

        @JsonProperty(value = "vxnet_name")
        public String getVxNetName() {
            return this.vxNetName;
        }

    	// VxNetType's available values: 0, 1
        private Integer vxNetType;

        @JsonProperty(value = "vxnet_type")
        public void setVxNetType(Integer vxNetType) {
            this.vxNetType = vxNetType;
        }

        @JsonProperty(value = "vxnet_type")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ZoneModel implements ParamValidate {
    	// Status's available values: active, faulty, defunct
        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
            return this.status;
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



















