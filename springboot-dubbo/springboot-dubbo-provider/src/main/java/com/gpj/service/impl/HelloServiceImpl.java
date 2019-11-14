package com.gpj.service.impl;

import com.gpj.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Peijia
 * @className HelloServiceImpl
 * @desc HelloService实现类
 * @create 2019/11/14 15:02
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("Hello dubbo!");
    }
}
