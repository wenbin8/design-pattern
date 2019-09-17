package com.wenbin.design.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        // 创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        // 填充属性
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("prototypeA");
        List<String> hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA);

        // 创建Client对象准备开始克隆
        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA concretePrototypeAClone = (ConcretePrototypeA) client.startClone(concretePrototypeA);

        System.out.println(concretePrototypeAClone);
        System.out.println("克隆对象中的引用类型地址值:" + concretePrototypeAClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较:"+(concretePrototypeAClone.getHobbies() == concretePrototypeA.getHobbies()));
    }
}
