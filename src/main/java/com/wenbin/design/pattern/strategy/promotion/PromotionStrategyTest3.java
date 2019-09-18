package com.wenbin.design.pattern.strategy.promotion;


public class PromotionStrategyTest3 {
    public static void main(String[] args) {

        String promotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));

        promotionActivity.execute();
    }
}
