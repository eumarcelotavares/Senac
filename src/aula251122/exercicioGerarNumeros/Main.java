//Gerar 20 números de 1000 a 1999 e escrever aqueles que divididos por 11 dão um resto igual a 5.

package aula251122.exercicioGerarNumeros;

public class Main {

    public static void main(String[] args) {

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                System.out.println(i);

            }
        }
    }
}
