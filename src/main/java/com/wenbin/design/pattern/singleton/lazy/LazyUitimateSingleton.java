package com.wenbin.design.pattern.singleton.lazy;

// 终极版单例
public class LazyUitimateSingleton {
    // 默认使用LazyInnerClassSingleton的时候，会先初始化内部类
    // 如果没有使用的话，内部类是不加载的
    private LazyUitimateSingleton(){
        if (LazyHolder.lazy != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 每一个关键字都不是多余的
    // static关键字是为了使单例的空间共享
    // final 保证这个方法不会被重写，重载
    public static final LazyUitimateSingleton getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyUitimateSingleton.LazyHolder.lazy;
    }

    // 默认不加载
    private static class LazyHolder{
        private static final LazyUitimateSingleton lazy = new LazyUitimateSingleton();
    }
}
