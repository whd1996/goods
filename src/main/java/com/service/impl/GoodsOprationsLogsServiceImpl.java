package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.GoodsOprationsLogs;
import com.mapper.GoodsOprationsLogsMapper;
import com.service.GoodsOprationsLogsService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class GoodsOprationsLogsServiceImpl implements GoodsOprationsLogsService{

    @Autowired
    private GoodsOprationsLogsMapper goodsOprationsLogsMapper;

    @Override
    public int deleteByPrimaryKey(Long logsId) {
        return goodsOprationsLogsMapper.deleteByPrimaryKey(logsId);
    }

    @Override
    public int insert(GoodsOprationsLogs record) {
        return goodsOprationsLogsMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsOprationsLogs record) {
        return goodsOprationsLogsMapper.insertSelective(record);
    }

    @Override
    public GoodsOprationsLogs selectByPrimaryKey(Long logsId) {
        return goodsOprationsLogsMapper.selectByPrimaryKey(logsId);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsOprationsLogs record) {
        return goodsOprationsLogsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsOprationsLogs record) {
        return goodsOprationsLogsMapper.updateByPrimaryKey(record);
    }

}
