package br.com.financeiro.connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.financeiro.model.Transacao;

public class TransacaoDAO {

	private Connection conection;
	
	public TransacaoDAO (Connection connection) {
		this.conection = connection;
		
	}
	   
	public void incluir (Transacao transacao) {
		String sql = "INSERT INTO T_SIP_TRANSACAO (CT_DESTINO, DT_TRANSACAO, VL_TRANSACAO)" + "VALUIES (?,?,?)";
		try {
			Connection connection;
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, (int) transacao.getCt_destino());
			Date date;
			ps.setDate(1, date);
			ps.setDouble(1, transacao.getVl_transacao());
			
		
			ps.execute();
			
			ps.close();
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    public void excluir (Transacao transacao) {
		
    	String sql = "DELETE FROM T_SIP_TRANSACAO WHERE ID_USUARIO = ?";
		try {
			PreparedStatement ps = conection.prepareStatement(sql);
		    
			ps.setInt(1, transacao.gitId_usuario());
			
			ps.execute();
			
			ps.close();
			Connection connection;
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
	}
    
    public void alterar (Transacao transacao) {
		
    	String sql = "UPDATE TRANSACAO SET T_SIP_TRANSACAO WHERE (CT_DESTINO, DT_TRANSACAO, VL_TRANSACAO)" + "VALUIES (?,?,?)";
		try {
			Connection connection;
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, transacao.getId_usuario());
		
			ps.execute();
			
			ps.close();
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void listarTodos () {
    	String sql = "SELECT * FROM T_SIP_TRANSACAO WHERE TRANSACAO ?";
		
    	try {
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, transacao.getId_Despesa());
			
			ResultSet rs = ps.executeQuery();
			Despesa d = new transacao();
			
			if (rs.next()) {
				d.setId_despesa(rs.getInt(Id_Usuario));
			}
			    
			
			ps.execute();
			
			ps.close();
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
}
