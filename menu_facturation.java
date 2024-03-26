package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class menu_facturation {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_facturation window = new menu_facturation();
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
	public menu_facturation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ajouter facture");
		btnNewButton.setBounds(198, 42, 171, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("modifier/confirmer facture");
		btnNewButton_1.setBounds(198, 96, 172, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("voire arriver stock");
		btnNewButton_2.setBounds(200, 153, 170, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("voire stock");
		btnNewButton_3.setBounds(204, 215, 166, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("voire bl");
		btnNewButton_4.setBounds(201, 278, 170, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JTextArea txtrNombreBl = new JTextArea();
		txtrNombreBl.setText("nombre bl");
		txtrNombreBl.setBounds(386, 44, 126, 22);
		frame.getContentPane().add(txtrNombreBl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(529, 42, 34, 21);
		frame.getContentPane().add(comboBox);
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirestock err=new voirestock();
			
			err.frame.setVisible(true);
			}});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirearriverstock2 err=new voirearriverstock2();
			
			err.frame.setVisible(true);
			}});String[] Rm={"1","2","3","4","5"};
			comboBox.setModel(new DefaultComboBoxModel<>( Rm ));
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirebl2 err=new voirebl2();
			err.frame.setVisible(true);
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirefacture test=new voirefacture();
			test.frame.setVisible(true);
			}});
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				
				String t=(String) comboBox.getSelectedItem();
				if(t!="") {
					int i=Integer.parseInt(t);ajoutfacture er=new ajoutfacture(i);er.frame.setVisible(true);
				}else {
					ajoutfacture er=new ajoutfacture();er.frame.setVisible(true);
				}
					
			
			     }});
	}
}
