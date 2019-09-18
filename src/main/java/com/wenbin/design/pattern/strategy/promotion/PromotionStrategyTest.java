package com.wenbin.design.pattern.strategy.promotion;

public class PromotionStrategyTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();

    }
}
