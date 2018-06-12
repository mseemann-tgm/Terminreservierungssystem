package client.commands;

import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Rolle;
import client.datatype.User;
import client.view.RegistrierungPanel;
import client.view.View;

/**
 * RegistrrierCommand übergibt die RegireirungsDaten
 * @author SEEEMANN Manuel, Koiner Oskar
 * @version 2018-04-25
 */
public class RegistrierCommand implements Command {
	private User benutzer;
	private String email;
	private RegistrierungPanel rp;
	private View v;
	private DataObject datao;

	/**
	 * Der Konstruktor RegistrieRCommand speichert alle übergeben Daten in die Attribute
	 * @param username
	 * @param passwort
	 * @param email
	 * @param rp
	 * @param v
	 */
	public RegistrierCommand(String username, String passwort, String email, RegistrierungPanel rp, View v){
		this.benutzer = new User(username,passwort, null);
		this.email = email;
		this.rp = rp;
		this.v = v;
		this.datao = new DataObjectMockImp();
	}
	/**
	 * Führt die Regiriterung aus
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		boolean loginOk = this.datao.register(this.benutzer);
		if(loginOk == true) {
			this.v.changeLoginReg();
		}else{
			System.out.println("Kein User vorhanden");
		}

	}

}
