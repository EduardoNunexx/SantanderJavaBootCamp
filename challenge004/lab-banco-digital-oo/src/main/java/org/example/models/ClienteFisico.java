package org.example.models;

import java.util.Date;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String cpf, String NAME, Date dateOfBirth, double balance) {
        super(NAME,dateOfBirth,balance);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void bankLoan() {
        deposit(1000);
    }
}
