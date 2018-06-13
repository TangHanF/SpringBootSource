package com.wisely.highlight_spring4.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.el<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/12.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ELConfig.class);
        
        ELConfig config=applicationContext.getBean(ELConfig.class);

        System.out.println(config.getOsName());
        System.out.println(config.getBookName());

        System.out.println(config.getTestUrl("utf-8"));
    }
}
