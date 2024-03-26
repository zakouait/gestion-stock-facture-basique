package projetstage2;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connect {
	private static Connection con = dbconnect.connect();

	/**
	 * @wbp.parser.entryPoint
	 */
	public Utilisateur UserExiste(String user, String mdp) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utilisateur u = new Utilisateur();
		try {

			String sql1 = "select * from login where username='"+user +"'";
			
				ps = con.prepareStatement(sql1);
			
				rs = ps.executeQuery();
			

			boolean userNameExiste = rs.next();
			if (userNameExiste == true) {
				if (rs.getString("mdp").equals(mdp)) {
					String type = rs.getString("type");
					
					return new Utilisateur(user, mdp, type);
				} else {

					mdp_incorect m = new mdp_incorect();
					m.setVisible(true);
					return null;
				}
			} else {
				utilisateur_inexistant uti = new utilisateur_inexistant();
				uti.setVisible(true);
			}

		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'UserExist' , Details : " + e);
		}
		return null;

	}
}
