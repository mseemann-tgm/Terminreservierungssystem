package  client.datatype;

public class Termin {

	private Date zeitpunkt;

	private int ID;

	public Termin(Date zeitpunkt, int ID) {
		this.zeitpunkt = zeitpunkt;
		this.ID = ID;
	}

	public void setZeitpunkt(Date zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Date getZeitpunkt() {
		return zeitpunkt;
	}

	public int getID() {
		return ID;
	}
}
