//Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73.

package aula251122.exercicioMediaAritmetica;

public class Main {

    public static void main(String[] args) {
        int soma = 0, cont = 0;
        for(int x = 13; x<=73; x++) {
            if(x%2==0) {
                soma+=x;
                cont++;
                System.out.println(soma/cont);
            }
        }
    }
}
