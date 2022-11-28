package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Pessoa;
import aula241122.exercicioPessoa.Main;


public class Aluno extends Pessoa {
    public static String matricula;
    public static String disciplinaUm;
    public static String disciplinaDois;
    public static String disciplinaTres;

    public static void alunoMetodo() {

        System.out.println("O Aluno(a) " + nome + " , com matrícula número: " + matricula + " , está apto(a) para cursar as disciplinas de: " + disciplinaUm + ", " + disciplinaDois  + " e " + disciplinaTres);

    }

}
