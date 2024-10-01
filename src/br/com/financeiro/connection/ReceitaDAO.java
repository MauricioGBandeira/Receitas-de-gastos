package br.com.financeiro.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.financeiro.model.Despesa;
import br.com.financeiro.model.Receita;

public class ReceitaDAO {
		
		private Connection connection;
		
		public ReceitaDAO(Connection connection) {
			this.connection = connection;
		}
		
		public void incluir (Receita receita) {
			String sql = "INSERT INTO T_SIP_RECEITA (ID_USUARIO, DESCRICAO, VL_RECEITA, DT_RECEBIMENTO)" + "VALUIES (?,?,?,?)";
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
			    
				Object receira;
				ps.setInt(1, receira.getId_Usuario());
				ps.setString(2, receita.getDescricao());
				ps.setDouble(3, receita.getVl_Receita());
				ps.setDate (4, receita.getDt_recebimento());
				
				ps.execute();
				
				ps.close();
				connection.close();
				System.out.println("Ok");
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	    public void excluir (Receita receita) {
			
	    	String sql = "DELETE FROM T_SIP_RECEITA WHERE ID_USUARIO = ?";
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
			    
				ps.setInt(1, receita.getId_receita());
				
				ps.execute();
				
				ps.close();
				connection.close();
				System.out.println("Ok");
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    	
		}
		
	
	    public void alterar (Receita receita) {
			
	    	String sql = "UPDATE RECEITA SET T_SIP_RECEITA WHERE (ID_USUARIO, DESCRICAO, VL_RECEITA, DT_RECEBIMENTO)" + "VALUIES (?,?,?,?)";
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
			    
				ps.setInt(1, receita.getId_usuario());
			
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
	    	String sql = "SELECT * FROM T_SIP_RECEITA WHERE RECEITA ?";
			
	    	try {
				PreparedStatement ps = connection.prepareStatement(sql);
			    
				ps.setInt(1, receita.getId_usuario());
				
				ResultSet rs = ps.executeQuery();
				Despesa d = new receita();
				
				if (rs.next()) {
					d.setId_despesa(rs.getInt(Id_usuario);
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
