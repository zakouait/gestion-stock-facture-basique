package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class voirefacture {
	int j=0;
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
		private JTextField textField_14;
		private JTextField textField_15;
		private JTextField textField_16;
		private JTextField textField_17;
		private JTextField textField_18;
		private JTextField textField_19;
		private JTextField textField_20;
		private JTextField textField_21;
		private JTextField textField_22;
		private JTextField textField_23;
		private JTextField textField_24;
		private JTextField textField_25;
		private JTextField textField_26;
		private JTextField textField_27;
		private JTextField textField_28;
		private JTextField textField_29;
		private JTextField textField_30;
		private JTextField textField_31;
		private JTextField textField_32;
		private JTextField textField_33;
		private JTextField textField_34;
		private JTextField textField_35;
		private JTextField textField_36;
		private JTextField textField_37;
		private JTextField textField_38;
		private JTextField textField_39;
		private JTextField textField_40;
		private JTextField textField_41;
		private JButton btnNewButton_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					voirefacture window = new voirefacture();
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
	public voirefacture() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		textField = new JTextField();
		textField.setBounds(257, 41, 129, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrNumeroFacture = new JTextArea();
		txtrNumeroFacture.setText("numero facture");
		txtrNumeroFacture.setBounds(25, 38, 166, 22);
		frame.getContentPane().add(txtrNumeroFacture);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(257, 70, 129, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(257, 102, 129, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(257, 146, 129, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(257, 185, 129, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(257, 225, 129, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(257, 285, 129, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(257, 327, 129, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(257, 371, 129, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(257, 406, 129, 19);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JTextArea txtrN = new JTextArea();
		txtrN.setText("Date Facture");
		txtrN.setBounds(25, 68, 166, 19);
		frame.getContentPane().add(txtrN);
		
		JTextArea textArea_2_1 = new JTextArea();
		textArea_2_1.setText("N° BL");
		textArea_2_1.setBounds(25, 101, 166, 22);
		frame.getContentPane().add(textArea_2_1);
		
		JTextArea textArea_2_2 = new JTextArea();
		textArea_2_2.setText("Date BL");
		textArea_2_2.setBounds(25, 143, 166, 22);
		frame.getContentPane().add(textArea_2_2);
		
		JTextArea textArea_2_3 = new JTextArea();
		textArea_2_3.setText("N° contract");
		textArea_2_3.setBounds(25, 182, 166, 22);
		frame.getContentPane().add(textArea_2_3);
		
		JTextArea textArea_2_4 = new JTextArea();
		textArea_2_4.setText("Date contravt");
		textArea_2_4.setBounds(25, 222, 166, 22);
		frame.getContentPane().add(textArea_2_4);
		
		JTextArea textArea_2_5 = new JTextArea();
		textArea_2_5.setText("N° region militaire");
		textArea_2_5.setBounds(25, 252, 166, 22);
		frame.getContentPane().add(textArea_2_5);
		
		JTextArea txtrClient = new JTextArea();
		txtrClient.setText("client");
		txtrClient.setBounds(25, 282, 166, 22);
		frame.getContentPane().add(txtrClient);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(25, 324, 166, 22);
		frame.getContentPane().add(txtrDesignation);
		
		JTextArea txtrQuantitEnUnit = new JTextArea();
		txtrQuantitEnUnit.setText("Quantité en unité");
		txtrQuantitEnUnit.setBounds(25, 371, 166, 22);
		frame.getContentPane().add(txtrQuantitEnUnit);
		
		JTextArea txtrPuht = new JTextArea();
		txtrPuht.setText("P.U.H.T");
		txtrPuht.setBounds(25, 403, 166, 22);
		frame.getContentPane().add(txtrPuht);
		
		JTextArea txtrMontantEnHt = new JTextArea();
		txtrMontantEnHt.setText("Montant en HT");
		txtrMontantEnHt.setBounds(25, 435, 166, 22);
		frame.getContentPane().add(txtrMontantEnHt);
		
		JTextArea txtrMontantTva = new JTextArea();
		txtrMontantTva.setText("Montant TVA");
		txtrMontantTva.setBounds(25, 464, 166, 22);
		frame.getContentPane().add(txtrMontantTva);
	
		JButton btnNewButton_1 = new JButton("fermer");
		btnNewButton_1.setBounds(385, 545, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		String[] Rm={"RM1","RM2","RM3","RM4","RM5","RM6"};
		
		textField_10 = new JTextField();
		textField_10.setBounds(257, 438, 129, 19);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(257, 467, 129, 19);
		frame.getContentPane().add(textField_11);
	
		textField_12 = new JTextField();
		textField_12.setBounds(396, 102, 96, 19);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(396, 146, 96, 19);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(396, 327, 96, 19);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(396, 371, 96, 19);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(396, 406, 96, 19);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(396, 438, 96, 19);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(396, 467, 96, 19);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);

		textField_19 = new JTextField();
		textField_19.setBounds(512, 102, 96, 19);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(512, 146, 96, 19);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(512, 327, 96, 19);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(512, 371, 96, 19);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(512, 406, 96, 19);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(512, 438, 96, 19);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(512, 467, 96, 19);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setBounds(617, 102, 96, 19);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(618, 146, 96, 19);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(618, 327, 96, 19);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(618, 371, 96, 19);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(618, 406, 96, 19);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(618, 438, 96, 19);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(618, 467, 96, 19);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);

		textField_33 = new JTextField();
		textField_33.setBounds(726, 102, 96, 19);
		frame.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(726, 146, 96, 19);
		frame.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setBounds(724, 327, 96, 19);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setBounds(724, 371, 96, 19);
		frame.getContentPane().add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setBounds(726, 406, 96, 19);
		frame.getContentPane().add(textField_37);
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(726, 438, 96, 19);
		frame.getContentPane().add(textField_38);
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		textField_39.setBounds(726, 467, 96, 19);
		frame.getContentPane().add(textField_39);
		textField_39.setColumns(10);
			textField_41 = new JTextField();
		textField_41.setBounds(257, 496, 129, 19);
		frame.getContentPane().add(textField_41);
		textField_41.setColumns(10);
		
		JTextArea txtrTotal = new JTextArea();
		txtrTotal.setText("Total");
		txtrTotal.setBounds(25, 496, 166, 22);
		frame.getContentPane().add(txtrTotal);
		
		JButton btnNewButton = new JButton("suivant");
		btnNewButton.setBounds(539, 545, 108, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("precedent");
		btnNewButton_2.setBounds(227, 545, 116, 21);
		frame.getContentPane().add(btnNewButton_2);
		textField_40 = new JTextField();
		textField_40.setBounds(257, 256, 129, 19);
		frame.getContentPane().add(textField_40);
		textField_40.setColumns(10);
		recupfacture f=new recupfacture();
		facture fac=f.recfac(0);
		textField.setText(fac.getNfacture());
		textField_1.setText(fac.getDfacture());
		textField_2.setText(fac.getCodebnlivraison()[0]); 
		textField_3.setText(fac.getDatebl()[0]);
		textField_4.setText(fac.getNumerocontract());
		textField_5.setText(fac.getDatecontract());
		textField_40.setText(fac.getRM());
		textField_6.setText(fac.getClient());
		textField_7.setText(fac.getDesignation()[0]);
		textField_8.setText(fac.getQuantite()[0]);
		textField_9.setText(fac.getPuht()[0]);
		textField_10.setText(fac.getMontant()[0]);
		textField_11.setText(fac.getMontantTTC()[0]);
		
		btnNewButton_3 = new JButton("accusé reception");
		btnNewButton_3.setBounds(331, 582, 190, 21);
		frame.getContentPane().add(btnNewButton_3);
		
	
		int nombre=fac.getI();
		if(nombre>1) {
			textField_12.setText(fac.getCodebnlivraison()[1]); 
			textField_13.setText(fac.getDatebl()[1]);
			textField_14.setText(fac.getDesignation()[1]);
			textField_15.setText(fac.getQuantite()[1]);
			textField_16.setText(fac.getPuht()[1]);
			textField_17.setText(fac.getMontant()[1]);
			textField_18.setText(fac.getMontantTTC()[1]);
		if(nombre>2) {
			textField_19.setText(fac.getCodebnlivraison()[2]); 
			textField_20.setText(fac.getDatebl()[2]);
			textField_21.setText(fac.getDesignation()[2]);
			textField_22.setText(fac.getQuantite()[2]);
			textField_23.setText(fac.getPuht()[2]);
			textField_24.setText(fac.getMontant()[2]);
			textField_25.setText(fac.getMontantTTC()[2]);
			if(nombre>3) {
				textField_26.setText(fac.getCodebnlivraison()[3]); 
				textField_27.setText(fac.getDatebl()[3]);
				textField_28.setText(fac.getDesignation()[3]);
				textField_29.setText(fac.getQuantite()[3]);
				textField_30.setText(fac.getPuht()[3]);
				textField_31.setText(fac.getMontant()[3]);
				textField_32.setText(fac.getMontantTTC()[3]);
			
				if(nombre>4) {
					textField_33.setText(fac.getCodebnlivraison()[4]); 
					textField_34.setText(fac.getDatebl()[4]);
					textField_35.setText(fac.getDesignation()[4]);
					textField_36.setText(fac.getQuantite()[4]);
					textField_37.setText(fac.getPuht()[4]);
					textField_38.setText(fac.getMontant()[4]);
					textField_39.setText(fac.getMontantTTC()[4]);
				}
			}
		}
		}int aaa;
		if(nombre==1) {
			textField_41.setText(fac.getMontantTTC()[0]);
		}
		if(nombre==2) {
			 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1]);
			 textField_41.setText(String.valueOf(aaa));
			
		}
		if(nombre==3) {
			 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2]);
			 textField_41.setText(String.valueOf(aaa));
			
		}
		if(nombre==4) {
			 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3]);
			 textField_41.setText(String.valueOf(aaa));
			
		}if(nombre==5) {
			 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3])+Integer.valueOf(fac.getMontantTTC()[4]);
			 textField_41.setText(String.valueOf(aaa));
			
		}
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(j==0) {
					erreurhorschamp er=new erreurhorschamp();
					er.setVisible(true);
				}else {
					j=j-1;
					
					facture fac=f.recfac(j);
					textField.setText(fac.getNfacture());
					textField_1.setText(fac.getDfacture());
					textField_2.setText(fac.getCodebnlivraison()[0]); 
					textField_3.setText(fac.getDatebl()[0]);
					textField_4.setText(fac.getNumerocontract());
					textField_5.setText(fac.getDatecontract());
					textField_40.setText(fac.getRM());
					textField_6.setText(fac.getClient());
					textField_7.setText(fac.getDesignation()[0]);
					textField_8.setText(fac.getQuantite()[0]);
					textField_9.setText(fac.getPuht()[0]);
					textField_10.setText(fac.getMontant()[0]);
					textField_11.setText(fac.getMontantTTC()[0]);
					
				
					int nombre=fac.getI();
					if(nombre>1) {
						textField_12.setText(fac.getCodebnlivraison()[1]); 
						textField_13.setText(fac.getDatebl()[1]);
						textField_14.setText(fac.getDesignation()[1]);
						textField_15.setText(fac.getQuantite()[1]);
						textField_16.setText(fac.getPuht()[1]);
						textField_17.setText(fac.getMontant()[1]);
						textField_18.setText(fac.getMontantTTC()[1]);
					if(nombre>2) {
						textField_19.setText(fac.getCodebnlivraison()[2]); 
						textField_20.setText(fac.getDatebl()[2]);
						textField_21.setText(fac.getDesignation()[2]);
						textField_22.setText(fac.getQuantite()[2]);
						textField_23.setText(fac.getPuht()[2]);
						textField_24.setText(fac.getMontant()[2]);
						textField_25.setText(fac.getMontantTTC()[2]);
						if(nombre>3) {
							textField_26.setText(fac.getCodebnlivraison()[3]); 
							textField_27.setText(fac.getDatebl()[3]);
							textField_28.setText(fac.getDesignation()[3]);
							textField_29.setText(fac.getQuantite()[3]);
							textField_30.setText(fac.getPuht()[3]);
							textField_31.setText(fac.getMontant()[3]);
							textField_32.setText(fac.getMontantTTC()[3]);
						
							if(nombre>4) {
								textField_33.setText(fac.getCodebnlivraison()[4]); 
								textField_34.setText(fac.getDatebl()[4]);
								textField_35.setText(fac.getDesignation()[4]);
								textField_36.setText(fac.getQuantite()[4]);
								textField_37.setText(fac.getPuht()[4]);
								textField_38.setText(fac.getMontant()[4]);
								textField_39.setText(fac.getMontantTTC()[4]);
							}
						}
					}
					}int aaa;
					if(nombre==1) {
						textField_41.setText(fac.getMontantTTC()[0]);
					}
					if(nombre==2) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
					if(nombre==3) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
					if(nombre==4) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3]);
						 textField_41.setText(String.valueOf(aaa));
						
					}if(nombre==5) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3])+Integer.valueOf(fac.getMontantTTC()[4]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
				}}
		
	});
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			if(j<f.ndisnumfac()-1) {
					j=j+1;
					
					facture fac=f.recfac(j);
					textField.setText(fac.getNfacture());
					textField_1.setText(fac.getDfacture());
					textField_2.setText(fac.getCodebnlivraison()[0]); 
					textField_3.setText(fac.getDatebl()[0]);
					textField_4.setText(fac.getNumerocontract());
					textField_5.setText(fac.getDatecontract());
					textField_40.setText(fac.getRM());
					textField_6.setText(fac.getClient());
					textField_7.setText(fac.getDesignation()[0]);
					textField_8.setText(fac.getQuantite()[0]);
					textField_9.setText(fac.getPuht()[0]);
					textField_10.setText(fac.getMontant()[0]);
					textField_11.setText(fac.getMontantTTC()[0]);
					
				
					int nombre=fac.getI();
					if(nombre>1) {
						textField_12.setText(fac.getCodebnlivraison()[1]); 
						textField_13.setText(fac.getDatebl()[1]);
						textField_14.setText(fac.getDesignation()[1]);
						textField_15.setText(fac.getQuantite()[1]);
						textField_16.setText(fac.getPuht()[1]);
						textField_17.setText(fac.getMontant()[1]);
						textField_18.setText(fac.getMontantTTC()[1]);
					if(nombre>2) {
						textField_19.setText(fac.getCodebnlivraison()[2]); 
						textField_20.setText(fac.getDatebl()[2]);
						textField_21.setText(fac.getDesignation()[2]);
						textField_22.setText(fac.getQuantite()[2]);
						textField_23.setText(fac.getPuht()[2]);
						textField_24.setText(fac.getMontant()[2]);
						textField_25.setText(fac.getMontantTTC()[2]);
						if(nombre>3) {
							textField_26.setText(fac.getCodebnlivraison()[3]); 
							textField_27.setText(fac.getDatebl()[3]);
							textField_28.setText(fac.getDesignation()[3]);
							textField_29.setText(fac.getQuantite()[3]);
							textField_30.setText(fac.getPuht()[3]);
							textField_31.setText(fac.getMontant()[3]);
							textField_32.setText(fac.getMontantTTC()[3]);
						
							if(nombre>4) {
								textField_33.setText(fac.getCodebnlivraison()[4]); 
								textField_34.setText(fac.getDatebl()[4]);
								textField_35.setText(fac.getDesignation()[4]);
								textField_36.setText(fac.getQuantite()[4]);
								textField_37.setText(fac.getPuht()[4]);
								textField_38.setText(fac.getMontant()[4]);
								textField_39.setText(fac.getMontantTTC()[4]);
							}
						}
					}
					}int aaa;
					if(nombre==1) {
						textField_41.setText(fac.getMontantTTC()[0]);
					}
					if(nombre==2) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
					if(nombre==3) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
					if(nombre==4) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3]);
						 textField_41.setText(String.valueOf(aaa));
						
					}if(nombre==5) {
						 aaa=Integer.valueOf(fac.getMontantTTC()[0])+Integer.valueOf(fac.getMontantTTC()[1])+Integer.valueOf(fac.getMontantTTC()[2])+Integer.valueOf(fac.getMontantTTC()[3])+Integer.valueOf(fac.getMontantTTC()[4]);
						 textField_41.setText(String.valueOf(aaa));
						
					}
				}
		
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				}});
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				recupfacture rec=new recupfacture();
				rec.validerfac(textField.getText());
				
			}});
		}
}