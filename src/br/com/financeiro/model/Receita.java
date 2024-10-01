package br.com.financeiro.model;

import java.util.Date;

public class Receita extends Transacao {
    private Conta contaDestino;
    private String origem;
	public Object setDate;

    public Receita() {
        super();
    }

    public Receita(Date data, double valor, String descricao, Conta contaDestino, String origem) {
        super(data, valor, descricao);
        this.contaDestino = contaDestino;
        this.origem = origem;
    }

    public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public void somarSaldo(double valor, Conta contaDestino) {
        double saldoCalculado = contaDestino.getSaldo()+valor;
        contaDestino.setSaldo(saldoCalculado);
        System.out.println("Saldo atual: "+contaDestino.getSaldo());
    }

    public void incluirEntrada(Date data, double valor, String descricao, Conta contaDestino, String origem) {
        Receita entrada  = new Receita(data, valor, descricao, contaDestino, origem);
        System.out.println("\nIncluir Entradas: ");
        System.out.println("Receita Registrada na conta: "+ contaDestino.getNumeroConta());
        System.out.println("Receita Registrada em nome: "+contaDestino.getProprietario().getNome());
        System.out.println("Receita Registrada valor: "+entrada.getValor());
        System.out.println("Receita Registrada data: "+entrada.getData());
        System.out.println("Saldo anterior: "+contaDestino.getSaldo());
        somarSaldo(valor, contaDestino);
    }

	public double getVl_Receita() {
		// TODO Auto-generated method stub
		return 0;
	}

	public java.sql.Date getDt_recebimento() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId_usuario() {
		// TODO Auto-generated method stub
		return 0;
	}
}
