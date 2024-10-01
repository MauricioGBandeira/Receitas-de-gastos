package br.com.financeiro.connection;




import java.sql.Date;

import br.com.financeiro.model.Conta;
import br.com.financeiro.model.Despesa;
import br.com.financeiro.model.DespesaDAO;
import br.com.financeiro.model.Usuario;
import oracle.sql.DATE;



public class TesteView {
		    public static void main(String[] args) { 
		    	//Instanciar DAOs
		    	ContaDAO contaDao = new ContaDAO();
		    	
		    	
		    	
		    	//Instanciar objeto Usuario
		    	Usuario usuario = new Usuario();
		    			usuario.setCpf("14429584052");
		    			usuario.setNome("Usuario 1");
		    			usuario.setEmail("usuario1@email.com");
		    			usuario.setSenha("senha12345");
		    			usuario.setContato(970926669);
		    			
		    	//Instanciar objeto Conta 1
		        Conta conta = new Conta();
		        int numeroConta = 663446;
		        double saldoConta = 3000.00;
		        conta.setNumeroConta(numeroConta);
		        conta.setSaldo(saldoConta);
		        conta.setProprietario(usuario);
		        conta.registrarConta(conta.getNumeroConta(), conta.getSaldo(), conta.getProprietario());
		        //Inserir objeto Conta no Banco de Dados
		        contaDao.insert(conta);
		        System.out.println("Conta Cadastrada!");
		        
		    	//Listar objetos Conta cadastrados no Banco de Dados
		       
		     
		  
		    	

	 }

			private static br.com.financeiro.connection.DespesaDAO DespesaDAO() {
				// TODO Auto-generated method stub
				return null;
			}
}
