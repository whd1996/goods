package com.mapper;

import com.entity.UserPointRecord;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface UserPointRecordMapper {
    int deleteByPrimaryKey(Long pointRecordId);

    int insert(UserPointRecord record);

    int insertSelective(UserPointRecord record);

    UserPointRecord selectByPrimaryKey(Long pointRecordId);

    int updateByPrimaryKeySelective(UserPointRecord record);

    int updateByPrimaryKey(UserPointRecord record);
}