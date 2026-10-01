package Advancejavaprogramming;
import javax.swing.*;
public class jpassword {
  public static void main(String args[]){
    JFrame frame = new JFrame("password field eg.");
    JPasswordField value = new JPasswordField();
    JLabel label = new JLabel("Password");
    label.setBounds(20,100,80,30);
    value.setBounds(100,100,100,30);
    frame.add(value);
    frame.add(label);
    frame.setSize(300,300);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
