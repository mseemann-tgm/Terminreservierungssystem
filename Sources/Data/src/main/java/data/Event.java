package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Map;

@Entity
@Table(name = "Event")
public class Event {

	@Id
    @Column(name = "name", nullable = false)
    private String name;

	private Map<Teilnehmer,Termin> auswahl;

	private Rolle[] rolle;

	private Termin[] termin;

	private Kommentar[] kommentar;

}
