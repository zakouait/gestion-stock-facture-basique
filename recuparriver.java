package projetstage2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class recuparriver {
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	private static Connection con = dbconnect.connect();
	public int recuparrivernb() {
		try {
			String sql="select * from arriverstock order by DateArriver DESC";
		
        ps = con.prepareStatement(sql);
     	
        rs = ps.executeQuery();
        int i=0;
		while(rs.next()) {
		
		
		i++;}return i;

}catch (SQLException e)
{

		return 0;
		
	}
}
	
	public arriver recup(int d) {
		try {
			String sql="select * from arriverstock  order by DateArriver DESC";
		
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        arriver  arr;
        int i=0;rs.next();
		while(i<d) {rs.next();i++;}
		arr=new arriver(rs.getString("Designation"),rs.getString("Origine"),String.valueOf(rs.getDate("DateArriver")),rs.getString("Unite"),rs.getInt("quantite"),
				String.valueOf(rs.getDate("Dateperemption")),rs.getString("numerofacture"),rs.getString("numerodelot"),rs.getString("observation"),rs.getString("lieuxstockage"));
		System.out.println(arr.getLieux());
		return arr;

}catch (SQLException e)
{

		return null;
		
	}
}
//avec nom précisé
	public int recuparrivernbnom(String d) {
		try {
			String sql="select * from arriverstock where Designation='"+d+"'";
		
        ps = con.prepareStatement(sql);
     	
        rs = ps.executeQuery();
        int i=0;
		while(rs.next()) {
		
		
		i++;}return i;

}catch (SQLException e)
{

		return 0;
		
	}
}
	
	public  arriver[] recupnom(String d) {
		try {
			String sql="select * from arriverstock where Designation='"+d+"'";
		
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        arriver[] arr=new arriver[this.recuparrivernb()];
        int i=0;
		while(rs.next()) {
		arr[i]=new arriver(rs.getString("Designation"),rs.getString("Origine"),String.valueOf(rs.getDate("DateArriver")),rs.getString("Unite"),rs.getInt("quantite"),
				String.valueOf(rs.getDate("Dateperemption")),rs.getString("numerofacture"),rs.getString("numerodelot"),rs.getString("observation"),rs.getString("lieuxstockage"));
		i++;
		}return arr;

}catch (SQLException e)
{System.out.println(e);

		return null;
		
	}
}
}    
