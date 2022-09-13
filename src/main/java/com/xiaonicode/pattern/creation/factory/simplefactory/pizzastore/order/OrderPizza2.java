package com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.BasePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 20:42
 * @description: 订购披萨 (使用简单工厂模式, 普通成员方法)
 */
public class OrderPizza2 {

    /** 定义一个简单工厂对象 */
    private SimpleFactory factory;

    public OrderPizza2(SimpleFactory factory) {
        setFactory(factory);
    }

    private void setFactory(SimpleFactory factory) {
        this.factory = factory;

        do {
            BasePizza pizza = factory.createPizza1(getOrderType());
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
