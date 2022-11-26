//Ler um nome do teclado e ver se é igual ao seu nome. Imprimir conforme o caso: “NOME CORRETO” ou “NOME INCORRETO”.

package aula251122.exercicioNomeCorretoIncorreto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome = "Ana";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeComparar = entrada.nextLine();

        boolean comparar = nome.equalsIgnoreCase(nomeComparar);

        if(comparar == true) {
            System.out.println("NOME CORRETO");
        } else {
            System.out.println("NOME INCORRETO");
        }
        entrada.close();
    }
}
