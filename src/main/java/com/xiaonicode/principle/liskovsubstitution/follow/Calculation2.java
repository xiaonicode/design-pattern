package com.xiaonicode.principle.liskovsubstitution.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 17:06
 * @description:
 */
public class Calculation2 extends BaseCalculation {

    /** 如果 Calculation2 类中需要使用 Calculation1 类的方法, 就使用组合关系 */
    private final Calculation1 c1 = new Calculation1();

    /** 计算两数之和 */
    public int func1(int a, int b) {
        return a + b;
    }

    /** 使用两数之和, 与 9 进行求和 */
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    /** 仍然想使用 Calculation1 类中的方法 (计算两数之差) */
    public int func3(int a, int b) {
        return c1.func1(a, b);
    }

}
