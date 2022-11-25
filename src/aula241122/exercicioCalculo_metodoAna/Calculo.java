package aula241122.exercicioCalculo_metodoAna;

public class Calculo {

    double a;
    double b;
    double resultado;

    public void soma() {
        resultado = a + b;
        System.out.println("A soma é " + resultado);
    }

    public void multiplicacao() {
        resultado = a * b;
        System.out.println("A multiplicação é " + resultado);
    }

    public void divisao() {
        resultado = a / b;
        System.out.println("A divisão é " + resultado);
    }

    public void subtracao() {
        resultado = a - b;
        System.out.println("A subtração é " + resultado);
    }

}
