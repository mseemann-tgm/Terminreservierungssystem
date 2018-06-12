package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Die Klasse EventPanel erzeugt das Eventpanel.
 *
 * @author SEEMANN Manuel, BURIAN Paul
 * @version 2018-06-12
 */

public class EventPanel extends JPanel {
    private JList eventListe;
    private JScrollPane eventListeScroll;
    private JButton eventHinzu;
    private Controller c;
    private static final Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 3);
    private static final Border border2 = new EmptyBorder(10, 10, 10, 10);

    public EventPanel(Controller c) {
        String[] events = {"Keine Events"};
        this.setLayout(new BorderLayout());
        this.eventListe = new JList(events);
        this.eventListeScroll = new JScrollPane(this.eventListe);
        this.eventHinzu = new JButton();
        this.beautifulList(eventListe);
        this.beautifulB(eventHinzu, "Event hinzufügen");


        this.eventListeScroll.setPreferredSize(new Dimension(150, 200));

        this.c = c;

        this.add(this.eventHinzu, BorderLayout.NORTH);
        this.add(this.eventListeScroll, BorderLayout.CENTER);

        this.eventHinzu.addActionListener(c);
    }

    /**
     * @param b
     * @return true or false, true wenn gedrückt, false sonst immer
     */
    public boolean eventHinzuGedrueckt(Object b) {
        if (b == this.eventHinzu) return true;
        return false;
    }

    public void setEventListe(String[] events) {
        this.eventListe.setListData(events);
    }

    /**
     * Die Methode setzt die Eigenschaften der gegebenen Liste,
     * also die Farbe, Schrift und Ränder
     *
     * @param l
     */
    private void beautifulList(JList l) {
        l.setFont(new Font(l.getFont().getName(), 1, 20));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
    }

    /**
     * Die Methode setzt die Eigenschaften des gegebenen Buttons,
     * also die Farbe, Schrift und Ränder
     *
     * @param b
     * @param text
     */
    private void beautifulB(JButton b, String text) {
        b.setText(text);
        b.setFont(new Font(b.getFont().getName(), 0, 25));
        //b.setBackground(new Color(0, 50, 0));
        b.setOpaque(true);
        b.setForeground(new Color(0, 50, 0));
        b.setBorder(new CompoundBorder(border, border2));
    }

}
