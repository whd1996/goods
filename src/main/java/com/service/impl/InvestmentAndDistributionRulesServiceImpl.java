package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.InvestmentAndDistributionRulesMapper;
import com.entity.InvestmentAndDistributionRules;
import com.service.InvestmentAndDistributionRulesService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class InvestmentAndDistributionRulesServiceImpl implements InvestmentAndDistributionRulesService{

    @Autowired
    private InvestmentAndDistributionRulesMapper investmentAndDistributionRulesMapper;

    @Override
    public int deleteByPrimaryKey(Long ruleId) {
        return investmentAndDistributionRulesMapper.deleteByPrimaryKey(ruleId);
    }

    @Override
    public int insert(InvestmentAndDistributionRules record) {
        return investmentAndDistributionRulesMapper.insert(record);
    }

    @Override
    public int insertSelective(InvestmentAndDistributionRules record) {
        return investmentAndDistributionRulesMapper.insertSelective(record);
    }

    @Override
    public InvestmentAndDistributionRules selectByPrimaryKey(Long ruleId) {
        return investmentAndDistributionRulesMapper.selectByPrimaryKey(ruleId);
    }

    @Override
    public int updateByPrimaryKeySelective(InvestmentAndDistributionRules record) {
        return investmentAndDistributionRulesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InvestmentAndDistributionRules record) {
        return investmentAndDistributionRulesMapper.updateByPrimaryKey(record);
    }

}
