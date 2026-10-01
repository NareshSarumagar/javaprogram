package Advancejavaprogramming;
import javax.swing.*;
import java.awt.*;
public class colorfilled extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Reactangle
        g.setColor(Color.RED);
        g.fillRect(50,50, 150, 100);

        //Circle
        g.setColor(Color.BLUE);
        g.fillOval(250,50, 100, 100);

        //Triangle
        int[] xPoints = {450, 400, 500};
        int[] yPoints = {50, 150, 150};
        g.setColor(Color.GREEN);
        g.fillPolygon(xPoints, yPoints, 3);

    };
    
    public static void main(String[] args){
        JFrame f = new JFrame("2D shapes");
        f.add(new colorfilled());
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
