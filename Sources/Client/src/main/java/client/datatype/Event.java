package  client.datatype;

import java.util.ArrayList;

/**
 * Event enthält alle Attribute die ein Event benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public class Event {

	private String name;

	private ArrayList<Rolle> rolle;

	private ArrayList<Termin> termin;

	private ArrayList<Kommentar> kommentar;

	/**
	 * Der Konstruktor für Event speichert alle Übergeben Objekte in Attribute
	 * @param name
	 * @param rolle
	 * @param termin
	 * @param kommentar
	 */
	public Event(String name, ArrayList<Rolle> rolle, ArrayList<Termin> termin, ArrayList<Kommentar> kommentar) {
		this.name = name;
		this.rolle = rolle;
		this.termin = termin;
		this.kommentar = kommentar;
	}

	/**
	 * getName
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getRolle
	 * @return Rolle
	 */
	public ArrayList<Rolle> getRolle() {
		return rolle;
	}

	/**
	 * setRolle
	 * @param rolle
	 */
	public void setRolle(ArrayList<Rolle> rolle) {
		this.rolle = rolle;
	}

	/**
	 * getTermin
	 * @return Termin
	 */
	public ArrayList<Termin> getTermin() {
		return termin;
	}

	/**
	 * setTermin
	 * @param termin
	 */
	public void setTermin(ArrayList<Termin> termin) {
		this.termin = termin;
	}

	/**
	 * getKommentar
	 * @return kommentar
	 */
	public ArrayList<Kommentar> getKommentar() {
		return kommentar;
	}

	/**
	 * setKommentar
	 * @param kommentar
	 */
	public void setKommentar(ArrayList<Kommentar> kommentar) {
		this.kommentar = kommentar;
	}
}
