package com.tw.leave.domain.rule.repository.persistence;

import com.tw.leave.domain.rule.entity.ApprovalRule;

public interface ApprovalRulePersistence {

    int getMaxLeaderLevel(ApprovalRule rule);
}
