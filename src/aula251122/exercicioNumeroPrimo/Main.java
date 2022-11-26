//Ler um número e escreva se ele "é primo" ou "não é primo".

package aula251122.exercicioNumeroPrimo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite um valor: ");
        int x = entrada.nextInt();

        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                soma++;
            }

            if (soma > 2) {
                break;
            }
        }

        if (soma == 2) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

        entrada.close();

    }
}
