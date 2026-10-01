package Advancejavaprogramming;
import javax.swing.*;
import lab.net;

public class jbutton {
    public static void main(String args[]){
        JFrame frame = new JFrame("Button example");

        JButton button = new JButton("click me.");

        button.setBounds(120,100,120,40);

        frame.add(button);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        net obj = new net();
        System.out.println(obj);

    }
}
