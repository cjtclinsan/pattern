package com.example.pattern.decorate;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println("价格:"+battercake.getPrice());

        Battercake battercakeEgg = new BattercakeWithEgg();
        System.out.println(battercakeEgg.getMsg()+",总价格"+battercakeEgg.getPrice());

        Battercake battercake2 = new BattercakeWithSausage();
        System.out.println(battercake2.getMsg()+",总价格"+battercake2.getPrice());
    }
}