package com.passbook.passbook.service;

import com.passbook.passbook.vo.GainPassTemplateRequest;
import com.passbook.passbook.vo.Response;

/**
 * <h1>用户领取优惠券功能实现</h1>
 */


public interface IGainPassTemplateService {
    /**
     * <h2>用户领取优惠券</h2>
     * @param request {@link GainPassTemplateRequest}
     * @return
     * @throws Exception
     */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;

}
