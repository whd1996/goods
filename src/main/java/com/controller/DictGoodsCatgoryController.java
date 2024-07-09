package com.controller;
import com.entity.DictGoodsCatgory;
import com.service.impl.DictGoodsCatgoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (dict_goods_catgory)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/dict_goods_catgory")
public class DictGoodsCatgoryController {
/**
* 服务对象
*/
    @Autowired
    private DictGoodsCatgoryServiceImpl dictGoodsCatgoryServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public DictGoodsCatgory selectOne(Integer id) {
    return dictGoodsCatgoryServiceImpl.selectByPrimaryKey(id);
    }

}
