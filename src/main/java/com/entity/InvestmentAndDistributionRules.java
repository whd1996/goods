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
public class InvestmentAndDistributionRules {
    /**
    * 规则ID
    */
    private Long ruleId;

    /**
    * 商品ID
    */
    private String goodsId;

    /**
    * 上线时间（投放类型为1为空）
    */
    private Date upTime;

    /**
    * 下线时间（投放类型1为空）
    */
    private Date offlineTime;

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