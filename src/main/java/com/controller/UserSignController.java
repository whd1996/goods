package com.controller;
import com.entity.UserSign;
import com.service.impl.UserSignServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (user_sign)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user_sign")
public class UserSignController {
/**
* 服务对象
*/
    @Autowired
    private UserSignServiceImpl userSignServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public UserSign selectOne(Integer id) {
    return userSignServiceImpl.selectByPrimaryKey(id);
    }

}
