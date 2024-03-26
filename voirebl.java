package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class voirebl {
private int i=0;
	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JTextArea textArea_5;
	private JTextArea textArea_6;
	private JTextArea textArea_7;
	private JTextArea textArea_8;
	private JTextArea textArea_9;
	private JTextArea textArea_10;
	private JTextArea textArea_11;
	private JTextArea textArea_12;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/* *
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					voirebl window = new voirebl();
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
	public voirebl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(278, 27, 206, 19);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 64, 206, 19);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(278, 101, 206, 19);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(278, 138, 206, 19);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(278, 175, 206, 19);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(278, 212, 206, 19);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(278, 249, 206, 19);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(278, 286, 206, 19);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(278, 323, 206, 19);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(278, 360, 206, 19);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(278, 397, 206, 19);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(278, 434, 206, 19);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(278, 471, 206, 19);
		textField_12.setColumns(10);
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(278, 508, 206, 19);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(textField_2);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(textField_3);
		frame.getContentPane().add(textField_4);
		frame.getContentPane().add(textField_5);
		frame.getContentPane().add(textField_6);
		frame.getContentPane().add(textField_7);
		frame.getContentPane().add(textField_8);
		frame.getContentPane().add(textField_9);
		frame.getContentPane().add(textField_10);
		frame.getContentPane().add(textField_11);
		frame.getContentPane().add(textField_12);
		frame.getContentPane().add(textField_13);
		
		JButton btnNewButton = new JButton("precedant");
		btnNewButton.setBounds(58, 554, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("modifier");
		btnNewButton_1.setBounds(202, 554, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("suivant");
		btnNewButton_2.setBounds(370, 554, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		recupbl rec=new recupbl();
		bl b;
		int j=rec.recupblnb();
		textField.setText(rec.recup(i).getCodebl());
		textField_1.setText(rec.recup(i).getClient());
		textField_2.setText(rec.recup(i).getRm());
		textField_3.setText(rec.recup(i).getDatebl());
		textField_4.setText(rec.recup(i).getNumerocontract());
		textField_5.setText(rec.recup(i).getDatecontract());
		textField_6.setText(rec.recup(i).getNumerobc());
		textField_7.setText(rec.recup(i).getDatebc());
		textField_8.setText(rec.recup(i).getDesignation());
		textField_9.setText(rec.recup(i).getUnite());
		textField_10.setText(rec.recup(i).getQuantitecol());
		textField_11.setText(rec.recup(i).getQuantite());
		textField_12.setText(rec.recup(i).getPuht());
		textField_13.setText(rec.recup(i).getMontant());
		
		JTextArea txtrNumeroBonLivraison = new JTextArea();
		txtrNumeroBonLivraison.setText("numero bon livraison");
		txtrNumeroBonLivraison.setBounds(21, 24, 172, 22);
		frame.getContentPane().add(txtrNumeroBonLivraison);
		
		JTextArea txtrClient = new JTextArea();
		txtrClient.setText("Client");
		txtrClient.setBounds(21, 61, 172, 22);
		frame.getContentPane().add(txtrClient);
		
		JTextArea txtrRegionMilitaire = new JTextArea();
		txtrRegionMilitaire.setText("Region Militaire");
		txtrRegionMilitaire.setBounds(21, 98, 172, 22);
		frame.getContentPane().add(txtrRegionMilitaire);
		
		textArea_2 = new JTextArea();
		textArea_2.setText("Date Bon livraison");
		textArea_2.setBounds(21, 135, 172, 22);
		frame.getContentPane().add(textArea_2);
		
		textArea_3 = new JTextArea();
		textArea_3.setText("Numero contract");
		textArea_3.setBounds(21, 172, 172, 22);
		frame.getContentPane().add(textArea_3);
		
		textArea_4 = new JTextArea();
		textArea_4.setText("Date contract");
		textArea_4.setBounds(21, 209, 172, 22);
		frame.getContentPane().add(textArea_4);
		
		textArea_5 = new JTextArea();
		textArea_5.setText("Numero bon commande");
		textArea_5.setBounds(21, 246, 172, 22);
		frame.getContentPane().add(textArea_5);
		
		textArea_6 = new JTextArea();
		textArea_6.setText("Date bon commande");
		textArea_6.setBounds(21, 283, 172, 22);
		frame.getContentPane().add(textArea_6);
		
		textArea_7 = new JTextArea();
		textArea_7.setText("Designation");
		textArea_7.setBounds(21, 323, 172, 22);
		frame.getContentPane().add(textArea_7);
		
		textArea_8 = new JTextArea();
		textArea_8.setText("unité mesure");
		textArea_8.setBounds(21, 357, 172, 22);
		frame.getContentPane().add(textArea_8);
		
		textArea_9 = new JTextArea();
		textArea_9.setText("quantité colisé");
		textArea_9.setBounds(21, 394, 172, 22);
		frame.getContentPane().add(textArea_9);
		
		textArea_10 = new JTextArea();
		textArea_10.setText("quantité");
		textArea_10.setBounds(21, 431, 172, 22);
		frame.getContentPane().add(textArea_10);
		
		textArea_11 = new JTextArea();
		textArea_11.setText("puht");
		textArea_11.setBounds(21, 468, 172, 22);
		frame.getContentPane().add(textArea_11);
		
		textArea_12 = new JTextArea();
		textArea_12.setText("montant");
		textArea_12.setBounds(21, 505, 172, 22);
		frame.getContentPane().add(textArea_12);
		
		btnNewButton_3 = new JButton("annuler");
		btnNewButton_3.setBounds(122, 605, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("fermer");
		btnNewButton_4.setBounds(283, 605, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
	
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i==0) {
				System.out.println("non");
				}else {
					i=i-1;
					textField.setText(rec.recup(i).getCodebl());
					textField_1.setText(rec.recup(i).getClient());
					textField_2.setText(rec.recup(i).getRm());
					textField_3.setText(rec.recup(i).getDatebl());
					textField_4.setText(rec.recup(i).getNumerocontract());
					textField_5.setText(rec.recup(i).getDatecontract());
					textField_6.setText(rec.recup(i).getNumerobc());
					textField_7.setText(rec.recup(i).getDatebc());
					textField_8.setText(rec.recup(i).getDesignation());
					textField_9.setText(rec.recup(i).getUnite());
					textField_10.setText(rec.recup(i).getQuantitecol());
					textField_11.setText(rec.recup(i).getQuantite());
					textField_12.setText(rec.recup(i).getPuht());
					textField_13.setText(rec.recup(i).getMontant());
				}			}	}	);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i<j-1) {
				i=i+1;
					textField.setText(rec.recup(i).getCodebl());
					textField_1.setText(rec.recup(i).getClient());
					textField_2.setText(rec.recup(i).getRm());
					textField_3.setText(rec.recup(i).getDatebl());
					textField_4.setText(rec.recup(i).getNumerocontract());
					textField_5.setText(rec.recup(i).getDatecontract());
					textField_6.setText(rec.recup(i).getNumerobc());
					textField_7.setText(rec.recup(i).getDatebc());
					textField_8.setText(rec.recup(i).getDesignation());
					textField_9.setText(rec.recup(i).getUnite());
					textField_10.setText(rec.recup(i).getQuantitecol());
					textField_11.setText(rec.recup(i).getQuantite());
					textField_12.setText(rec.recup(i).getPuht());
					textField_13.setText(rec.recup(i).getMontant());
				}else {
					System.out.println("non");
				}			}	}	);
					btnNewButton_3.addActionListener(new ActionListener() {
					@Override
				    public void actionPerformed(ActionEvent e) {
							i=0;
							textField.setText(rec.recup(i).getCodebl());
							textField_1.setText(rec.recup(i).getClient());
							textField_2.setText(rec.recup(i).getRm());
							textField_3.setText(rec.recup(i).getDatebl());
							textField_4.setText(rec.recup(i).getNumerocontract());
							textField_5.setText(rec.recup(i).getDatecontract());
							textField_6.setText(rec.recup(i).getNumerobc());
							textField_7.setText(rec.recup(i).getDatebc());
							textField_8.setText(rec.recup(i).getDesignation());
							textField_9.setText(rec.recup(i).getUnite());
							textField_10.setText(rec.recup(i).getQuantitecol());
							textField_11.setText(rec.recup(i).getQuantite());
							textField_12.setText(rec.recup(i).getPuht());
							textField_13.setText(rec.recup(i).getMontant());
							}});
					btnNewButton_1.addActionListener(new ActionListener() {
						@Override
					    public void actionPerformed(ActionEvent e) {
								ajbl a=new ajbl();
								a.modbl(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), Integer.parseInt(textField_4.getText()),
										textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(),
										textField_9.getText(), Integer.parseInt(textField_10.getText()), Integer.parseInt(textField_11.getText()), textField_12.getText(), Integer.parseInt(textField_13.getText()));
								}});
					btnNewButton_4.addActionListener(new ActionListener() {
						@Override
					    public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);		
						}});
	}
}
