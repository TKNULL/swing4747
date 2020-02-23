/**
 * @author TK
 * @since 2020/2/23 23:46
 */
package swing.bookExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class CardLayoutDemo extends MouseAdapter {
    JPanel p1,p2,p3;
    JLabel l1,l2,l3;
    CardLayout myCard;
    JFrame frame;
    Container contentPane;
    public static void main(String [] args){
        CardLayoutDemo that = new CardLayoutDemo();
        //that.go();
    }
}
