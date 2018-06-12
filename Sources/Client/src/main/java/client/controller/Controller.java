package client.controller;

import client.commands.*;
import client.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller steuert den Client und verbindet View, Panel, Command und Model
 * @author SEEMANN Manuel
 * @version 2018-05-23
 */
public class Controller implements ActionListener{
	private LoginPanel lp;
	private RegistrierungPanel rp;
	private BenutzerSuchenPanel bsp;
	private EventPanel ep;
	private ProfilPanel pp;
	private EventErstellenPanel eep;
	private View v;
	private Model m;

	/**
	 * Der Konstruktor Controller erstellt alle Panels und Gettet die aktuellen Events
	 */
	public Controller(){
		this.lp = new LoginPanel(this);
		this.rp = new RegistrierungPanel(this);
		this.bsp = new BenutzerSuchenPanel(this);
		this.ep = new EventPanel(this);
		this.pp = new ProfilPanel(this);
		this.eep = new EventErstellenPanel(this);
		this.m = new Model();
		this.v = new View(this,this.lp, this.rp, this.bsp, this.ep, this.pp, this.eep);

		Task t = new Task();
		GetEventsCommand com = new GetEventsCommand(this.ep);
		t.setCommand(com);
		t.run();
	}

	/**
	 * actionPreformed ruft nach einem Button Klick die gewünschten MEthoden auf
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.lp.eingabeButtonGedrueckt((Object) e.getSource()) == true) {
			Task t = new Task();
			AnmeldeCommand com = new AnmeldeCommand(this.lp.getBenutzerEingabe(), this.lp.getPasswortEingabe(), this.lp, this.v);
			t.setCommand(com);
			t.run();
		}
		if (this.lp.registrierungButtonGedrueckt((Object) e.getSource()) == true) {
			this.v.changeRegistrierung();
		}
		if (this.rp.eingabeButtonGedrueckt((Object) e.getSource()) == true) {
			Task t = new Task();
			RegistrierCommand com = new RegistrierCommand(this.rp.getBenutzerEingabe(), this.rp.getPasswortEingabe(), this.rp.getEmailEingabe(), this.rp, this.v);
			t.setCommand(com);
			t.run();
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
		if (this.ep.eventHinzuGedrueckt((Object) e.getSource()) == true) {
			this.v.eventErstellen();
		}
		if (this.eep.zurueckGedrueckt((Object) e.getSource()) == true) {
			this.v.zurueckEventErstellen();
		}
		if (this.eep.erstellenGedrueckt((Object) e.getSource()) == true) {
			Task t = new Task();
			EventErstellenCommand com = new EventErstellenCommand(this.eep.getNameEingabe(), this.eep.getRolleEingabe(), this.m.dateErstellen(this.eep.getTerminEinagbe()), this.eep.getKommentarEingabe(),this.eep, this.v);
			t.setCommand(com);
			t.run();
		}
	}

}
