package com.example.pattern.strategy.pay.payport;

public class JDPay extends Payment{

    @Override
    public String getName() {
        return "京东";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}