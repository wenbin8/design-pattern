package com.wenbin.design.pattern.singleton.register;

import java.lang.reflect.Constructor;

public class EnumSingletonTest1 {
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("wenbin", 666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

