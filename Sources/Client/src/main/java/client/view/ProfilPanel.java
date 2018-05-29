package client.view;

import client.controller.Controller;

import javax.swing.*;

public class ProfilPanel extends JPanel {
    private Controller c;
    private JButton abmeldenButton;

    public ProfilPanel(Controller c){
        this.c = c;
        this.abmeldenButton = new JButton("Abmelden");
        this.add(this.abmeldenButton);

        this.abmeldenButton.addActionListener(c);
    }
    public boolean abmeldenButtonGedrueckt (Object b){
        if(b == this.abmeldenButton)return true;
        return false;
    }

}
