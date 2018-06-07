package client.view;

import client.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class EventErstellenPanel extends JPanel {
    private Controller c;
    private JLabel name, rolle, termin, kommentar;
    private JTextField nameEingabe, rolleEingabe, terminEinagbe, kommentarEingabe;
    private JButton zurueck, erstellen;


    public EventErstellenPanel(Controller c) {
        this.c = c;
        this.setLayout(new GridLayout(5,2));
        this.name = new JLabel("Eventname: ");
        this.rolle = new JLabel("Rolle: ");
        this.termin = new JLabel("Termin: (dd-MMM-yyyy) ");
        this.kommentar = new JLabel("Kommentar :");
        this.nameEingabe = new JTextField();
        this.rolleEingabe = new JTextField();
        this.terminEinagbe = new JTextField();
        this.kommentarEingabe = new JTextField();
        this.zurueck = new JButton("Zurück");
        this.erstellen = new JButton("Erstellen");



        this.add(this.name);
        this.add(this.nameEingabe);
        this.add(this.rolle);
        this.add(this.rolleEingabe);
        this.add(this.termin);
        this.add(this.terminEinagbe);
        this.add(this.kommentar);
        this.add(this.kommentarEingabe);
        this.add(this.zurueck);
        this.add(this.erstellen);

        this.zurueck.addActionListener(this.c);
        this.erstellen.addActionListener(this.c);

    }

    public boolean zurueckGedrueckt(Object b) {
        if (b == this.zurueck) return true;
        return false;
    }

    public boolean erstellenGedrueckt(Object b) {
        if (b == this.erstellen) return true;
        return false;
    }

    public String getNameEingabe() {
        return nameEingabe.getText();
    }

    public String getRolleEingabe() {
        return rolleEingabe.getText();
    }

    public String getTerminEinagbe() {
        return terminEinagbe.getText();
    }

    public String getKommentarEingabe() {
        return kommentarEingabe.getText();
    }
}


