import javax.swing.*;
import java.awt.*;

public class SwingExample{
    public static void main(String[] args){
        JFrame frame=new JFrame("SWING EXAMPLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel=new JPanel(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setVisible(true);

    }
}