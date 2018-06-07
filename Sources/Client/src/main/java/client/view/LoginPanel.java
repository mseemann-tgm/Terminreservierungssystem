package client.view;

import client.controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginPanel extends JPanel {
    private Controller c;
    private JLabel benutzerText, passwortText, main;
    private JTextField benutzerEingabe, passwortEingabe;
    private Container con1, con2;
    private JButton eingabeButton, registrierungButton;
    private static final Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 3);
    private static final Border border2 = new EmptyBorder(10, 10, 10, 10);

    public LoginPanel(Controller c){
        this.c = c;
        this.setLayout(new BorderLayout());
        this.benutzerText = new JLabel();
        this.passwortText = new JLabel();
        this.benutzerEingabe = new JTextField();
        this.passwortEingabe = new JTextField();
        this.eingabeButton = new JButton();
        this.registrierungButton = new JButton();

        /*
        this.add(this.benutzerText);
        this.add(this.benutzerEingabe);
        this.add(this.passwortText);
        this.add(this.passwortEingabe);
        this.add(this.registrierungButton);
        this.add(this.eingabeButton);
        */

        //North Start
        this.main = new JLabel();
        this.beautifulL(main, "Login", BorderLayout.NORTH );
        //North End

        //Center Start
        this.con1 = new Container();
        this.con1.setLayout(new GridLayout(2, 2));

        this.beautifulL(benutzerText, "Benutzer:", con1);
        this.beautifulTF(benutzerEingabe,  con1);

        this.beautifulL(passwortText, "Passwort:", con1);
        this.beautifulTF(passwortEingabe,  con1);
        //Center End


        //South Start
        this.con2 = new Container();
        this.con2.setLayout(new GridLayout(2, 0));

        this.beautifulB(eingabeButton, "Login", con2);

        this.beautifulB(registrierungButton, "Registrieren", con2);
        //South End

        this.add(con1, BorderLayout.CENTER);
        this.add(con2, BorderLayout.SOUTH);

        this.eingabeButton.addActionListener(this.c);
        this.registrierungButton.addActionListener(this.c);

    }
    public boolean eingabeButtonGedrueckt (Object b){
        if(b == this.eingabeButton)return true;
        return false;
    }
    public boolean registrierungButtonGedrueckt (Object b){
        if(b == this.registrierungButton)return true;
        return false;
    }

    private void beautifulB(JButton b, String text, Container con){
        b.setText(text);
        b.setFont(new Font(b.getFont().getName(), 0, 25));
        //b.setBackground(new Color(0, 50, 0));
        b.setOpaque(true);
        b.setForeground(new Color(0, 50, 0));
        b.setBorder(new CompoundBorder(border,border2));
        con.add(b);
    }


    private void beautifulTF(JTextField tf){
        tf.setFont(new Font(tf.getFont().getName(), 0, 25));
        tf.setBackground(new Color(0, 50, 0));
        tf.setOpaque(true);
        tf.setForeground(Color.lightGray);
        tf.setBorder(new CompoundBorder(border,border2));
    }

    private void beautifulTF(JTextField tf, String cord){
        tf.setFont(new Font(tf.getFont().getName(), 0, 25));
        tf.setBackground(new Color(0, 50, 0));
        tf.setOpaque(true);
        tf.setForeground(Color.lightGray);
        tf.setBorder(new CompoundBorder(border,border2));
    }

    private void beautifulTF(JTextField tf, Container con){
        tf.setFont(new Font(tf.getFont().getName(), 0, 25));
        tf.setBackground(new Color(0, 50, 0));
        tf.setOpaque(true);
        tf.setForeground(Color.white);
        tf.setBorder(new CompoundBorder(border,border2));
        con.add(tf);
    }


    private void beautifulL(JLabel l, String text){
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 30));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.lightGray);
        l.setBorder(new CompoundBorder(border,border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void beautifulL(JLabel l, String text, Container con){
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 30));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border,border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        con.add(l);
    }

    private void beautifulL(JLabel l, String text, String cord){
        l.setText(text);
        l.setFont(new Font(l.getFont().getName(), 1, 30));
        l.setBackground(new Color(0, 50, 0));
        l.setOpaque(true);
        l.setForeground(Color.white);
        l.setBorder(new CompoundBorder(border,border2));
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(l, cord);
    }

    public String getBenutzerEingabe(){
        return this.benutzerEingabe.getText();
    }
    public String getPasswortEingabe(){
        return this.passwortEingabe.getText();
    }

}
