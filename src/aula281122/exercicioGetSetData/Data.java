package aula281122.exercicioGetSetData;
import aula281122.exercicioGetSetData.Main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {

    public int dia;
    public int mes;
    public int ano;


//construtorMetodo - define a data que determinado objeto (através de parâmetro), este método verifica se a data está correta, caso não esteja a data é configurada como: 01/01/0001.
    public static void construtorMetodo() {
        System.out.println(" ");
    }

    public int getDia(int dia) {
        this.dia = dia;
        return (int) ChronoUnit.DAYS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
    }

    public int getMes(int mes) {
        this.mes = mes;
        return (int) ChronoUnit.MONTHS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
    }




}
