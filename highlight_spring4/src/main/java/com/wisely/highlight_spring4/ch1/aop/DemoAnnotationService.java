package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "ע��ʽ���ص�add����")
    public void add() {
    }


    // δ����Actionע�⣬������ø÷�����ע��ʽ����Ҳ������Ч
    public void delete() {
    }

    @Action(name = "ע��ʽ���ص�query����")
    public void query() {
    }

}
