package com.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * description:
 * @author  whd 
 * @date  2024/07/09 23:41:40 
 * @version 1.0.0 
*/


@Data
public class Role implements Serializable {
    /**
    * 角色ID
    */
    private Long roleId;

    /**
    * 角色名称
    */
    private String roleName;

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

    private static final long serialVersionUID = 1L;
}