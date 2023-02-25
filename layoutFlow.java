import javax.swing.*;
import java.awt.*;

public class layoutFlow {

    public static void main(String[] args) {

        JFrame s = new JFrame("FLow Layout");

        JButton b1 = new JButton("a");
        JButton b2= new JButton("b");
        JButton b3 = new JButton("c");
        JButton b4 = new JButton("d");
        JButton b5 = new JButton("e");

        s.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));

        s.setVisible(true);

        s.setSize(400, 500);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        s.add(b4);
        s.add(b5);
    }
}
