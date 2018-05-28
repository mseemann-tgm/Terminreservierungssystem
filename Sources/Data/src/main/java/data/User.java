package data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
	private String name;

	private String passwort;

	private Rolle[] rolle;

}
