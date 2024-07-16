package org.example;

import org.example.models.Cliente;
import org.example.models.ClienteFisico;
import org.example.models.ClienteJuridico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1= new ClienteFisico("123","jao",new Date(),20000);
        Cliente cliente2= new ClienteJuridico("123","jao",new Date(),20000);
        cliente2.bankLoan();
        cliente1.bankLoan();
        System.out.println(String.format("client1 balance: %.2f \n client2 balance:%.2f", cliente1.getBalance(), cliente2.getBalance()));
    }
}