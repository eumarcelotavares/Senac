package aula211122.exercicioAluno;

public class Aluno {
    int matricula;
    String nome;

    static double media(double n1, double n2, double trabalho) {
        double resultado;

        resultado = (n1*0.4) + (n2*0.4) + (trabalho*0.2);

        if(resultado>7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        return resultado;
    }

}
