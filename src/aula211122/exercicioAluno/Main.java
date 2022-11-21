package aula211122.exercicioAluno;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno1.nome = entrada.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        aluno1.matricula = entrada.nextInt();
        System.out.println("Digite a primeira nota:");
        double a = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        double b = entrada.nextDouble();
        System.out.println("Digite a terceira nota:");
        double c = entrada.nextDouble();

        System.out.println("Aluno(a) " + aluno1.nome
                + " tem média " + Aluno.media(a, b, c));

        entrada.close();
    }
}