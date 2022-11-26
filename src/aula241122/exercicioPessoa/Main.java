//Crie uma classe para representar uma pessoa, com os atributos nome, data de nascimento, nacionalidade, cpf, identidade, celular, endereço.
//Crie um método para imprimir todos os dados da pessoa.
//Crie um método para calcular a idade da pessoa e mostrar na tela, quantos anos, meses e dias ela tem de vida.
//Crie uma classe Aluno que herde os atributos da Pessoa e adicione a classe Aluno os atributos matrícula e disciplinas que ele está cursando
//(utilize 3 disciplinas).

package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa P1 = new Pessoa();

        System.out.println("Digite o DIA ATUAL: ");
        P1.diaAtual = entrada.nextInt();
        System.out.println("Digite o MÊS ATUAL (número): ");
        P1.mesAtual = entrada.nextInt();
        System.out.println("Digite o ANO ATUAL: ");
        P1.anoAtual = entrada.nextInt();



        P1.calculaIdadeMetodo();
        P1.pessoaMetodo();

    }
}