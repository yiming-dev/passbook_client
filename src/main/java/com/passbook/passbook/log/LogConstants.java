package com.passbook.passbook.log;

/**
 * <h1>日志记录常量定义</h1>
 */
public class LogConstants {
    /**
     * <2>用户动作名称</2>
     * */
    public class ActionName{
        /**用户查看优惠券信息*/
        public static final String USER_PASS_INFO = "USER_PASS_INFO";
        /**用户查看已使用优惠券信息*/
        public static final String USER_USED_PASS_INFO = "USER_USED_PASS_INFO";
        /**用户使用优惠券*/
        public static final String USER_USE_PASS= "USER_USE_PASS";
        /**用户获取库存信息*/
        public static final String INVENTORY_INFO = "INVENTORY_INFO";
        /**用户领取优惠券*/
        public static final String GAIN_PASS_TEMPLATE = "GAIN_PASS_TEMPLATE";
        /**用户创建评论*/
        public static final String CREATE_FEEDBACK = "CREATE_FEEDBACK";
        /**用户获取评论*/
        public static final String GET_FEEDBACK = "GET_FEEDBACK";
        /**创建用户*/
        public static final String CREATE_USER = "CREATE_USER";
    }
}
