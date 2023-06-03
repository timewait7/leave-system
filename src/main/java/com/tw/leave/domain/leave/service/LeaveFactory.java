package com.tw.leave.domain.leave.service;

import com.tw.leave.domain.leave.entity.Leave;
import com.tw.leave.domain.leave.repository.persistence.LeavePersistence;
import com.tw.leave.domain.leave.repository.po.LeavePO;
import com.tw.leave.infrastructure.util.OrikaBeanUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LeaveFactory {

    @Resource
    private LeavePersistence leavePersistence;

    public Leave createFromId(Long id) {
        LeavePO leavePO = leavePersistence.findById(id);
        return OrikaBeanUtil.convert(leavePO, Leave.class);
    }

    public Leave createFromPO(LeavePO leavePO) {
        return OrikaBeanUtil.convert(leavePO, Leave.class);
    }
}
