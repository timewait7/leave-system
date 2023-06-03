package com.tw.leave.domain.rule.repository.dao;

import com.tw.leave.domain.rule.repository.po.ApprovalRulePO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalRuleRepo extends JpaRepository<ApprovalRulePO, Long> {

    ApprovalRulePO findById(Long id);

    ApprovalRulePO findByStaffTypeAndLeaveTypeAndDuration(String staffType, String leaveType, Integer duration);
}
