package com.passbook.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.passbook.constant.Constants;
import com.passbook.passbook.constant.FeedbackType;
import com.passbook.passbook.vo.Feedback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackServiceTest extends AbstractServiceTest{
    @Autowired
    private IFeedbackService feedbackService;

    @Test
    public void testCreateFeedback(){
        Feedback appFeedback = new Feedback();
        appFeedback.setUserId(userId);
        appFeedback.setType(FeedbackType.APP.getCode());
        appFeedback.setTemplateId("-1");
        appFeedback.setComment("app 反馈");
        System.out.println(JSON.toJSONString(
                feedbackService.createFeedback(appFeedback)
        ));

        Feedback passFeedback = new Feedback();
        passFeedback.setUserId(userId);
        passFeedback.setType(FeedbackType.PASS.getCode());
        passFeedback.setTemplateId("528d4290cbba7cb2b04ae96eaf74824c");
        passFeedback.setComment("优惠券反馈");
        System.out.println(JSON.toJSONString(
                feedbackService.createFeedback(passFeedback)
        ));
    }

    @Test
    public void testGetFeedback()throws Exception{
        System.out.println(JSON.toJSONString(
                feedbackService.getFeedback(userId)
        ));
    }
}
