package com.example.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.gateway.common.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息
 */
@Data
@TableName("user")
public class User extends BaseEntity {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 显示名称
     */
    private String userDisplayName;

    /**
     * 密码
     */
    @JsonIgnore
    private String userPass;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 说明
     */
    private String userDesc;

    /**
     * 0 正常
     * 1 禁用
     */
    private Integer status = 0;

    /**
     * 角色列表
     */
    @TableField(exist = false)
    private List<Role> roleList = new ArrayList<>();

    /**
     * 权限URL
     */
    @TableField(exist = false)
    private List<String> authUrls = new ArrayList<>();

}
