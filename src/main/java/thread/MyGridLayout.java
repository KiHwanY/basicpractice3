package thread;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {

    public MyGridLayout() {
        super("MyGridLayout 예제");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new GridLayout(4, 2));


        c.add(new JLabel("id"));
        c.add(new JTextField("hong", 20));
        c.add(new JLabel("비밀번호"));
        c.add(new JPasswordField("****", 20));
        c.add(new JLabel("이메일"));
        c.add(new JTextField("hong@daum.net", 20));
        c.add(new JLabel("hp"));
        c.add(new JTextField("010-1234-5678", 20));


        setSize(450, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
