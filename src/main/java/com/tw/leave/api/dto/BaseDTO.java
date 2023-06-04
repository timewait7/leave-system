package com.tw.leave.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {

    protected Long id;

    protected Date createTime;

    protected Date updateTime;
}
