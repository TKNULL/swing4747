/**
 * @author shuyun
 * @since 2020/2/18 15:53
 */
package programming.debug1804;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 【18.04-六、程序设计 2】
 *MyWindow类根据给定的选择项目表构造一组复选按钮，当某个复选按钮的选择状态有改变（未选中-已选中切换）时，复选按钮的侦听程序将在右边文本区中输出所有选择项目的状态
 *
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class MyWindow extends JFrame implements ItemListener {
    JTextArea text;
    JCheckBox [] box;
    String boxName [] = {"张三","李四","王五"};
    MyWindow(String s ){
        //设置frame窗口
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(1,2));
        setLocation(100,100);

        //设置中间容器-面板
        JPanel panel = new JPanel();
        int len = boxName.length;
        panel.setLayout(new GridLayout(len,1));

        //声明JCheckBox
        box = new JCheckBox[len];
        for(int i =0;i<len;i++){
            box[i] = new JCheckBox(boxName[i],false);
            box[i].addItemListener(this);
            panel.add(box[i]);
        }

        //声明JTextArea
        text = new JTextArea(4,10);

        con.add(panel);
        con.add(text);
        setVisible(true);
        pack();
    }

    public void itemStateChanged(ItemEvent e) {
        text.setText(null);
        // TODO: 2020/2/18
        // if(e.监听到任意box控件状态变化){
        //     for(int i=0;i<box.length;i++){
        //         text.setText(box[i].);
        //     }
        // }
        for(int i=0;i<box.length;i++){
            if(box[i].isSelected()){
                text.append(boxName[i]+"被选中\n");        //需要熟悉setText()和append()方法的区别
                //text.setText(boxName[i]+"被选中\n");
            }else{
                text.append(boxName[i]+"没被选中\n");
                //text.setText(boxName[i]+"没被选中\n");

            }
        }
        
    }

    public static void main(String [] args){
        new MyWindow("test");
    }
}
