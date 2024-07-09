package com.service;

import com.entity.Role;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 23:41:40 
 * @version 1.0.0 
*/


public interface RoleService{

    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
