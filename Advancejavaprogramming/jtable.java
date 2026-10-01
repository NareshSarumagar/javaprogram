package Advancejavaprogramming;
import javax.swing.*;
//displaying information of jtable
public class jtable{
    public static void main(String args[]){
        JFrame frame = new JFrame("jtable eg.");
        frame.setSize(300,200);

        //table data
        String[][] data = {
            {"1","john","doe"},
            {"2","jone","smith"},
            {"3","alice","johnson"}
        };

        //coloumn names

        String[] columns = {"ID","First Name","Last Name"};

        //create a jtable with data and column names
        JTable table = new JTable(data,columns);

        //add the table to a jscrollPane

        JScrollPane scrollpane = new JScrollPane(table);
        frame.add(scrollpane);

        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
