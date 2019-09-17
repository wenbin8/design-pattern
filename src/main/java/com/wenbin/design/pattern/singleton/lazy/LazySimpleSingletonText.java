package com.wenbin.design.pattern.singleton.lazy;

public class LazySimpleSingletonText {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

        System.out.println("End");

    }
}
