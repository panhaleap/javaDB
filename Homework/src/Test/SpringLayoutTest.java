package Test;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SpringLayoutTest extends JFrame{

	public static void main(String args[]) {
		
		SpringLayoutTest frame = new SpringLayoutTest();
		 Container contentPane = frame.getContentPane();
	        SpringLayout layout = new SpringLayout();
	        contentPane.setLayout(layout);
	        contentPane.add(new JLabel("Username",10));
	        contentPane.add(new JTextField("", 15));
	        frame.pack();
	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        frame.setLocationRelativeTo(null);
	        frame.setSize(400,300);
	}
}
