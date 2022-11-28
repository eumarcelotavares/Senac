//Crie uma classe para representar uma pessoa, com os atributos nome, data de nascimento, nacionalidade, cpf, identidade, celular, endereço.
//Crie um método para imprimir todos os dados da pessoa.
//Crie um método para calcular a idade da pessoa e mostrar na tela, quantos anos, meses e dias ela tem de vida.
//Crie uma classe Aluno que herde os atributos da Pessoa e adicione a classe Aluno os atributos matrícula e disciplinas que ele está cursando
//(utilize 3 disciplinas).

package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Pessoa;
import aula241122.exercicioPessoa.Aluno;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o seu NOME? ");
        Pessoa.nome = in.nextLine();

        System.out.println("Qual é a sua NACIONALIDADE? ");
        Pessoa.nacionalidade = in.nextLine();

        System.out.println("Qual é o seu ENDEREÇO? ");
        Pessoa.endereco = in.nextLine();

        System.out.println("Qual é o seu CPF? ");
        Pessoa.cpf = in.nextInt();

        System.out.println("Qual é a sua IDENTIDADE? ");
        Pessoa.identidade = in.nextInt();

        System.out.println("Qual é o seu CELULAR? ");
        Pessoa.celular = in.nextInt();

        System.out.println("Em qual DIA você nasceu? ");
        Pessoa.diaNasc = in.nextInt();

        if ((Pessoa.diaNasc <= 0) && (Pessoa.diaNasc > 31)) {
            System.out.println("Dia Inválido!");
        } else {
            System.out.println("Em qual MÊS você nasceu? (em número) ");
            Pessoa.mesNasc = in.nextInt();

            if ((Pessoa.mesNasc <= 0) && (Pessoa.mesNasc > 12)) {
                System.out.println("Mês inválido!");
            } else {
                System.out.println("Em qual ANO você nasceu? ");
                Pessoa.anoNasc = in.nextInt();

                if ((Pessoa.anoNasc <= 0) && (Pessoa.anoNasc > Pessoa.anoAtual)) {
                    System.out.println("Ano Inválido");
                } else {
                    Pessoa.Nasc = Pessoa.anoNasc * 365;
                    Pessoa.Nasc = Pessoa.Nasc + (Pessoa.mesNasc * 31);
                    Pessoa.Nasc = Pessoa.Nasc + Pessoa.diaNasc;
                    Pessoa.Atual = Pessoa.anoAtual * 365;
                    Pessoa.Atual = Pessoa.Atual + (Pessoa.mesAtual * 31);
                    Pessoa.Atual = Pessoa.Atual + Pessoa.diaAtual;

                }

                Aluno aluno1 = new Aluno();

                aluno1.nome = Pessoa.nome;

                System.out.println("Qual a MATRÍCULA do aluno(a)? " + Pessoa.nome);
                aluno1.matricula = in.next();

                System.out.println("Qual a PRIMEIRA DISCIPLINA do aluno(a)? " + Pessoa.nome);
                aluno1.disciplinaUm = in.next();

                System.out.println("Qual a SEGUNDA DISCIPLINA do aluno(a)? " + Pessoa.nome);
                aluno1.disciplinaDois = in.next();

                System.out.println("Qual a TERCEIRA DISCIPLINA do aluno(a)? " + Pessoa.nome);
                aluno1.disciplinaTres = in.next();


                Pessoa.pessoaMetodo();

                System.out.println(" ");
                System.out.println("------------------------------------");
                System.out.println(" ");

                Pessoa.calculaIdadeMetodo();

                System.out.println(" ");
                System.out.println("------------------------------------");
                System.out.println(" ");

                Aluno.alunoMetodo();

            }
        }
    }
}