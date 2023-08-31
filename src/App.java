import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digiti o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.println("Digiti o segundo numero: ");
        numero2 = leitor.nextInt();

        soma = numero1 + numero2;

         System.out.println("O resultado é " + soma);
    }
}
