package com.passbook.passbook.service;

import com.passbook.passbook.vo.Pass;
import com.passbook.passbook.vo.Response;

/**
 * 获取用户个人的优惠券信息
 *
 */
public interface IUserPassService {
    /**
     * <h2>获取个人获取的优惠券</h2>
     * @param userId
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserPassInfo(Long userId)throws Exception;
    /**
     * <h2>获取用户已经消费了的优惠券，即已使用优惠券功能</h2>
     * @param userId
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserUsedPassInfo(Long userId) throws Exception;
    /**
     * <h2>获取用户所有的优惠券</h2>
     * @param userId
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserAllPassInfo(Long userId)throws Exception;
    /**
     * <h2>用户使用优惠券</h2>
     * @param pass {@link Pass}
     * @return {@link Response}
     * @throws Exception
     */
    Response userUsePass(Pass pass)throws Exception;



}
