package com.controller;
import com.entity.UserPoint;
import com.service.impl.UserPointServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (user_point)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user_point")
public class UserPointController {
/**
* 服务对象
*/
    @Autowired
    private UserPointServiceImpl userPointServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public UserPoint selectOne(Integer id) {
    return userPointServiceImpl.selectByPrimaryKey(id);
    }

}
