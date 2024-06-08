

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("TechQuizTerk"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from application
        frame.setResizable(true); // prevent frame from being resized if false
        frame.setSize(500, 500); // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); // make frame visible
        ImageIcon image = new ImageIcon("C:\\Users\\afrin\\Downloads\\Doreamon.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(249,174,200)); // change color of background 
        

    }
}