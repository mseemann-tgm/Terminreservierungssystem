package terminreservierung.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* Main.java
 *
 * Spring Application runt die Main Klasse
 *
 *
 */
@SpringBootApplication
public class Main implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    /*
     * On SpringApplication.run, print that it runs
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running");
    }
}
