package com.techelevator;


public class CheckingAccount extends BankAccount{
    //instance variables inherited
    //methods inherited

    //constructors
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if(super.getBalance() >= amountToWithdraw) {
            super.withdraw(amountToWithdraw);
        }
        else {
            if(super.getBalance() - amountToWithdraw >= -100) {
                super.withdraw(amountToWithdraw + 10);
            }
            else {
                return super.getBalance();
            }
        }

        return super.getBalance();
    }

    //getters/setters inherited
}
