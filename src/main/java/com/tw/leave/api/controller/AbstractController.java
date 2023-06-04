package com.tw.leave.api.controller;

import com.tw.leave.infrastructure.common.MetaData;
import com.tw.leave.infrastructure.common.ResultModel;
import com.tw.leave.infrastructure.common.TraceConstants;
import org.slf4j.MDC;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class AbstractController {

    protected <T> ResultModel<T> response() {
        return response(null);
    }

    protected <T> ResultModel<T> response(T data) {
        return response(data, "success");
    }

    protected <T> ResultModel<T> response(T data, String msg) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String traceid = MDC.get(TraceConstants.TRACEID);
        String spanid = MDC.get(TraceConstants.SPANID);

        MetaData metaData = new MetaData(request.getRequestURI(), request.getMethod(), traceid, spanid);
        ResultModel<T> resultModel = ResultModel.ok(data, metaData);
        resultModel.setMsg(msg);
        return resultModel;
    }
}
