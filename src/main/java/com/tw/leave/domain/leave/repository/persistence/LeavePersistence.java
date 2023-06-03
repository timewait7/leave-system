package com.tw.leave.domain.leave.repository.persistence;

import com.tw.leave.domain.leave.repository.po.LeavePO;

import java.util.List;

public interface LeavePersistence {

    void save(LeavePO leavePO);

    LeavePO findById(Long id);

    List<LeavePO> findByApplicantId(Long id);

    List<LeavePO> findByApproverId(Long id);
}
