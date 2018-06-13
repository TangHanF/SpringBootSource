package com.wisely.highlight_spring4.mytest2;

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
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHiUse(String name) {
        return functionService.sayHi(name);
    }
}
