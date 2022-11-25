package aula241122.exercicioMaiorIdade;

public class Pessoa {

    String nome = "null", email = "null";
    int anoNasc = 0;

    public void pessoaMetodo() {

        System.out.println("O NOME da PESSOA é: " + nome + ", seu ANO DE NASCIMENTO é: " + anoNasc  + " e seu EMAIL é: " + email);

    }

    public void pessoaCalculaIdadeMetodo() {

        int resultado;

        resultado = 2022 - anoNasc;

        if (resultado <= 17) {
            System.out.println("É de menor!");
        } else {
            System.out.println("É de maior!");

        }

    }

}

