package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Main;

public class Pessoa {

    public String nome = "null";
    public String nacionalidade = "null";
    public String endereco = "null";
    public int diaNasc = 0;
    public int diaAtual = 0;
    public int mesNasc = 0;
    public int mesAtual = 0;
    public int anoNasc = 0;
    public int anoAtual = 0;
    public int cpf = 0;
    public int identidade = 0;
    public int celular = 0;

    public void pessoaMetodo() {

        System.out.println("O NOME da PESSOA é : " + nome + " sua NACIONALIDADE é : " + nacionalidade + " seu ENDEREÇO é : " + endereco + " sua DATA DE NASCIMENTO é : " + diaNasc + "/" + mesNasc + "/" + anoNasc + "/" + " seu CPF é : " + cpf + " sua IDENTIDADE é : " + identidade + " e o seu CELULAR é : " + celular);

    }

    public void calculaIdadeMetodo() {

        int calculaIdade, calculaIdadeDia, calculaIdadeMes, calculaIdadeAno;

        calculaIdadeDia = diaNasc - diaAtual;
        calculaIdadeMes = mesNasc - mesAtual;
        calculaIdadeAno = anoNasc - anoAtual;

    }

}
