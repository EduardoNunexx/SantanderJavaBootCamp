package org.example.models;

import java.util.Date;
import java.util.UUID;

public abstract class Cliente {
    private UUID ID;
    private String NAME;
    private Date dateOfBirth;
    private double balance;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UUID getID() {
        return ID;
    }

    public double deposit (double value){
        this.balance+=value;
        return balance;
    }
    public double withdraw(double value){
        if(balance>=value){
            balance-= value;
            return balance;
        }
        throw new RuntimeException("Insufficient founds");
    }

    public Cliente(String NAME, Date dateOfBirth, double balance) {
        this.NAME = NAME;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
    }
    public abstract void bankLoan();
}
