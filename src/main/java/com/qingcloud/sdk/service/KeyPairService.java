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

public class KeyPairService {

    private EnvContext envContext;

    private String zone;

    public KeyPairService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public KeyPairService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AttachKeyPairsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/attach_key_pairs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AttachKeyPairsOutput attachKeyPairs(AttachKeyPairsInput input) throws QCException {
        if (input == null) {
            input = new AttachKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachKeyPairs");
        context.put("APIName", "AttachKeyPairs");
        context.put("ServiceName", "AttachKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachKeyPairs");

        input.setAction("AttachKeyPairs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AttachKeyPairsOutput.class);
        if(backModel != null){
            return (AttachKeyPairsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/attach_key_pairs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void attachKeyPairs(AttachKeyPairsInput input, ResponseCallBack<AttachKeyPairsOutput> callback) throws QCException {
        if (input == null) {
            input = new AttachKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AttachKeyPairs");
        context.put("APIName", "AttachKeyPairs");
        context.put("ServiceName", "AttachKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AttachKeyPairs");

        input.setAction("AttachKeyPairs");
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

    public static class AttachKeyPairsInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        // Required
        private List<String> keyPairs;

        @JsonProperty(value = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @JsonProperty(value = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AttachKeyPairsOutput extends OutputModel {
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
      * @return CreateKeyPairOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/create_key_pairs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public CreateKeyPairOutput createKeyPair(CreateKeyPairInput input) throws QCException {
        if (input == null) {
            input = new CreateKeyPairInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateKeyPair");
        context.put("APIName", "CreateKeyPair");
        context.put("ServiceName", "CreateKeyPair");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateKeyPair");

        input.setAction("CreateKeyPair");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,CreateKeyPairOutput.class);
        if(backModel != null){
            return (CreateKeyPairOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/create_key_pairs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void createKeyPair(CreateKeyPairInput input, ResponseCallBack<CreateKeyPairOutput> callback) throws QCException {
        if (input == null) {
            input = new CreateKeyPairInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "CreateKeyPair");
        context.put("APIName", "CreateKeyPair");
        context.put("ServiceName", "CreateKeyPair");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/CreateKeyPair");

        input.setAction("CreateKeyPair");
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

    public static class CreateKeyPairInput extends IaasParamBody {
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

        private String keyPairName;

        @JsonProperty(value = "keypair_name")
        public void setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
        }

        @JsonProperty(value = "keypair_name")
        public String getKeyPairName() {
            return this.keyPairName;
        }

    	// Mode's available values: system, user
        private String mode;

        @JsonProperty(value = "mode")
        public void setMode(String mode) {
            this.mode = mode;
        }

        @JsonProperty(value = "mode")
        public String getMode() {
            return this.mode;
        }

        private String publicKey;

        @JsonProperty(value = "public_key")
        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        @JsonProperty(value = "public_key")
        public String getPublicKey() {
            return this.publicKey;
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
            String[] modeValidValues = {
                "system", "user"
            };

            boolean modeIsValid = false;
            for (String v : modeValidValues) {
                if (v.equals(this.getMode())) {
                    modeIsValid = true;
                }
                Boolean modeIsRequired = Boolean.FALSE;
                if (modeIsRequired.equals(Boolean.FALSE) && this.getMode() == null) {
                    modeIsValid = true;
                }
            }

            if (!modeIsValid) {
                throw new QCException("Mode value " + this.getMode() + "is invalid");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateKeyPairOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String privateKey;

        @JsonProperty(value = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @JsonProperty(value = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
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
      * @return DeleteKeyPairsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/delete_key_pairs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DeleteKeyPairsOutput deleteKeyPairs(DeleteKeyPairsInput input) throws QCException {
        if (input == null) {
            input = new DeleteKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteKeyPairs");
        context.put("APIName", "DeleteKeyPairs");
        context.put("ServiceName", "DeleteKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteKeyPairs");

        input.setAction("DeleteKeyPairs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DeleteKeyPairsOutput.class);
        if(backModel != null){
            return (DeleteKeyPairsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/delete_key_pairs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void deleteKeyPairs(DeleteKeyPairsInput input, ResponseCallBack<DeleteKeyPairsOutput> callback) throws QCException {
        if (input == null) {
            input = new DeleteKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DeleteKeyPairs");
        context.put("APIName", "DeleteKeyPairs");
        context.put("ServiceName", "DeleteKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DeleteKeyPairs");

        input.setAction("DeleteKeyPairs");
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

    public static class DeleteKeyPairsInput extends IaasParamBody {
        // Required
        private List<String> keyPairs;

        @JsonProperty(value = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @JsonProperty(value = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DeleteKeyPairsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> keyPairs;

        @JsonProperty(value = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @JsonProperty(value = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
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
      * @return DescribeKeyPairsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/describe_key_pairs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeKeyPairsOutput describeKeyPairs(DescribeKeyPairsInput input) throws QCException {
        if (input == null) {
            input = new DescribeKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeKeyPairs");
        context.put("APIName", "DescribeKeyPairs");
        context.put("ServiceName", "DescribeKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeKeyPairs");

        input.setAction("DescribeKeyPairs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeKeyPairsOutput.class);
        if(backModel != null){
            return (DescribeKeyPairsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/describe_key_pairs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeKeyPairs(DescribeKeyPairsInput input, ResponseCallBack<DescribeKeyPairsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeKeyPairs");
        context.put("APIName", "DescribeKeyPairs");
        context.put("ServiceName", "DescribeKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeKeyPairs");

        input.setAction("DescribeKeyPairs");
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

    public static class DescribeKeyPairsInput extends IaasParamBody {
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

        private String instanceID;

        @JsonProperty(value = "instance_id")
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        @JsonProperty(value = "instance_id")
        public String getInstanceID() {
            return this.instanceID;
        }

        private List<String> keyPairs;

        @JsonProperty(value = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @JsonProperty(value = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
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
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeKeyPairsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<KeyPairModel> keyPairSet;

        @JsonProperty(value = "keypair_set")
        public void setKeyPairSet(List<KeyPairModel> keyPairSet) {
            this.keyPairSet = keyPairSet;
        }

        @JsonProperty(value = "keypair_set")
        public List<KeyPairModel> getKeyPairSet() {
            return this.keyPairSet;
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
      * @return DetachKeyPairsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/detach_key_pairs.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DetachKeyPairsOutput detachKeyPairs(DetachKeyPairsInput input) throws QCException {
        if (input == null) {
            input = new DetachKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachKeyPairs");
        context.put("APIName", "DetachKeyPairs");
        context.put("ServiceName", "DetachKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachKeyPairs");

        input.setAction("DetachKeyPairs");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DetachKeyPairsOutput.class);
        if(backModel != null){
            return (DetachKeyPairsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/detach_key_pairs.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void detachKeyPairs(DetachKeyPairsInput input, ResponseCallBack<DetachKeyPairsOutput> callback) throws QCException {
        if (input == null) {
            input = new DetachKeyPairsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DetachKeyPairs");
        context.put("APIName", "DetachKeyPairs");
        context.put("ServiceName", "DetachKeyPairs");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DetachKeyPairs");

        input.setAction("DetachKeyPairs");
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

    public static class DetachKeyPairsInput extends IaasParamBody {
        // Required
        private List<String> instances;

        @JsonProperty(value = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @JsonProperty(value = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        // Required
        private List<String> keyPairs;

        @JsonProperty(value = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @JsonProperty(value = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DetachKeyPairsOutput extends OutputModel {
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
      * @return ModifyKeyPairAttributesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/keypair/modify_key_pair_attributes.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ModifyKeyPairAttributesOutput modifyKeyPairAttributes(ModifyKeyPairAttributesInput input) throws QCException {
        if (input == null) {
            input = new ModifyKeyPairAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyKeyPairAttributes");
        context.put("APIName", "ModifyKeyPairAttributes");
        context.put("ServiceName", "ModifyKeyPairAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyKeyPairAttributes");

        input.setAction("ModifyKeyPairAttributes");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,ModifyKeyPairAttributesOutput.class);
        if(backModel != null){
            return (ModifyKeyPairAttributesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/keypair/modify_key_pair_attributes.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void modifyKeyPairAttributes(ModifyKeyPairAttributesInput input, ResponseCallBack<ModifyKeyPairAttributesOutput> callback) throws QCException {
        if (input == null) {
            input = new ModifyKeyPairAttributesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "ModifyKeyPairAttributes");
        context.put("APIName", "ModifyKeyPairAttributes");
        context.put("ServiceName", "ModifyKeyPairAttributes");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/ModifyKeyPairAttributes");

        input.setAction("ModifyKeyPairAttributes");
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

    public static class ModifyKeyPairAttributesInput extends IaasParamBody {
        private String description;

        @JsonProperty(value = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty(value = "description")
        public String getDescription() {
            return this.description;
        }

        // Required
        private String keyPair;

        @JsonProperty(value = "keypair")
        public void setKeyPair(String keyPair) {
            this.keyPair = keyPair;
        }

        @JsonProperty(value = "keypair")
        public String getKeyPair() {
            return this.keyPair;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getKeyPair())) {
                throw new QCException("KeyPair is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ModifyKeyPairAttributesOutput extends OutputModel {
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



















