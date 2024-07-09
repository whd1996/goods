package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.PermissionMapper;
import com.entity.Permission;
import com.service.PermissionService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int deleteByPrimaryKey(Long permissionId) {
        return permissionMapper.deleteByPrimaryKey(permissionId);
    }

    @Override
    public int insert(Permission record) {
        return permissionMapper.insert(record);
    }

    @Override
    public int insertSelective(Permission record) {
        return permissionMapper.insertSelective(record);
    }

    @Override
    public Permission selectByPrimaryKey(Long permissionId) {
        return permissionMapper.selectByPrimaryKey(permissionId);
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return permissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return permissionMapper.updateByPrimaryKey(record);
    }

}
