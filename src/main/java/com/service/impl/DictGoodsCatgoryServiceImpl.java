package com.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.DictGoodsCatgoryMapper;
import com.entity.DictGoodsCatgory;
import com.service.DictGoodsCatgoryService;
/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Service
public class DictGoodsCatgoryServiceImpl implements DictGoodsCatgoryService{

    @Autowired
    private DictGoodsCatgoryMapper dictGoodsCatgoryMapper;

    @Override
    public int deleteByPrimaryKey(Byte cateforyId) {
        return dictGoodsCatgoryMapper.deleteByPrimaryKey(cateforyId);
    }

    @Override
    public int insert(DictGoodsCatgory record) {
        return dictGoodsCatgoryMapper.insert(record);
    }

    @Override
    public int insertSelective(DictGoodsCatgory record) {
        return dictGoodsCatgoryMapper.insertSelective(record);
    }

    @Override
    public DictGoodsCatgory selectByPrimaryKey(Byte cateforyId) {
        return dictGoodsCatgoryMapper.selectByPrimaryKey(cateforyId);
    }

    @Override
    public int updateByPrimaryKeySelective(DictGoodsCatgory record) {
        return dictGoodsCatgoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DictGoodsCatgory record) {
        return dictGoodsCatgoryMapper.updateByPrimaryKey(record);
    }

}
