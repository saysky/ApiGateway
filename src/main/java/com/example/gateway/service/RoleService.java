package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.Role;
import com.example.gateway.entity.User;

import java.util.List;

/**
 * 角色逻辑接口
 */
public interface RoleService   extends IService<Role>  {

    /**
     * 根据编号查询单个权限
     *
     * @param roleId roleId
     * @return Role
     */
    Role findByRoleId(Long roleId);


    /**
     * 根据用户Id获得角色
     *
     * @param userId 用户Id
     * @return 角色列表
     */
    List<Role> findByUserId(Long userId);

    /**
     * 统计这个角色的用户数
     *
     * @param roleId 角色Id
     */
    Integer countUserByRoleId(Long roleId);

    /**
     * 获得用户注册默认角色
     *
     * @return
     */
    Role findDefaultRole();

    /**
     * 查询用户有的角色ID
     * @param userId
     * @return
     */
    List<Long> findRoleIdsByUserId(Long userId);

}
