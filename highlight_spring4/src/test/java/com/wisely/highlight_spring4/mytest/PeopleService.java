package com.wisely.highlight_spring4.mytest;

import org.springframework.beans.factory.annotation.Autowired;
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
@Service("PeopleService")
public class PeopleService {
    @Autowired
    FunctionsFactory functionsFactory;

    @Autowired
    PeopleSports peopleSports;

    public String sayHiPeople(String name) {
        return functionsFactory.sayHi(name);
    }

    public void play(){
        peopleSports.playFootball();
    }
}
