package com.wenbin.design.pattern.proxy.jdkproxy;

import com.wenbin.design.pattern.proxy.staticproxy.Person;

public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
