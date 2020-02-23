/**
 * @author TK
 * @since 2020/2/23 22:51
 */
package swing.bookExample0223;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JButtonExample extends WindowAdapter implements ActionListener {
        JFrame f;
        JButton b;
        JTextField tf;
        int tag = 0;

        public static void main(String [] args){
            JButtonExample be = new JButtonExample();
            be.go();
        }
        public void go(){
            f = new JFrame("JButton Example");
            b = new JButton("Sample");
            b.addActionListener(this);
            f.getContentPane().add(b,"South");

            tf= new JTextField();
            f.getContentPane().add(tf,"Center");
            f.addWindowListener(this);

            f.setSize(300,150);
            f.setVisible(true);
        }

    public void actionPerformed(ActionEvent e) {
            String s1 = "You have pressed the button";
            String s2 = "You do another time!";
            if(tag ==0){
                tf.setText(s1);
                tag=1;
            }else{
                tf.setText(s2);
                tag=0;
            }
    }

    public void windowCloseing(WindowEvent e){
            System.exit(0);
    }
}






















