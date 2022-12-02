//Identifique que informações são importantes e o que um funcionário faz.
//Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.
//Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário (double),
//a data de entrada no banco (String), seu RG (String)
//e um valor booleano que indique se o funcionário ainda está ativo na empresa ou se já foi mandado embora.
//Você deve criar alguns métodos de acordo com sua necessidade.
//Além deles, crie um método bonifica que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento.
//Crie, também, um método demite, que não recebe parâmetro algum, só modifica o valor booleano indicando que o funcionário não trabalha mais aqui.

package aula301122.exercicioFuncionario;
import aula241122.exercicioPessoa.Pessoa;
import aula301122.exercicioFuncionario.Funcionario;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Metodos Func1 = new Metodos(); //criação do objeto

        Scanner in = new Scanner(System.in);

//      System.out.println("O funcionário está ATIVO na empresa? (responda SIM ou NÃO) ");
//      Func1.atividade = in.nextBoolean(); CRIAR A VARIÁVEL

        System.out.println("Qual é o NOME do funcionário? ");
        Func1.nome = in.next();

        System.out.println("Qual é o RG do funcionário? ");
        Func1.RG = in.next();

        System.out.println("Qual é o DEPARTAMENTO do funcionário? ");
        Func1.departamento = in.next();

        System.out.println("Qual é o SALÁRIO do funcionário? ");
        Func1.salario = in.nextInt();

        System.out.println("Em qual DIA o funcionário entrou na empresa? ");
        Func1.diaEnt = in.nextInt();

        if ((Func1.diaEnt <= 0) && (Func1.diaEnt > 31)) {
            System.out.println("Dia Inválido!");
        } else {
            System.out.println("Em qual MÊS o funcionário entrou na empresa? (EM NÚMEROS) ");
            Func1.mesEnt = in.nextInt();

            if ((Func1.mesEnt <= 0) && (Func1.mesEnt > 12)) {
                System.out.println("Mês inválido!");
            } else {
                System.out.println("Em qual ANO o funcionário entrou na empresa? ");
                Func1.anoEnt = in.nextInt();

                if ((Func1.anoEnt <= 0) && (Func1.anoEnt > Func1.anoAtual)) {
                    System.out.println("Ano Inválido");
                } else {
                    Func1.Ent = Func1.anoEnt * 365;
                    Func1.Ent = Func1.Ent + (Func1.mesEnt * 31);
                    Func1.Ent = Func1.Ent + Func1.diaEnt;
                    Func1.Atual = Func1.anoAtual * 365;
                    Func1.Atual = Func1.Atual + (Func1.mesAtual * 31);
                    Func1.Atual = Func1.Atual + Func1.diaAtual;
                    Func1.Dias = Func1.Atual - Func1.Ent;

                    Func1.novoSalario = Func1.salario * (Func1.bonifica/100) + Func1.salario;

                }

                Func1.EntradaMetodo(); //chama o método

                Func1.bonificacaoMetodo(10); //chama o método

                Func1.novoSalarioMetodo();

            }
        }
    }
}