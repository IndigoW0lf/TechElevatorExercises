package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if ((super.getBalance() - amountToWithdraw) > 150) {
            super.withdraw(amountToWithdraw);
        }
        else {
            if (((super.getBalance() - amountToWithdraw) < 150) && ((super.getBalance() >= 0)) &&
                    amountToWithdraw <= super.getBalance()) {
                super.withdraw(amountToWithdraw + 2 );
            }
            else {
                return super.getBalance();
            }
        }
        return super.getBalance();
    }
}
