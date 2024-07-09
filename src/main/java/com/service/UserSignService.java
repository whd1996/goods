package com.service;

import com.entity.UserSign;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface UserSignService{

    int deleteByPrimaryKey(Long signId);

    int insert(UserSign record);

    int insertSelective(UserSign record);

    UserSign selectByPrimaryKey(Long signId);

    int updateByPrimaryKeySelective(UserSign record);

    int updateByPrimaryKey(UserSign record);

}
