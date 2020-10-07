package operations;

import static java.lang.System.out;
import java.util.List;

import javax.persistence.*;
import entities.*;

public class Read {
    public static void selectRecords(EntityManager em) {
        //Select with JPQL and print out entities
        TypedQuery<Book> q      = em.createQuery("SELECT I FROM Book AS i ORDER BY i.title", Book.class);
        List<Book>       items  = q.getResultList();

        out.println();

        for(Book i: items) {
            out.println(i);
        }

        out.println();

    }

}