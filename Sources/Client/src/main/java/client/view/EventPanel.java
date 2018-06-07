package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

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
        this.eventHinzu = new JButton("Event hinzufügen");
        this.beautifulList(eventListe);
        this.eventListeScroll.setPreferredSize(new Dimension(150, 200));
        this.c = c;

        this.add(this.eventListeScroll, BorderLayout.CENTER);
        this.add(this.eventHinzu,BorderLayout.NORTH);

        this.eventHinzu.addActionListener(c);
    }

    public boolean eventHinzuGedrueckt(Object b) {
        if (b == this.eventHinzu) return true;
        return false;
    }

    public void setEventListe(String[] events) {
        this.eventListe.setListData(events);
    }
    private void beautifulList(JList l) {
        l.setFont(new Font(l.getFont().getName(), 1, 20));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
    }
}
