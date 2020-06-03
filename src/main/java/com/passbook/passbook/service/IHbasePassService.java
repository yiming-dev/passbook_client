package com.passbook.passbook.service;

import com.passbook.passbook.vo.PassTemplate;

/**
 * <h1>Pass Hbase服务</h1>
 */
public interface IHbasePassService {
    /**
     * <h2>将PassTemplate写入Hbase</h2>
     * @param passTemplate{@link {@link PassTemplate}}
     * @return boolean
     */
     boolean dropPassTemplateToHbase(PassTemplate passTemplate);
}
