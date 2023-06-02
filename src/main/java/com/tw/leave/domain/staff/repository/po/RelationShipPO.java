package com.tw.leave.domain.staff.repository.po;

import com.tw.leave.domain.BasePO;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @Author linfeng
 * @create 2023/6/2 11:15 上午
 */
@Data
@Entity
@Table(name = "relation_ship")
public class RelationShipPO extends BasePO {

    private Long staffId;

    private Long leaderId;

}
