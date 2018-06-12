package  client.datatype;

import java.util.Date;

/**
 * Termin enthält alle Attribute die ein Termin benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public class Termin {

	private Date zeitpunkt;

	private int ID;

	/**
	 * Der Konstruktor für Termin speichert alle Übergeben Objekte in Attribute
	 * @param zeitpunkt
	 * @param ID
	 */
	public Termin(Date zeitpunkt, int ID) {
		this.zeitpunkt = zeitpunkt;
		this.ID = ID;
	}

	/**
	 * setZeitpunkt
	 * @param zeitpunkt
	 */
	public void setZeitpunkt(Date zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	/**
	 *setId
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * getZeitpunkt
	 * @return
	 */
	public Date getZeitpunkt() {
		return zeitpunkt;
	}

	/**
	 * getID
	 * @return
	 */
	public int getID() {
		return ID;
	}
}
