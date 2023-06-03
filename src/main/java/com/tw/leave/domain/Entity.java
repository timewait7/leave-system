package com.tw.leave.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author linfeng
 * @create 2023/6/2 11:01 上午
 */
@Data
public abstract class Entity {

    protected Long id;

    protected Date createTime;

    protected Date updateTime;
}
