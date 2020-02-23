/**
 * @author shuyun
 * @since 2020/2/19 13:57
 */
package swing.csdn.JPanelTest;

import javax.swing.*;
import java.awt.*;

//滚动面板,支持水平和垂直滚动视图
public class TestJScrollPane {
    public static void main(String  [] args){
        JFrame jf = new JFrame("Test JScrollPane Window");
        jf.setSize(250,250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //jf.setVisible(true);    //放在此处，程序运行时，文字显示较慢。

        //创建文本区域组件
        JTextArea jta = new JTextArea();
        jta.setText("测试JScrollPane。测试JScrollPane。测试JScrollPane。测试JScrollPane。测试JScrollPane。测试JScrollPane。测试JScrollPane。");
        jta.setLineWrap(true);      //自动换行
        jta.setFont(new Font(null,Font.PLAIN,18));  //设置字体

        //创建滚动面板
        JScrollPane jsPane = new JScrollPane(jta,       //指定视图显示的组件
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,  //设置垂直一直滚动
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);    //设置水平从不滚动

        //将滚动面板添加到顶层容器-窗口
        jf.setContentPane(jsPane);
        jf.setVisible(true);

    }


}
