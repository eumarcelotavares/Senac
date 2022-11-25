//Crie os seguintes objetos:
//        1 - Cadeira
//        2 - Camisa
//        3 - Tênis
//        4 - Celular
//        5 - Casa

package aula241122.exercicioCriaObjetos;

import aula241122.exercicioCriaObjetos.Cadeira;
import aula241122.exercicioCriaObjetos.Camisa;
import aula241122.exercicioCriaObjetos.Casa;
import aula241122.exercicioCriaObjetos.Celular;
import aula241122.exercicioCriaObjetos.Tenis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cadeira cadeiraEscritorio = new Cadeira();
        System.out.println("Digite a COR da CADEIRA:");
        cadeiraEscritorio.cor = entrada.nextLine();
        System.out.println("Digite a QUANTIDADE de CADEIRAS disponíveis:");
        cadeiraEscritorio.quantidade = entrada.nextInt();

        cadeiraEscritorio.cadeiraMetodo();

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println(" ");


        Camisa camisaEsporte = new Camisa();
        System.out.println("Digite a COR da CAMISA:");
        camisaEsporte.cor = entrada.next();
        System.out.println("Digite a QUANTIDADE da CAMISAS disponíveis:");
        camisaEsporte.quantidade = entrada.nextInt();

        camisaEsporte.camisaMetodo();

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println(" ");


        Tenis TenisEsporte = new Tenis();
        System.out.println("Digite a COR do TÊNIS:");
        TenisEsporte.cor = entrada.next();
        System.out.println("Digite a QUANTIDADE de TÊNIS disponíveis:");
        TenisEsporte.quantidade = entrada.nextInt();

        TenisEsporte.tenisMetodo();

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println(" ");


        Celular CelularSamsung = new Celular();
        System.out.println("Digite o MODELO do CELULAR:");
        CelularSamsung.modelo = entrada.next();
        System.out.println("Digite a QUANTIDADE de CELULARES disponíveis:");
        CelularSamsung.quantidade = entrada.nextInt();

        CelularSamsung.celularMetodo();

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println(" ");

        Casa minhaCasaMinhaVida = new Casa();
        System.out.println("Digite a QUANTIDADE de DORMITÓRIOS:");
        minhaCasaMinhaVida.dormitorios = entrada.nextInt();
        System.out.println("Digite a METRAGEM da CASA:");
        minhaCasaMinhaVida.metragem = entrada.nextInt();

        minhaCasaMinhaVida.casaMetodo();
        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println(" ");
    }
}
