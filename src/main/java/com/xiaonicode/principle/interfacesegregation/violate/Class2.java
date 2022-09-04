package com.xiaonicode.principle.interfacesegregation.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:53
 * @description: Calculation2 通过接口 IFunc 依赖 Interface2Impl 类, 但仅会使用到 func1, func4, func5 方法
 */
public class Class2 {

    public void dep1(IFunc f) {
        f.func1();
    }

    public void dep4(IFunc f) {
        f.func4();
    }

    public void dep5(IFunc f) {
        f.func5();
    }

}
