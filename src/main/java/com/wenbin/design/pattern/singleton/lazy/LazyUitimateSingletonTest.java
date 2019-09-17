package com.wenbin.design.pattern.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyUitimateSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        // 很无聊的情况下，进行破坏。一般没人吃饱撑的。如果有那一定是工作不饱和。
        Class<?> clazz = LazyUitimateSingleton.class;
        // 通过反射拿到私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(null);
        // 强制访问，强吻，不愿意也要吻
        constructor.setAccessible(true);
        // 暴力初始化
        Object o1 = constructor.newInstance();
        // 调用两次构造方法，相当于new了两次
        Object o2 = constructor.newInstance();

        System.out.println(o1 instanceof LazyUitimateSingleton);
        System.out.println(o2 instanceof LazyUitimateSingleton);
        System.out.println(o1 == o2);
    }
}
