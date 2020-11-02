package com.suzhou.huanzhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.suzhou.huanzhi.dao")
public class HuanzhiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuanzhiApplication.class, args);
    }

}
