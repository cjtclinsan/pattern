package com.example.pattern.singleton.register;

import com.sun.corba.se.spi.ior.ObjectKey;

public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
    private Object getData(){
        return data;
    };
}