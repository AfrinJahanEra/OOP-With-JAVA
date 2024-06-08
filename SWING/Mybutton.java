import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mybutton extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    
    Mybutton() {
        
        ImageIcon icon = new ImageIcon("point.png");
        ImageIcon icon2 = new ImageIcon("face.png");
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
            // button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        // JButton = a button that performs an action when clicked on
        new Mybutton();
    }
}
