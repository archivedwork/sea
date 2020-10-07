package operations;

import entities.Product;

import static java.lang.System.out;
import javax.persistence.*;

public class Update {
    // ------------------------ Book ---------------------------
    public static void updateRecords(EntityManager em) {

        // Update with criteria API
        //TODO there is an error in query
        Query query        = em
                .createQuery("UPDATE Book AS i SET i.pages = :originalPage WHERE i.pages = :newPage")
                .setParameter("originalPage", 200)
                .setParameter("newPage", 10);
        int updatedItems = query.executeUpdate();

        if(updatedItems > 0) {
            out.println(updatedItems + " books updated.");

        }
    }









}