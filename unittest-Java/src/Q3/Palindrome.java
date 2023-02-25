package Q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Palindrome implements ActionListener, MouseListener {
//    Write a GUI program using components to find the palindrome number when user focus on button using listener


    static void check(){

        JFrame j = new JFrame("Form");

        JLabel jl = new JLabel("First no");
        jl.setBounds(40, 50, 2000, 50);

        JTextField jt1 = new JTextField();
        jt1.setBounds(40, 100, 500, 50);


        JLabel jl2 = new JLabel("Last no");
        jl2.setBounds(40, 120, 200, 50);


        JTextField jt2 = new JTextField();
        jt2.setBounds(40, 200, 500, 50);


        JButton a = new JButton("sandip");
        a.setBounds(40,250, 80, 30);
        a.setVisible(true);

        j.add(a);
        j.add(jt1);
        j.add(jt2);

        j.add(jl);
        j.add(jl2);




        j.setVisible(true);
        j.setLayout(null);
        j.setSize(800, 800);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
        check();
    }
}
