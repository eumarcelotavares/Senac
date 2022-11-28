package aula281122.exercicioPessoa_metodoAna;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

    public class Pessoa {

        public String nome;
        public int dia;
        public int mes;
        public int ano;
        public String nacionalidade;
        public String celular;
        public String endereco;

        private String cpf;
        private String identidade;

        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public String getIdentidade() {
            return identidade;
        }
        public void setIdentidade(String identidade) {
            this.identidade = identidade;
        }
        public void imprimirDados() {
            System.out.println("Nome = " + nome);
            System.out.println("Nacionalidade = " + nacionalidade);
            System.out.println("Celular = " + celular);
            System.out.println("Endereço = " + endereco);
            System.out.println("Nascimento = " + dia + "/"+ mes + "/"+ ano);

        }

        public void mostrarIdadeSimples() {
            int quantAnos = 2022 - ano;
            int quantMeses = 12 - mes;
            int quantDias = 31 - dia;

            System.out.println("O aluno tem " + quantAnos + " anos, "
                    + quantMeses + " meses e " + quantDias + " dias.");
        }

        public int mostrarIdade(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            return (int) ChronoUnit.YEARS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
        }

        public int mostrarIdadeMes( int mes) {
            this.mes = mes;
            return (int) ChronoUnit.MONTHS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
        }

        public int mostrarIdadeDias( int dia) {
            this.dia = dia;
            return (int) ChronoUnit.DAYS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
        }

}
