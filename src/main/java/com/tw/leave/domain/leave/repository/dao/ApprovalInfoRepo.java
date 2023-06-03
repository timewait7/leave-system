package com.tw.leave.domain.leave.repository.dao;

import com.tw.leave.domain.leave.repository.po.ApprovalInfoPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprovalInfoRepo extends JpaRepository<ApprovalInfoPO, Long> {

    List<ApprovalInfoPO> findByLeaveId(Long id);

    List<ApprovalInfoPO> findByApplicantId(Long id);

}
