package com.techelevator;

public class CreditCardAccount implements Accountable {

    //instance variables
    private String accountHolder;
    private String accountNumber;
    private int debt;

    //constructors
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }


    //methods
    public int pay(int amountToPay) {
        debt = debt - amountToPay;
        return debt;
    }

    public int charge(int amountToCharge) {
        debt = debt + amountToCharge;
        return debt;
    }


    //getters/setters

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        return -debt;
    }
}
