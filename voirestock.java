package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class voirestock {
	int i=0;
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_3;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					voirestock window = new voirestock();
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
	public voirestock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("rechercher");
		btnNewButton.setBounds(302, 27, 104, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(202, 28, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("precedent");
		btnNewButton_1.setBounds(60, 211, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("suivant");
		btnNewButton_2.setBounds(202, 211, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 69, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 110, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_3 = new JButton("réinitialisé");
		btnNewButton_3.setBounds(302, 68, 104, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(30, 25, 143, 22);
		frame.getContentPane().add(txtrDesignation);
		
		JTextArea txtrUnit = new JTextArea();
		txtrUnit.setText("Unité");
		txtrUnit.setBounds(30, 66, 143, 22);
		frame.getContentPane().add(txtrUnit);
		
		JTextArea txtrQuantit = new JTextArea();
		txtrQuantit.setText("Quantité");
		txtrQuantit.setBounds(30, 107, 143, 22);
		frame.getContentPane().add(txtrQuantit);
		int j =new recherche().recupstocknb();i=0;
		stock ar=new recherche().restock(i);
		
	
		
		JButton btnNewButton_4 = new JButton("retour");
		btnNewButton_4.setBounds(321, 211, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(202, 161, 96, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea txtrLieux = new JTextArea();
		txtrLieux.setText("lieux");
		txtrLieux.setBounds(30, 158, 143, 22);
		frame.getContentPane().add(txtrLieux);	textField.setText(ar.getDesignation());
		textField_1.setText(ar.getUnite());
		textField_2.setText(String.valueOf(ar.getQuantite()));textField_3.setText(ar.getLieux());
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i==0) {
					erreurhorschamp er=new erreurhorschamp();
					er.setVisible(true);
				}else {
					i=i-1;
	stock ar=new recherche().restock(i);
					
					textField.setText(ar.getDesignation());
					textField_1.setText(ar.getUnite());
					textField_2.setText(String.valueOf(ar.getQuantite()));
					textField_3.setText(ar.getLieux());
				}
				
				
				
			}});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i>=(j-1)) {
					erreurhorschamp er=new erreurhorschamp();
					er.setVisible(true);
				}else {
					i=i+1;
					stock ar=new recherche().restock(i);
					
					textField.setText(ar.getDesignation());
					textField_1.setText(ar.getUnite());
					textField_2.setText(String.valueOf(ar.getQuantite()));
					textField_3.setText(ar.getLieux());
				}			}	}	);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				i=0;
					stock ar=new recherche().restock(i);
					
					textField.setText(ar.getDesignation());
					textField_1.setText(ar.getUnite());
					textField_2.setText(String.valueOf(ar.getQuantite()));
					textField_3.setText(ar.getLieux());
							}	}	);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				stock sttk=new recherche().restockdes(textField.getText());
				textField_1.setText(sttk.getUnite());
				textField_2.setText(String.valueOf(sttk.getQuantite()));
				textField_3.setText(sttk.getLieux());
							}	}	);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
							}	}	);
	}
}
