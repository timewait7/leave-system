package com.tw.leave.api.controller;

import com.tw.leave.api.dto.LeaveDTO;
import com.tw.leave.app.LeaveAppService;
import com.tw.leave.domain.leave.entity.Leave;
import com.tw.leave.infrastructure.common.Response;
import com.tw.leave.infrastructure.util.OrikaBeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("leave")
@Slf4j
public class LeaveController {

    @Resource
    private LeaveAppService leaveAppService;

    @PostMapping("/create")
    public Response createLeave(LeaveDTO leaveDTO) {
        Leave leave = OrikaBeanUtil.convert(leaveDTO, Leave.class);
        leaveAppService.createLeave(leave);
        return Response.ok();
    }

    @PostMapping("/update")
    public Response updateLeave(LeaveDTO leaveDTO) {
        return Response.ok();
    }

    @GetMapping("/{id}")
    public Response findById(@PathVariable Long id) {
        return Response.ok();
    }

    @PostMapping("/approval/submit")
    public Response submitApproval() {
        return Response.ok();
    }

    @GetMapping("/{applicantId}")
    public Response findByApplicant(@PathVariable Long applicantId) {
        return Response.ok();
    }

    @GetMapping("/{approverId}")
    public Response findByApprover(@PathVariable Long approverId) {
        return Response.ok();
    }
}
