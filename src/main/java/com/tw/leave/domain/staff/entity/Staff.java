package com.tw.leave.domain.staff.entity;

import com.tw.leave.domain.Entity;
import com.tw.leave.domain.staff.entity.valueobject.StaffStatus;
import com.tw.leave.domain.staff.entity.valueobject.StaffType;
import lombok.Data;

import java.util.List;

/**
 * @Author linfeng
 * @create 2023/6/2 10:35 上午
 */
@Data
public class Staff extends Entity {

    private String name;

    // 值对象
    private StaffType staffType;

    // 值对象
    private StaffStatus staffStatus;

    private Integer level;

    // 实体
    private List<RelationShip> relationShips;

    public Staff create() {
        this.staffStatus = StaffStatus.ENABLE;
        return this;
    }

    public Staff enable() {
        this.staffStatus = StaffStatus.ENABLE;
        return this;
    }

    public Staff disable() {
        this.staffStatus = StaffStatus.DISABLE;
        return this;
    }
}
