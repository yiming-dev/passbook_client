package com.passbook.passbook.vo;

import com.passbook.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 优惠券模板信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassTemplateInfo extends PassTemplate {
    private PassTemplate passTemplate;
    private Merchants merchants;
}
