package Test;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormLogin extends JFrame{
	
	private JLabel userNameLb;
	private JLabel passwordLb;
	private JTextField txtuserName;
	private JPasswordField password;
	private JCheckBox jcheckBOx;
	private JButton btnLogin;
	private JButton btnCancel;
	
	public FormLogin() {
		userNameLb = new JLabel("Username: ");
		txtuserName = new JTextField();
		passwordLb = new JLabel("Password: ");
		password = new JPasswordField();
		jcheckBOx = new JCheckBox("Show Password");
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
				      .addComponent(userNameLb)
				      .addComponent(passwordLb)
				);
		
		
		
		this.setLayout(groupLayout);
		this.setTitle("Form Login");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(100, 200);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		FormLogin f = new FormLogin();
		f.pack();
		f.setVisible(true);
		
	}

}
