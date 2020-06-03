package com.passbook.passbook.service.impl;

import com.alibaba.fastjson.JSON;
import com.passbook.passbook.constant.Constants;
import com.passbook.passbook.service.IHbasePassService;
import com.passbook.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * <h1>消费 Kafka 中的 PassTemplate</h1>
 * 将Kafka的数据存入Hbase中
 */
@Slf4j
@Component
public class ConsumePassTemplate {
    /**pass相关的HBase服务*/
    private final IHbasePassService passService;
    @Autowired
    public ConsumePassTemplate(IHbasePassService passService) {

        this.passService = passService;
    }

    @KafkaListener(topics = {Constants.TEMPLATE_TOPIC})
    public void receive(@Payload String passTemplate,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID)int partition,
                        @Header(KafkaHeaders.RECEIVED_TOPIC)String topic){
        log.info("Consumer Receive Passtemplate:{}",passTemplate);
        PassTemplate pt;
        try{
            pt = JSON.parseObject(passTemplate, PassTemplate.class);
        }catch (Exception ex){
            log.error("Parse PassTemplate Error:{}",ex.getMessage());
            return;
        }
        log.info("DropPassTemplateToHBase：{}",passService.dropPassTemplateToHbase(pt));
    }
}
