package projetstage2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class facturedb {
	private static Connection con = dbconnect.connect();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public boolean ajfact1(String nfacture,String Dfacture,String codebnlivraison,String datebl,int numerocontract,String Datecontract
			,String RM,String client,String Designation,int quantite,String puht,int montant,int montanttva,int i) {
		try {
	        int montantttc= montant +(montant*montanttva)/100;int kl=0;
	        
	        System.out.println(montantttc);
		   	 String sql1="insert into facture values ('"+nfacture+"', to_date('"+Dfacture+"','dd-mm-yyyy'),'"+codebnlivraison+"',to_date('"+datebl+"','dd-mm-yyyy'),'"+numerocontract+"', to_date('"+Datecontract+"','dd-mm-yyyy'),'"+RM+"','"+client+"','"+Designation+"','"+quantite+"','"+puht+"','"+montant+"','"+montanttva+"','"+montantttc+"','"+kl+"','"+i+"')";
		     System.out.println(sql1);      
		   	 ps = con.prepareStatement(sql1);
		            
		             rs = ps.executeQuery();
		             
		             return true;
		 	
		    }catch (SQLException e)
		    {
		   	 donnéenonconforme no=new donnéenonconforme();
		   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
		        System.out.println("Exception In Fun : 'ajout facture i=1' , Details : "+e); return false;
		    }
	}
	public boolean ajfacti(String nfacture,String Dfacture,String[] codebnlivraison,String[] datebl,int numerocontract,String Datecontract
			,String RM,String client,String[] Designation,int[] quantite,String[] puht,int[] montant,int[] montanttva,int i) {
		int j;
		for(j=0;j<i;j++) {
			
		this.ajfact1(nfacture, Dfacture, Dfacture, codebnlivraison[j], numerocontract, Datecontract, RM, client, Designation[j], quantite[j], puht[j], montant[j],montanttva[j],i);
		}
	        
		   	 
		             
		             return true;
		 	
		  
	}// ce4548 45824
}

