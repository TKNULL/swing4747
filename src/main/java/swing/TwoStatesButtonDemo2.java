/**
 * @author TK
 * @since 2020/2/19 23:45
 */
package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TwoStatesButtonDemo2 {
    JFrame frame = new JFrame("Two States Button Demo2");
    JCheckBox cb1 = new JCheckBox("JCheckBox 1");
    JCheckBox cb2 = new JCheckBox("JCheckBox 2");
    JCheckBox cb3 = new JCheckBox("JCheckBox 3");
    JCheckBox cb4 = new JCheckBox("JCheckBox 4");
    JCheckBox cb5 = new JCheckBox("JCheckBox 5");
    JCheckBox cb6 = new JCheckBox("JCheckBox 6");

    JRadioButton rb1 = new JRadioButton("JRadioButton 1");
    JRadioButton rb2 = new JRadioButton("JRadioButton 2");
    JRadioButton rb3 = new JRadioButton("JRadioButton 3");
    JRadioButton rb4 = new JRadioButton("JRadioButton 4");
    JRadioButton rb5 = new JRadioButton("JRadioButton 5");
    JRadioButton rb6 = new JRadioButton("JRadioButton 6");

    JTextArea ta = new JTextArea();

    public static void main(String [] args){
        TwoStatesButtonDemo2 ts = new TwoStatesButtonDemo2();
        ts.go();
    }
    public void go(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel pa = new JPanel();
        JPanel pb = new JPanel();
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched,"JcheckBox");
        p1.setBorder(border);
        p2.add(cb4);
        p2.add(cb5);
        p2.add(cb6);
        border = BorderFactory.createTitledBorder(etched,"JCheckBox Group");
        p2.setBorder(border);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(cb4);
        group1.add(cb5);
        group1.add(cb6);
        p3.add(rb1);
        p3.add(rb2);
        p3.add(rb3);

    }

}
