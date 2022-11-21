package aula211122.exercicioFutebol;

//Crie uma classe para representar um jogador de futebol, com os atributos:
//nome, posição, data de nascimento, nacionalidade, altura e peso.
//Crie um método para imprimir todos os dados do jogador.
//Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar.
//Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38
//e os atacantes aos 35.

public class Jogador {

    String nome = "void";
    String posicao;
    int anoNas;
    int anoAtual;
    String nacionalidade;
    double altura;
    double peso;

    static int aposentadoria(int anoNas, int anoAtual) {
        int resultado;

        resultado = anoAtual - anoNas;

        if (resultado >= 40) {
            System.out.println("Aposentadoria para os DEFENSORES!");
        } else if (resultado >= 38) {
            System.out.println("Aposentadoria para os MEIO CAMPISTAS!");
        } else if (resultado >= 35) {
            System.out.println("Aposentadoria para os ATACANTES!");
    } else {
            System.out.println("Pode continuar a carreira!");
        }
        return resultado;
    }

}
