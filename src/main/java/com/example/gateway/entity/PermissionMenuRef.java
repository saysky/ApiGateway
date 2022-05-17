package com.example.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.gateway.common.base.BaseEntity;
import lombok.Data;

@Data
@TableName("permission_menu_ref")
public class PermissionMenuRef extends BaseEntity {


    /**
     * 权限Id
     */
    private Long permissionId;

    /**
     * 菜单ID
     */
    private Long menuId;

    public PermissionMenuRef() {
    }


    public PermissionMenuRef(Long permissionId, Long menuId) {
        this.permissionId = permissionId;
        this.menuId = menuId;
    }
}