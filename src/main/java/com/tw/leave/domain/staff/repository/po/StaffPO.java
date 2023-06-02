package com.tw.leave.domain.staff.repository.po;

import com.tw.leave.domain.BasePO;
import com.tw.leave.domain.staff.entity.valueobject.StaffStatus;
import com.tw.leave.domain.staff.entity.valueobject.StaffType;
import jakarta.persistence.*;
import lombok.Data;

/**
 * @Author linfeng
 * @create 2023/6/2 11:07 上午
 */
@Data
@Entity
@Table(name = "staff")
public class StaffPO extends BasePO {

    private String name;

    @Enumerated(EnumType.STRING)
    private StaffType staffType;

    @Enumerated(EnumType.STRING)
    private StaffStatus staffStatus;

    private String deptId;

    private Integer level;

    @OneToOne
    private RelationShipPO relationShipPO;
}
