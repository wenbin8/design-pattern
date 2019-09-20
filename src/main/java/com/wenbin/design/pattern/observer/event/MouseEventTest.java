package com.wenbin.design.pattern.observer.event;

public class MouseEventTest {
    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            //注册事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK, callback);
            mouse.addLisenter(MouseEventType.ON_MOVE, callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
            mouse.addLisenter(MouseEventType.ON_OVER, callback);
//            mouse.addLisenter(MouseEventType.ON_BLUR, callback);

            // 调用方法
            mouse.click();
            System.out.println("-------------------------");
            // 获焦事件
            mouse.blur();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}