package terminreservierung.server.rest;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    @RequestMapping("/User/login")
    public void login(@RequestParam(value = "name", defaultValue = "World") String username) {
        System.out.println("login"+ username);

    }

    @RequestMapping("/User/register")
    public void register(@RequestParam(value = "name", defaultValue = "World") String userkey) {
        System.out.println("Register" + userkey);
    }

    @RequestMapping("/Termin/choose")
    public void chooseTermin(String userkey){
        System.out.println("chooseTermin by "+userkey);
    }

    @RequestMapping("/User/search")
    public void searchUser(String userkey){
        System.out.println("searchUser by "+userkey);
    }

    @RequestMapping("/Events/show")
    public void showEvents(String userkey){
        System.out.println("showEvents by "+userkey);
    }

    @RequestMapping("/Comment/delete")
    public void deleteUser(String userkey){
        System.out.println("deleteComment by "+userkey);
    }

    @RequestMapping("/User/invite")
    public void inviteUser(String userkey){
        System.out.println("inviteUser by "+userkey);
    }

    @RequestMapping("/User/invite/delete")
    public void deleteInvite(String userkey){
        System.out.println("deleteInvite by "+userkey);
    }

    @RequestMapping("/Termin/set")
    public void setTermin(String userkey){
        System.out.println("setTermin by"+userkey);
    }

    @RequestMapping("/Event/create")
    public void createEvent(String userkey){
        System.out.println("createEvent by"+userkey);
    }

    @RequestMapping("/Event/change")
    public void changeEvent(String userkey){
        System.out.println("changeEvent by"+userkey);
    }
        /*System.out.println("register");
        String search = username;
        boolean alreadyRegistered = false;
        for(String str: registeredUsers) {
            if (str.trim().toLowerCase().contains(search))
                alreadyRegistered = true;
        }


        if(alreadyRegistered==false){
            registeredUsers.add(username);
            System.out.println("Registering of "+username+" was successful");
        }else{
            System.out.println("Username "+username+" alread taken");
        }
        */


}
