package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>User Object</h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private BaseInfo baseInfo;
    private OtherInfo otherInfo;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BaseInfo{
        private String name;
        private Integer age;
        private String sex;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherInfo{
        private String phone;
        private String address;
    }
}
