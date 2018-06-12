package client.dataconnection;

import client.datatype.Event;
import client.datatype.Termin;
import client.datatype.User;

import java.util.List;
/**
 * DataObject ist das interface für die Datenübergabe
 * @author SEEEMANN Manuel, Koiner Oskar
 * @version 2018-04-25
 */
public interface DataObject {
    boolean register(User user);
    boolean login(User user);
    boolean eventErstellen(Event event);
    void kommentier(String eventName);
    void kommentarLöschen(String eventName, int kommentarID);
    void einladen(String eventName, String benutzerName);
    void entladent(String eventName, String benutzerName);
    void terminFestlegen(String eventName, int terminID);
    void terminAbstimmen(String eventName, int terminID);
    List<Termin> getTerminForUser(String Username);
    

}
