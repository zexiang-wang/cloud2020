package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced //ribbon 需要添加此注解，如果自己手写负载均衡，则注销
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
