package com.tw.leave.infrastructure.feign;

import com.tw.leave.domain.staff.entity.Staff;
import com.tw.leave.infrastructure.common.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "auth-service", path = "/auth")
public interface AuthService {

    @PostMapping("/login")
    Response login(Staff staff);
}
