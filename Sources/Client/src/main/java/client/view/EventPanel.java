package client.view;

import javax.swing.*;
import java.awt.*;

public class EventPanel extends JPanel {
    private JList eventListe;
    private JScrollPane eventListeScroll;

    public EventPanel(){
        String [] events = {"Alex","Arlllllllllllllllllmin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin","Alex","Armin"};
        this.setLayout(new FlowLayout());
        this.eventListe = new JList(events);
        this.eventListeScroll = new JScrollPane(this.eventListe);
        this.eventListeScroll.setPreferredSize(new Dimension(250, 80));

        this.add(this.eventListeScroll);
    }
}
