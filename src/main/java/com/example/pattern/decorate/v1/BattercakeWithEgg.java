package com.example.pattern.decorate;

public class BattercakeWithEgg extends Battercake{
    @Override
    public String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}