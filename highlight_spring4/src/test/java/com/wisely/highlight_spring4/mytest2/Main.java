package com.wisely.highlight_spring4.mytest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.mytest2<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/12.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService=applicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHiUse("郭富"));




        applicationContext.close();
    }
}
