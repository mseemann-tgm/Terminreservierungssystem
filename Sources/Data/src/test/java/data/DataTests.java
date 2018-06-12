package data;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DataTest Testet ob die Daten auf meine lokale SQL Datenbank gespeichert werden können
 * @author SEEMANN Manuek, Koiner Oskar
 * @version 2018-06-08
 */
public class DataTests{
    private static EntityManagerFactory session;
    private static EntityManager em;
    private Event event;
    private Kommentar kommentar;
    private Notifikation notifikation;
    private Rolle r;

    /**
     * clearDatabase löscht alle Einträge aus der Datenbank
     */
    private static void clearDatabase(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Termin").executeUpdate();
        em.createQuery("DELETE FROM Kommentar").executeUpdate();
        em.createQuery("DELETE FROM Notifikation").executeUpdate();

        em.createQuery("DELETE FROM Event").executeUpdate();
        em.createQuery("DELETE FROM User").executeUpdate();
        em.createQuery("DELETE FROM Rolle").executeUpdate();
        em.getTransaction().commit();
    }


    /**
     * setUp erstellt eine neue Session und ruft clearDatabase auf
     * @throws Exception
     */
    @BeforeClass
    public static void setUp() throws Exception {
        session = Persistence.createEntityManagerFactory("Data");
        em = session.createEntityManager();
        //Vor dem Testen die Datenbank sicherheitshalber leeren
        clearDatabase();
    }

    /**
     * init erstellt die benötigeten Daten
     */
    @Before
    public void init(){
        ArrayList<Rolle> rolle = new ArrayList<Rolle>();
        rolle.add(new Rolle());
        ArrayList<Termin> termin = new ArrayList<Termin>();
        Date datum = new Date();
        datum.getTime();
        termin.add(new Termin(datum));



        this.event = new Event("event1", rolle, termin,new ArrayList<Kommentar>());

        this.kommentar = new Kommentar(this.event, "Ein Kommentar");

        this.r = new Rolle();
        em.persist(this.r);

        this.notifikation = new Notifikation("Notifikation1",r);

        em.persist(this.kommentar);
        em.persist(this.event);
        em.persist(this.notifikation);
    }

    /**
     * tearDown ruft clearDatabase auf
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        //Nach dem Testen die Datenbank sicherheitshalber leeren
        clearDatabase();
    }

    /**
     * testEvent testet ob Event in der Datenbank vorhanden ist
     */
    @Test
    public void testEvent() {
        assertTrue(em.contains(this.event));
    }

    /**
     * testKommentar testet ob Kommentar in der Datenbank vorhanden ist
     */
    @Test
    public void testKommentar(){
        assertTrue(em.contains(this.kommentar));
    }

    /**
     * testNotifikation testet ob Notifikation in der Datenbank vorhanden ist
     */
    @Test
    public void testNotifikation(){
        assertTrue(em.contains(this.notifikation));
    }



}
