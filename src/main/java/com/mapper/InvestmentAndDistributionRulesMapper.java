package com.mapper;

import com.entity.InvestmentAndDistributionRules;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface InvestmentAndDistributionRulesMapper {
    int deleteByPrimaryKey(Long ruleId);

    int insert(InvestmentAndDistributionRules record);

    int insertSelective(InvestmentAndDistributionRules record);

    InvestmentAndDistributionRules selectByPrimaryKey(Long ruleId);

    int updateByPrimaryKeySelective(InvestmentAndDistributionRules record);

    int updateByPrimaryKey(InvestmentAndDistributionRules record);
}