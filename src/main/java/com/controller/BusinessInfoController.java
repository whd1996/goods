package com.controller;
import com.entity.BusinessInfo;
import com.service.impl.BusinessInfoServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (business_info)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/business_info")
public class BusinessInfoController {
/**
* 服务对象
*/
    @Autowired
    private BusinessInfoServiceImpl businessInfoServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public BusinessInfo selectOne(Integer id) {
    return businessInfoServiceImpl.selectByPrimaryKey(id);
    }

}
