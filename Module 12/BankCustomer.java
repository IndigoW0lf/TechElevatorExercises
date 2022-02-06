package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{

    //instance variables
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    //constructors
    //methods
    public Accountable[] getAccounts(){
        Accountable[] act = new Accountable[this.accounts.size()];
        Accountable[] storage = new Accountable[accounts.size()];
        storage = accounts.toArray(storage);
        return storage;
    }

    public boolean isVip() {
        int total = 0;
        for (Accountable account: accounts) {
            total += account.getBalance();

        }
        if (total >= 25000) {

            return true;
        }
        return false;

    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }


    //getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccounts(ArrayList<Accountable> newAccounts) {
        this.accounts = newAccounts;
    }


    //overrides
    @Override
    public int getBalance() {
        return 0;
    }
}
