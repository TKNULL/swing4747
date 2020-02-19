/**
 * @author TK
 * @since 2020/2/19 23:10
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Test1 {

    //例子一
    public static void main(String [] args){
        JFrame frame = new JFrame("JFrameDemo2");
        JButton button = new JButton("press me");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(button,BorderLayout.CENTER);

        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
