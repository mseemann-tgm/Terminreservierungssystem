package  client.datatype;

public class Event {

	private String name;

	private Rolle[] rolle;

	private Termin[] termin;

	private Kommentar[] kommentar;

	public Event(String name, Rolle[] rolle, Termin[] termin, Kommentar[] kommentar) {
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

	public Rolle[] getRolle() {
		return rolle;
	}

	public void setRolle(Rolle[] rolle) {
		this.rolle = rolle;
	}

	public Termin[] getTermin() {
		return termin;
	}

	public void setTermin(Termin[] termin) {
		this.termin = termin;
	}

	public Kommentar[] getKommentar() {
		return kommentar;
	}

	public void setKommentar(Kommentar[] kommentar) {
		this.kommentar = kommentar;
	}
}
