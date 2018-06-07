package client.commands;

import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Benutzer;
import client.view.LoginPanel;
import client.view.View;

public class AnmeldeCommand implements Command {
	private Benutzer benutzer;
	private LoginPanel lp;
	private View v;
	private DataObject datao;

	public AnmeldeCommand(String username, String passwort, LoginPanel lp, View v){
		this.benutzer = new Benutzer(username,passwort);
		this.lp = lp;
		this.v = v;
		this.datao = new DataObjectMockImp();
		this.datao.login(this.benutzer);
	}

	/**
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		this.v.changeLogin();
	}

}
