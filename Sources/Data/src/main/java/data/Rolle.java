package data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public enum Rolle {
	TEILNEHMER, ORGANISATOR;

	private Notifikation[] notifikation;

	@ManyToOne
	private Termin auswahl;

	@ManyToOne
	private Event event;

	@ManyToOne
	private User user;

}
