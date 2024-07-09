package com.mapper;

import com.entity.BusinessInfo;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface BusinessInfoMapper {
    int deleteByPrimaryKey(Long businessId);

    int insert(BusinessInfo record);

    int insertSelective(BusinessInfo record);

    BusinessInfo selectByPrimaryKey(Long businessId);

    int updateByPrimaryKeySelective(BusinessInfo record);

    int updateByPrimaryKey(BusinessInfo record);
}