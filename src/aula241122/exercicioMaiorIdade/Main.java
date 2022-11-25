//Crie um programa de determine se uma pessoa possui uma idade superior a 17 anos.
//O usuário deverá informar o nome, ano de nascimento e email da pessoa.
//É obrigatório utilizar classe para representar a pessoa.

package aula241122.exercicioMaiorIdade;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa P1 = new Pessoa();
        System.out.println("Digite o NOME:");
        P1.nome = entrada.next();
        System.out.println("Digite o ANO DE NASCIMENTO:");
        P1.anoNasc = entrada.nextInt();
        System.out.println("Digite o E-MAIL:");
        P1.email = entrada.next();

        P1.pessoaMetodo();
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");

        P1.pessoaCalculaIdadeMetodo();
    }
}