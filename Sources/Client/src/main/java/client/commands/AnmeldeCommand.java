package client.commands;

import client.view.LoginPanel;
import client.view.View;

public class AnmeldeCommand implements Command {
	private String benutzer;
	private String passwort;
	private LoginPanel lp;
	private View v;

	public AnmeldeCommand(String benutzer, String passwort, LoginPanel lp, View v){
		this.benutzer = benutzer;
		this.passwort = passwort;
		this.lp = lp;
		this.v = v;
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
