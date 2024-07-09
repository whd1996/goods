package com.service;

import com.entity.PermissionRole;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface PermissionRoleService{

    int deleteByPrimaryKey(Long roleId);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    PermissionRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(PermissionRole record);

    int updateByPrimaryKey(PermissionRole record);

}
