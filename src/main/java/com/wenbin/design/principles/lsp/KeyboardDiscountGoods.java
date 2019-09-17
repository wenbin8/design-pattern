package com.wenbin.design.principles.lsp;

import com.wenbin.design.principles.ocp.KeyboardGoods;

public class KeyboardDiscountGoods extends KeyboardGoods {

    public KeyboardDiscountGoods(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.50;
    }
}
