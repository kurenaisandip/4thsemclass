package Q1;

import javax.swing.*;

public class Form {

//    Write a GUI Program to display the form

    static void form(){

        JFrame j = new JFrame("Form");

        JLabel jl = new JLabel("First Name");
        jl.setBounds(40, 50, 2000, 50);

        JTextField jt1 = new JTextField();
        jt1.setBounds(40, 100, 50, 50);


        JLabel jl2 = new JLabel("Last Name");
        jl2.setBounds(40, 150, 200, 50);

//        JLabel jl3 = new JLabel("Courses");
//        jl3.setBounds(80, 200, 50, 50);



        JTextField jt2 = new JTextField();
        jt2.setBounds(40, 200, 50, 50);


//        JCheckBox cb1 = new JCheckBox("c++");
//        cb1.setBounds(50,140,30,30);
//
//        JCheckBox cb2 = new JCheckBox("Java");
//        cb2.setBounds(50,160,30,30);


        JButton jb = new JButton("Log in");
        jb.setBounds(40,200,30,30);




        j.add(jl);
        j.add(jl2);
//        j.add(jl3);
        j.add(jt1);
        j.add(jt2);
//        j.add(cb1);
//        j.add(cb2);
        j.add(jb);



        j.setVisible(true);
        j.setLayout(null);
        j.setSize(800, 800);




    }

    public static void main(String[] args) {
        form();
    }

}
