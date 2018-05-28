package data;

import javax.persistence.*;
import java.util.List;

@Entity
public enum Rolle {
	TEILNEHMER, ORGANISATOR;

	@OneToMany(mappedBy = "rolle", cascade = CascadeType.ALL)
	private List<Notifikation> notifikation;

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
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
