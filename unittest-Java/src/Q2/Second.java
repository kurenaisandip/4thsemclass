package Q2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Second implements MouseListener {

//    Write a GUI program using components to find sum and difference of two numbers. Use two Text Fields

    static void mouse(){


        JFrame j = new JFrame("Form");

        JLabel jl = new JLabel("First no");
        jl.setBounds(40, 50, 2000, 50);

        JTextField jt1 = new JTextField();
        jt1.setBounds(40, 100, 500, 50);


        JLabel jl2 = new JLabel("Last no");
        jl2.setBounds(40, 150, 200, 50);


        JTextField jt2 = new JTextField();
        jt2.setBounds(40, 200, 500, 50);


       JButton jButton = new JButton("Add two numbers");
       jButton.setBounds(50,250,500,500);






        j.add(jl);
        j.add(jl2);

        j.add(jt1);
        j.add(jt2);

        j.add(jButton);



        j.setVisible(true);
        j.setLayout(null);
        j.setSize(800, 800);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        mouse();
    }
}
