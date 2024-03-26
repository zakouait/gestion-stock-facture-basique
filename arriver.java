package projetstage2;

public class arriver {
private String Designation,Origine,DateArriver,Unite;
private int quantite;
private String  Dateperemption,numerofacture,numerodelot,observation;
private String lieux;
public arriver(String designation, String origine, String dateArriver, String unite, int quantite,
		String dateperemption, String numerofacture, String numerodelot, String observation,
		String lieux		) {
	super();
	Designation = designation;
	Origine = origine;
	DateArriver = dateArriver;
	Unite = unite;
	this.quantite = quantite;
	Dateperemption = dateperemption;
	this.numerofacture = numerofacture;
	this.numerodelot = numerodelot;
	this.observation = observation;
	this.lieux=lieux;
}
public String getLieux() {
	return lieux;
}
public void setLieux(String lieux) {
	this.lieux = lieux;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getOrigine() {
	return Origine;
}
public void setOrigine(String origine) {
	Origine = origine;
}
public String getDateArriver() {
	return DateArriver;
}
public void setDateArriver(String dateArriver) {
	DateArriver = dateArriver;
}
public String getUnite() {
	return Unite;
}
public void setUnite(String unite) {
	Unite = unite;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getDateperemption() {
	return Dateperemption;
}
public void setDateperemption(String dateperemption) {
	Dateperemption = dateperemption;
}
public String getNumerofacture() {
	return numerofacture;
}
public void setNumerofacture(String numerofacture) {
	this.numerofacture = numerofacture;
}
public String getNumerodelot() {
	return numerodelot;
}
public void setNumerodelot(String numerodelot) {
	this.numerodelot = numerodelot;
}
public String getObservation() {
	return observation;
}
public void setObservation(String observation) {
	this.observation = observation;
}

}
