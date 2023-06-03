package com.tw.leave.domain.leave.service;

import com.google.common.collect.Lists;
import com.tw.leave.domain.leave.entity.Leave;
import com.tw.leave.domain.leave.entity.valueobject.Approver;
import com.tw.leave.domain.leave.event.LeaveEvent;
import com.tw.leave.domain.leave.repository.persistence.LeavePersistence;
import com.tw.leave.infrastructure.common.EventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveDomainService {

    @Resource
    private EventPublisher eventPublisher;
    @Resource
    private LeavePersistence leavePersistence;
    @Resource
    private LeaveFactory leaveFactory;

    @Transactional
    public void createLeave(Leave leave, int maxLeaderLevel, Approver approver) {
        // 保存请假单

        // 发布事件
        LeaveEvent leaveEvent = new LeaveEvent();
        eventPublisher.post(leaveEvent);
    }

    public void updateLeave(Leave leave) {

    }

    public List<Leave> findByApplicant(Long id) {
        return Lists.newArrayList();
    }

    public List<Leave> findByApprover(Long id) {
        return Lists.newArrayList();
    }
}
