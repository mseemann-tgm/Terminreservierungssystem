package  client.datatype;

public class Kommentar {

	private int ID;

	private String text;

	public Kommentar(int ID, String text) {
		this.ID = ID;
		this.text = text;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
