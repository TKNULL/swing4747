/**
 * @author shuyun
 * @since 2020/2/19 14:22
 */
package swing.csdn.label;


import javax.swing.*;
import java.awt.*;

//JLabel,主要用于展示文本、图片
public class TestJLabel {
    public static void main(String  [] args){
        JFrame jf = new JFrame("Test Window");
        jf.setSize(150,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();

        JLabel jl1 = new JLabel();
        jl1.setText("Only Text");
        jl1.setFont(new Font(null, Font.PLAIN,25));

        JLabel jl2 = new JLabel();
        jl2.setIcon(new ImageIcon("Only Image"));

        jp.add(jl1);
        jp.add(jl2);

        jf.setContentPane(jp);
        jf.setVisible(true);

    }

}
