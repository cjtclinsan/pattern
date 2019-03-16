package com.example.pattern.singleton.hungry;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static final HungrySingleton getInstance(){
        return hungrySingleton;
    }
}