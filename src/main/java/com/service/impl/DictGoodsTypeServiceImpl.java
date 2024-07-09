package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.DictGoodsTypeMapper;
import com.entity.DictGoodsType;
import com.service.DictGoodsTypeService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class DictGoodsTypeServiceImpl implements DictGoodsTypeService{

    @Autowired
    private DictGoodsTypeMapper dictGoodsTypeMapper;

    @Override
    public int deleteByPrimaryKey(Byte typeId) {
        return dictGoodsTypeMapper.deleteByPrimaryKey(typeId);
    }

    @Override
    public int insert(DictGoodsType record) {
        return dictGoodsTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(DictGoodsType record) {
        return dictGoodsTypeMapper.insertSelective(record);
    }

    @Override
    public DictGoodsType selectByPrimaryKey(Byte typeId) {
        return dictGoodsTypeMapper.selectByPrimaryKey(typeId);
    }

    @Override
    public int updateByPrimaryKeySelective(DictGoodsType record) {
        return dictGoodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DictGoodsType record) {
        return dictGoodsTypeMapper.updateByPrimaryKey(record);
    }

}
