package com.sample.test.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo // 开启Springboot对dubbo的支持
@SpringBootApplication
public class SpringbootDubboProviderApplication {

    // 启动的顺序是必须先启动Zookeeper注册中心，再启动服务提供方的模块，再启动消费者的模块，不然会报错
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProviderApplication.class, args);
    }

}
