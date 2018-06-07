package client.datatype;


import java.util.ArrayList;

public class User {

	private String username;

	private String passwort;

	private ArrayList<Rolle> rolle;

	public User(String username, String passwort, ArrayList <Rolle> rolle){
	    this.username = username;
        this.passwort = passwort;
		if(rolle == null){
			this.rolle = new ArrayList<Rolle>();
		}else{
        	this.rolle = rolle;
		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public void setRolle(ArrayList<Rolle> rolle) {
		this.rolle = rolle;
	}

	public String getUsername() {
		return username;
	}

	public String getPasswort() {
		return passwort;
	}

	public ArrayList<Rolle> getRolle() {
		return rolle;
	}
}
