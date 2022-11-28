package aula281122.exercicioPessoa_metodoAna;

public class Aluno extends Pessoa{

    public String matricula;
    public String disciplina1;
    public String disciplina2;
    public String disciplina3;

    public void imprimirDadosAluno() {
        System.out.println("Matrícula = " + matricula);
        System.out.println("Disciplina = " + disciplina1);
        System.out.println("Disciplina = " + disciplina2);
        System.out.println("Disciplina = " + disciplina3);
    }
}
