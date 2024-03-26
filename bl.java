package projetstage2;

public class bl {
private String codebl,client,rm,datebl,numerocontract,datecontract,numerobc,datebc,designation,unite,quantitecol,quantite,puht,montant;

public bl(String codebl, String client, String rm, String datebl, String numerocontract, String datecontract,
		String numerobc, String datebc, String designation, String unite, String quantitecol, String quantite,
		String puht, String montant) {
	super();
	this.codebl = codebl;
	this.client = client;
	this.rm = rm;
	this.datebl = datebl;
	this.numerocontract = numerocontract;
	this.datecontract = datecontract;
	this.numerobc = numerobc;
	this.datebc = datebc;
	this.designation = designation;
	this.unite = unite;
	this.quantitecol = quantitecol;
	this.quantite = quantite;
	this.puht = puht;
	this.montant = montant;
}

public String getCodebl() {
	return codebl;
}

public void setCodebl(String codebl) {
	this.codebl = codebl;
}

public String getClient() {
	return client;
}

public void setClient(String client) {
	this.client = client;
}

public String getRm() {
	return rm;
}

public void setRm(String rm) {
	this.rm = rm;
}

public String getDatebl() {
	return datebl;
}

public void setDatebl(String datebl) {
	this.datebl = datebl;
}

public String getNumerocontract() {
	return numerocontract;
}

public void setNumerocontract(String numerocontract) {
	this.numerocontract = numerocontract;
}

public String getDatecontract() {
	return datecontract;
}

public void setDatecontract(String datecontract) {
	this.datecontract = datecontract;
}

public String getNumerobc() {
	return numerobc;
}

public void setNumerobc(String numerobc) {
	this.numerobc = numerobc;
}

public String getDatebc() {
	return datebc;
}

public void setDatebc(String datebc) {
	this.datebc = datebc;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getUnite() {
	return unite;
}

public void setUnite(String unite) {
	this.unite = unite;
}

public String getQuantitecol() {
	return quantitecol;
}

public void setQuantitecol(String quantitecol) {
	this.quantitecol = quantitecol;
}

public String getQuantite() {
	return quantite;
}

public void setQuantite(String quantite) {
	this.quantite = quantite;
}

public String getPuht() {
	return puht;
}

public void setPuht(String puht) {
	this.puht = puht;
}

public String getMontant() {
	return montant;
}

public void setMontant(String montant) {
	this.montant = montant;
}
}
