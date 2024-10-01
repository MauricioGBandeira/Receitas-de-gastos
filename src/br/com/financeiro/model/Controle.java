package br.com.financeiro.model;

public class Controle {
	private String categoria;
	private double rendimentoMensal;
	private double limiteDespesa;
	private double saldoTotal;
	private Usuario usuario;
	

	public Controle() {
		super();
	}

	public Controle(String categoria, double valorTotal, double limiteDepesa, double saldoTotal, Usuario usuario) {
		super();
		this.categoria = categoria;
		this.rendimentoMensal = valorTotal;
		this.limiteDespesa = limiteDepesa;
		this.saldoTotal = saldoTotal;
		this.usuario = usuario;
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getRendimentoTotal() {
		return rendimentoMensal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoMensal = rendimentoTotal;
	}

	public double getLimiteDespesa() {
		return limiteDespesa;
	}

	public void setLimiteDespesa(double limiteDespesa) {
		this.limiteDespesa = limiteDespesa;
	}

	public void incluirControle(String categoria, double redimentoTotal, double limiteDepesa) {
		this.setCategoria(categoria);
		this.setRendimentoTotal(redimentoTotal);
		this.setLimiteDespesa(limiteDepesa);
	}
}
