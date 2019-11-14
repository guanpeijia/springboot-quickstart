package com.gpj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author Peijia
 * @className ProviderApplication
 * @desc 生产者启动类
 * @create 2019/11/14 15:25
 */
@EnableAutoConfiguration
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
