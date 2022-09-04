package com.xiaonicode.principle.interfacesegregation.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:53
 * @description: Calculation1 通过接口 IFunc 依赖 Interface1Impl 类, 但仅会使用到 func1, func2, func3 方法
 */
public class Class1 {

    public void dep1(IFunc f) {
        f.func1();
    }

    public void dep2(IFunc f) {
        f.func2();
    }

    public void dep3(IFunc f) {
        f.func3();
    }

}
