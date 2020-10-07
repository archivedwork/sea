package common;

import entities.Product;

import java.util.List;

public class Print {

    // print Products
    public static void printProductResults(List<Product> results){
        System.out.println();
        results.forEach(System.out::println);
        System.out.println();
    }
}