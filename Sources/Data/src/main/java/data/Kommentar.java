package data;


import javax.persistence.*;

@Entity
public class Kommentar {

    @Id
    @GeneratedValue
	private int ID;

    @ManyToOne
    @JoinColumn(name="event_name")
	private Event event;

	private String text;

	public Kommentar(){}

	public Kommentar(Event event, String text){
	    this.event = event;
	    this.text = text;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
