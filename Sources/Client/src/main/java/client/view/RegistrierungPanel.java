package client.view;

import client.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class RegistrierungPanel extends JPanel {
    private Controller c;
    private JLabel benutzerText;
    private JLabel passwortText;
    private JLabel emailText;
    private JTextField benutzerEingabe;
    private JTextField passwortEingabe;
    private JTextField emailEingabe;
    private JButton eingabeButton;

    public RegistrierungPanel(Controller c){
        this.c = c;
        this.setLayout(new GridLayout(4, 2));
        this.benutzerText = new JLabel("Benutzer:");
        this.passwortText = new JLabel("Passwort:");
        this.emailText = new JLabel("E-Mail");
        this.benutzerEingabe = new JTextField();
        this.passwortEingabe = new JTextField();
        this.emailEingabe = new JTextField();
        this.eingabeButton = new JButton("Eingabe");

        this.add(this.benutzerText);
        this.add(this.benutzerEingabe);
        this.add(this.passwortText);
        this.add(this.passwortEingabe);
        this.add(this.emailText);
        this.add(this.emailEingabe);
        this.add(this.eingabeButton);

        this.eingabeButton.addActionListener(this.c);
    }

    public boolean eingabeButtonGedrueckt (Object b){
        if(b == this.eingabeButton)return true;
        return false;
    }
}