package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore;

import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.order.LondonOrderPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:30
 * @description: 客户端发起订购
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 创建北京的各种披萨
        // new BeijingOrderPizza();

        // 创建伦敦的各种披萨
        new LondonOrderPizza();
    }

}
