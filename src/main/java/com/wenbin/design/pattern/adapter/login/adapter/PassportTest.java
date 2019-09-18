package com.wenbin.design.pattern.adapter.login.adapter;

public class PassportTest {
    public static void main(String[] args) {
        IPassprotForThird passprotForThird = new PassportForThirdAdapter();
        passprotForThird.loginForQQ("");
        passprotForThird.loginForToken("");
        passprotForThird.loginForTelphone("11", "cvc");
    }
}
