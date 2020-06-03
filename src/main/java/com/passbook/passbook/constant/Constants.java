package com.passbook.passbook.constant;

/**
 * 常亮定义
 */
public class Constants {
    /**商户优惠券 Kafka Topic */
    public static final String TEMPLATE_TOPIC = "merchants-template";
    /**Token文件存储目录 */
    public static final String TOKEN_DIR = "D:\\token_tmp\\token\\";
    /**已使用的token文件后缀*/
    public static final String USED_TOKEN_SUFFIX = "_";
    /**用户数的redis key*/
    public static final String USE_COUNT_REDIS_KEY = "user-count";

    /**
     * <h2>User Hbase Table</h2>
     */
    public class UserTable {
        /**User Hbase 表名*/
        public static final String TABLE_NAME = "pb:user";
        /**基本信息列族*/
        public static final String FAMILY_B = "b";
        /**用户名*/
        public static final String NAME = "name";
        /**用户年龄*/
        public static final String AGE = "age";
        /**用户性别*/
        public static final String SEX = "sex";
        /**额外信息列族*/
        public static final String FAMILY_O = "o";
        /**电话号码*/
        public static final String PHONE = "phone";
        /**住址*/
        public static final String ADDRESS= "address";
    }

    /**
     * <h2>PassTemplate Hbase Table</h2>
     */
    public class PassTemplateTable{
        /**PassTemplate Hbase 表名*/
        public static final String TABLE_NAME = "pb:passtemplate";
        /**基本信息列族*/
        public static final String FAMILY_B = "b";
        /**商户id*/
        public static final String ID = "id";
        /**优惠券标题*/
        public static final String TITLE = "title";
        /**优惠券摘要*/
        public static final String SUMMARY = "summary";
        /**优惠券详细信息*/
        public static final String DESC = "desc";
        /**优惠券是否有token*/
        public static final String HAS_TOKEN = "has_token";
        /**优惠券背景色*/
        public static final String BACKGROUND = "background";
        /**约束信息列族*/
        public static final String FAMILY_C = "c";
        /**最大个数限制*/
        public static final String LIMIT = "limit";
        /**优惠券开始时间*/
        public static final String START = "start";
        /**优惠券结束时间*/
        public static final String END = "end";
    }

    /**
     * <h2>Pass Hbase Table</h2>
     */
    public class PassTable{
        /**Pass Hbase 表名*/
        public static final String TABLE_NAME = "pb:pass";
        /**信息列族*/
        public static final String FAMILY_I = "i";
        /**商户id*/
        public static final String USER_ID = "user_id";
        /**优惠券标题*/
        public static final String TEMPLATE_ID = "template_id";
        /**优惠券摘要*/
        public static final String TOKEN = "token";
        /**优惠券详细信息*/
        public static final String ASSIGNED_DATE = "assigned_date";
        /**优惠券是否有token*/
        public static final String CON_DATE = "con_date";
    }

    /**
     * <h2>Feedback Hbase Table</h2>
     */
    public class Feedback{
        /**Pass Hbase 表名*/
        public static final String TABLE_NAME = "pb:feedback";
        /**信息列族*/
        public static final String FAMILY_I = "i";
        /**用户id*/
        public static final String USER_ID = "user_id";
        /**评论类型*/
        public static final String TYPE = "type";
        /**PassTemplate RowKey app 评论为-1*/
        public static final String TEMPLATE_ID = "template_id";
        /**评论内容*/
        public static final String COMMENT = "comment";
    }





}
