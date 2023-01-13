package ch17;

import javax.swing.*;
import java.awt.*;

public class FlowlayoutEx1 extends JFrame {
    public FlowlayoutEx1(){
        setTitle("FlowLayOut 예제");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // flowlayout 설정
        setLayout(new FlowLayout(FlowLayout.RIGHT,30,40));
        //FloLayout,정렬위치,컴포넌트간 좌우간격 30픽셀, 상하간격 40픽셀로 옵션을 정할 수도 있음


        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
    }

    public static void main(String[] args) {
        new FlowlayoutEx1();
    }
}
