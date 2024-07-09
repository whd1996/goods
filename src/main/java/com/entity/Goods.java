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
public class Goods {
    /**
    * 主键
    */
    private String goodsId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 商品所需积分
    */
    private Integer goodsPrice;

    /**
    * 商品图片url
    */
    private String goodsPicUrl;

    /**
    * 商品库存
    */
    private Integer goodsInventory;

    /**
    * 商品销量
    */
    private Integer goodsSalesVolume;

    /**
    * 商品类型ID
    */
    private Integer goodsTypeId;

    /**
    * 商品分类id
    */
    private Integer goodsCategoryId;

    /**
    * 创建人ID
    */
    private String goodsCreateId;

    /**
    * 商品描述
    */
    private String goodsInfo;

    /**
    * 商品状态 0-已下线-1-发布状态
    */
    private Byte goodsStatus;

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