/**
 * @author TK
 * @since 2020/2/23 22:38
 */
package swing.bookExample;

import swing.JButtonExample;

import javax.swing.*;
import java.awt.*;

public class JFamexample {
    public static void main(String [] args){
        JFrame jFrame = new JFrame("JFrame demo");

        JButton button = new JButton("Press me ");
        jFrame.getContentPane().add(button, BorderLayout.CENTER);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
