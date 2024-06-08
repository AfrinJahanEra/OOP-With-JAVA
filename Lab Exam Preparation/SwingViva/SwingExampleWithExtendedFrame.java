import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExampleWithExtendedFrame extends JFrame {

    public SwingExampleWithExtendedFrame() {
        super("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        SwingExampleWithExtendedFrame.this, "Button 1 clicked");
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        SwingExampleWithExtendedFrame.this, "Button 2 clicked");
            }
        });
        panel.add(button2);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingExampleWithExtendedFrame sxf = new SwingExampleWithExtendedFrame();
    }
}


// button1.addActionListener(new ActionListener() {
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         JOptionPane.showMessageDialog(
//                 SwingExampleWithExtendedFrame.this, "Button 1 clicked");
//     }
// });
// This code segment is adding an ActionListener to button1. Let me break it down for you:

// button1.addActionListener(...) is adding an ActionListener to button1, which means the button will respond to user actions, specifically when it's clicked in this case.
// new ActionListener() { ... } creates a new anonymous class that implements the ActionListener interface. This is a way of defining a class and its methods inline without explicitly creating a separate class.
// @Override public void actionPerformed(ActionEvent e) is overriding the actionPerformed method from the ActionListener interface. This method is called whenever the button is clicked.
// JOptionPane.showMessageDialog(...) displays a dialog box with a message. In this case, it shows a message saying "Button 1 clicked".
// SwingExampleWithExtendedFrame.this is used to refer to the enclosing instance of the SwingExampleWithExtendedFrame class within the anonymous ActionListener class. This is necessary because the ActionListener is defined within a method of the SwingExampleWithExtendedFrame class, so this alone would refer to the ActionListener itself.
// So, when button1 is clicked, the actionPerformed method inside the anonymous ActionListener class is executed, showing a message dialog indicating that "Button 1 clicked" was clicked.