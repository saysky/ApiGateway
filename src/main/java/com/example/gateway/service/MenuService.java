package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.Menu;

import java.util.List;


/**
 * API业务逻辑接口
 */
public interface MenuService extends IService<Menu> {


    /**
     * 获得所有菜单，带有等级
     *
     * @return
     */
    List<Menu> findMenuListWithLevel();

    /**
     * 查询用户的菜单
     *
     * @param userId
     * @return
     */
    List<Menu> findByUserId(Long userId);

    /**
     * 根据用户id查询API URL列表
     *
     * @param userId
     * @return
     */
    List<String> findApiUrlsByUserId(Long userId);

    /**
     * 删除接口时去掉对于接口url
     * @param apiUrl
     */
    void removeApiUrl(String apiUrl);
}
