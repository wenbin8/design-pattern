package com.wenbin.design.pattern.adapter.login;

public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService();

        // 不改变原来的代码，也要能够兼容新的需求
        // 还可以再加一层策略模式
        service.loginForQQ("Asdfasdf");
    }
}
