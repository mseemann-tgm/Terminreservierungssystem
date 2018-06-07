package client.dataconnection;

import client.datatype.Termin;
import client.datatype.User;

import java.util.List;

public class DataObjectMockImp implements DataObject {
    @Override
    public void register(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPasswort());
    }

    @Override
    public void login(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPasswort());
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
