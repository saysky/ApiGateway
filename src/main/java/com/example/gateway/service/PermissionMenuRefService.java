package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.Menu;
import com.example.gateway.entity.PermissionMenuRef;

import java.util.List;


public interface PermissionMenuRefService extends IService<PermissionMenuRef> {

    /**
     * 删除某个菜单的所有关联
     *
     * @param menuId 菜单id
     */
    void deleteRefByMenuId(Long menuId);

    /**
     * 删除某个权限的所有关联
     *
     * @param permissionId 权限Id
     */
    void deleteRefByPermissionId(Long permissionId);

    /**
     * 根据权限id查询菜单列表
     *
     * @param permissionId
     * @return
     */
    List<Menu> findByPermissionId(Long permissionId);

    /**
     * 添加
     *
     * @param permissionMenuRef permissionMenuRef
     * @return UserRoleRef
     */
    void saveByPermissionMenuRef(PermissionMenuRef permissionMenuRef);

    /**
     * 批量添加
     *
     * @param permissionMenuRef 列表
     */
    void batchSaveByPermissionMenuRef(List<PermissionMenuRef> permissionMenuRef);

}
