package common;

import javax.persistence.EntityManager;

public class Cache {
    public static void clearingCache(EntityManager em){
        em.clear();
    }
}