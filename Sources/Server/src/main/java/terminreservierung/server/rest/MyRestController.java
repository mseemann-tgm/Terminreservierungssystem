package terminreservierung.server.rest;

import terminreservierung.server.rest.data.User;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyRestController {

    ConcurrentHashMap<String,SessionCertificate> certificates = new ConcurrentHashMap<String, SessionCertificate>();

    //Delete sometimes
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("greeting");
        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, name)
        );
    }

    @RequestMapping("/inc")
    public void inc(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("inc");
        counter.incrementAndGet();
    }

    @PostMapping("/incby")
    public void update(@RequestBody ExampleDataClass w){
        System.out.println("Incby post request");
        System.out.println("Ampunt:"+w.getI());
        counter.addAndGet(w.getI());
    }


    @PostMapping("/login")
    public String login(@RequestBody User u, HttpServletRequest request){
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        int len = 64;
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        String sessionCert  = sb.toString();

        SessionCertificate c = new SessionCertificate(request.getRemoteAddr(),u.getName());

        certificates.put(sessionCert,c);

        return sessionCert;
    }
}







