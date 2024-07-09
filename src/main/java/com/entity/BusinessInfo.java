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
public class BusinessInfo {
    /**
    * 主键
    */
    private Long businessId;

    /**
    * 商家类型(0-自营，1-合作商家)
    */
    private Byte businessType;

    /**
    * 商家名称
    */
    private String businessName;

    /**
    * 商家电话
    */
    private String businessTel;

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