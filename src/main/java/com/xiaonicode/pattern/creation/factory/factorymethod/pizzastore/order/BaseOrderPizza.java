package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.BasePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:52
 * @description: 订购披萨基类
 */
public abstract class BaseOrderPizza {

    /**
     * 工厂方法模式: 定义了一个创建对象的抽象方法, 由子类决定要实例化的类.
     * 工厂方法模式将对象的实例化推迟到子类.<br/>
     * 子类工厂负责具体实现, 生产特定的披萨
     *
     * @param orderType 订购类型
     * @return 披萨基类
     */
    public abstract BasePizza createPizza(String orderType);

    public BaseOrderPizza() {
        BasePizza pizza;
        String orderType;

        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    private String getOrderType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨类型: ");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
