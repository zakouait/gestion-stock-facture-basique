package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class reduirestock {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reduirestock window = new reduirestock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reduirestock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(220, 36, 153, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 82, 153, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(23, 33, 119, 22);
		frame.getContentPane().add(txtrDesignation);
		
		JTextArea txtrQuantit = new JTextArea();
		txtrQuantit.setText("quantité");
		txtrQuantit.setBounds(23, 79, 119, 22);
		frame.getContentPane().add(txtrQuantit);
		
		JButton btnNewButton = new JButton("reduire");
		btnNewButton.setBounds(57, 174, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("annuler");
		btnNewButton_1.setBounds(183, 174, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("retour");
		btnNewButton_2.setBounds(307, 184, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 124, 153, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrLieux = new JTextArea();
		txtrLieux.setText("lieux");
		txtrLieux.setBounds(23, 121, 119, 22);
		frame.getContentPane().add(txtrLieux);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField.setText("");
			}});
	
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ajouterarriverstock aj=new ajouterarriverstock();
				int i=Integer.parseInt(textField_1.getText());
				aj.reductionstock(textField.getText().toLowerCase(), i,textField_2.getText());
			
			}});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}});
	}
}
