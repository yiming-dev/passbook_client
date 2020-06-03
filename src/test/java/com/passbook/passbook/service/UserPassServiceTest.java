package com.passbook.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.passbook.vo.Pass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 用户优惠券服务测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPassServiceTest extends AbstractServiceTest{
    @Autowired
    private IUserPassService userPassService;
    @Test
    public void testGetUserPassInfo()throws Exception{
        System.out.println(JSON.toJSONString(
                userPassService.getUserPassInfo(userId)
        ));
    }

//    {
//        "data": [{
//        "merchants": {
//            "address": "Complex 2",
//                    "businessLicensesUrl": "www.subway.com",
//                    "id": 3,
//                    "isAudit": true,
//                    "logoUrl": "www.subway.com",
//                    "name": "subway",
//                    "phone": "5142222222"
//        },
//        "pass": {
//            "assignedDate": 1590897600000,
//                    "rowKey": "4039059223370445954851152528d4290cbba7cb2b04ae96eaf74824c",
//                    "templateId": "528d4290cbba7cb2b04ae96eaf74824c",
//                    "token": "token-1",
//                    "userId": 509304
//        },
//        "passTemplate": {
//            "backGround": 2,
//                    "desc": "sandwich",
//                    "end": 1591675200000,
//                    "hasToken": true,
//                    "id": 3,
//                    "limit": 9999,
//                    "start": 1589947200000,
//                    "summary": "summary: subway",
//                    "title": "title: subway-2"
//        }
//    }],
//        "errorCode": 0,
//            "errorMsg": ""
//    }

    @Test
    public void testGetUserUsedPassInfo()throws Exception{
        System.out.println(JSON.toJSONString(
                userPassService.getUserUsedPassInfo(userId)
        ));
    }
    //{"data":[],"errorCode":0,"errorMsg":""}

    @Test
    public void testGetUserAllPassInfo()throws Exception{
        System.out.println(JSON.toJSONString(
                userPassService.getUserAllPassInfo(userId)
        ));
    }

//    {
//        "data": [{
//        "merchants": {
//            "address": "Complex 2",
//                    "businessLicensesUrl": "www.subway.com",
//                    "id": 3,
//                    "isAudit": true,
//                    "logoUrl": "www.subway.com",
//                    "name": "subway",
//                    "phone": "5142222222"
//        },
//        "pass": {
//            "assignedDate": 1590897600000,
//                    "rowKey": "4039059223370445954851152528d4290cbba7cb2b04ae96eaf74824c",
//                    "templateId": "528d4290cbba7cb2b04ae96eaf74824c",
//                    "token": "token-1",
//                    "userId": 509304
//        },
//        "passTemplate": {
//            "backGround": 2,
//                    "desc": "sandwich",
//                    "end": 1591675200000,
//                    "hasToken": true,
//                    "id": 3,
//                    "limit": 9999,
//                    "start": 1589947200000,
//                    "summary": "summary: subway",
//                    "title": "title: subway-2"
//        }
//    }],
//        "errorCode": 0,
//            "errorMsg": ""
//    }

    @Test
    public void testUserUsePass()throws Exception{
        Pass pass = new Pass();
        pass.setUserId(userId);
        pass.setTemplateId("528d4290cbba7cb2b04ae96eaf74824c");
        System.out.println(JSON.toJSONString(
                userPassService.userUsePass(pass)
        ));
    }
    //{"errorCode":0,"errorMsg":""}
}
