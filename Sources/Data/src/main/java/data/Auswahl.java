package data;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Auswahl")
public class Auswahl {


	private Teilnehmer benutzer;

	private Termin termin;

}
