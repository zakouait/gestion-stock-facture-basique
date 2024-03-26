package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ajoutfacture {
int i=1;
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
	public void seti(int i) {
		this.i=i;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutfacture window = new ajoutfacture();
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
	public ajoutfacture() {
		initialize();
	}
	public ajoutfacture(int i) {
		this.i=i;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();if(i<3) {
			frame.setBounds(100, 100, 600, 1000);}else {
			frame.setBounds(100, 100, 846, 1000);
		}
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
		textField_3.setBounds(257, 196, 129, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(257, 240, 129, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(257, 272, 129, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(257, 303, 129, 21);
		frame.getContentPane().add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setBounds(257, 336, 129, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(257, 365, 129, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(257, 394, 129, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(257, 423, 129, 19);
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
		textArea_2_2.setBounds(25, 193, 166, 22);
		frame.getContentPane().add(textArea_2_2);
		
		JTextArea textArea_2_3 = new JTextArea();
		textArea_2_3.setText("N° contract");
		textArea_2_3.setBounds(25, 237, 166, 22);
		frame.getContentPane().add(textArea_2_3);
		
		JTextArea textArea_2_4 = new JTextArea();
		textArea_2_4.setText("Date contravt");
		textArea_2_4.setBounds(25, 269, 166, 22);
		frame.getContentPane().add(textArea_2_4);
		
		JTextArea textArea_2_5 = new JTextArea();
		textArea_2_5.setText("N° region militaire");
		textArea_2_5.setBounds(25, 301, 166, 22);
		frame.getContentPane().add(textArea_2_5);
		
		JTextArea txtrClient = new JTextArea();
		txtrClient.setText("client");
		txtrClient.setBounds(25, 333, 166, 22);
		frame.getContentPane().add(txtrClient);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(25, 362, 166, 22);
		frame.getContentPane().add(txtrDesignation);
		
		JTextArea txtrQuantitEnUnit = new JTextArea();
		txtrQuantitEnUnit.setText("Quantité en unité");
		txtrQuantitEnUnit.setBounds(25, 391, 166, 22);
		frame.getContentPane().add(txtrQuantitEnUnit);
		
		JTextArea txtrPuht = new JTextArea();
		txtrPuht.setText("P.U.H.T");
		txtrPuht.setBounds(25, 420, 166, 22);
		frame.getContentPane().add(txtrPuht);
		
		JTextArea txtrMontantEnHt = new JTextArea();
		txtrMontantEnHt.setText("Montant en HT");
		txtrMontantEnHt.setBounds(25, 446, 166, 22);
		frame.getContentPane().add(txtrMontantEnHt);
		
		JTextArea txtrMontantTva = new JTextArea();
		txtrMontantTva.setText("Montant TVA");
		txtrMontantTva.setBounds(25, 478, 166, 22);
		frame.getContentPane().add(txtrMontantTva);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.setBounds(39, 510, 85, 21);
		frame.getContentPane().add(btnNewButton);
	
		JButton btnNewButton_1 = new JButton("annuler");
		btnNewButton_1.setBounds(160, 510, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		String[] Rm={"RM1","RM2","RM3","RM4","RM5","RM6"};
		comboBox.setModel(new DefaultComboBoxModel<>( Rm ));
		
		textField_10 = new JTextField();
		textField_10.setBounds(257, 452, 129, 19);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(257, 481, 129, 19);
		frame.getContentPane().add(textField_11);
		
		JButton btnNewButton_2 = new JButton("retour");
		btnNewButton_2.setBounds(300, 510, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("remplissage donnée bl");
		btnNewButton_3.setBounds(25, 147, 195, 21);
		frame.getContentPane().add(btnNewButton_3);
		if(i>1) {
		textField_12 = new JTextField();
		textField_12.setBounds(396, 102, 96, 19);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(396, 196, 96, 19);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(396, 365, 96, 19);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(396, 394, 96, 19);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(396, 423, 96, 19);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(396, 449, 96, 19);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(396, 481, 96, 19);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		}if(i>2) {
		textField_19 = new JTextField();
		textField_19.setBounds(512, 102, 96, 19);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(512, 196, 96, 19);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(512, 365, 96, 19);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(512, 394, 96, 19);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(512, 423, 96, 19);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(512, 449, 96, 19);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(512, 481, 96, 19);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		}if(i>3) {
		textField_26 = new JTextField();
		textField_26.setBounds(617, 102, 96, 19);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(618, 196, 96, 19);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(617, 365, 96, 19);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(617, 394, 96, 19);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(618, 423, 96, 19);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(618, 449, 96, 19);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(617, 481, 96, 19);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);
		}if(i>4){
		textField_33 = new JTextField();
		textField_33.setBounds(726, 102, 96, 19);
		frame.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(724, 196, 96, 19);
		frame.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setBounds(726, 365, 96, 19);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setBounds(726, 394, 96, 19);
		frame.getContentPane().add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setBounds(724, 423, 96, 19);
		frame.getContentPane().add(textField_37);
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(724, 449, 96, 19);
		frame.getContentPane().add(textField_38);
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		textField_39.setBounds(723, 481, 96, 19);
		frame.getContentPane().add(textField_39);
		textField_39.setColumns(10);
		}
	btnNewButton_2.addActionListener(new ActionListener() {
		@Override
	    public void actionPerformed(ActionEvent e) {
		frame.setVisible(false);
						}	}	);
	btnNewButton_1.addActionListener(new ActionListener() {
		@Override
	    public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			textField_1.setText(null);
			textField_2.setText(null);
			textField_3.setText(null);
			textField_4.setText(null);
			textField_5.setText(null);
			textField_6.setText(null);
			textField_7.setText(null);
			textField_8.setText(null);
			textField_9.setText(null);
			textField_10.setText(null);
			textField_11.setText(null);
			if(i<1) {textField_12.setText(null);
			textField_13.setText(null);
			textField_14.setText(null);
			textField_15.setText(null);
			textField_16.setText(null);
			textField_17.setText(null);
			textField_18.setText(null);
			if(i>2) {textField_19.setText(null);
			textField_20.setText(null);
			textField_21.setText(null);
			textField_22.setText(null);
			textField_23.setText(null);
			textField_24.setText(null);
			textField_25.setText(null);
			if(i>3) {textField_26.setText(null);
			textField_27.setText(null);
			textField_28.setText(null);
			textField_29.setText(null);
			textField_30.setText(null);
			textField_31.setText(null);
			textField_32.setText(null);
			if(i>4) {textField_33.setText(null);
			textField_34.setText(null);
			textField_35.setText(null);
			textField_36.setText(null);
			textField_37.setText(null);
			textField_38.setText(null);
			textField_39.setText(null);
			}}}}}	}	);
	btnNewButton_3.addActionListener(new ActionListener() {
		@Override
	    public void actionPerformed(ActionEvent e) {
		ajbl aj=new ajbl();
		bl bonliv=aj.recblnom(textField_2.getText());
		char[] ttdate=new char[10];
		String temp;
		String donedate="";int k;
		temp=bonliv.getDatebl();
		
		
			ttdate[0]=temp.charAt(8);
			ttdate[1]=temp.charAt(9);
			ttdate[2]='-';
			ttdate[3]=temp.charAt(5);
			ttdate[4]=temp.charAt(6);
			ttdate[5]='-';
			ttdate[6]=temp.charAt(0);
			ttdate[7]=temp.charAt(1);
			ttdate[8]=temp.charAt(2);
			ttdate[9]=temp.charAt(3);
			for(k=0;k<10;k++) {
				donedate=donedate+ttdate[k];	
			}
		textField_3.setText(donedate);
		textField_4.setText(bonliv.getNumerocontract());
		temp=bonliv.getDatecontract();
		
		donedate="";
			ttdate[0]=temp.charAt(8);
			ttdate[1]=temp.charAt(9);
			ttdate[2]='-';
			ttdate[3]=temp.charAt(5);
			ttdate[4]=temp.charAt(6);
			ttdate[5]='-';
			ttdate[6]=temp.charAt(0);
			ttdate[7]=temp.charAt(1);
			ttdate[8]=temp.charAt(2);
			ttdate[9]=temp.charAt(3);
			for(k=0;k<10;k++) {
				donedate=donedate+ttdate[k];	
			}
		textField_5.setText(donedate);
		textField_6.setText(bonliv.getClient());
		textField_7.setText(bonliv.getDesignation());
		textField_8.setText(bonliv.getQuantite());
		textField_9.setText(bonliv.getPuht());
		textField_10.setText(bonliv.getMontant());
		if(i>1) {bonliv=aj.recblnom(textField_12.getText());
		temp=bonliv.getDatebl();
		donedate="";
		
		ttdate[0]=temp.charAt(8);
		ttdate[1]=temp.charAt(9);
		ttdate[2]='-';
		ttdate[3]=temp.charAt(5);
		ttdate[4]=temp.charAt(6);
		ttdate[5]='-';
		ttdate[6]=temp.charAt(0);
		ttdate[7]=temp.charAt(1);
		ttdate[8]=temp.charAt(2);
		ttdate[9]=temp.charAt(3);
		for(k=0;k<10;k++) {
			donedate=donedate+ttdate[k];	
		}
	textField_13.setText(donedate);
			textField_14.setText(bonliv.getDesignation());
			textField_15.setText(bonliv.getQuantite());
			textField_16.setText(bonliv.getPuht());
			textField_17.setText(bonliv.getMontant());
			if(i>2) {			bonliv=aj.recblnom(textField_19.getText());
			temp=bonliv.getDatebl();
			
			donedate="";
			ttdate[0]=temp.charAt(8);
			ttdate[1]=temp.charAt(9);
			ttdate[2]='-';
			ttdate[3]=temp.charAt(5);
			ttdate[4]=temp.charAt(6);
			ttdate[5]='-';
			ttdate[6]=temp.charAt(0);
			ttdate[7]=temp.charAt(1);
			ttdate[8]=temp.charAt(2);
			ttdate[9]=temp.charAt(3);
			for(k=0;k<10;k++) {
				donedate=donedate+ttdate[k];	
			}
		textField_20.setText(donedate);
				textField_21.setText(bonliv.getDesignation());
				textField_22.setText(bonliv.getQuantite());
				textField_23.setText(bonliv.getPuht());
				textField_24.setText(bonliv.getMontant());
					
				if(i>3) {bonliv=aj.recblnom(textField_26.getText());
				temp=bonliv.getCodebl();
				
				donedate="";
					ttdate[0]=temp.charAt(8);
					ttdate[1]=temp.charAt(9);
					ttdate[2]='-';
					ttdate[3]=temp.charAt(5);
					ttdate[4]=temp.charAt(6);
					ttdate[5]='-';
					ttdate[6]=temp.charAt(0);
					ttdate[7]=temp.charAt(1);
					ttdate[8]=temp.charAt(2);
					ttdate[9]=temp.charAt(3);
					for(k=0;k<10;k++) {
						donedate=donedate+ttdate[k];	
					}
				textField_27.setText(donedate);
				textField_28.setText(bonliv.getDesignation());
				textField_29.setText(bonliv.getQuantite());
				textField_30.setText(bonliv.getPuht());
				textField_31.setText(bonliv.getMontant());
		
				if(i>4) {bonliv=aj.recblnom(
				textField_33.getText());temp=bonliv.getCodebl();
				
				donedate="";
					ttdate[0]=temp.charAt(8);
					ttdate[1]=temp.charAt(9);
					ttdate[2]='-';
					ttdate[3]=temp.charAt(5);
					ttdate[4]=temp.charAt(6);
					ttdate[5]='-';
					ttdate[6]=temp.charAt(0);
					ttdate[7]=temp.charAt(1);
					ttdate[8]=temp.charAt(2);
					ttdate[9]=temp.charAt(3);
					for(k=0;k<10;k++) {
						donedate=donedate+ttdate[k];	
					}
				textField_34.setText(donedate);
				textField_35.setText(bonliv.getDesignation());
				textField_36.setText(bonliv.getQuantite());
				textField_37.setText(bonliv.getPuht());
				textField_38.setText(bonliv.getMontant());
					}
				}
			}
		}
		}
						}	);
	btnNewButton.addActionListener(new ActionListener() {
		@Override
	    public void actionPerformed(ActionEvent e) {facturedb ddd=new facturedb();
		if(i<=1) {
			String rm=(String) comboBox.getSelectedItem();
			int jj=0;
			int nb1=0;
			int nb2=0;
			int nb3=0;
		try {
				 jj=Integer.parseInt(textField_4.getText());
				 nb1=Integer.parseInt(textField_8.getText());
				 nb2=Integer.parseInt(textField_10.getText());
				 nb3=Integer.parseInt(textField_11.getText());
		}catch(NumberFormatException ee) {
			System.out.println(ee);
		}
			ddd.ajfact1(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), jj, textField_5.getText(), rm, textField_6.getText(), textField_7.getText(), nb1, textField_9.getText(),nb2, nb3,1);
			
		}else {
			if(i==2) {
				String nbf=textField.getText();
				String datef=textField_1.getText();
				String[] nbl= {textField_2.getText(),textField_12.getText()};
				String[] dbl= {textField_3.getText(),textField_13.getText()};
				int ncontract =Integer.parseInt(textField_4.getText());
				String dc =textField_5.getText();
				String rm= (String) comboBox.getSelectedItem();
				String client= textField_6.getText();
				String[] des= {textField_7.getText(),textField_14.getText()};
				int[] quantite= {Integer.parseInt(textField_8.getText()),Integer.parseInt(textField_15.getText())};
				String[] puht={textField_9.getText(),textField_16.getText()};
				int[] montanthtt= {Integer.parseInt(textField_10.getText()),Integer.parseInt(textField_17.getText())};
				int[] montanttva= {Integer.parseInt(textField_11.getText()),Integer.parseInt(textField_18.getText())};
				ddd.ajfacti(nbf, datef, nbl, dbl, ncontract, dc, rm, client, des, quantite, puht, montanthtt, montanttva, i);
			}else {
				if(i==3) {
					String nbf=textField.getText();
					String datef=textField_1.getText();
					String[] nbl= {textField_2.getText(),textField_12.getText(),textField_19.getText()};
					String[] dbl= {textField_3.getText(),textField_13.getText(),textField_20.getText()};
					int ncontract =Integer.parseInt(textField_4.getText());
					String dc =textField_5.getText();
					String rm= (String) comboBox.getSelectedItem();
					String client= textField_6.getText();
					String[] des= {textField_7.getText(),textField_14.getText(),textField_21.getText()};
					int[] quantite= {Integer.parseInt(textField_8.getText()),Integer.parseInt(textField_15.getText()),Integer.parseInt(textField_22.getText())};
					String[] puht={textField_9.getText(),textField_16.getText(),textField_23.getText()};
					int[] montanthtt= {Integer.parseInt(textField_10.getText()),Integer.parseInt(textField_17.getText()),Integer.parseInt(textField_24.getText())};
					int[] montanttva= {Integer.parseInt(textField_11.getText()),Integer.parseInt(textField_18.getText()),Integer.parseInt(textField_25.getText())};
					ddd.ajfacti(nbf, datef, nbl, dbl, ncontract, dc, rm, client, des, quantite, puht, montanthtt, montanttva, i);
				}else {
					if(i==4) {	
						String nbf=textField.getText();
					String datef=textField_1.getText();
					String[] nbl= {textField_2.getText(),textField_12.getText(),textField_19.getText(),textField_26.getText()};
					String[] dbl= {textField_3.getText(),textField_13.getText(),textField_20.getText(),textField_27.getText()};
					int ncontract =Integer.parseInt(textField_4.getText());
					String dc =textField_5.getText();
					String rm= (String) comboBox.getSelectedItem();
					String client= textField_6.getText();
					String[] des= {textField_7.getText(),textField_14.getText(),textField_21.getText(),textField_28.getText()};
					int[] quantite= {Integer.parseInt(textField_8.getText()),Integer.parseInt(textField_15.getText()),Integer.parseInt(textField_22.getText()),Integer.parseInt(textField_29.getText())};
					String[] puht={textField_9.getText(),textField_16.getText(),textField_23.getText(),textField_30.getText()};
					int[] montanthtt= {Integer.parseInt(textField_10.getText()),Integer.parseInt(textField_17.getText()),Integer.parseInt(textField_24.getText()),Integer.parseInt(textField_31.getText())};
					int[] montanttva= {Integer.parseInt(textField_11.getText()),Integer.parseInt(textField_18.getText()),Integer.parseInt(textField_25.getText()),Integer.parseInt(textField_32.getText())};
					ddd.ajfacti(nbf, datef, nbl, dbl, ncontract, dc, rm, client, des, quantite, puht, montanthtt, montanttva, i);
					}else {
						String nbf=textField.getText();
						String datef=textField_1.getText();
						String[] nbl= {textField_2.getText(),textField_12.getText(),textField_19.getText(),textField_26.getText(),textField_33.getText()};
						String[] dbl= {textField_3.getText(),textField_13.getText(),textField_20.getText(),textField_27.getText(),textField_34.getText()};
						int ncontract =Integer.parseInt(textField_4.getText());
						String dc =textField_5.getText();
						String rm= (String) comboBox.getSelectedItem();
						String client= textField_6.getText();
						String[] des= {textField_7.getText(),textField_14.getText(),textField_21.getText(),textField_28.getText(),textField_35.getText()};
						int[] quantite= {Integer.parseInt(textField_8.getText()),Integer.parseInt(textField_15.getText()),Integer.parseInt(textField_22.getText()),Integer.parseInt(textField_29.getText()),Integer.parseInt(textField_36.getText())};
						String[] puht={textField_9.getText(),textField_16.getText(),textField_23.getText(),textField_30.getText(),textField_37.getText()};
						int[] montanthtt= {Integer.parseInt(textField_10.getText()),Integer.parseInt(textField_17.getText()),Integer.parseInt(textField_24.getText()),Integer.parseInt(textField_31.getText()),Integer.parseInt(textField_38.getText())};
						int[] montanttva= {Integer.parseInt(textField_11.getText()),Integer.parseInt(textField_18.getText()),Integer.parseInt(textField_25.getText()),Integer.parseInt(textField_32.getText()),Integer.parseInt(textField_39.getText())};
						ddd.ajfacti(nbf, datef, nbl, dbl, ncontract, dc, rm, client, des, quantite, puht, montanthtt, montanttva, i);
					}
				}
			}
		}
						}	}	);
	}
}