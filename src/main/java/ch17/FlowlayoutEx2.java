package ch17;

import javax.swing.*;
import java.awt.*;

public class FlowlayoutEx2 extends JFrame {
    JPanel jp; // 패널 변수 언언
    JButton jb1,jb2,jb3,jb4,jb5,jb6; //버튼변수 선언

    public FlowlayoutEx2(){
        super("FlowLayOut 예제2");
        jp = new JPanel();//패널 생성
        jb1 = new JButton("버튼1");
        jb2 = new JButton("버튼2");
        jb3 = new JButton("버튼3");
        jb4 = new JButton("버튼4");
        jb5 = new JButton("버튼5");
        jb6 = new JButton("버튼6");

        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb6);
        jp.setLayout(new FlowLayout());
        add(jp);
//        add(jp,"North");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FlowlayoutEx2();
    }


}
