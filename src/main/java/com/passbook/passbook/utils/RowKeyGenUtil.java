package com.passbook.passbook.utils;

import com.passbook.passbook.vo.Feedback;
import com.passbook.passbook.vo.GainPassTemplateRequest;
import com.passbook.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * RowKey 生成器
 */
@Slf4j
public class RowKeyGenUtil {
    /**
     * <h2>根据提供的PassTemplate对象生成RowKey</h2>
     * @param passTemplate{@link {@link PassTemplate}}
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){
        String passInfo = String.valueOf(passTemplate.getId())+"_"+passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("GenPassTemplateRoeKey: {},{}",passInfo,rowKey);
        return rowKey;
    }

    /**
     * <h2>根据提供的领取优惠券请求生成RowKey，只可以在领取优惠券的时候使用</h2>
     * Pass RowKey = reversed(userId) + inverse(timestamp)+PassTemplate RowKey
     * @param request {@link GainPassTemplateRequest}
     * @return String RowKey
     */

    public static String genPassRowKey(GainPassTemplateRequest request){
        return new StringBuilder(String.valueOf(request.getUserId())).reverse().toString()
                + (Long.MAX_VALUE - System.currentTimeMillis())
                + genPassTemplateRowKey(request.getPassTemplate());
    }



    /**
     * 根据Feedback构造 RowKey
     * Hbase RowKey生成很讲究要仔细钻研
     * @param feedback {@link Feedback}
     * @return String RowKey
     */
    public static String genFeedbackRowKey(Feedback feedback){
        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString()+
                (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
