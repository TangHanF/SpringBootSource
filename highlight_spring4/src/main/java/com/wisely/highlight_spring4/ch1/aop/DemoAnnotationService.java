package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
    }


    // 未进行Action注解，即便调用该方法，注解式拦截也不会生效
    public void delete() {
    }

    @Action(name = "注解式拦截的query操作")
    public void query() {
    }

}
