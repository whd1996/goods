package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.UserRole;
import com.mapper.UserRoleMapper;
import com.service.UserRoleService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer roleId) {
        return userRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public UserRole selectByPrimaryKey(Integer roleId) {
        return userRoleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return userRoleMapper.updateByPrimaryKey(record);
    }

}
