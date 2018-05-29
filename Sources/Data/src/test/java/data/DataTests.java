package data;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DataTests{

    private static EntityManager em;

    private void clearDatabase(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Event").executeUpdate();
        em.createQuery("DELETE FROM Kommentar").executeUpdate();
        em.createQuery("DELETE FROM Notifikation").executeUpdate();
        em.createQuery("DELETE FROM Rolle").executeUpdate();
        em.createQuery("DELETE FROM Termin").executeUpdate();
        em.createQuery("DELETE FROM User").executeUpdate();
        em.getTransaction().commit();
    }

    @Before
    public void setUp() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Data");
        em = emf.createEntityManager();
        clearDatabase();
    }

    @After
    public void tearDown() throws Exception {
        clearDatabase();
        em.close();
    }

    @Test
    public void testTest(){
        em.getTransaction().begin();
        Termin t = new Termin(3);
        t.setID(3);
        em.persist(t);
        em.getTransaction().commit();
        assertTrue(true);
    }

    @Test
    public void testJPQL(){
        em.getTransaction().begin();
        Termin t = new Termin(2);
        t.setID(1);
        em.persist(t);
        em.getTransaction().commit();
        List<Termin> l = (List<Termin>)em.createQuery("SELECT t FROM Termin t").getResultList();
        assertTrue(l.size()>0);
    }

}
