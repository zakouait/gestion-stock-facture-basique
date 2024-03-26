package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class voirearriverstock {

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
	int i=0;
	private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					voirearriverstock window = new voirearriverstock();
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
	public voirearriverstock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("arriver stock");
		frame.setBounds(100, 100, 558, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(190, 52, 219, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 95, 219, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 136, 219, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 179, 219, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 208, 219, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(190, 245, 219, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(190, 287, 219, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(190, 327, 219, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(190, 369, 219, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JTextArea txtrDesignation = new JTextArea();
		txtrDesignation.setText("Designation");
		txtrDesignation.setBounds(27, 49, 119, 22);
		frame.getContentPane().add(txtrDesignation);
		
		JTextArea txtrOrigine = new JTextArea();
		txtrOrigine.setText("Origine");
		txtrOrigine.setBounds(27, 92, 119, 22);
		frame.getContentPane().add(txtrOrigine);
		
		JTextArea txtrDatearriver = new JTextArea();
		txtrDatearriver.setText("Date Arriver");
		txtrDatearriver.setBounds(27, 133, 119, 22);
		frame.getContentPane().add(txtrDatearriver);
		
		JTextArea txtrUnite = new JTextArea();
		txtrUnite.setText("Unité");
		txtrUnite.setBounds(27, 176, 119, 22);
		frame.getContentPane().add(txtrUnite);
		
		JTextArea txtrQuantit = new JTextArea();
		txtrQuantit.setText("quantité");
		txtrQuantit.setBounds(27, 205, 119, 22);
		frame.getContentPane().add(txtrQuantit);
		
		JTextArea txtrDatePremption = new JTextArea();
		txtrDatePremption.setText("Date péremption");
		txtrDatePremption.setBounds(27, 242, 119, 22);
		frame.getContentPane().add(txtrDatePremption);
		
		JTextArea txtrNumeroFacture = new JTextArea();
		txtrNumeroFacture.setText("Numero facture");
		txtrNumeroFacture.setBounds(27, 284, 119, 22);
		frame.getContentPane().add(txtrNumeroFacture);
		
		JTextArea txtrNumeroDeLot = new JTextArea();
		txtrNumeroDeLot.setText("Numero de lot");
		txtrNumeroDeLot.setBounds(27, 324, 119, 22);
		frame.getContentPane().add(txtrNumeroDeLot);
		
		JTextArea txtrOoservation = new JTextArea();
		txtrOoservation.setText("Observation");
		txtrOoservation.setBounds(27, 366, 119, 22);
		frame.getContentPane().add(txtrOoservation);
		
		JButton btnNewButton = new JButton("precedent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(61, 435, 98, 19);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suivant");
		btnNewButton_1.setBounds(350, 434, 107, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("retour");
		btnNewButton_2.setBounds(225, 505, 102, 21);
		frame.getContentPane().add(btnNewButton_2);
		textField_9 = new JTextField();
		textField_9.setBounds(190, 398, 219, 19);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		int j =new recuparriver().recuparrivernb();i=0;
		arriver ar=new recuparriver().recup(i);
		
		textField.setText(ar.getDesignation());
		textField_1.setText(ar.getOrigine());
		textField_2.setText(ar.getDateArriver());
		textField_3.setText(ar.getUnite());
		textField_4.setText(String.valueOf(ar.getQuantite()));
		textField_5.setText(ar.getDateperemption());
		textField_6.setText(ar.getNumerofacture());
		textField_7.setText(ar.getNumerodelot());
		textField_8.setText(ar.getObservation());
		String lll=ar.getLieux();
		textField_9.setText(lll);
		JButton btnNewButton_3 = new JButton("modifier");
		btnNewButton_3.setBounds(213, 434, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		
	
		JTextArea txtrLieuxStockage = new JTextArea();
		txtrLieuxStockage.setText("lieux stockage");
		txtrLieuxStockage.setBounds(27, 395, 119, 22);
		frame.getContentPane().add(txtrLieuxStockage);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i==0) {
					erreurhorschamp er=new erreurhorschamp();
					er.setVisible(true);
				}else {
					i=i-1;
					arriver ar=new recuparriver().recup(i);
					
					textField.setText(ar.getDesignation());
					textField_1.setText(ar.getOrigine());
					textField_2.setText(ar.getDateArriver());
					textField_3.setText(ar.getUnite());
					textField_4.setText(String.valueOf(ar.getQuantite()));
					textField_5.setText(ar.getDateperemption());
					textField_6.setText(ar.getNumerofacture());
					textField_7.setText(ar.getNumerodelot());
					textField_8.setText(ar.getObservation());
					textField_9.setText(ar.getLieux());
				}
				
				
				
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				if(i>=(j-1)) {
					erreurhorschamp er=new erreurhorschamp();
					er.setVisible(true);
				}else {
					i=i+1;
					arriver ar=new recuparriver().recup(i);
					
					textField.setText(ar.getDesignation());
					textField_1.setText(ar.getOrigine());
					textField_2.setText(ar.getDateArriver());
					textField_3.setText(ar.getUnite());
					textField_4.setText(String.valueOf(ar.getQuantite()));
					textField_5.setText(ar.getDateperemption());
					textField_6.setText(ar.getNumerofacture());
					textField_7.setText(ar.getNumerodelot());
					textField_8.setText(ar.getObservation());
					textField_9.setText(ar.getLieux());
				}			}	}	);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ajouterarriverstock aj=new ajouterarriverstock();
				aj.modifierarr(textField.getText().toLowerCase(), textField_1.getText(), textField_2.getText(), textField_3.getText(), Integer.parseInt(textField_4.getText()), textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(),textField_9.getText());
				
				}			}		);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				}			}		);
	}
}
