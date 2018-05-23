package client.view;

import client.controller.Controller;
import sun.rmi.runtime.Log;


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
    private LoginPanel lp;
    private RegistrierungPanel rp;
    private BenutzerSuchenPanel bsp;
    private  EventPanel ep;


    /**
     * Der Konstruktor erzeugt das Frame.
     *
     * @param c Controller
     */

    public View(Controller c, LoginPanel lp, RegistrierungPanel rp, BenutzerSuchenPanel bsp, EventPanel ep){

        this.setTitle("Terminreservierungssystem");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout ());

        this.c = c;
        this.lp = lp;
        this.rp = rp;
        this.bsp = bsp;
        this.ep = ep;

        this.add(this.lp);
        //this.add(this.rp);
        //this.add(this.bsp);
        //this.add(this.ep);


        this.setVisible(true);
    }
}
