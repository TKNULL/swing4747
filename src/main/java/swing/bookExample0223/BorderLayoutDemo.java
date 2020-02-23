/**
 * @author TK
 * @since 2020/2/23 23:33
 */
package swing.bookExample0223;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    private JFrame frame;
    private JButton be,bw,bn,bs,bc;
    public static void main(String [] args){
        BorderLayoutDemo  that = new BorderLayoutDemo();
        that.go();
    }
    void go(){
        frame = new JFrame("Border Layout");
        be = new JButton("East");
        bs = new JButton("South");
        bw = new JButton("West");
        bn = new JButton("Nouth");
        bc = new JButton("Center");
        frame.getContentPane().add(be, BorderLayout.EAST);
        frame.getContentPane().add(be, BorderLayout.SOUTH);
        frame.getContentPane().add(be, BorderLayout.WEST);
        frame.getContentPane().add(be, BorderLayout.NORTH);
        frame.getContentPane().add(be, BorderLayout.CENTER);
        frame.setSize(350,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
