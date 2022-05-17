package com.example.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gateway.entity.Api;

import java.util.List;

/**
 * API业务逻辑接口
 */
public interface ApiService extends IService<Api> {


    /**
     * 按模块批量保存接口元数据（先删除该模块下的接口元数据，再批量保存）
     *
     * @param apiList    接口元数据list
     * @param appName    系统名称
     * @param moduleName 模块名称
     */
    void batchSaveApiList(List<Api> apiList, String appName, String moduleName);

    /**
     * 根据模块名称查询应用名
     *
     * @param appName
     * @return
     */
    List<String> getModuleNames(String appName);
}
