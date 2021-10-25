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

public class NotificationService {

    private EnvContext envContext;

    private String zone;

    public NotificationService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public NotificationService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input Request parameters and headers in the class
      * @return DescribeNotificationListsOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public DescribeNotificationListsOutput describeNotificationLists(DescribeNotificationListsInput input) throws QCException {
        if (input == null) {
            input = new DescribeNotificationListsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeNotificationLists");
        context.put("APIName", "DescribeNotificationLists");
        context.put("ServiceName", "DescribeNotificationLists");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeNotificationLists");

        input.setAction("DescribeNotificationLists");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,DescribeNotificationListsOutput.class);
        if(backModel != null){
            return (DescribeNotificationListsOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void describeNotificationLists(DescribeNotificationListsInput input, ResponseCallBack<DescribeNotificationListsOutput> callback) throws QCException {
        if (input == null) {
            input = new DescribeNotificationListsInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "DescribeNotificationLists");
        context.put("APIName", "DescribeNotificationLists");
        context.put("ServiceName", "DescribeNotificationLists");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/DescribeNotificationLists");

        input.setAction("DescribeNotificationLists");
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

    public static class DescribeNotificationListsInput extends IaasParamBody {
        private Integer limit;

        @JsonProperty(value = "limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        @JsonProperty(value = "limit")
        public Integer getLimit() {
            return this.limit;
        }

        // Required
        private List<String> notificationLists;

        @JsonProperty(value = "notification_lists")
        public void setNotificationLists(List<String> notificationLists) {
            this.notificationLists = notificationLists;
        }

        @JsonProperty(value = "notification_lists")
        public List<String> getNotificationLists() {
            return this.notificationLists;
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

        public String validateParam() throws QCException {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescribeNotificationListsOutput extends OutputModel {
        private String action;

        @JsonProperty(value = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @JsonProperty(value = "action")
        public String getAction() {
            return this.action;
        }

        private List<NotificationListModel> notificationListSet;

        @JsonProperty(value = "notification_list_set")
        public void setNotificationListSet(List<NotificationListModel> notificationListSet) {
            this.notificationListSet = notificationListSet;
        }

        @JsonProperty(value = "notification_list_set")
        public List<NotificationListModel> getNotificationListSet() {
            return this.notificationListSet;
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
      * @return SendAlarmNotificationOutput Response body and headers in the class
      * @throws QCException IOException or network error
      *
      * <a href=>Documentation URL</a>
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public SendAlarmNotificationOutput sendAlarmNotification(SendAlarmNotificationInput input) throws QCException {
        if (input == null) {
            input = new SendAlarmNotificationInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "SendAlarmNotification");
        context.put("APIName", "SendAlarmNotification");
        context.put("ServiceName", "SendAlarmNotification");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/SendAlarmNotification");

        input.setAction("SendAlarmNotification");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,SendAlarmNotificationOutput.class);
        if(backModel != null){
            return (SendAlarmNotificationOutput)backModel;
        }
        return null;
    }

     /**
       * @param input Request parameters and headers in the class
       * @param callback Response calls back when success
       * @throws QCException IOException or network error
       *
       * <a href=>Documentation URL</a>
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void sendAlarmNotification(SendAlarmNotificationInput input, ResponseCallBack<SendAlarmNotificationOutput> callback) throws QCException {
        if (input == null) {
            input = new SendAlarmNotificationInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "SendAlarmNotification");
        context.put("APIName", "SendAlarmNotification");
        context.put("ServiceName", "SendAlarmNotification");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/iaas/SendAlarmNotification");

        input.setAction("SendAlarmNotification");
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

    public static class SendAlarmNotificationInput extends IaasParamBody {
        // Required
        private List<NotificationDataModel> notificationData;

        @JsonProperty(value = "notification_data")
        public void setNotificationData(List<NotificationDataModel> notificationData) {
            this.notificationData = notificationData;
        }

        @JsonProperty(value = "notification_data")
        public List<NotificationDataModel> getNotificationData() {
            return this.notificationData;
        }

        // Required
        private String notificationListID;

        @JsonProperty(value = "notification_list_id")
        public void setNotificationListID(String notificationListID) {
            this.notificationListID = notificationListID;
        }

        @JsonProperty(value = "notification_list_id")
        public String getNotificationListID() {
            return this.notificationListID;
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

        // Required
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
            if (this.getNotificationData() != null && this.getNotificationData().size() > 0 ) {
                for (int i = 0 ; i < this.getNotificationData().size(); i++ ) {
                    
                    return null;

                    //if (!QCStringUtil.isEmpty(vValidate)) {
                    //    return vValidate;
                    // }
                }
            }
            if (QCStringUtil.isEmpty(this.getNotificationListID())) {
                throw new QCException("NotificationListID is required");
            }
            if (QCStringUtil.isEmpty(this.getUserID())) {
                throw new QCException("UserID is required");
            }
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SendAlarmNotificationOutput extends OutputModel {
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



















