package Advancejavaprogramming;
import javax.swing.*;
public class jpanel {
    public static void main(String args[]){
        JFrame f = new JFrame("jpanel eg..");

        JPanel p = new JPanel();

        JButton b1 = new JButton("save");
        b1.setBounds(50,50,100,40);
        JButton b2 = new JButton("Cancel");
        b2.setBounds(50,130,100,40);

        p.add(b1);
        p.add(b2);

        f.add(p);
        f.setSize(300,200);
        f.setVisible(true);
    }
}
