//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
//Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
//Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

package aula251122.exercicioSaldoCliente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da conta do cliente: ");
        int nroConta = entrada.nextInt();
        System.out.println("Digite o saldo da conta do cliente: ");
        double saldo = entrada.nextDouble();
        System.out.println("Digite o débito da conta do cliente: ");
        double debito = entrada.nextDouble();
        System.out.println("Digite o crédito da conta do cliente: ");
        double credito = entrada.nextDouble();

        double saldoAtual = saldo - (debito + credito);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo com um montante de = " + saldoAtual);
        } else {
            System.out.println("Saldo Negativo!");
        }
        entrada.close();

    }
}
