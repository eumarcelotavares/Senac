//Faça um programa que leia número reais maiores que zero.
//Quando for entrado o número zero, o programa deverá apresentar quantos números foram entrados e a média destes.

package aula251122.exercicioNumerosReais;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero, soma = 0, contador = 0;

        System.out.println("Digite um numero: ");
        numero = entrada.nextDouble();

        while (numero != 0) {

            soma += numero;
            contador++;

            System.out.println("Digite um numero: ");
            numero = entrada.nextDouble();

        }

        if (contador == 0) {
            System.out.println("Nao foi entrado nenhum numero");
        } else if (contador == 1) {
            System.out.println("Foi entrado numero" + contador);
        } else {
            System.out.println("Foram entrados numeros" + contador);
        }
        if (contador != 0)
            System.out.println("\nA media dos numeros entrados e:" + soma / contador);
    }
}
