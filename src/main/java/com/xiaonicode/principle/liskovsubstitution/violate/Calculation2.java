package com.xiaonicode.principle.liskovsubstitution.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 17:06
 * @description:
 */
public class Calculation2 extends Calculation1 {

    /**
     * 无意间重写了 Calculation1 中的 func1 方法, 计算两数之和,<br/>
     * 使得原本计算两书之差的功能消失, 违反了里氏替换原则.
     */
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    /** 使用两数之和, 与 9 进行求和 */
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

}
