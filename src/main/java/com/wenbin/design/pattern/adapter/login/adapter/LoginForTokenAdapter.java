package com.wenbin.design.pattern.adapter.login.adapter;

import com.wenbin.design.pattern.adapter.login.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println(this);
        return null;
    }
}
