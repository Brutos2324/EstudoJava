import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o dia da semana você quer saber? ");

        int dia = leitor.nextInt();
        String nomeDia;

        switch (dia){

            case 1:
                nomeDia = "Domingo";

                break;

            case 2:
                nomeDia = "Segunda Feira";

                break;

            case 3:
                nomeDia = "Terça Feira";

                break;

            case 4:
                nomeDia = "Quarta Feira";

                break;

            case 5:
                nomeDia = "Quinta Feira";

                break;

            case 6:
                nomeDia = "Sexta Feira";

                break;

            case 7:
                nomeDia = "Sabado";

                break;


            default:
                nomeDia = "Dia invalido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);

    }


}
