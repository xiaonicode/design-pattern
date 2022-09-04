package com.xiaonicode.principle.openclose.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:03
 * @description: 当扩展了图形类后, 使用方无需进行修改.<br/>
 * 实现了对扩展 (提供方) 开放, 对修改 (使用方) 关闭.
 */
public class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }

}
