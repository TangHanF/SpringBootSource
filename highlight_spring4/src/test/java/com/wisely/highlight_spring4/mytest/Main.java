package com.wisely.highlight_spring4.mytest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.mytest<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/12.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
public class Main {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext作为容器，接收一个配置类作为参数
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        //PeopleService peopleService = applicationContext.getBean(PeopleService.class);
        PeopleService peopleService = (PeopleService) applicationContext.getBean("PeopleService");
        String res = peopleService.sayHiPeople("gf");
        System.out.println(res);

        peopleService.play();
    }
}
