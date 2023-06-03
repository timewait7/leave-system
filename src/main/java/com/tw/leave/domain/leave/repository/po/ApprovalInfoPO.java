package com.tw.leave.domain.leave.repository.po;

import com.tw.leave.domain.BasePO;
import com.tw.leave.domain.leave.entity.valueobject.ApprovalStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "approval_info")
public class ApprovalInfoPO extends BasePO {

    private Long leaveId;

    private Long applicantId;

    private Long approverId;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus status;

    private String remark;
}
