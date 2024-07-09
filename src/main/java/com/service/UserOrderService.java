package com.service;

import com.entity.UserOrder;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface UserOrderService{

    int deleteByPrimaryKey(Long orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);

}
