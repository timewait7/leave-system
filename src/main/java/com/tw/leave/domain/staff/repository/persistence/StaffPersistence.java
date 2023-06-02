package com.tw.leave.domain.staff.repository.persistence;

import com.tw.leave.domain.staff.repository.po.StaffPO;

/**
 * @Author linfeng
 * @create 2023/6/2 11:32 上午
 */
public interface StaffPersistence {

    void insert(StaffPO staffPO);

    void update(StaffPO staffPO);

    StaffPO findById(Long id);

    StaffPO findLeaderById(Long id);
}
