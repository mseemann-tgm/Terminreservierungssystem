package client.commands;

import client.commands.Command;
import client.view.EventPanel;
/**
 * GetEventCommand gibt die Events zurück
 * @author SEEEMANN Manuel, Koiner Oskar
 * @version 2018-04-25
 */

public class GetEventsCommand implements Command {
	private EventPanel ep;

	/**
	 * Der Konstruktor GetEventsCommand speichert das nötige Panel
	 * @param ep
	 */
	public GetEventsCommand(EventPanel ep){
		this.ep = ep;
	}

	/**
	 * Es werden Events in die Lsite geschrieben
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		String [] events = {"Meeting1","Meeting2","Meeting3","Meeting4","Meeting5","Meeting6","Meeting7","Meeting8","Meeting9","Meeting10","Meeting11","Meeting12"};
		this.ep.setEventListe(events);
	}

}
