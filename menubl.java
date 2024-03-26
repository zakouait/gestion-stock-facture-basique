package projetstage2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menubl {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menubl window = new menubl();
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
	public menubl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ajouter bon livraison");
		btnNewButton.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnNewButton.setBounds(141, 35, 278, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("voire bon livraison");
		btnNewButton_1.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnNewButton_1.setBounds(141, 92, 278, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("voire arriver stock");
		btnNewButton_2.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnNewButton_2.setBounds(141, 151, 278, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("voire stock");
		btnNewButton_3.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnNewButton_3.setBounds(141, 205, 278, 38);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ajoutbnlivraison err=new ajoutbnlivraison();
			
			err.frmAjouterBonLivraison.setVisible(true);
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
		    public void actionPerformed(ActionEvent e) {
				voirebl err=new voirebl();
			
			err.frame.setVisible(true);
			}}
		    );
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirearriverstock2 err=new voirearriverstock2();
			
			err.frame.setVisible(true);
			}});
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirestock err=new voirestock();
			
			err.frame.setVisible(true);
			}});
		
	}
}
