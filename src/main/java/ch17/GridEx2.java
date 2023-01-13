package ch17;

import javax.swing.*;
import java.awt.*;

public class GridEx2 extends JFrame {

    public GridEx2(){
        super("GridLayout 예제1");
        setLayout(new GridLayout(0,3));//0행3열
        for (int i=1; i<=15; i++){ // 15개의 button
            JButton button = new JButton("button"+i);
            add(button);
        }
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridEx2();
    }
}
