package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Die Klasse ProfilPanel erzeugt das Profilpanel.
 *
 * @author SEEMANN Manuel, BURIAN Paul
 * @version 2018-06-12
 */

public class ProfilPanel extends JPanel {
    private Controller c;
    private JButton abmeldenButton;
    private Container con1;
    private JLabel blank;
    private static final Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 3);
    private static final Border border2 = new EmptyBorder(10, 10, 10, 10);

    /**
     * Der Konstruktor des Profilpanels
     *
     * @param c
     */
    public ProfilPanel(Controller c) {
        this.c = c;
        this.abmeldenButton = new JButton();
        this.con1 = new Container();
        this.blank = new JLabel();
        this.blank.setPreferredSize(new Dimension(100, 360));
        this.con1.setLayout(new BorderLayout());

        this.beautifulB(abmeldenButton, "Abmelden");
        this.con1.add(blank, BorderLayout.CENTER);
        this.con1.add(abmeldenButton, BorderLayout.SOUTH);
        this.add(con1);

        this.abmeldenButton.addActionListener(c);
    }

    /**
     * @param b
     * @return true or false, true wenn gedrückt, false sonst immer
     */
    public boolean abmeldenButtonGedrueckt(Object b) {
        if (b == this.abmeldenButton) return true;
        return false;
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
