package com.example.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.gateway.common.base.BaseEntity;
import lombok.Data;

/**
 * API 接口
 * @author example
 */
@Data
@TableName("api")
public class Api extends BaseEntity {

    /**
     * 所属应用名称
     */
    private String appName;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * API 名称
     */
    private String apiName;

    /**
     * 接口方法类型
     */
    private String requestMethod;

    /**
     * 接口URL
     */
    private String requestUrl;

