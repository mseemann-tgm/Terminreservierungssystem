package client.controller;

import client.commands.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {

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
