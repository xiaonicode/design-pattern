package com.xiaonicode.principle.interfacesegregation.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:53
 * @description: Interface2Impl 实现了 Interface2 的 func1, func4, func5 方法
 */
public class Interface2Impl implements Interface2 {

    @Override
    public void func1() {
        System.out.println("Interface2Impl 中实现了 func1 方法");
    }

    @Override
    public void func4() {
        System.out.println("Interface2Impl 中实现了 func4 方法");
    }

    @Override
    public void func5() {
        System.out.println("Interface2Impl 中实现了 func5 方法");
    }

}
