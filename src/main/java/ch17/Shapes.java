package ch17;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JApplet {
    @Override
    public void init() {
        setSize(300,300);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(10,10,200,10);
        g.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(1));
        g.drawRect(120,40,90,55);
        g.setColor(Color.red);
        g.fillRoundRect(120,240,90,55,30,30);
        g.setColor(Color.blue);
        g.drawOval(0,40,90,55);
        g.setColor(Color.pink);
        g.fillOval(0,140,90,55);
        int[] x = {10,30,50,40,20};
        int[] y = {257,240,257,280,280};
        g.fillPolygon(x,y,x.length);
    }
}
