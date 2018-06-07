package client.datatype;


public class User {

	private String username;

	private String passwort;

	private Rolle[] rolle;

	public User(String username, String passwort, Rolle [] rolle){
	    this.username = username;
        this.passwort = passwort;
        this.rolle = rolle;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public void setRolle(Rolle[] rolle) {
		this.rolle = rolle;
	}

	public String getUsername() {
		return username;
	}

	public String getPasswort() {
		return passwort;
	}

	public Rolle[] getRolle() {
		return rolle;
	}
}
