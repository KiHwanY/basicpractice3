package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEventColor extends JFrame implements ActionListener {
    private JFrame f;
    private Color c;
    private Container con;

    private JButton b1,b2,b3,b4;


    public MyEventColor(JFrame f, Color c){
        this.f = f;
        con= f.getContentPane();
        this.c =c;


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        con.setBackground(c);

    }
    public MyEventColor(){
        setTitle("My Event Color");


        JButton b1 = new JButton("red");
        JButton b2 = new JButton("green");
        JButton b3 = new JButton("blue");
        JButton b4 = new JButton("yellow");



        add(b1 ,"North");
        add(b2 ,"East");
        add(b3 ,"South");
        add(b4 ,"West");

        b1.addActionListener(new MyEventColor(this , Color.red));
        b2.addActionListener(new MyEventColor(this , Color.green));
        b3.addActionListener(new MyEventColor(this , Color.blue));
        b4.addActionListener(new MyEventColor(this , Color.yellow));

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }
    public static void main(String[] args) {
        new MyEventColor();
    }
}
