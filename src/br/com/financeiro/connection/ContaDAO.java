package br.com.financeiro.connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.financeiro.model.Conta;

public class ContaDAO {
	private Connection connection;
    
    public List<String> getAll() throws SQLException {
    	
    	List<String> results = new ArrayList<>();
    	
	    String query ="SELECT * FROM T_SIP_CONTA";
	    
	    try (Statement statement = connection.createStatement();
	    		ResultSet resultSet = statement.executeQuery(query)) {
	    	
	    	while (resultSet.next()) {
	    		results.add(resultSet.getString("T_SIP_CONTA"));
	    	}
	    }
    
    	return results;
    }
    
    public void insert(Conta conta) {
    	PreparedStatement preparedStatement = null;
    	String query = "INSERT INTO T_SIP_CONTA (id_conta, tipo_conta, dt_abertura, id_usuario,saldo ) VALUES (?,?,?,?,?)";
    	try {
    		FintechDBManager.establishConnection();
    		preparedStatement = connection.prepareStatement(query);
    		preparedStatement.setInt(1, conta.getNumeroConta());
    		preparedStatement.setString(2, conta.getTipoConta());
    		preparedStatement.setDate(3, conta.getDataAbertura());
    		int idUsuario = 1;
    		preparedStatement.setInt(4, idUsuario);
    		preparedStatement.setDouble(5, conta.getSaldo());
    		preparedStatement.executeUpdate();
		        } catch (SQLException e) {
		          e.printStackTrace();
		        } finally {
		          try {
		        	preparedStatement.close();
		        	FintechDBManager.closeConnection();
		          } catch (SQLException e) {
		            e.printStackTrace();
		          }
    	}
    }
    
    
}
