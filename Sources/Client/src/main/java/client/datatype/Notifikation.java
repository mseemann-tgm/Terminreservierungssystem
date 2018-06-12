package client.datatype;

/**
 * Notifikation enthält alle Attribute die ein Notifikation benötigt
 * @author SEEEMANN Manuel
 * @version 2018-06-07
 */
public class Notifikation {

	private String text;

	/**
	 * Der Konstruktor für Notifikation speichert alle Übergeben Objekte in Attribute
	 * @param text
	 */
	public Notifikation(String text) {
		this.text = text;
	}

	/**
	 * getText
	 * @return Text
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
