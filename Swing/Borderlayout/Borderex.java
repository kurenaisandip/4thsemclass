package Swing.Borderlayout;

import javax.swing.*;
import java.awt.*;

public class Borderex {


    public Borderex(){
        JFrame j = new JFrame("Border Layout");

        JButton jbeast = new JButton("East");
        JButton jbwest = new JButton("West");
        JButton jbnorth = new JButton("North");
        JButton jbsouth = new JButton("South");
        JButton jbcenter = new JButton("Center");


        j.setLayout(new BorderLayout());
        j.add(jbeast, BorderLayout.EAST);
        j.add(jbwest, BorderLayout.WEST);
        j.add(jbnorth, BorderLayout.NORTH);
        j.add(jbsouth, BorderLayout.SOUTH);
        j.add(jbcenter, BorderLayout.CENTER);

        j.setSize(500,500);

        j.setVisible(true);
    }

    public static void main(String[] args) {
        new Borderex();
    }
}
