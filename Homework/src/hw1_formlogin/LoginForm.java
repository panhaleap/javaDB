package hw1_formlogin;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel labelUsername = new JLabel("username: ");
    private JLabel labelPassword = new JLabel("password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JCheckBox chShowPwd = new JCheckBox("Show Password");    
    private JButton buttonLogin = new JButton("Login");
    private JButton buttonCancel = new JButton("Cancel");
    
    public LoginForm() {
    	super("Form Login");
    	JPanel panel = new JPanel(new GridBagLayout());
    	GridBagConstraints gride = new GridBagConstraints();
    	
    	gride.anchor = GridBagConstraints.WEST;
    	gride.insets = new Insets(10, 10, 10, 10);
    	
    	gride.gridx = 0;
    	gride.gridy = 0;
    	panel.add(labelUsername, gride);
    	
    	gride.gridx = 1;
    	panel.add(textUsername, gride);
    	
    	gride.gridx = 0;
    	gride.gridy = 2;
    	panel.add(labelPassword, gride);
    
    	gride.gridx = 1;
    	panel.add(fieldPassword, gride);
    	
    	gride.gridx = 0;
    	gride.gridy = 3;
    	gride.gridwidth = 2;
    	gride.anchor = GridBagConstraints.CENTER;
    	panel.add(chShowPwd, gride);
    	
    	gride.gridx = 0;
    	gride.gridy = 4;
    	gride.gridwidth = 2;
    	gride.anchor = GridBagConstraints.CENTER;
    	gride.insets = new Insets(10, 0, 10, 100);
    	panel.add(buttonLogin, gride);
    	
    	gride.gridx = 0;
    	gride.gridy = 4;
    	gride.gridwidth = 2;
    	gride.anchor = GridBagConstraints.CENTER;
    	gride.insets = new Insets(10, 100, 10, 0);
    	panel.add(buttonCancel, gride);
    	
    	add(panel);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	pack();
    	
    	buttonLogin.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			
    			String username =  textUsername.getText();
    			String password =  String.valueOf(fieldPassword.getPassword());
    			
    			if(username.equals("panha") && password.equals("123")) {
    				JOptionPane.showMessageDialog(null, "Login Success...!");
    			}
    			else {
    				JOptionPane.showMessageDialog(null, "Login Failed...!");
    			}
    			
    		}
    	});
    	
    	chShowPwd.addItemListener(new ItemListener() {
    		public void itemStateChanged(ItemEvent ie) {
    			
    			if(ie.getStateChange() == ItemEvent.SELECTED) {
    				fieldPassword.setEchoChar('\0');
    			}
    			else {
    				fieldPassword.setEchoChar('•');
    			}
    		}
    	});
    	
    	buttonCancel.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			int messageResult = JOptionPane.showConfirmDialog(null, "Exit?", "Login System", JOptionPane.YES_NO_OPTION);
    			if(messageResult==JOptionPane.YES_OPTION) {
    				System.exit(0);
    			}
    		}
    	});
    }
    
    public static void main(String args[]) {
    	new LoginForm();
    }
}
