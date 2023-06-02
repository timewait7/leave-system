package com.tw.leave.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

/**
 * @Author linfeng
 * @create 2023/6/2 11:08 上午
 */
@Data
@MappedSuperclass
public abstract class BasePO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected Integer deleted;

    protected Date createTime;

    protected Date updateTime;
}
