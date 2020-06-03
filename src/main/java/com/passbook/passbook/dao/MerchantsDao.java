package com.passbook.passbook.dao;

import com.passbook.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Merchants Dao 接口
 */
@Repository
public interface MerchantsDao extends JpaRepository<Merchants,Integer>{
    /**
     * 根据id获取商户对象
     * @Param id 商户id
     * @Return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * 根据商户名称获取商户对象
     * @Param name 商户名称
     * @Return {@link Merchants}
     */
    Merchants findByName(String name);

    /**
     * <h2>根据商户ids获取商户对象</h2>
     * @param ids 商户ids
     * @return {@link Merchants}
     */
    List<Merchants> findByIdIn(List<Integer> ids);
}
