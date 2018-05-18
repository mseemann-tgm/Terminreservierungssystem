package client.view;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private JLabel benutzerText;
    private JLabel passwortText;
    private JTextField benutzerEingabe;
    private JTextField passwortEingabe;
    private JButton eingabeButton;
    public LoginPanel(){
        this.setLayout(new GridLayout(3, 2));
        this.benutzerText = new JLabel("Benutzer:");
        this.passwortText = new JLabel("Passwort:");
        this.benutzerEingabe = new JTextField();
        this.passwortEingabe = new JTextField();
        this.eingabeButton = new JButton("Eingabe");

        this.add(this.benutzerText);
        this.add(this.benutzerEingabe);
        this.add(this.passwortText);
        this.add(this.passwortEingabe);
        this.add(this.eingabeButton);



    }
}
