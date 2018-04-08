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

public class MonitorService {

    private EnvContext envContext;

    private String zone;

    public MonitorService(EnvContext envContext) {
        this.envContext = envContext;
    }

    public MonitorService(EnvContext envContext, String zone) {
        this.envContext = envContext;
        this.zone = zone;
    }
        
    /**
      * @param input
      * @throws QCException
      *
      * Documentation URL: https://docs.qingcloud.com/api/monitor/get_monitor.html
      */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public GetMonitorOutput getMonitor(GetMonitorInput input) throws QCException {
        if (input == null) {
            input = new GetMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetMonitor");
        context.put("APIName", "GetMonitor");
        context.put("ServiceName", "GetMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/GetMonitor");

        input.setAction("GetMonitor");
        if (QCStringUtil.isEmpty(this.zone)) {
            input.setZone(this.envContext.getZone());
        } else {
            input.setZone(this.zone);
        }

        Object backModel = ResourceRequestFactory.getResourceRequest().sendApiRequest(context, input,GetMonitorOutput.class);
        if(backModel != null){
            return (GetMonitorOutput)backModel;
        }
        return null;
    }

     /**
       * @param input
       * @param callback
       * @throws QCException
       *
       * Documentation URL: https://docs.qingcloud.com/api/monitor/get_monitor.html
       */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getMonitor(GetMonitorInput input, ResponseCallBack<GetMonitorOutput> callback) throws QCException {
        if (input == null) {
            input = new GetMonitorInput();
        }
        Map context = new HashMap();
        context.put(QCConstant.ENV_CONTEXT_KEY, this.envContext);
        context.put("OperationName", "GetMonitor");
        context.put("APIName", "GetMonitor");
        context.put("ServiceName", "GetMonitor");
        context.put("RequestMethod", "GET");
        context.put("RequestURI", "/GetMonitor");

        input.setAction("GetMonitor");
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

    public static class GetMonitorInput extends IaasParamBody {
        private String endTime;

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "end_time")
        public String getEndTime() {
            return this.endTime;
        }

        private List<String> meters;

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public void setMeters(List<String> meters) {
            this.meters = meters;
        }

        @ParamAnnotation(paramType = "query", paramName = "meters")
        public List<String> getMeters() {
            return this.meters;
        }

        private String resource;

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public void setResource(String resource) {
            this.resource = resource;
        }

        @ParamAnnotation(paramType = "query", paramName = "resource")
        public String getResource() {
            return this.resource;
        }

        private String startTime;

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @ParamAnnotation(paramType = "query", paramName = "start_time")
        public String getStartTime() {
            return this.startTime;
        }

    	// Step's available values: 5m, 15m, 2h, 1d
        private String step;

        @ParamAnnotation(paramType = "query", paramName = "step")
        public void setStep(String step) {
            this.step = step;
        }

        @ParamAnnotation(paramType = "query", paramName = "step")
        public String getStep() {
            return this.step;
        }

        public String validateParam() throws QCException {
            String[] stepValidValues = {
                "5m", "15m", "2h", "1d"
            };

            boolean stepIsValid = false;
            for (String v : stepValidValues) {
                if (v.equals(this.getStep())) {
                    stepIsValid = true;
                }
                Boolean stepIsRequired = Boolean.FALSE;
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

    public static class GetMonitorOutput extends OutputModel {
        private String action;

        @ParamAnnotation(paramType = "query", paramName = "action")
        public void setAction(String action) {
            this.action = action;
        }

        @ParamAnnotation(paramType = "query", paramName = "action")
        public String getAction() {
            return this.action;
        }

        private List<MeterModel> meterSet;

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public void setMeterSet(List<MeterModel> meterSet) {
            this.meterSet = meterSet;
        }

        @ParamAnnotation(paramType = "query", paramName = "meter_set")
        public List<MeterModel> getMeterSet() {
            return this.meterSet;
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



















