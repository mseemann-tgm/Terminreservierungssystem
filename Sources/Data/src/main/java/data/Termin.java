package data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Termin {

    @Temporal(TemporalType.TIMESTAMP)
	private Date zeitpunkt;

	@Id
	private int ID;
}
