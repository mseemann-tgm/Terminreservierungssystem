package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Termin")
public class Termin {

	private Date zeitpunkt;

	@Id
	@Column(name="id")
	private int ID;

	private Auswahl[] auswahl;

}
