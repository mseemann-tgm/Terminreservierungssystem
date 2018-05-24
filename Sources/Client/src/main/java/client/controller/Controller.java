package client.controller;

import client.commands.Task;
import client.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private LoginPanel lp;
	private RegistrierungPanel rp;
	private BenutzerSuchenPanel bsp;
	private EventPanel ep;
	private View v;

	public Controller(){
		this.lp = new LoginPanel(this);
		this.rp = new RegistrierungPanel(this);
		this.bsp = new BenutzerSuchenPanel();
		this.ep = new EventPanel();
		this.v = new View(this,this.lp, this.rp, this.bsp, this.ep);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.lp.eingabeButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.changeLogin();
		}
		if (this.lp.registrierungButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.changeRegistrierung();
		}
		if (this.rp.eingabeButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.changeLoginReg();
		}
	}

}
