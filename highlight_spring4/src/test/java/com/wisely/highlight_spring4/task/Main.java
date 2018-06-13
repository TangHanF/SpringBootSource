package com.wisely.highlight_spring4.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.task<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/13.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(TaskConfig.class);

        long start = System.currentTimeMillis();
        TaskService taskService = configApplicationContext.getBean(TaskService.class);
        for (int i = 0; i < 10; i++) {
            taskService.executorAsyncTask(i);
            taskService.executorAsyncTaskPlug(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ºÄÊ±£º" + (end - start));
        configApplicationContext.close();
    }
}
