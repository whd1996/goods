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
public class UserOrder {
    private Long orderId;

    /**
    * 订单价格
    */
    private Integer orderPrice;

    /**
    * 商品数量
    */
    private Integer goodsNums;

    /**
    * 用户ID
    */
    private Integer userId;

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