package com.wenbin.design.pattern.adapter.power;

public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());

        dc5.outpuDC5V();
    }
}
