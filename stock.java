package projetstage2;

public class stock {
private String designation,unite;
private int quantite;
String lieux;
public stock() {
	designation=null;
	unite=null;
	quantite=0;
}
public stock(String designation, String unite, int quantite,String lieux) {
	super();
	this.designation = designation;
	this.unite = unite;
	this.quantite = quantite;
	this.lieux=lieux;
}
public String getLieux() {
	return lieux;
}
public void setLieux(String lieux) {
	this.lieux = lieux;
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
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}

}
