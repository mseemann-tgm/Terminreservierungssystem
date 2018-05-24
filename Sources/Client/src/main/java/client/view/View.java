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
        this.add(this.rp);
        this.add(this.ep);
        this.add(this.bsp);


        this.rp.setVisible(false);
        this.bsp.setVisible(false);
        this.ep.setVisible(false);


        this.setVisible(true);
    }

    public void changeLogin(){
        this.lp.setVisible(false);
        this.ep.setVisible(true);
        this.bsp.setVisible(true);
        this.repaint();
    }
    public void changeRegistrierung(){
        this.lp.setVisible(false);
        this.rp.setVisible(true);
        this.repaint();
    }

    public void changeLoginReg(){
        this.rp.setVisible(false);
        this.ep.setVisible(true);
        this.bsp.setVisible(true);
        this.repaint();
    }
}
