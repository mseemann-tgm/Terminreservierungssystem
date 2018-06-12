package client.datatype;

/**
 * Rolle enthält alle Attribute die ein Rolle benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public enum Rolle {
	TEILNEHMER, ORGANISATOR;

	private Notifikation[] notifikation;

	private Termin termin;

	/**
	 * setNotifikaton
	 * @param notifikation
	 */
	public void setNotifikation(Notifikation[] notifikation) {
		this.notifikation = notifikation;
	}

	/**
	 * setTermin
	 * @param termin
	 */
	public void setTermin(Termin termin) {
		this.termin = termin;
	}

	/**
	 * getNotifkation
	 * @return Notifikation []
	 */
	public Notifikation[] getNotifikation() {
		return notifikation;
	}

	/**
	 * getTermin
	 * @return Termin
	 */
	public Termin getTermin() {
		return termin;
	}
}
