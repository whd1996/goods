package com.controller;
import com.entity.UserPointRecord;
import com.service.impl.UserPointRecordServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (user_point_record)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user_point_record")
public class UserPointRecordController {
/**
* 服务对象
*/
    @Autowired
    private UserPointRecordServiceImpl userPointRecordServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public UserPointRecord selectOne(Integer id) {
    return userPointRecordServiceImpl.selectByPrimaryKey(id);
    }

}
