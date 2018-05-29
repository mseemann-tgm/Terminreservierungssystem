package data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Termin {

    @Temporal(TemporalType.TIMESTAMP)
    private Date zeitpunkt;

    @Id
    private int ID;

    @ManyToOne
    @JoinColumn(name="event_name")
    private Event event;

    public Termin() {
    }

    public Termin(int ID) {
        this.ID = ID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    public Date getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(Date zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
