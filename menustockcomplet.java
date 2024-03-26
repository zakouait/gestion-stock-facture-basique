package projetstage2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menustockcomplet {

	 JFrame frmMenuStock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menustockcomplet window = new menustockcomplet();
					window.frmMenuStock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menustockcomplet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuStock = new JFrame();
		frmMenuStock.setTitle("menu gestion de stock");
		frmMenuStock.setBounds(100, 100, 524, 482);
		frmMenuStock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuStock.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("marquer arriver stock");
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		btnNewButton.setBounds(110, 45, 197, 36);
		frmMenuStock.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("voir les arriver de stock");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		btnNewButton_1.setBounds(110, 120, 197, 36);
		frmMenuStock.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voire stock total");
		btnNewButton_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		btnNewButton_2.setBounds(110, 180, 197, 36);
		frmMenuStock.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("reduire stock");
		btnNewButton_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		btnNewButton_3.setBounds(110, 242, 197, 36);
		frmMenuStock.getContentPane().add(btnNewButton_3);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				ecranarrstock err=new ecranarrstock();
			
			err.frmArriverStock.setVisible(true);
			}});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirearriverstock err=new voirearriverstock();
			
			err.frame.setVisible(true);
			}});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				voirestock err=new voirestock();
		
			err.frame.setVisible(true);
			}});
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				reduirestock err=new reduirestock();
	
			err.frame.setVisible(true);
			}});
	
	}

}
