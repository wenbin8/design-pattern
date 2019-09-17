package com.wenbin.design.pattern.singleton.hungry;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() { }

    public HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
