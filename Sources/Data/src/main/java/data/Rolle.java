package data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rolle {

	@OneToMany(mappedBy = "rolle", cascade = CascadeType.ALL)
	private List<Notifikation> notifikation;

	@Id
	@GeneratedValue
	private int id;

	@Enumerated(EnumType.STRING)
	private RollenTyp rollenTyp;

	@ManyToOne
	@JoinColumn(name="termin_id")
	private Termin auswahl;

	@ManyToOne
	@JoinColumn(name="event_name")
	private Event event;

	@ManyToOne
	@JoinColumn(name="user_name")
	private User user;

	public List<Notifikation> getNotifikation() {
		return notifikation;
	}

	public Rolle(){}

	public Rolle(List<Notifikation> notifikation, RollenTyp rollenTyp, Termin auswahl, Event event, User user){
		this.notifikation = notifikation;
		this.rollenTyp = rollenTyp;
		this.auswahl = auswahl;
		this.event = event;
		this.user = user;
	}

	public void setNotifikation(List<Notifikation> notifikation) {
		this.notifikation = notifikation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Termin getAuswahl() {
		return auswahl;
	}

	public void setAuswahl(Termin auswahl) {
		this.auswahl = auswahl;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
