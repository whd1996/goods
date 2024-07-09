package com.service;

import com.entity.UserPoint;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface UserPointService{

    int deleteByPrimaryKey(Long userPointId);

    int insert(UserPoint record);

    int insertSelective(UserPoint record);

    UserPoint selectByPrimaryKey(Long userPointId);

    int updateByPrimaryKeySelective(UserPoint record);

    int updateByPrimaryKey(UserPoint record);

}
