package com.tw.leave.app.impl;

import com.tw.leave.app.StaffAppService;
import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.domain.staff.service.StaffDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StaffAppServiceImpl implements StaffAppService {

    @Resource
    private StaffDomainService staffDomainService;

    public void create(Staff staff) {
        staffDomainService.create(staff);
    }

    public void update(Staff staff) {
        staffDomainService.update(staff);
    }

    public Staff findById(Long id) {
        return staffDomainService.findById(id);
    }
}
