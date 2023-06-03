package com.tw.leave.app.impl;

import com.tw.leave.app.LoginAppService;
import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.infrastructure.common.Response;
import com.tw.leave.infrastructure.feign.AuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginAppServiceImpl implements LoginAppService {

    @Resource
    private AuthService authService;

    public Response login(Staff staff) {
        return authService.login(staff);
    }
}
