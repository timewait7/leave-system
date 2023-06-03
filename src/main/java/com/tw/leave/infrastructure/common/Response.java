package com.tw.leave.infrastructure.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private Status status;

    private String msg;

    private Object data;

    public static Response ok() {
        return ok(StringUtils.EMPTY, null);
    }

    public static Response ok(String msg) {
        return ok(msg, null);
    }

    public static Response ok(String msg, Object data) {
        return Response.builder()
                .status(Status.SUCCESS)
                .msg(msg)
                .data(data)
                .build();
    }

    public static Response failed(String msg) {
        return failed(msg, null);
    }

    public static Response failed(String msg, Object data) {
        return Response.builder()
                .status(Status.FAILED)
                .msg(msg)
                .data(data)
                .build();
    }
}
