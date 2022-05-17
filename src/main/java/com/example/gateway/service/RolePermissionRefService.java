package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.RolePermissionRef;
import com.example.gateway.entity.User;

import java.util.List;


public interface RolePermissionRefService  extends IService<RolePermissionRef> {

    /**
     * 删除某个角色的所有关联
     *
     * @param roleId 角色Id
     */
    void deleteRefByRoleId(Long roleId);

    /**
     * 添加角色和权限关联
     *
     * @param rolePermissionRef RolePermissionRef
     * @return UserRoleRef
     */
    void saveByRolePermissionRef(RolePermissionRef rolePermissionRef);

    /**
     * 批量添加
     *
     * @param rolePermissionRefs 列表
     */
    void batchSaveByRolePermissionRef(List<RolePermissionRef> rolePermissionRefs);

}
