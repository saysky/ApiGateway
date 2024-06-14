package com.example.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.gateway.common.base.BaseEntity;
import lombok.Data;

import java.util.List;


/**
 * 权限
 *
 * @author example
 */
@Data
@TableName("permission")
public class Permission extends BaseEntity {

    /**
     * 权限名称
     */
    private String name;


    @TableField(exist = false)
    private List<Menu> menuList;
