package com.tw.leave.app;

import com.tw.leave.domain.staff.entity.Staff;

public interface StaffAppService {

    void create(Staff staff);

    void update(Staff staff);

    Staff findById(Long id);
}
