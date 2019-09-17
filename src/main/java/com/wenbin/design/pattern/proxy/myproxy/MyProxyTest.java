package com.wenbin.design.pattern.proxy.myproxy;

import com.wenbin.design.pattern.proxy.staticproxy.Person;
import com.wenbin.design.pattern.proxy.staticproxy.Son;

public class MyProxyTest {
    public static void main(String[] args) throws Exception {
        Person obj = (Person) new MyMeipo().getInstance(new Son());

        System.out.println(obj.getClass());
        obj.findLove();
    }
}
