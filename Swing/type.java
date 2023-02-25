/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;



/**
 *
 * @author default
 */
import java.awt.event.*;
import javax.swing.*;
public class type implements MouseListener {
    JTextField jtext;  // Instance variable
    JTextField jtext1;
    JTextField jtext2;
    public void eventhandiling(){
        JFrame jframe=new JFrame("component");
        JLabel jlabel=new JLabel("First NO");
        jlabel.setBounds(30,50,80,30);

        jtext=new JTextField();
        jtext.setBounds(100,50,80,30);

        JLabel jlabel1=new JLabel("Second NO");
        jlabel1.setBounds(30,80,80,30);


        jtext1=new JTextField();
        jtext1.setBounds(100,80,80,30);

        JButton jbutton=new JButton("Add");
        jbutton.setBounds(100,140,80,30);

        JButton jbutton1=new JButton("Sub");
        jbutton.setBounds(140,140,80,30);

//        JButton multiply=new JButton("Multiply");
//        multiply.setBounds()

        jtext2=new JTextField("Result");
        jtext2.setBounds(100,180,80,30);
        JLabel jlabel2=new JLabel("Press");
        jlabel2.setBounds(30,200,80,30);


//        jbutton.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int x=Integer.parseInt(jtext.getText());
//                int y=Integer.parseInt(jtext1.getText());
//                int add=x+y;
//                jtext2.setText(String.valueOf(add));
//
//            }
//            
//        });
//        
//        jbutton.addMouseListener(new MouseListener(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//               
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        });
//        
//    jbutton.addFocusListener(new FocusListener(){
//            @Override
//            public void focusGained(FocusEvent e) {
//                System.out.println("focus gained");
//                jlabel2.setText("focus gained");
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                jlabel2.setText("focus lost");
//                System.out.println("focus lost");
//            }
//        
//    });
        jbutton.addMouseListener(this);

        jframe.add(jlabel);
        jframe.add(jtext);
        jframe.add(jlabel1);
        jframe.add(jtext1);
        jframe.add(jbutton);
        jframe.add(jtext2);
        jframe.add(jlabel2);
        jframe.add(jbutton1);


        jframe.setLayout(null);
        jframe.setSize(500,500);
        jframe.setVisible(true);

    }
    public static void main(String[] args) {
//        adapter obj=new adapter();
//        obj.eventhandiling();
    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int a=Integer.parseInt(jtext.getText());
//        int b=Integer.parseInt(jtext1.getText());
//        int sub=a+b;
//         jtext2.setText(String.valueOf(sub));
//        
//    }



    @Override
    public void mouseClicked(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void mousePressed(MouseEvent e) {
        int a=Integer.parseInt(jtext.getText());
        int b=Integer.parseInt(jtext1.getText());
        int multiply=a*b;
        jtext2.setText(String.valueOf(multiply));
    }



    @Override
    public void mouseReleased(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void mouseExited(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}