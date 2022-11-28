package aula281122.exercicioPessoa_metodoAna;

public class Main {

    public static void main(String[] args) {

        Aluno pessoa1 = new Aluno();

        pessoa1.nome = "Ana";
        pessoa1.nacionalidade = "Brasileira";
        pessoa1.celular = "54992104694";

        pessoa1.setCpf("02805249003");
        pessoa1.setIdentidade("9116732653");

        pessoa1.endereco = "Rua Itália";
        pessoa1.dia = 29;
        pessoa1.mes = 10;
        pessoa1.ano = 1997;

        pessoa1.matricula = "051155";
        pessoa1.disciplina1 = "Lógica de Programação";
        pessoa1.disciplina2 = "HTML e CSS";
        pessoa1.disciplina3 = "Java Java";

        pessoa1.imprimirDados(); //pessoa
        pessoa1.imprimirDadosAluno(); //aluno
        System.out.println("CPF = " + pessoa1.getCpf());
        System.out.println("Identidade = " + pessoa1.getIdentidade());
        pessoa1.mostrarIdadeSimples();

        System.out.println("Anos = " + pessoa1.mostrarIdade(pessoa1.dia, pessoa1.mes, pessoa1.ano));
        System.out.println("Meses = " + pessoa1.mostrarIdadeMes(pessoa1.mes));
        System.out.println("Dias = " + pessoa1.mostrarIdadeDias(pessoa1.dia));

    }

}
