package com.tw.leave.domain.leave.entity.valueobject;

import com.tw.leave.domain.staff.entity.Staff;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Approver {

    private Long id;

    private String name;

    private Integer level;

    public static Approver createFrom(Staff staff) {
        return Approver.builder()
                .id(staff.getId())
                .name(staff.getName())
                .level(staff.getLevel())
                .build();
    }
}
