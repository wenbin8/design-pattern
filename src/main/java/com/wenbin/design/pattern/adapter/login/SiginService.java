package com.wenbin.design.pattern.adapter.login;

public class SiginService {
    public ResultMsg regist(String userName, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String userName, String password) {
        return null;
    }
}
