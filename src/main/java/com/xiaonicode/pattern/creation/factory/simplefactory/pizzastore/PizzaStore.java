package com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore;

import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.order.OrderPizza2;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 21:02
 * @description: 客户端发起订购
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 使用简单工厂模式
        // new OrderPizza1(new SimpleFactory());

        // 使用静态工厂模式
        new OrderPizza2();
    }

}
