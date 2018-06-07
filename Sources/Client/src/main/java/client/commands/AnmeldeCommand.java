package client.commands;

import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Rolle;
import client.datatype.User;
import client.view.LoginPanel;
import client.view.View;

public class AnmeldeCommand implements Command {
	private User benutzer;
	private LoginPanel lp;
	private View v;
	private DataObject datao;

	public AnmeldeCommand(String username, String passwort, LoginPanel lp, View v){
		this.benutzer = new User(username,passwort,null);
		this.lp = lp;
		this.v = v;
		this.datao = new DataObjectMockImp();

	}

	/**
	 * @see Command#execute()
	 * 
	 *  
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
