package utils;

import  java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaUtils {
    /**
     * Runs a JPA {@code transaction} on the persistence unit named {@code puName}.
     */
    public static void withDbTransaction(String puName, Consumer<EntityManager> transaction) {
        // Get an entity manager factory by persistence unit name
        // The database table will be automatically created by eclipselink
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(puName);

        // Create an entity manager
        EntityManager em = emf.createEntityManager();

        // Begin transaction
        em.getTransaction().begin();

        // The caller has specified what to do, run those steps now...
        transaction.accept(em);

        // Commit the transaction and close the entity manager
        em.getTransaction().commit();
        em.close();
    }
}