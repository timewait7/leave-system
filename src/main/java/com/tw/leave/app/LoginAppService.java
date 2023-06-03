package com.tw.leave.app;

import com.tw.leave.api.dto.StaffDTO;
import com.tw.leave.infrastructure.common.Response;

public interface LoginAppService {

    Response login(StaffDTO staffDTO);
}
