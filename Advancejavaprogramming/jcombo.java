package Advancejavaprogramming;
import javax.swing.*;
public class jcombo {
    public static void main(String args[]){
        JFrame frame = new JFrame("example of jcombo box.");

        String[] subjects = {
            "java","c","Dbms","web technology"
        };

        JComboBox<String> comboBox = new JComboBox<>(subjects);
        comboBox.setBounds(80,70,180,30);


        frame.add(comboBox);

        frame.setSize(300,400);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
