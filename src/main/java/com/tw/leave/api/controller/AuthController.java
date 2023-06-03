package com.tw.leave.api.controller;

import com.tw.leave.api.dto.StaffDTO;
import com.tw.leave.app.LoginAppService;
import com.tw.leave.infrastructure.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Resource
    private LoginAppService loginAppService;

    @PostMapping("/login")
    public Response login(StaffDTO staffDTO) {
        return loginAppService.login(staffDTO);
    }
}
