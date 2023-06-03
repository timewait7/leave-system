package com.tw.leave.app.impl;

import com.tw.leave.api.dto.StaffDTO;
import com.tw.leave.app.LoginAppService;
import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.infrastructure.common.Response;
import com.tw.leave.infrastructure.feign.AuthService;
import com.tw.leave.infrastructure.util.OrikaBeanUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginAppServiceImpl implements LoginAppService {

    @Resource
    private AuthService authService;

    public Response login(StaffDTO staffDTO) {
        Staff staff = OrikaBeanUtil.convert(staffDTO, Staff.class);
        return authService.login(staff);
    }
}
