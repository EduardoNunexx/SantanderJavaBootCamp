package org.example.models;

import java.util.Date;

public class ClienteJuridico extends Cliente{
    private String cnpj;

    public ClienteJuridico(String cpf, String NAME, Date dateOfBirth, double balance) {
        super(NAME,dateOfBirth,balance);
        this.cnpj = cpf;
    }

    public String getCpf() {
        return cnpj;
    }

    public void setCpf(String cpf) {
        this.cnpj = cnpj;
    }
    public void bankLoan(){
        deposit(10000);
    }
}
