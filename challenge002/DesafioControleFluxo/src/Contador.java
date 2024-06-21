import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        sc.nextLine();
        int secondNumber = sc.nextInt();
        try {
            print(secondNumber - firstNumber);
        }catch (ParametroInvalidoException e){
            System.out.println(e.getName());
        }
    }
    public static void print(int times) throws ParametroInvalidoException{
        if(times<0){
            throw new ParametroInvalidoException("O segundo parametro deve ser maior que o primeiro");
        }
        for (int i = 1; i <= times; i++) {
            System.out.println("Imprimindo o numero: "+i);
        }
    }
}