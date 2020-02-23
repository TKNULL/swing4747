/**
 * @author TK
 * @since 2020/2/23 22:42
 */
package swing.bookExample0223;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {
    public static void main(String [] args){
        JFrame jFrame = new JFrame("JFrame demo 2");
        JButton button =new JButton("press me");
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(button, BorderLayout.CENTER);
        jFrame.setContentPane(contentPane);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
