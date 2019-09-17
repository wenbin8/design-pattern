package com.wenbin.design.pattern.proxy.jdkproxy;

import com.wenbin.design.pattern.proxy.staticproxy.Person;


public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Girl());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
