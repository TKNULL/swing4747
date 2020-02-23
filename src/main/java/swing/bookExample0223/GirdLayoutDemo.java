/**
 * @author TK
 * @since 2020/2/23 23:40
 */
package swing.bookExample0223;

import javax.swing.*;
import java.awt.*;

 class MyWindow  extends JFrame {
    private JButton b1,b2,b3,b4,b5,b6;
    MyWindow(){
        setTitle("Gird example");
        Container contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(400,350));
        contentPane.setLayout(new GridLayout(3,2));
        b1 = new JButton("gird_1");
        b2 = new JButton("gird_2");
        b3 = new JButton("gird_3");
        b4 = new JButton("gird_4");
        b5 = new JButton("gird_5");
        b6 = new JButton("gird_6");
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);
        pack();
        setVisible(true);
    }
}
public class GirdLayoutDemo{
    public static void main(String [] args){
        MyWindow that = new MyWindow();
        that.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
