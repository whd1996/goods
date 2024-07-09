package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.UserSignMapper;
import com.entity.UserSign;
import com.service.UserSignService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class UserSignServiceImpl implements UserSignService{

    @Autowired
    private UserSignMapper userSignMapper;

    @Override
    public int deleteByPrimaryKey(Long signId) {
        return userSignMapper.deleteByPrimaryKey(signId);
    }

    @Override
    public int insert(UserSign record) {
        return userSignMapper.insert(record);
    }

    @Override
    public int insertSelective(UserSign record) {
        return userSignMapper.insertSelective(record);
    }

    @Override
    public UserSign selectByPrimaryKey(Long signId) {
        return userSignMapper.selectByPrimaryKey(signId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserSign record) {
        return userSignMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserSign record) {
        return userSignMapper.updateByPrimaryKey(record);
    }

}
