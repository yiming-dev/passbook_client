package com.passbook.passbook.constant;

/**
 * 评论类型枚举
 */
public enum FeedbackType {
    PASS("pass","PASSBOOK_COMMENTS"),
    APP("app","APPLICATION_COMMENTS");

    private String code;
    private String desc;

    FeedbackType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
