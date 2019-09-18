package com.wenbin.design.pattern.adapter.login.adapter;

import com.wenbin.design.pattern.adapter.login.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
