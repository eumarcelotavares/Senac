//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
//Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
//Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

package aula251122.exercicioQuantidadeEstoque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade atual do estoque: ");
        int quantidadeAtual = entrada.nextInt();
        System.out.println("Digite a quantidade máxima do estoque: ");
        int quantidadeMaxima = entrada.nextInt();
        System.out.println("Digite a quantidade mínima do estoque: ");
        int quantidadeMinima = entrada.nextInt();

        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra!");
        } else {
            System.out.println("Efetuar compra!");
        }

        entrada.close();

    }
}
