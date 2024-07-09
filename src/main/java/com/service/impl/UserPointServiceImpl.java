package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.UserPointMapper;
import com.entity.UserPoint;
import com.service.UserPointService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class UserPointServiceImpl implements UserPointService{

    @Autowired
    private UserPointMapper userPointMapper;

    @Override
    public int deleteByPrimaryKey(Long userPointId) {
        return userPointMapper.deleteByPrimaryKey(userPointId);
    }

    @Override
    public int insert(UserPoint record) {
        return userPointMapper.insert(record);
    }

    @Override
    public int insertSelective(UserPoint record) {
        return userPointMapper.insertSelective(record);
    }

    @Override
    public UserPoint selectByPrimaryKey(Long userPointId) {
        return userPointMapper.selectByPrimaryKey(userPointId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserPoint record) {
        return userPointMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserPoint record) {
        return userPointMapper.updateByPrimaryKey(record);
    }

}
