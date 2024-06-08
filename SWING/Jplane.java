
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jplane {

	public static void main(String[] args) {

		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("C:\\Users\\afrin\\Downloads\\Doreamon.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		//label.setBounds(100, 100, 75, 75);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(0, 0, 250, 250);
		pinkPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.white);
		whitePanel.setBounds(0, 250, 500, 250);
		whitePanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);	
		whitePanel.add(label);
		frame.add(pinkPanel);
		frame.add(bluePanel);
		frame.add(whitePanel);
	}
}
