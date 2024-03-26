package projetstage2;

public class facture {
private String nfacture,Dfacture,numerocontract,Datecontract,RM,client;
private String[] codebnlivraison,datebl,Designation,quantite,puht,montant,montanttva,MontantTTC;
int i;
public facture(String nfacture, String dfacture, String numerocontract, String datecontract, String rM, String client,
		String[] codebnlivraison, String[] datebl, String[] designation, String[] quantite, String[] puht,
		String[] montant, String[] montanttva, String[] montantTTC, int i) {
	super();
	this.nfacture = nfacture;
	Dfacture = dfacture;
	this.numerocontract = numerocontract;
	Datecontract = datecontract;
	RM = rM;
	this.client = client;
	this.codebnlivraison = codebnlivraison;
	this.datebl = datebl;
	Designation = designation;
	this.quantite = quantite;
	this.puht = puht;
	this.montant = montant;
	this.montanttva = montanttva;
	MontantTTC = montantTTC;
	this.i = i;
}
public String getNfacture() {
	return nfacture;
}
public void setNfacture(String nfacture) {
	this.nfacture = nfacture;
}
public String getDfacture() {
	return Dfacture;
}
public void setDfacture(String dfacture) {
	Dfacture = dfacture;
}
public String getNumerocontract() {
	return numerocontract;
}
public void setNumerocontract(String numerocontract) {
	this.numerocontract = numerocontract;
}
public String getDatecontract() {
	return Datecontract;
}
public void setDatecontract(String datecontract) {
	Datecontract = datecontract;
}
public String getRM() {
	return RM;
}
public void setRM(String rM) {
	RM = rM;
}
public String getClient() {
	return client;
}
public void setClient(String client) {
	this.client = client;
}
public String[] getCodebnlivraison() {
	return codebnlivraison;
}
public void setCodebnlivraison(String[] codebnlivraison) {
	this.codebnlivraison = codebnlivraison;
}
public String[] getDatebl() {
	return datebl;
}
public void setDatebl(String[] datebl) {
	this.datebl = datebl;
}
public String[] getDesignation() {
	return Designation;
}
public void setDesignation(String[] designation) {
	Designation = designation;
}
public String[] getQuantite() {
	return quantite;
}
public void setQuantite(String[] quantite) {
	this.quantite = quantite;
}
public String[] getPuht() {
	return puht;
}
public void setPuht(String[] puht) {
	this.puht = puht;
}
public String[] getMontant() {
	return montant;
}
public void setMontant(String[] montant) {
	this.montant = montant;
}
public String[] getMontanttva() {
	return montanttva;
}
public void setMontanttva(String[] montanttva) {
	this.montanttva = montanttva;
}
public String[] getMontantTTC() {
	return MontantTTC;
}
public void setMontantTTC(String[] montantTTC) {
	MontantTTC = montantTTC;
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}}