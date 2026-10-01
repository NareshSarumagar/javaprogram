package Advancejavaprogramming;
import javax.swing.*;


public class jlist {
    public static void main(String agrs[]){
        JFrame f = new JFrame("list eg.");


        String[] subjects = {"java","c","dbms","python"};

        JList<String> l = new JList<>(subjects);
        l.setBounds(80,40,180,100);

        f.add(l);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
