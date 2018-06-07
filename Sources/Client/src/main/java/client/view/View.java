package client.view;

import client.controller.Controller;
import com.sun.scenario.effect.impl.prism.PrFilterContext;
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
    private ProfilPanel pp;


    /**
     * Der Konstruktor erzeugt das Frame.
     *
     * @param c Controller
     */

    public View(Controller c, LoginPanel lp, RegistrierungPanel rp, BenutzerSuchenPanel bsp, EventPanel ep, ProfilPanel pp){

        this.setTitle("Terminreservierungssystem");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout ());

        this.c = c;
        this.lp = lp;
        this.rp = rp;
        this.bsp = bsp;
        this.ep = ep;
        this.pp = pp;

        this.add(this.lp);
        this.add(this.rp);
        this.add(this.bsp);
        this.add(this.ep);
        this.add(this.pp);


        this.rp.setVisible(false);
        this.bsp.setVisible(false);
        this.ep.setVisible(false);
        this.pp.setVisible(false);
        /*//Test für mseemann
        this.rp.setVisible(true);
        this.pp.setVisible(false);
        this.bsp.setVisible(false);
        this.ep.setVisible(false);
        this.lp.setVisible(false);*/



        this.setVisible(true);
    }

    public void changeLogin(){
        this.lp.setVisible(false);
        this.pp.setVisible(true);
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
        this.pp.setVisible(true);
        this.ep.setVisible(true);
        this.bsp.setVisible(true);
        this.repaint();
    }
    public void zurueckReg(){
        this.rp.setVisible(false);
        this.lp.setVisible(true);
        this.repaint();
    }
    public void abmelden(){
        this.pp.setVisible(false);
        this.ep.setVisible(false);
        this.bsp.setVisible(false);
        this.lp.setVisible(true);
        this.repaint();
    }

}