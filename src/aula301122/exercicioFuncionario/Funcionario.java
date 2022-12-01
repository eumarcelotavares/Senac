package aula301122.exercicioFuncionario;
import aula301122.exercicioFuncionario.Main;
import java.util.*;

public class Funcionario {

   Main Func1 = new Main(); //criação do objeto

   static String nome = "null";
   static String departamento = "null";
   static Double salario;
     static String dataEntrada = "null";
   static String RG = "null";

   static Calendar cal = GregorianCalendar.getInstance();
   static int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
   static int mesAtual = cal.get(Calendar.MONTH) + 1;
   static int anoAtual = cal.get(Calendar.YEAR);
   static int diaEnt = 0;
   static int mesEnt = 0;
   static int anoEnt = 0;
   static int Ent = 0;
   static int Atual = 0;
   static int Dias;
   static Double salarioBonus;
   static int bonificaPerc;




}
