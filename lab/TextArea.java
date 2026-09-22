package lab;
 //display information in textarea

//a jtextarea is used to display or edit multiple lines of text. it is often placed inside a jscrollpace to enable scrolling.

import javax.swing.*;

public class TextArea{
	public static void main(String args[]){
	JFrame frame = new JFrame("jtextarea eg");
	frame.setSize(300,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//CREATE A JTEXTAREA WITH TEXT

	JTextArea textarea = new JTextArea("this is a jtextarea.");
	textarea.setEditable(false); //make it non-editable


	//add the jtextarea to a scrollpane

	JScrollPane scrollpane = new JScrollPane(textarea);
	frame.add(scrollpane);

	frame.setVisible(true);
	}
} 
    
