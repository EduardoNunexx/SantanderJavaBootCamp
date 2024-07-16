package org.example.models;

import java.util.Date;

public class ContaCorrente extends ContaBanco{
    public ContaCorrente(Cliente cliente, Date openAccountDate, Banco bank) {
        super(cliente, openAccountDate, bank);
    }
}
