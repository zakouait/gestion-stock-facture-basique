package projetstage2;

public class Utilisateur {
private String user,mdp,type;

public Utilisateur(String user, String mdp, String type) {
	super();
	this.user = user;
	this.mdp = mdp;
	this.type = type;
}

public Utilisateur() {
	super();
	user=null;
	mdp=null;
	type=null;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String get() {
	return type;
}

public void setType(String type) {
	this.type = type;
}


}
