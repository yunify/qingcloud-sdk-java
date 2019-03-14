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

public class DNSAliasService {

    private EnvContext envContext;

    private String zone;

    public DNSAliasService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public DNSAliasService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return AssociateDNSAliasOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/dns_alias/associate_dns_alias.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public AssociateDNSAliasOutput associateDNSAlias(AssociateDNSAliasInput input) throws QCException {
        if (input == null) {
            input = new AssociateDNSAliasInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateDNSAlias");
        context.put("APIName", "AssociateDNSAlias");
        context.put("ServiceName", "AssociateDNSAlias");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateDNSAlias");

        input.setAction("AssociateDNSAlias");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,AssociateDNSAliasOutput.class);
        if(backModel != null){
            return (AssociateDNSAliasOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/dns_alias/associate_dns_alias.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void associateDNSAlias(AssociateDNSAliasInput input, ResponseCallBack<AssociateDNSAliasOutput> callback) throws QCException {
        if (input == null) {
            input = new AssociateDNSAliasInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "AssociateDNSAlias");
        context.put("APIName", "AssociateDNSAlias");
        context.put("ServiceName", "AssociateDNSAlias");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/AssociateDNSAlias");

        input.setAction("AssociateDNSAlias");
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

    public static class AssociateDNSAliasInput extends IaasParamBody {
        // Required
        private String prefix;

        @JsonProperty(value = "prefix")
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @JsonProperty(value = "prefix")
        public String getPrefix() {
            return this.prefix;
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

        public String validateParam() throws QCException {
            if (QCStringUtil.isEmpty(this.getPrefix())) {
                throw new QCException("Prefix is required");
            }
            if (QCStringUtil.isEmpty(this.getResource())) {
                throw new QCException("Resource is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssociateDNSAliasOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
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

        private String domainName;

        @JsonProperty(value = "domain_name")
        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        @JsonProperty(value = "domain_name")
        public String getDomainName() {
            return this.domainName;
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
      * @return DescribeDNSAliasesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/dns_alias/describe_dns_aliases.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeDNSAliasesOutput describeDNSAliases(DescribeDNSAliasesInput input) throws QCException {
        if (input == null) {
            input = new DescribeDNSAliasesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeDNSAliases");
        context.put("APIName", "DescribeDNSAliases");
        context.put("ServiceName", "DescribeDNSAliases");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeDNSAliases");

        input.setAction("DescribeDNSAliases");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeDNSAliasesOutput.class);
        if(backModel != null){
            return (DescribeDNSAliasesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/dns_alias/describe_dns_aliases.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeDNSAliases(DescribeDNSAliasesInput input, ResponseCallBack<DescribeDNSAliasesOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeDNSAliasesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeDNSAliases");
        context.put("APIName", "DescribeDNSAliases");
        context.put("ServiceName", "DescribeDNSAliases");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeDNSAliases");

        input.setAction("DescribeDNSAliases");
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

    public static class DescribeDNSAliasesInput extends IaasParamBody {
        private List<String> dNSAliases;

        @JsonProperty(value = "dns_aliases")
        public void setDNSAliases(List<String> dNSAliases) {
            this.dNSAliases = dNSAliases;
        }

        @JsonProperty(value = "dns_aliases")
        public List<String> getDNSAliases() {
            return this.dNSAliases;
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

        private String resourceID;

        @JsonProperty(value = "resource_id")
        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        @JsonProperty(value = "resource_id")
        public String getResourceID() {
            return this.resourceID;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeDNSAliasesOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<DNSAliasModel> dNSAliasSet;

        @JsonProperty(value = "dns_alias_set")
        public void setDNSAliasSet(List<DNSAliasModel> dNSAliasSet) {
            this.dNSAliasSet = dNSAliasSet;
        }

        @JsonProperty(value = "dns_alias_set")
        public List<DNSAliasModel> getDNSAliasSet() {
            return this.dNSAliasSet;
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
      * @return DissociateDNSAliasesOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/dns_alias/dissociate_dns_aliases.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DissociateDNSAliasesOutput dissociateDNSAliases(DissociateDNSAliasesInput input) throws QCException {
        if (input == null) {
            input = new DissociateDNSAliasesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateDNSAliases");
        context.put("APIName", "DissociateDNSAliases");
        context.put("ServiceName", "DissociateDNSAliases");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateDNSAliases");

        input.setAction("DissociateDNSAliases");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DissociateDNSAliasesOutput.class);
        if(backModel != null){
            return (DissociateDNSAliasesOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/dns_alias/dissociate_dns_aliases.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void dissociateDNSAliases(DissociateDNSAliasesInput input, ResponseCallBack<DissociateDNSAliasesOutput> callback) throws QCException {
        if (input == null) {
            input = new DissociateDNSAliasesInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DissociateDNSAliases");
        context.put("APIName", "DissociateDNSAliases");
        context.put("ServiceName", "DissociateDNSAliases");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DissociateDNSAliases");

        input.setAction("DissociateDNSAliases");
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

    public static class DissociateDNSAliasesInput extends IaasParamBody {
        // Required
        private List<String> dNSAliases;

        @JsonProperty(value = "dns_aliases")
        public void setDNSAliases(List<String> dNSAliases) {
            this.dNSAliases = dNSAliases;
        }

        @JsonProperty(value = "dns_aliases")
        public List<String> getDNSAliases() {
            return this.dNSAliases;
        }

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DissociateDNSAliasesOutput extends OutputModel {
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
      * @return GetDNSLabelOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=https://docs.qingcloud.com/api/dns_alias/get_dns_label.html>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetDNSLabelOutput getDNSLabel() throws QCException {IaasParamBody input = new IaasParamBody();
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetDNSLabel");
        context.put("APIName", "GetDNSLabel");
        context.put("ServiceName", "GetDNSLabel");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetDNSLabel");

        input.setAction("GetDNSLabel");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetDNSLabelOutput.class);
        if(backModel != null){
            return (GetDNSLabelOutput)backModel;
        }
        return null;
    }

     /**
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=https://docs.qingcloud.com/api/dns_alias/get_dns_label.html>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getDNSLabel( ResponseCallBack<GetDNSLabelOutput> callback) throws QCException {
        IaasParamBody input = new IaasParamBody();
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetDNSLabel");
        context.put("APIName", "GetDNSLabel");
        context.put("ServiceName", "GetDNSLabel");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/GetDNSLabel");

        input.setAction("GetDNSLabel");
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

    

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDNSLabelOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private String dNSLabel;

        @JsonProperty(value = "dns_label")
        public void setDNSLabel(String dNSLabel) {
            this.dNSLabel = dNSLabel;
        }

        @JsonProperty(value = "dns_label")
        public String getDNSLabel() {
            return this.dNSLabel;
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



















