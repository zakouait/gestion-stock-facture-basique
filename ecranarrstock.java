package projetstage2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;



import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class ecranarrstock {

	 JFrame frmArriverStock;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecranarrstock window = new ecranarrstock();
					window.frmArriverStock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ecranarrstock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArriverStock = new JFrame();
		frmArriverStock.setTitle("arriver stock");
		frmArriverStock.setBounds(100, 100, 553, 549);
		frmArriverStock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArriverStock.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(190, 52, 219, 19);
		frmArriverStock.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 95, 219, 19);
		frmArriverStock.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 136, 219, 19);
		frmArriverStock.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 179, 219, 19);
		frmArriverStock.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 208, 219, 19);
		frmArriverStock.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(190, 245, 219, 19);
		frmArriverStock.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(190, 287, 219, 19);
		frmArriverStock.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(190, 327, 219, 19);
		frmArriverStock.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(190, 369, 216, 19);
		frmArriverStock.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(27, 49, 119, 22);
		frmArriverStock.getContentPane().add(txtrDesignation);
		
		JTextArea txtrOrigine = new JTextArea();
		txtrOrigine.setText("Origine");
		txtrOrigine.setBounds(27, 92, 119, 22);
		frmArriverStock.getContentPane().add(txtrOrigine);
		
		JTextArea txtrDatearriver = new JTextArea();
		txtrDatearriver.setText("Date Arriver");
		txtrDatearriver.setBounds(27, 133, 119, 22);
		frmArriverStock.getContentPane().add(txtrDatearriver);
		
		JTextArea txtrUnite = new JTextArea();
		txtrUnite.setText("Unité");
		txtrUnite.setBounds(27, 176, 119, 22);
		frmArriverStock.getContentPane().add(txtrUnite);
		
		JTextArea txtrQuantit = new JTextArea();
		txtrQuantit.setText("quantité");
		txtrQuantit.setBounds(27, 205, 119, 22);
		frmArriverStock.getContentPane().add(txtrQuantit);
		
		JTextArea txtrDatePremption = new JTextArea();
		txtrDatePremption.setText("Date péremption");
		txtrDatePremption.setBounds(27, 242, 119, 22);
		frmArriverStock.getContentPane().add(txtrDatePremption);
		
		JTextArea txtrNumeroFacture = new JTextArea();
		txtrNumeroFacture.setText("Numero facture");
		txtrNumeroFacture.setBounds(27, 284, 119, 22);
		frmArriverStock.getContentPane().add(txtrNumeroFacture);
		
		JTextArea txtrNumeroDeLot = new JTextArea();
		txtrNumeroDeLot.setText("Numero de lot");
		txtrNumeroDeLot.setBounds(27, 324, 119, 22);
		frmArriverStock.getContentPane().add(txtrNumeroDeLot);
		
		JTextArea txtrOoservation = new JTextArea();
		txtrOoservation.setText("Observation");
		txtrOoservation.setBounds(27, 366, 119, 22);
		frmArriverStock.getContentPane().add(txtrOoservation);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(190, 445, 85, 19);
		frmArriverStock.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("annuler");
		btnNewButton_1.setBounds(305, 444, 85, 21);
		frmArriverStock.getContentPane().add(btnNewButton_1);
		
		JButton retour = new JButton("retour");
		retour.setBounds(255, 481, 85, 21);
		frmArriverStock.getContentPane().add(retour);
		
		textField_9 = new JTextField();
		textField_9.setBounds(190, 402, 219, 19);
		frmArriverStock.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JTextArea txtrLieuxStockage = new JTextArea();
		txtrLieuxStockage.setText("lieux stockage");
		txtrLieuxStockage.setBounds(27, 399, 126, 22);
		frmArriverStock.getContentPane().add(txtrLieuxStockage);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				
				try {
					Date d;
					d=new SimpleDateFormat("dd-MM-yyyy").parse(textField_5.getText());
					d=new SimpleDateFormat("dd-MM-yyyy").parse(textField_2.getText());
					int i=Integer.parseInt(textField_4.getText());
					ajouterarriverstock aj= new ajouterarriverstock();
					boolean b=aj.ajout(textField.getText().toLowerCase(), textField_1.getText(), textField_2.getText(), textField_3.getText(), i, textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(),textField_9.getText()); 
				System.out.println(b);
				}catch(ParseException E){
					 donnéenonconforme no=new donnéenonconforme();
			    	 no.frmErreurDonneNon.setVisible(true);
					}
				
			 }	} 
		
		);	btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			
					Date d;
					textField_5.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField.setText("");
					textField_1.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
			}	} 
				);
		retour.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			
				frmArriverStock.setVisible(false);
			}	} 
				);
	}
}
