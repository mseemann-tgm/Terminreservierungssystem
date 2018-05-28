package data;

import junit.framework.TestCase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataTests extends TestCase{

    private static EntityManager em;

    protected void setUp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Data");
        em = emf.createEntityManager();
    }

    public void testTest(){
        em.getTransaction().begin();
        Termin t = new Termin();
        t.setID(1);
        em.persist(t);
        em.getTransaction().commit();
        assertTrue(true);
    }
}
