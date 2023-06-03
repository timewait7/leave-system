package com.tw.leave.domain.rule.service;

import com.tw.leave.domain.rule.entity.ApprovalRule;
import com.tw.leave.domain.rule.repository.persistence.ApprovalRulePersistence;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApprovalRuleDomainService {

    @Resource
    private ApprovalRulePersistence approvalRulePersistence;

    public int getMaxLeaderLevel(String staffType, String leaveType, Integer duration) {
        ApprovalRule rule = ApprovalRule.builder()
                .staffType(staffType)
                .leaveType(leaveType)
                .duration(duration)
                .build();
        return approvalRulePersistence.getMaxLeaderLevel(rule);
    }
}
