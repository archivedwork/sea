package operations;

import common.Print;
import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProductOp {
    // ---------------------- Product ----------------
    public static void updateProductByPrimaryKey(EntityManager em){
        // find product by its primary key and update it
        Product p = em.find(Product.class, 3L);
        p.setType(Product.Type.A);
        em.persist(p);
    }

    public static void queryWithNamedParameter(EntityManager em){
        // Query products with a substituted (and named) filter parameter
        TypedQuery<Product> tq = em.createQuery("select p from Product p where p.type = :prodType order by p.name", Product.class);
        tq.setParameter("prodType", Product.Type.B);
        Print.printProductResults(tq.getResultList());
    }

    public static void useNamedQuery(EntityManager em){
        // use a named query defined on the entity
        TypedQuery<Product> nq = em.createNamedQuery("getAllProducts", Product.class);
        Print.printProductResults(nq.getResultList());
    }


    public static void testProductCacheClearing(EntityManager em){

        // select an entity by its primary key
        Product p7A = em.find(Product.class, 7L);

        //Empty the cache
        em.clear();

        // select the same entity again(now it'struely different java object)
        Product p7B = em.find(Product.class, 7L);

        // Test entity equivalence
        System.out.println(p7A == p7B);
        System.out.println(p7A.equals(p7B));
    }
















}
