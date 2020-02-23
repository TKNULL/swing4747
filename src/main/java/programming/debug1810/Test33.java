/**
 * @author shuyun
 * @since 2020/2/18 15:32
 */
package programming.debug1810;

import javax.swing.*;
import java.awt.*;

/**
 * 【18.10-六、程序设计 2】
 *
 * Test33是一个显示按钮布局的窗口，窗口标题是“Buttons”,窗口中自上至下安排3个按钮，使用BorderLayout布局管理器，分别将3个按钮置于
 * 窗口的North\Center\South这三个区域，排成一列。
 * 不要求实现事件处理
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class Test33 {
    private JFrame frame;
    private JButton btn1,btn2,btn3;
    public static void main(String [] args) {
        Test33 that = new Test33();
        that.go();
    }
    void go(){
        btn1 = new JButton("North");
        btn2 = new JButton("Center");
        btn3 = new JButton("South");
        // TODO: 2020/2/18
        frame = new JFrame("Buttons");
        frame.getContentPane().add(btn1, BorderLayout.NORTH);       //给Frame添加基础标签，并设置标签位置
        frame.getContentPane().add(btn2, BorderLayout.CENTER);
        frame.getContentPane().add(btn3, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);



        //1、JFrame的默认布局是什么？
        //2、如何添加BorderLayout布局管理器？并设置布局管理器中元素的位置？
    }
    
}
