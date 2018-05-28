package data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kommentar {

    @Id
	private int ID;

	private String text;

}
