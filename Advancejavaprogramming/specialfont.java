package Advancejavaprogramming;
import javax.swing.*;
import java.awt.*;

public class specialfont extends JPanel {
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        // Set font and color
        g.setFont(new Font("Serif", Font.BOLD, 24));
        g.setColor(Color.MAGENTA);
        
        // Draw string
        g.drawString("Special Font Example", 50, 100);
    }
    
    public static void main(String[] args){
        JFrame f = new JFrame("Special Font");
        f.add(new specialfont());
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
