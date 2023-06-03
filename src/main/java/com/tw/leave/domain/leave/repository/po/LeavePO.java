package com.tw.leave.domain.leave.repository.po;

import com.tw.leave.domain.BasePO;
import com.tw.leave.domain.leave.entity.ApprovalInfo;
import com.tw.leave.domain.leave.entity.valueobject.ApprovalStatus;
import com.tw.leave.domain.staff.entity.valueobject.StaffType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "leave")
public class LeavePO extends BasePO {

    private Long applicantId;
    private String applicantName;
    @Enumerated(EnumType.STRING)
    private StaffType applicantType;

    private Long approverId;
    private String approverName;
    @Enumerated(EnumType.STRING)
    private StaffType approverType;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus approvalStatus;

    private Date startTime;
    private Date endTime;
    private Integer duration;

    @Transient
    private List<ApprovalInfo> approvalInfos;
}
