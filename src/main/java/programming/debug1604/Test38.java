/**
 * @author shuyun
 * @since 2020/2/18 17:49
 */
package programming.debug1604;

import javax.swing.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 【16.04 -六、程序设计 2】
 *
 * 小应用程序的界面有一个显示'计算'的按钮calc，以及一个文本框result。当计算按钮被按下时，弹出一个对话框，要求输入一个整数，返回后在文本框中显示该整数的平方值。
 * 例如，输入8，显示“8的平方是64”
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test38 extends Applet implements ActionListener {
    JButton calc;
    JTextField result;
    public void init(){
        calc = new JButton("计算");
        result = new JTextField(10);
        add(calc);
        add(result);
        calc.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        // TODO: 2020/2/18
    }
}
