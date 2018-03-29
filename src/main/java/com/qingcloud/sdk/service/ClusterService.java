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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/add_cluster_nodes.html
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
        context.put("RequestURI", "/AddClusterNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/add_cluster_nodes.html
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
        context.put("RequestURI", "/AddClusterNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
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

        private String nodeName;

        @ParamAnnotation(paramType = "query", paramName = "node_name")
        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_name")
        public String getNodeName() {
            return this.nodeName;
        }

        private String nodeRole;

        @ParamAnnotation(paramType = "query", paramName = "node_role")
        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_role")
        public String getNodeRole() {
            return this.nodeRole;
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

        private String resourceConf;

        @ParamAnnotation(paramType = "query", paramName = "resource_conf")
        public void setResourceConf(String resourceConf) {
            this.resourceConf = resourceConf;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource_conf")
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

    public static class AddClusterNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
        }

        private List<String> newNodeIDs;

        @ParamAnnotation(paramType = "query", paramName = "new_node_ids")
        public void setNewNodeIDs(List<String> newNodeIDs) {
            this.newNodeIDs = newNodeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "new_node_ids")
        public List<String> getNewNodeIDs() {
            return this.newNodeIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/associate_eip_to_cluster_node.html
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
        context.put("RequestURI", "/AssociateEipToClusterNode");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/associate_eip_to_cluster_node.html
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
        context.put("RequestURI", "/AssociateEipToClusterNode");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster_node")
        public void setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_node")
        public String getClusterNode() {
            return this.clusterNode;
        }

        // Required
        private String eIP;

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public void setEIP(String eIP) {
            this.eIP = eIP;
        }

        @ParamAnnotation(paramType = "query", paramName = "eip")
        public String getEIP() {
            return this.eIP;
        }

        private String nIC;

        @ParamAnnotation(paramType = "query", paramName = "nic")
        public void setNIC(String nIC) {
            this.nIC = nIC;
        }

        @ParamAnnotation(paramType = "query", paramName = "nic")
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

    public static class AssociateEIPToClusterNodeOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/cease_clusters.html
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
        context.put("RequestURI", "/CeaseClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/cease_clusters.html
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
        context.put("RequestURI", "/CeaseClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class CeaseClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/change_cluster_vxnet.html
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
        context.put("RequestURI", "/ChangeClusterVxnet");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/change_cluster_vxnet.html
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
        context.put("RequestURI", "/ChangeClusterVxnet");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Model privateIPs;

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public void setPrivateIPs(Model privateIPs) {
            this.privateIPs = privateIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_ips")
        public Model getPrivateIPs() {
            return this.privateIPs;
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
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            if (QCStringUtil.isEmpty(this.getVxNet())) {
                throw new QCException("VxNet is required");
            }
            return null;
        }
    }

    public static class ChangeClusterVxNetOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/create_cluster.html
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
        context.put("RequestURI", "/CreateCluster");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/create_cluster.html
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
        context.put("RequestURI", "/CreateCluster");

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

        @ParamAnnotation(paramType = "query", paramName = "conf")
        public void setConf(String conf) {
            this.conf = conf;
        }

        @ParamAnnotation(paramType = "query", paramName = "conf")
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

    public static class CreateClusterOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String clusterID;

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public void setClusterID(String clusterID) {
            this.clusterID = clusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public String getClusterID() {
            return this.clusterID;
        }

        private String clusterName;

        @ParamAnnotation(paramType = "query", paramName = "cluster_name")
        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_name")
        public String getClusterName() {
            return this.clusterName;
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

        private List<String> nodeIDs;

        @ParamAnnotation(paramType = "query", paramName = "node_ids")
        public void setNodeIDs(List<String> nodeIDs) {
            this.nodeIDs = nodeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_ids")
        public List<String> getNodeIDs() {
            return this.nodeIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/create_cluster_from_snapshot.html
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
        context.put("RequestURI", "/CreateClusterFromSnapshot");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/create_cluster_from_snapshot.html
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
        context.put("RequestURI", "/CreateClusterFromSnapshot");

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

        @ParamAnnotation(paramType = "query", paramName = "conf")
        public void setConf(String conf) {
            this.conf = conf;
        }

        @ParamAnnotation(paramType = "query", paramName = "conf")
        public String getConf() {
            return this.conf;
        }

        // Required
        private String snapshotID;

        @ParamAnnotation(paramType = "query", paramName = "snapshot_id")
        public void setSnapshotID(String snapshotID) {
            this.snapshotID = snapshotID;
        }

        @ParamAnnotation(paramType = "query", paramName = "snapshot_id")
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

    public static class CreateClusterFromSnapshotOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String clusterID;

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public void setClusterID(String clusterID) {
            this.clusterID = clusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public String getClusterID() {
            return this.clusterID;
        }

        private String clusterName;

        @ParamAnnotation(paramType = "query", paramName = "cluster_name")
        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_name")
        public String getClusterName() {
            return this.clusterName;
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

        private List<String> nodeIDs;

        @ParamAnnotation(paramType = "query", paramName = "node_ids")
        public void setNodeIDs(List<String> nodeIDs) {
            this.nodeIDs = nodeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_ids")
        public List<String> getNodeIDs() {
            return this.nodeIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/delete_cluster_nodes.html
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
        context.put("RequestURI", "/DeleteClusterNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/delete_cluster_nodes.html
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
        context.put("RequestURI", "/DeleteClusterNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Integer force;

        @ParamAnnotation(paramType = "query", paramName = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @ParamAnnotation(paramType = "query", paramName = "force")
        public Integer getForce() {
            return this.force;
        }

        // Required
        private List<String> nodes;

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "nodes")
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

    public static class DeleteClusterNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private List<String> deletedNodeIDs;

        @ParamAnnotation(paramType = "query", paramName = "deleted_node_ids")
        public void setDeletedNodeIDs(List<String> deletedNodeIDs) {
            this.deletedNodeIDs = deletedNodeIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "deleted_node_ids")
        public List<String> getDeletedNodeIDs() {
            return this.deletedNodeIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/delete_clusters.html
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
        context.put("RequestURI", "/DeleteClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/delete_clusters.html
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
        context.put("RequestURI", "/DeleteClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private Integer force;

        @ParamAnnotation(paramType = "query", paramName = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @ParamAnnotation(paramType = "query", paramName = "force")
        public Integer getForce() {
            return this.force;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_display_tabs.html
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
        context.put("RequestURI", "/DescribeClusterDisplayTabs");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_display_tabs.html
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
        context.put("RequestURI", "/DescribeClusterDisplayTabs");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        // Required
        private String displayTabs;

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public void setDisplayTabs(String displayTabs) {
            this.displayTabs = displayTabs;
        }

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public String getDisplayTabs() {
            return this.displayTabs;
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

    public static class DescribeClusterDisplayTabsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Map displayTabs;

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public void setDisplayTabs(Map displayTabs) {
            this.displayTabs = displayTabs;
        }

        @ParamAnnotation(paramType = "query", paramName = "display_tabs")
        public Map getDisplayTabs() {
            return this.displayTabs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_nodes.html
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
        context.put("RequestURI", "/DescribeClusterNodes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_nodes.html
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
        context.put("RequestURI", "/DescribeClusterNodes");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private String console;

        @ParamAnnotation(paramType = "query", paramName = "console")
        public void setConsole(String console) {
            this.console = console;
        }

        @ParamAnnotation(paramType = "query", paramName = "console")
        public String getConsole() {
            return this.console;
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

        private List<String> nodes;

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }

        @ParamAnnotation(paramType = "query", paramName = "nodes")
        public List<String> getNodes() {
            return this.nodes;
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

        private String owner;

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }

        @ParamAnnotation(paramType = "query", paramName = "owner")
        public String getOwner() {
            return this.owner;
        }

        private Integer reverse;

        @ParamAnnotation(paramType = "query", paramName = "reverse")
        public void setReverse(Integer reverse) {
            this.reverse = reverse;
        }

        @ParamAnnotation(paramType = "query", paramName = "reverse")
        public Integer getReverse() {
            return this.reverse;
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

        private String searchWord;

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        @ParamAnnotation(paramType = "query", paramName = "search_word")
        public String getSearchWord() {
            return this.searchWord;
        }

        private String sortKey;

        @ParamAnnotation(paramType = "query", paramName = "sort_key")
        public void setSortKey(String sortKey) {
            this.sortKey = sortKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "sort_key")
        public String getSortKey() {
            return this.sortKey;
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

    public static class DescribeClusterNodesOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<ClusterNodeModel> nodeSet;

        @ParamAnnotation(paramType = "query", paramName = "node_set")
        public void setNodeSet(List<ClusterNodeModel> nodeSet) {
            this.nodeSet = nodeSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_set")
        public List<ClusterNodeModel> getNodeSet() {
            return this.nodeSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_users.html
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
        context.put("RequestURI", "/GetClusterMonitor");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_cluster_users.html
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
        context.put("RequestURI", "/GetClusterMonitor");

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

        @ParamAnnotation(paramType = "query", paramName = "app_versions")
        public void setAppVersions(List<String> appVersions) {
            this.appVersions = appVersions;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_versions")
        public List<String> getAppVersions() {
            return this.appVersions;
        }

        // Required
        private List<String> apps;

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public List<String> getApps() {
            return this.apps;
        }

        private List<String> clusterStatus;

        @ParamAnnotation(paramType = "query", paramName = "cluster_status")
        public void setClusterStatus(List<String> clusterStatus) {
            this.clusterStatus = clusterStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_status")
        public List<String> getClusterStatus() {
            return this.clusterStatus;
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

        private List<String> users;

        @ParamAnnotation(paramType = "query", paramName = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @ParamAnnotation(paramType = "query", paramName = "users")
        public List<String> getUsers() {
            return this.users;
        }

        // Required
        private List<String> zones;

        @ParamAnnotation(paramType = "query", paramName = "zones")
        public void setZones(List<String> zones) {
            this.zones = zones;
        }

        @ParamAnnotation(paramType = "query", paramName = "zones")
        public List<String> getZones() {
            return this.zones;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DescribeClusterUsersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> apps;

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public List<String> getApps() {
            return this.apps;
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

        private Map users;

        @ParamAnnotation(paramType = "query", paramName = "users")
        public void setUsers(Map users) {
            this.users = users;
        }

        @ParamAnnotation(paramType = "query", paramName = "users")
        public Map getUsers() {
            return this.users;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_clusters.html
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
        context.put("RequestURI", "/DescribeClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/describe_clusters.html
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
        context.put("RequestURI", "/DescribeClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "app_versions")
        public void setAppVersions(List<String> appVersions) {
            this.appVersions = appVersions;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_versions")
        public List<String> getAppVersions() {
            return this.appVersions;
        }

        private List<String> apps;

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public void setApps(List<String> apps) {
            this.apps = apps;
        }

        @ParamAnnotation(paramType = "query", paramName = "apps")
        public List<String> getApps() {
            return this.apps;
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

        private List<String> clusters;

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private String console;

        @ParamAnnotation(paramType = "query", paramName = "console")
        public void setConsole(String console) {
            this.console = console;
        }

        @ParamAnnotation(paramType = "query", paramName = "console")
        public String getConsole() {
            return this.console;
        }

        private String externalClusterID;

        @ParamAnnotation(paramType = "query", paramName = "external_cluster_id")
        public void setExternalClusterID(String externalClusterID) {
            this.externalClusterID = externalClusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "external_cluster_id")
        public String getExternalClusterID() {
            return this.externalClusterID;
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

        private String link;

        @ParamAnnotation(paramType = "query", paramName = "link")
        public void setLink(String link) {
            this.link = link;
        }

        @ParamAnnotation(paramType = "query", paramName = "link")
        public String getLink() {
            return this.link;
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

        private Integer offset;

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @ParamAnnotation(paramType = "query", paramName = "offset")
        public Integer getOffset() {
            return this.offset;
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

        private Integer reverse;

        @ParamAnnotation(paramType = "query", paramName = "reverse")
        public void setReverse(Integer reverse) {
            this.reverse = reverse;
        }

        @ParamAnnotation(paramType = "query", paramName = "reverse")
        public Integer getReverse() {
            return this.reverse;
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

    	// Scope's available values: all, cfgmgmt
        private String scope;

        @ParamAnnotation(paramType = "query", paramName = "scope")
        public void setScope(String scope) {
            this.scope = scope;
        }

        @ParamAnnotation(paramType = "query", paramName = "scope")
        public String getScope() {
            return this.scope;
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

        private String sortKey;

        @ParamAnnotation(paramType = "query", paramName = "sort_key")
        public void setSortKey(String sortKey) {
            this.sortKey = sortKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "sort_key")
        public String getSortKey() {
            return this.sortKey;
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

        private String transitionStatus;

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public void setTransitionStatus(String transitionStatus) {
            this.transitionStatus = transitionStatus;
        }

        @ParamAnnotation(paramType = "query", paramName = "transition_status")
        public String getTransitionStatus() {
            return this.transitionStatus;
        }

        private List<String> users;

        @ParamAnnotation(paramType = "query", paramName = "users")
        public void setUsers(List<String> users) {
            this.users = users;
        }

        @ParamAnnotation(paramType = "query", paramName = "users")
        public List<String> getUsers() {
            return this.users;
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

    public static class DescribeClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<ClusterModel> clusterSet;

        @ParamAnnotation(paramType = "query", paramName = "cluster_set")
        public void setClusterSet(List<ClusterModel> clusterSet) {
            this.clusterSet = clusterSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_set")
        public List<ClusterModel> getClusterSet() {
            return this.clusterSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/dissociate_eip_from_cluster_node.html
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
        context.put("RequestURI", "/DissociateEipFromClusterNode");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/dissociate_eip_from_cluster_node.html
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
        context.put("RequestURI", "/DissociateEipFromClusterNode");

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

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public void setEIPs(List<String> eIPs) {
            this.eIPs = eIPs;
        }

        @ParamAnnotation(paramType = "query", paramName = "eips")
        public List<String> getEIPs() {
            return this.eIPs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DissociateEIPFromClusterNodeOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/modify_cluster_attributes.html
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
        context.put("RequestURI", "/ModifyClusterAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/modify_cluster_attributes.html
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
        context.put("RequestURI", "/ModifyClusterAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public void setAutoBackupTime(Integer autoBackupTime) {
            this.autoBackupTime = autoBackupTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "auto_backup_time")
        public Integer getAutoBackupTime() {
            return this.autoBackupTime;
        }

        // Required
        private String cluster;

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
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

        private String name;

        @ParamAnnotation(paramType = "query", paramName = "name")
        public void setName(String name) {
            this.name = name;
        }

        @ParamAnnotation(paramType = "query", paramName = "name")
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

    public static class ModifyClusterAttributesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/modify_cluster_node_attributes.html
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
        context.put("RequestURI", "/ModifyClusterNodeAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/modify_cluster_node_attributes.html
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
        context.put("RequestURI", "/ModifyClusterNodeAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster_node")
        public void setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_node")
        public String getClusterNode() {
            return this.clusterNode;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getClusterNode())) {
                throw new QCException("ClusterNode is required");
            }
            return null;
        }
    }

    public static class ModifyClusterNodeAttributesOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/recover_clusters.html
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
        context.put("RequestURI", "/RecoverClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/recover_clusters.html
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
        context.put("RequestURI", "/RecoverClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public void setResources(List<String> resources) {
            this.resources = resources;
        }

        @ParamAnnotation(paramType = "query", paramName = "resources")
        public List<String> getResources() {
            return this.resources;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RecoverClustersOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/resize_cluster.html
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
        context.put("RequestURI", "/ResizeCluster");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/resize_cluster.html
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
        context.put("RequestURI", "/ResizeCluster");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
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

        private Integer gpu;

        @ParamAnnotation(paramType = "query", paramName = "gpu")
        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        @ParamAnnotation(paramType = "query", paramName = "gpu")
        public Integer getGpu() {
            return this.gpu;
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

        private String nodeRole;

        @ParamAnnotation(paramType = "query", paramName = "node_role")
        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        @ParamAnnotation(paramType = "query", paramName = "node_role")
        public String getNodeRole() {
            return this.nodeRole;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getCluster())) {
                throw new QCException("Cluster is required");
            }
            return null;
        }
    }

    public static class ResizeClusterOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private Integer cPU;

        @ParamAnnotation(paramType = "query", paramName = "cpu")
        public void setCPU(Integer cPU) {
            this.cPU = cPU;
        }

        @ParamAnnotation(paramType = "query", paramName = "cpu")
        public Integer getCPU() {
            return this.cPU;
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

        private String jobID;

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public void setJobID(String jobID) {
            this.jobID = jobID;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_id")
        public String getJobID() {
            return this.jobID;
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

        private Integer retCode;

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public void setRetCode(Integer retCode) {
            this.retCode = retCode;
        }

        @ParamAnnotation(paramType = "query", paramName = "ret_code")
        public Integer getRetCode() {
            return this.retCode;
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

        private Integer storageSize;

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public void setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
        }

        @ParamAnnotation(paramType = "query", paramName = "storage_size")
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/restart_cluster_service.html
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
        context.put("RequestURI", "/RestartClusterService");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/restart_cluster_service.html
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
        context.put("RequestURI", "/RestartClusterService");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class RestartClusterServiceOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public String getRole() {
            return this.role;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/restore_cluster_from_snapshot.html
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
        context.put("RequestURI", "/RestoreClusterFromSnapshot");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/restore_cluster_from_snapshot.html
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
        context.put("RequestURI", "/RestoreClusterFromSnapshot");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private String serviceParams;

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
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

    public static class RestoreClusterFromSnapshotOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String serviceParams;

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
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

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/run_cluster_custom_service.html
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
        context.put("RequestURI", "/RunClusterCustomService");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/run_cluster_custom_service.html
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
        context.put("RequestURI", "/RunClusterCustomService");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
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

        // Required
        private String service;

        @ParamAnnotation(paramType = "query", paramName = "service")
        public void setService(String service) {
            this.service = service;
        }

        @ParamAnnotation(paramType = "query", paramName = "service")
        public String getService() {
            return this.service;
        }

        private String serviceParams;

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_params")
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

    public static class RunClusterCustomServiceOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String role;

        @ParamAnnotation(paramType = "query", paramName = "role")
        public void setRole(String role) {
            this.role = role;
        }

        @ParamAnnotation(paramType = "query", paramName = "role")
        public String getRole() {
            return this.role;
        }

        private String service;

        @ParamAnnotation(paramType = "query", paramName = "service")
        public void setService(String service) {
            this.service = service;
        }

        @ParamAnnotation(paramType = "query", paramName = "service")
        public String getService() {
            return this.service;
        }

    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/cluster/start_clusters.html
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
        context.put("RequestURI", "/StartClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/start_clusters.html
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
        context.put("RequestURI", "/StartClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StartClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/stop_clusters.html
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
        context.put("RequestURI", "/StopClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/stop_clusters.html
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
        context.put("RequestURI", "/StopClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private Integer force;

        @ParamAnnotation(paramType = "query", paramName = "force")
        public void setForce(Integer force) {
            this.force = force;
        }

        @ParamAnnotation(paramType = "query", paramName = "force")
        public Integer getForce() {
            return this.force;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class StopClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private Map jobIDs;

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public void setJobIDs(Map jobIDs) {
            this.jobIDs = jobIDs;
        }

        @ParamAnnotation(paramType = "query", paramName = "job_ids")
        public Map getJobIDs() {
            return this.jobIDs;
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/update_cluster_environment.html
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
        context.put("RequestURI", "/UpdateClusterEnvironment");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/update_cluster_environment.html
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
        context.put("RequestURI", "/UpdateClusterEnvironment");

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

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster")
        public String getCluster() {
            return this.cluster;
        }

        private Model env;

        @ParamAnnotation(paramType = "query", paramName = "env")
        public void setEnv(Model env) {
            this.env = env;
        }

        @ParamAnnotation(paramType = "query", paramName = "env")
        public Model getEnv() {
            return this.env;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class UpdateClusterEnvironmentOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/cluster/upgrade_clusters.html
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
        context.put("RequestURI", "/UpgradeClusters");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/cluster/upgrade_clusters.html
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
        context.put("RequestURI", "/UpgradeClusters");

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

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        @ParamAnnotation(paramType = "query", paramName = "app_version")
        public String getAppVersion() {
            return this.appVersion;
        }

        private List<String> clusters;

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public void setClusters(List<String> clusters) {
            this.clusters = clusters;
        }

        @ParamAnnotation(paramType = "query", paramName = "clusters")
        public List<String> getClusters() {
            return this.clusters;
        }

        private String serviceParams;

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public void setServiceParams(String serviceParams) {
            this.serviceParams = serviceParams;
        }

        @ParamAnnotation(paramType = "query", paramName = "service_params")
        public String getServiceParams() {
            return this.serviceParams;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class UpgradeClustersOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> clusterID;

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public void setClusterID(List<String> clusterID) {
            this.clusterID = clusterID;
        }

        @ParamAnnotation(paramType = "query", paramName = "cluster_id")
        public List<String> getClusterID() {
            return this.clusterID;
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



















