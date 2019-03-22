package com.example.pattern.decorate.v2;

public class EggDecorate extends BattercakeDecorate {
    public EggDecorate(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}