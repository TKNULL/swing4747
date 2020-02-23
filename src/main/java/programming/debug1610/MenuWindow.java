/**
 * @author shuyun
 * @since 2020/2/18 17:00
 */
package programming.debug1610;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 【16.10 -六、程序设计 2】
 *
 *  窗口有一个菜单条，有'学习'和'工作'两个菜单，其中'学习'菜单含‘java 程序设计’菜单项，‘工作’菜单含‘项目设计’菜单项。
 *  窗口只有一个文本框，目的是用于显示菜单选择的结果
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class MenuWindow extends JFrame implements ActionListener {
    public static JTextField text;
    public MenuWindow(){
        // TODO: 2020/2/18


        text = new JTextField(25);
        getContentPane().add(text);
        setVisible(true);
        setSize(20,150);
        pack();
    }


    public void actionPerformed(ActionEvent e) {

    }
}
