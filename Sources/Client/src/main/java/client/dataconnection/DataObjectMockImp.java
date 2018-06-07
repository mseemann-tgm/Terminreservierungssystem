package client.dataconnection;

import client.datatype.Benutzer;

public class DataObjectMockImp implements DataObject {
    @Override
    public void register(String username, String password) {

    }

    @Override
    public void login(Benutzer user) {
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
}
