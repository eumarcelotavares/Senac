package aula211122.exercicioFutebol_metodoAna;

public class Jogador {

    String nome;
    String posicao;
    int anoNasc;
    String nacionalidade;
    int altura;
    double peso;

    public void imprimirDados() {
        System.out.println(
                "O Jogador é " + nome + " e joga na posição " + posicao + " , e nasceu no ano de " + anoNasc
                        + " , a nacionalidade é " + nacionalidade + " , e tem altura e peso de " + altura + " " + peso);

    }

    public void idade() {
        System.out.println((2022 - anoNasc) + " anos.");
    }

    public void aposentar() {

        boolean compararDefesa = posicao.equalsIgnoreCase("defesa");
        boolean compararMC = posicao.equalsIgnoreCase("meio-campo");
        boolean compararAtaque = posicao.equalsIgnoreCase("atacante");

        if(compararDefesa == true) {
            System.out.println("Faltam " + (40 - (2022 - anoNasc)) + " anos para o jogador se aposentar.");
        } else if(compararMC == true) {
            System.out.println("Faltam " + (38 - (2022 - anoNasc)) + " anos para o jogador se aposentar.");
        } else if(compararAtaque == true) {
            System.out.println("Faltam " + (35 - (2022 - anoNasc)) + " anos para o jogador se aposentar.");
        } else {
            System.out.println("Não sei!");
        }


    }

}
