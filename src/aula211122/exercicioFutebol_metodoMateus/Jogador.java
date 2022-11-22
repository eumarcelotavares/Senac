package aula211122.exercicioFutebol_metodoMateus;

public class Jogador {

    String nome;
    int posicao;
    int nascimento;
    int ano = 2022;
    String nacionalidade;
    double altura;
    double peso;

    int idade = nascimento - ano;

    public void aposentar() {
        if (posicao == 1) {
            System.out.println("Faltam  " + (idade - 35) + " anos para se aposentar");
        }

        else if (posicao == 2) {
            System.out.println("Faltam  " + (idade - 38) + " anos para se aposentar");
        }

        else if (posicao == 3) {
            System.out.println("Faltam  " + (idade - 40) + " anos para se aposentar");

        }

    }

}
