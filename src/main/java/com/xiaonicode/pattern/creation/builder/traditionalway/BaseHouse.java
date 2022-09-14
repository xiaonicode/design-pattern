package com.xiaonicode.pattern.creation.builder.traditionalway;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:10
 * @description: 房子基类 <br/>
 * 1. 优点是比较简单, 易于操作.<br/>
 * 2. 设计的程序结构, 过于简单, 没有设计缓冲层对象, 程序的扩展性和可维护性不好.
 * 也就是, 该设计方案把产品和产品创建过程封装在一起了, 耦合性增强了.<br/>
 * 3. 解决思路: 考虑将产品和产品建造过程解耦.
 */
public abstract class BaseHouse {

    /** 打地基 */
    public abstract void buildBasic();

    /** 砌墙 */
    public abstract void buildWalls();

    /** 封顶 */
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
