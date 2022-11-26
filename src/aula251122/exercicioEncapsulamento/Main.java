package aula251122.exercicioEncapsulamento;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Jubileu";
        pessoa1.idade = 12;
        //pessoa1.cpf = "02805249003";
        //System.out.println(pessoa1.cpf); //O atributo CPF é privado, por isso não aparece.

        pessoa1.mostrarCPF();
    }

}
