package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore;

import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order.BeijingFactory;
import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order.OrderPizza1;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 14:35
 * @description: 客户端订购
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza1(new BeijingFactory());
    }

}
