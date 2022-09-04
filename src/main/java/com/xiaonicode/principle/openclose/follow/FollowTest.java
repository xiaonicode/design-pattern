package com.xiaonicode.principle.openclose.follow;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:26
 * @description: 遵循开闭原则
 */
public class FollowTest {

    @Test
    public void test1() {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());
    }

}
