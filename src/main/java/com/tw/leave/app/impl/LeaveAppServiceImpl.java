package com.tw.leave.app.impl;

import com.tw.leave.app.LeaveAppService;
import com.tw.leave.domain.leave.entity.Leave;
import com.tw.leave.domain.leave.service.LeaveDomainService;
import com.tw.leave.domain.rule.service.ApprovalRuleDomainService;
import com.tw.leave.domain.staff.service.StaffDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveAppServiceImpl implements LeaveAppService {

    @Resource
    private LeaveDomainService leaveDomainService;
    @Resource
    private StaffDomainService staffDomainService;
    @Resource
    private ApprovalRuleDomainService approvalRuleDomainService;

    @Override
    public void createLeave(Leave leave) {

    }

    @Override
    public void updateLeave(Leave leave) {

    }

    @Override
    public void submitApproval(Leave leave) {

    }

    @Override
    public List<Leave> findLeaveByApplicant(Long applicationId) {
        return null;
    }

    @Override
    public List<Leave> findLeaveByApprover(Long approverId) {
        return null;
    }
}
