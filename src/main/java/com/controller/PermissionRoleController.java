package com.controller;
import com.entity.PermissionRole;
import com.service.impl.PermissionRoleServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (permission_role)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/permission_role")
public class PermissionRoleController {
/**
* 服务对象
*/
    @Autowired
    private PermissionRoleServiceImpl permissionRoleServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public PermissionRole selectOne(Integer id) {
    return permissionRoleServiceImpl.selectByPrimaryKey(id);
    }

}
