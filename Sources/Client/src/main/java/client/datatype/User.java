package client.datatype;


import java.util.ArrayList;
/**
 * User enthält alle Attribute die ein User benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public class User {

	private String username;

	private String passwort;

	private ArrayList<Rolle> rolle;

	/**
	 * Der Konstruktor für User speichert alle Übergeben Objekte in Attribute
	 * @param username
	 * @param passwort
	 * @param rolle
	 */
	public User(String username, String passwort, ArrayList <Rolle> rolle){
	    this.username = username;
        this.passwort = passwort;
		if(rolle == null){
			this.rolle = new ArrayList<Rolle>();
		}else{
        	this.rolle = rolle;
		}
	}

	/**
	 * setUsername
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * setPasswort
	 * @param passwort
	 */
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	/**
	 * setRolle
	 * @param rolle
	 */
	public void setRolle(ArrayList<Rolle> rolle) {
		this.rolle = rolle;
	}

	/**
	 * getUsername
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * getPasswort
	 * @return passwort
	 */
	public String getPasswort() {
		return passwort;
	}

	/**
	 * getRolle
	 * @return Rolle
	 */
	public ArrayList<Rolle> getRolle() {
		return rolle;
	}
}
