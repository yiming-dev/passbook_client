package com.passbook.passbook.service;

import com.passbook.passbook.vo.Feedback;
import com.passbook.passbook.vo.Response;

/**
 * <h1>评论功能：即用户评论相关功能的实现</h1>
 */
public interface IFeedbackService {
    /**
     * <h2>创建评论</h2>
     * @param feedback {@link Feedback}
     * @return {@link Response}
     */
    Response createFeedback(Feedback feedback);
    /**
     * <h2>ton</h2>
     * @param userId
     * @return {@link Response}
     */
    Response getFeedback(Long userId);
}
