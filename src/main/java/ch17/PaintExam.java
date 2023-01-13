package ch17;

import javax.swing.*;
import java.awt.*;

public class PaintExam extends JFrame {

    public PaintExam(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);//JFrame의 Paint()가 실행
        //drawString("문자열",x좌표,y좌표)
        g.drawString("Hello java",10,60);
        g.drawOval(30,100,50,50);

        g.setColor(Color.BLUE);//색지정
        g.fillOval(100,100,50,50);//fillOval(x,y,w,h)
        g.drawRect(100,200,60,60);

        g.setColor(Color.yellow);
        g.fillOval(200,200,60,60);
        System.out.println("paint 호출 ...");


    }

    public static void main(String[] args) {
        new PaintExam();
    }
}
