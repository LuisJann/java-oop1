package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.00");
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Che nome ha il tuo prodotto?: ");
        product.setName(scan.nextLine());
        System.out.println("Aggiungi una breve descrizione: ");
        product.setDescription(scan.nextLine());
        System.out.println("Qual è il prezzo?: ");
        product.setPrice(Integer.parseInt(scan.nextLine()));

        System.out.println("Codice Prodotto: " + product.getCode());
        System.out.println("Il tuo prodotto è stato aggiunto con successo!");
        System.out.println("Nome: " + product.getName());
        System.out.println("Descrizione: " + product.getDescription());
        System.out.println("Prezzo: " + df.format(product.getPrice()) + "€");
    }
}