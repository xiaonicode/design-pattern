package com.xiaonicode.principle.compositereuse;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 21:58
 * @description: 聚合关系: Class1 类聚合进 Class3 类中.
 */
public class Class3 {

    private Class1 class1;

    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

}
