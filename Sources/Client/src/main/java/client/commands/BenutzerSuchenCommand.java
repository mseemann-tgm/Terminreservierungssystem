package client.commands;

import client.view.BenutzerSuchenPanel;

public class BenutzerSuchenCommand implements Command {
	private String eingabe;
	private BenutzerSuchenPanel bsp;
	public BenutzerSuchenCommand(String eingabe, BenutzerSuchenPanel bsp){
		this.eingabe = eingabe;
		this.bsp = bsp;

	}
	/**
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		String [] benutzerGesucht = {"Marco","Marco","Alex","Armin","Alex","Armin"};
		this.bsp.setBenutzerListe(benutzerGesucht);
	}

}
