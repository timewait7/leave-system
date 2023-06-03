package com.tw.leave.domain.leave.repository.dao;

import com.tw.leave.domain.leave.repository.po.LeavePO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveRepo extends JpaRepository<LeavePO, Long> {

    LeavePO findById(Long id);

    List<LeavePO> findByApplicantId(Long id);

    List<LeavePO> findByApproverId(Long id);
}
