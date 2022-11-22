package aula211122.exercicioCachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro poodle = new Cachorro(); //CONSTRUTOR
        poodle.nome = "Bilu";
        poodle.corOlhos = "marrom";
        poodle.peso = 12;
        poodle.quantPatas = 4;
        poodle.tamanho = 31;

        Cachorro shitzu = new Cachorro(); //CONSTRUTOR
        shitzu.nome = "Chip";
        shitzu.corOlhos = "branco com dourado";
        shitzu.peso = 2;
        shitzu.quantPatas = 3;
        shitzu.tamanho = 15;

        Cachorro labrador = new Cachorro(); //CONSTRUTOR
        labrador.nome = "Raiska";
        labrador.corOlhos = "preto";
        labrador.peso = 45;
        labrador.quantPatas = 6;
        labrador.tamanho = 70;

        System.out.println("O nome dos cachorros são:" + poodle.nome + " " + shitzu.nome + " " + labrador.nome);

        labrador.falar();
        shitzu.falar();
        poodle.falar();

        labrador.andar();
        shitzu.andar();
        poodle.andar();

        labrador.comer();
        shitzu.comer();
        poodle.comer();


    }
}
