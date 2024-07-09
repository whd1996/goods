package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.GoodsMapper;
import com.entity.Goods;
import com.service.GoodsService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int deleteByPrimaryKey(String goodsId) {
        return goodsMapper.deleteByPrimaryKey(goodsId);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(String goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

}
