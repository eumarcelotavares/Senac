package aula241122.exercicioPessoa;
import aula241122.exercicioPessoa.Main;

import java.util.*;

public class Pessoa {

    static String nome = "null";
    static String nacionalidade = "null";
    static String endereco = "null";
    static int cpf = 0;
    static int identidade = 0;
    static int celular = 0;
    static Calendar cal = GregorianCalendar.getInstance();
    static int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    static int mesAtual = cal.get(Calendar.MONTH) + 1;
    static int anoAtual = cal.get(Calendar.YEAR);
    static int diaNasc = 0;
    static int mesNasc = 0;
    static int anoNasc = 0;
    static int Nasc = 0;
    static int Atual = 0;

    public static void pessoaMetodo() {

        System.out.println("O NOME da PESSOA é : " + nome + " sua NACIONALIDADE é : " + nacionalidade + " seu ENDEREÇO é : " + endereco + " seu CPF é : " + cpf + " sua IDENTIDADE é : " + identidade + " e o seu CELULAR é : " + celular + " sua DATA DE NASCIMENTO é : " + diaNasc + "/" + mesNasc + "/" + anoNasc);

    }

    public static void calculaIdadeMetodo() {

        System.out.println("Você tem " + (Atual - Nasc) + " dias ou " + ((Atual - Nasc) / 31) + " meses ou " + ((Atual - Nasc) / 365) + " anos.");

    }
}