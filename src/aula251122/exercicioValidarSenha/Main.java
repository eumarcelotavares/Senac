//Escreva um programa que repita a leitura de uma senha até que ela seja válida.
//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
//Considere que a senha correta é o valor 2002.

package aula251122.exercicioValidarSenha;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "null";

        do {
            System.out.println("Digite a senha: ");
            texto = entrada.nextLine();
            if (!texto.equals("2002")) {
                System.out.println("Senha Inválida!");
            }
        } while (!texto.equals("2002"));

        System.out.println("Acesso Permitido!");

    }
}
