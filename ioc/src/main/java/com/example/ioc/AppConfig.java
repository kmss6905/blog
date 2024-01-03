package com.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public BeanOne beanOne() {
        return new BeanOne();
    }

    @Bean
    public BeanTwo beanTwo() {
        return new BeanTwo(beanOne());
    }
}
