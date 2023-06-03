package com.tw.leave.domain.rule.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApprovalRule {

    private String staffType;

    private String leaveType;

    private Integer duration;

    private Integer maxLeaderLevel;

}
