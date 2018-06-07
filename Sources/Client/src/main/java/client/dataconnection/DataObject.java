package client.dataconnection;

import client.datatype.Benutzer;

import java.util.List;

public interface DataObject {
    void register(String username, String password);
    void login(Benutzer user);
    void kommentier(String eventName);
    void kommentarLöschen(String eventName, int kommentarID);
    void einladen(String eventName, String benutzerName);
    void entladent(String eventName, String benutzerName);
    void terminFestlegen(String eventName, int terminID);
    void terminAbstimmen(String eventName, int terminID);
    //List<Termin> getTerminForUser(String Username);
    

}
