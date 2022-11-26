//Imprimir a tabuada do número X. (x = determinado pelo usuário)

package aula251122.exercicioTabuada;
import java.util.Scanner;
public class Main {

    public class Tabuada {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int x = entrada.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(x + " x " + i + " = " + x * i);
            }

            entrada.close();

        }
    }
}
