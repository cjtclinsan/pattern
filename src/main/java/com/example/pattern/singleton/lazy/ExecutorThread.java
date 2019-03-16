package com.example.pattern.singleton.lazy;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(simpleSingleton+"  ===  "+Thread.currentThread().getName());
    }
}