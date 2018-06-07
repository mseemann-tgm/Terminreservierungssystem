package client.commands;

import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Rolle;
import client.datatype.User;
import client.view.RegistrierungPanel;
import client.view.View;

public class RegistrierCommand implements Command {
	private User benutzer;
	private String email;
	private RegistrierungPanel rp;
	private View v;
	private DataObject datao;

	public RegistrierCommand(String username, String passwort, String email, RegistrierungPanel rp, View v){
		this.benutzer = new User(username,passwort, null);
		this.email = email;
		this.rp = rp;
		this.v = v;
		this.datao = new DataObjectMockImp();
		this.datao.register(this.benutzer);
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
