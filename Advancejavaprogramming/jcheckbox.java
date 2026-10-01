package Advancejavaprogramming;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class jcheckbox {
    public static void main(String args[]){
        JFrame frame = new JFrame("example of checkbox");

        JCheckBox c1 = new JCheckBox("java");
        c1.setBounds(50,50,100,30);

        JCheckBox c2 = new JCheckBox("python");
        c2.setBounds(50,90,100,30);

        JCheckBox c3 = new JCheckBox("C");
        c3.setBounds(50,130,100,30);
        frame.add(c1); 
        frame.add(c2); 
        frame.add(c3);
        frame.setSize(300,200);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
