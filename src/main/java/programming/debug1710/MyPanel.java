/**
 * @author shuyun
 * @since 2020/2/18 16:17
 */
package programming.debug1710;

import javax.swing.*;
import java.awt.*;

/**
 * 【17.10-六、程序设计 2】
 * 题目描述过于复杂，请看word文档
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class MyPanel extends JPanel {
    Font fnt = new Font("楷体",Font.BOLD,18);
    MyPanel(JTextField fAD[],String [] fName,JTextArea anserArea,JButton bt){
        setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,2));

        for(int i=0;i<fAD.length;i++){
            // TODO: 2020/2/18

            JLabel jl = new JLabel(fName[i],JLabel.RIGHT);
            jl.setFont(fnt);
            p.add(jl);

            fAD[i] = new JTextField(3);
            fAD[i].setFont(fnt);
            p.add(fAD[i]);
        }


        add(p,BorderLayout.WEST);
        JScrollPane jsp = new JScrollPane(anserArea);
        add(jsp,BorderLayout.CENTER);
        add(bt,BorderLayout.SOUTH);

    }


}
