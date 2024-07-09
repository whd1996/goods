package com.controller;
import com.entity.UserOrder;
import com.service.impl.UserOrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (user_order)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user_order")
public class UserOrderController {
/**
* 服务对象
*/
    @Autowired
    private UserOrderServiceImpl userOrderServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public UserOrder selectOne(Integer id) {
    return userOrderServiceImpl.selectByPrimaryKey(id);
    }

}
