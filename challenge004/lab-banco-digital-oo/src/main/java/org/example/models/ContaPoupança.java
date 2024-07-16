package org.example.models;

import java.util.Date;

public class ContaPoupança extends ContaBanco{
    public ContaPoupança(Cliente cliente, Date openAccountDate, Banco bank) {
        super(cliente, openAccountDate, bank);
    }
}
