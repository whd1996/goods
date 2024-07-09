package com.controller;
import com.entity.Goods;
import com.service.impl.GoodsServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (goods)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/goods")
public class GoodsController {
/**
* 服务对象
*/
    @Autowired
    private GoodsServiceImpl goodsServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public Goods selectOne(Integer id) {
    return goodsServiceImpl.selectByPrimaryKey(id);
    }

}
