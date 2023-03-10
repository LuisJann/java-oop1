package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product monitor = new Product();
        monitor.setName("LG");
        monitor.setDescription("Ottimo monitor, luminoso e ben definito");
        monitor.setPrice(55);
        System.out.println(monitor);
    }

}