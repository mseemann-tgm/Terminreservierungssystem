package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
	@GeneratedValue
	private int ID;

	private String name;

	private String passwort;

	@OneToMany(mappedBy = "user")
	private List<Rolle> rolle;

	public User(){}

	public User (String name, String passwort, List<Rolle> rolle){
		this.name = name;
		this.passwort = passwort;
		this.rolle = rolle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public List<Rolle> getRolle() {
		return rolle;
	}

	public void setRolle(List<Rolle> rolle) {
		this.rolle = rolle;
	}
}
