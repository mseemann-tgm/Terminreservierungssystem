package data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
public class Event {

	@Id
	@GeneratedValue
	int ID = 0;

	private String name;

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	private List<Rolle> rolle;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	private List<Termin> termin;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	private List<Kommentar> kommentar;

	public Event(){}

	public Event(String name, List<Rolle> rolle, List<Termin> termin, List<Kommentar>kommentar){
		this.name = name;
		this.rolle = rolle;
		this.termin = termin;
		this.kommentar = kommentar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rolle> getRolle() {
		return rolle;
	}

	public void setRolle(List<Rolle> rolle) {
		this.rolle = rolle;
	}

	public List<Termin> getTermin() {
		return termin;
	}

	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}

	public List<Kommentar> getKommentar() {
		return kommentar;
	}

	public void setKommentar(List<Kommentar> kommentar) {
		this.kommentar = kommentar;
	}

}
