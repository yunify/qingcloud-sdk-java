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

// QingCloudService: QingCloud provides a platform which can make the delivery of computing resources more simple, efficient and reliable, even more environmental.
public class QingCloudService {

    private EnvContext envContext;

    private String zone;

    public QingCloudService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public QingCloudService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/zone/describe_zones.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeZonesOutput describeZones(DescribeZonesInput input) throws QCException {
        if (input == null) {
            input = new DescribeZonesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeZones");
        context.put("APIName", "DescribeZones");
        context.put("ServiceName", "DescribeZones");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeZones");

        input.setAction("DescribeZones");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeZonesOutput.class);
        if(backModel != null){
            return (DescribeZonesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/zone/describe_zones.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeZones(DescribeZonesInput input, ResponseCallBack<DescribeZonesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeZonesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeZones");
        context.put("APIName", "DescribeZones");
        context.put("ServiceName", "DescribeZones");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeZones");

        input.setAction("DescribeZones");
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

    public static class DescribeZonesInput extends IaasParamBody {
        private List<String> status;

        @JsonProperty(value = "status")
        public void setStatus(List<String> status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public List<String> getStatus() {
            return this.status;
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
    public static class DescribeZonesOutput extends OutputModel {
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

        private List<ZoneModel> zoneSet;

        @JsonProperty(value = "zone_set")
        public void setZoneSet(List<ZoneModel> zoneSet) {
            this.zoneSet = zoneSet;
        }

        @JsonProperty(value = "zone_set")
        public List<ZoneModel> getZoneSet() {
            return this.zoneSet;
        }

    }


    public AppService getAppService(String zone) {
        return new AppService(this.envContext, zone);
    }

    public CacheService getCacheService(String zone) {
        return new CacheService(this.envContext, zone);
    }

    public ClusterService getClusterService(String zone) {
        return new ClusterService(this.envContext, zone);
    }

    public DNSAliasService getDNSAliasService(String zone) {
        return new DNSAliasService(this.envContext, zone);
    }

    public EIPService getEIPService(String zone) {
        return new EIPService(this.envContext, zone);
    }

    public ImageService getImageService(String zone) {
        return new ImageService(this.envContext, zone);
    }

    public InstanceService getInstanceService(String zone) {
        return new InstanceService(this.envContext, zone);
    }

    public JobService getJobService(String zone) {
        return new JobService(this.envContext, zone);
    }

    public KeyPairService getKeyPairService(String zone) {
        return new KeyPairService(this.envContext, zone);
    }

    public LoadBalancerService getLoadBalancerService(String zone) {
        return new LoadBalancerService(this.envContext, zone);
    }

    public MiscService getMiscService(String zone) {
        return new MiscService(this.envContext, zone);
    }

    public MongoService getMongoService(String zone) {
        return new MongoService(this.envContext, zone);
    }

    public MonitorService getMonitorService(String zone) {
        return new MonitorService(this.envContext, zone);
    }

    public NicService getNicService(String zone) {
        return new NicService(this.envContext, zone);
    }

    public RDBService getRDBService(String zone) {
        return new RDBService(this.envContext, zone);
    }

    public RouterService getRouterService(String zone) {
        return new RouterService(this.envContext, zone);
    }

    public SecurityGroupService getSecurityGroupService(String zone) {
        return new SecurityGroupService(this.envContext, zone);
    }

    public SharedStorageService getSharedStorageService(String zone) {
        return new SharedStorageService(this.envContext, zone);
    }

    public SnapshotService getSnapshotService(String zone) {
        return new SnapshotService(this.envContext, zone);
    }

    public TagService getTagService(String zone) {
        return new TagService(this.envContext, zone);
    }

    public UserDataService getUserDataService(String zone) {
        return new UserDataService(this.envContext, zone);
    }

    public VolumeService getVolumeService(String zone) {
        return new VolumeService(this.envContext, zone);
    }

    public VxNetService getVxNetService(String zone) {
        return new VxNetService(this.envContext, zone);
    }

    public AppService getAppService() {
        return new AppService(this.envContext);
    }

    public CacheService getCacheService() {
        return new CacheService(this.envContext);
    }

    public ClusterService getClusterService() {
        return new ClusterService(this.envContext);
    }

    public DNSAliasService getDNSAliasService() {
        return new DNSAliasService(this.envContext);
    }

    public EIPService getEIPService() {
        return new EIPService(this.envContext);
    }

    public ImageService getImageService() {
        return new ImageService(this.envContext);
    }

    public InstanceService getInstanceService() {
        return new InstanceService(this.envContext);
    }

    public JobService getJobService() {
        return new JobService(this.envContext);
    }

    public KeyPairService getKeyPairService() {
        return new KeyPairService(this.envContext);
    }

    public LoadBalancerService getLoadBalancerService() {
        return new LoadBalancerService(this.envContext);
    }

    public MiscService getMiscService() {
        return new MiscService(this.envContext);
    }

    public MongoService getMongoService() {
        return new MongoService(this.envContext);
    }

    public MonitorService getMonitorService() {
        return new MonitorService(this.envContext);
    }

    public NicService getNicService() {
        return new NicService(this.envContext);
    }

    public RDBService getRDBService() {
        return new RDBService(this.envContext);
    }

    public RouterService getRouterService() {
        return new RouterService(this.envContext);
    }

    public SecurityGroupService getSecurityGroupService() {
        return new SecurityGroupService(this.envContext);
    }

    public SharedStorageService getSharedStorageService() {
        return new SharedStorageService(this.envContext);
    }

    public SnapshotService getSnapshotService() {
        return new SnapshotService(this.envContext);
    }

    public TagService getTagService() {
        return new TagService(this.envContext);
    }

    public UserDataService getUserDataService() {
        return new UserDataService(this.envContext);
    }

    public VolumeService getVolumeService() {
        return new VolumeService(this.envContext);
    }

    public VxNetService getVxNetService() {
        return new VxNetService(this.envContext);
    }
}



















