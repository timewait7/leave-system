package com.tw.leave.domain.rule.entity;

import lombok.Data;

@Data
public class ApprovalRule {

    private String staffType;

    private String leaveType;

    private Integer duration;

    private Integer maxLeaderLevel;

}
