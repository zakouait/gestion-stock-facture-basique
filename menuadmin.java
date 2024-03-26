package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class menuadmin {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuadmin window = new menuadmin();
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
	public menuadmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 584, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ajouter arriver stock");
		btnNewButton.setBounds(121, 38, 154, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("voire arriver stock");
		btnNewButton_1.setBounds(298, 38, 167, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnMenuStock = new JTextPane();
		txtpnMenuStock.setText("menu stock");
		txtpnMenuStock.setBounds(243, 9, 82, 19);
		frame.getContentPane().add(txtpnMenuStock);
		
		JButton btnNewButton_2 = new JButton("voire stock");
		btnNewButton_2.setBounds(162, 69, 113, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("reduire stock");
		btnNewButton_3.setBounds(296, 69, 141, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JTextPane txtpnMenuBl = new JTextPane();
		txtpnMenuBl.setText("menu bl");
		txtpnMenuBl.setBounds(243, 112, 82, 19);
		frame.getContentPane().add(txtpnMenuBl);
		
		JButton btnNewButton_4 = new JButton("ajouter bon livraison");
		btnNewButton_4.setBounds(192, 154, 154, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("voire bon livraison");
		btnNewButton_5.setBounds(192, 202, 154, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		JTextPane txtpnMenuFacture = new JTextPane();
		txtpnMenuFacture.setText("menu facture");
		txtpnMenuFacture.setBounds(243, 261, 82, 19);
		frame.getContentPane().add(txtpnMenuFacture);
		
		JButton btnNewButton_6 = new JButton("ajouter facture");
		btnNewButton_6.setBounds(192, 304, 154, 21);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("voire facture");
		btnNewButton_7.setBounds(192, 363, 154, 21);
		frame.getContentPane().add(btnNewButton_7);
		
		JTextArea txtrNbl = new JTextArea();
		txtrNbl.setText("nbl");
		txtrNbl.setBounds(379, 302, 58, 22);
		frame.getContentPane().add(txtrNbl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(472, 304, 44, 21);
		frame.getContentPane().add(comboBox);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ecranarrstock ecr=new ecranarrstock();
				ecr.frmArriverStock.setVisible(true);
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirearriverstock vr=new voirearriverstock();
				vr.frame.setVisible(true);
			}});	
		btnNewButton_2.addActionListener(new ActionListener() {
				@Override
			    public void actionPerformed(ActionEvent e) {
					voirestock vr=new voirestock();
					vr.frame.setVisible(true);
				}});
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				reduirestock red=new reduirestock();
				red.frame.setVisible(true);
			}});
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ajoutbnlivraison ajbl=new ajoutbnlivraison();
				ajbl.frmAjouterBonLivraison.setVisible(true);
			}});
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirebl bl=new voirebl();
				bl.frame.setVisible(true);
			}});String[] Rm={"1","2","3","4","5"};
			comboBox.setModel(new DefaultComboBoxModel<>( Rm ));
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				String t=(String) comboBox.getSelectedItem();
				if(t!="") {
					int i=Integer.parseInt(t);ajoutfacture er=new ajoutfacture(i);er.frame.setVisible(true);
				}else {
					ajoutfacture er=new ajoutfacture();er.frame.setVisible(true);
				}
			}});
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirefacture voire=new voirefacture();
				voire.frame.setVisible(true);
			}});
	}
}
