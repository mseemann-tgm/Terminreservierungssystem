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

public class DataTests{
    private static EntityManagerFactory session;
    private static EntityManager em;
    private Event event;
    private Kommentar kommentar;
    private Notifikation notifikation;
    private Rolle r;

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

    @BeforeClass
    public static void setUp() throws Exception {
        session = Persistence.createEntityManagerFactory("Data");
        em = session.createEntityManager();
        //Vor dem Testen die Datenbank sicherheitshalber leeren
        clearDatabase();
    }
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
    @After
    public void tearDown() throws Exception {
        //Nach dem Testen die Datenbank sicherheitshalber leeren
        clearDatabase();
    }


    @Test
    public void testEvent() {
        assertTrue(em.contains(this.event));
    }

    @Test
    public void testKommentar(){
        assertTrue(em.contains(this.kommentar));
    }

    @Test
    public void testNotifikation(){
        assertTrue(em.contains(this.notifikation));
    }



}
