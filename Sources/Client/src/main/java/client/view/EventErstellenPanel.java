package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Die Klasse EventErstellenPanel erzeugt das Eventerstellenpanel.
 *
 * @author SEEMANN Manuel, BURIAN Paul
 * @version 2018-06-12
 */

public class EventErstellenPanel extends JPanel {
    private Controller c;
    private JLabel name, rolle, termin, kommentar, main;
    private JTextField nameEingabe, rolleEingabe, terminEinagbe, kommentarEingabe;
    private JButton zurueck, erstellen;
    private Container con1, con2, con3;
    private static final Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 3);
    private static final Border border2 = new EmptyBorder(10, 10, 10, 10);


    /**
     * Der Konstruktor des Eventerstellenpanels
     *
     * @param c
     */
    public EventErstellenPanel(Controller c) {
        this.c = c;
        this.setLayout(new GridLayout(4, 1));
        this.main = new JLabel();
        this.name = new JLabel();
        this.rolle = new JLabel();
        this.termin = new JLabel();
        this.kommentar = new JLabel();
        this.nameEingabe = new JTextField();
        this.rolleEingabe = new JTextField();
        this.terminEinagbe = new JTextField();
        this.kommentarEingabe = new JTextField();
        this.zurueck = new JButton();
        this.erstellen = new JButton();


        //North Start
        this.main = new JLabel();
        this.beautifulL(main, "Event Erstellen");
        this.add(main);
        //North End

        //Center Start
        this.con1 = new Container();
        this.con1.setLayout(new GridLayout(2, 2));

        this.beautifulL(name, "Eventname:", con1);
        this.beautifulTF(nameEingabe, con1);

        this.beautifulL(rolle, "Rolle: ", con1);
        this.beautifulTF(rolleEingabe, con1);

        this.con2 = new Container();
        this.con2.setLayout(new GridLayout(2, 2));

        this.beautifulL(termin, "Termin: (dd-MMM-yyyy) ", con2);
        this.beautifulTF(terminEinagbe, con2);

        this.beautifulL(kommentar, "Kommentar :", con2);
        this.beautifulTF(kommentarEingabe, con2);
        //Center End


        //South Start
        this.con3 = new Container();
        this.con3.setLayout(new GridLayout(2, 0));

        this.beautifulB(zurueck, "Zurück", con3);

        this.beautifulB(erstellen, "Erstellen", con3);
        //South End

        this.add(con1);
        this.add(con2);
        this.add(con3);

        this.zurueck.addActionListener(this.c);
        this.erstellen.addActionListener(this.c);

    }

    /**
     * @param b
     * @return true or false, true wenn gedrückt, false sonst immer
     */
    public boolean zurueckGedrueckt(Object b) {
        if (b == this.zurueck) return true;
        return false;
    }

    /**
     * @param b
     * @return true or false, true wenn gedrückt, false sonst immer
     */
    public boolean erstellenGedrueckt(Object b) {
        if (b == this.erstellen) return true;
        return false;
    }

    /**
     * Die Methode setzt die Eigenschaften des gegebenen Buttons,
     * also die Farbe, Schrift, Ränder und setzt es in einen Container
     *
     * @param b
     * @param text
     * @param con
     */
    private void beautifulB(JButton b, String text, Container con) {
        b.setText(text);
        b.setFont(new Font(b.getFont().getName(), 0, 25));
        //b.setBackground(new Color(0, 50, 0));
        b.setOpaque(true);
        b.setForeground(new Color(0, 50, 0));
        b.setBorder(new CompoundBorder(border, border2));
        con.add(b);
    }

    /**
     * Die Methode setzt die Eigenschaften des gegebenen Textfields,
     * also die Farbe, Schrift, Ränder und setzt es in einen Container
     *
     * @param tf
     * @param con
     */
    private void beautifulTF(JTextField tf, Container con) {
        tf.setFont(new Font(tf.getFont().getName(), 0, 20));
        tf.setBackground(new Color(0, 50, 0));
        tf.setOpaque(true);
        tf.setForeground(Color.white);
        tf.setBorder(new CompoundBorder(border, border2));
        con.add(tf);
    }

    /**
     * Die Methode setzt die Eigenschaften des gegebenen Labels,
     * also die Farbe, Schrift und Ränder
     *
     * @param l
     * @param text
     * @param con
     */
    private void beautifulL(JLabel l, String text, Container con) {
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 25));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        con.add(l);
    }

    /**
     * Die Methode setzt die Eigenschaften des gegebenen Labels,
     * also die Farbe, Schrift und Ränder
     *
     * @param l
     * @param text
     */
    private void beautifulL(JLabel l, String text) {
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 25));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
    }

    /**
     * GETTER
     */
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


