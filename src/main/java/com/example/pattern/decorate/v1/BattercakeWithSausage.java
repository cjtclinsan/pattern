package com.example.pattern.decorate;

public class BattercakeWithSausage extends BattercakeWithEgg{
    @Override
    public String getMsg() {
        return super.getMsg()+"+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}