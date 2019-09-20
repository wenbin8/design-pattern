package com.wenbin.design.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();

        // 注册
        eventBus.register(guavaEvent);

        // 触发
        eventBus.post("wenbin");
    }
}
