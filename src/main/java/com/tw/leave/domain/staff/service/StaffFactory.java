package com.tw.leave.domain.staff.service;

import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.domain.staff.repository.persistence.StaffPersistence;
import com.tw.leave.domain.staff.repository.po.StaffPO;
import com.tw.leave.infrastructure.util.OrikaBeanUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author linfeng
 * @create 2023/6/2 12:14 下午
 *
 * 工厂类，创建复杂的对象
 */
@Service
public class StaffFactory {

    @Resource
    private StaffPersistence staffPersistence;

    public Staff createFromId(Long id) {
        StaffPO staffPO = staffPersistence.findById(id);
        return OrikaBeanUtil.convert(staffPO, Staff.class);
    }

    public Staff createFromPO(StaffPO staffPO) {
        return OrikaBeanUtil.convert(staffPO, Staff.class);
    }
}
