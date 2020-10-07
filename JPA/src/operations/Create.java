package operations;

import java.util.Date;

import javax.persistence.EntityManager;

import entities.*;
import entities.Book.StockStatus;

public class Create {

    // handle books insertions
    public static void insertRecords(EntityManager em) {
        for(int i=0; i<5; ++i) {
            insertRecord(em, i);
        }
    }

    private static void insertRecord(EntityManager em, int i) {
        Book bkk = makeBook(em, i);
        em.persist(bkk);

    }

    private static Book makeBook(EntityManager em, int i) {
        Book bk = new Book();

        //
        bk.setId(i);
        bk.setTitle("mytitle" + i);
        bk.setAuthor("Author" + i);
        bk.setPages(200);
        bk.setStockStatus(StockStatus.IN_STOCK.toString());
        return bk;

    }





    // handles products insertions
    public static void insertSomeProducts(EntityManager em ){
        for(int i =0; i<10; ++i){
            insertProduct(em, i);
        }
    }

    private static void insertProduct(EntityManager em, int i){
        Product p = new Product();
        p.setName("product " + i);
        p.setType(Product.Type.B);
        p.setLastModified(new Date());
        em.persist(p);
    }





}