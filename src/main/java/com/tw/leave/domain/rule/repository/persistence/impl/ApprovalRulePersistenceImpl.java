package com.tw.leave.domain.rule.repository.persistence.impl;

import com.tw.leave.domain.rule.entity.ApprovalRule;
import com.tw.leave.domain.rule.repository.dao.ApprovalRuleRepo;
import com.tw.leave.domain.rule.repository.persistence.ApprovalRulePersistence;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApprovalRulePersistenceImpl implements ApprovalRulePersistence {

    @Resource
    private ApprovalRuleRepo approvalRuleRepo;

    @Override
    public int getMaxLeaderLevel(ApprovalRule rule) {

        return 0;
    }
}
