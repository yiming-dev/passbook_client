package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Controller 统一的响应对象</h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private Integer errorCode = 0;
    private String errorMsg = "";
    /**返回对象*/
    private Object data;

    /**
     * <h2>正确相应构造函数</h2>
     */
    public Response(Object data){
        this.data = data;
    }
    /**
     * <h2>空响应</h2>
     */
    public static Response success(){
        return new Response();
    }
    /**
     * <h2>错误响应</h2>
     */
    public static Response failure(String errorMsg){
        return new Response(-1,errorMsg,null);
    }
}
