package client.controller;

import client.commands.BenutzerSuchenCommand;
import client.commands.GetEventsCommand;
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
	private ProfilPanel pp;
	private View v;


	public Controller(){
		this.lp = new LoginPanel(this);
		this.rp = new RegistrierungPanel(this);
		this.bsp = new BenutzerSuchenPanel(this);
		this.ep = new EventPanel();
		this.pp = new ProfilPanel(this);
		this.v = new View(this,this.lp, this.rp, this.bsp, this.ep, this.pp);

		Task t = new Task();
		GetEventsCommand com = new GetEventsCommand(this.ep);
		t.setCommand(com);
		t.run();
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
		if (this.rp.zurueckButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.zurueckReg();
		}
		if (this.pp.abmeldenButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.abmelden();
		}
		if (this.bsp.benutzerEingabeButtonGedrueckt((Object) e.getSource()) == true) {
			//BenutzerSuchen aufrufen
			Task t = new Task();
			BenutzerSuchenCommand com = new BenutzerSuchenCommand(this.bsp.getBenutzerEingabe(), this.bsp);
			t.setCommand(com);
			t.run();
		}
	}

}
