package com.example.pattern.observer.guava;

import com.example.pattern.observer.tcadvice.Advice;
import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    private Advice advice;
    private String name = "TC广而告之";

    @Subscribe
    public void subscribe(Advice advice){
        System.out.println(advice.getUsername()+"在"+name+"上提交了"+advice.getContent());
    }

}