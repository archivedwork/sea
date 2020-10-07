package main;
import java.io.IOException;

import entities.Product;
import utils.jpaUtils;
import operations.*;
import common.*;

public class Main {

    public static void main(String[] args) throws IOException{
        jpaUtils.withDbTransaction("testpu", em -> {

            //---------- books ------------
            //Delete.deleteRecords(em);
            //Create.insertRecords(em);
            //Read.selectRecords(em);

            //---------- products ----------
            Create.insertSomeProducts(em);
            //System.out.println("products inserted");
            ProductOp.updateProductByPrimaryKey(em);
            ProductOp.queryWithNamedParameter(em);
            ProductOp.useNamedQuery(em);

            // apply the changes above before clear the entity manager below
            em.flush();

            ProductOp.testProductCacheClearing(em);




            //----------- Cache ------------
            Cache.clearingCache(em);
            System.out.println("Cache Cleared!");

            //TODO fix update for query issue then re enable this line
//			Update.updateRecords(em);
//			Read.selectRecords(em);

        });


    }

}