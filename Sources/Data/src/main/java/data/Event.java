package data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Map;

@Entity
public class Event {

    @Id
	private String name;

	private Rolle[] rolle;

    @OneToMany
	private Termin[] termin;

    @OneToMany
	private Kommentar[] kommentar;

}
