package com.tw.leave.domain.leave.repository.persistence.impl;

import com.tw.leave.domain.leave.repository.dao.ApprovalInfoRepo;
import com.tw.leave.domain.leave.repository.dao.LeaveRepo;
import com.tw.leave.domain.leave.repository.persistence.LeavePersistence;
import com.tw.leave.domain.leave.repository.po.LeavePO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeavePersistenceImpl implements LeavePersistence {

    @Resource
    private LeaveRepo leaveRepo;
    @Resource
    private ApprovalInfoRepo approvalInfoRepo;

    @Override
    public void save(LeavePO leavePO) {

    }

    @Override
    public LeavePO findById(Long id) {
        return leaveRepo.findById(id);
    }

    @Override
    public List<LeavePO> findByApplicantId(Long id) {
        return leaveRepo.findByApplicantId(id);
    }

    @Override
    public List<LeavePO> findByApproverId(Long id) {
        return leaveRepo.findByApproverId(id);
    }
}
