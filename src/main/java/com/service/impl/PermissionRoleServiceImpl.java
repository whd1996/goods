package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.PermissionRole;
import com.mapper.PermissionRoleMapper;
import com.service.PermissionRoleService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class PermissionRoleServiceImpl implements PermissionRoleService{

    @Autowired
    private PermissionRoleMapper permissionRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return permissionRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(PermissionRole record) {
        return permissionRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(PermissionRole record) {
        return permissionRoleMapper.insertSelective(record);
    }

    @Override
    public PermissionRole selectByPrimaryKey(Long roleId) {
        return permissionRoleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(PermissionRole record) {
        return permissionRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PermissionRole record) {
        return permissionRoleMapper.updateByPrimaryKey(record);
    }

}
