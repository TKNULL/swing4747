/**
 * @author shuyun
 * @since 2020/2/19 13:38
 */
package swing.csdn.JPanelTest;

import javax.swing.*;
import java.awt.*;

public class TestJPanel {
    public static void main(String [] args){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp1 = new JPanel();
        jp1.add(new JLabel("用户名"));
        jp1.add(new JTextField(10));

        JPanel jp2 = new JPanel();
        jp2.add(new JLabel("密 码"));
        jp2.add(new JTextField(10));

        JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jp3.add(new Button("登陆"));
        jp3.add(new Button("注册"));

        Box box = Box.createVerticalBox();
        box.add(jp1);
        box.add(jp2);
        box.add(jp3);

        jf.setContentPane(box);     //box类也可以被当作中间容器/面板？？

        jf.pack();      //设置窗口适应内部元素尺寸。不设置的话，就像前端float设置标签一样，页面所有元素都浮动起来，页面高为0。
        jf.setVisible(true);    //设置窗口可显示



    }
}
