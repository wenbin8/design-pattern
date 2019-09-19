package com.wenbin.design.pattern.decorator;

public abstract class BattercakeDecotator extends Battercake {

    // 静态代理
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
