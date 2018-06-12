package client.commands;

import client.view.BenutzerSuchenPanel;

import java.util.Arrays;
/**
 * BenutzerSuchenCommand wird ein DataObject erstellen und übergibt den geuschten Benutzer
 * @author SEEEMANN Manuel, Koiner Oskar
 * @version 2018-04-25
 */
public class BenutzerSuchenCommand implements Command {
	private String eingabe;
	private BenutzerSuchenPanel bsp;

	/**
	 * Der Konstruktor BenutzerSuchenCommand speichert die Eingabe und das Panel in die Attribute
	 * @param eingabe
	 * @param bsp
	 */
	public BenutzerSuchenCommand(String eingabe, BenutzerSuchenPanel bsp){
		this.eingabe = eingabe;
		this.bsp = bsp;

	}
	/**
	 * Hier wird ein Test Array sortiert und zurück geben, außerdem die View geändert
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
