package com.wisely.highlight_spring4.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

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
@Service
public class TaskService {
    @Async
    public void executorAsyncTask(int i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executorAsyncTaskPlug(int i) {
        System.out.println("执行异步任务+1：" + i);
    }
}
