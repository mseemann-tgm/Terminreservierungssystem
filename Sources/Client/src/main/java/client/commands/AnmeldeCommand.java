package client.commands;

import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Rolle;
import client.datatype.User;
import client.view.LoginPanel;
import client.view.View;

/**
 * Die Klasse AnmeldeCommand erstellt ein DataObject und übergibt die Benutzereingabe
 * @author Manuel Seemann
 * @version 2018-05-30
 *
 */
public class AnmeldeCommand implements Command {
	private User benutzer;
	private LoginPanel lp;
	private View v;
	private DataObject datao;

    /**
     * Der AnmeldeCommand Konstruktor speichert die Daten in die Attribute
     * @param username
     * @param passwort
     * @param lp
     * @param v
     */
	public AnmeldeCommand(String username, String passwort, LoginPanel lp, View v){
		this.benutzer = new User(username,passwort,null);
		this.lp = lp;
		this.v = v;
		this.datao = new DataObjectMockImp();

	}

	/**
     * führt die Login Methode vom DataObject aus und übergibt die Daten und ändert die View
     *@see Command#execute()
	 */
	public void execute() {
		boolean loginOk = this.datao.login(this.benutzer);
		if(loginOk == true) {
			this.v.changeLogin();
		}else{
			System.out.println("Kein User vorhanden");
		}
	}

}
