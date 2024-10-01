package br.com.financeiro.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.financeiro.model.Despesa;


public class DespesaDAO {
	
	private Connection connection;
	
	public DespesaDAO(Connection connection) {
		this.connection = connection;
	}
	

	public void incluir (Despesa despesa) {
		String sql = "INSERT INTO T_SIP_DESPESA (ID_DESPESA, DESPESA, VL_DESPESA,DT_DESPESA)" + "VALUIES (?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, despesa.getId_Despesa());
			ps.setString(2, despesa.getDespesa());
			ps.setInt(3, despesa.getVlDespesa());
			ps.setDate (4, despesa.getDate());
			
			ps.execute();
			
			ps.close();
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    public void excluir (Despesa despesa) {
		
    	String sql = "DELETE FROM T_SIP_DESPESA WHERE ID_DESPESA = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, despesa.getId_Despesa());
			
			ps.execute();
			
			ps.close();
			connection.close();
			System.out.println("Ok");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
	}
	
    public void alterar (Despesa despesa) {
		
    	String sql = "UPDATE DESPESA SET T_SIP_DESPESA WHERE (ID_DESPESA, DESPESA, VL_DESPESA, DT_DESPESA)" + "VALUIES (?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, despesa.getId_Despesa());
		
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
    	String sql = "SELECT * FROM T_SIP_DESPESA WHERE DESPESA ?";
		
    	try {
			PreparedStatement ps = connection.prepareStatement(sql);
		    
			ps.setInt(1, despesa.getId_Despesa());
			
			ResultSet rs = ps.executeQuery();
			Despesa d = new despesa();
			
			if (rs.next()) {
				d.setId_despesa(rs.getInt(Id_Despesa));
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

   

