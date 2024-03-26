package projetstage2;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class erreurhorschamp extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					erreurhorschamp frame = new erreurhorschamp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public erreurhorschamp() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextArea txtrErreurImpossibleDeffectuer = new JTextArea();
		txtrErreurImpossibleDeffectuer.setForeground(Color.RED);
		txtrErreurImpossibleDeffectuer.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 17));
		txtrErreurImpossibleDeffectuer.setText("erreur impossible d'effectuer l'operation");
		txtrErreurImpossibleDeffectuer.setBounds(24, 52, 371, 36);
		getContentPane().add(txtrErreurImpossibleDeffectuer);
		
		JTextArea txtrLimiteTableAtteinte = new JTextArea();
		txtrLimiteTableAtteinte.setForeground(Color.RED);
		txtrLimiteTableAtteinte.setText("limite table atteinte");
		txtrLimiteTableAtteinte.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 17));
		txtrLimiteTableAtteinte.setBounds(74, 111, 244, 41);
		getContentPane().add(txtrLimiteTableAtteinte);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(165, 211, 85, 21);
		getContentPane().add(btnNewButton);
		
	}
}
