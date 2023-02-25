import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class mouse {

    public mouse() {

        JFrame jFrame = new JFrame("Component");

        JLabel fn = new JLabel("Enter first no");
        fn.setBounds(20, 30, 80, 30);

        JTextField jfn = new JTextField();
        jfn.setBounds(20, 60, 100, 30);

        JLabel sn = new JLabel("Enter second no");
        sn.setBounds(20, 90, 80, 30);

        JTextField jsn = new JTextField();
        jsn.setBounds(20, 120, 100, 30);

        JButton sum = new JButton("Sum");
        sum.setBounds(20,200,100,20);

        JLabel result = new JLabel("Result:");
        result.setBounds(20, 220, 100, 20);


        sum.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int a= Integer.parseInt(jfn.getText());
                int b= Integer.parseInt(jsn.getText());
                int c= a-b;
                System.out.println(c);
                result.setText("Result: "+String.valueOf(c));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                result.setText("mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                result.setText("mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                result.setText("mouse Pressed");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });

        jFrame.add(fn);
        jFrame.add(sn);

        jFrame.add(jfn);
        jFrame.add(jsn);

        jFrame.add(sum);
        jFrame.add(result);

        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new mouse();
    }
}