package com.wenbin.design.pattern.adapter.login.adapter;

import com.wenbin.design.pattern.adapter.login.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println(this);
        return null;
    }
}
