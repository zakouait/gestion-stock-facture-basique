package projetstage2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class recupfacture {
	private static Connection con = dbconnect.connect();PreparedStatement ps = null;
	ResultSet rs = null;
	public int ndisnumfac() {
		try {
			String sql="select distinct nfacture from facture order by Dfacture DESC";
			   ps = con.prepareStatement(sql);	 	
	           rs = ps.executeQuery();
	           int i=0;
	           while(rs.next()) {
	        	   i++;
	           }return i;
		  }catch (SQLException e)
	    {
	   	 donnéenonconforme no=new donnéenonconforme();
	   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
	        System.out.println("Exception In Fun : 'recup facture bl taille' , Details : "+e); return -1;
	    }
	}
		
	
public String[] disnumfac() {
	try {
		String sql="select nfacture from facture  order by Dfacture DESC";
		   ps = con.prepareStatement(sql);	 	
           rs = ps.executeQuery();
          
           String s[]=new String[1500];
           int i=0;rs.next(); s[i]=rs.getString("nfacture");i++;
          while(rs.next()) {
        	   if(s[i-1]!=rs.getString("nfacture")) {
        	   s[i]=rs.getString("nfacture");i++;}
           }return s;
           
	  }catch (SQLException e)
    {
   	 donnéenonconforme no=new donnéenonconforme();
   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
        System.out.println("Exception In Fun : 'recup facture num' , Details : "+e); return null;
    }
}
public facture recfac(int j) {
	try {
		String[] n=this.disnumfac();
           int i=0;
           
           String num=n[j];
           for(i=0;i<n.length;i++) {
        	   System.out.println(n[i]);
           }i=0;
           String sql="select * from facture where nfacture='"+num+"'";
           ps = con.prepareStatement(sql);	 	
           rs = ps.executeQuery();
           
          String nfacture=null,RM = null,Dfacture=null,numerocontract=null,client = null,Datecontract = null; 
           String[] codebnlivraison =new String [5],datebl=new String [5],Designation=new String [5],quantite=new String [5],puht=new String [5],montant=new String [5],montanttva=new String [5],MontantTTC=new String [5];
           
           int nbl=1;
           i=0;
         while(rs.next())  {  nfacture=rs.getString("nfacture");Dfacture=String.valueOf(rs.getDate("Dfacture"));RM=rs.getString("RM");
           numerocontract=String.valueOf(rs.getInt("numerocontract"));
           client=rs.getString("client");
           Datecontract=String.valueOf(rs.getDate("Datecontract"));
        	   codebnlivraison[i]=rs.getString("codebnlivraison");
        	   datebl[i]=String.valueOf(rs.getDate("datebl"));
        	   Designation[i]=rs.getString("Designation");
        	   quantite[i]=String.valueOf(rs.getInt("quantite"));
        	   puht[i]=rs.getString("puht");
        	   montant[i]=String.valueOf(rs.getInt("montant"));
        	   montanttva[i]=String.valueOf(rs.getInt("montanttva"));
        	   MontantTTC[i]=String.valueOf(rs.getInt("MontantTTC"));
        	   i++; nbl=rs.getInt("nbbn") ;
        	 
               }
           facture fact=new facture( nfacture,  Dfacture,numerocontract, Datecontract,RM, client,
        			codebnlivraison, datebl, Designation, quantite,puht,
        			 montant, montanttva,MontantTTC, nbl);
    return fact;       
	}catch (SQLException e){
   	 donnéenonconforme no=new donnéenonconforme();
   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
        System.out.println("Exception In Fun : 'recup facture bl' , Details : "+e); return null;
    }
	
}
	public void validerfac(String nbfac) {
		try {
			String sql="update facture set accrecep='1' where nfacture='"+nbfac+"'";
			   ps = con.prepareStatement(sql);	 	
	           rs = ps.executeQuery();
	          
		  }catch (SQLException e)
	    {
	   	 donnéenonconforme no=new donnéenonconforme();
	   	 no.frmErreurDonneNon.setVisible(true); System.out.println(e);
	        System.out.println("Exception In Fun : 'valider facture ' , Details : "+e); 
	    }
	}
}
