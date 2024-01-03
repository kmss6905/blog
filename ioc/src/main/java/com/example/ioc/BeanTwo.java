package com.example.ioc;

public class BeanTwo {

    private final BeanOne beanOne;

    public BeanTwo(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
