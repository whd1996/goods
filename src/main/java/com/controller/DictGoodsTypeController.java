package com.controller;
import com.entity.DictGoodsType;
import com.service.impl.DictGoodsTypeServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (dict_goods_type)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/dict_goods_type")
public class DictGoodsTypeController {
/**
* 服务对象
*/
    @Autowired
    private DictGoodsTypeServiceImpl dictGoodsTypeServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public DictGoodsType selectOne(Integer id) {
    return dictGoodsTypeServiceImpl.selectByPrimaryKey(id);
    }

}
