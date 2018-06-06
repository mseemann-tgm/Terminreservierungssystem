package client.commands;

import client.view.RegistrierungPanel;
import client.view.View;

public class RegistrierCommand implements Command {
	private String benutzer;
	private String passwort;
	private String email;
	private RegistrierungPanel rp;
	private View v;

	public RegistrierCommand(String benutzer, String passwort, String email, RegistrierungPanel rp, View v){
		this.benutzer = benutzer;
		this.passwort = passwort;
		this.email = email;
		this.rp = rp;
		this.v = v;
	}
	/**
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		this.v.changeLoginReg();
	}

}
