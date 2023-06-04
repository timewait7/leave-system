package com.tw.leave.infrastructure.common;

import java.io.Serializable;

public class BusinessException extends RuntimeException implements Serializable {

    private int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(BaseMessageCode messageCode) {
        super(messageCode.getMessage());
        this.code = messageCode.getCode();
    }
}
