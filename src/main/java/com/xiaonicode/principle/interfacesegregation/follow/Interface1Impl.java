package com.xiaonicode.principle.interfacesegregation.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:51
 * @description: Interface1Impl 实现了 Interface1 的 func1, func2, func3 方法
 */
public class Interface1Impl implements Interface1 {

    @Override
    public void func1() {
        System.out.println("Interface1Impl 中实现了 func1 方法");
    }

    @Override
    public void func2() {
        System.out.println("Interface1Impl 中实现了 func2 方法");
    }

    @Override
    public void func3() {
        System.out.println("Interface1Impl 中实现了 func3 方法");
    }

}
