package com.wenbin.design.pattern.strategy.pay;

public class PayStrategyTest {
    public static void main(String[] args) {
        // 直接从下单开始
        Order order = new Order("1", "201811112313131", 324.56);
        // 开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
        // 每个渠道它支付的具体过程是不一样的
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
