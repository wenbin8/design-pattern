package com.wenbin.design.principles.ocp;

public class KeyboardGoods implements IGoods {

    private Integer Id;
    private String name;
    private Double price;

    public KeyboardGoods(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
