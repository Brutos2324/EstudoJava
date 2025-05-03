import java.text.DecimalFormat;
import java.util.Scanner;

public class Cashback {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double cashBack;

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.printf("Digite o valor da compra:");
        double valorDaCompra = 0;


        valorDaCompra = leitor.nextDouble();

        if (idade >= 21 && valorDaCompra < 1000) {
            cashBack = 0.05;
        } else if (idade < 21 && valorDaCompra < 1000 || idade >= 21 && valorDaCompra > 1000) {
            cashBack = 0.07;

        } else {
            cashBack = 0.1;
        }

        double valorDoCashback = valorDaCompra * cashBack;
        System.out.println("Olá sr: " + nome + " seu cashback é de:  " + valorDoCashback);
    }
}
