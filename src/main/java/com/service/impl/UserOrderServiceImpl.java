package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.UserOrderMapper;
import com.entity.UserOrder;
import com.service.UserOrderService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class UserOrderServiceImpl implements UserOrderService{

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long orderId) {
        return userOrderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(UserOrder record) {
        return userOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(UserOrder record) {
        return userOrderMapper.insertSelective(record);
    }

    @Override
    public UserOrder selectByPrimaryKey(Long orderId) {
        return userOrderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserOrder record) {
        return userOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserOrder record) {
        return userOrderMapper.updateByPrimaryKey(record);
    }

}
