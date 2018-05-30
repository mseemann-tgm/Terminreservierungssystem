package client.view;

import client.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BenutzerSuchenPanel extends JPanel {
    private Controller c;
    private JLabel benutzerEingabeText;
    private  JTextField benutzerEingabe;
    private JButton benutzerEingabeButton;
    private JList benutzerListe;
    private JScrollPane benutzerListeScroll;
    private JPanel eingabePanel;

    public BenutzerSuchenPanel(Controller c){
        this.c = c;
        this.setLayout(new GridLayout(2,3));
        this.benutzerEingabeText = new JLabel("Benutzername: ");
        this.benutzerEingabe = new JTextField();
        this.benutzerEingabeButton = new JButton("Suchen");
        this.benutzerListe = new JList();
        this.eingabePanel = new JPanel();
        this.eingabePanel.setLayout(new FlowLayout());
        this.benutzerEingabe.setPreferredSize(new Dimension(90,25));




        this.benutzerListeScroll = new JScrollPane(this.benutzerListe);
        this.benutzerListeScroll.setPreferredSize(new Dimension(250, 80));


        this.add(this.eingabePanel);
        this.eingabePanel.add(this.benutzerEingabeText);
        this.eingabePanel.add(this.benutzerEingabe);
        this.eingabePanel.add(this.benutzerEingabeButton);
        this.add(this.benutzerListeScroll);

        this.benutzerEingabeButton.addActionListener(c);


    }

    public boolean benutzerEingabeButtonGedrueckt (Object b){
        if(b == this.benutzerEingabeButton)return true;
        return false;
    }

    public String getBenutzerEingabe(){
        return this.benutzerEingabe.getText();
    }

    public void setBenutzerListe(String [] benutzerGesucht){
        this.benutzerListe.setListData(benutzerGesucht);
    }
}
