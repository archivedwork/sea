package operations;

import javax.persistence.*;
import static java.lang.System.out;

public class Delete {
    public static void deleteRecords(EntityManager em) {
        out.println("Removing all items.");

        // Bulk delete with criteria API
        Query query          = em.createQuery("DELETE FROM Book");
        int   removedItems   = query.executeUpdate();

        if(removedItems > 0) {
            out.println(removedItems + " items removed.");
        }

    }

}