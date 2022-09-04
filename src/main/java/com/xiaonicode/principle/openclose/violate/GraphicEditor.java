package com.xiaonicode.principle.openclose.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:03
 * @description: 当扩展了图形类后, 使用方需要进行修改.<br/>
 * 没有做到对扩展 (提供方) 开放, 对修改 (使用方) 关闭.
 */
public class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawCircle(s);
        } else if (s.type == 3) {
            drawTriangle(s);
        }
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

}
