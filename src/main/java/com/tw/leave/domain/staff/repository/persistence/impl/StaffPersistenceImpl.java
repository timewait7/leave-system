package com.tw.leave.domain.staff.repository.persistence.impl;

import com.tw.leave.domain.staff.repository.dao.StaffRepo;
import com.tw.leave.domain.staff.repository.persistence.StaffPersistence;
import com.tw.leave.domain.staff.repository.po.StaffPO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author linfeng
 * @create 2023/6/2 11:32 上午
 */
@Repository
public class StaffPersistenceImpl implements StaffPersistence {

    @Resource
    private StaffRepo staffRepo;

    @Override
    public void insert(StaffPO staffPO) {
        staffRepo.saveAndFlush(staffPO);
    }

    @Override
    public void update(StaffPO staffPO) {
        staffRepo.saveAndFlush(staffPO);
    }

    @Override
    public StaffPO findById(Long id) {
        return staffRepo.findById(id);
    }

    @Override
    public StaffPO findLeaderById(Long id) {
        return staffRepo.findLeaderById(id);
    }
}
