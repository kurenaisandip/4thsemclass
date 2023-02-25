package Swing;

import javax.swing.*;

public class ClassWork {

    public ClassWork() {
//        JFrame j = new JFrame("Form");
//
//        JTextField t1, t2;
//
//        t1 = new JTextField("User Name");
//        t1.setBounds(50,100,200,30);
//
//        t2 = new JTextField("Password");
//        t2.setBounds(50, 150, 200, 30 );
//
//        JCheckBox cb1 = new JCheckBox("one");
//        cb1.setBounds(20,200,50, 50);
//
//        JCheckBox cb2 = new JCheckBox("two");
//        cb1.setBounds(20,150,50, 50);
//
//        JCheckBox c = new JCheckBox("Three");
//        c.setBounds(20,120,50,50);
//
//        JButton jb = new JButton("Submit");
//        jb.setBounds(50, 300, 80, 20);
//
////        j.add(t1);
////        j.add(t2);
//        j.add(cb1);
//        j.add(cb2);
//        j.add(c);
////        j.add(jb);
//        j.setSize(600, 600);
//        j.setLayout(null);
//        j.setVisible(true);



        JFrame f= new JFrame("CheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100,100, 50,50);
        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100,150, 50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }


    public static void main(String[] args) {
      new ClassWork();

    }
}
