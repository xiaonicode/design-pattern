package com.xiaonicode.principle.openclose.violate;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:17
 * @description: 违反开闭原则
 */
public class ViolateTest {

    @Test
    public void test1() {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());
    }

}
