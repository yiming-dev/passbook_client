package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 库存请求响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryResponse {
    private Long userId;
    private List<PassTemplateInfo> passTemplateInfos;
}
