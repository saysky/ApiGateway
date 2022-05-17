package com.example.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.gateway.common.base.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * 菜单
 *
 * @author example
 */
@Data
@TableName("menu")
public class Menu extends BaseEntity {

    /**
     * 名称
     */
    private String name;

    /**
     * 上级菜单id
     */
    private Long pid;

    /**
     * URL
     */
    private String url;

    /**
     * 排序值
     */
    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    /**
     * 资源类型，菜单或按钮
     */
    private String resourceType;

    /**
     * 接口URL
     */
    private String apiUrl;

    /**
     * 级别
     */
    @TableField(exist = false)
    private Integer level;

    /**
     * 子菜单列表
     */
    @TableField(exist = false)
    private List<Menu> childMenus;
}