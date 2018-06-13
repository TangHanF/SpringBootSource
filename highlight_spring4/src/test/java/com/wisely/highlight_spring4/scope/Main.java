package com.wisely.highlight_spring4.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.scope<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/12.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1=applicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService s2=applicationContext.getBean(DemoSingletonService.class);
        
        DemoPrototypeService p1=applicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2=applicationContext.getBean(DemoPrototypeService.class);


        System.out.println("s1与s2是否相等："+s1.equals(s2));
        System.out.println("s1与s2是否相等："+(s1==s2));

        System.out.println("p1与p2是否相等："+p1.equals(p2));
        System.out.println("p1与p2是否相等："+(p1==p2));
    }
}
