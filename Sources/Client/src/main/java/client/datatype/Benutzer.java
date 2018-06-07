package client.datatype;
import java.lang.String;
public class Benutzer {
    private String username;
    private String passwort;

    public Benutzer(String username, String passwort){
        this.username = username;
        this.passwort = passwort;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswort() {
        return passwort;
    }
}
