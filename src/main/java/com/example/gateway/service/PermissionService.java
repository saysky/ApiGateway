package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.Permission;
import com.example.gateway.entity.User;

import java.util.List;
import java.util.Set;

/**
 * 权限逻辑接口
 */
public interface PermissionService  extends IService<Permission> {

    /**
     * 根据角色Id获得权限列表
     *
     * @param roleId 角色Id
     * @return 权限列表
     */
    List<Permission> listPermissionsByRoleId(Long roleId);



    /**
     * 获得某个用户的权限列表
     *
     * @param userId
     * @return
     */
    List<Permission> findPermissionByUserId(Long userId);


}
