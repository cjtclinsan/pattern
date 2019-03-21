package com.example.pattern.strategy.pay.payport;

public class AliPay extends Payment{

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}