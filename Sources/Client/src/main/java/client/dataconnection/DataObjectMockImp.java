package client.dataconnection;

import client.datatype.Event;
import client.datatype.Termin;
import client.datatype.User;

import java.util.ArrayList;
import java.util.List;

public class DataObjectMockImp implements DataObject {
    @Override
    public boolean register(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPasswort());
        //Daten mit REST checken dann true/false
        return true;
    }

    @Override
    public boolean login(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPasswort());
        System.out.println(user.getRolle());
        //Daten mit REST checken dann true/false
        return true;
    }

    @Override
    public boolean eventErstellen(Event event){
        //Daten checken return true/false
        System.out.println(event.getName());
        return true;
    }

    @Override
    public void kommentier(String eventName) {

    }

    @Override
    public void kommentarLöschen(String eventName, int kommentarID) {

    }

    @Override
    public void einladen(String eventName, String benutzerName) {

    }

    @Override
    public void entladent(String eventName, String benutzerName) {

    }

    @Override
    public void terminFestlegen(String eventName, int terminID) {

    }

    @Override
    public void terminAbstimmen(String eventName, int terminID) {

    }

    @Override
    public List<Termin> getTerminForUser(String Username){
        return null;
    }
}
