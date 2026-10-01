package Advancejavaprogramming;
import javax.swing.*;

public class jradiobutton {
    public static void main(String agrs[]){
        JFrame f = new JFrame("example of jradiobutton");

        JRadioButton r1 = new JRadioButton("male");
        r1.setBounds(50,50,100,30);

        JRadioButton r2 = new JRadioButton("female");
        r2.setBounds(50,90,100,30);

        JRadioButton r3 = new JRadioButton("others");
        r3.setBounds(50,130,100,30);

        ButtonGroup group = new ButtonGroup();

        group.add(r1); group.add(r2); group.add(r3);

        f.add(r1); f.add(r2); f.add(r3);

        f.setSize(300,200);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
