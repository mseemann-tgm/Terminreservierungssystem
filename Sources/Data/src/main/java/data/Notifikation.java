package data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Notifikation {

	@Id
	@GeneratedValue
    private int id;

	private String text;

	@ManyToOne
	@JoinColumn(name="rolle_id")
	private Rolle rolle;

	public Notifikation(){}

	public Notifikation(String text, Rolle rolle){
		this.text = text;
		this.rolle = rolle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Rolle getRolle() {
		return rolle;
	}

	public void setRolle(Rolle rolle) {
		this.rolle = rolle;
	}
}
