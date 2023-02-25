import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mouseListener {
    int num;
    public mouseListener(){
        JFrame jf = new JFrame("Component");
        jf.setSize(470, 470);

        JLabel jl = new JLabel("Enter num1");
        jl.setBounds (70,30,200,30);
        jf.add(jl);

        JTextField jtf = new JTextField();
        jtf.setBounds (70, 60, 200, 30);
        jf.add(jtf);

        JLabel jl2 = new JLabel("Enter num2");
        jl2.setBounds (70,90,200,30);
        jf.add(jl2);

        JTextField jtf2 = new JTextField();
        jtf2.setBounds (70, 120, 200, 30);
        jf.add(jtf2);

        JButton jb = new JButton("Sum");
        jb.setBounds(120,160,100, 30);
        jf.add(jb);

        JButton jb2 = new JButton("Diff");
        jb2.setBounds(120,200,100, 30);
        jf.add(jb2);

        JLabel jl3 = new JLabel("Sum Result");
        jl3.setBounds (70,240,200,30);
        jf.add(jl3);

        JLabel jl4 = new JLabel("Diff Result");
        jl4.setBounds (70,280,200,30);
        jf.add(jl4);

        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                int a=Integer.parseInt(jtf.getText());
                int b=Integer.parseInt(jtf2.getText());
                int c= a+b;
                System.out.println("c");
                jl3.setText(String.valueOf("sum is "+c));
            }
        });

        jb2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                int d=Integer.parseInt(jtf.getText());
                int g=Integer.parseInt(jtf2.getText());
                int f= d-g;
                System.out.println("f");
                jl4.setText(String.valueOf("difference is " +f));
            }
        });

        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        mouseListener ssw = new mouseListener();

    }
}