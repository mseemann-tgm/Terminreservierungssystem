package client.dataconnection;

public interface DataObject {
    void register(String username, String password);
    boolean login(String username, String password);
    void kommentier(String eventName, String kommentar);
    void kommentarLöschen(String eventName, int kommentarID);
    void einladen(String eventName, String benutzerName);
    void entladent(String eventName, String benutzerName);
    void terminFestlegen(String eventName, int terminID);
    void terminAbstimmen(String eventName, int terminID);
    

}
