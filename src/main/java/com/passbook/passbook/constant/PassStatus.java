package com.passbook.passbook.constant;

/**
 * <h1>优惠券状态</h1>
 */
public enum PassStatus {
    UNUSED(1,"NOT USED"),
    USED(2,"USED"),
    ALL(3,"ALL_PASSBOOKS");

    private Integer code;
    private String desc;

    PassStatus(Integer code, String desc){
        this.code = code;
        this.desc =desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
