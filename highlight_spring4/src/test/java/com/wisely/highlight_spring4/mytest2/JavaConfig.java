package com.wisely.highlight_spring4.mytest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
@Configuration
//@ComponentScan("")
public class JavaConfig {

    @Bean
    public FunctionService createFunctionServiceInstance() {
        //System.out.println(Math.random());
        return new FunctionService();
    }

    @Bean
    public UseFunctionService createUseFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        FunctionService functionService=createFunctionServiceInstance();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
