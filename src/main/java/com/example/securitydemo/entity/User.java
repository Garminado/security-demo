package com.example.securitydemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 用户信息表
 */
@TableName("user")
@Data
@NoArgsConstructor
public class User {
    /**
    * 用户ID
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 用户账号
    */
    private String userName;

    /**
    * 密码
    */
    private String password;

    /**
    * 用户邮箱
    */
    private String email;

    /**
    * 手机号码
    */
    private String phone;

    /**
    * 用户性别（0男 1女 2未知）
    */
    private String sex;

    /**
    * 头像地址
    */
    private String avatar;

    /**
    * 帐号状态
    */
    private Byte status;
}