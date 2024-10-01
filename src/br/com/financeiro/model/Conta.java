package br.com.financeiro.model;

import java.sql.Date;

public class Conta {
	private int numeroConta;
	private double saldo;
	private Usuario proprietario;
	private Date dataAbertura;
	private String tipoConta;


	
	public Conta() {

	}
	public Conta( int numeroConta, double saldo, Date dataAbertura, String tipoConta, Usuario usuario) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.proprietario = usuario;
		this.dataAbertura = dataAbertura;
		this.tipoConta = tipoConta;
	}
	

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Usuario proprietario) {
		this.proprietario = proprietario;
	}

	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public void registrarConta( int numeroConta, double saldoAtual, Usuario usuario) {
		System.out.println("\nRegistrar conta: ");
		System.out.println("Conta Registrada: "+numeroConta);
		System.out.println("Proprietário da conta: "+usuario.getNome());
		System.out.println("Saldo atual da conta: "+saldoAtual);
	}
	
	

}
