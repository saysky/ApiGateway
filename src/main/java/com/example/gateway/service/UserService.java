package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.User;

/**
 * 用户业务逻辑接口
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名获得用户
     *
     * @param userName 用户名
     * @return 用户
     */
    User findByUserName(String userName);


    /**
     * 根据邮箱查找用户
     *
     * @param userEmail 邮箱
     * @return User
     */
    User findByEmail(String userEmail);

    /**
     * 根据用户名或密码查询
     * @param userNameOrEmail
     * @return
     */
    User findByUserNameOrEmail(String userNameOrEmail);

    /**
     * 更新密码
     *
     * @param userId   用户Id
     * @param password 密码
     */
    void updatePassword(Long userId, String password);

    /**
     * 分页获取所有用户
     *
     * @param roleId  角色ID
     * @param condition 查询条件
     * @param page      分页信息
     * @return 用户列表
     */
    Page<User> findByRoleAndCondition(Long roleId, User condition, Page<User> page);


    /**
     * 修改用户的登录状态为正常
     *
     * @return User
     */
    User updateUserLoginNormal(User user);


}
