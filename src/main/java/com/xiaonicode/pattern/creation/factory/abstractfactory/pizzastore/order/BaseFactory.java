package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BasePizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 14:19
 * @description: 抽象工厂模式的抽象层 (接口)<br/>
 * 1. 抽象工厂模式: 定义了一个接口用于创建相关或有依赖关系的对象簇, 而无需指明具体的类.<br/>
 * 2. 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合.<br/>
 * 3. 从设计层面看, 抽象工厂模式就是对简单工厂模式的改进 (或者称为进一步的抽象). 将工厂抽象成两层, BaseFactory (抽象工厂) 和具体实现的工厂子类.
 * 程序员可以根据要创建对象的类型使用对应的工厂子类. 这样将单个的简单工厂类变成了工厂簇, 更利于代码的维护和扩展.
 */
public interface BaseFactory {

    /**
     * 根据订购类型, 创建披萨 (由实现类负责实现具体细节)
     *
     * @param orderType 订购类型
     * @return 披萨基类实例
     */
    BasePizza createPizza(String orderType);

}
