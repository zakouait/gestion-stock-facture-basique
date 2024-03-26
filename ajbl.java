package projetstage2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ajbl {private static Connection con = dbconnect.connect();PreparedStatement ps = null;
	ResultSet rs = null;
public boolean ajout(String nbl,String client,String RM,String datebl,int numerocontract,String Datecontract
		,String numeroboncomande,String dateboncommande,String Designation,String unitemesure,int quantitecolise,int quantite,String puht,int montant) {
	
	try {
        
	   	 String sql1="insert into bonlivraison values ('"+nbl+"','"+client+"','"+RM+"',to_date('"+datebl+"','dd-mm-yyyy'),'"+numerocontract+"',to_date('"+Datecontract+"','dd-mm-yyyy'),"
	   	 		+ "'"+numeroboncomande+"',to_date('"+dateboncommande+"','dd-mm-yyyy'),'"+Designation+"','"+unitemesure+"','"+quantitecolise+"','"+quantite+"','"+puht+"','"+montant+"')";
	   	
	             ps = con.prepareStatement(sql1);
	 	
	             rs = ps.executeQuery();
	             ajouterarriverstock aj=new ajouterarriverstock();
	             stock sttk=new recherche().restockdes(Designation);
	             aj.reductionstock(Designation, quantite,sttk.getLieux());
	             return true;
	 	
	    }catch (SQLException e)
	    {
	   	 donnéenonconforme no=new donnéenonconforme();
	   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
	        System.out.println("Exception In Fun : 'ajout bl' , Details : "+e); return false;
	    }
}
public boolean modbl(String nbl,String client,String RM,String datebl,int numerocontract,String Datecontract
		,String numeroboncomande,String dateboncommande,String Designation,String unitemesure,int quantitecolise,int quantite,String puht,int montant) 
{ajouterarriverstock aj=new ajouterarriverstock();
	try {
        String sql="select * from bonlivraison where codebnlivraison='"+nbl+"'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        int i=rs.getInt("quantite");
        String sh=rs.getString("Designation");
       
        stock sttk=new recherche().restockdes(Designation);        
        aj.reductionstock(sh,-i,sttk.getLieux());}catch (SQLException e)
    { System.out.println("Exception In Fun : 'red mod bl' , Details : "+e); 
  	 donnéenonconforme no=new donnéenonconforme();
  	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
      return false;
   }try {
	   	
	   String sql1="update bonlivraison set quantite='"+quantite+"',quantitecolise='"+quantitecolise+"',montant='"+montant+"',puht='"+puht+"' where codebnlivraison='"+nbl+"' ";
	   ps = con.prepareStatement(sql1);
	 	
	             rs = ps.executeQuery();
	             stock sttk=new recherche().restockdes(Designation);    
	             aj.reductionstock(Designation, quantite,sttk.getLieux());
	             return true;
	 	
	    }catch (SQLException e)
	    { System.out.println("Exception In Fun : 'mod bl' , Details : "+e); 
	   	 donnéenonconforme no=new donnéenonconforme();
	   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
	       return false;
	    }
   
}
public bl recblnom(String nbl) {
	try {
        String sql="select * from bonlivraison where codebnlivraison='"+nbl+"'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        bl bonl=new bl(nbl,rs.getString("client"),rs.getString("RM"), String.valueOf(rs.getDate("datebl")),String.valueOf(rs.getInt("numerocontract")),String.valueOf(rs.getDate("Datecontract")), rs.getString("numeroboncomande"), String.valueOf(rs.getDate("dateboncommande")), 
        		rs.getString("Designation"), rs.getString("unitemesure"), String.valueOf(rs.getInt("quantitecolise")), String.valueOf(rs.getInt("quantite")), rs.getString("puht"), String.valueOf(rs.getInt("montant")));
        return bonl;
	}catch(SQLException e) {
		return null;
	}
}
}
