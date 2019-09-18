package com.wenbin.design.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直接减优惠券面额抵扣");
    }
}
