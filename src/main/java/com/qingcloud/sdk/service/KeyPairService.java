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
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/keypair/attach_key_pairs.html
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
        context.put("RequestURI", "/AttachKeyPairs");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/attach_key_pairs.html
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
        context.put("RequestURI", "/AttachKeyPairs");

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

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        // Required
        private List<String> keyPairs;

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class AttachKeyPairsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/keypair/create_key_pairs.html
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
        context.put("RequestURI", "/CreateKeyPair");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/create_key_pairs.html
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
        context.put("RequestURI", "/CreateKeyPair");

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

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public void setEncryptMethod(String encryptMethod) {
            this.encryptMethod = encryptMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public String getEncryptMethod() {
            return this.encryptMethod;
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

    	// Mode's available values: system, user
        private String mode;

        @ParamAnnotation(paramType = "query", paramName = "mode")
        public void setMode(String mode) {
            this.mode = mode;
        }

        @ParamAnnotation(paramType = "query", paramName = "mode")
        public String getMode() {
            return this.mode;
        }

        private String publicKey;

        @ParamAnnotation(paramType = "query", paramName = "public_key")
        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "public_key")
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

    public static class CreateKeyPairOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
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

        private String privateKey;

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        @ParamAnnotation(paramType = "query", paramName = "private_key")
        public String getPrivateKey() {
            return this.privateKey;
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
      * Documentation URL: https://docs.qingcloud.com/api/keypair/delete_key_pairs.html
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
        context.put("RequestURI", "/DeleteKeyPairs");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/delete_key_pairs.html
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
        context.put("RequestURI", "/DeleteKeyPairs");

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

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DeleteKeyPairsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<String> keyPairs;

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
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
      * Documentation URL: https://docs.qingcloud.com/api/keypair/describe_key_pairs.html
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
        context.put("RequestURI", "/DescribeKeyPairs");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/describe_key_pairs.html
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
        context.put("RequestURI", "/DescribeKeyPairs");

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

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public void setEncryptMethod(String encryptMethod) {
            this.encryptMethod = encryptMethod;
        }

        @ParamAnnotation(paramType = "query", paramName = "encrypt_method")
        public String getEncryptMethod() {
            return this.encryptMethod;
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

        private List<String> keyPairs;

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
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

    public static class DescribeKeyPairsOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<KeyPairModel> keyPairSet;

        @ParamAnnotation(paramType = "query", paramName = "keypair_set")
        public void setKeyPairSet(List<KeyPairModel> keyPairSet) {
            this.keyPairSet = keyPairSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypair_set")
        public List<KeyPairModel> getKeyPairSet() {
            return this.keyPairSet;
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
      * Documentation URL: https://docs.qingcloud.com/api/keypair/detach_key_pairs.html
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
        context.put("RequestURI", "/DetachKeyPairs");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/detach_key_pairs.html
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
        context.put("RequestURI", "/DetachKeyPairs");

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

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public void setInstances(List<String> instances) {
            this.instances = instances;
        }

        @ParamAnnotation(paramType = "query", paramName = "instances")
        public List<String> getInstances() {
            return this.instances;
        }

        // Required
        private List<String> keyPairs;

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public void setKeyPairs(List<String> keyPairs) {
            this.keyPairs = keyPairs;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypairs")
        public List<String> getKeyPairs() {
            return this.keyPairs;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    public static class DetachKeyPairsOutput extends OutputModel {
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
      * Documentation URL: https://docs.qingcloud.com/api/keypair/modify_key_pair_attributes.html
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
        context.put("RequestURI", "/ModifyKeyPairAttributes");

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
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/keypair/modify_key_pair_attributes.html
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
        context.put("RequestURI", "/ModifyKeyPairAttributes");

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

        @ParamAnnotation(paramType = "query", paramName = "description")
        public void setDescription(String description) {
            this.description = description;
        }

        @ParamAnnotation(paramType = "query", paramName = "description")
        public String getDescription() {
            return this.description;
        }

        // Required
        private String keyPair;

        @ParamAnnotation(paramType = "query", paramName = "keypair")
        public void setKeyPair(String keyPair) {
            this.keyPair = keyPair;
        }

        @ParamAnnotation(paramType = "query", paramName = "keypair")
        public String getKeyPair() {
            return this.keyPair;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getKeyPair())) {
                throw new QCException("KeyPair is required");
            }
            return null;
        }
    }

    public static class ModifyKeyPairAttributesOutput extends OutputModel {
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



















