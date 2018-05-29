package terminreservierung.server.rest;

public class SessionCertificate {
    private String remoteAddress;
    private String username;
    public SessionCertificate(String remoteAddress, String username){
        this.remoteAddress=remoteAddress;
        this.username=username;
    }
    public boolean isValid(String remoteAddress, String username){
        return remoteAddress==this.remoteAddress&&username==this.username;
    }
}
