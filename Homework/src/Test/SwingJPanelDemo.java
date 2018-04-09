package Test;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.zip.CheckedOutputStream;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SwingJPanelDemo extends JFrame {
    
    private JLabel labelUsername = new JLabel("username: ");
    private JLabel labelPassword = new JLabel("password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JCheckBox chShowPwd = new JCheckBox("Show Password");    
    private JButton buttonLogin = new JButton("Login");
    private JButton buttonCancel = new JButton("Cancel");
     
    public SwingJPanelDemo() {
        super("Form Login");
         
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelUsername, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelPassword, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;       
        newPanel.add(chShowPwd, constraints);        
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 10, 10, 10);        
        newPanel.add(buttonLogin, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 150, 10, 10); 
        newPanel.add(buttonCancel,constraints);
        
        // add the panel to this frame
        add(newPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
     
    public static void main(String[] args) {
    	new SwingJPanelDemo();
    }
}