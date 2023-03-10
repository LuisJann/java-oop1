package org.lessons.java.bank;

import java.util.Random;

public class Account {
    Random rand = new Random();
    private int code;
    private String name;
    private int balance;

    //Getter e SETTER
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //COSTRUTTORE
    public Account(){
        code = rand.nextInt(1,1000);
        this.name = name;
        balance = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", balance=" + balance + "€" +
                '}';
    }
}
