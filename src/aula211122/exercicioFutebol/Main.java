package aula211122.exercicioFutebol;

//Crie uma classe para representar um jogador de futebol, com os atributos:
//nome, posição, data de nascimento, nacionalidade, altura e peso.
//Crie um método para imprimir todos os dados do jogador.
//Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar.
//Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38
//e os atacantes aos 35.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Jogador j1 = new Jogador();
        System.out.println("Digite o NOME do jogador:");
        j1.nome = entrada.nextLine();
        System.out.println("Em qual POSIÇÃO o jogador " + j1.nome + " joga?");
        j1.posicao = entrada.nextLine();
        System.out.println("Qual a NACIONALIDADE do jogador " + j1.nome + "?");
        j1.nacionalidade = entrada.nextLine();
        System.out.println("Qual o ANO de nascimento do jogador " + j1.nome + "?");
        j1.anoNas = entrada.nextInt();
        System.out.println("Qual é o ANO da temporada atual? ");
        j1.anoAtual = entrada.nextInt();
        System.out.println("Qual a ALTURA do jogador " + j1.nome + "?");
        j1.altura = entrada.nextDouble();
        System.out.println("Qual o PESO do jogador " + j1.nome + "?");
        j1.peso = entrada.nextDouble();

        System.out.println(Jogador.aposentadoria(j1.anoNas, j1.anoAtual) + " anos de idade possui o jogador " + j1.nome);

    }
}




