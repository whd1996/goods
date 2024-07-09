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
public class User {
    /**
    * 主键、用户id
    */
    private String userId;

    /**
    * 用户昵称
    */
    private String nickName;

    /**
    * 用户头像路径
    */
    private String avatarUrl;

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