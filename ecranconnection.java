package projetstage2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class ecranconnection {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecranconnection window = new ecranconnection();
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
	public ecranconnection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(219, 44, 189, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("connection");
		btnNewButton.setBounds(149, 164, 133, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrNomDutilisateur = new JTextArea();
		txtrNomDutilisateur.setText("nom d'utilisateur");
		txtrNomDutilisateur.setBounds(48, 41, 141, 22);
		frame.getContentPane().add(txtrNomDutilisateur);
		
		JTextArea txtrMotDePass = new JTextArea();
		txtrMotDePass.setText("mot de pass");
		txtrMotDePass.setBounds(48, 92, 141, 22);
		frame.getContentPane().add(txtrMotDePass);
		passwordField = new JPasswordField();
		passwordField.setBounds(219, 95, 189, 19);
		frame.getContentPane().add(passwordField);
		btnNewButton.addActionListener(new ActionListener() {
				@Override
			    public void actionPerformed(ActionEvent e) {Utilisateur u=new Utilisateur();
			    
			    u=new connect().UserExiste(textField.getText(),String.valueOf(passwordField.getPassword()));	if(u==null) {System.out.print("false");}		
			   String t1,t2,t3,t4;
			   t1="stock";
			   t2="livraison";
			   t3="finance";
			   t4="admin";
			   if((u.get()).equals(t1)) { 
				   System.out.println("open");
				   menustockcomplet menu=new menustockcomplet();menu.frmMenuStock.setVisible(true);
				   frame.setVisible(false);
				   	
			   }
			   if(u.get().equals(t2)) {
				   menubl bl=new menubl();
				   bl.frame.setVisible(true); frame.setVisible(false);
				   	
			   }
			   if(u.get().equals(t3)) {
				  menu_facturation mn=new menu_facturation();
				  mn.frame.setVisible(true);frame.setVisible(false);
			   }
 if(u.get().equals(t4)) {
				   menuadmin mn=new menuadmin();
				   mn.frame.setVisible(true);
				   frame.setVisible(false);
			   }
				}
		} 
					);
	}
}
