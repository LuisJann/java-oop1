package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("LG");
        product.setDescription("Ottimo monitor, luminoso e ben definito");
        product.setPrice(55);
        System.out.println(product);
    }
}