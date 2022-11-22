package aula211122.exercicioFutebol_metodoMateus;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Jogador jogador1 = new Jogador();
        System.out.println("Digite o nome do Jogador: ");
        jogador1.nome = entrada.next();

        System.out.println("Digite o número da posiçao do Jogador: \n 1 = atacante \n 2 = meio-campo \n 3 = defesa  ");
        jogador1.posicao = entrada.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        jogador1.nascimento = entrada.nextInt();

        System.out.println("Digite a nacionalidade: ");
        jogador1.nacionalidade = entrada.next();

        System.out.println("Digite a altura: ");
        jogador1.altura = entrada.nextDouble();

        System.out.println("Digite o peso: ");
        jogador1.peso = entrada.nextDouble();


        System.out.println("Nome do Jogador: " + jogador1.nome);

        System.out.println(" Posição:" + jogador1.posicao);

        System.out.println(" Ano de nascimento: " + jogador1.nascimento);
        jogador1.idade = jogador1.ano - jogador1.nascimento;

        System.out.println(" Idade: " + jogador1.idade);

        System.out.println(" Nacinalidade: " + jogador1.nacionalidade);

        System.out.println(" Altura: " + jogador1.altura);

        System.out.println(" Peso: " + jogador1.peso);

        jogador1.aposentar();
        entrada.close();
    }

}
