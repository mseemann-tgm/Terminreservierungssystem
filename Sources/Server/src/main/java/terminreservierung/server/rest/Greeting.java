package terminreservierung.server.rest;

/*
 * Greet with id and content
 */
public class Greeting {

    private final long id;
    private final String content;

    /*
     * Construc. gets id and content and sets it
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    /*
     * getter for ID
     *
     * return id
     */
    public long getId() {
        return id;
    }
    /*
     * getter for Content
     *
     * return content
     */
    public String getContent() {
        return content;
    }
}

