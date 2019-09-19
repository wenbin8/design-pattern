package com.wenbin.design.pattern.decorator;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;

        battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        // 跟静态代理最大区别就是职责不同
        // 静态代理不一定要满足 is-a 的关系
        // 静态代理会做功能增强，同一个职责变得不一样/**/

        //装饰器更多考虑是扩展
        System.out.println(battercake.getMsg() + "，总价：" + battercake.getPrice());

    }
}
