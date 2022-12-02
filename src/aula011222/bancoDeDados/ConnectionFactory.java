//abra o MySQL 8.0 Command Line Client
//digite o comando > create database javaWeb;
//digite o comando > show dataBases;
//digite o comando > use javaweb;
//digite o comando >

package aula011222.bancoDeDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/javaweb","eumarcelotavares","eu001899");
        } catch (SQLException e){
            throw new RuntimeException(e); }
    }
}
