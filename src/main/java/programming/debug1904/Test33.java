/**
 * @author shuyun
 * @since 2020/2/18 14:18
 */
package programming.debug1904;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

/**
 * 【19.4-六、程序设计 2】
 * Q:类Test33构造了2个文本域及两个按钮，其中'Copy'按钮的功能是将文本域tfs中的内容赋值到文本域tft中，'Clear'按钮的功能是清空两个文本域，
 * 编写actionPerformed代码实现单击2个按钮要完成的事件处理程序
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test33 extends WindowAdapter implements ActionListener {
    //以下类的声明，会被多个方法调用，所以设置成默认权限。  也可设置成private
    JFrame f;
    JButton bClear, bCopy;
    JTextField tfs, tft;

    public static void main(String[] args) {
        Test33 t = new Test33();
        t.go();
    }

    public void go() {
        //JFrame设计
        f = new JFrame("Test33");
        f.setLayout(null);
        f.setSize(490, 180);

        //JTextField 一
        tfs = new JTextField(15);
        tfs.setBounds(20, 15, 300, 40);

        //JTextField 二
        tft = new JTextField(15);
        tft.setBounds(20, 60, 300, 40);

        //JButton 一
        bCopy = new JButton("Copy");
        bCopy.setBounds(350, 15, 100, 40);

        //JButton 二
        bClear = new JButton("Clear");
        bClear.setBounds(350, 60, 100, 40);

        f.add(tfs);
        f.add(tft);
        f.add(bCopy);
        f.add(bClear);

        bClear.addActionListener(this);     //this是指当前对象，意思是，给当前bClear对象添加监听器？   是否能不传this?
        bCopy.addActionListener(this);

        f.setVisible(true); //设置可见
    }

    public void actionPerformed(ActionEvent e) {
        // TODO: 2020/2/18
        if (e.getSource() == bCopy) {
            tft.setText(tfs.getText());
        } else if (e.getSource() == bClear) {
            tft.setText("");
            tfs.setText("");
        }
    }
}


