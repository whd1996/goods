package com.service;

import com.entity.GoodsOprationsLogs;
    /**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


public interface GoodsOprationsLogsService{

    int deleteByPrimaryKey(Long logsId);

    int insert(GoodsOprationsLogs record);

    int insertSelective(GoodsOprationsLogs record);

    GoodsOprationsLogs selectByPrimaryKey(Long logsId);

    int updateByPrimaryKeySelective(GoodsOprationsLogs record);

    int updateByPrimaryKey(GoodsOprationsLogs record);

}
