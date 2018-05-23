package client.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BenutzerSuchenPanel extends JPanel {
    private JLabel benutzerEingabeText;
    private  JTextField benutzerEingabe;
    private JButton benutzerEingabeButton;
    private JList benutzerListe;
    private JScrollPane benutzerListeScroll;
    private JPanel eingabePanel;

    public BenutzerSuchenPanel(){
        String [] data = {"Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin"};
        this.setLayout(new GridLayout(2,3));
        this.benutzerEingabeText = new JLabel("Benutzername: ");
        this.benutzerEingabe = new JTextField();
        this.benutzerEingabeButton = new JButton("Suchen");
        this.benutzerListe = new JList(data);
        this.eingabePanel = new JPanel();
        this.eingabePanel.setLayout(new FlowLayout());
        this.benutzerEingabe.setPreferredSize(new Dimension(90,25));


        this.benutzerListe.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.benutzerListe.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        this.benutzerListe.setVisibleRowCount(-1);

        this.benutzerListeScroll = new JScrollPane(this.benutzerListe);
        this.benutzerListeScroll.setPreferredSize(new Dimension(250, 80));


        this.add(this.eingabePanel);
        this.eingabePanel.add(this.benutzerEingabeText);
        this.eingabePanel.add(this.benutzerEingabe);
        this.eingabePanel.add(this.benutzerEingabeButton);
        this.add(this.benutzerListeScroll);


    }
}
