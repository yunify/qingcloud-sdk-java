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

public class ClusterService {

    private EnvContext envContext;

    private String zone;

    public ClusterService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public ClusterService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AddClusterNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/add_cluster_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AddClusterNodesOutput addClusterNodes(AddClusterNodesInput input) throws QCException {
        if (input == null) {
            input = new AddClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddClusterNodes");
        context.put("APIName", "AddClusterNodes");
        context.put("ServiceName", "AddClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddClusterNodes");

        input.setAction("AddClusterNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AddClusterNodesOutput.class);
        if(backModel != null){
            return (AddClusterNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/add_cluster_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addClusterNodes(AddClusterNodesInput input, ResponseCallBack<AddClusterNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new AddClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AddClusterNodes");
        context.put("APIName", "AddClusterNodes");
        context.put("ServiceName", "AddClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AddClusterNodes");

        input.setAction("AddClusterNodes");
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

    public static class AddClusterNodesInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
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

        private String nodeName;

        @JsonProperty(value = "node_name")
        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        @JsonProperty(value = "node_name")
        public String getNodeName() {
            return this.nodeName;
        }

        private String nodeRole;

        @JsonProperty(value = "node_role")
        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        @JsonProperty(value = "node_role")
        public String getNodeRole() {
            return this.nodeRole;
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

        private String resourceConf;

        @JsonProperty(value = "resource_conf")
        public void setResourceConf(String resourceConf) {
            this.resourceConf = resourceConf;
        }

        @JsonProperty(value = "resource_conf")
        public String getResourceConf() {
            return this.resourceConf;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (this.getNodeCount() < 0 ) {
                throw new QCException("NodeCount is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddClusterNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String jobID;

        @JsonProperty(value = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @JsonProperty(value = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private List<String> newNodeIDs;

        @JsonProperty(value = "new_node_ids")
        public void setNewNodeIDs(List<String> newNodeIDs) {
            this.newNodeIDs = newNodeIDs;
        }

        @JsonProperty(value = "new_node_ids")
        public List<String> getNewNodeIDs() {
            return this.newNodeIDs;
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
      * @return AssociateEIPToClusterNodeOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/associate_eip_to_cluster_node.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AssociateEIPToClusterNodeOutput associateEIPToClusterNode(AssociateEIPToClusterNodeInput input) throws QCException {
        if (input == null) {
            input = new AssociateEIPToClusterNodeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEipToClusterNode");
        context.put("APIName", "AssociateEipToClusterNode");
        context.put("ServiceName", "AssociateEipToClusterNode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEipToClusterNode");

        input.setAction("AssociateEipToClusterNode");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AssociateEIPToClusterNodeOutput.class);
        if(backModel != null){
            return (AssociateEIPToClusterNodeOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/associate_eip_to_cluster_node.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void associateEIPToClusterNode(AssociateEIPToClusterNodeInput input, ResponseCallBack<AssociateEIPToClusterNodeOutput> callback) throws QCException {
        if (input == null) {
            input = new AssociateEIPToClusterNodeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateEIPToClusterNode");
        context.put("APIName", "AssociateEIPToClusterNode");
        context.put("ServiceName", "AssociateEipToClusterNode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateEipToClusterNode");

        input.setAction("AssociateEIPToClusterNode");
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

    public static class AssociateEIPToClusterNodeInput extends IaasParamBody {
        // Required
        private String clusterNode;

        @JsonProperty(value = "cluster_node")
        public void setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
        }

        @JsonProperty(value = "cluster_node")
        public String getClusterNode() {
            return this.clusterNode;
        }

        // Required
        private String eIP;

        @JsonProperty(value = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @JsonProperty(value = "eip")
        public String getEIP() {
            return this.eIP;
        }

        private String nIC;

        @JsonProperty(value = "nic")
        public void setNIC(String nIC) {
            this.nIC = nIC;
        }

        @JsonProperty(value = "nic")
        public String getNIC() {
            return this.nIC;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getClusterNode())) {
                throw new QCException("ClusterNode is required");
            }
            if (QCStringUtil.isEmpty(this.getEIP())) {
                throw new QCException("EIP is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssociateEIPToClusterNodeOutput extends OutputModel {
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
      * @return CeaseClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/cease_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CeaseClustersOutput ceaseClusters(CeaseClustersInput input) throws QCException {
        if (input == null) {
            input = new CeaseClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseClusters");
        context.put("APIName", "CeaseClusters");
        context.put("ServiceName", "CeaseClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseClusters");

        input.setAction("CeaseClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CeaseClustersOutput.class);
        if(backModel != null){
            return (CeaseClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/cease_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void ceaseClusters(CeaseClustersInput input, ResponseCallBack<CeaseClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new CeaseClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CeaseClusters");
        context.put("APIName", "CeaseClusters");
        context.put("ServiceName", "CeaseClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CeaseClusters");

        input.setAction("CeaseClusters");
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

    public static class CeaseClustersInput extends IaasParamBody {
        // Required
        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CeaseClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @JsonProperty(value = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @JsonProperty(value = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * @return ChangeClusterVxNetOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/change_cluster_vxnet.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ChangeClusterVxNetOutput changeClusterVxNet(ChangeClusterVxNetInput input) throws QCException {
        if (input == null) {
            input = new ChangeClusterVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeClusterVxnet");
        context.put("APIName", "ChangeClusterVxnet");
        context.put("ServiceName", "ChangeClusterVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeClusterVxnet");

        input.setAction("ChangeClusterVxnet");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ChangeClusterVxNetOutput.class);
        if(backModel != null){
            return (ChangeClusterVxNetOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/change_cluster_vxnet.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void changeClusterVxNet(ChangeClusterVxNetInput input, ResponseCallBack<ChangeClusterVxNetOutput> callback) throws QCException {
        if (input == null) {
            input = new ChangeClusterVxNetInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ChangeClusterVxNet");
        context.put("APIName", "ChangeClusterVxNet");
        context.put("ServiceName", "ChangeClusterVxnet");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ChangeClusterVxnet");

        input.setAction("ChangeClusterVxNet");
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

    public static class ChangeClusterVxNetInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Model privateIPs;

        @JsonProperty(value = "private_ips")
        public void setPrivateIPs(Model privateIPs) {
            this.privateIPs = privateIPs;
        }

        @JsonProperty(value = "private_ips")
        public Model getPrivateIPs() {
            return this.privateIPs;
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
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChangeClusterVxNetOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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
      * @return CreateClusterOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/create_cluster.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateClusterOutput createCluster(CreateClusterInput input) throws QCException {
        if (input == null) {
            input = new CreateClusterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCluster");
        context.put("APIName", "CreateCluster");
        context.put("ServiceName", "CreateCluster");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCluster");

        input.setAction("CreateCluster");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateClusterOutput.class);
        if(backModel != null){
            return (CreateClusterOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/create_cluster.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createCluster(CreateClusterInput input, ResponseCallBack<CreateClusterOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateClusterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateCluster");
        context.put("APIName", "CreateCluster");
        context.put("ServiceName", "CreateCluster");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateCluster");

        input.setAction("CreateCluster");
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

    public static class CreateClusterInput extends IaasParamBody {
        // Required
        private String conf;

        @JsonProperty(value = "conf")
        public void setConf(String conf) {
            this.conf = conf;
        }

        @JsonProperty(value = "conf")
        public String getConf() {
            return this.conf;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getConf())) {
                throw new QCException("Conf is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateClusterOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return CreateClusterFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/create_cluster_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateClusterFromSnapshotOutput createClusterFromSnapshot(CreateClusterFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new CreateClusterFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateClusterFromSnapshot");
        context.put("APIName", "CreateClusterFromSnapshot");
        context.put("ServiceName", "CreateClusterFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateClusterFromSnapshot");

        input.setAction("CreateClusterFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateClusterFromSnapshotOutput.class);
        if(backModel != null){
            return (CreateClusterFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/create_cluster_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createClusterFromSnapshot(CreateClusterFromSnapshotInput input, ResponseCallBack<CreateClusterFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateClusterFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateClusterFromSnapshot");
        context.put("APIName", "CreateClusterFromSnapshot");
        context.put("ServiceName", "CreateClusterFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateClusterFromSnapshot");

        input.setAction("CreateClusterFromSnapshot");
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

    public static class CreateClusterFromSnapshotInput extends IaasParamBody {
        // Required
        private String conf;

        @JsonProperty(value = "conf")
        public void setConf(String conf) {
            this.conf = conf;
        }

        @JsonProperty(value = "conf")
        public String getConf() {
            return this.conf;
        }

        // Required
        private String snapshotID;

        @JsonProperty(value = "snapshot_id")
        public void setSnapshotID(String snapshotID) {
            this.snapshotID = snapshotID;
        }

        @JsonProperty(value = "snapshot_id")
        public String getSnapshotID() {
            return this.snapshotID;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getConf())) {
                throw new QCException("Conf is required");
            }
            if (QCStringUtil.isEmpty(this.getSnapshotID())) {
                throw new QCException("SnapshotID is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateClusterFromSnapshotOutput extends OutputModel {
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
      * @param input Request parameters and headers in the class
      * @return DeleteClusterNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/delete_cluster_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteClusterNodesOutput deleteClusterNodes(DeleteClusterNodesInput input) throws QCException {
        if (input == null) {
            input = new DeleteClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteClusterNodes");
        context.put("APIName", "DeleteClusterNodes");
        context.put("ServiceName", "DeleteClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteClusterNodes");

        input.setAction("DeleteClusterNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteClusterNodesOutput.class);
        if(backModel != null){
            return (DeleteClusterNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/delete_cluster_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteClusterNodes(DeleteClusterNodesInput input, ResponseCallBack<DeleteClusterNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteClusterNodes");
        context.put("APIName", "DeleteClusterNodes");
        context.put("ServiceName", "DeleteClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteClusterNodes");

        input.setAction("DeleteClusterNodes");
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

    public static class DeleteClusterNodesInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Integer force;

        @JsonProperty(value = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @JsonProperty(value = "force")
        public Integer getForce() {
            return this.force;
        }

        // Required
        private List<String> nodes;

        @JsonProperty(value = "nodes")
        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }

        @JsonProperty(value = "nodes")
        public List<String> getNodes() {
            return this.nodes;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteClusterNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private List<String> deletedNodeIDs;

        @JsonProperty(value = "deleted_node_ids")
        public void setDeletedNodeIDs(List<String> deletedNodeIDs) {
            this.deletedNodeIDs = deletedNodeIDs;
        }

        @JsonProperty(value = "deleted_node_ids")
        public List<String> getDeletedNodeIDs() {
            return this.deletedNodeIDs;
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
      * @return DeleteClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/delete_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteClustersOutput deleteClusters(DeleteClustersInput input) throws QCException {
        if (input == null) {
            input = new DeleteClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteClusters");
        context.put("APIName", "DeleteClusters");
        context.put("ServiceName", "DeleteClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteClusters");

        input.setAction("DeleteClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteClustersOutput.class);
        if(backModel != null){
            return (DeleteClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/delete_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteClusters(DeleteClustersInput input, ResponseCallBack<DeleteClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteClusters");
        context.put("APIName", "DeleteClusters");
        context.put("ServiceName", "DeleteClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteClusters");

        input.setAction("DeleteClusters");
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

    public static class DeleteClustersInput extends IaasParamBody {
        // Required
        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private Integer force;

        @JsonProperty(value = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @JsonProperty(value = "force")
        public Integer getForce() {
            return this.force;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @JsonProperty(value = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @JsonProperty(value = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * @return DescribeClusterDisplayTabsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_display_tabs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeClusterDisplayTabsOutput describeClusterDisplayTabs(DescribeClusterDisplayTabsInput input) throws QCException {
        if (input == null) {
            input = new DescribeClusterDisplayTabsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterDisplayTabs");
        context.put("APIName", "DescribeClusterDisplayTabs");
        context.put("ServiceName", "DescribeClusterDisplayTabs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterDisplayTabs");

        input.setAction("DescribeClusterDisplayTabs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeClusterDisplayTabsOutput.class);
        if(backModel != null){
            return (DescribeClusterDisplayTabsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_display_tabs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeClusterDisplayTabs(DescribeClusterDisplayTabsInput input, ResponseCallBack<DescribeClusterDisplayTabsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeClusterDisplayTabsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterDisplayTabs");
        context.put("APIName", "DescribeClusterDisplayTabs");
        context.put("ServiceName", "DescribeClusterDisplayTabs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterDisplayTabs");

        input.setAction("DescribeClusterDisplayTabs");
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

    public static class DescribeClusterDisplayTabsInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        // Required
        private String displayTabs;

        @JsonProperty(value = "display_tabs")
        public void setDisplayTabs(String displayTabs) {
            this.displayTabs = displayTabs;
        }

        @JsonProperty(value = "display_tabs")
        public String getDisplayTabs() {
            return this.displayTabs;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (QCStringUtil.isEmpty(this.getDisplayTabs())) {
                throw new QCException("DisplayTabs is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeClusterDisplayTabsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Map displayTabs;

        @JsonProperty(value = "display_tabs")
        public void setDisplayTabs(Map displayTabs) {
            this.displayTabs = displayTabs;
        }

        @JsonProperty(value = "display_tabs")
        public Map getDisplayTabs() {
            return this.displayTabs;
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
      * @return DescribeClusterNodesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_nodes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeClusterNodesOutput describeClusterNodes(DescribeClusterNodesInput input) throws QCException {
        if (input == null) {
            input = new DescribeClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterNodes");
        context.put("APIName", "DescribeClusterNodes");
        context.put("ServiceName", "DescribeClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterNodes");

        input.setAction("DescribeClusterNodes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeClusterNodesOutput.class);
        if(backModel != null){
            return (DescribeClusterNodesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_nodes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeClusterNodes(DescribeClusterNodesInput input, ResponseCallBack<DescribeClusterNodesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeClusterNodesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterNodes");
        context.put("APIName", "DescribeClusterNodes");
        context.put("ServiceName", "DescribeClusterNodes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterNodes");

        input.setAction("DescribeClusterNodes");
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

    public static class DescribeClusterNodesInput extends IaasParamBody {
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private String console;

        @JsonProperty(value = "console")
        public void setConsole(String console) {
            this.console = console;
        }

        @JsonProperty(value = "console")
        public String getConsole() {
            return this.console;
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

        private List<String> nodes;

        @JsonProperty(value = "nodes")
        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }

        @JsonProperty(value = "nodes")
        public List<String> getNodes() {
            return this.nodes;
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

        private Integer reverse;

        @JsonProperty(value = "reverse")
        public void setReverse(Integer reverse) {
            this.reverse = reverse;
        }

        @JsonProperty(value = "reverse")
        public Integer getReverse() {
            return this.reverse;
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

        private String searchWord;

        @JsonProperty(value = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @JsonProperty(value = "search_word")
        public String getSearchWord() {
            return this.searchWord;
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

        private String status;

        @JsonProperty(value = "status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty(value = "status")
        public String getStatus() {
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
    public static class DescribeClusterNodesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ClusterNodeModel> nodeSet;

        @JsonProperty(value = "node_set")
        public void setNodeSet(List<ClusterNodeModel> nodeSet) {
            this.nodeSet = nodeSet;
        }

        @JsonProperty(value = "node_set")
        public List<ClusterNodeModel> getNodeSet() {
            return this.nodeSet;
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
      * @return DescribeClusterUsersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_users.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeClusterUsersOutput describeClusterUsers(DescribeClusterUsersInput input) throws QCException {
        if (input == null) {
            input = new DescribeClusterUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterUsers");
        context.put("APIName", "DescribeClusterUsers");
        context.put("ServiceName", "DescribeClusterUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterUsers");

        input.setAction("DescribeClusterUsers");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeClusterUsersOutput.class);
        if(backModel != null){
            return (DescribeClusterUsersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/describe_cluster_users.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeClusterUsers(DescribeClusterUsersInput input, ResponseCallBack<DescribeClusterUsersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeClusterUsersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusterUsers");
        context.put("APIName", "DescribeClusterUsers");
        context.put("ServiceName", "DescribeClusterUsers");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusterUsers");

        input.setAction("DescribeClusterUsers");
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

    public static class DescribeClusterUsersInput extends IaasParamBody {
        private List<String> appVersions;

        @JsonProperty(value = "app_versions")
        public void setAppVersions(List<String> appVersions) {
            this.appVersions = appVersions;
        }

        @JsonProperty(value = "app_versions")
        public List<String> getAppVersions() {
            return this.appVersions;
        }

        // Required
        private List<String> apps;

        @JsonProperty(value = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @JsonProperty(value = "apps")
        public List<String> getApps() {
            return this.apps;
        }

        private List<String> clusterStatus;

        @JsonProperty(value = "cluster_status")
        public void setClusterStatus(List<String> clusterStatus) {
            this.clusterStatus = clusterStatus;
        }

        @JsonProperty(value = "cluster_status")
        public List<String> getClusterStatus() {
            return this.clusterStatus;
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

        private List<String> users;

        @JsonProperty(value = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @JsonProperty(value = "users")
        public List<String> getUsers() {
            return this.users;
        }

        // Required
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
    public static class DescribeClusterUsersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> apps;

        @JsonProperty(value = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @JsonProperty(value = "apps")
        public List<String> getApps() {
            return this.apps;
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

        private Map users;

        @JsonProperty(value = "users")
        public void setUsers(Map users) {
            this.users = users;
        }

        @JsonProperty(value = "users")
        public Map getUsers() {
            return this.users;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/describe_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeClustersOutput describeClusters(DescribeClustersInput input) throws QCException {
        if (input == null) {
            input = new DescribeClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusters");
        context.put("APIName", "DescribeClusters");
        context.put("ServiceName", "DescribeClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusters");

        input.setAction("DescribeClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeClustersOutput.class);
        if(backModel != null){
            return (DescribeClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/describe_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeClusters(DescribeClustersInput input, ResponseCallBack<DescribeClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeClusters");
        context.put("APIName", "DescribeClusters");
        context.put("ServiceName", "DescribeClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeClusters");

        input.setAction("DescribeClusters");
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

    public static class DescribeClustersInput extends IaasParamBody {
        private List<String> appVersions;

        @JsonProperty(value = "app_versions")
        public void setAppVersions(List<String> appVersions) {
            this.appVersions = appVersions;
        }

        @JsonProperty(value = "app_versions")
        public List<String> getAppVersions() {
            return this.appVersions;
        }

        private List<String> apps;

        @JsonProperty(value = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @JsonProperty(value = "apps")
        public List<String> getApps() {
            return this.apps;
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

        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private String console;

        @JsonProperty(value = "console")
        public void setConsole(String console) {
            this.console = console;
        }

        @JsonProperty(value = "console")
        public String getConsole() {
            return this.console;
        }

        private String externalClusterID;

        @JsonProperty(value = "external_cluster_id")
        public void setExternalClusterID(String externalClusterID) {
            this.externalClusterID = externalClusterID;
        }

        @JsonProperty(value = "external_cluster_id")
        public String getExternalClusterID() {
            return this.externalClusterID;
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

        private String link;

        @JsonProperty(value = "link")
        public void setLink(String link) {
            this.link = link;
        }

        @JsonProperty(value = "link")
        public String getLink() {
            return this.link;
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

        private Integer reverse;

        @JsonProperty(value = "reverse")
        public void setReverse(Integer reverse) {
            this.reverse = reverse;
        }

        @JsonProperty(value = "reverse")
        public Integer getReverse() {
            return this.reverse;
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

    	// Scope's available values: all, cfgmgmt
        private String scope;

        @JsonProperty(value = "scope")
        public void setScope(String scope) {
            this.scope = scope;
        }

        @JsonProperty(value = "scope")
        public String getScope() {
            return this.scope;
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

        private String sortKey;

        @JsonProperty(value = "sort_key")
        public void setSortKey(String sortKey) {
            this.sortKey = sortKey;
        }

        @JsonProperty(value = "sort_key")
        public String getSortKey() {
            return this.sortKey;
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

        private String transitionStatus;

        @JsonProperty(value = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @JsonProperty(value = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private List<String> users;

        @JsonProperty(value = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @JsonProperty(value = "users")
        public List<String> getUsers() {
            return this.users;
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
            String[] scopeValidValues = {
                "all", "cfgmgmt"
            };

            boolean scopeIsValid = false;
            for (String v : scopeValidValues) {
                if (v.equals(this.getScope())) {
                    scopeIsValid = true;
                }
                Boolean scopeIsRequired = Boolean.FALSE;
                if (scopeIsRequired.equals(Boolean.FALSE) && this.getScope() == null) {
                    scopeIsValid = true;
                }
            }

            if (!scopeIsValid) {
                throw new QCException("Scope value " + this.getScope() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<ClusterModel> clusterSet;

        @JsonProperty(value = "cluster_set")
        public void setClusterSet(List<ClusterModel> clusterSet) {
            this.clusterSet = clusterSet;
        }

        @JsonProperty(value = "cluster_set")
        public List<ClusterModel> getClusterSet() {
            return this.clusterSet;
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
      * @return DissociateEIPFromClusterNodeOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/dissociate_eip_from_cluster_node.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DissociateEIPFromClusterNodeOutput dissociateEIPFromClusterNode(DissociateEIPFromClusterNodeInput input) throws QCException {
        if (input == null) {
            input = new DissociateEIPFromClusterNodeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEipFromClusterNode");
        context.put("APIName", "DissociateEipFromClusterNode");
        context.put("ServiceName", "DissociateEipFromClusterNode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEipFromClusterNode");

        input.setAction("DissociateEipFromClusterNode");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DissociateEIPFromClusterNodeOutput.class);
        if(backModel != null){
            return (DissociateEIPFromClusterNodeOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/dissociate_eip_from_cluster_node.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void dissociateEIPFromClusterNode(DissociateEIPFromClusterNodeInput input, ResponseCallBack<DissociateEIPFromClusterNodeOutput> callback) throws QCException {
        if (input == null) {
            input = new DissociateEIPFromClusterNodeInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateEIPFromClusterNode");
        context.put("APIName", "DissociateEIPFromClusterNode");
        context.put("ServiceName", "DissociateEipFromClusterNode");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateEipFromClusterNode");

        input.setAction("DissociateEIPFromClusterNode");
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

    public static class DissociateEIPFromClusterNodeInput extends IaasParamBody {
        // Required
        private List<String> eIPs;

        @JsonProperty(value = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @JsonProperty(value = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DissociateEIPFromClusterNodeOutput extends OutputModel {
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
      * @return ModifyClusterAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/modify_cluster_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyClusterAttributesOutput modifyClusterAttributes(ModifyClusterAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyClusterAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyClusterAttributes");
        context.put("APIName", "ModifyClusterAttributes");
        context.put("ServiceName", "ModifyClusterAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyClusterAttributes");

        input.setAction("ModifyClusterAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyClusterAttributesOutput.class);
        if(backModel != null){
            return (ModifyClusterAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/modify_cluster_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyClusterAttributes(ModifyClusterAttributesInput input, ResponseCallBack<ModifyClusterAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyClusterAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyClusterAttributes");
        context.put("APIName", "ModifyClusterAttributes");
        context.put("ServiceName", "ModifyClusterAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyClusterAttributes");

        input.setAction("ModifyClusterAttributes");
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

    public static class ModifyClusterAttributesInput extends IaasParamBody {
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
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyClusterAttributesOutput extends OutputModel {
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
      * @return ModifyClusterNodeAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/modify_cluster_node_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyClusterNodeAttributesOutput modifyClusterNodeAttributes(ModifyClusterNodeAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyClusterNodeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyClusterNodeAttributes");
        context.put("APIName", "ModifyClusterNodeAttributes");
        context.put("ServiceName", "ModifyClusterNodeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyClusterNodeAttributes");

        input.setAction("ModifyClusterNodeAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyClusterNodeAttributesOutput.class);
        if(backModel != null){
            return (ModifyClusterNodeAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/modify_cluster_node_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyClusterNodeAttributes(ModifyClusterNodeAttributesInput input, ResponseCallBack<ModifyClusterNodeAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyClusterNodeAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyClusterNodeAttributes");
        context.put("APIName", "ModifyClusterNodeAttributes");
        context.put("ServiceName", "ModifyClusterNodeAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyClusterNodeAttributes");

        input.setAction("ModifyClusterNodeAttributes");
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

    public static class ModifyClusterNodeAttributesInput extends IaasParamBody {
        // Required
        private String clusterNode;

        @JsonProperty(value = "cluster_node")
        public void setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
        }

        @JsonProperty(value = "cluster_node")
        public String getClusterNode() {
            return this.clusterNode;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getClusterNode())) {
                throw new QCException("ClusterNode is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyClusterNodeAttributesOutput extends OutputModel {
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
      * @return RecoverClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/recover_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RecoverClustersOutput recoverClusters(RecoverClustersInput input) throws QCException {
        if (input == null) {
            input = new RecoverClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RecoverClusters");
        context.put("APIName", "RecoverClusters");
        context.put("ServiceName", "Lease");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RecoverClusters");

        input.setAction("RecoverClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RecoverClustersOutput.class);
        if(backModel != null){
            return (RecoverClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/recover_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void recoverClusters(RecoverClustersInput input, ResponseCallBack<RecoverClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new RecoverClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RecoverClusters");
        context.put("APIName", "RecoverClusters");
        context.put("ServiceName", "Lease");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RecoverClusters");

        input.setAction("RecoverClusters");
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

    public static class RecoverClustersInput extends IaasParamBody {
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
    public static class RecoverClustersOutput extends OutputModel {
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
      * @return ResizeClusterOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/resize_cluster.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResizeClusterOutput resizeCluster(ResizeClusterInput input) throws QCException {
        if (input == null) {
            input = new ResizeClusterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeCluster");
        context.put("APIName", "ResizeCluster");
        context.put("ServiceName", "ResizeCluster");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeCluster");

        input.setAction("ResizeCluster");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ResizeClusterOutput.class);
        if(backModel != null){
            return (ResizeClusterOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/resize_cluster.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void resizeCluster(ResizeClusterInput input, ResponseCallBack<ResizeClusterOutput> callback) throws QCException {
        if (input == null) {
            input = new ResizeClusterInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ResizeCluster");
        context.put("APIName", "ResizeCluster");
        context.put("ServiceName", "ResizeCluster");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ResizeCluster");

        input.setAction("ResizeCluster");
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

    public static class ResizeClusterInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
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

        private Integer gpu;

        @JsonProperty(value = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @JsonProperty(value = "gpu")
        public Integer getGpu() {
            return this.gpu;
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

        private String nodeRole;

        @JsonProperty(value = "node_role")
        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        @JsonProperty(value = "node_role")
        public String getNodeRole() {
            return this.nodeRole;
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
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResizeClusterOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private Integer cPU;

        @JsonProperty(value = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @JsonProperty(value = "cpu")
        public Integer getCPU() {
            return this.cPU;
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

        private String jobID;

        @JsonProperty(value = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @JsonProperty(value = "job_id")
        public String getJobID() {
            return this.jobID;
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

        private Integer retCode;

        @JsonProperty(value = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @JsonProperty(value = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
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

        private Integer storageSize;

        @JsonProperty(value = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @JsonProperty(value = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return RestartClusterServiceOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/restart_cluster_service.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RestartClusterServiceOutput restartClusterService(RestartClusterServiceInput input) throws QCException {
        if (input == null) {
            input = new RestartClusterServiceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartClusterService");
        context.put("APIName", "RestartClusterService");
        context.put("ServiceName", "RestartClusterService");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartClusterService");

        input.setAction("RestartClusterService");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RestartClusterServiceOutput.class);
        if(backModel != null){
            return (RestartClusterServiceOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/restart_cluster_service.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void restartClusterService(RestartClusterServiceInput input, ResponseCallBack<RestartClusterServiceOutput> callback) throws QCException {
        if (input == null) {
            input = new RestartClusterServiceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestartClusterService");
        context.put("APIName", "RestartClusterService");
        context.put("ServiceName", "RestartClusterService");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestartClusterService");

        input.setAction("RestartClusterService");
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

    public static class RestartClusterServiceInput extends IaasParamBody {
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestartClusterServiceOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String role;

        @JsonProperty(value = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public String getRole() {
            return this.role;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return RestoreClusterFromSnapshotOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/restore_cluster_from_snapshot.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RestoreClusterFromSnapshotOutput restoreClusterFromSnapshot(RestoreClusterFromSnapshotInput input) throws QCException {
        if (input == null) {
            input = new RestoreClusterFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestoreClusterFromSnapshot");
        context.put("APIName", "RestoreClusterFromSnapshot");
        context.put("ServiceName", "RestoreClusterFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestoreClusterFromSnapshot");

        input.setAction("RestoreClusterFromSnapshot");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RestoreClusterFromSnapshotOutput.class);
        if(backModel != null){
            return (RestoreClusterFromSnapshotOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/restore_cluster_from_snapshot.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void restoreClusterFromSnapshot(RestoreClusterFromSnapshotInput input, ResponseCallBack<RestoreClusterFromSnapshotOutput> callback) throws QCException {
        if (input == null) {
            input = new RestoreClusterFromSnapshotInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RestoreClusterFromSnapshot");
        context.put("APIName", "RestoreClusterFromSnapshot");
        context.put("ServiceName", "RestoreClusterFromSnapshot");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RestoreClusterFromSnapshot");

        input.setAction("RestoreClusterFromSnapshot");
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

    public static class RestoreClusterFromSnapshotInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private String serviceParams;

        @JsonProperty(value = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @JsonProperty(value = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
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
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (QCStringUtil.isEmpty(this.getSnapshot())) {
                throw new QCException("Snapshot is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestoreClusterFromSnapshotOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String serviceParams;

        @JsonProperty(value = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @JsonProperty(value = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
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

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return RunClusterCustomServiceOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/run_cluster_custom_service.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RunClusterCustomServiceOutput runClusterCustomService(RunClusterCustomServiceInput input) throws QCException {
        if (input == null) {
            input = new RunClusterCustomServiceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RunClusterCustomService");
        context.put("APIName", "RunClusterCustomService");
        context.put("ServiceName", "RunClusterCustomService");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RunClusterCustomService");

        input.setAction("RunClusterCustomService");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,RunClusterCustomServiceOutput.class);
        if(backModel != null){
            return (RunClusterCustomServiceOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/run_cluster_custom_service.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void runClusterCustomService(RunClusterCustomServiceInput input, ResponseCallBack<RunClusterCustomServiceOutput> callback) throws QCException {
        if (input == null) {
            input = new RunClusterCustomServiceInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "RunClusterCustomService");
        context.put("APIName", "RunClusterCustomService");
        context.put("ServiceName", "RunClusterCustomService");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/RunClusterCustomService");

        input.setAction("RunClusterCustomService");
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

    public static class RunClusterCustomServiceInput extends IaasParamBody {
        // Required
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
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

        // Required
        private String service;

        @JsonProperty(value = "service")
        public void setService(String service) {
            this.service = service;
        }

        @JsonProperty(value = "service")
        public String getService() {
            return this.service;
        }

        private String serviceParams;

        @JsonProperty(value = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @JsonProperty(value = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
        }

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (QCStringUtil.isEmpty(this.getService())) {
                throw new QCException("Service is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RunClusterCustomServiceOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String role;

        @JsonProperty(value = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @JsonProperty(value = "role")
        public String getRole() {
            return this.role;
        }

        private String service;

        @JsonProperty(value = "service")
        public void setService(String service) {
            this.service = service;
        }

        @JsonProperty(value = "service")
        public String getService() {
            return this.service;
        }

    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return StartClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/start_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StartClustersOutput startClusters(StartClustersInput input) throws QCException {
        if (input == null) {
            input = new StartClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartClusters");
        context.put("APIName", "StartClusters");
        context.put("ServiceName", "StartClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartClusters");

        input.setAction("StartClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StartClustersOutput.class);
        if(backModel != null){
            return (StartClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/start_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void startClusters(StartClustersInput input, ResponseCallBack<StartClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new StartClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StartClusters");
        context.put("APIName", "StartClusters");
        context.put("ServiceName", "StartClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StartClusters");

        input.setAction("StartClusters");
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

    public static class StartClustersInput extends IaasParamBody {
        // Required
        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StartClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @JsonProperty(value = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @JsonProperty(value = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * @return StopClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/stop_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public StopClustersOutput stopClusters(StopClustersInput input) throws QCException {
        if (input == null) {
            input = new StopClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopClusters");
        context.put("APIName", "StopClusters");
        context.put("ServiceName", "StopClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopClusters");

        input.setAction("StopClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,StopClustersOutput.class);
        if(backModel != null){
            return (StopClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/stop_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void stopClusters(StopClustersInput input, ResponseCallBack<StopClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new StopClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "StopClusters");
        context.put("APIName", "StopClusters");
        context.put("ServiceName", "StopClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/StopClusters");

        input.setAction("StopClusters");
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

    public static class StopClustersInput extends IaasParamBody {
        // Required
        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private Integer force;

        @JsonProperty(value = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @JsonProperty(value = "force")
        public Integer getForce() {
            return this.force;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class StopClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @JsonProperty(value = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @JsonProperty(value = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * @return UpdateClusterEnvironmentOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/update_cluster_environment.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpdateClusterEnvironmentOutput updateClusterEnvironment(UpdateClusterEnvironmentInput input) throws QCException {
        if (input == null) {
            input = new UpdateClusterEnvironmentInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateClusterEnvironment");
        context.put("APIName", "UpdateClusterEnvironment");
        context.put("ServiceName", "UpdateClusterEnvironment");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateClusterEnvironment");

        input.setAction("UpdateClusterEnvironment");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpdateClusterEnvironmentOutput.class);
        if(backModel != null){
            return (UpdateClusterEnvironmentOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/update_cluster_environment.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void updateClusterEnvironment(UpdateClusterEnvironmentInput input, ResponseCallBack<UpdateClusterEnvironmentOutput> callback) throws QCException {
        if (input == null) {
            input = new UpdateClusterEnvironmentInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpdateClusterEnvironment");
        context.put("APIName", "UpdateClusterEnvironment");
        context.put("ServiceName", "UpdateClusterEnvironment");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpdateClusterEnvironment");

        input.setAction("UpdateClusterEnvironment");
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

    public static class UpdateClusterEnvironmentInput extends IaasParamBody {
        private String cluster;

        @JsonProperty(value = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @JsonProperty(value = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Model env;

        @JsonProperty(value = "env")
        public void setEnv(Model env) {
            this.env = env;
        }

        @JsonProperty(value = "env")
        public Model getEnv() {
            return this.env;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateClusterEnvironmentOutput extends OutputModel {
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
      * @return UpgradeClustersOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/cluster/upgrade_clusters.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public UpgradeClustersOutput upgradeClusters(UpgradeClustersInput input) throws QCException {
        if (input == null) {
            input = new UpgradeClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpgradeClusters");
        context.put("APIName", "UpgradeClusters");
        context.put("ServiceName", "UpgradeClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpgradeClusters");

        input.setAction("UpgradeClusters");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,UpgradeClustersOutput.class);
        if(backModel != null){
            return (UpgradeClustersOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/cluster/upgrade_clusters.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void upgradeClusters(UpgradeClustersInput input, ResponseCallBack<UpgradeClustersOutput> callback) throws QCException {
        if (input == null) {
            input = new UpgradeClustersInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "UpgradeClusters");
        context.put("APIName", "UpgradeClusters");
        context.put("ServiceName", "UpgradeClusters");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/UpgradeClusters");

        input.setAction("UpgradeClusters");
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

    public static class UpgradeClustersInput extends IaasParamBody {
        private String appVersion;

        @JsonProperty(value = "app_version")
        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        @JsonProperty(value = "app_version")
        public String getAppVersion() {
            return this.appVersion;
        }

        private List<String> clusters;

        @JsonProperty(value = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @JsonProperty(value = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private String serviceParams;

        @JsonProperty(value = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @JsonProperty(value = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpgradeClustersOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> clusterID;

        @JsonProperty(value = "cluster_id")
        public void setClusterID(List<String> clusterID) {
            this.clusterID = clusterID;
        }

        @JsonProperty(value = "cluster_id")
        public List<String> getClusterID() {
            return this.clusterID;
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



















