package com.example.pattern.observer.guava;

import com.example.pattern.observer.tcadvice.Advice;
import com.google.common.eventbus.EventBus;

public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        UserListener listener = new UserListener();

        Advice advice = new Advice();
        advice.setUsername("tcccc");
        advice.setContent("发布问题");
        eventBus.register(guavaEvent);

        //注册观察者
        eventBus.register(listener);
        //发布
        eventBus.post(advice);


        //Guava面向方法，轻松落地观察者模式
    }
}