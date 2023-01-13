package ch17;

import javax.swing.*;

public class BoundsEx extends JFrame {
    private  JButton b1,b2,b3;

    public BoundsEx(){
        super("절대좌표계 레이아웃");
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(null);//절대좌표계를 활용시 레이아웃을 null로 초기화해야함
        b1 = new JButton("버튼 1");
        b2 = new JButton("버튼 2");
        b3 = new JButton("버튼 3");

        p.add(b1);
        p.add(b2);
        p.add(b3);

        //setBounds(x,y,width,height);
        b1.setBounds(20,5,95,30);
        b2.setBounds(55,45,105,70);
        b3.setBounds(180,15,105,90);
        add(p);//자동 "Center" 위치 배치 => BorderLayout

    }

    public static void main(String[] args) {
        new BoundsEx();

    }
}
