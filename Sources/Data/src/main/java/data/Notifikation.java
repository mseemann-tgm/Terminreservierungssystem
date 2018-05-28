package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notifikation {

	@Id
	@GeneratedValue
    private int id;

	private String text;

	public Notifikation(String text) {

	}

}
