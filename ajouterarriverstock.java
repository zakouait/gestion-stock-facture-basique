package projetstage2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ajouterarriverstock {private static Connection con = dbconnect.connect();boolean b;
public boolean ajout(String Designation,String Origine,String DateArriver,String Unite,int quantite,String Dateperemption,
		String numerofacture,String numerodelot,String observation, String lieux) {
	PreparedStatement ps = null;
	ResultSet rs = null;
	
    try {
        
   	 String sql1="insert into arriverstock values ('"+Designation+"','"+Origine+"',to_date('"+DateArriver+"','dd-mm-yyyy'),'"+Unite+"','"+quantite+"',to_date('"+Dateperemption+"','dd-mm-yyyy'),'"+numerofacture+"','"+numerodelot+"','"+observation+"','"+lieux+"')";
   	
             ps = con.prepareStatement(sql1);
 	
             rs = ps.executeQuery();
              b=this.ajoutstock(Designation, quantite, Unite,lieux);
             return true;
 	
    }catch (SQLException e)
    {
   	 donnéenonconforme no=new donnéenonconforme();
   	 no.frmErreurDonneNon.setVisible(true);
        System.out.println("Exception In Fun : 'UserExist' , Details : "+e); return false;
    }}
	public boolean ajoutstock(String Designation,int quantite,String unite,String lieux) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try { String sql1="select * from stock where designation='"+Designation+"' and lieux='"+lieux+"'";
	   	
        ps = con.prepareStatement(sql1);

        rs = ps.executeQuery();
			if(rs.next()) {
			
				int j=rs.getInt("quantite");
						j=j+quantite;
						try{sql1="update stock set quantite='"+j+"'where designation='"+Designation+"' and lieux='"+lieux+"'";
						 ps = con.prepareStatement(sql1);

					        rs = ps.executeQuery();return true;}catch(SQLException e)
					    {
							   	 donnéenonconforme no=new donnéenonconforme();
							   	
							        System.out.println("Exception In Fun : 'updatestock' , Details : "+e); return false;
							    }
			}
			else{
				try { sql1="insert into stock values('"+Designation+"','"+unite+"','"+quantite+"','"+lieux+"')";
			   	
		        ps = con.prepareStatement(sql1);

		        rs = ps.executeQuery();
		        return true;}catch(SQLException e)
			
		    {
				   	 donnéenonconforme no=new donnéenonconforme();
				   	
				        System.out.println("Exception In Fun : 'créestock' , Details : "+e); return false;
				    }
			}}catch(SQLException e)
			
	    {
		   	 donnéenonconforme no=new donnéenonconforme();
		   	
		        System.out.println("Exception In Fun : 'ajoutstock' , Details : "+e); return false;
		    }
		
	}
	public boolean reductionstock(String Designation,int quantite,String lieux){
		PreparedStatement ps = null;
		ResultSet rs = null;
		Designation=Designation.toLowerCase();
	    try {
	        
	   	 String sql1="select * from stock where designation='"+Designation+"' and lieux='"+lieux+"'";
	   	
	             ps = con.prepareStatement(sql1);
	 	
	             rs = ps.executeQuery();
	             rs.next();
	             int i=rs.getInt("quantite");
	             i=i-quantite;
	             try{sql1="update stock set quantite='"+i+"'where designation='"+Designation+"' and lieux='"+lieux+"'";
				 ps = con.prepareStatement(sql1);

			        rs = ps.executeQuery();return true;}
	             catch(SQLException e)
			    {
					   	 donnéenonconforme no=new donnéenonconforme();
					 	no.frmErreurDonneNon.setVisible(true);
					        System.out.println("Exception In Fun : 'reduce stock' , Details : "+e); return false;
					    }   
		
	}catch(SQLException e)
	    {
	   	 donnéenonconforme no=new donnéenonconforme();
	   	no.frmErreurDonneNon.setVisible(true);
	        System.out.println("Exception In Fun : 'select stock' , Details : "+e); return false;
	    }   
      
}
	public boolean modifierarr(String Designation,String Origine,String DateArriver,String Unite,int quantite,String Dateperemption,
			String numerofacture,String numerodelot,String observation,String lieux) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql1;
	    try {Designation=Designation.toLowerCase();
	     	 sql1="select * from arriverstock  where Designation='"+Designation+"' and numerofacture='"+numerofacture+"'and numerodelot='"+numerodelot+"'";
	 	   	
             ps = con.prepareStatement(sql1);
 	
             rs = ps.executeQuery();
             rs.next();
             int i=rs.getInt("quantite");
             this.reductionstock(Designation, i,lieux);}catch (SQLException e)
	    {
        	   	 donnéenonconforme no=new donnéenonconforme();
        	   	 no.frmErreurDonneNon.setVisible(true);
        	        System.out.println("Exception In Fun : 'modifier quant avant' , Details : "+e); return false;
        	    }
	    try {
	   	 sql1="update arriverstock set Unite='"+Unite+"',quantite='"+quantite+"',observation='"+observation+"' where Designation='"+Designation+"' and numerofacture='"+numerofacture+"'and numerodelot='"+numerodelot+"'";
	   	
	             ps = con.prepareStatement(sql1);
	 	
	             rs = ps.executeQuery();
	              this.reductionstock(Designation, -(quantite),lieux);
	             return true;
	 	
	    }catch (SQLException e)
	    {
	   	 donnéenonconforme no=new donnéenonconforme();
	   	 no.frmErreurDonneNon.setVisible(true);
	        System.out.println("Exception In Fun : 'UserExist' , Details : "+e); return false;
	    }}
}