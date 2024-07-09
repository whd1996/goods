package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.UserPointRecordMapper;
import com.entity.UserPointRecord;
import com.service.UserPointRecordService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class UserPointRecordServiceImpl implements UserPointRecordService{

    @Autowired
    private UserPointRecordMapper userPointRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long pointRecordId) {
        return userPointRecordMapper.deleteByPrimaryKey(pointRecordId);
    }

    @Override
    public int insert(UserPointRecord record) {
        return userPointRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(UserPointRecord record) {
        return userPointRecordMapper.insertSelective(record);
    }

    @Override
    public UserPointRecord selectByPrimaryKey(Long pointRecordId) {
        return userPointRecordMapper.selectByPrimaryKey(pointRecordId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserPointRecord record) {
        return userPointRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserPointRecord record) {
        return userPointRecordMapper.updateByPrimaryKey(record);
    }

}
