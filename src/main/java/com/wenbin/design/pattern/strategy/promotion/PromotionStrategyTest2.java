package com.wenbin.design.pattern.strategy.promotion;


import org.apache.commons.lang3.StringUtils;

public class PromotionStrategyTest2 {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "COUPON";

        if (StringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        promotionActivity.execute();

    }
}
