/**
 * @author shuyun
 * @since 2020/2/18 18:06
 */
package programming.debug1510;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 【15.10 -六、程序设计 2】
 * 完成计算机的构造方法
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class CalculateFrame extends JFrame implements ActionListener {
    String buttonNameList [][] = {{"7","8","9","+"},
            {"4","5","6","-"},
            {"1","2","3","*"},
            {"0",".","=","/"},
    };
    JTextField text;
    CalculateFrame(){
        super("计算器");
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel(new GridLayout(4,4));
        text = new JTextField(12);
        pnl1.add(text);
        // TODO: 2020/2/18

        con.add(pnl1,"North");
        con.add(pnl2,"Center");
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
    }


    public static void main(String [] args){
        new CalculateFrame();
    }
}
