package com.passbook.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.passbook.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserservice userservice;
    @Test
    public void testCreateUser()throws Exception{
        User user = new User();
        user.setBaseInfo(new User.BaseInfo("user01",10,"m"));
        user.setOtherInfo(new User.OtherInfo("123456","Montreal"));
        System.out.println(JSON.toJSONString(userservice.createUser(user)));
        System.out.println("OVER");
    }
    //{"data":{"baseInfo":{"age":10,"name":"user01","sex":"m"},"id":509304,"otherInfo":{"address":"Montreal","phone":"123456"}},"errorCode":0,"errorMsg":""}
}