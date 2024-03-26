package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class ajoutbnlivraison {

 JFrame frmAjouterBonLivraison;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
	private JTextArea txtrQuantit;
	private JTextArea txtrPuht;
	private JTextArea txtrMontant;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutbnlivraison window = new ajoutbnlivraison();
					window.frmAjouterBonLivraison.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ajoutbnlivraison() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjouterBonLivraison = new JFrame();
		frmAjouterBonLivraison.setTitle("ajouter bon livraison");
		frmAjouterBonLivraison.setBounds(100, 100, 533, 599);
		frmAjouterBonLivraison.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjouterBonLivraison.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(236, 29, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 58, 195, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 127, 195, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 156, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 197, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(236, 239, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(236, 271, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(236, 309, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(236, 350, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(236, 386, 190, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(236, 415, 195, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(236, 455, 195, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(236, 495, 195, 19);
		frmAjouterBonLivraison.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.setBounds(76, 531, 85, 21);
		frmAjouterBonLivraison.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("annuler");
		btnNewButton_1.setBounds(207, 531, 85, 21);
		frmAjouterBonLivraison.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("retour");
		btnNewButton_2.setBounds(341, 531, 85, 21);
		frmAjouterBonLivraison.getContentPane().add(btnNewButton_2);
		
		JTextArea txtrCodebnlivraison = new JTextArea();
		txtrCodebnlivraison.setText("Code bon livraison");
		txtrCodebnlivraison.setBounds(27, 29, 155, 19);
		frmAjouterBonLivraison.getContentPane().add(txtrCodebnlivraison);
		
		JTextArea txtrClient = new JTextArea();
		txtrClient.setText("Client");
		txtrClient.setBounds(27, 55, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrClient);
		
		JTextArea txtrDatebl = new JTextArea();
		txtrDatebl.setText("Date BL");
		txtrDatebl.setBounds(27, 121, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrDatebl);
		
		JTextArea txtrRm = new JTextArea();
		txtrRm.setText("RM");
		txtrRm.setBounds(24, 84, 158, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrRm);
		
		JTextArea txtrNumeroContract = new JTextArea();
		txtrNumeroContract.setText("Numero contract");
		txtrNumeroContract.setBounds(27, 153, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrNumeroContract);
		
		JTextArea txtrDateContract = new JTextArea();
		txtrDateContract.setText("Date contract");
		txtrDateContract.setBounds(27, 197, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrDateContract);
		
		JTextArea txtrNumeroBonComande = new JTextArea();
		txtrNumeroBonComande.setText("Numero bon comande");
		txtrNumeroBonComande.setBounds(27, 236, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrNumeroBonComande);
		
		JTextArea txtrDateBonCommande = new JTextArea();
		txtrDateBonCommande.setText("Date bon commande");
		txtrDateBonCommande.setBounds(27, 268, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrDateBonCommande);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(27, 306, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrDesignation);
		
		JTextArea txtrUniteMesure = new JTextArea();
		txtrUniteMesure.setText("Unité mesure");
		txtrUniteMesure.setBounds(27, 347, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrUniteMesure);
		
		JTextArea txtrQuantitColis = new JTextArea();
		txtrQuantitColis.setText("Quantité colisé");
		txtrQuantitColis.setBounds(27, 383, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrQuantitColis);
		
		txtrQuantit = new JTextArea();
		txtrQuantit.setText("Quantité");
		txtrQuantit.setBounds(27, 412, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrQuantit);
		
		txtrPuht = new JTextArea();
		txtrPuht.setText("puht");
		txtrPuht.setBounds(27, 452, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrPuht);
		
		txtrMontant = new JTextArea();
		txtrMontant.setText("Montant");
		txtrMontant.setBounds(27, 492, 155, 22);
		frmAjouterBonLivraison.getContentPane().add(txtrMontant);
		
		comboBox = new JComboBox();
		comboBox.setBounds(236, 86, 195, 21);
		frmAjouterBonLivraison.getContentPane().add(comboBox);
		String[] Rm={"RM1","RM2","RM3","RM4","RM5","RM6"};
		comboBox.setModel(new DefaultComboBoxModel<>( Rm ));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				Date d;
				d=new SimpleDateFormat("dd-MM-yyyy").parse(textField_5.getText());
				d=new SimpleDateFormat("dd-MM-yyyy").parse(textField_2.getText());
			d=new SimpleDateFormat("dd-MM-yyyy").parse(textField_7.getText());
				int  i1=Integer.parseInt(textField_4.getText());
				
				 int i3=Integer.parseInt(textField_10.getText());
				 int i4=Integer.parseInt(textField_11.getText());
				 int i5=Integer.parseInt(textField_13.getText());
				 ajbl aj= new ajbl();
			String R=(String) comboBox.getSelectedItem();
	aj.ajout(textField.getText(),textField_1.getText(),R,textField_2.getText(),i1,textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText().toLowerCase(),textField_9.getText(),i3,i4,textField_12.getText(),i5);
			}catch(ParseException E){
				 donnéenonconforme no=new donnéenonconforme();
				 System.out.println(E);
		    	 no.frmErreurDonneNon.setVisible(true);
			}
	}
});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			
				frmAjouterBonLivraison.setVisible(false);
			
	}
});
		
	}}
