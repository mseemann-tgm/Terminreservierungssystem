package data;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import static org.junit.Assert.assertTrue;

public class QueryTests {
    private static EntityManagerFactory sessionFactory;
    private static EntityManager em;
    @BeforeClass
    public static void setup(){
        sessionFactory = Persistence.createEntityManagerFactory("Data");
        em = sessionFactory.createEntityManager();
    }
    @Before
    public void init(){
        em.getTransaction().begin();

    }

    /* Muss woanders getestet werden @Oskar */
    @Test
    public void testLogin() {
        EntityManager em = sessionFactory.createEntityManager();
        //Query q = em.createNamedQuery("User.getName()");
    }

    @Test
    public void testShowEvents(){
        EntityManager em = sessionFactory.createEntityManager();
        //Query q = em.createNamedQuery("Event.getRolle");
        //List<Event> lev = q.getResultList();
        //System.out.println(lev.size());
        //assertTrue();
    }



}
