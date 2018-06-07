package client.commands;

import client.commands.Command;
import client.dataconnection.DataObject;
import client.dataconnection.DataObjectMockImp;
import client.datatype.Event;
import client.datatype.Kommentar;
import client.datatype.Rolle;
import client.datatype.Termin;
import client.view.EventErstellenPanel;
import client.view.View;

import java.util.ArrayList;
import java.util.Date;

public class EventErstellenCommand implements Command {
	private Event event;
	private EventErstellenPanel eep;
	private View v;
	private DataObject datao;

	private ArrayList<Rolle> rolle;

	public EventErstellenCommand(String name, String rolle, Date termin, String kommentar, EventErstellenPanel eep, View v){
		this.eep = eep;
		this.v = v;
		//Rolle erstellen ???
		ArrayList<Termin> t = new ArrayList<Termin>();
		t.add(new Termin(termin, 1)); //ID muss noch gemacht werden
		ArrayList<Kommentar> k = new ArrayList<Kommentar>();
		k.add(new Kommentar(1,kommentar)); //ID muss noch gemacht werden

		this.event = new Event(name, null, t,k);

		this.datao = new DataObjectMockImp();
	}

	/**
	 * @see Command#execute()
	 * 
	 *  
	 */
	public void execute() {
		boolean loginOk = this.datao.eventErstellen(this.event);
		if(loginOk == true) {
			this.v.zurueckEventErstellen();
		}else{
			System.out.println("Kein User vorhanden");
		}
	}

}
