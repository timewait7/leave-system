package com.tw.leave.domain.leave.entity;

import com.google.common.collect.Lists;
import com.tw.leave.domain.Entity;
import com.tw.leave.domain.leave.entity.valueobject.Applicant;
import com.tw.leave.domain.leave.entity.valueobject.ApprovalStatus;
import com.tw.leave.domain.leave.entity.valueobject.Approver;
import com.tw.leave.domain.leave.entity.valueobject.LeaveType;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Leave extends Entity {

    private Applicant applicant;

    private Approver approver;

    private LeaveType leaveType;

    private ApprovalStatus approvalStatus;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private Integer maxLeaderLevel;

    private ApprovalInfo approvalInfo;

    private List<ApprovalInfo> historyApprovalInfos;

    public Leave create() {
        return this;
    }

    public Leave agree() {
        this.approvalStatus = ApprovalStatus.APPROVED;
        return this;
    }

    public Leave reject() {
        this.approvalStatus = ApprovalStatus.REJECTED;
        return this;
    }

    public Leave finish() {
        return this;
    }

    public Leave addApprovalInfo(ApprovalInfo approvalInfo) {
        if (historyApprovalInfos == null) {
            historyApprovalInfos = Lists.newArrayList();
        }
        historyApprovalInfos.add(approvalInfo);
        return this;
    }
}
