package com.controller;
import com.entity.Role;
import com.service.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (role)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/role")
public class RoleController {
/**
* 服务对象
*/
    @Autowired
    private RoleServiceImpl roleServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public Role selectOne(Integer id) {
    return roleServiceImpl.selectByPrimaryKey(id);
    }

}
