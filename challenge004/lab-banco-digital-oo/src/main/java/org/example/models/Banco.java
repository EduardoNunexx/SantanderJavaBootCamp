package org.example.models;

import java.util.List;
import java.util.UUID;

public class Banco {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private String name;
    private List<Cliente> clients;
    private String addres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cliente> getClients() {
        return clients;
    }

    public void setClients(List<Cliente> clients) {
        this.clients = clients;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Banco(String name, List<Cliente> clients, String addres) {
        this.name = name;
        this.clients = clients;
        this.addres = addres;
    }
}
