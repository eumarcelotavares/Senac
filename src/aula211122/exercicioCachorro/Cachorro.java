package aula211122.exercicioCachorro;

public class Cachorro {

    public String nome;
    public int peso;
    public String corOlhos;
    public int quantPatas;
    int tamanho;

    public void falar() {
        if (tamanho > 60) {
            System.out.println("Woof!, Woof!");
        } else if (tamanho > 30) {
            System.out.println("Ruff!, Ruff!");
        } else {
            System.out.println("Au!, Au!");
        }
    }

    public void andar() {
        if (tamanho > 60) {
            System.out.println("10kg de ração por mês");
        } else if (tamanho > 30) {
            System.out.println("5kg de ração por mês");
        } else {
            System.out.println("Menos de 5kg de ração por mês");
        }
    }

    public void comer() {
        if (peso > 30) {
            System.out.println("Come muito!");
        } else if (peso > 15) {
            System.out.println("come mais ou menos!");
        } else {
            System.out.println("Come pouco!");
        }
    }
}
