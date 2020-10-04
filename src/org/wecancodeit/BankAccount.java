package org.wecancodeit;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    void deposit(int amount){
        if(amount != 0){
            balance+= amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance-= amount;
            previousTransaction = -amount;
        }
    }

}
