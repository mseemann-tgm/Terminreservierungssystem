package client.view;

import client.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private Controller c;
    private JLabel benutzerText;
    private JLabel passwortText;
    private JTextField benutzerEingabe;
    private JTextField passwortEingabe;
    private JButton eingabeButton;
    private JButton registrierungButton;

    public LoginPanel(Controller c){
        this.c = c;
        this.setLayout(new GridLayout(3, 2));
        this.benutzerText = new JLabel("Benutzer:");
        this.passwortText = new JLabel("Passwort:");
        this.benutzerEingabe = new JTextField();
        this.passwortEingabe = new JTextField();
        this.eingabeButton = new JButton("Eingabe");
        this.registrierungButton = new JButton("Registrieren");

        this.add(this.benutzerText);
        this.add(this.benutzerEingabe);
        this.add(this.passwortText);
        this.add(this.passwortEingabe);
        this.add(this.registrierungButton);
        this.add(this.eingabeButton);

        this.eingabeButton.addActionListener(this.c);

    }
    public boolean eingabeButtonGedrueckt (Object b){
        if(b == this.eingabeButton)return true;
        return false;
    }
}
