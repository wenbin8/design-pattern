package com.wenbin.design.pattern.adapter.power;

public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电：" + output + "V");
        return output;
    }
}
