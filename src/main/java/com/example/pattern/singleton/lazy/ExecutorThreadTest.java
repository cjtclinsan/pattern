package com.example.pattern.singleton.lazy;

public class ExecutorThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("END");
    }

}