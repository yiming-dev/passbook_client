package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {
    private Long userId;
    private String rowKey;
    private String templateId;
    private String token;
    private Date assignedDate;
    private Date conDate;
}
