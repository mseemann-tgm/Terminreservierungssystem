package client.controller;

import client.commands.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Die Klasse Model erstellt ein Date Object der Eingabe
 * @author SEEMANN Manuel
 * @version 2018-06-07
 */
public class Model {

	/**
	 * dateErstellen erstellt ein Date Object der Eingabe
	 * @param eingabe
	 * @return Date Object
	 */
	public Date dateErstellen(String eingabe){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2 = null;
		try {
			//Parsing the String
			date2 = dateFormat.parse(eingabe);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date2;
	}

}
