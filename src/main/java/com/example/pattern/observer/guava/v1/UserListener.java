package com.example.pattern.observer.guava;

import com.example.pattern.observer.tcadvice.Advice;
import com.google.common.eventbus.Subscribe;

public class UserListener {
    @Subscribe
    public void listen(Advice advice){
        System.out.println("接收到提问:"+advice.getContent()+"    ---提问者："+advice.getUsername());
    }
}