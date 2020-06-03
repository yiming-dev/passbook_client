package com.passbook.passbook.log;


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class LogGenerator {
    /**
     *
     * @param request{@link HttpServletRequest} 获取user通过http请求发送的所有信息
     * @param userId
     * @param action 日志类型
     * @param info 日志信息可以是null
     */
    public static void genLog(HttpServletRequest request,Long userId,String action,Object info){
        log.info(
                JSON.toJSONString(
                        new LogObject(action,userId,System.currentTimeMillis(),request.getRemoteAddr(),info)
                )
        );
    }
}
