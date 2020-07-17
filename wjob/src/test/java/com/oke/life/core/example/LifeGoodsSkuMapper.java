package com.oke.life.core.example;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifeGoodsSkuMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LifeGoodsSkuExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LifeGoodsSkuExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(LifeGoodsSku record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LifeGoodsSku record);

    /**
     *
     * @mbggenerated
     */
    List<LifeGoodsSku> selectByExample(LifeGoodsSkuExample example);

    /**
     *
     * @mbggenerated
     */
    LifeGoodsSku selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LifeGoodsSku record, @Param("example") LifeGoodsSkuExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LifeGoodsSku record, @Param("example") LifeGoodsSkuExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LifeGoodsSku record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LifeGoodsSku record);
}