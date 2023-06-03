package com.tw.leave.app;

import com.tw.leave.domain.leave.entity.Leave;

import java.util.List;

public interface LeaveAppService {

    void createLeave(Leave leave);

    void updateLeave(Leave leave);

    void submitApproval(Leave leave);

    List<Leave> findLeaveByApplicant(Long applicationId);

    List<Leave> findLeaveByApprover(Long approverId);
}
