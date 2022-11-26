package aula251122.exercicioHeranca;


public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Jubileu";
        pessoa1.idade = 12;
        //pessoa1.cpf = "02805249003";
        //System.out.println(pessoa1.cpf); //O atributo CPF é privado, por isso não aparece.

        //pessoa1.mostrarCPF();

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Carolina";
        aluno1.idade = 28;
        aluno1.matricula = "051155";

        System.out.println("Aluna " + aluno1.nome + " com idade " + aluno1.idade + " e tem como matrícula " + aluno1.matricula);
    }
}

