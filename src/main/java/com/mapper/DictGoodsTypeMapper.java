package com.mapper;

import com.entity.DictGoodsType;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface DictGoodsTypeMapper {
    int deleteByPrimaryKey(Byte typeId);

    int insert(DictGoodsType record);

    int insertSelective(DictGoodsType record);

    DictGoodsType selectByPrimaryKey(Byte typeId);

    int updateByPrimaryKeySelective(DictGoodsType record);

    int updateByPrimaryKey(DictGoodsType record);
}