package projetstage2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class recupbl {
	PreparedStatement ps = null;
	ResultSet rs = null;
	private static Connection con = dbconnect.connect();
	int recupblnb() {
	
			try {
				String sql="select * from bonlivraison order by datebl DESC";
			
	        ps = con.prepareStatement(sql);
	     	
	        rs = ps.executeQuery();
	        int i=0;
			while(rs.next()) {
			
			
			i++;}return i;

	}catch (SQLException e)
	{
System.out.println("ereur recuperer nb bl");
			return 0;
			
		
	}
	}
	public bl recup(int d) {
		try {
			String sql="select * from bonlivraison  order by datebl DESC";
		
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        bl  arr;
        int i=0;rs.next();
		while(i<d) {rs.next();i++;}
		arr=new bl(rs.getString("codebnlivraison"),rs.getString("client"),rs.getString("RM"),String.valueOf(rs.getDate("datebl")),String.valueOf(rs.getInt("numerocontract")),String.valueOf(rs.getDate("Datecontract"))
				,rs.getString("numeroboncomande"),String.valueOf(rs.getDate("dateboncommande")),rs.getString("Designation"),rs.getString("unitemesure"),String.valueOf(rs.getInt("quantitecolise")),
				String.valueOf(rs.getInt("quantite")),rs.getString("puht"),String.valueOf(rs.getInt("montant")));
		return arr;

}catch (SQLException e)
{

		return null;
		
	}
}
}
