package client.datatype;

public enum Rolle {
	TEILNEHMER, ORGANISATOR;

	private Notifikation[] notifikation;

	private Termin termin;

	public void setNotifikation(Notifikation[] notifikation) {
		this.notifikation = notifikation;
	}

	public void setTermin(Termin termin) {
		this.termin = termin;
	}

	public Notifikation[] getNotifikation() {
		return notifikation;
	}

	public Termin getTermin() {
		return termin;
	}
}
