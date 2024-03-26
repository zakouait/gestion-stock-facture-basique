package projetstage2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class recherche {PreparedStatement ps = null;
ResultSet rs = null;

private static Connection con = dbconnect.connect();
public stock restock(int i) {
	try {
		String sql="select * from stock order by designation";
	
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    stock  stk;
    int j=0;rs.next();
	while(j<i) {rs.next();j++;}
	stk=new stock(rs.getString("designation"),rs.getString("unite"),rs.getInt("quantite"),rs.getString("lieux"));
	
	return stk;

}catch (SQLException e)
{
System.out.println("error fonction restock  "+e);
	return null;
	
}
}

public int recupstocknb() {
	try {
		String sql="select * from stock";
	
    ps = con.prepareStatement(sql);
 	
    rs = ps.executeQuery();
    int i=0;
	while(rs.next()) {
	
	
	i++;}return i;
}catch (SQLException e) {
	System.out.println("error fonction nbstock  "+e);
	return 0;
}
}
public stock restockdes(String des) {
	try {
		String sql="select * from stock where designation='"+des+"'";
	
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    stock  stk;
    int j=0;rs.next();
	
	stk=new stock(rs.getString("designation"),rs.getString("unite"),rs.getInt("quantite"),rs.getString("lieux"));
	
	return stk;

}catch (SQLException e)
{
System.out.println("error fonction restock  "+e);
	return null;
	
}
}
}