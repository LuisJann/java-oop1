package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("########");

    //CAMPI
    private final int code;
    private String name;
    private String description;
    private double price;
    private static final double iva = 1.22;


    //GETTER e SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getIva() {
        return iva;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price * iva;
    }


   //COSTRUTTORE

    public Product() {
        code = Integer.parseInt(df.format(rand.nextInt(1,10000000)));
        name = "unknown";
        description = "";
        price = 0;
    }

    public Product(String name, String description, double price){
        code = Integer.parseInt(df.format(rand.nextInt(1,10000000)));
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price + "€" +
                '}';
    }
}
