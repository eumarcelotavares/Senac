package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Main;

public class Pessoa {

    String nome = "null";
    String nacionalidade = "null";
    String endereco = "null";
    int diaNasc = 0;
    int diaAtual = 0;
    int mesNasc = 0;

    int mesAtual = 0;
    int anoNasc = 0;

    int anoAtual = 0;
    int cpf = 0;
    int identidade = 0;
    int celular = 0;

    public void pessoaMetodo() {

        System.out.println("O NOME da PESSOA é : " + nome + " sua NACIONALIDADE é : " + nacionalidade + " seu ENDEREÇO é : " + endereco + " sua DATA DE NASCIMENTO é : " + diaNasc + "/" + mesNasc + "/" + anoNasc + "/" + " seu CPF é : " + cpf + " sua IDENTIDADE é : " + identidade + " e o seu CELULAR é : " + celular);

    }

    public void calculaIdadeMetodo() {

        int calculaIdadeDia, calculaIdadeMes, calculaIdadeAno;

        calculaIdadeDia = diaNasc - this.diaAtual;


    }

}
