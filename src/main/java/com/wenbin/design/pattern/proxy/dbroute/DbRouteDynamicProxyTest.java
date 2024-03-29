package com.wenbin.design.pattern.proxy.dbroute;

import com.wenbin.design.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteDynamicProxyTest {
    public static void main(String[] args) {

        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/01/03");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
