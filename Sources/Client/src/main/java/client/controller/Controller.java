package client.controller;

import client.commands.Task;
import client.view.View;

public class Controller {

	private View v;

	public Controller(){
		this.v = new View(this);
	}

}
