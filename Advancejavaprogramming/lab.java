package Advancejavaprogramming;
import javax.swing.*;

public class lab{
    public static void main(String args[]){
        JFrame frame = new JFrame("jlabel program");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //components create a Jlabel with text

        JLabel label = new JLabel("This is a JLabel.It displays static text\n");
        frame.add(label);
        frame.setVisible(true);

        //jtextfield

        JTextField test = new JTextField("your name: ");
        frame.add(test);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //
    }
}

