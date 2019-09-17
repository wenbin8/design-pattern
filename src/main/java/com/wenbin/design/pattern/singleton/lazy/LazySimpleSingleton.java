package com.wenbin.design.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要时候的时候才进行实例化
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() { }

    // 静态块，公共内存区域
    private static LazySimpleSingleton lazySimpleSingleton = null;

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }
}
