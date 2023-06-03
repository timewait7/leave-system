package com.tw.leave.domain.rule.repository.po;

import com.tw.leave.domain.BasePO;
import com.tw.leave.domain.leave.entity.valueobject.LeaveType;
import com.tw.leave.domain.staff.entity.valueobject.StaffType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "approval_rule")
public class ApprovalRulePO extends BasePO {

    @Enumerated(EnumType.STRING)
    private StaffType staffType;

    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    private Integer duration;
}
