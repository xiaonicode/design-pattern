package com.xiaonicode.principle.interfacesegregation.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:53
 * @description: Interface2Impl 实现了 IFunc 的 func1, func2, func3, func4, func5 方法
 */
public class FuncImpl2 implements IFunc {

    @Override
    public void func1() {
        System.out.println("Interface2Impl 中实现了 func1 方法");
    }

    @Override
    public void func2() {
        System.out.println("Interface2Impl 中实现了 func2 方法");
    }

    @Override
    public void func3() {
        System.out.println("Interface2Impl 中实现了 func3 方法");
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
