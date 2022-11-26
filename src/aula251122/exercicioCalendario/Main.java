package aula251122.exercicioCalendario;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //pegando a data do sistema
        Calendar cal = GregorianCalendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        //recebendo a data de nascimento usuario
        Scanner in = new Scanner(System.in);
        System.out.println("Dia em que você nasceu: ");
        int diaNasc = in.nextInt();
        if ((diaNasc<=0) && (diaNasc>31))
        {
            System.out.println("Dia Invalido");
        }
        else
        {
            System.out.println("Mes em que você nasceu: ");
            int mesNasc = in.nextInt();
            if ((mesNasc<=0) && (mesNasc>12))
            {
                System.out.println("Mes invalido");
            }
            else
            {
                System.out.println("Ano em que você nasceu: ");
                int anoNasc = in.nextInt();
                if ((anoNasc<=0) && (anoNasc>anoAtual))
                {
                    System.out.println("Ano Invalido");
                }
                else
                {
                    int Nasc = anoNasc*365;
                    Nasc = Nasc+(mesNasc*31);
                    Nasc = Nasc+diaNasc;
                    int Atual = anoAtual*365;
                    Atual = Atual+(mesAtual*31);
                    Atual = Atual+diaAtual;

                    System.out.println("Você tem "+(Atual-Nasc)+" dias ou "+((Atual-Nasc)/31)+" meses ou "+((Atual-Nasc)/365)+" anos.");

                }
            }
        }
    }
}
