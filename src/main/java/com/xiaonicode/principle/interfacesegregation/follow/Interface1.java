package com.xiaonicode.principle.interfacesegregation.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 10:29
 * @description: 接口 Interface1 仅声明 func2, func3 方法
 */
public interface Interface1 extends BaseInterface {

    /** func2 */
    void func2();

    /** func3 */
    void func3();

}
