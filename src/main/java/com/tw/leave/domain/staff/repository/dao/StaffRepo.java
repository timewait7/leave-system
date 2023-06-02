package com.tw.leave.domain.staff.repository.dao;

import com.tw.leave.domain.staff.repository.po.StaffPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author linfeng
 * @create 2023/6/2 11:25 上午
 */
public interface StaffRepo extends JpaRepository<StaffPO, Long> {

    StaffPO findById(Long id);

    StaffPO findLeaderById(Long id);
}
