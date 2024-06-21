import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero =1 ;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número!");
        numero=sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite a agencia!");
        agencia=sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente= sc.nextLine();
        System.out.println("Por favor, digite o saldo");
        saldo = sc.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, su agênca é "+agencia+",conta "+numero+" e seu saldo "+saldo+" já está disponível para saque !");

    }
}