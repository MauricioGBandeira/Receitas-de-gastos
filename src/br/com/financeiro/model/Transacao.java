package br.com.financeiro.model;

import java.util.Date;

public abstract class Transacao  {
	private Date data;
	private double valor;
	private String descricao;

	
	public Transacao() {
		super();
	}

	public Transacao(Date data, double valor, String descricao) {
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getVl_transacao() {
		// TODO Auto-generated method stub
		return 0;
	}



}
