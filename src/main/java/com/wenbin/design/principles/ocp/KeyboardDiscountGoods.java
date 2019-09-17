package com.wenbin.design.principles.ocp;

public class KeyboardDiscountGoods extends KeyboardGoods {

    public KeyboardDiscountGoods(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.50;
    }
}
