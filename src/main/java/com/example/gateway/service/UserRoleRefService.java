package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.User;
import com.example.gateway.entity.UserRoleRef;


public interface UserRoleRefService  extends IService<UserRoleRef> {

    /**
     * 根据用户Id删除
     *
     * @param userId 用户Id
     */
    void deleteByUserId(Long userId);


}
