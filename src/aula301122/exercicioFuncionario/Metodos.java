package aula301122.exercicioFuncionario;
import aula241122.exercicioPessoa.Pessoa;
import aula301122.exercicioFuncionario.Funcionario;
import aula301122.exercicioFuncionario.Main;

public class Metodos extends Funcionario {



    public static void EntradaMetodo() {

        System.out.println("O Funcionário " + nome + " tem " + Dias + " dias ou " + ((Atual - Ent) / 31) + " meses ou " + ((Atual - Ent) / 365) + " anos trabalhando em nossa empresa.");

    }

    public  void bonificacaoMetodo(int bonifica) {

        if (Dias >= 1000) {
            System.out.println("O bônus é de: " + bonifica + "%");
        } else {

            System.out.println("Sem bônus!");

        }

        bonificaPerc = bonifica/100;

    }

    public static void salarioBonusMetodo() {

        salarioBonus = salario * bonificaPerc + salario;
        System.out.println("O novo salário do Funcionário " + nome + " é de: " + "R$ "+ salarioBonus);

    }


}


