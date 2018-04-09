package hw1_formlogin;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class ExerciseFour extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel lblOldMeter = new JLabel("Old Meter");
	private JTextField txtOldMeter = new JTextField(15);
	private JLabel lblNewMeter = new JLabel("New Meter");
	private JTextField txtNewMeter = new JTextField(15);
	private JLabel lblAmount = new JLabel("Amount");
	private JTextField txtAmount = new JTextField(15);
	private JButton btnCal = new JButton("Calulate");
	private JLabel lblPaymentAmount = new JLabel("Payment Amount");
	private JTextField txtPaymentAmount = new JTextField(15);

	public ExerciseFour() {
		super("Electric Calulation Form");
		
		txtPaymentAmount.setEnabled(false);
		txtAmount.setEnabled(false);
    	JPanel panel = new JPanel(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	constraints.anchor = GridBagConstraints.WEST;
    	constraints.insets = new Insets(10, 10, 10, 10);
    	
    	constraints.gridx = 0;
    	constraints.gridy = 0;
    	panel.add(lblOldMeter, constraints);
    	
    	constraints.gridx = 1;
    	panel.add(txtOldMeter, constraints);
    	
    	constraints.gridx = 0;
    	constraints.gridy = 1;
    	panel.add(lblNewMeter, constraints);
    	
    	constraints.gridx = 1;
    	panel.add(txtNewMeter, constraints);
    	
    	constraints.gridx = 0;
    	constraints.gridy = 2;
    	panel.add(lblAmount, constraints);
    	
    	constraints.gridx = 1;
    	panel.add(txtAmount, constraints);
    	
    	constraints.gridx = 0;
    	constraints.gridy = 3;
    	panel.add(lblPaymentAmount, constraints);
    	
    	constraints.gridx = 1;
    	panel.add(txtPaymentAmount, constraints);
    	
    	constraints.gridx = 0;
    	constraints.gridy = 4;
    	constraints.gridwidth = 2;
    	constraints.anchor = GridBagConstraints.CENTER;
    	panel.add(btnCal, constraints);
    	
    	add(panel);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	pack();
    	
    	btnCal.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			int oldNum =  Integer.parseInt(txtOldMeter.getText());
				int newNum =  Integer.parseInt(txtNewMeter.getText());					
				
				int result = newNum - oldNum;				
				txtAmount.setText(Integer.toString(result));
				
				double paymentAmt = 0d;
				paymentAmt = calulation(Integer.parseInt(txtAmount.getText()));
		    	txtPaymentAmount.setText(Double.toString(paymentAmt));
    		}
    	});
    	
	}
	
	public double calulation(int value) {
		
		double payment = 0d;
		if(value < 50) {
			payment = 700;
		}else if(value <= 100) {
			payment = 1200;
		}else {
			payment = 1800;
		}
		
		return payment;
	}
	
	public static void main(String[] args) {
		new ExerciseFour();

	}
	
}
