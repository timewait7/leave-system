package com.tw.leave.domain.staff.service;

import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.domain.staff.repository.persistence.StaffPersistence;
import com.tw.leave.domain.staff.repository.po.StaffPO;
import com.tw.leave.infrastructure.util.OrikaBeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author linfeng
 * @create 2023/6/2 12:14 下午
 *
 * 领域服务，完成需要跨实体的业务
 */
@Service
@Slf4j
public class StaffDomainService {

    @Resource
    private StaffPersistence staffPersistence;
    @Resource
    private StaffFactory staffFactory;

    public void create(Staff staff) {
        StaffPO staffPO = OrikaBeanUtil.convert(staff, StaffPO.class);
        staffPersistence.insert(staffPO);
    }

    public void update(Staff staff) {
        StaffPO staffPO = OrikaBeanUtil.convert(staff, StaffPO.class);
        staffPersistence.update(staffPO);
    }

    public void deleteById(long id) {
        StaffPO staffPO = staffPersistence.findById(id);
        staffPO.setDeleted(1);
        staffPersistence.update(staffPO);
    }

    public Staff findById(long id) {
        return staffFactory.createFromId(id);
    }

    public Staff findFirstApprover(long id, int level) {
        return null;
    }

    public Staff findNextApprover(long id, int level) {
        return null;
    }
}
