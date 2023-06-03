package com.tw.leave.domain.leave.entity;

import com.tw.leave.domain.Entity;
import com.tw.leave.domain.leave.entity.valueobject.ApprovalType;
import com.tw.leave.domain.leave.entity.valueobject.Approver;
import lombok.Data;

@Data
public class ApprovalInfo extends Entity {

    // 审批者
    private Approver approver;

    private ApprovalType approvalType;

    // 审批意见
    private String remark;
}
