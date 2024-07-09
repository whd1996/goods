package com.controller;
import com.entity.Permission;
import com.service.impl.PermissionServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (permission)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/permission")
public class PermissionController {
/**
* 服务对象
*/
    @Autowired
    private PermissionServiceImpl permissionServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public Permission selectOne(Integer id) {
    return permissionServiceImpl.selectByPrimaryKey(id);
    }

}
