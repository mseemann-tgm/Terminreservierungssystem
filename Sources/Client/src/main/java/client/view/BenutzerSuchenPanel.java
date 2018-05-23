package client.view;

import javax.swing.*;
import java.awt.*;

public class BenutzerSuchenPanel extends JPanel {
    private JLabel benutzerEingabeText;
    private  JTextField benutzerEingabe;
    private JButton benutzerEingabeButton;

    public BenutzerSuchenPanel(){
        this.setLayout(new GridLayout(0, 3));
        this.benutzerEingabeText = new JLabel("Benutzername: ");
        this.benutzerEingabe = new JTextField();
        this.benutzerEingabeButton = new JButton("Suchen");

        this.add(this.benutzerEingabeText);
        this.add(this.benutzerEingabe);
        this.add(this.benutzerEingabeButton);

    }
}
