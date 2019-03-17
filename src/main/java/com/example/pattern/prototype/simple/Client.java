package com.example.pattern.prototype;

public class Client {
//    private Prototype prototype;
//
//    public Client(Prototype prototype){
//        this.prototype = prototype;
//    }

    public Prototype startClone(Prototype concreateprototype){
        return concreateprototype.clone();
    }
}