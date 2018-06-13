package com.wisely.highlight_spring4.mytest;

import org.springframework.stereotype.Service;

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
@Service
public class FunctionsFactory {
    public String sayHi(String name) {
        return "你好，" + name;
    }

    public void eat(String foodName) {
        System.out.println("我正在吃：" + foodName);
    }
}
