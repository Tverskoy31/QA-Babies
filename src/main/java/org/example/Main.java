package org.example;

import org.example.task1.BankAccount;


public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(70000);
        int balance1 = account1.getBalance();
        System.out.println("Баланс 1 " + balance1);
        account1.print();
    }

}