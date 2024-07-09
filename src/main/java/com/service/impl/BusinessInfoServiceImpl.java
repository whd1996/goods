package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.BusinessInfo;
import com.mapper.BusinessInfoMapper;
import com.service.BusinessInfoService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class BusinessInfoServiceImpl implements BusinessInfoService{

    @Autowired
    private BusinessInfoMapper businessInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long businessId) {
        return businessInfoMapper.deleteByPrimaryKey(businessId);
    }

    @Override
    public int insert(BusinessInfo record) {
        return businessInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(BusinessInfo record) {
        return businessInfoMapper.insertSelective(record);
    }

    @Override
    public BusinessInfo selectByPrimaryKey(Long businessId) {
        return businessInfoMapper.selectByPrimaryKey(businessId);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessInfo record) {
        return businessInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BusinessInfo record) {
        return businessInfoMapper.updateByPrimaryKey(record);
    }

}
