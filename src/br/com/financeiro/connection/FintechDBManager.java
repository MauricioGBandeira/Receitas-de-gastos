package br.com.financeiro.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class FintechDBManager {
	private final String url = "oracle.fiap.com.br"; 
	private final String username = "RM551646";
	private final String password ="050496";

	private static Connection connection ;
	
	public static Connection establishConnection() throws SQLException {
	     
	
        try{
        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        connection = DriverManager.getConnection(url, username, password);
	        System.out.println("Conectado!");
       
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("Erro de conexao!");
        }
        return connection;
    }
 
    
    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            
        }
    }
}
