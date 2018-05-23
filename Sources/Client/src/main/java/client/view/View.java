package client.view;

import client.controller.Controller;


import javax.swing.*;
import java.awt.*;

/**
 * Die Klasse View erzeugt das Frame.
 *
 * @author SEEMANN Manuel
 * @version 2018-05-17
 */

public class View extends JFrame{
    private Controller c;
    private JPanel lp;
    private JPanel rp;
    private JPanel bsp;


    /**
     * Der Konstruktor erzeugt das Frame.
     *
     * @param c Controller
     */

    public View(Controller c){

        this.setTitle("Terminreservierungssystem");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout ());

        this.c = c;
        this.lp = new LoginPanel();
        this.rp = new RegistrierungPanel();
        this.bsp = new BenutzerSuchenPanel();

        //this.add(this.lp);
        //this.add(this.rp);
        this.add(this.bsp);


        this.setVisible(true);
    }

}
