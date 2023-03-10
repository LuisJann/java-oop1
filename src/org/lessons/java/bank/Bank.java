package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.00");
        Scanner scan = new Scanner(System.in);
        Account account = new Account();
        boolean check = true;

        System.out.println("Enter username: ");
        account.setName(scan.nextLine());


        while (check){

        System.out.println("Se vuoi effettuare un versamento premi 1");
        System.out.println("Se vuoi effettuare un prelievo premi 2");
        System.out.println("Per uscire premi 3");

        int userChoose = Integer.parseInt(scan.nextLine());

            switch (userChoose) {
                case 1 -> {
                    System.out.println("Il tuo saldo attuale è: " + df.format(account.getBalance()) + "€");
                    System.out.println("Quanto vuoi versare?");
                    account.setBalance(Integer.parseInt(scan.nextLine()));
                    System.out.println("Caricamento in corso...");
                    System.out.println("Il tuo saldo è stato aggiornato");
                    System.out.println("Il saldo disponibile ora è: " + df.format(account.getBalance()) + "€");
                }
                case 2 -> {
                    System.out.println("Il tuo saldo attuale è: " + df.format(account.getBalance()) + "€");
                    System.out.println("Quanto vuoi prelevare?");
                    int withdraw = Integer.parseInt(scan.nextLine());
                    if (account.getBalance() - withdraw >= 0){
                        System.out.println("Caricamento in corso...");
                        System.out.println("Il tuo saldo è stato aggiornato");
                        account.setBalance(account.getBalance() - withdraw);
                        System.out.println("Il saldo disponibile ora è: " + df.format(account.getBalance()) + "€");
                    } else {
                        System.out.println("Mi dispice non hai abbastanza disponibiltà");
                    }
                }
                case 3 -> {
                    System.out.println("Exit");
                    check = false;
                }

            }
        }

        System.out.println(account);
    }
}
