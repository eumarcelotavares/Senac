package aula011222.bancoDeDados;

import java.sql.SQLException;
import java.util.Calendar;

public class InsercaoDados {
    public static void main(String[] args) throws SQLException {

        Contato contato = new Contato();
        contato.setNome("Ana");
        contato.setEmail("anappase@gmail.com");
        contato.setEndereco("Rua Itália 298");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDao dao = new ContatoDao();

        dao.adiciona(contato);

        System.out.println("Gravado!");
    }
}
