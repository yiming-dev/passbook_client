package com.passbook.passbook.service;

import com.passbook.passbook.vo.Response;
import com.passbook.passbook.vo.User;

/**
 * <h1>用户服务：创建User服务</h1>
 */
public interface IUserservice {
    /**
     * <h2>创建用户</h2>
     * @param user {@link User}
     * @return {@link Response}
     * @throws Exception
     */
    Response createUser(User user)throws Exception;
}
