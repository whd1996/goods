package com.service;

import com.entity.DictGoodsCatgory;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface DictGoodsCatgoryService{

    int deleteByPrimaryKey(Byte cateforyId);

    int insert(DictGoodsCatgory record);

    int insertSelective(DictGoodsCatgory record);

    DictGoodsCatgory selectByPrimaryKey(Byte cateforyId);

    int updateByPrimaryKeySelective(DictGoodsCatgory record);

    int updateByPrimaryKey(DictGoodsCatgory record);

}
