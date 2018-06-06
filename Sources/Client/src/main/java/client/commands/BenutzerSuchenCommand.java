package client.commands;

import client.view.BenutzerSuchenPanel;

import java.util.Arrays;

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
		String [] returnServer = {"D","B","C","X","A","E"};
		Arrays.sort(returnServer);
		String [] benutzerGesucht = {"Marco","Marco","Alex","Armin","Alex","Armin"};
		this.bsp.setBenutzerListe(returnServer);
	}

}
