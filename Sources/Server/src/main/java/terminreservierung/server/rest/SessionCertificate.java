package terminreservierung.server.rest;
/*
 * SessionCertificate to identify User per Session
 *
 */
public class SessionCertificate {
    private String remoteAddress;
    private String username;
    /*
     * get address and username and save it
     * @param remotAddress address of the user
     * @param username used user
     */
    public SessionCertificate(String remoteAddress, String username){
        this.remoteAddress=remoteAddress;
        this.username=username;
    }
    /*
     * check if address and username is equal to saved ones
     * @param remotAddress address of the user
     * @param username used user
     * @return true if both params are equal
     */
    public boolean isValid(String remoteAddress, String username){
        return remoteAddress==this.remoteAddress&&username==this.username;
    }
}
