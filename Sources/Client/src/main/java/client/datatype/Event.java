package  client.datatype;

import java.util.ArrayList;

public class Event {

	private String name;

	private ArrayList<Rolle> rolle;

	private ArrayList<Termin> termin;

	private ArrayList<Kommentar> kommentar;

	public Event(String name, ArrayList<Rolle> rolle, ArrayList<Termin> termin, ArrayList<Kommentar> kommentar) {
		this.name = name;
		this.rolle = rolle;
		this.termin = termin;
		this.kommentar = kommentar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Rolle> getRolle() {
		return rolle;
	}

	public void setRolle(ArrayList<Rolle> rolle) {
		this.rolle = rolle;
	}

	public ArrayList<Termin> getTermin() {
		return termin;
	}

	public void setTermin(ArrayList<Termin> termin) {
		this.termin = termin;
	}

	public ArrayList<Kommentar> getKommentar() {
		return kommentar;
	}

	public void setKommentar(ArrayList<Kommentar> kommentar) {
		this.kommentar = kommentar;
	}
}
