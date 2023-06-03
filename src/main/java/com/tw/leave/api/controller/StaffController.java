package com.tw.leave.api.controller;

import com.tw.leave.api.dto.StaffDTO;
import com.tw.leave.app.StaffAppService;
import com.tw.leave.infrastructure.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/staff")
@Slf4j
public class StaffController {

    @Resource
    private StaffAppService staffAppService;

    @PostMapping("/create")
    public Response create(StaffDTO staffDTO) {
        return Response.ok();
    }

    @PostMapping("/update")
    public Response update(StaffDTO staffDTO) {
        return Response.ok();
    }

    @GetMapping("/{id}")
    public Response findById(@PathVariable Long id) {
        return Response.ok();
    }
}
