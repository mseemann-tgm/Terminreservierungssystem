package  client.datatype;

/**
 * Kommentar enthält alle Attribute die ein Kommentar benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public class Kommentar {

	private int ID;

	private String text;

	/**
	 * Der Konstruktor für Kommentar speichert alle Übergeben Objekte in Attribute
	 * @param ID
	 * @param text
	 */
	public Kommentar(int ID, String text) {
		this.ID = ID;
		this.text = text;
	}

	/**
	 * getId
	 * @return Id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * setId
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * getText
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * setText
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
}
