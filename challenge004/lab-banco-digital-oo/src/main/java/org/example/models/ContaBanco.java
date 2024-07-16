package org.example.models;

import java.util.Date;
import java.util.UUID;

public abstract class ContaBanco {
    private UUID id;
    private Cliente cliente;
    private Date openAccountDate;
    private Banco bank;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getOpenAccountDate() {
        return openAccountDate;
    }

    public void setOpenAccountDate(Date openAccountDate) {
        this.openAccountDate = openAccountDate;
    }

    public Banco getBank() {
        return bank;
    }

    public void setBank(Banco bank) {
        this.bank = bank;
    }

    public ContaBanco(Cliente cliente, Date openAccountDate, Banco bank) {
        this.cliente = cliente;
        this.openAccountDate = openAccountDate;
        this.bank = bank;
    }

    public UUID getId() {
        return id;
    }
}
