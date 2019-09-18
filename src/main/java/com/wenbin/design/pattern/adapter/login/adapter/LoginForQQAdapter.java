package com.wenbin.design.pattern.adapter.login.adapter;

import com.wenbin.design.pattern.adapter.login.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println(this);
        return null;
    }
}
