package client.commands;

import client.commands.Command;
import client.view.EventPanel;

public class GetEventsCommand implements Command {
	private EventPanel ep;

	public GetEventsCommand(EventPanel ep){
		this.ep = ep;
	}

	/**
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		String [] events = {"Marco","Marco","Alex","Armin","Alex","Armin"};
		this.ep.setEventListe(events);
	}

}
