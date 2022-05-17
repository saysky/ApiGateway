package com.example.gateway;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

/**
 * 项目启动类
 */
@Slf4j
@SpringBootApplication
@EnableCaching
@MapperScan("com.example.gateway.mapper.*")
public class Application {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        log.info("项目 started at http://localhost:" + serverPort);
    }


}
