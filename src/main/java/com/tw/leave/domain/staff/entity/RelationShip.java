package com.tw.leave.domain.staff.entity;

import com.tw.leave.domain.Entity;
import lombok.Data;

/**
 * @Author linfeng
 * @create 2023/6/2 10:50 上午
 */
@Data
public class RelationShip extends Entity {

    private Long staffId;

    private Long leaderId;

    private Integer leaderLevel;
}
