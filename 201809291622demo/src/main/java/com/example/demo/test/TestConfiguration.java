package com.example.demo.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//配置类，用来取代spring.xml那一堆<beans></beans>头文件
@Configuration
@ComponentScan(value="com.example")
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("Configuration容器启动初始化。。。");
    }
}
