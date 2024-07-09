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
public class Permission {
    /**
    * 权限ID
    */
    private Long permissionId;

    /**
    * 用户ID
    */
    private String userId;

    /**
    * 权限名称
    */
    private String permissionName;

    /**
    * 权限路径URL
    */
    private String url;

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