/**
 * @author TK
 * @since 2020/2/23 22:47
 */
package swing.bookExample0223;

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {
    public static void main(String  [] args){
        JFrame frame = new JFrame("Frame with Panel");
        Container contenPane = frame.getContentPane();
        contenPane.setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        JButton button = new JButton("Press me");
        panel.add(button);
        contenPane.add(panel,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
