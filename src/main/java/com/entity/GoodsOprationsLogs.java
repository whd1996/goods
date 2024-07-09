package com.entity;

import java.util.Date;
import lombok.Data;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 21:34:21 
 * @version 1.0.0 
*/


@Data
public class GoodsOprationsLogs {
    /**
    * 主键，日志ID
    */
    private Long logsId;

    /**
    * 权益ID
    */
    private String goodsId;

    /**
    * 操作类型（0-记录新增 1-发起审批 2-审批通过 3-审批驳回 4-上线 5-下线
    */
    private Byte operationType;

    /**
    * 审批备注
    */
    private String remarks;

    /**
    * 投放类型（0-定时上线 1-持续上线）
    */
    private Byte ruleType;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;

    /**
    * 是否删除
    */
    private Byte isDeleted;
}