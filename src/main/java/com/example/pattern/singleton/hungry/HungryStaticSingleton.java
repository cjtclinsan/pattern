package com.example.pattern.singleton.hungry;

public class HungryStaticSingleton {
    private static HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static final HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}