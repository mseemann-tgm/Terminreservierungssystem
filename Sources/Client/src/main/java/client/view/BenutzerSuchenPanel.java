package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class BenutzerSuchenPanel extends JPanel {
    private Controller c;
    private JLabel benutzerEingabeText;
    private JTextField benutzerEingabe;
    private JButton benutzerEingabeButton;
    private JList benutzerListe;
    private JScrollPane benutzerListeScroll;
    private JPanel eingabePanel;
    private Container con1, con2;
    private static final Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 3);
    private static final Border border2 = new EmptyBorder(10, 10, 10, 10);

    public BenutzerSuchenPanel(Controller c) {
        this.c = c;
        this.setLayout(new BorderLayout());
        this.benutzerEingabeText = new JLabel();
        this.benutzerEingabe = new JTextField();
        this.benutzerEingabeButton = new JButton();
        this.benutzerListe = new JList();
        this.eingabePanel = new JPanel();
        this.eingabePanel.setLayout(new FlowLayout());
        this.con1 = new Container();
        this.con1.setLayout(new BorderLayout());
        this.con2 = new Container();
        this.con2.setLayout(new FlowLayout());


        this.benutzerListeScroll = new JScrollPane(this.benutzerListe);
        this.benutzerListeScroll.setPreferredSize(new Dimension(250, 300));

        this.beautifulB(benutzerEingabeButton, "Suchen");
        this.beautifulL(benutzerEingabeText, "Benutzername:");
        this.beautifulTF(benutzerEingabe);
        this.beautifulList(benutzerListe);

        this.con1.add(this.benutzerEingabeText, BorderLayout.NORTH);
        this.con1.add(this.benutzerEingabe, BorderLayout.CENTER);
        this.con1.add(this.benutzerEingabeButton, BorderLayout.EAST);
        this.add(con1, BorderLayout.NORTH);

        this.con2.add(this.benutzerListeScroll, BorderLayout.CENTER);
        this.add(con2);

        this.benutzerEingabeButton.addActionListener(c);


    }

    public boolean benutzerEingabeButtonGedrueckt(Object b) {
        if (b == this.benutzerEingabeButton) return true;
        return false;
    }

    public String getBenutzerEingabe() {
        return this.benutzerEingabe.getText();
    }

    public void setBenutzerListe(String[] benutzerGesucht) {
        this.benutzerListe.setListData(benutzerGesucht);
    }

    private void beautifulB(JButton b, String text) {
        b.setText(text);
        b.setFont(new Font(b.getFont().getName(), 0, 25));
        //b.setBackground(new Color(0, 50, 0));
        b.setOpaque(true);
        b.setForeground(new Color(0, 50, 0));
        b.setBorder(new CompoundBorder(border, border2));
    }

    private void beautifulTF(JTextField tf) {
        tf.setFont(new Font(tf.getFont().getName(), 0, 25));
        tf.setBackground(new Color(0, 50, 0));
        tf.setOpaque(true);
        tf.setForeground(Color.white);
        tf.setBorder(new CompoundBorder(border, border2));
    }

    private void beautifulL(JLabel l, String text) {
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 30));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void beautifulList(JList l) {
        l.setFont(new Font(l.getFont().getName(), 1, 20));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border, border2));
    }
}
