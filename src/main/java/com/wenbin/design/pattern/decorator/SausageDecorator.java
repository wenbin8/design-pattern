package com.wenbin.design.pattern.decorator;

public class SausageDecorator extends BattercakeDecotator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1跟香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }

}
