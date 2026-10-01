//working with 2D shapes 
//2D shapes are shapes that have only two dimensions, length and width. Examples of 2D shapes include squares, rectangles, circles, triangles, and polygons.
//  In programming, we can create classes to represent these shapes and their properties, such as area and perimeter.


package Advancejavaprogramming;
import javax.swing.*;
import java.awt.*;
public class shape extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Reactangle
        g.drawRect(50,50, 150, 100);

        //Circle
        g.drawOval(250,50, 100, 100);
        //Triangle
        int[] xPoints = {450, 400, 500};
        int[] yPoints = {50, 150, 150};
        g.drawPolygon(xPoints, yPoints, 3);

        //Draw line
        g.drawLine(50, 200, 150, 300);
    };
    
    public static void main(String[] args){
        JFrame f = new JFrame("2D shapes");
        f.add(new shape());
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

