package br.com.financeiro.model;

import java.util.Date;

public class Despesa extends Transacao {
    private Conta contaOrigem;
    private String formaPagamento;
	public String setDespesa;
	public int getId_despesa;

    public Despesa() {
        super();
    }

    public Despesa(Date data, double valor, String descricao, Conta contaOrigem, String formaPagamento) {
        super(data, valor, descricao);
        this.contaOrigem = contaOrigem;
        this.formaPagamento = formaPagamento;
    }

    public Despesa(double valor, String descricao, Date data) {
		// TODO Auto-generated constructor stub
	}
      
      
  	public int getVlDespesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDespesa() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.sql.Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVl_despesa(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public Conta getVl_despesa() {
        return null;
    }

		

    public void subtrairSaldo(Double valor, Conta contaOrigem) {
        double saldoCalculado = contaOrigem.getSaldo()-valor;
        contaOrigem.setSaldo(saldoCalculado);
        System.out.println("Saldo atual: "+contaOrigem.getSaldo());
    }

    public void incluirDespesa(Date data, double valor, String descricao) {
        Despesa despesa = new Despesa(valor, descricao, data);
        System.out.println("\nIncluir Despesas: ");
        System.out.println("Despesa Registrada valor: "+despesa.getValor());
        System.out.println("Despesa Registrada data: "+despesa.getData());
        System.out.println("Despesa anterior: "+contaOrigem.getSaldo());
        subtrairSaldo(valor, contaOrigem);
    }

	public int getId_Despesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId_despesa(String String){
		
		}
	
}
