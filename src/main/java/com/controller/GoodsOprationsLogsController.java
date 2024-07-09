package com.controller;
import com.entity.GoodsOprationsLogs;
import com.service.impl.GoodsOprationsLogsServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (goods_oprations_logs)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/goods_oprations_logs")
public class GoodsOprationsLogsController {
/**
* 服务对象
*/
    @Autowired
    private GoodsOprationsLogsServiceImpl goodsOprationsLogsServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public GoodsOprationsLogs selectOne(Integer id) {
    return goodsOprationsLogsServiceImpl.selectByPrimaryKey(id);
    }

}
