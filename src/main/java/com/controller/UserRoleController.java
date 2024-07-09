package com.controller;
import com.entity.UserRole;
import com.service.impl.UserRoleServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (user_role)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user_role")
public class UserRoleController {
/**
* 服务对象
*/
    @Autowired
    private UserRoleServiceImpl userRoleServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public UserRole selectOne(Integer id) {
    return userRoleServiceImpl.selectByPrimaryKey(id);
    }

}
