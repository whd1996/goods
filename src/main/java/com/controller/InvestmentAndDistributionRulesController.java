package com.controller;
import com.entity.InvestmentAndDistributionRules;
import com.service.impl.InvestmentAndDistributionRulesServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (investment_and_distribution_rules)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/investment_and_distribution_rules")
public class InvestmentAndDistributionRulesController {
/**
* 服务对象
*/
    @Autowired
    private InvestmentAndDistributionRulesServiceImpl investmentAndDistributionRulesServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public InvestmentAndDistributionRules selectOne(Integer id) {
    return investmentAndDistributionRulesServiceImpl.selectByPrimaryKey(id);
    }

}
