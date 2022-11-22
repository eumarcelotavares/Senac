package aula211122.exercicioFutebol_metodoAna;

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();

        jogador1.altura = 192; //cm
        jogador1.anoNasc = 1985;
        jogador1.nacionalidade = "jamaicano";
        jogador1.nome = "Fredolino";
        jogador1.peso = 83;
        jogador1.posicao = "defesa"; // entrada.nextLine();

        jogador1.imprimirDados();
        jogador1.idade();
        jogador1.aposentar();

    }

}
